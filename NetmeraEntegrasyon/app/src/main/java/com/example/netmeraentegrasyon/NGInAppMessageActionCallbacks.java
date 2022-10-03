package com.example.netmeraentegrasyon;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.netmera.NetmeraInAppMessage;
import com.netmera.callbacks.NMInAppMessageActionCallbacks;

public class NGInAppMessageActionCallbacks implements NMInAppMessageActionCallbacks  {
    private final String TAG = "sample";

    @Override
    public void onInAppMessageShown(Context context, NetmeraInAppMessage inAppMessage) {
        Toast.makeText(context, "onInAppMessageShown triggered :FARUKPOP: "+inAppMessage.getId(), Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onInAppMessageShown triggered : NETMERAFARUK: : "+inAppMessage.getId());
    }

    @Override
    public void onInAppMessageOpen(Context context, NetmeraInAppMessage inAppMessage) {
        Toast.makeText(context, "onInAppMessageOpen triggered FARUKPOP:: "+inAppMessage.getId(), Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onInAppMessageOpen triggered :NETMERAFARUK:: "+inAppMessage.getId());
    }

    @Override
    public void onInAppMessageDismissed(Context context, NetmeraInAppMessage inAppMessage) {
        Toast.makeText(context, "onInAppMessageDismissed triggered FARUKPOP:: "+inAppMessage.getId(), Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onInAppMessageDismissed triggered NETMERAFARUK: "+inAppMessage.getId()); }


}
