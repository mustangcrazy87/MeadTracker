package priest1.joseph.project0715;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonbrew = (Button) findViewById(R.id.button_new);
        buttonbrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBrew();
            }
        });
    }

    public void openActivityBrew() {
        Intent intent_brew = new Intent(this, brew.class);
        startActivity(intent_brew);
    }
}