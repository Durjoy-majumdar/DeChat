package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.exdevice.model.e0 */
public class C2235e0 implements Runnable {
    public C2235e0(C93367y yVar) {
    }

    public void run() {
        Log.m105924i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "releaseWCLanDeviceLib...");
        Java2CExDevice.releaseWCLanDeviceLib();
    }
}
