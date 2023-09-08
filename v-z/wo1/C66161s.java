package wo1;

import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59673q2;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import mr1.C61575s;
import mr1.C61576t;
import qt1.C12931a;
import te3.C64689rq2;
import zo1.C66917d;

/* renamed from: wo1.s */
public final class C66161s implements C66162t {

    /* renamed from: a */
    public final WeakReference<C56032b> f190161a;

    public C66161s(WeakReference<C56032b> weakReference) {
        C87412m.m108594g(weakReference, "rReplayPluginLayout");
        this.f190161a = weakReference;
    }

    /* renamed from: a */
    public void mo90212a(int i) {
        C66917d dVar;
        C66162t tVar;
        C56032b p = mo90219p();
        if (p != null && (dVar = (C66917d) p.getPlugin(C66917d.class)) != null && (tVar = dVar.f192280t) != null) {
            ((C66146d) tVar).mo90212a(i);
        }
    }

    /* renamed from: b */
    public void mo78295b(float f) {
        C66917d dVar;
        C66162t tVar;
        C56032b p = mo90219p();
        if (p != null && (dVar = (C66917d) p.getPlugin(C66917d.class)) != null && (tVar = dVar.f192280t) != null) {
            ((C66146d) tVar).mo78295b(f);
        }
    }

    /* renamed from: c */
    public void mo78294c(C64689rq2 rq22, int i, int i2) {
        C66917d dVar;
        C66162t tVar;
        C56032b p = mo90219p();
        if (p != null && (dVar = (C66917d) p.getPlugin(C66917d.class)) != null && (tVar = dVar.f192280t) != null) {
            ((C66146d) tVar).mo78294c(rq22, i, i2);
        }
    }

    /* renamed from: d */
    public void mo78296d(C64689rq2 rq22, long j, long j2) {
        C56032b p = mo90219p();
        if (p != null) {
            C66917d dVar = (C66917d) p.getPlugin(C66917d.class);
        }
    }

    /* renamed from: e */
    public void mo77475e(C64689rq2 rq22) {
        C66917d dVar;
        C66162t tVar;
        C56032b p = mo90219p();
        if (p != null && (dVar = (C66917d) p.getPlugin(C66917d.class)) != null && (tVar = dVar.f192280t) != null) {
            ((C66146d) tVar).mo77475e(rq22);
        }
    }

    /* renamed from: f */
    public void mo78297f(C64689rq2 rq22, long j, C12931a aVar) {
        C56032b p = mo90219p();
        if (p != null) {
            C66917d dVar = (C66917d) p.getPlugin(C66917d.class);
        }
    }

    /* renamed from: g */
    public void mo78298g(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: h */
    public void mo78299h(C64689rq2 rq22) {
        C66917d dVar;
        C66162t tVar;
        C56032b p = mo90219p();
        if (p != null && (dVar = (C66917d) p.getPlugin(C66917d.class)) != null && (tVar = dVar.f192280t) != null) {
            ((C66146d) tVar).mo78299h(rq22);
        }
    }

    /* renamed from: i */
    public void mo78300i(C64689rq2 rq22, C61576t tVar) {
        C56032b p = mo90219p();
        if (p != null) {
            C66917d dVar = (C66917d) p.getPlugin(C66917d.class);
        }
    }

    /* renamed from: j */
    public void mo78301j(C64689rq2 rq22, C61575s sVar) {
        C66917d dVar;
        C66162t tVar;
        C56032b p = mo90219p();
        if (p != null && (dVar = (C66917d) p.getPlugin(C66917d.class)) != null && (tVar = dVar.f192280t) != null) {
            ((C66146d) tVar).mo78301j(rq22, sVar);
        }
    }

    /* renamed from: k */
    public void mo78302k(C64689rq2 rq22) {
        C56032b p = mo90219p();
        if (p != null) {
            C66917d dVar = (C66917d) p.getPlugin(C66917d.class);
        }
    }

    /* renamed from: l */
    public void mo78303l(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: m */
    public void mo78304m(C64689rq2 rq22, long j) {
        C56032b p = mo90219p();
        if (p != null) {
            C66917d dVar = (C66917d) p.getPlugin(C66917d.class);
        }
    }

    /* renamed from: n */
    public void mo78305n(C64689rq2 rq22, C59673q2 q2Var, int i) {
        C56032b p = mo90219p();
        if (p != null) {
            C66917d dVar = (C66917d) p.getPlugin(C66917d.class);
        }
    }

    /* renamed from: o */
    public void mo78306o(C59673q2 q2Var, C61575s sVar) {
    }

    /* renamed from: p */
    public final C56032b mo90219p() {
        C56032b bVar = this.f190161a.get();
        if (bVar == null) {
            Log.m105924i("VideoPlayLifecycleFullUIProxy", "getPluginLayout fail!");
        }
        return bVar;
    }
}
