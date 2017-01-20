/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/eband4 for more book information.
 ***/
package edu.neu.madcourse.raj__kukadia;

import android.Manifest;
import android.app.Activity;
//import android.media.MediaPlayer;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;

public class AboutActivity extends Activity implements View.OnClickListener {
    //MediaPlayer mMediaPlayer;
    // .. .
    private AlertDialog mDialog;
    private final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 1;
    private static TelephonyManager mngr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("About me");
        setContentView(R.layout.activity_about);
        View v = findViewById(R.id.IMEI_button);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AboutActivity.this);
                // int permissionCheck = ContextCompat.checkSelfPermission(AboutActivity.this,
                //   Manifest.permission.READ_PHONE_STATE);
                checkPermissions();
              //  try {
                //    Thread.sleep(1500);
                //} catch (InterruptedException e) {
                  //  e.printStackTrace();
                //}
                mngr = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
                builder.setMessage( mngr.getDeviceId());

                builder.setCancelable(false);
                builder.setPositiveButton(R.string.ok_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // nothing
                            }

                        });
                mDialog = builder.show();
            }
        });
    }

    protected void checkPermissions() {

    // Here, thisActivity is the current activity
    if(ContextCompat.checkSelfPermission(AboutActivity.this,
    Manifest.permission.READ_PHONE_STATE)
            !=PackageManager.PERMISSION_GRANTED)

    {

        // Should we show an explanation?
        if (ActivityCompat.shouldShowRequestPermissionRationale(AboutActivity.this,
                Manifest.permission.READ_PHONE_STATE)) {
            // Show an explanation to the user *asynchronously* -- don't block
            // this thread waiting for the user's response! After the user
            // sees the explanation, try again to request the permission.

        } else {

            // No explanation needed, we can request the permission.

            ActivityCompat.requestPermissions(AboutActivity.this,
                    new String[]{Manifest.permission.READ_PHONE_STATE},
                    MY_PERMISSIONS_REQUEST_READ_PHONE_STATE);

            // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
            // app-defined int constant. The callback method gets the
            // result of the request.
        }
    }

}
    @Override
                public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
                    switch (requestCode) {
                        case MY_PERMISSIONS_REQUEST_READ_PHONE_STATE: {
                            // If request is cancelled, the result arrays are empty.
                            if (grantResults.length > 0
                                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                                // permission was granted, yay! Do the
                                // contacts-related task you need to do.


                            } else {

                                // permission denied, boo! Disable the
                                // functionality that depends on this permission.
                            }
                            return;
                        }

                        // other 'case' lines to check for other
                        // permissions this app might request
                    }
                }





    @Override
    protected void onResume() {
        super.onResume();
        //mMediaPlayer = MediaPlayer.create(this, R.raw.a_guy_1_epicbuilduploop);
        //mMediaPlayer.setVolume(0.5f, 0.5f);
       // mMediaPlayer.setLooping(true);
        //mMediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //mMediaPlayer.stop();
       // mMediaPlayer.reset();
        //mMediaPlayer.release();
    }

    @Override
    public void onClick(View v) {

    }
}
