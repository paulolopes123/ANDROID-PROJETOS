package usuario.app.androidimc;

import android.app.AlertDialog;
import android.support.v7.app.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;




public class IMCActivity extends AppCompatActivity {

    EditText  idquilo,idalt;
    Button btcalc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        idquilo = (EditText) findViewById(R.id.idquilo);
        idalt = (EditText) findViewById(R.id.idalt);
        btcalc = (Button) findViewById(R.id.btcalc);


        btcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso = Double.parseDouble(
                        idquilo.getText().toString());
                double altura = Double.parseDouble(
                        idalt.getText().toString());
                double resultado = peso / (altura*altura);
                int i = (int) resultado;
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(IMCActivity.this);
                dialogo.setTitle("Resultado Do IMC");
                if(resultado <= 18.5){
                    dialogo.setMessage("A Seu IMC É " + i + "\n Você Está Abaixo Do Peso Normal");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }

                if(resultado > 18.5 && resultado <= 25){
                    dialogo.setMessage("A Seu IMC É " + i + "\n Você Está Com O Peso Normal");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }

                if(resultado > 25 && resultado <= 30){
                    dialogo.setMessage("A Seu IMC É " + i + "\n Você Está Acima Do Peso Normal");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }


                if(resultado > 30){
                    dialogo.setMessage("A Seu IMC É " + i + "\n Você Com Obesidade Morbida");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }



            }
        });











    }
}
