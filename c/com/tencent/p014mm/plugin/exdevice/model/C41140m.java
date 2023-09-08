package com.tencent.p014mm.plugin.exdevice.model;

import android.os.Looper;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.model.C41132h;
import com.tencent.p014mm.plugin.exdevice.service.C41178a;
import com.tencent.p014mm.plugin.exdevice.service.C41188e;
import com.tencent.p014mm.plugin.exdevice.service.C41212n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d81.C45288e;
import f40.C86709a0;
import java.util.HashMap;
import y71.C53499i;
import y71.C53502m;
import y71.C53503o;
import z71.C53752a;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.m */
public class C41140m {

    /* renamed from: g */
    public static int f110825g;

    /* renamed from: a */
    public C41178a f110826a;

    /* renamed from: b */
    public C41212n f110827b;

    /* renamed from: c */
    public HashMap<Long, MTimerHandler> f110828c;

    /* renamed from: d */
    public HashMap<Long, MTimerHandler> f110829d;

    /* renamed from: e */
    public HashMap<Long, Integer> f110830e;

    /* renamed from: f */
    public C41188e f110831f = null;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.m$a */
    public class C41141a implements C41132h.C41134b {
        public C41141a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.m$b */
    public class C41142b extends C41178a.C41179a {

        /* renamed from: b */
        public final /* synthetic */ String f110833b;

        /* renamed from: c */
        public final /* synthetic */ long f110834c;

        /* renamed from: d */
        public final /* synthetic */ boolean f110835d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41142b(int i, String str, long j, boolean z) {
            super(i);
            this.f110833b = str;
            this.f110834c = j;
            this.f110835d = z;
        }

        /* renamed from: a */
        public void mo64202a() {
            C41140m mVar = C41140m.this;
            mVar.f110826a.f110938d = null;
            mVar.mo64205c(this.f110833b, this.f110834c, this.f110941a, this.f110835d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.m$c */
    public class C41143c extends C41178a.C41179a {

        /* renamed from: b */
        public final /* synthetic */ String f110837b;

        /* renamed from: c */
        public final /* synthetic */ long f110838c;

        /* renamed from: d */
        public final /* synthetic */ boolean f110839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41143c(int i, String str, long j, boolean z) {
            super(i);
            this.f110837b = str;
            this.f110838c = j;
            this.f110839d = z;
        }

        /* renamed from: a */
        public void mo64202a() {
            C41140m mVar = C41140m.this;
            mVar.f110826a.f110938d = null;
            mVar.mo64205c(this.f110837b, this.f110838c, this.f110941a, this.f110839d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.m$d */
    public class C41144d extends C41178a.C41179a {

        /* renamed from: b */
        public final /* synthetic */ int f110841b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41144d(int i, int i2) {
            super(i);
            this.f110841b = i2;
        }

        /* renamed from: a */
        public void mo64202a() {
            if (!((C53503o) C53502m.m60039c().f110806a).mo74184b(this.f110841b, C41140m.this.f110831f)) {
                Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
            }
        }
    }

    public C41140m() {
        C53502m.m60039c().f110807b = new C41141a();
        if (this.f110827b == null) {
            this.f110827b = new C41157q(this);
        }
        this.f110828c = new HashMap<>();
        this.f110829d = new HashMap<>();
        this.f110830e = new HashMap<>();
    }

    /* renamed from: a */
    public void mo64203a(String str, long j, int i, boolean z) {
        C53752a.m60250d("shut_down_device", j);
        C41178a aVar = this.f110826a;
        if (aVar == null) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "Bind exdeviceService");
            C41178a aVar2 = new C41178a();
            this.f110826a = aVar2;
            aVar2.f110938d = new C41142b(i, str, j, z);
            aVar2.mo64230a(MMApplicationContext.getContext());
        } else if (aVar == null || aVar.f110939e) {
            mo64205c(str, j, i, z);
        } else {
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "ExdeviceService setConnected");
            C41178a aVar3 = this.f110826a;
            aVar3.f110938d = new C41143c(i, str, j, z);
            aVar3.mo64230a(MMApplicationContext.getContext());
        }
    }

    /* renamed from: b */
    public void mo64204b(long j) {
        if (C53502m.m60039c().f110806a != null) {
            Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "now stop the devide channel : %d, result : %b", Long.valueOf(j), Boolean.valueOf(((C53503o) C53502m.m60039c().f110806a).mo74187e(j)));
        }
    }

    /* renamed from: c */
    public void mo64205c(String str, long j, int i, boolean z) {
        boolean z2;
        int i2;
        long j2 = j;
        int i3 = i;
        Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "doConnect");
        if (z) {
            synchronized (this) {
                int m = C86709a0.m107529k().f251779b.mo123467m();
                if (m != 4 && m != 6) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
                } else if (this.f110829d.containsKey(Long.valueOf(j))) {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is syncing data : %s, %d, Just leave!!!", str, Long.valueOf(j));
                } else {
                    MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C41151o(this, j, str, i), false);
                    long e = C45288e.m50134e();
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "now sync time out is : %d", Long.valueOf(e));
                    mTimerHandler.startTimer(e);
                    this.f110829d.put(Long.valueOf(j), mTimerHandler);
                    if (C53502m.m60039c().f110806a != null) {
                        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "start channel now : %s, %d", str, Long.valueOf(j));
                        z2 = ((C53503o) C53502m.m60039c().f110806a).mo74186d(j2, i3, this.f110827b);
                    } else {
                        Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null");
                    }
                }
            }
            Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "startChannel Ret = %s", Boolean.valueOf(z2));
        } else if (C86709a0.m107529k().f251779b.mo123467m() != 4) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
        } else {
            if (this.f110828c.containsKey(Long.valueOf(j))) {
                Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is connecting, reset timer : brand name = %s, deviceid = %d, bluetooth version = %d", str, Long.valueOf(j), Integer.valueOf(i));
                MTimerHandler mTimerHandler2 = this.f110828c.get(Long.valueOf(j));
                mTimerHandler2.stopTimer();
                mTimerHandler2.startTimer(30000);
                i2 = 3;
            } else {
                Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "the device is not connecting, brand name = %s, deviceid = %d, bluetooth version = %d", str, Long.valueOf(j), Integer.valueOf(i));
                Looper mainLooper = Looper.getMainLooper();
                C41153p pVar = r1;
                i2 = 3;
                C41153p pVar2 = new C41153p(this, j, str, i);
                MTimerHandler mTimerHandler3 = new MTimerHandler(mainLooper, (MTimerHandler.CallBack) pVar, false);
                mTimerHandler3.startTimer(30000);
                this.f110828c.put(Long.valueOf(j), mTimerHandler3);
            }
            if (C53502m.m60039c().f110806a == null) {
                Object[] objArr = new Object[i2];
                objArr[0] = str;
                objArr[1] = Long.valueOf(j);
                objArr[2] = Integer.valueOf(i);
                Log.m105929w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null, Just leave, brand name is %s, device id is %d, bluetooth version is %d", objArr);
            } else {
                C53499i.C53500a d = C53502m.m60037a().mo74177d(j2);
                if (d == null) {
                    Log.m105929w("MicroMsg.exdevice.ExdeviceConnectManager", "Device unbond: %s", Long.valueOf(j));
                } else {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, connectState = %d ", Integer.valueOf(d.f150449e));
                    int i4 = d.f150449e;
                    if (!(i4 == 2 || i4 == 1)) {
                        ((C53503o) C53502m.m60039c().f110806a).mo74186d(j2, i3, this.f110827b);
                    }
                    z2 = true;
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "startChannel Ret = %s", Boolean.valueOf(z2));
                }
            }
        }
        z2 = false;
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "startChannel Ret = %s", Boolean.valueOf(z2));
    }

    /* renamed from: d */
    public void mo64206d(int i, C41188e eVar) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "scanLogic, bluetooth version = %d", Integer.valueOf(i));
        if (eVar == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "null == aCallback");
            return;
        }
        this.f110831f = eVar;
        C41178a aVar = this.f110826a;
        if (aVar == null || !aVar.f110939e) {
            if (this.f110826a == null) {
                this.f110826a = new C41178a();
            }
            C41178a aVar2 = this.f110826a;
            aVar2.f110938d = new C41144d(i, i);
            aVar2.mo64230a(MMApplicationContext.getContext());
            return;
        }
        Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
        if (C53502m.m60039c().f110806a == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            return;
        }
        if (!((C53503o) C53502m.m60039c().f110806a).mo74184b(i, this.f110831f)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
        }
    }

    /* renamed from: e */
    public synchronized void mo64207e(int i) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "setConnectMode, mode = %d", Integer.valueOf(i));
        f110825g = i;
    }

    /* renamed from: f */
    public boolean mo64208f(boolean z) {
        long[] jArr;
        if (C53502m.m60039c().f110806a != null) {
            C53503o oVar = (C53503o) C53502m.m60039c().f110806a;
            oVar.getClass();
            try {
                jArr = oVar.f150455a.mo23557mc();
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "getDeviceList failed!!! %s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
                jArr = null;
            }
            if (jArr == null || jArr.length <= 0) {
                Log.m105928w("MicroMsg.exdevice.ExdeviceConnectManager", "connectedDevices = null or connectedDevices.length = 0");
                return false;
            }
            for (long j : jArr) {
                Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "deviceId = %s", Long.valueOf(j));
                C53753b kD = C41166r1.Bx0().mo74337kD(j);
                if (kD == null) {
                    Log.m105929w("MicroMsg.exdevice.ExdeviceConnectManager", "Get device info failed, deviceId = %s", Long.valueOf(j));
                } else if (!z || (kD.field_closeStrategy & 1) != 0) {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel, deviceId = %s", Long.valueOf(j));
                    ((C53503o) C53502m.m60039c().f110806a).mo74187e(j);
                } else {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "Device is not close after exit chatting, deviceId = %s", Long.valueOf(j));
                }
            }
            return true;
        }
        Log.m105928w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher is null!");
        return false;
    }
}
