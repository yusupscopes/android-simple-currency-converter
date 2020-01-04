package com.yusup.currencyconverter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("Info", "button convert pressed!");

        EditText inputValue = (EditText) findViewById(R.id.editText);

        String amountInDollarAsString = inputValue.getText().toString();

        double amountInDollar = Double.parseDouble(amountInDollarAsString);

        double amountInRupiah = amountInDollar * 14100;

        String amountInRupiahAsString = String.format("%.2f", amountInRupiah);

        Log.i("Amount in rupiah", "Rp" + amountInRupiahAsString);

        Toast.makeText(this, "$" + amountInDollarAsString + " is Rp" + amountInRupiahAsString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
