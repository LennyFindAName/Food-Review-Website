/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package consts;

/**
 *
 * @author legion
 */
public interface IConstants {

    public static int COOKIE_MAX_AGE = 3600 * 24 * 30;

    String IMAGE_USER_FOLDER_NAME = "images-user";
    String IMAGE_BLOG_FOLDER_NAME = "images-blog";

    //Default image for new user
    String IMAGE_USER_DEFAULT_PATH = "img/user-profile-default-image.png";
    //Default image for new eatery
    String IMAGE_EATERY_DEFAULT_PATH = "img/location-default-image.jpeg";

    //Contact Email\
    public static String CONTACT_EMAIL = "holaeateryreview@gmail.com";
    public static String CONTACT_EMAIL_PASS = "qjsszcmxayrcwfid";

    //^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$
    String PASSWORD_REGEX = ".*?";

    public static String GOOGLE_CLIENT_ID = "853715157535-fll6mp695fqc3kbrevrua609r1gu8naj.apps.googleusercontent.com";

    public static String GOOGLE_CLIENT_SECRET = "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";

    public static String GOOGLE_REDIRECT_URI = "http://localhost:8080/FoodEateryReview/login";

    public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";

    public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";

    public static String GOOGLE_GRANT_TYPE = "authorization_code";

    public static String GOOGLE_LOGIN_HREF = "https://accounts.google.com/o/oauth2/auth?scope=email profile&redirect_uri=http://localhost:8080/FoodEateryReview/login&response_type=code&client_id=853715157535-fll6mp695fqc3kbrevrua609r1gu8naj.apps.googleusercontent.com&approval_prompt=force";

    public static String APPROVED_TITLE_NOTIFICATION = "Bài Viết Của Bạn Đã Được Duyệt!";

    public static String REJECTED_TITLE_NOTIFICATION = "Bài Viết Của Bạn Đã Bị Từ Chối!";

    public static String APPROVED_MESSAGE_NOTIFICATION = "Cảm ơn bạn vì những đóng góp có ích và công tâm tới cộng đồng";
    
    public static String TO_REPORTER_APPROVE_TITLE = "Báo cáo của bạn đã được xử lí!";
    
    public static String TO_REPORTED_REPORT_TITLE = "Bài viết của của bạn đã bị báo cáo!";
    
    public static String TO_REPORTED_HIDDEN_TITLE = "Bài viết của bạn đã bị ẩn! ";
    
    public static String TO_REPORTER_APPROVE_MESSAGE = "Báo cáo của bạn đã được được tiếp nhận và xử lí, bài viết bạn báo cáo đã bị ẩn!";
    
    public static String TO_REPORTED_REPORT_MESSAGE = "Đã có ai đó báo cáo bài viết có tựa đề: ";
    
    public static String TO_REPORTED_HIDDEN_MESSAGE = "Bài viết của bạn đã bị ẩn vì: ";
    
}
