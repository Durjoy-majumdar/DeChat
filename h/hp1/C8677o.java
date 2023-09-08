package hp1;

import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.search.FinderFeedSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ef1.C58556f;
import ef1.C58563g;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import je1.C9320i4;
import pe3.C89349b;
import rs1.C13442s8;
import te3.C48727ak1;

/* renamed from: hp1.o */
public final class C8677o extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public boolean f27867a = true;

    /* renamed from: b */
    public final /* synthetic */ FinderFeedSearchUI f27868b;

    public C8677o(FinderFeedSearchUI finderFeedSearchUI) {
        this.f27868b = finderFeedSearchUI;
    }

    /* renamed from: a */
    public void mo3747a(int i) {
        if (this.f27867a && i > 0) {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f27868b).mo75002a(C13442s8.class);
            C87412m.m108593f(a, "UICProvider.of(this@Find…rReporterUIC::class.java)");
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C58556f j3 = ((C13442s8) a).mo12854j3(-1);
            if (j3 != null) {
                FinderFeedSearchUI finderFeedSearchUI = this.f27868b;
                C58563g gVar = new C58563g(j3);
                RecyclerView recyclerView = finderFeedSearchUI.f16470I;
                if (recyclerView != null) {
                    gVar.onScrollStateChanged(recyclerView, 5);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            this.f27867a = false;
        }
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        Log.m105924i("Finder.FinderFeedSearchUI", "onLoadMoreBegin");
        FinderFeedSearchUI finderFeedSearchUI = this.f27868b;
        int i2 = FinderFeedSearchUI.f16461g1;
        if (finderFeedSearchUI.mo3883S7()) {
            FinderFeedSearchUI finderFeedSearchUI2 = this.f27868b;
            if (finderFeedSearchUI2.f16506q != null) {
                if (finderFeedSearchUI2.f16482S0 != null) {
                    C86709a0.m107524d().mo123458d(finderFeedSearchUI2.f16482S0);
                }
                C9320i4 i4Var = new C9320i4(finderFeedSearchUI2.f16506q, finderFeedSearchUI2.f16507r, finderFeedSearchUI2.f16517z, finderFeedSearchUI2.f16510u, !finderFeedSearchUI2.mo3883S7() ? finderFeedSearchUI2.f16479R != null ? 10 : 14 : 2, ((C13442s8) C39818r.f106831a.mo62444c(finderFeedSearchUI2).mo75002a(C13442s8.class)).mo12861q3(), (C89349b) null, (C89349b) null, (C89349b) null, false, 0, 1664, (C8480h) null);
                finderFeedSearchUI2.f16482S0 = i4Var;
                i4Var.f29121r = finderFeedSearchUI2.f16464C;
                C86709a0.m107524d().mo123460f(finderFeedSearchUI2.f16482S0);
                C86709a0.m107524d().mo123455a(3820, finderFeedSearchUI2);
                finderFeedSearchUI2.mo3889Y7();
                return;
            }
            return;
        }
        FinderFeedSearchUI finderFeedSearchUI3 = this.f27868b;
        String str = finderFeedSearchUI3.f16506q;
        if (str == null) {
            return;
        }
        if (finderFeedSearchUI3.f16508s == 1) {
            finderFeedSearchUI3.mo3895f8(str, false);
        } else if (finderFeedSearchUI3.mo3894e8(false)) {
            finderFeedSearchUI3.mo3889Y7();
        } else {
            int i3 = finderFeedSearchUI3.f16509t;
            if (i3 == 1) {
                finderFeedSearchUI3.mo3882R7((C48727ak1) null, false);
            } else if (i3 == 0 && finderFeedSearchUI3.f16479R == null && finderFeedSearchUI3.f16467F) {
                Log.m105924i("Finder.FinderFeedSearchUI", "onLoadMoreBegin wait for onGetList");
                finderFeedSearchUI3.f16468G = true;
            } else {
                finderFeedSearchUI3.mo3890Z7();
            }
        }
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i("Finder.FinderFeedSearchUI", "onLoadMoreEnd");
    }
}
