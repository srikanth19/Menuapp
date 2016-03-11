package app.com.example.user.menuapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by user on 11-Mar-16.
 */
public class mydialoguefragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder thedialogue=new AlertDialog.Builder(getActivity());
        thedialogue.setTitle("Sample_dialogue");
        thedialogue.setMessage("This dialogue");
        thedialogue.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked ok", Toast.LENGTH_SHORT).show();
            }
        });
        thedialogue.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Clicked cancel",Toast.LENGTH_SHORT).show();
            }
        });

        return super.onCreateDialog(savedInstanceState);
    }
}
