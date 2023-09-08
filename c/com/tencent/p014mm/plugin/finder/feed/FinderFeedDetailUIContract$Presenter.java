package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import jq3.C9500j;
import kf1.C9640c;
import kf1.C9707f;
import nj3.C76874e0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFeedDetailUIContract$Presenter */
public class FinderFeedDetailUIContract$Presenter extends C9640c {

    /* renamed from: r */
    public final boolean f13025r;

    /* renamed from: s */
    public final boolean f13026s;

    /* renamed from: t */
    public ArrayList<C0740i2> f13027t;

    /* renamed from: u */
    public final FinderFeedDetailUIContract$Presenter$feedChangeListener$1 f13028u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedDetailUIContract$Presenter(int i, MMActivity mMActivity, boolean z, boolean z2, boolean z3, int i2, C8480h hVar) {
        super(mMActivity, 0, 2, (C8480h) null);
        z = (i2 & 4) != 0 ? false : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        C87412m.m108594g(mMActivity, "context");
        this.f13025r = z;
        this.f13026s = z2;
        this.f13027t = new ArrayList<>();
        this.f13028u = new FinderFeedDetailUIContract$Presenter$feedChangeListener$1(this, C40008f.f107254d);
    }

    /* renamed from: G */
    public C0740i2 mo2486G(int i) {
        return mo2489a1();
    }

    /* renamed from: N0 */
    public void mo2487N0(C9707f fVar) {
        C87412m.m108594g(fVar, "callback");
        super.mo2487N0(fVar);
        this.f13028u.alive();
        ((FinderFeedMegaVideoBtnAnimUIC) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(FinderFeedMegaVideoBtnAnimUIC.class)).mo80031d3(fVar.getRecyclerView());
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new FinderFeedDetailUIContract$Presenter$buildItemCoverts$1(this);
    }

    /* renamed from: a1 */
    public final C0740i2 mo2489a1() {
        if (Util.isNullOrNil((List) this.f13027t)) {
            return null;
        }
        return this.f13027t.get(0);
    }

    /* renamed from: e */
    public int mo2490e(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C0740i2 a1 = mo2489a1();
        return a1 != null && (baseFinderFeed.getItemId() > a1.getItemId() ? 1 : (baseFinderFeed.getItemId() == a1.getItemId() ? 0 : -1)) == 0 ? 0 : -1;
    }

    /* renamed from: f0 */
    public DataBuffer<C0740i2> mo2491f0() {
        DataBuffer<C0740i2> dataBuffer;
        C0740i2 a1 = mo2489a1();
        if (a1 == null) {
            dataBuffer = new DataBuffer<>((ArrayList) null, 1, (C8480h) null);
        }
        return dataBuffer;
    }

    /* renamed from: n */
    public ArrayList<C0740i2> mo2492n() {
        return this.f13027t;
    }

    /* renamed from: n0 */
    public void mo2493n0() {
        C9707f fVar = this.f29964g;
        if (fVar != null) {
            fVar.mo5183d(this.f13027t);
        }
    }

    /* renamed from: o */
    public void mo2494o() {
    }

    public void onDetach() {
        super.onDetach();
        this.f13028u.dead();
    }

    public void requestRefresh() {
    }

    /* renamed from: t */
    public void mo2496t(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        if (this.f13026s) {
            e0Var.mo107135b(108, C0966R.string.f7944x1, C0966R.raw.icons_outlined_delete);
            MMActivity mMActivity = this.f29961d;
            C87412m.m108594g(mMActivity, "context");
            if (baseFinderFeed.mo3513o().isCommentClose() || !C58784w3.f168295a.mo83889N0()) {
                e0Var.mo107144g(107, mMActivity.getString(C0966R.string.d9v), C0966R.raw.icons_outlined_comment);
            } else {
                e0Var.mo107144g(106, mMActivity.getString(C0966R.string.d8r), C0966R.raw.icons_outlined_comment_close);
            }
        }
        super.mo2496t(baseFinderFeed, e0Var, nVar, oVar);
        String N = mo2546N();
        Log.m105924i(N, "createSecond MenumentionListSelected : " + baseFinderFeed.mo3513o().getMentionListSelected());
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return this.f13026s;
    }
}
