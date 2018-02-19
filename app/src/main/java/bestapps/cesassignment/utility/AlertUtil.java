package bestapps.cesassignment.utility;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import bestapps.cesassignment.acivities.GcdActivity;
import bestapps.cesassignment.R;


/**
 * This class displays alert dialog
 */

public class AlertUtil {

    /****
     * Used to display alert dialog
     * @param context : activity context
     * @param msg : message param which is needed to be shown to user
     */
    public static void alert_Msg(final Context context, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("" + msg);
        builder.setCancelable(true);
        builder.setPositiveButton(
                R.string.close_app,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent();
                        intent.setClass(context, GcdActivity.class);
                     /*   ((Activity) context).finish();*/
                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.setCancelable(true);
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.show();
    }
}
