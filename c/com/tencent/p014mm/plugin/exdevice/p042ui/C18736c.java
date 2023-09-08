package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.c */
public class C18736c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f52445d;

    /* renamed from: e */
    public final /* synthetic */ String f52446e;

    /* renamed from: f */
    public final /* synthetic */ ExdeviceConnectWifiUI f52447f;

    public C18736c(ExdeviceConnectWifiUI exdeviceConnectWifiUI, String str, String str2) {
        this.f52447f = exdeviceConnectWifiUI;
        this.f52445d = str;
        this.f52446e = str2;
    }

    public void run() {
        this.f52447f.f52391F.acquire();
        String str = this.f52445d;
        String str2 = this.f52446e;
        ExdeviceConnectWifiUI exdeviceConnectWifiUI = this.f52447f;
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Start AirKiss result (%d). input ssid = %s", Integer.valueOf(Java2CExDevice.startAirKissWithInter(str, str2, exdeviceConnectWifiUI.f52406s, 60000, exdeviceConnectWifiUI.f52407t, exdeviceConnectWifiUI.f52408u)), this.f52446e);
    }
}
