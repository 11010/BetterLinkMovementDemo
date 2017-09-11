package bodor.com.betterlinkmovementdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;
import android.widget.Toast;

import me.saket.bettermovementmethod.BetterLinkMovementMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.demo);
        BetterLinkMovementMethod.linkify(Linkify.ALL,textView);
//                .setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() {
//                    @Override
//                    public boolean onClick(TextView textView, String url) {
//                        if (url.contains("tel")){
//                            Toast.makeText(getApplicationContext(),"Phone number:"+url.replace("tel",""),Toast.LENGTH_SHORT).show();
//                        }else if (url.contains("email")){
//                            Toast.makeText(getApplicationContext(),"Email:"+url.replace("email",""),Toast.LENGTH_SHORT).show();
//                        }else if (url.contains("http")){
//                            Toast.makeText(getApplicationContext(),"Website:"+url.replace("email",""),Toast.LENGTH_SHORT).show();
//                        }
//                        return false;
//                    }
//                });

    }
}
