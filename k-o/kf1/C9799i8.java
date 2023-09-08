package kf1;

import ak1.C0075i;
import ak1.C54067f0;
import android.view.View;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import ef1.C58556f;
import ef1.C58563g;
import fo1.C8178c;
import gy3.C87412m;
import ht1.C8777j5;
import rs1.C13442s8;
import zt3.C119157j;

/* renamed from: kf1.i8 */
public final class C9799i8 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public boolean f30335a = true;

    /* renamed from: b */
    public final /* synthetic */ C9745g8 f30336b;

    /* renamed from: kf1.i8$a */
    public static final class C9800a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9745g8 f30337d;

        public C9800a(C9745g8 g8Var) {
            this.f30337d = g8Var;
        }

        public final void run() {
            BaseFeedLoader.requestLoadMore$default(this.f30337d.f30199f.mo2583x(), false, 1, (Object) null);
        }
    }

    public C9799i8(C9745g8 g8Var) {
        this.f30336b = g8Var;
    }

    /* renamed from: a */
    public void mo3747a(int i) {
        if (this.f30335a && i > 0) {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f30336b.f30197d).mo75002a(C13442s8.class);
            C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C58556f j3 = ((C13442s8) a).mo12854j3(-1);
            if (j3 != null) {
                C9745g8 g8Var = this.f30336b;
                C58563g gVar = new C58563g(j3);
                RecyclerView recyclerView = g8Var.f30201h;
                if (recyclerView != null) {
                    gVar.onScrollStateChanged(recyclerView, 5);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            this.f30335a = false;
        }
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        Log.m105924i(this.f30336b.f30198e, "onRequestLoadMore");
        ((C119157j) C119157j.f356862d).mo183875f(new C9800a(this.f30336b));
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        String str = this.f30336b.f30198e;
        Log.m105924i(str, "[onLoadMoreEnd] reason=" + cVar);
        if (!cVar.f24951f) {
            RecyclerView recyclerView = this.f30336b.f30201h;
            if (recyclerView == null) {
                C87412m.m108603p("recyclerView");
                throw null;
            } else if (recyclerView.getChildCount() > 0) {
                RecyclerView recyclerView2 = this.f30336b.f30201h;
                if (recyclerView2 == null) {
                    C87412m.m108603p("recyclerView");
                    throw null;
                } else if (recyclerView2 != null) {
                    View childAt = recyclerView2.getChildAt(recyclerView2.getChildCount() - 1);
                    RecyclerView recyclerView3 = this.f30336b.f30201h;
                    if (recyclerView3 != null) {
                        RecyclerView.C16631z F0 = recyclerView3.mo17021F0(childAt);
                        Integer valueOf = F0 != null ? Integer.valueOf(F0.f44859i) : null;
                        if (childAt.getHeight() > 0 && ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8))) {
                            C9745g8 g8Var = this.f30336b;
                            g8Var.getClass();
                            int height = C8178c.C8179a.m8259a(g8Var).getDisplayMetrics().heightPixels - childAt.getHeight();
                            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30336b.f30200g;
                            if (refreshLoadMoreLayout != null) {
                                refreshLoadMoreLayout.setExtraOverScrollFooterDx(height / 3);
                                String str2 = this.f30336b.f30198e;
                                Log.m105924i(str2, "extraOverScrollFooterDx=" + height);
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
        }
        if (cVar.f24954i && cVar.f24951f) {
            C9745g8 g8Var2 = this.f30336b;
            RecyclerView recyclerView4 = g8Var2.f30201h;
            if (recyclerView4 != null) {
                g8Var2.getClass();
                RecyclerView.LayoutManager layoutManager = recyclerView4.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() + 1;
                String str3 = g8Var2.f30198e;
                Log.m105924i(str3, "[smoothScrollToNextPosition] nextPosition=" + C);
                recyclerView4.post(new C9859m8(recyclerView4, C));
                return;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: e */
    public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        RecyclerView recyclerView = this.f30336b.f30201h;
        if (recyclerView != null) {
            C8777j5.C8778a.m8602c(j5Var, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "1", C0075i.EVENT_ON_REFRESH, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }
}
