package org.example.kolos2022;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private Label wordCountLabel;
    @FXML
    private TextField filterField;
    @FXML
    private ListView<String> wordList;

    private List<WordEntry> listWord = new ArrayList<>();

    public void initialize(){
        connectToServer();
    }

    private void connectToServer(){
        new Thread(()->{
            try(
                    Socket socket = new Socket("localhost",5000);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    ){

            }
            catch(Exception e){

            }
        }).start();
    }

    public static class WordEntry{
        String word, time;

        WordEntry(String word, String time) {
            this.word = word;
            this.time = time;
        }


    }
}