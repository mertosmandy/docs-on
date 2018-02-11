
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seyedehshahrzad-ug
 */
public class Doctor extends Account {

    private String expertise;
    private String email;
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    public Doctor() {
        super();
        expertise = "";
        email = "";
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
