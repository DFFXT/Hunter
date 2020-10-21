package com.quinn.hunter.debug;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

import com.hunter.library.debug.HunterDebug;
import com.hunter.library.debug.HunterDebugImpl;
import com.hunter.library.debug.HunterLoggerHandler;
import com.quinn.hunter.debug.test.ClassTest;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";

    @Override
    @HunterDebug
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HunterLoggerHandler.installLogImpl(new HunterLoggerHandler(){
            @Override
            protected void log(String tag, String msg) {
                //you can use your custom logger here "
                Log.i(tag, "[you can use your custom logger here \"]" + msg);
            }
        });
        setContentView(R.layout.activity_main);
        MainPresenter mainPresenter = new MainPresenter();
        mainPresenter.load("1212");
        mainPresenter.loadMore("12123232");
        boolean bool = true;
        byte byte_v = 1;
        char char_v = 2;
        short short_v = 3;
        int int_v = 4;
        long long_v = 5;
        float float_v = 6;
        double double_v = 7;
        String string_v = "string";
        int[] int_arr = new int[]{1,2,3};
        method_test_parameter(bool, byte_v, char_v, short_v, int_v, long_v, float_v, double_v, string_v, int_arr, savedInstanceState);
        method_empty_parameter_empty_return();
        method_return_array();
        method_return_boolean();
        method_return_byte();
        method_return_char();
        method_return_double();
        method_return_float();
        method_return_int();
        method_return_long();
        method_return_object();
        method_return_object_array();
        method_return_short();
        method_static("parameter value");
        appendIntAndString(5, "billions");
        try {
            method_throw_exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            testVoidMethodWithException();
        } catch (Exception ignored) {
        }
        ClassTest classTest = new ClassTest();
        classTest.test1(1);
        ClassTest.test4(this);
    };

    @HunterDebugImpl
    private void appendIntAndString(int a, String b) {
        SystemClock.sleep(100);
    }

    private List<String> paramNames = new ArrayList<>();

    @HunterDebug
    private void method_test_parameter(boolean bool_v, byte byte_v, char char_v, short short_v, int int_v, long long_v, float float_v, double double_v, String string_v, int[] arr, Bundle savedInstanceState){
        int insideLocal = 5;
        int insideLocal2 = 6;
        Log.i(TAG, "insideLocal " + insideLocal);
    }

    @HunterDebug
    private void method_empty_parameter_empty_return(){

    }

    @HunterDebug
    private void method_return_boolean() {
    }

    @HunterDebug
    private void method_return_char(){
    }
    @HunterDebug
    private void method_return_byte(){
    }
    @HunterDebug
    private void method_return_short(){
    }
    @HunterDebug
    private void method_return_int(){
    }
    @HunterDebug
    private void method_return_long(){
    }
    @HunterDebug
    private void method_return_double(){
    }
    @HunterDebug
    private void method_return_float(){
    }

    @HunterDebug
    private void method_return_object(){
        new MainPresenter();
    }

    @HunterDebug
    private void method_return_object_array(){
        new MainPresenter();
        new MainPresenter();
        new MainPresenter();
    }
    @HunterDebug
    private void method_return_array(){
    }

    @HunterDebug
    private static void method_static(String str){
    }

    @HunterDebug
    private void method_throw_exception() throws Exception{
        throw new IllegalArgumentException("illegal argu");
    }

    @HunterDebug
    private void testVoidMethodWithException(){
        throw new RuntimeException("not impl");
    }

}
