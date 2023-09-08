package com.tencent.p014mm.plugin.exdevice.model;

import android.os.Looper;
import android.util.Base64;
import com.tencent.p014mm.autogen.events.ExDeviceOnScanDeviceResultEvent;
import com.tencent.p014mm.plugin.exdevice.model.C41145m1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.exdevice.model.t */
public class C41167t implements C41145m1.C41147b {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceEventManager f110918a;

    public C41167t(ExdeviceEventManager exdeviceEventManager) {
        this.f110918a = exdeviceEventManager;
    }

    /* renamed from: a */
    public void mo64229a(String str, byte[] bArr, boolean z) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "OnScanDevice %s", str);
        this.f110918a.getClass();
        if (bArr == null) {
            Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, isCompleted=%s", str, Boolean.valueOf(z));
        } else {
            Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, base64(broadcastData)=%s, isCompleted=%s", str, Base64.encodeToString(bArr, 0), Boolean.valueOf(z));
        }
        ExDeviceOnScanDeviceResultEvent exDeviceOnScanDeviceResultEvent = new ExDeviceOnScanDeviceResultEvent();
        ExDeviceOnScanDeviceResultEvent.C40075a aVar = exDeviceOnScanDeviceResultEvent.f107471d;
        aVar.f107473b = bArr;
        aVar.f107472a = str;
        aVar.f107474c = z;
        exDeviceOnScanDeviceResultEvent.asyncPublish(Looper.getMainLooper());
    }
}
