package br.senai.sc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String primeironumero = "";
    private String segundonumero = "";
    private String operacao = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tv_display);
    }

    public void onClickBotao1(View v){
        atualizarDisplay("1");
        atualizarNumeroDigitado("1");
    }



    public void onClickBotao2(View v){
        atualizarDisplay("2");
        atualizarNumeroDigitado("2");
    }


    public void onClickBotao3(View v){
       atualizarDisplay("3");
       atualizarNumeroDigitado("3");
    }


    public void onClickBotao4(View v){
        atualizarDisplay("4");
        atualizarNumeroDigitado("4");
    }


    public void onClickBotao5(View v){
        atualizarDisplay("5");
        atualizarNumeroDigitado("5");
    }


    public void onClickBotao6(View v){
        atualizarDisplay("6");
        atualizarNumeroDigitado("6");
    }


    public void onClickBotao7(View v){
       atualizarDisplay("7");
       atualizarNumeroDigitado("7");
    }


    public void onClickBotao8(View v){
       atualizarDisplay("8");
       atualizarNumeroDigitado("8");
    }


    public void onClickBotao9(View v){
        atualizarDisplay("9");
        atualizarNumeroDigitado("9");
    }


    public void onClickBotao0(View v){
        atualizarDisplay("0");
        atualizarNumeroDigitado("0");
    }


    public void onClickAdicao(View v){
        if (!primeironumero.isEmpty()) {
            operacao = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um numero antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickSubtracao(View v) {
        if (!primeironumero.isEmpty()) {
            operacao = "-";
            atualizarDisplay("-");
        } else {
            Toast.makeText(MainActivity.this, "É preciso informar um numero antes", Toast.LENGTH_LONG).show();
        }

    }

    public void onClickMultiplicacao(View v) {
        if (!primeironumero.isEmpty()) {
            operacao = "*";
            atualizarDisplay("x");
        } else{
            Toast.makeText(MainActivity.this, "É preciso informar um numero antes", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickDivisao(View v){
        if (!primeironumero.isEmpty()) {
            operacao = "/";
            atualizarDisplay("÷");
        } else{
            Toast.makeText(MainActivity.this, "Operação Indisponivel", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickIgual(View v){
        if (!primeironumero.isEmpty() && !segundonumero.isEmpty()){
            atualizarDisplay("=");
            int numero1 = Integer.parseInt(primeironumero);
            int numero2 = Integer.parseInt(segundonumero);
            if(operacao.equals("+")) {
                int resultado = numero1 + numero2;
                display.setText(String.valueOf(resultado));
            }
            if(operacao.equals("-")) {
                int resultado = numero1 - numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("*")) {
                int resultado = numero1 * numero2;
                display.setText(String.valueOf(resultado));
            }
            if (operacao.equals("/") && numero2 != 0) {
                int resultado = numero1 / numero2;
                display.setText(String.valueOf(resultado));
            }else {
                Toast.makeText(MainActivity.this, "Impossivel divisão por 0", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(MainActivity.this, "Nenhuma operação foi solicitada", Toast.LENGTH_LONG).show();
        }

    }

    private void atualizarDisplay(String texto){
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }

    private void atualizarNumeroDigitado(String numero) {
        if (operacao.isEmpty()){
            primeironumero = primeironumero + numero;
        } else {
            segundonumero = segundonumero + numero;
        }
    }

}