package pojo;

/**
 * Created by koudm on 23/01/2016.
 */
public class User  {
    private long id;
    public String name;
    public String prenom;
    public String login;
    public String password;
    public String alias;
    private int age;
    public String profileImageUrl;

    public User(long id, String name, String prenom, String login, String password, String alias, int age,String profileImageUrl) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.alias = alias;
        this.setAge(age);
        this.profileImageUrl = profileImageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {

        this.alias = alias;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    // Sera utilisé par ArrayAdapter dans la ListView
    @Override
    public String toString() {
        return super.toString();
    }
}



