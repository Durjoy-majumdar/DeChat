package com.tencent.p014mm.plugin.appbrand.launching;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86300q;
import java.util.concurrent.atomic.AtomicBoolean;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.k4 */
public final class C83358k4 implements C86300q {

    /* renamed from: a */
    public final AtomicBoolean f243588a = new AtomicBoolean(false);

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.k4$a */
    public static final class C83359a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83358k4 f243589d;

        public C83359a(C83358k4 k4Var) {
            this.f243589d = k4Var;
        }

        public final void run() {
            this.f243589d.mo115632g(true);
        }
    }

    public C83358k4(C83350j4 j4Var) {
    }

    /* renamed from: a */
    public void mo63853a() {
        Log.m105924i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandProcessDied");
        mo115632g(false);
    }

    /* renamed from: b */
    public void mo63854b(String str) {
        Log.m105924i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onTriggerHalfScreenShare, token: " + str);
    }

    /* renamed from: c */
    public void mo63855c() {
        Log.m105924i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandUIEnter");
        mo115632g(true);
    }

    /* renamed from: d */
    public void mo63856d() {
        Log.m105924i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onStartAppBrandUI");
        C119179t tVar = C119157j.f356862d;
        C83359a aVar = new C83359a(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, false);
    }

    /* renamed from: e */
    public void mo63857e() {
        Log.m105924i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandPreconditionError");
        mo115632g(false);
    }

    /* renamed from: f */
    public void mo63858f(boolean z) {
        Log.m105924i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandUIExit, isFinish: " + z);
    }

    /* renamed from: g */
    public final void mo115632g(boolean z) {
        if (this.f243588a.compareAndSet(false, true)) {
            throw null;
        }
    }
}
