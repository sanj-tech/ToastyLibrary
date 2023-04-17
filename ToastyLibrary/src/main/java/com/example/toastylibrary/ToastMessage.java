package com.example.toastylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void sp(Context context, String message){

        Toast.makeText(context,message,Toast.LENGTH_LONG).show();

    }
}
