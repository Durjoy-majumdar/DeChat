package rs1;

import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: rs1.q5 */
public final class C13377q5 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public boolean f37899a = true;

    /* renamed from: b */
    public final /* synthetic */ C13298k5 f37900b;

    /* renamed from: rs1.q5$a */
    public static final class C13378a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13298k5 f37901d;

        public C13378a(C13298k5 k5Var) {
            this.f37901d = k5Var;
        }

        public final void run() {
            BaseFeedLoader.requestLoadMore$default(this.f37901d.mo12749g3(), false, 1, (Object) null);
        }
    }

    /* renamed from: rs1.q5$b */
    public static final class C13379b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13298k5 f37902d;

        public C13379b(C13298k5 k5Var) {
            this.f37902d = k5Var;
        }

        public final void run() {
            this.f37902d.mo12751j3();
        }
    }

    public C13377q5(C13298k5 k5Var) {
        this.f37900b = k5Var;
    }

    /* renamed from: a */
    public void mo3747a(int i) {
        if (this.f37899a && i > 0) {
            this.f37899a = false;
        }
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        ((C119157j) C119157j.f356862d).mo183875f(new C13378a(this.f37900b));
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f37900b.mo12752k3(false);
    }

    /* renamed from: d */
    public void mo3680d(int i) {
        ((C119157j) C119157j.f356862d).mo183875f(new C13379b(this.f37900b));
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        this.f37900b.mo12752k3(false);
    }
}
