package com.example.netmeraentegrasyon;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.netmera.NetmeraCarouselObject;
import com.netmera.NetmeraPushObject;
import com.netmera.callbacks.NMPushActionCallbacks;

public class NGPushActionCallbacks implements NMPushActionCallbacks {
    @Override
    public void onPushRegister(Context context, String gcmSenderId, String pushToken) {
        Log.v("sample", "onPushRegister");
        // Example : PushRegisterIdlingResource.registeredToPush();
        // Example : EventBus.getDefault().postSticky(new GCMRegistrationEvent(pushToken));
    }

    @Override
    public void onPushReceive(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
        Log.v("sample", "onPushReceive");
  //      Example : EventBus.getDefault().post(new PushReceivedEvent(netmeraPushObject));
    }

    @Override
    public void onPushOpen(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
     //   Uri universalLinkUrl = netmeraPushObject.getDeepLink();
        Log.v("sample", "onPushOpen");
    }

    @Override
    public void onPushDismiss(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {

        Log.v("sample", "onPushDismiss FARUKPOP");
    }

    @Override
    public void onPushButtonClicked(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject) {
        Log.v("sample", "onPushButtonClicked:");
    }

    @Override
    public void onCarouselObjectSelected(Context context, Bundle bundle, NetmeraPushObject netmeraPushObject, int i, NetmeraCarouselObject netmeraCarouselObject) {
        Log.v("sample", "onCarouselObjectSelected:");
    }


}
