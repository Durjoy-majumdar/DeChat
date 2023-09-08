package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.autogen.events.ExDeviceChattingUIStateEvent;
import com.tencent.p014mm.plugin.exdevice.service.C41212n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d81.C45288e;
import y71.C53499i;
import y71.C53502m;
import z71.C53752a;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.q */
public class C41157q extends C41212n {

    /* renamed from: e */
    public final /* synthetic */ C41140m f110880e;

    public C41157q(C41140m mVar) {
        this.f110880e = mVar;
    }

    public void k20(long j, int i, int i2, int i3, long j2) {
        long j3 = j;
        int i4 = i2;
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d", C45288e.m50135f(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (MMApplicationContext.getContext() == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "MMApplicationContext is null");
            return;
        }
        if (4 == i4) {
            C53502m.m60037a().mo74174a(j3);
            long[] b = C53752a.m60248b("shut_down_device");
            if (!(b == null || b.length == 0)) {
                for (long j4 : b) {
                    if (j4 == j3) {
                        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel in the shut down device list, deviceId = %d", Long.valueOf(j4));
                        this.f110880e.mo64204b(j4);
                        if (!C53752a.m60250d("shut_down_device", j4)) {
                            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "removeFromSharedPreferences failed!!!");
                        }
                    }
                }
            }
            if (this.f110880e.f110830e.get(Long.valueOf(j)) != null) {
                Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "Device connect strategy(%d)", this.f110880e.f110830e.get(Long.valueOf(j)));
                ExDeviceChattingUIStateEvent exDeviceChattingUIStateEvent = new ExDeviceChattingUIStateEvent();
                exDeviceChattingUIStateEvent.publish();
                if (!exDeviceChattingUIStateEvent.f107431d.f107432a || (this.f110880e.f110830e.get(Long.valueOf(j)).intValue() & 1) != 1) {
                    this.f110880e.mo64204b(j3);
                }
            } else {
                this.f110880e.mo64204b(j3);
            }
        }
        if (i != i4) {
            C53753b SE = C41166r1.Bx0().mo74331SE(j3 + "");
            if (SE == null || Util.isNullOrNil(SE.field_brandName)) {
                Log.m105921e("MicroMsg.exdevice.ExdeviceConnectManager", "get hdinfo by mac failed : %d", Long.valueOf(j));
                return;
            }
            C53499i.C53500a d = C53502m.m60037a().mo74177d(j3);
            if (d != null) {
                d.f150449e = i4;
            } else {
                Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "get connect state faild : %d", Long.valueOf(j));
            }
            if (i4 == 2) {
                Log.m105928w("MicroMsg.exdevice.ExdeviceConnectManager", "newState = EMMACCS_connected");
                return;
            }
            C41166r1.yx0();
            ExdeviceEventManager.m44540n(SE.field_brandName, SE.field_url, i4, SE.field_deviceID);
        }
    }
}
