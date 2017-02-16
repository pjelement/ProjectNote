package minvu.uw.tacoma.edu.mockup.Utils;

/**
 * Created by minhvu on 2/15/17.
 * This class using Singleton design pattern to get the global variable
 */

public class URLLink {

    public String signInURL = "" +
            "http://cssgate.insttech.washington.edu/~_450bteam13/Android/projectNote/login.php?";
    public String signUpURL = "" +
            "http://cssgate.insttech.washington.edu/~_450bteam13/Android/projectNote/signup.php?";

    private static URLLink mInstance = null;
    private URLLink() {}

    public static URLLink getMinstance() {

        if (mInstance == null) {
            mInstance = new URLLink();
        }
        return mInstance;
    }
}
