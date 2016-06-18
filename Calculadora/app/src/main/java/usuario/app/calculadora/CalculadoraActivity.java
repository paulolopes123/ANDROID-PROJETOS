package usuario.app.calculadora;

import android.app.AlertDialog;
import android.support.v7.app.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;

public class CalculadoraActivity extends Activity {
    EditText ednumero1,ednumero2;
    Button btsomar,btsubtrair,btmultiplicar,btdividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());
                double soma = num1 + num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Da Soma");
                dialogo.setMessage("A Soma É " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });


        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());
                double subtrair = num1 - num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Da Subtração");
                dialogo.setMessage("A Subtração É " + subtrair);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());
                double multiplicar = num1 * num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Da Multiplicação");
                dialogo.setMessage("A Multiplicação É " + multiplicar);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });



        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(
                        ednumero1.getText().toString());
                double num2 = Double.parseDouble(
                        ednumero2.getText().toString());
                double dividir = num1 / num2;

                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CalculadoraActivity.this);
                dialogo.setTitle("Resultado Da Divisão");
                dialogo.setMessage("A Divisão É " + dividir);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });







    }



            }




