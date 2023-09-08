package kf1;

import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dp1.C58353a0;
import dp1.C58403t;
import dp1.C7457x;
import gy3.C87412m;
import o40.C61926c;
import rs1.C13442s8;
import zt3.C119157j;

/* renamed from: kf1.p5 */
public final class C9925p5 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public boolean f30560a = true;

    /* renamed from: b */
    public final /* synthetic */ C9868n5 f30561b;

    /* renamed from: kf1.p5$a */
    public static final class C9926a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9868n5 f30562d;

        public C9926a(C9868n5 n5Var) {
            this.f30562d = n5Var;
        }

        public final void run() {
            C2829n nVar = this.f30562d.f30450b;
            nVar.getClass();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(nVar.f14111d);
            C58403t k3 = f != null ? f.mo12855k3(-1) : null;
            C58353a0 a0Var = k3 instanceof C58353a0 ? (C58353a0) k3 : null;
            if (a0Var != null) {
                C61926c.m72661F(C13442s8.f38061R0, new C7457x(a0Var));
            }
            BaseFeedLoader.requestLoadMore$default(nVar.mo2930e(), false, 1, (Object) null);
        }
    }

    /* renamed from: kf1.p5$b */
    public static final class C9927b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9868n5 f30563d;

        public C9927b(C9868n5 n5Var) {
            this.f30563d = n5Var;
        }

        public final void run() {
            this.f30563d.f30450b.requestRefresh();
        }
    }

    public C9925p5(C9868n5 n5Var) {
        this.f30561b = n5Var;
    }

    /* renamed from: a */
    public void mo3747a(int i) {
        if (this.f30560a && i > 0) {
            this.f30560a = false;
        }
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        ((C119157j) C119157j.f356862d).mo183875f(new C9926a(this.f30561b));
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C2829n nVar = this.f30561b.f30450b;
        nVar.getClass();
        nVar.mo2932g().mo10409c(false);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        ((C119157j) C119157j.f356862d).mo183875f(new C9927b(this.f30561b));
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f30561b.f30450b.mo2932g().mo10409c(false);
    }
}
