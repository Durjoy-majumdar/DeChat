package com.tencent.p014mm.remoteservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.tencent.p014mm.remoteservice.C96902c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.remoteservice.d */
public final class C96905d {

    /* renamed from: a */
    public List<Runnable> f283905a = new LinkedList();

    /* renamed from: b */
    public C96902c f283906b;

    /* renamed from: c */
    public ServiceConnection f283907c = new C96906a();

    /* renamed from: d */
    public Context f283908d;

    /* renamed from: com.tencent.mm.remoteservice.d$a */
    public class C96906a implements ServiceConnection {
        public C96906a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C96902c cVar;
            C96905d dVar = C96905d.this;
            int i = C96902c.C96903a.f283903d;
            if (iBinder == null) {
                cVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
                cVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C96902c)) ? new C96902c.C96903a.C96904a(iBinder) : (C96902c) queryLocalInterface;
            }
            dVar.f283906b = cVar;
            List<Runnable> list = C96905d.this.f283905a;
            for (Runnable runnable : (Runnable[]) ((LinkedList) list).toArray(new Runnable[((LinkedList) list).size()])) {
                if (runnable != null) {
                    runnable.run();
                }
            }
            ((LinkedList) C96905d.this.f283905a).clear();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C96905d.this.f283906b = null;
            MMApplicationContext.getContext().unbindService(C96905d.this.f283907c);
        }
    }

    public C96905d(Context context) {
        this.f283908d = context instanceof Activity ? MMApplicationContext.getContext() : context;
    }

    /* renamed from: a */
    public void mo135257a(Runnable runnable) {
        Thread.currentThread().getId();
        if (mo135259c()) {
            runnable.run();
        } else if (this.f283908d != null) {
            ((LinkedList) this.f283905a).add(runnable);
            this.f283908d.bindService(new Intent(this.f283908d, RemoteService.class), this.f283907c, 1);
        }
    }

    /* renamed from: b */
    public void mo135258b(C96899b bVar, String str, Bundle bundle) {
        if (mo135259c()) {
            try {
                this.f283906b.mo135246DY(bVar.getClass().getName(), str, bundle, bVar);
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.RemoteServiceProxy", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    /* renamed from: c */
    public boolean mo135259c() {
        C96902c cVar = this.f283906b;
        return cVar != null && cVar.asBinder().isBinderAlive();
    }

    /* renamed from: d */
    public void mo135260d() {
        ServiceConnection serviceConnection;
        if (!(this.f283906b == null || (serviceConnection = this.f283907c) == null)) {
            this.f283908d.unbindService(serviceConnection);
            this.f283906b = null;
        }
        this.f283908d = null;
    }
}
