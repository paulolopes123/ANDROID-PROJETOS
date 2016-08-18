package usuario.app.sistemadecompras;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ComprasActivity extends Activity {

    CheckBox Chkleite, Chkarroz,Chkcarne,Chkfeijao;
    Button bttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);


        Chkarroz = (CheckBox) findViewById(R.id.Chkarroz);
        Chkcarne = (CheckBox) findViewById(R.id.Chkcarne);
        Chkfeijao  = (CheckBox) findViewById(R.id.Chkfeijao);
        Chkleite = (CheckBox) findViewById(R.id.Chkleite);

        Button bttotal = (Button) findViewById(R.id.bttotal);

        bttotal.setOnClickListener(new View.OnClickListener(){

public void onClick(View v){


    double total = 0;
    if(Chkleite.isChecked())
        total += 5.00;
    if(Chkfeijao.isChecked())
        total += 2.30;
    if(Chkcarne.isChecked())
        total += 9.7;
    if(Chkarroz.isChecked())
        total += 2.69;

    AlertDialog.Builder dialogo = new AlertDialog.Builder(ComprasActivity.this);

    dialogo.setTitle("Aviso");
    dialogo.setMessage("Valor Total Da Compra:" + String.valueOf(total));
    dialogo.setNeutralButton("OK",null);
    dialogo.show();


}



            });
    }
}
