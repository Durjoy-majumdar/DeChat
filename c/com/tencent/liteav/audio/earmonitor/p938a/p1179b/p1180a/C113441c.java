package com.tencent.liteav.audio.earmonitor.p938a.p1179b.p1180a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.liteav.audio.earmonitor.p938a.p939a.C113436b;
import com.tencent.liteav.base.util.LiteavLog;

/* renamed from: com.tencent.liteav.audio.earmonitor.a.b.a.c */
public final class C113441c extends C113439a {

    /* renamed from: a */
    public Context f339486a;

    /* renamed from: b */
    public C113440b f339487b;

    /* renamed from: c */
    public boolean f339488c;

    /* renamed from: d */
    public C113436b f339489d;

    /* renamed from: e */
    public IBinder f339490e;

    /* renamed from: f */
    public IBinder.DeathRecipient f339491f;

    /* renamed from: g */
    private ServiceConnection f339492g;

    /* renamed from: com.tencent.liteav.audio.earmonitor.a.b.a.c$a */
    public enum C113444a {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");
        
        public String mParameName;

        private C113444a(String str) {
            this.mParameName = str;
        }
    }

    public C113441c(Context context) {
        this.f339487b = null;
        this.f339488c = false;
        this.f339490e = null;
        this.f339492g = new ServiceConnection() {
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C113441c.this.f339489d = C113436b.C113437a.m155301a(iBinder);
                C113441c cVar = C113441c.this;
                if (cVar.f339489d != null) {
                    cVar.f339488c = true;
                    cVar.f339487b.mo169921a(1000);
                    C113441c cVar2 = C113441c.this;
                    String packageName = cVar2.f339486a.getPackageName();
                    try {
                        C113436b bVar = cVar2.f339489d;
                        if (bVar != null && cVar2.f339488c) {
                            bVar.mo169916a(packageName);
                        }
                    } catch (RemoteException e) {
                        LiteavLog.m16900e("HwAudioKit.HwAudioKaraokeFeatureKit", "isFeatureSupported,RemoteException ex : %s", e.getMessage());
                    }
                    C113441c.m155313a(C113441c.this, iBinder);
                }
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                C113441c cVar = C113441c.this;
                cVar.f339488c = false;
                C113440b bVar = cVar.f339487b;
                if (bVar != null) {
                    bVar.mo169921a(1001);
                }
            }
        };
        this.f339491f = new IBinder.DeathRecipient() {
            public final void binderDied() {
                LiteavLog.m16898e("HwAudioKit.HwAudioKaraokeFeatureKit", "binderDied");
                C113441c cVar = C113441c.this;
                cVar.f339490e.unlinkToDeath(cVar.f339491f, 0);
                C113441c.this.f339487b.mo169921a(1003);
                C113441c.this.f339490e = null;
            }
        };
        this.f339487b = C113440b.m155308a();
        this.f339486a = context;
    }

    /* renamed from: a */
    public final void mo169925a(Context context) {
        if (context != null) {
            if (!C113440b.m155311a(context)) {
                this.f339487b.mo169921a(2);
            } else if (this.f339487b != null && !this.f339488c) {
                C113440b.m155310a(context, this.f339492g, "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService");
            }
        }
    }

    /* renamed from: a */
    public final void mo169924a() {
        if (this.f339488c) {
            this.f339488c = false;
            C113440b.m155309a(this.f339486a, this.f339492g);
        }
    }

    /* renamed from: a */
    public final int mo169923a(boolean z) {
        try {
            C113436b bVar = this.f339489d;
            if (bVar == null || !this.f339488c) {
                return -2;
            }
            return bVar.mo169915a(z);
        } catch (RemoteException e) {
            LiteavLog.m16900e("HwAudioKit.HwAudioKaraokeFeatureKit", "enableKaraokeFeature,RemoteException ex : %s", e.getMessage());
            return -2;
        }
    }

    /* renamed from: a */
    public final int mo169922a(C113444a aVar, int i) {
        if (aVar == null) {
            return 1807;
        }
        try {
            C113436b bVar = this.f339489d;
            if (bVar == null || !this.f339488c) {
                return -2;
            }
            return bVar.mo169914a(aVar.mParameName, i);
        } catch (RemoteException e) {
            LiteavLog.m16900e("HwAudioKit.HwAudioKaraokeFeatureKit", "setParameter,RemoteException ex : %s", e.getMessage());
            return -2;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m155313a(C113441c cVar, IBinder iBinder) {
        cVar.f339490e = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(cVar.f339491f, 0);
            } catch (RemoteException unused) {
                cVar.f339487b.mo169921a(1002);
                LiteavLog.m16898e("HwAudioKit.HwAudioKaraokeFeatureKit", "serviceLinkToDeath, RemoteException");
            }
        }
    }
}
