package pojo;

import android.widget.ImageView;

import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Created by isen on 21/01/2016.
 */
public class Film {

    @SerializedName("created_at")
    public String dateCreated;

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String text;

    @SerializedName("synopsis")
    public String synopsis;

    @SerializedName("jacket_film_url")
    public String jacketFilmUrl;

    @Override
    public String toString() {
        return text;
    }

    public long getDateCreatedTimestamp(){
        final SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZZZ yyyy", Locale.ENGLISH);
        dateFormat.setLenient(false);
        try {
            final Date created = dateFormat.parse(dateCreated);
            return created.getTime();
        } catch (Exception e) {
            return 0;
        }
    }
}
