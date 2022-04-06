package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.TextView;

import java.io.PrintWriter;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.*;
import java.net.*;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 class TCPClient extends AsyncTask {

                     Socket s;
                     DataInputStream din;
                     DataOutputStream dout;
                     BufferedReader br;
                     String str = "";
                     String str2 = "";
                     PrintWriter pw;
                     InputStreamReader isr;
                     BufferedReader in;


                     @Override
                     protected Object doInBackground(Object[] objects) {

                         try {
                             s = new Socket("localhost", 2011);
                             isr = new InputStreamReader(s.getInputStream());
                             in = new BufferedReader(isr);
                             PrintWriter out = new PrintWriter(s.getOutputStream(), true);


                         } catch (IOException e) {
                             e.printStackTrace();
                         }
                         return null;


                     }
                 }
                 TCPClient cl= new TCPClient();
                 cl.execute();





            }
        });

    }
}
