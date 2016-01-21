package pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isen on 21/01/2016.
 */
public class User {

    @SerializedName("screen_name")
    public String screenName;

    @SerializedName("name")
    public String name;

    @SerializedName("age")
    public Integer age;

    @SerializedName("mail_profil")
    public String mailProfil;

    @SerializedName("profile_image_url")
    public String profileImageUrl;


}
