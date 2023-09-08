package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.q */
public class C84650q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84624c0 f246960d;

    /* renamed from: e */
    public final /* synthetic */ C84624c0 f246961e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandLauncherRecentsList f246962f;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.q$a */
    public class C84651a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54248l.C54251c f246963d;

        public C84651a(C54248l.C54251c cVar) {
            this.f246963d = cVar;
        }

        public void run() {
            C84650q qVar = C84650q.this;
            C84624c0 c0Var = qVar.f246962f.f246853z;
            C84624c0 c0Var2 = qVar.f246961e;
            synchronized (c0Var) {
                c0Var.mo117332l(c0Var2.f246906d, c0Var2.f246907e);
            }
            MMHandlerThread.setCurrentPriority(-8);
            this.f246963d.mo75046b(C84650q.this.f246962f.f246852y);
            AppBrandLauncherRecentsList.m104195S(C84650q.this.f246962f);
        }
    }

    public C84650q(AppBrandLauncherRecentsList appBrandLauncherRecentsList, C84624c0 c0Var, C84624c0 c0Var2) {
        this.f246962f = appBrandLauncherRecentsList;
        this.f246960d = c0Var;
        this.f246961e = c0Var2;
    }

    public void run() {
        C54248l.C54251c a = C54248l.m60949a(new C84627d0(this.f246960d, this.f246961e), false);
        AppBrandLauncherRecentsList.C84605j jVar = this.f246962f.f246812B;
        int i = AppBrandLauncherRecentsList.C84605j.f246870b;
        jVar.mo117294a();
        AppBrandLauncherRecentsList.C84605j jVar2 = this.f246962f.f246812B;
        jVar2.sendMessage(jVar2.obtainMessage(1, new C84651a(a)));
    }
}
