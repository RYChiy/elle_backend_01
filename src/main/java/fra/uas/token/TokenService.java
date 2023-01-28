package fra.uas.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenService implements  ITokenService{
    @Autowired
    TokenRepository tokenRepository = new TokenRepository();


    @Override
    public Token createToken(int userID) {
        for (Token token: tokenRepository.tokenList
        ) {
            if (token.getUserID()==userID){
                return token;
            }

        }
        Token token = new Token(userID);
        tokenRepository.tokenList.add(token);
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
        for (Token token: tokenRepository.tokenList
        ) {
            if (token.getToken()==userToken){
                if (token.getDateTime().isBefore(token.getDateTime().plusMinutes(60))){
                    return true;
                }
            }

        }
        return false;


    }
}
