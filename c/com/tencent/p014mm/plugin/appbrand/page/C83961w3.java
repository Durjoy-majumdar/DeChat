package com.tencent.p014mm.plugin.appbrand.page;

import android.content.res.Configuration;
import android.view.View;
import bt0.C79808b;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import rq0.C90084c;
import rq0.C90091i;
import tq0.C90569a;
import tq0.C90572d;

/* renamed from: com.tencent.mm.plugin.appbrand.page.w3 */
public class C83961w3 implements C90091i, C90084c {

    /* renamed from: a */
    public final C83780d1 f245111a;

    /* renamed from: b */
    public final C90572d f245112b;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.w3$a */
    public static final class C83962a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83961w3 f245113d;

        public C83962a(C83961w3 w3Var) {
            this.f245113d = w3Var;
        }

        public final void run() {
            this.f245113d.f245112b.mo117648a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.w3$b */
    public static final class C83963b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C90569a f245114d;

        /* renamed from: e */
        public final /* synthetic */ C83961w3 f245115e;

        /* renamed from: f */
        public final /* synthetic */ Configuration f245116f;

        public C83963b(C90569a aVar, C83961w3 w3Var, Configuration configuration) {
            this.f245114d = aVar;
            this.f245115e = w3Var;
            this.f245116f = configuration;
        }

        public final void run() {
            this.f245114d.mo117652e(this.f245115e.f245111a.f244577X.shouldInLargeScreenCompatMode(), this.f245116f.orientation);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.w3$c */
    public static final class C83964c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83961w3 f245117d;

        public C83964c(C83961w3 w3Var) {
            this.f245117d = w3Var;
        }

        public final void run() {
            this.f245117d.f245112b.mo117651d();
        }
    }

    public C83961w3(C83780d1 d1Var, C90572d dVar) {
        C87412m.m108594g(d1Var, "page");
        C87412m.m108594g(dVar, "H");
        this.f245111a = d1Var;
        this.f245112b = dVar;
    }

    /* renamed from: a */
    public void mo116581a() {
        C83780d1 d1Var = this.f245111a;
        if (MMHandlerThread.isMainThread()) {
            this.f245112b.mo117648a();
            return;
        }
        View contentView = d1Var.getContentView();
        if (contentView != null) {
            contentView.post(new C83962a(this));
        }
    }

    /* renamed from: b */
    public void mo116449b() {
        this.f245112b.mo117649b();
    }

    /* renamed from: c */
    public void mo116450c() {
        this.f245112b.mo117650c();
        C90572d dVar = this.f245112b;
        C90569a aVar = dVar instanceof C90569a ? (C90569a) dVar : null;
        if (aVar != null) {
            aVar.mo117652e(this.f245111a.f244577X.shouldInLargeScreenCompatMode(), this.f245111a.getContext().getResources().getConfiguration().orientation);
        }
    }

    /* renamed from: d */
    public void mo116582d() {
        C83780d1 d1Var = this.f245111a;
        if (MMHandlerThread.isMainThread()) {
            this.f245112b.mo117651d();
            return;
        }
        View contentView = d1Var.getContentView();
        if (contentView != null) {
            contentView.post(new C83964c(this));
        }
    }

    /* renamed from: e */
    public boolean mo116583e() {
        return this.f245112b.getCurrentState() == C90572d.C90573a.HIDDEN;
    }

    /* renamed from: h */
    public void mo116451h(C79808b bVar) {
        C87412m.m108594g(bVar, "actionBar");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        C90572d dVar = this.f245112b;
        C90569a aVar = dVar instanceof C90569a ? (C90569a) dVar : null;
        if (aVar != null) {
            this.f245111a.mo116274i0(new C83963b(aVar, this, configuration));
        }
    }

    public void onDestroy() {
    }
}
