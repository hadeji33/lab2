package lairg.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    final String TAG = "States";
    Button btnActTwo;
    String text;
    EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        editText = findViewById(R.id.edit);
        text = editText.getText().toString();
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("key", text);
        startActivity(intent);
    }

}
