package ir.maktab.busticket.features.share.enumeration;

public enum  ExceptionMessage {

    ID_NOT_EXIST(1,"This id not exist !!!"),
    FIRST_NAME_LARGER(2,"First name input value is larger than allowed !!!"),
    LAST_NAME_LARGER(3,"Last name input value is larger than allowed !!!"),
    EMAIL_LARGER(4,"Email input value is larger than allowed !!!"),
    USERNAME_LARGER(5,"Username input value is larger than allowed !!!"),
    UNIQUE_USERNAME(6,"This username is owned by someone else !!!"),
    FIRST_NAME_REQUIRED(7,"First name required. Please insert the First name !!!"),
    LAST_NAME_REQUIRED(8,"Last name required. Please insert the Last name !!!"),
    EMAIL_REQUIRED(9,"Email name required. Please insert the Email !!!"),
    USERNAME_REQUIRED(10,"Username required. Please insert the Username !!!"),
    PASSWORD_REQUIRED(11,"Password required. Please insert the Password !!!"),
    USERNAME_OR_PASSWORD_INCORRECT(12,"Username or Password is incorrect !!!"),
    USERNAME_NOT_FOUND(13,"This Username not found !!!"),
    CAPTION_REQUIRED(14,"Caption required. Please insert the Caption !!!"),
    CONTENT_REQUIRED(15,"Content required. Please insert the Content !!!"),
    CAPTION_LARGER(16,"Caption input value is larger than allowed !!!"),
    ACCOUNT_HAVE_NOT_ANY_POSTS(17,"This account does not have any posts !!!")
    ;

    private final Integer code;
    private final String message;

    ExceptionMessage(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ExceptionMessage{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
