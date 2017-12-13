package lairg.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "States";
    Button button;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        textView  = findViewById(R.id.textView1);
        textView.setText(textView.getText().toString()+" "+getIntent().getStringExtra("key"));
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }


}
