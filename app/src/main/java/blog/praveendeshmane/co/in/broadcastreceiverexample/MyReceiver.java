package blog.praveendeshmane.co.in.broadcastreceiverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().contains("ACTION_POWER_DISCONNECTED"))
            Toast.makeText(context, "Charger Disconnected", Toast.LENGTH_LONG).show();
        if (intent.getAction().contains("ACTION_POWER_CONNECTED"))
            Toast.makeText(context, "Charger connected", Toast.LENGTH_LONG).show();
    }
}


