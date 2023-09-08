package kf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import de1.C7267b;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7450q;
import ef1.C58556f;
import er1.C58684b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import jm2.C117361f;
import jq3.C60898l;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: kf1.y3 */
public final class C10054y3 extends C9753h {

    /* renamed from: u */
    public final Fragment f30812u;

    /* renamed from: v */
    public final String f30813v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10054y3(com.tencent.p014mm.p136ui.MMActivity r9, androidx.fragment.app.Fragment r10, int r11, int r12, boolean r13, int r14, gy3.C8480h r15) {
        /*
            r8 = this;
            r14 = r14 & 16
            if (r14 == 0) goto L_0x0007
            r13 = 0
            r4 = 0
            goto L_0x0008
        L_0x0007:
            r4 = r13
        L_0x0008:
            java.lang.String r13 = "context"
            gy3.C87412m.m108594g(r9, r13)
            java.lang.String r13 = "fragment"
            gy3.C87412m.m108594g(r10, r13)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f30812u = r10
            java.lang.String r9 = "Finder.FinderLikeFeedUIContract.LikeFeedViewCallback"
            r8.f30813v = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C10054y3.<init>(com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, gy3.h):void");
    }

    /* renamed from: F0 */
    public View mo9289F0() {
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
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: Q0 */
    public void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i) {
        RecyclerView.C16613e<?> eVar2 = eVar;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view, "view");
        C117361f.INSTANCE.mo182041q(540999705);
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
            C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6);
            if (i2Var instanceof BaseFinderFeed) {
                String str = this.f30813v;
                StringBuilder sb = new StringBuilder();
                sb.append("onClick ");
                sb.append(c6);
                sb.append(" id:");
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                sb.append(baseFinderFeed.mo3513o().getId());
                sb.append(", pos:");
                sb.append(c6);
                Log.m105924i(str, sb.toString());
                Intent intent = new Intent();
                BaseFeedLoader.saveCache$default(mo10348I0().f30175e, intent, c6, (C2780c) null, 4, (Object) null);
                C13442s8.f38060Q0.mo12871c(this.f30214d, intent);
                C7287o.m7447c(intent, view, 0, false, false, C7267b.Ax0(C7267b.f25328d, getRecyclerView(), baseFinderFeed.mo3513o().getId(), mo10348I0().f30175e.getDataListJustForAdapter(), (C32226l) null, 8, (Object) null), 14, (Object) null);
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                ((C58684b) C86312j.m106911c(C58684b.class)).Nx0(context, intent);
                C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62445d(this.f30812u).mo75002a(C13442s8.class)).mo12861q3();
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                long itemId = i2Var.getItemId();
                RecyclerView recyclerView = this.f30220j.getRecyclerView();
                String jSONObject = ((BaseFinderFeed) i2Var).mo3471E().toString();
                C87412m.m108593f(jSONObject, "feed.udfKv.toString()");
                C58417y0.Qx0((C58417y0) c, q3, itemId, recyclerView, 0, jSONObject, 8, (Object) null);
                C7450q.f25643a.mo8594b(q3, i2Var, 18);
            }
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
        if (mo10348I0().f30175e.getSize() <= this.f30219i * 3) {
            BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
            C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader");
            if (((FinderLikedFeedLoader) baseFinderFeedLoader).f13709f) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30220j;
                int i = RefreshLoadMoreLayout.f165599Q0;
                refreshLoadMoreLayout.mo82438D(false);
            }
        }
        BaseFinderFeedLoader baseFinderFeedLoader2 = mo10348I0().f30175e;
        C87412m.m108592e(baseFinderFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader");
        FinderLikedFeedLoader finderLikedFeedLoader = (FinderLikedFeedLoader) baseFinderFeedLoader2;
        int i2 = finderLikedFeedLoader.f13708e - 1;
        finderLikedFeedLoader.f13708e = i2;
        View view = this.f30225r;
        TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.f357845c22) : null;
        if (textView != null) {
            textView.setText(this.f30214d.getResources().getString(C0966R.string.d8j, new Object[]{Integer.valueOf(i2)}));
        }
    }

    /* renamed from: d */
    public void mo9297d(ArrayList<C0740i2> arrayList) {
        C58556f j3;
        C87412m.m108594g(arrayList, "data");
        super.mo9297d(arrayList);
        C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(this.f30812u).mo62449e(C13442s8.class);
        if (s8Var != null && (j3 = s8Var.mo12854j3(-1)) != null) {
            j3.mo83455c(getRecyclerView());
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        return this.f30214d.findViewById(C0966R.C0970id.cjg);
    }
}
