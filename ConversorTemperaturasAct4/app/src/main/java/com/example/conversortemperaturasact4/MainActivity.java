package com.example.conversortemperaturasact4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public EditText pantalla, resCentigrados, resFahrenheit, resKelvin, resRankie;
    String grados;
    double cantidad, resultado;
    CheckBox centigrados, fahrenheit, kelvin, rankie;
    RadioButton rbtnCent, rbtnFahr, rbtnKel, rbtnRan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla =(EditText)findViewById(R.id.txt_convertir);

        centigrados = (CheckBox) findViewById(R.id.chb_cen);
        fahrenheit = (CheckBox)findViewById(R.id.chb_fahr);
        kelvin = (CheckBox)findViewById(R.id.chb_kel);
        rankie = (CheckBox)findViewById(R.id.chb_ran);

        rbtnCent = (RadioButton) findViewById(R.id.rbtn_centigrados);
        rbtnFahr = (RadioButton) findViewById(R.id.rbtn_fahrenheit);
        rbtnKel = (RadioButton) findViewById(R.id.rbtn_kelvin);
        rbtnRan = (RadioButton) findViewById(R.id.rbtn_rankie);

        resCentigrados = (EditText) findViewById(R.id.txt_cent);
        resFahrenheit = (EditText)findViewById(R.id.txt_fahr);
        resKelvin = (EditText)findViewById(R.id.txt_kel);
        resRankie =(EditText) findViewById(R.id.txt_ran);
    }



    public void procesar (View v){

        String grados = pantalla.getText().toString();
        cantidad = Double.parseDouble(grados);

        if(rbtnCent.isChecked()&&centigrados.isChecked()) {
            resultado= cantidad;
            resCentigrados.setText(resultado+"");

        }else if(rbtnCent.isChecked()&& fahrenheit.isChecked()){
            resultado = (cantidad *9/5)+32;
            resFahrenheit.setText(resultado+"");
        }else if(rbtnCent.isChecked()&&kelvin.isChecked()){
            resultado = cantidad + 273.15;
            resKelvin.setText(resultado+"");
        }else if(rbtnCent.isChecked()&&rankie.isChecked()){
            resultado = cantidad * 9/5 + 491.67;
            resRankie.setText(resultado+"");
        }

        if(rbtnFahr.isChecked()&&centigrados.isChecked()){
            resultado = (cantidad * 9/5) + 32;
            resCentigrados.setText(resultado+"");

        }else if(rbtnFahr.isChecked()&&fahrenheit.isChecked()){
            resultado = cantidad;
            resFahrenheit.setText(resultado+"");
        }else if(rbtnFahr.isChecked()&&kelvin.isChecked()){
            resultado = (cantidad - 32) * (5/9) + (273.15);
            resKelvin.setText(resultado+"");
        }else if(rbtnFahr.isChecked()&&rankie.isChecked()){
            resultado = cantidad + 459.67;
            resRankie.setText(resultado+"");


        }
        if(rbtnRan.isChecked()&&centigrados.isChecked()){
            resultado = (cantidad - 491.67)*5/9;
            resCentigrados.setText(resultado+"");
        }else if(rbtnRan.isChecked()&&fahrenheit.isChecked()){
            resultado = cantidad - 459.67;
            resFahrenheit.setText(resultado+"");
        }else if(rbtnRan.isChecked()&&kelvin.isChecked()){
            resultado = cantidad * 5/9;
            resKelvin.setText(resultado+"");
        }else if(rbtnRan.isChecked()&&rankie.isChecked()){
            resultado = cantidad;
            resRankie.setText(resultado+"");


        }
        if(rbtnKel.isChecked()&&centigrados.isChecked()){
            resultado = cantidad -273.15;
            resCentigrados.setText(resultado+"");
        }else if(rbtnKel.isChecked()&&fahrenheit.isChecked()){
            resultado = (cantidad -  273.15) * 9/5 + 32;
            resFahrenheit.setText(resultado+"");
        }else if(rbtnKel.isChecked()&&kelvin.isChecked()){
            resultado = cantidad;
            resKelvin.setText(resultado+"");
        }else if(rbtnKel.isChecked()&&rankie.isChecked()){
            resultado = cantidad *1.8;
            resRankie.setText(resultado+"");
        }
    }

}

