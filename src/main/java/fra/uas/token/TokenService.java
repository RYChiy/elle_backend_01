package fra.uas.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenService implements  ITokenService{
    @Autowired
    TokenRepository tokenRepository = new TokenRepository();


    public Token getUserID(UUID usertoken){
        for (Token token: tokenRepository.tokenList
        ) {
            if (token.getToken().equals(usertoken)){
                return token;
            }

        }
        return null;
    }

    @Override
    public Token createToken(int userID) {
        for (Token token: tokenRepository.tokenList
        ) {
            if (token.getUserID()==userID){
                return token;
            }

        }
        Token token = new Token(userID);
        System.out.println(token.getDateTime());
        tokenRepository.tokenList.add(token);
        System.out.println(token);
        return token;
    }

    @Override
    public void deleteToken(UUID userT) {

        for (Token token: tokenRepository.tokenList
             ) {
            if (token.getToken()==userT){
                tokenRepository.tokenList.remove(token);
            }

        }
    }

    @Override
    public Boolean checkIfTokenExistsAndIsValid(UUID userToken) {

        System.out.println(userToken);
        for (Token token: tokenRepository.tokenList
        ) {
            System.out.println(token.getToken());
            System.out.println(userToken);
            if (token.getToken().equals(userToken)){

                if (token.getDateTime().isBefore(token.getDateTime().plusMinutes(60))){
                    return true;
                }
            }

        }
        return false;


    }
}
