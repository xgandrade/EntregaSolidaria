package com.example.entregasolidaria.Utils;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HttpService extends AsyncTask<Void, Void, StringBuilder> {
    StringBuilder resposta = new StringBuilder();

    private String idCarro;

    public HttpService(String idCarro) {
        this.idCarro = idCarro;
    }

    @Override
    protected StringBuilder doInBackground(Void... voids) {
        try{
            URL url;
            if(idCarro.equals("-1"))
                url = new URL("http://api.traue.com.br/carros/");
            else
                url = new URL("http://api.traue.com.br/carros/?idCarro=" + idCarro);

            HttpURLConnection conexao = (HttpURLConnection)url.openConnection();
            conexao.setRequestMethod("GET");
            conexao.setRequestProperty("Content-type", "application/json");
            conexao.setRequestProperty("Accept", "application/json");
            conexao.setDoOutput(true);
            conexao.setConnectTimeout(5000);
            conexao.connect();

            Scanner scanner = new Scanner(url.openStream());
            while(scanner.hasNext()){
                resposta.append(scanner.nextLine());
            }

        }catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

        return resposta;
    }
}