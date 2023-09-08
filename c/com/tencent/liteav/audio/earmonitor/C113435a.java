package com.tencent.liteav.audio.earmonitor;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.audio.earmonitor.p938a.p1179b.p1180a.C113441c;
import com.tencent.liteav.audio.earmonitor.p938a.p1179b.p1180a.C113445d;
import com.tencent.liteav.audio.earmonitor.p938a.p1179b.p1180a.C113449e;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.audio.earmonitor.a */
public final class C113435a extends SystemAudioKit implements C113449e, C113473t.C113474a {

    /* renamed from: a */
    private static final int f339470a = ((int) TimeUnit.SECONDS.toMillis(1));

    /* renamed from: b */
    private final Context f339471b;

    /* renamed from: c */
    private final Handler f339472c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private C113445d f339473d;

    /* renamed from: e */
    private C113441c f339474e;

    /* renamed from: f */
    private C113473t f339475f;

    /* renamed from: g */
    private boolean f339476g = false;

    /* renamed from: h */
    private boolean f339477h = false;

    /* renamed from: i */
    private boolean f339478i = false;

    public C113435a(long j, Context context) {
        super(j);
        this.f339471b = context.getApplicationContext();
    }

    /* renamed from: b */
    public static /* synthetic */ void m155290b(C113435a aVar, int i) {
        C113441c cVar = aVar.f339474e;
        if (cVar != null) {
            int a = cVar.mo169922a(C113441c.C113444a.CMD_SET_VOCAL_VOLUME_BASE, i);
            if (a == 1806 || a == -2) {
                aVar.m155288b(-2);
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m155292c(C113435a aVar) {
        C113441c cVar = aVar.f339474e;
        if (cVar != null) {
            cVar.mo169924a();
            aVar.f339474e = null;
        }
        C113445d dVar = aVar.f339473d;
        if (dVar != null) {
            dVar.mo169932b();
            aVar.f339473d = null;
        }
        aVar.f339476g = false;
    }

    /* renamed from: d */
    public static /* synthetic */ void m155293d(C113435a aVar) {
        if (aVar.f339473d == null) {
            aVar.f339476g = true;
            C113445d dVar = new C113445d(aVar.f339471b, aVar);
            aVar.f339473d = dVar;
            dVar.mo169929a();
        }
    }

    /* renamed from: a */
    public final void mo169913a(int i) {
        m155286a(C113455g.m155338a(this, i));
    }

    /* renamed from: a_ */
    public final void mo20405a_() {
        boolean z = true;
        if (LiteavSystemInfo.getAppBackgroundState() != 1) {
            z = false;
        }
        if (this.f339478i && this.f339477h && !z) {
            LiteavLog.m16901i("HwSystemAudioKit", "app return to foreground.");
            m155291c();
            m155287b();
        } else if (z && !this.f339477h) {
            LiteavLog.m16901i("HwSystemAudioKit", "app has gone to background.");
        }
        this.f339477h = z;
    }

    public final void initialize() {
        m155286a(C113450b.m155333a(this));
    }

    public final void setEarMonitoringVolume(int i) {
        m155286a(C113454f.m155337a(this, i));
    }

    public final void startEarMonitoring() {
        m155286a(C113452d.m155335a(this));
    }

    public final void stopEarMonitoring() {
        m155286a(C113453e.m155336a(this));
    }

    public final void terminate() {
        m155286a(C113451c.m155334a(this));
    }

    /* renamed from: a */
    private void m155286a(Runnable runnable) {
        if (Looper.myLooper() == this.f339472c.getLooper()) {
            runnable.run();
        } else {
            this.f339472c.post(runnable);
        }
    }

    /* renamed from: b */
    private void m155287b() {
        C113441c cVar = this.f339474e;
        if (cVar != null) {
            int a = cVar.mo169923a(true);
            if (a == 0 || a == 1805) {
                this.f339478i = true;
            } else {
                m155288b(1003);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m155284a(C113435a aVar) {
        C113473t tVar = aVar.f339475f;
        if (tVar != null) {
            tVar.mo169973a();
            aVar.f339475f = null;
        }
        aVar.m155291c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m155288b(int i) {
        LiteavLog.m16902i("HwSystemAudioKit", "on audio kit callback: %d", Integer.valueOf(i));
        if (i == 0) {
            this.f339476g = false;
            C113445d dVar = this.f339473d;
            if (dVar != null) {
                C113445d.C113448a aVar = C113445d.C113448a.f339509a;
                if (dVar.mo169930a(aVar)) {
                    this.f339474e = (C113441c) this.f339473d.mo169931b(aVar);
                    return;
                }
            }
            notifyEarMonitoringInitialized(this, false);
        } else if (i == 1000) {
            notifyEarMonitoringInitialized(this, true);
        } else if (i == 1805) {
            if (this.f339476g) {
                this.f339476g = false;
            } else {
                notifySystemError(this);
            }
        }
    }

    /* renamed from: c */
    private void m155291c() {
        C113441c cVar = this.f339474e;
        if (cVar != null) {
            cVar.mo169923a(false);
            this.f339478i = false;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m155289b(C113435a aVar) {
        if (aVar.f339475f == null) {
            C113473t tVar = new C113473t(Looper.getMainLooper(), aVar);
            aVar.f339475f = tVar;
            tVar.mo169974a(0, f339470a);
        }
        aVar.m155287b();
    }
}
