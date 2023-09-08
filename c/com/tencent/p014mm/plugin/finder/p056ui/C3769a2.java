package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import df1.C7322a;
import er1.C58739j4;
import er1.C58784w3;
import gy3.C87412m;
import ht1.C60172g4;
import kf1.C9713f2;
import rs1.C13442s8;
import up1.C37521f;
import up1.C65426w0;

/* renamed from: com.tencent.mm.plugin.finder.ui.a2 */
public final class C3769a2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgFeedDetailUI f17238d;

    /* renamed from: e */
    public final /* synthetic */ long f17239e;

    public C3769a2(FinderMsgFeedDetailUI finderMsgFeedDetailUI, long j) {
        this.f17238d = finderMsgFeedDetailUI;
        this.f17239e = j;
    }

    public final void run() {
        boolean z;
        FinderMsgFeedDetailUI finderMsgFeedDetailUI = this.f17238d;
        BaseFinderFeed baseFinderFeed = finderMsgFeedDetailUI.f16998y;
        if (baseFinderFeed != null) {
            long j = this.f17239e;
            C39622i0 a = C39818r.f106831a.mo62444c(finderMsgFeedDetailUI).mo75002a(C13442s8.class);
            C87412m.m108593f(a, "UICProvider.of(this@Find…rReporterUIC::class.java)");
            C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
            if (b != null) {
                b.mo8766a(new C7322a.C7323a(6, baseFinderFeed.getItemId()));
            }
            if (finderMsgFeedDetailUI.f16994u || C58784w3.f168295a.mo83897Q0(baseFinderFeed) || !C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l())) {
                z = false;
            } else {
                C37521f.f99374d.mo61176c0(2);
                z = true;
            }
            C9713f2 f2Var = finderMsgFeedDetailUI.f16991r;
            if (f2Var != null) {
                C56597e1 v = f2Var.mo10313v();
                if (v != null) {
                    C56597e1.m65265e(v, baseFinderFeed.mo3513o(), false, j, true, false, (C65426w0) null, z, 0, (CommentDrawerContract.CloseDrawerCallback) null, false, 0, 0, 0, 8114, (Object) null);
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
