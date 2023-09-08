package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mm.plugin.appbrand.report.j0 */
public final class C84119j0 {

    /* renamed from: a */
    public final AtomicInteger f245583a;

    /* renamed from: b */
    public volatile C84121b f245584b;

    /* renamed from: c */
    public final C84123d f245585c = new C84123d((C84120a) null);

    /* renamed from: d */
    public final C84122c f245586d = new C84122c((C84120a) null);

    /* renamed from: e */
    public final String f245587e;

    /* renamed from: f */
    public long f245588f;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.j0$b */
    public interface C84121b {
        void exit();

        long getStartTime();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.j0$c */
    public final class C84122c implements C84121b {

        /* renamed from: a */
        public long f245589a;

        public C84122c(C84120a aVar) {
        }

        public void exit() {
            C84119j0 j0Var = C84119j0.this;
            Util.nowMilliSecond();
            j0Var.getClass();
        }

        public long getStartTime() {
            return this.f245589a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.j0$d */
    public final class C84123d implements C84121b {

        /* renamed from: a */
        public long f245591a;

        public C84123d(C84120a aVar) {
        }

        public void exit() {
            C84119j0.this.f245588f = Util.nowMilliSecond() - this.f245591a;
        }

        public long getStartTime() {
            return this.f245591a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.j0$e */
    public final class C84124e implements C84121b {
        public C84124e(C84119j0 j0Var, C84120a aVar) {
        }

        public void exit() {
        }

        public long getStartTime() {
            return 0;
        }
    }

    public C84119j0(String str) {
        this.f245587e = str;
        this.f245583a = new AtomicInteger(0);
        this.f245584b = new C84124e(this, (C84120a) null);
    }

    /* renamed from: a */
    public boolean mo116787a() {
        boolean z = this.f245583a.getAndSet(2) != 2;
        Log.m105919d("Luggage.StayingRecorder", "%s toBackground, changed:%b", this.f245587e, Boolean.valueOf(z));
        if (z) {
            this.f245584b.exit();
            C84122c cVar = this.f245586d;
            this.f245584b = cVar;
            cVar.getClass();
            cVar.f245589a = Util.nowMilliSecond();
        }
        return z;
    }
}
