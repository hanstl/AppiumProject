package org.example;

public class Perintah {
    public void delay(int detik){
        try{
            Thread.sleep(detik*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
