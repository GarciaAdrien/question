package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author djer1
 *
 */
@Entity
public class User {
    /**
     * User id.
     */
    @GeneratedValue
    @Id
    private long id;
    /**
     * User login.
     */
    private String login;
    /**
     * User lastName.
     */
    private String lastName;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param newId the id to set
     */
    public void setId(final long newId) {
        this.id = newId;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param newLogin the login to set
     */
    public void setLogin(final String newLogin) {
        this.login = newLogin;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param newLastName the lastName to set
     */
    public void setLastName(final String newLastName) {
        this.lastName = newLastName;
    }

}
