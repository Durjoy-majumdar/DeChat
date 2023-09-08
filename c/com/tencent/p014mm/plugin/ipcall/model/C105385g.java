package com.tencent.p014mm.plugin.ipcall.model;

import a43.C103303a;
import a43.C103310i;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.plugin.ipcall.IPCallManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import j12.C108528a;
import l12.C109123c;
import m12.C109468b;
import m12.C109470c;
import s12.C13613d;
import s12.C13615l;
import s12.C36617j;
import s12.C63693h;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.ipcall.model.g */
public class C105385g extends C86301e {

    /* renamed from: d */
    public C105382f f313266d = new C105382f();

    /* renamed from: e */
    public C109468b f313267e = new C109468b();

    /* renamed from: f */
    public C109470c f313268f = new C109470c();

    /* renamed from: g */
    public C109123c f313269g;

    /* renamed from: h */
    public C105381e f313270h = new C105381e();

    /* renamed from: i */
    public IPCallManager f313271i = new IPCallManager();

    /* renamed from: j */
    public C13613d f313272j;

    /* renamed from: n */
    public C13615l f313273n;

    /* renamed from: o */
    public C36617j f313274o;

    /* renamed from: p */
    public C63693h f313275p;

    /* renamed from: q */
    public C103310i f313276q;

    /* renamed from: r */
    public C103303a f313277r;

    public static C63693h Ax0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f313275p == null) {
            xx0().f313275p = new C63693h(C97625j3.m125812b().mo105909x());
        }
        return xx0().f313275p;
    }

    public static C36617j Bx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f313274o == null) {
            xx0().f313274o = new C36617j(C97625j3.m125812b().mo105909x());
        }
        return xx0().f313274o;
    }

    public static C13615l Cx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f313273n == null) {
            xx0().f313273n = new C13615l(C97625j3.m125812b().mo105909x());
        }
        return xx0().f313273n;
    }

    public static C109470c Dx0() {
        return xx0().f313268f;
    }

    public static C103310i Ex0() {
        if (xx0().f313276q == null) {
            xx0().f313276q = new C103310i(MMApplicationContext.getContext());
        }
        return xx0().f313276q;
    }

    public static C105381e Fx0() {
        return xx0().f313270h;
    }

    public static C105382f Gx0() {
        return xx0().f313266d;
    }

    public static C13613d vx0() {
        C86709a0.m107523b().mo121108c();
        if (xx0().f313272j == null) {
            xx0().f313272j = new C13613d(C97625j3.m125812b().mo105909x());
        }
        return xx0().f313272j;
    }

    public static C108528a wx0() {
        C109123c cVar = xx0().f313269g;
        if (cVar != null) {
            return cVar.f326758b;
        }
        return null;
    }

    public static C105385g xx0() {
        return (C105385g) C86312j.m106911c(C105385g.class);
    }

    public static C109123c yx0() {
        return xx0().f313269g;
    }

    public static C109468b zx0() {
        return xx0().f313267e;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C105382f fVar = this.f313266d;
        fVar.f313252j.mo85899f();
        fVar.f313253n.mo85899f();
        fVar.f313254o.mo85899f();
        fVar.f313255p.mo85899f();
        fVar.f313256q.mo85899f();
        fVar.f313257r.mo85899f();
        fVar.f313258s.mo85899f();
        fVar.f313259t.mo85899f();
        fVar.f313252j.f173570d = fVar;
        fVar.f313254o.f173570d = fVar;
        fVar.f313255p.f173570d = fVar;
        fVar.f313257r.f173570d = fVar;
        fVar.f313259t.f173570d = fVar;
        fVar.f313253n.f325880h = fVar;
        fVar.f313256q.f325880h = fVar;
        C29060q qVar = fVar.f313264y;
        C86709a0.m107528h();
        C86709a0.m107529k().mo121126a(qVar);
        IPCallAddressUpdater.f19411a.alive();
        IPCallCoutryConfigUpdater.m46132a().f114948f.alive();
        if (IPCallFeedbackConfigUpdater.f313240c == null) {
            IPCallFeedbackConfigUpdater.f313240c = new IPCallFeedbackConfigUpdater();
        }
        IPCallFeedbackConfigUpdater.f313240c.f313242b.alive();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        if (this.f313270h.mo150086d()) {
            this.f313271i.mo150067j(0, 0);
        }
        C105382f fVar = this.f313266d;
        fVar.f313252j.mo85896c();
        fVar.f313253n.mo85896c();
        fVar.f313254o.mo85896c();
        fVar.f313255p.mo85896c();
        fVar.f313256q.mo85896c();
        fVar.f313258s.mo85896c();
        C29060q qVar = fVar.f313264y;
        C86709a0.m107528h();
        C86709a0.m107529k().mo121129d(qVar);
        IPCallAddressUpdater.f19411a.dead();
        IPCallCoutryConfigUpdater a = IPCallCoutryConfigUpdater.m46132a();
        a.getClass();
        C97625j3.m125815e().mo123470p(159, a);
        C97625j3.m125815e().mo123470p(160, a);
        a.f114948f.dead();
        if (IPCallFeedbackConfigUpdater.f313240c == null) {
            IPCallFeedbackConfigUpdater.f313240c = new IPCallFeedbackConfigUpdater();
        }
        IPCallFeedbackConfigUpdater.f313240c.f313242b.dead();
    }
}
