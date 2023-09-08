package zo1;

import android.content.res.Configuration;
import android.view.ViewGroup;
import bp1.C54515a;
import com.tencent.p014mm.plugin.finder.replay.bullet.LiveDanmakuView;
import d60.C58124b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C12252b;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import wo1.C66154f;
import wo1.C66155g;
import wo1.C66162t;
import xo1.C66382b;

/* renamed from: zo1.d */
public final class C66917d extends C12252b {

    /* renamed from: q */
    public final C58124b f192277q;

    /* renamed from: r */
    public final String f192278r = "ReplayBulletLazyPlugin";

    /* renamed from: s */
    public LiveDanmakuView f192279s;

    /* renamed from: t */
    public C66162t f192280t;

    /* renamed from: u */
    public C66154f f192281u;

    /* renamed from: v */
    public final C13601g f192282v = C36568h.m40985a(new C66918a(this));

    /* renamed from: zo1.d$a */
    public static final class C66918a extends C87413o implements C32224a<C66155g> {

        /* renamed from: d */
        public final /* synthetic */ C66917d f192283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66918a(C66917d dVar) {
            super(0);
            this.f192283d = dVar;
        }

        public Object invoke() {
            return new C66155g(3, 2, 6500, 12000, ((C54515a) this.f192283d.mo87696x0(C54515a.class)).f152829q * 1000, 3000, C66916b.f192276a, new C16351c(), 0, 256, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66917d(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192277q = bVar;
    }

    /* renamed from: O0 */
    public void mo12017O0(Configuration configuration) {
        LiveDanmakuView liveDanmakuView = this.f192279s;
        if (liveDanmakuView != null) {
            boolean g0 = mo82893g0();
            C66154f fVar = liveDanmakuView.f160794e;
            if (fVar != null) {
                fVar.mo90199g(g0);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        C66382b bVar = (C66382b) mo87685B0(C66382b.class);
        boolean z = false;
        if (bVar != null && bVar.f191101s) {
            z = true;
        }
        return !z;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C66154f fVar;
        LiveDanmakuView liveDanmakuView = this.f192279s;
        if (liveDanmakuView != null && (fVar = liveDanmakuView.f160794e) != null) {
            fVar.onDetach();
        }
    }
}
