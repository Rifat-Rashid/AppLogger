package com.rashid.sohaib.applogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    public static boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isRunning = true;
        createBackgroundThread();
    }

    /**
     * Creates a new thread for background app operations
     *
     * @return null
     * @define later
     */
    private void createBackgroundThread() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (isRunning) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(r).start();
    }

    @Override
    public String toString(){
        return null;
    }

}
