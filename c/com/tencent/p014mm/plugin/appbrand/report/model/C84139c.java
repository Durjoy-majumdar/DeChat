package com.tencent.p014mm.plugin.appbrand.report.model;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.report.C84119j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.appbrand.report.model.c */
public class C84139c {

    /* renamed from: a */
    public final C84119j0 f245632a;

    /* renamed from: b */
    public volatile String f245633b;

    /* renamed from: c */
    public volatile String f245634c;

    /* renamed from: d */
    public volatile AppBrandRuntime f245635d;

    /* renamed from: e */
    public volatile long f245636e = 0;

    /* renamed from: f */
    public volatile long f245637f = 0;

    /* renamed from: g */
    public final LinkedList<Runnable> f245638g = new LinkedList<>();

    public C84139c(int i) {
        this.f245632a = new C84119j0("MicroMsg.AppBrandPageViewStatistics[" + i + "]");
    }

    /* renamed from: c */
    public long mo116801c() {
        if (!(1 == this.f245632a.f245583a.get())) {
            int i = this.f245632a.f245583a.get();
            if (!(-1 == i || 2 == i)) {
                return 0;
            }
        }
        long j = this.f245632a.f245588f;
        long j2 = this.f245636e;
        long j3 = this.f245637f;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 <= 0) {
            if (mo116802d()) {
                return 0;
            }
            Log.m105925i("MicroMsg.AppBrandPageViewStatistics", "foregroundMs invalid(%d), loadStart %d, loadCost %d, [%s/%s], runtimeIsFinishing=%b", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), this.f245634c, this.f245633b, Boolean.valueOf(this.f245635d != null && this.f245635d.f238117P));
            if (j2 > 0 && j3 > 0 && i2 == 0) {
                return Util.nowMilliSecond() - j2;
            }
        }
        return Math.max(0, j);
    }

    /* renamed from: d */
    public boolean mo116802d() {
        return this.f245636e > 0 && this.f245637f <= 0;
    }

    /* renamed from: e */
    public void mo116803e() {
        if (this.f245632a.mo116787a()) {
            while (!this.f245638g.isEmpty()) {
                this.f245638g.pollFirst().run();
            }
        }
    }

    /* renamed from: f */
    public void mo116804f() {
        if (this.f245636e > 0) {
            C84119j0 j0Var = this.f245632a;
            boolean z = j0Var.f245583a.getAndSet(1) != 1;
            Log.m105919d("Luggage.StayingRecorder", "%s toForeground, changed:%b", j0Var.f245587e, Boolean.valueOf(z));
            if (z) {
                j0Var.f245584b.exit();
                C84119j0.C84123d dVar = j0Var.f245585c;
                j0Var.f245584b = dVar;
                dVar.getClass();
                dVar.f245591a = Util.nowMilliSecond();
            }
            if (z) {
                this.f245638g.clear();
            }
        }
    }

    /* renamed from: g */
    public void mo116805g(AppBrandRuntime appBrandRuntime) {
        this.f245634c = appBrandRuntime.f238147j;
        this.f245635d = appBrandRuntime;
    }
}
