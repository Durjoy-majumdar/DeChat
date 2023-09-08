package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.autogen.events.WearHardDeviceEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.exdevice.model.v1 */
public class C41174v1 implements C11385n {

    /* renamed from: d */
    public static final C41174v1 f110933d = new C41174v1();

    /* renamed from: a */
    public static void m44612a(String str, boolean z) {
        Log.m105925i("MicroMsg.WearHardDeviceLogic", "publish auth response deviceId=%s | isSuccess=%b", str, Boolean.valueOf(z));
        WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
        WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
        aVar.f107827a = 8;
        aVar.f107828b = z;
        aVar.f107829c = str;
        wearHardDeviceEvent.publish();
    }

    /* renamed from: b */
    public static void m44613b(String str, boolean z) {
        Log.m105925i("MicroMsg.WearHardDeviceLogic", "publish register response deviceId=%s | isSuccess=%b", str, Boolean.valueOf(z));
        WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
        WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
        aVar.f107827a = 2;
        aVar.f107828b = z;
        aVar.f107829c = str;
        wearHardDeviceEvent.publish();
    }

    /* renamed from: c */
    public static void m44614c(String str, boolean z) {
        Log.m105925i("MicroMsg.WearHardDeviceLogic", "publish send response deviceId=%s | isSuccess=%b", str, Boolean.valueOf(z));
        WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
        WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
        aVar.f107827a = 5;
        aVar.f107828b = z;
        aVar.f107829c = str;
        wearHardDeviceEvent.publish();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C41122b1) {
            C86709a0.m107529k().f251779b.mo123470p(541, this);
            C41122b1 b1Var = (C41122b1) yVar;
            if (i == 0 && i2 == 0) {
                m44612a(b1Var.f110786f, true);
            } else {
                m44612a(b1Var.f110786f, false);
            }
        } else if (yVar instanceof C41131g1) {
            C86709a0.m107529k().f251779b.mo123470p(538, this);
            C41131g1 g1Var = (C41131g1) yVar;
            if (i == 0 && i2 == 0) {
                m44614c(g1Var.f110804f, true);
            } else {
                m44614c(g1Var.f110804f, false);
            }
        }
    }
}
