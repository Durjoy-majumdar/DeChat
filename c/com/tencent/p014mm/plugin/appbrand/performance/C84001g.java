package com.tencent.p014mm.plugin.appbrand.performance;

import android.view.Choreographer;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.coremedia.TimeUtil;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.g */
public class C84001g implements Choreographer.FrameCallback {

    /* renamed from: d */
    public Choreographer f245248d = Choreographer.getInstance();

    /* renamed from: e */
    public long f245249e = 0;

    /* renamed from: f */
    public int f245250f = 0;

    /* renamed from: g */
    public long f245251g = 200;

    /* renamed from: h */
    public boolean f245252h = false;

    /* renamed from: i */
    public C84002a f245253i;

    /* renamed from: j */
    public volatile double f245254j = 0.0d;

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.g$a */
    public interface C84002a {
    }

    /* renamed from: a */
    public void mo116644a() {
        if (!this.f245252h) {
            this.f245252h = true;
            Log.m105925i("FPSMetronome", "[start] stack:%s", Util.getStack());
            this.f245248d.postFrameCallback(this);
        }
    }

    /* renamed from: b */
    public void mo116645b() {
        if (this.f245252h) {
            this.f245252h = false;
            this.f245249e = 0;
            this.f245250f = 0;
            Log.m105925i("FPSMetronome", "[stop] stack:%s", Util.getStack());
            this.f245248d.removeFrameCallback(this);
        }
    }

    public void doFrame(long j) {
        if (this.f245252h) {
            long j2 = j / TimeUtil.SECOND_TO_US;
            long j3 = this.f245249e;
            if (j3 > 0) {
                long j4 = j2 - j3;
                int i = this.f245250f + 1;
                this.f245250f = i;
                if (j4 > this.f245251g) {
                    double d = ((double) (i * 1000)) / ((double) j4);
                    if (d >= 60.0d) {
                        d = 60.0d;
                    }
                    this.f245249e = j2;
                    this.f245250f = 0;
                    this.f245254j = d;
                    C84002a aVar = this.f245253i;
                    if (aVar != null) {
                        AppBrandPerformanceManager.C83989b.C83990a aVar2 = (AppBrandPerformanceManager.C83989b.C83990a) aVar;
                        if (Math.round(AppBrandPerformanceManager.C83989b.this.f245211f) != Math.round(d)) {
                            AppBrandPerformanceManager.C83989b.this.f245211f = d;
                            AppBrandPerformanceManager.m103496e(AppBrandPerformanceManager.C83989b.this.f245209d, 303, Math.round(AppBrandPerformanceManager.C83989b.this.f245211f) + " fps");
                            AppBrandPerformanceManager.C83989b bVar = AppBrandPerformanceManager.C83989b.this;
                            C83997d.m103519b(bVar.f245210e, "Hardware", "FPS", bVar.f245211f);
                        }
                    }
                }
            } else {
                this.f245249e = j2;
            }
        }
        if (this.f245252h) {
            this.f245248d.postFrameCallback(this);
        }
    }
}
