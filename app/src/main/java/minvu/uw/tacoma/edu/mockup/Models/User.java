package minvu.uw.tacoma.edu.mockup.Models;

/**
 * Created by minhvu on 2/2/17.
 */

public class User  {
    private String email = "";
    private String facebookID = "";

    public String GetEmail() {return email;}
    public String GetFacebookID() {return facebookID;}

    public void SetEmail(String email) {
        this.email = email;
    }

    public void SetFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }


}
