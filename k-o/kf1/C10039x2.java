package kf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7450q;
import er1.C58684b;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60898l;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: kf1.x2 */
public final class C10039x2 extends C9753h {

    /* renamed from: u */
    public final String f30778u = "Finder.FinderFriendLikeFeedUIContract.ViewCallback";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10039x2(MMActivity mMActivity, int i, int i2, boolean z) {
        super(mMActivity, i, i2, z, 0, 16, (C8480h) null);
        C87412m.m108594g(mMActivity, "context");
    }

    /* renamed from: F0 */
    public /* bridge */ /* synthetic */ View mo9289F0() {
        return null;
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        ((FinderStaggeredConfig) this.f30224q).getClass();
        return new FinderStaggeredConfig.C3631b();
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        return this.f30224q.mo3666d(context);
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return "";
    }

    /* renamed from: Q0 */
    public void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        int c6 = i - ((C60898l) eVar).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
            C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6);
            if (i2Var instanceof BaseFinderFeed) {
                String str = this.f30778u;
                Log.m105924i(str, "onClick " + c6 + " id:" + ((BaseFinderFeed) i2Var).mo3513o().getId() + ", pos:" + c6);
                Intent intent = new Intent();
                BaseFeedLoader.saveCache$default(mo10348I0().f30175e, intent, c6, (C2780c) null, 4, (Object) null);
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                ((C58684b) C86312j.m106911c(C58684b.class)).gy0(context, intent);
                C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f30214d).mo75002a(C13442s8.class)).mo12861q3();
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0.Qx0((C58417y0) c, q3, i2Var.getItemId(), this.f30220j.getRecyclerView(), 0, (String) null, 24, (Object) null);
                C7450q.f25643a.mo8594b(q3, i2Var, 18);
            }
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return "";
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        return this.f30214d.findViewById(C0966R.C0970id.cjg);
    }
}
