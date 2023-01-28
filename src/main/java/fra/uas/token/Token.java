package fra.uas.token;

import java.time.LocalDateTime;
import java.util.UUID;

public class Token {
    private int userID;

    private UUID token;

    private LocalDateTime dateTime;

    public Token(int userID){
        this.userID= userID;
        this.token = UUID.randomUUID();
        this.dateTime = LocalDateTime.now();
    }

    public UUID getToken(){
        return this.token;
    }

    public int getUserID() {
        return userID;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }


}
