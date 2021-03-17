package com.wahid.sir.stamasofttechnologyallproject.Class;

public class Config {
    public static final String FILTER_PRICE_PRODUCTS = "http://192.168.1.5/android/StamaSoft_Technology/filterSearch/getPriceName.php";
    public static final String FILTER_COUNTRY_PRODUCTS = "http://192.168.1.5/android/StamaSoft_Technology/filterSearch/getCountryName.php";
    public static final String FILTER_PHONE_URL = "http://192.168.1.5/android/StamaSoft_Technology/filterSearch/getPhoneName.php";
    public static final String LOAD_MORE_DATA_URL = "https://jsonplaceholder.typicode.com/posts";
    public static final String MORE_DATABASE_URL = "http://192.168.1.5/android/StamaSoft_Technology/filterSearch/getPriceName.php";
//    public static final String MAIL_SENT_URL = "http://192.168.1.5/android/StamaSoft_Technology/filterSearch/mailsent_php.php";
    public static final String MAIL_SENT_URL = "https://snakes123.000webhostapp.com/mailsent_php.php";
    public static final String INSERT_URL = "https://snakes123.000webhostapp.com/insertSignIn.php";



    //URLs to register.php and confirm.php file
    public static final String REGISTER_URL = "http://192.168.1.6/android/StamaSoft_Technology/sms_gateway/register.php";
    public static final String CONFIRM_URL = "http://192.168.1.6/android/StamaSoft_Technology/sms_gateway/confirm.php";

    //Keys to send username, password, phone and otp
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_OTP = "otp";

    //JSON Tag from response from server
    public static final String TAG_RESPONSE= "ErrorMessage";
}
