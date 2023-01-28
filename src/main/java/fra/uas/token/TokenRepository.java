package fra.uas.token;

import fra.uas.user.model.Role;
import fra.uas.user.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TokenRepository {


    public ArrayList<Token> tokenList = new ArrayList<>();

    //Admin creation
    @PostConstruct
    public void init() {



    }

}
