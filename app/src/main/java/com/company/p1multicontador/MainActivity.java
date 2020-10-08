package com.company.p1multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.company.p1multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

Button sumar1;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int c4 = 0;
    int global = c1+c2+c3+c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());binding.aumentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1++;
                global++;
                binding.contador1.setText(String.valueOf(c1));
                binding.contador0.setText(String.valueOf(global));
            }
        });

        binding.aumentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2++;
                global++;
                binding.contador2.setText(String.valueOf(c2));
                binding.contador0.setText(String.valueOf(global));
            }
        });

        binding.aumentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c3++;
                global++;
                binding.contador3.setText(String.valueOf(c3));
                binding.contador0.setText(String.valueOf(global));
            }
        });

        binding.aumentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c4++;
                global++;
                binding.contador4.setText(String.valueOf(c4));
                binding.contador0.setText(String.valueOf(global));
            }
        });

        //reset

        binding.reset0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                global = 0;
                binding.contador0.setText(String.valueOf(global));
                binding.contador1.setText(String.valueOf(c1));
                binding.contador2.setText(String.valueOf(c2));
                binding.contador3.setText(String.valueOf(c3));
                binding.contador4.setText(String.valueOf(c4));

            }
        });

        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global = global - c1;
                c1 = 0;
                binding.contador0.setText(String.valueOf(global));
                binding.contador1.setText(String.valueOf(c1));

            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global = global - c2;
                c2 = 0;
                binding.contador0.setText(String.valueOf(global));
                binding.contador2.setText(String.valueOf(c2));

            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global = global - c3;
                c3 = 0;
                binding.contador0.setText(String.valueOf(global));
                binding.contador3.setText(String.valueOf(c3));
            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                global = global - c4;
                c4 = 0;
                binding.contador0.setText(String.valueOf(global));
                binding.contador4.setText(String.valueOf(c4));

            }
        });
    }
}