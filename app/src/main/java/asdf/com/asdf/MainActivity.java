package asdf.com.asdf;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {
    int z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if(String.valueOf(event.getKeyCode()).equals(String.valueOf(126))){


                if(z<1) {
                    z++;
                    Log.i("Operator", "Yes? (with alacrity)");
                }
                else
                {
                    z = 0;
                }


        }


        return super.dispatchKeyEvent(event);
    }
}
