package com.example.netmeraentegrasyon;

import android.app.Application;

import com.netmera.Netmera;
import com.netmera.NetmeraConfiguration;
import com.netmera.NetmeraUser;
import com.netmera.events.NetmeraEventLogin;

import static com.netmera.Netmera.updateUser;

public class App extends Application   {
    @Override public void onCreate() {

        super.onCreate();


      //  NMInitializer.initializeComponents(this);
      //  AppInitializer.getInstance(this).initializeComponent(NMFCMProviderInitializer.class);
     //    AppInitializer.getInstance(this).initializeComponent(NMHMSProviderInitializer.class);  //==> Init example if you are going to call Huawei services;

        NetmeraConfiguration.Builder configBuilder = new NetmeraConfiguration.Builder();

        configBuilder.apiKey("gFtyH_nz5WC6kvCmiZkxe5yPHKlObqBJaJzD45tda524qJzpjGu5YjqOVdMYzykr")

                .firebaseSenderId("114851698926")

             //  .huaweiSenderId(PropertiesUtil.hmsSenderId) //==> Init example if you are going to call Huawei services;

                .logging(true)  //==>  Allows netmera logs to appear in logcat

                .nmInAppMessageActionCallbacks(new NGInAppMessageActionCallbacks())

                .nmPushActionCallbacks(new NGPushActionCallbacks());

        Netmera.init(configBuilder.build(this));


        Netmera.enablePopupPresentation();



        NetmeraUser User = new   NetmeraUser();
        User.setUserId("faruk");


        // Send data to Netmera              <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"
        //        tools:ignore="ManifestOrder" />
        updateUser(User);



        //   Netmera.requestPermissionsForLocation();







        //    Uri deeplinkUri = netmeraPushObject.getDeepLink();
        NetmeraEventLogin event = new NetmeraEventLogin("faruk");
        Netmera.sendEvent(event);




        Netmera.requestPermissionsForLocation();
        // Enable verbose OneSignal logging to debug issues if needed.



    }




}
