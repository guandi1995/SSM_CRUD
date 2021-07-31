package transaction.message;

import lombok.Data;

/**
 * @author Di Guan on 7/31/2021 4:17 PM
 */
@Data
public class Message {
    private boolean status;
    private String message;

    public Message(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
