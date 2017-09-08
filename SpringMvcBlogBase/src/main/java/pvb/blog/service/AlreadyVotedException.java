package pvb.blog.service;

public class AlreadyVotedException extends Exception {

    public AlreadyVotedException(String message) {
        super(message);
    }
}
