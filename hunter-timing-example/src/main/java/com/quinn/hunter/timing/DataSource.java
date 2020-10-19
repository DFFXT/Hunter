package com.quinn.hunter.timing;

import android.util.Log;

/**
 * Created by Quinn on 24/03/2017.
 */

public class DataSource{

    private static final String TAG = "DataSource";

    private static final DataSource instance = new DataSource();

    public static DataSource getInstance() {
        return instance;
    }

    public DataSource() {
        try {
            Log.i(TAG, "Init DataSource");
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getUserName() {
        try {
            Log.i(TAG, "Querying DataSource");
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void saveHugeFileToDisk() {
        try {
            Log.i(TAG, "Writing huge file to disk");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void readFileContent() {
        try {
            Log.i(TAG, "Writing huge file to disk");
            Thread.sleep(1400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void modifyAndMoveFile() {
        Log.i(TAG, "Modify and move file");
        readFileContent();
        saveHugeFileToDisk();
    }

}
