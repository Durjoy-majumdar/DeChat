package com.tencent.p014mm.plugin.exdevice.service;

import com.tencent.p014mm.autogen.events.ExDeviceIBeaconRangingResultEvent;
import com.tencent.p014mm.plugin.exdevice.model.C41139l;
import com.tencent.p014mm.plugin.exdevice.model.C41140m;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.service.C41203k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d81.C45288e;
import java.util.LinkedList;
import y71.C53502m;
import y71.C53503o;

/* renamed from: com.tencent.mm.plugin.exdevice.service.b */
public class C41180b extends C41203k.C41204a {

    /* renamed from: e */
    public static C41180b f110942e = new C41180b();

    /* renamed from: com.tencent.mm.plugin.exdevice.service.b$a */
    public class C41181a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f110943d;

        /* renamed from: e */
        public final /* synthetic */ boolean f110944e;

        public C41181a(String str, boolean z) {
            this.f110943d = str;
            this.f110944e = z;
        }

        public void run() {
            if (C53502m.m60039c().f110806a != null) {
                ((C53503o) C53502m.m60039c().f110806a).mo74183a(this.f110943d, this.f110944e, C41180b.this);
            }
        }
    }

    /* renamed from: a */
    public boolean mo64233a(String str, boolean z) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceIBeaconManager", "ranging, uuid = %s, op = %s", str, String.valueOf(z));
        if (str == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceIBeaconManager", "uuid is null");
            return false;
        } else if (C53502m.m60039c().f110806a != null) {
            return ((C53503o) C53502m.m60039c().f110806a).mo74183a(str, z, this);
        } else {
            Log.m105920e("MicroMsg.exdevice.ExdeviceIBeaconManager", "MMExDeviceCore.getTaskQueue().getDispatcher() is null !!!now retry invoke doTaskAfterServiceStarted!");
            C41140m xx02 = C41166r1.xx0();
            C41181a aVar = new C41181a(str, z);
            xx02.getClass();
            Log.m105918d("MicroMsg.exdevice.ExdeviceConnectManager", "doTaskAfterServiceStarted");
            C41178a aVar2 = xx02.f110826a;
            if (aVar2 == null || !aVar2.f110939e) {
                if (xx02.f110826a == null) {
                    xx02.f110826a = new C41178a();
                }
                C41178a aVar3 = xx02.f110826a;
                aVar3.f110938d = new C41139l(xx02, 0, aVar);
                aVar3.mo64230a(MMApplicationContext.getContext());
            } else {
                C41178a aVar4 = xx02.f110826a;
                if (aVar4.f110939e) {
                    aVar.run();
                } else {
                    synchronized (aVar4.f110940f) {
                        ((LinkedList) aVar4.f110940f).add(aVar);
                    }
                }
            }
            return false;
        }
    }

    public void wt0(double d, int i, int i2, byte[] bArr, double d2, int i3, String str) {
        Log.m105919d("MicroMsg.exdevice.ExdeviceIBeaconManager", "onRangdingCallback, distance = %f, major = %d, minor = %d, uuid = %s, rssi = %f,aMac = %s,txPower = %d", Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2), C45288e.m50130a(bArr), Double.valueOf(d2), str, Integer.valueOf(i3));
        ExDeviceIBeaconRangingResultEvent exDeviceIBeaconRangingResultEvent = new ExDeviceIBeaconRangingResultEvent();
        String a = C45288e.m50130a(bArr);
        if (a.length() >= 32) {
            a = a.substring(0, 8) + "-" + a.substring(8, 12) + "-" + a.substring(12, 16) + "-" + a.substring(16, 20) + "-" + a.substring(20);
        }
        ExDeviceIBeaconRangingResultEvent.C40071a aVar = exDeviceIBeaconRangingResultEvent.f107454d;
        aVar.f107455a = a;
        aVar.f107458d = d;
        aVar.f107456b = i;
        aVar.f107457c = i2;
        aVar.f107459e = d2;
        aVar.f107460f = str;
        aVar.f107461g = i3;
        exDeviceIBeaconRangingResultEvent.publish();
    }
}
