package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        String tweetmessage = getIntent().getExtras().getString("aString");
        String Adate = getIntent().getExtras().getString("aDate");

        TextView date = (TextView) findViewById(R.id.aDate);
        TextView message = (TextView)findViewById(R.id.aString);
        message.setText(tweetmessage);
        date.setText(Adate);
    }
}
