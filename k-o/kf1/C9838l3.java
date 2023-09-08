package kf1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderHotWordFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7450q;
import er1.C58684b;
import gy3.C87412m;
import jq3.C60898l;
import os1.C62153d;
import rs1.C13442s8;
import rx3.C13604l;
import te3.C49712hj1;

/* renamed from: kf1.l3 */
public final class C9838l3 extends C9753h {

    /* renamed from: u */
    public final String f30397u;

    /* renamed from: v */
    public int f30398v;

    /* renamed from: w */
    public String f30399w;

    /* renamed from: x */
    public boolean f30400x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9838l3(com.tencent.p014mm.p136ui.MMActivity r9, int r10, int r11, boolean r12, int r13, gy3.C8480h r14) {
        /*
            r8 = this;
            r13 = r13 & 8
            if (r13 == 0) goto L_0x0007
            r12 = 0
            r4 = 0
            goto L_0x0008
        L_0x0007:
            r4 = r12
        L_0x0008:
            java.lang.String r12 = "context"
            gy3.C87412m.m108594g(r9, r12)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "Finder.FinderHotWordFeedUIContract.HotWordFeedViewCallback"
            r8.f30397u = r9
            java.lang.String r9 = ""
            r8.f30399w = r9
            r9 = 1
            r8.f30400x = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9838l3.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, int, gy3.h):void");
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
        Class cls = C58417y0.class;
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view, "view");
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) mo10348I0().f30175e.getListOfType(BaseFinderFeed.class).get(c6);
            FinderItem o = baseFinderFeed.mo3513o();
            String str = this.f30397u;
            Log.m105924i(str, "onClick " + c6 + " id:" + o.getId() + ", pos:" + c6);
            C13604l<Float, Float> X0 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).mo9104X0();
            Intent intent = new Intent();
            intent.putExtra("key_topic_type", this.f30398v);
            intent.putExtra("key_topic_title", this.f30399w);
            intent.putExtra("FEED_ID", o.getId());
            intent.putExtra("FEED_NONCE_ID", o.getFeedObject().objectNonceId);
            intent.putExtra("TITLE_WORDING", "");
            intent.putExtra("GET_REL_SCENE", 24);
            intent.putExtra("POI_LATITUDE", ((Number) X0.f38556e).floatValue());
            intent.putExtra("POI_LONGITUDE", ((Number) X0.f38555d).floatValue());
            BaseFeedLoader.saveCache$default(mo10348I0().f30175e, intent, c6, (C2780c) null, 4, (Object) null);
            BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
            C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderHotWordFeedLoader");
            ((FinderHotWordFeedLoader) baseFinderFeedLoader).f13625d = null;
            String str2 = this.f30397u;
            Log.m105924i(str2, "enterTimelineUI, fixPos:" + c6);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            aVar.mo12871c(this.f30214d, intent);
            ((C58684b) C86312j.m106911c(C58684b.class)).Ax0(this.f30214d, intent);
            ((C58417y0) C86312j.m106911c(cls)).Bx0(o.getId(), this.f30215e);
            Context context = view.getContext();
            C87412m.m108593f(context, "view.context");
            C13442s8 f = aVar.mo12873f(context);
            if (f != null) {
                C49712hj1 q3 = f.mo12861q3();
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0.Qx0((C58417y0) c, q3, o.getId(), getRecyclerView(), this.f30398v, (String) null, 16, (Object) null);
                C7450q.f25643a.mo8594b(q3, baseFinderFeed, 18);
            }
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: X0 */
    public boolean mo10354X0() {
        return this.f30400x;
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
