package com.tencent.p014mm.plugin.exdevice.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.exdevice.model.C41119a;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.service.C41182c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.service.C116024c;
import f40.C86709a0;
import f40.C86718e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import n71.C47169a;
import p757xv.C38853w;
import y71.C53498h;
import y71.C53502m;
import y71.C53503o;

/* renamed from: com.tencent.mm.plugin.exdevice.service.a */
public class C41178a implements ServiceConnection {

    /* renamed from: d */
    public C41179a f110938d;

    /* renamed from: e */
    public volatile boolean f110939e;

    /* renamed from: f */
    public List<Runnable> f110940f = new LinkedList();

    /* renamed from: com.tencent.mm.plugin.exdevice.service.a$a */
    public static abstract class C41179a {

        /* renamed from: a */
        public int f110941a;

        public C41179a(int i) {
            this.f110941a = i;
        }

        /* renamed from: a */
        public abstract void mo64202a();
    }

    /* renamed from: a */
    public void mo64230a(Context context) {
        if (!C53498h.m60027a(context)) {
            Log.m105924i("MicroMsg.exdevice.ExDeviceServiceConnection", "ensureServiceInstance return false");
            return;
        }
        if (C116024c.m163161a(new Intent(context, ExDeviceService.class), this, 1, "exdevice", true, C88144b.m109786e("exdevice"))) {
            Log.m105924i("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice success");
        } else {
            Log.m105920e("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice failed");
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C41182c cVar;
        boolean z;
        ArrayList arrayList;
        Log.m105924i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceConnected");
        int i = C41182c.C41183a.f110946d;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
            cVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C41182c)) ? new C41182c.C41183a.C41184a(iBinder) : (C41182c) queryLocalInterface;
        }
        C53503o oVar = new C53503o(cVar);
        C53502m.m60039c().f110806a = oVar;
        MMApplicationContext.isExdeviceProcess();
        C47169a aVar = C47169a.f126713e;
        if (aVar == null) {
            aVar = new C47169a();
            C47169a.f126713e = aVar;
        }
        try {
            oVar.f150455a.Fk0(aVar);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "registOnDeviceRequest failed!!! %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
        }
        try {
            oVar.f150455a.n90(C41119a.f110781e);
        } catch (RemoteException e2) {
            Log.m105921e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.registExDeviceInvokerHandler failed!!, %s", e2.getMessage());
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e2, "", new Object[0]);
        }
        try {
            z = oVar.f150455a.mo23562vu(C41166r1.zx0());
        } catch (RemoteException e3) {
            Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e3, "", new Object[0]);
            z = false;
        }
        if (!z) {
            Log.m105920e("MicroMsg.exdevice.ExDeviceServiceConnection", "simpleBluetoothRegistOnRecv error");
        }
        C41179a aVar2 = this.f110938d;
        if (aVar2 != null) {
            aVar2.mo64202a();
        }
        this.f110939e = true;
        synchronized (this.f110940f) {
            arrayList = new ArrayList(this.f110940f);
            ((LinkedList) this.f110940f).clear();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Runnable runnable = (Runnable) arrayList.get(i2);
            if (runnable != null) {
                runnable.run();
            }
        }
        arrayList.clear();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.m105924i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceDisconnected");
        this.f110939e = false;
        C53502m.m60039c().f110806a = null;
        MMApplicationContext.isExdeviceProcess();
        if (!C38853w.m41954b()) {
            return;
        }
        if (!C86709a0.m107523b().mo121115m() || C86718e.m107551r()) {
            Log.m105924i("MicroMsg.exdevice.ExDeviceServiceConnection", "no user login, ignore this disconnection");
        } else {
            mo64230a(MMApplicationContext.getContext());
        }
    }
}
