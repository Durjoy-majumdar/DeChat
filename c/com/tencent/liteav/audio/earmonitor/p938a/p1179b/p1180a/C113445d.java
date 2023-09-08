package com.tencent.liteav.audio.earmonitor.p938a.p1179b.p1180a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.liteav.audio.earmonitor.p938a.p939a.C80197a;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.liteav.audio.earmonitor.a.b.a.d */
public final class C113445d {

    /* renamed from: a */
    private static final List<Integer> f339499a = new ArrayList(0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f339500b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C80197a f339501c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f339502d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C113440b f339503e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public IBinder f339504f = null;

    /* renamed from: g */
    private ServiceConnection f339505g = new ServiceConnection() {
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C80197a unused = C113445d.this.f339501c = C80197a.C80198a.m97539a(iBinder);
            if (C113445d.this.f339501c != null) {
                boolean unused2 = C113445d.this.f339502d = true;
                C113445d.this.f339503e.mo169921a(0);
                C113445d dVar = C113445d.this;
                C113445d.m155321a(dVar, dVar.f339500b.getPackageName(), "1.0.1");
                C113445d.m155320a(C113445d.this, iBinder);
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C80197a unused = C113445d.this.f339501c = null;
            boolean unused2 = C113445d.this.f339502d = false;
            C113445d.this.f339503e.mo169921a(4);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: h */
    public IBinder.DeathRecipient f339506h = new IBinder.DeathRecipient() {
        public final void binderDied() {
            C113445d.this.f339504f.unlinkToDeath(C113445d.this.f339506h, 0);
            C113445d.this.f339503e.mo169921a(6);
            LiteavLog.m16898e("HwAudioKit.HwAudioKit", "service binder died");
            IBinder unused = C113445d.this.f339504f = null;
        }
    };

    /* renamed from: com.tencent.liteav.audio.earmonitor.a.b.a.d$a */
    public enum C113448a {
        ;
        
        public int mFeatureType;

        private C113448a(int i) {
            this.mFeatureType = 1;
        }
    }

    public C113445d(Context context, C113449e eVar) {
        C113440b a = C113440b.m155308a();
        this.f339503e = a;
        a.f339485a = eVar;
        this.f339500b = context;
    }

    /* renamed from: b */
    public final void mo169932b() {
        if (this.f339502d) {
            this.f339502d = false;
            C113440b.m155309a(this.f339500b, this.f339505g);
        }
    }

    /* renamed from: a */
    public final void mo169929a() {
        Context context = this.f339500b;
        if (context == null) {
            this.f339503e.mo169921a(7);
        } else if (!C113440b.m155311a(context)) {
            this.f339503e.mo169921a(2);
        } else {
            Context context2 = this.f339500b;
            if (this.f339503e != null && !this.f339502d) {
                C113440b.m155310a(context2, this.f339505g, "com.huawei.multimedia.audioengine.HwAudioEngineService");
            }
        }
    }

    /* renamed from: b */
    public final <T extends C113439a> T mo169931b(C113448a aVar) {
        if (this.f339503e == null || aVar == null) {
            return null;
        }
        return C113440b.m155307a(aVar.mFeatureType, this.f339500b);
    }

    /* renamed from: a */
    public final boolean mo169930a(C113448a aVar) {
        if (aVar == null) {
            return false;
        }
        try {
            C80197a aVar2 = this.f339501c;
            if (aVar2 != null && this.f339502d) {
                return aVar2.mo111199a(aVar.mFeatureType);
            }
        } catch (RemoteException e) {
            LiteavLog.m16900e("HwAudioKit.HwAudioKit", "isFeatureSupported,RemoteException ex : %s", e.getMessage());
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m155321a(C113445d dVar, String str, String str2) {
        try {
            C80197a aVar = dVar.f339501c;
            if (aVar != null && dVar.f339502d) {
                aVar.mo111198a(str, str2);
            }
        } catch (RemoteException e) {
            LiteavLog.m16900e("HwAudioKit.HwAudioKit", "isFeatureSupported,RemoteException ex : %s", e.getMessage());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m155320a(C113445d dVar, IBinder iBinder) {
        dVar.f339504f = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(dVar.f339506h, 0);
            } catch (RemoteException unused) {
                dVar.f339503e.mo169921a(5);
                LiteavLog.m16898e("HwAudioKit.HwAudioKit", "serviceLinkToDeath, RemoteException");
            }
        }
    }
}
