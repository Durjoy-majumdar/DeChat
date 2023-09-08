package com.tencent.p014mm.plugin.exdevice.model;

import android.os.Looper;
import android.os.RemoteException;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTOnRecvDataFromDeviceEvent;
import com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager;
import com.tencent.p014mm.plugin.exdevice.service.C41188e;
import com.tencent.p014mm.plugin.exdevice.service.C41206l;
import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C45288e;
import java.util.HashMap;
import java.util.LinkedList;
import y71.C53499i;
import y71.C53502m;
import y71.C53503o;

/* renamed from: com.tencent.mm.plugin.exdevice.model.f0 */
public class C41125f0 extends C41206l.C41207a {

    /* renamed from: h */
    public static final String f110792h = C41125f0.class.getName();

    /* renamed from: e */
    public boolean f110793e = false;

    /* renamed from: f */
    public C53499i f110794f = new C53499i();

    /* renamed from: g */
    public C41188e.C41189a f110795g = new C41126a(this);

    /* renamed from: com.tencent.mm.plugin.exdevice.model.f0$a */
    public class C41126a extends C41188e.C41189a {
        public C41126a(C41125f0 f0Var) {
        }

        /* renamed from: gj */
        public void mo64196gj(int i, int i2, String str, String str2, String str3, int i3, byte[] bArr) {
            String str4 = C41125f0.f110792h;
            Log.m105919d(str4, "onScanCallback. messageType=%d, errCode=%d, errMsg=%s, deviceMac=%s, deviceName=%s, rssi=%d, advertisment=%s", Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, Integer.valueOf(i3), C45288e.m50130a(bArr));
            if (1 == i) {
                C41166r1.yx0().mo64184q(str3, str2, false);
            } else if (2 == i) {
                C41166r1.yx0().mo64184q(str3, str2, true);
            } else {
                Log.m105921e(str4, "unknown message type %d", Integer.valueOf(i));
            }
            if (C41166r1.Bx0().mo74337kD(C45288e.m50137h(str2)) != null) {
                Log.m105918d(str4, "the founded device hasn't been binded");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.f0$b */
    public interface C41127b {
    }

    public void Cc0(long j, byte[] bArr) {
        LinkedList<ExdeviceEventManager.C41111e> linkedList;
        if (bArr == null || bArr.length <= 0) {
            Log.m105920e(f110792h, "data is null or nil");
            return;
        }
        Log.m105919d(f110792h, "onDataRecv. mac=%d, data=%s", Long.valueOf(j), C45288e.m50130a(bArr));
        ExdeviceEventManager yx02 = C41166r1.yx0();
        String f = C45288e.m50135f(j);
        synchronized (yx02.f110715a) {
            linkedList = new LinkedList<>(yx02.f110715a);
        }
        for (ExdeviceEventManager.C41111e h1 : linkedList) {
            h1.mo64189h1(f, bArr, true);
        }
        linkedList.clear();
        for (ExdeviceEventManager.C41111e h15 : ((HashMap) yx02.f110716b).values()) {
            h15.mo64189h1(f, bArr, true);
        }
        ExDeviceSimpleBTOnRecvDataFromDeviceEvent exDeviceSimpleBTOnRecvDataFromDeviceEvent = new ExDeviceSimpleBTOnRecvDataFromDeviceEvent();
        ExDeviceSimpleBTOnRecvDataFromDeviceEvent.C40083a aVar = exDeviceSimpleBTOnRecvDataFromDeviceEvent.f107493d;
        aVar.f107494a = f;
        aVar.f107495b = bArr;
        exDeviceSimpleBTOnRecvDataFromDeviceEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: e */
    public void mo64195e() {
        boolean z;
        if (!this.f110793e) {
            Log.m105918d(f110792h, "not yet scan. return");
            return;
        }
        C41140m xx02 = C41166r1.xx0();
        C41188e.C41189a aVar = this.f110795g;
        xx02.getClass();
        Log.m105918d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTStopScan");
        if (xx02.f110826a == null) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
        } else if (C53502m.m60039c().f110806a == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
        } else {
            C53503o oVar = (C53503o) C53502m.m60039c().f110806a;
            oVar.getClass();
            try {
                z = oVar.f150455a.i60(0, aVar);
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
                z = false;
            }
            if (!z) {
                Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
            }
        }
        this.f110793e = false;
    }
}
