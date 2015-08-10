package com.micalculadora.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho
            , btnNueve, btnSuma, btnResta, btnMulti, btnDiv, btnIgual, btnAC, btnCE;

    boolean suma = false;
    boolean resta =false;
    boolean multiplicacion = false;
    boolean division = false;
    Double[] numero = new Double[20];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Botton cero
        btnCero = (Button)findViewById(R.id.cero);
        btnCero.setOnClickListener(this);
        //Botton uno
        btnUno = (Button)findViewById(R.id.uno);
        btnUno.setOnClickListener(this);
        //Botton dos
        btnDos = (Button)findViewById(R.id.dos);
        btnDos.setOnClickListener(this);
        //Botton tres
        btnTres = (Button)findViewById(R.id.tres);
        btnTres.setOnClickListener(this);
        //Botton cuatro
        btnCuatro = (Button)findViewById(R.id.cuatro);
        btnCuatro.setOnClickListener(this);
        //Botton cinco
        btnCinco = (Button)findViewById(R.id.cinco);
        btnCinco.setOnClickListener(this);
        //Botton seis
        btnSeis = (Button)findViewById(R.id.seis);
        btnSeis.setOnClickListener(this);
        //Botton siete
        btnSiete = (Button)findViewById(R.id.siete);
        btnSiete.setOnClickListener(this);
        //Botton ocho
        btnOcho = (Button)findViewById(R.id.ocho);
        btnOcho.setOnClickListener(this);
        //Botton nueve
        btnNueve = (Button)findViewById(R.id.nueve);
        btnNueve.setOnClickListener(this);
        //Botton suma
        btnSuma = (Button)findViewById(R.id.suma);
        btnSuma.setOnClickListener(this);
        //Botton resta
        btnResta = (Button)findViewById(R.id.resta);
        btnResta.setOnClickListener(this);
        //Botton muliplicacion
        btnMulti = (Button)findViewById(R.id.multiplicacion);
        btnMulti.setOnClickListener(this);
        //Botton division
        btnDiv = (Button)findViewById(R.id.division);
        btnDiv.setOnClickListener(this);
        //Botton igual
        btnIgual = (Button)findViewById(R.id.igual);
        btnIgual.setOnClickListener(this);
        //Botton de borrar
        btnAC = (Button)findViewById(R.id.ac);
        btnAC.setOnClickListener(this);
        //Botton borrar digito anterior
        btnCE = (Button)findViewById(R.id.ce);
        btnCE.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        TextView result = (TextView)findViewById(R.id.resultado);
        TextView procedimiento = (TextView)findViewById(R.id.proceso);
        int seleccion = v.getId();
        String guardado = result.getText().toString();
        String nuevo = result.getText().toString();

        try {
            switch (seleccion) {
                case R.id.cero:
                    procedimiento.setText(nuevo+ btnCero.getText().toString());
                    result.setText(btnCero.getText().toString());
                    break;
                case R.id.uno:
                    procedimiento.setText(nuevo+ btnUno.getText().toString());
                    result.setText(btnUno.getText().toString());
                    break;
                case R.id.dos:
                    procedimiento.setText(nuevo+ btnDos.getText().toString());
                    result.setText(btnDos.getText().toString());
                    break;
                case R.id.tres:
                    procedimiento.setText(nuevo+ btnTres.getText().toString());
                    result.setText(btnTres.getText().toString());
                    break;
                case R.id.cuatro:
                    procedimiento.setText(nuevo+ btnCuatro.getText().toString());
                    result.setText(btnCuatro.getText().toString());
                    break;
                case R.id.cinco:
                    procedimiento.setText(nuevo+ btnCinco.getText().toString());
                    result.setText(btnCinco.getText().toString());
                    break;
                case R.id.seis:
                    procedimiento.setText(nuevo+ btnSeis.getText().toString());
                    result.setText(btnSeis.getText().toString());
                    break;
                case R.id.siete:
                    procedimiento.setText(nuevo+ btnSiete.getText().toString());
                    result.setText(btnSiete.getText().toString());
                    break;
                case R.id.ocho:
                    procedimiento.setText(nuevo+ btnOcho.getText().toString());
                    result.setText(btnOcho.getText().toString());
                    break;
                case R.id.nueve:
                    procedimiento.setText(nuevo+ btnNueve.getText().toString());
                    result.setText(btnNueve.getText().toString());
                    break;
                case R.id.suma:
                    suma = true;
                    numero[0] = Double.parseDouble(guardado);
                    result.setText("");
                    procedimiento.setText(nuevo+btnSuma.getText().toString());
                    break;
                case R.id.resta:
                    resta = true;
                    numero[0] = Double.parseDouble(guardado);
                    result.setText("");
                    procedimiento.setText(nuevo+btnResta.getText().toString());
                    break;
                case R.id.multiplicacion:
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(guardado);
                    result.setText("");
                    procedimiento.setText(nuevo+btnMulti.getText().toString());
                    break;
                case R.id.division:
                    division = true;
                    numero[0] = Double.parseDouble(guardado);
                    result.setText("");
                    procedimiento.setText(nuevo+btnDiv.getText().toString());
                    break;

                case R.id.igual:
                    numero[1] = Double.parseDouble(guardado);

                    if(suma){
                    resultado = numero[0]+numero[1];
                        result.setText(String.valueOf(resultado));
                    }else if(resta){
                        resultado = numero[0]-numero[1];
                        result.setText(String.valueOf(resultado));
                    }else if(multiplicacion){
                        resultado = numero[0]*numero[1];
                        result.setText(String.valueOf(resultado));
                    }else if(division){
                        resultado = numero[0]/numero[1];
                        result.setText(String.valueOf(resultado));
                    }

                    suma = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    break;
                case R.id.ac:
                    result.setText("");

                    break;
                case R.id.ce:

                    break;

            }
        }catch (Exception e){
            result.setText("Se ha producido un error!");
        }
    }
}
