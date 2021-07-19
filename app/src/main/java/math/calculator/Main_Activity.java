package math.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        final EditText nickname= findViewById(R.id.nickname);
        Button accesbutton= findViewById(R.id.Access);



        accesbutton.setOnClickListener(new View.OnClickListener() { //utilizzo bottone
            @Override
            public void onClick(View v) {
                if(nickname.getText().toString().length()>5){
                    Intent apricalc= new Intent(Main_Activity.this,Activity_calc.class);
                    startActivity(apricalc);
                }
                else{ //to do pop up per avvisare lútente che la lunghezza minima e 5

                }
            }
        });
    }
}
