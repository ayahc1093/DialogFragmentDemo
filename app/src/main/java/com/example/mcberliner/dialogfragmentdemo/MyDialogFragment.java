package com.example.mcberliner.dialogfragmentdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by mcberliner on 6/8/2015.
 */
public class MyDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alerDialogBuilder = new AlertDialog.Builder(getActivity()).setTitle("Confirmation").setMessage("Are you sure?").setPositiveButton("Yes", pListener)
                            .setNegativeButton("No", nListener);

        return alerDialogBuilder.create();
    }

    DialogInterface.OnClickListener pListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface arg0, int arg1) {

        }
    };

    DialogInterface.OnClickListener nListener = new DialogInterface.OnClickListener(){
        @Override
        public void onClick(DialogInterface arg0, int arg1) {

        }
    };
}
