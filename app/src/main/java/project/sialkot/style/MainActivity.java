package project.sialkot.style;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
         Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
              btn1=(Button)findViewById(R.id.btn1);
              btn2=(Button)findViewById(R.id.btn2);
              btn3=(Button)findViewById(R.id.angry_btn);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
    btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });
    }
}
