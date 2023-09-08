package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.exdevice.model.l0 */
public class C2240l0 implements Runnable {
    public C2240l0(ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil) {
    }

    public void run() {
        Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "releaseWCLanDeviceLib...");
        Java2CExDevice.releaseWCLanDeviceLib();
    }
}
