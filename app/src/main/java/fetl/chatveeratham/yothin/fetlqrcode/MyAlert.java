package fetl.chatveeratham.yothin.fetlqrcode;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Yothin.C on 5/16/2017.
 */

public class MyAlert {
    //Explicit
    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }//main main

    public void myDialog(String strTitle,String strMessage) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.mipmap.ic_error);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}//Main Class MyAlert
