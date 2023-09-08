package kf1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLbsStreamListUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
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
import j20.C117292a;
import jq3.C60898l;
import k20.C9556a;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: kf1.n3 */
public final class C9866n3 extends C9753h {

    /* renamed from: u */
    public final String f30446u;

    /* renamed from: v */
    public final String f30447v = "Finder.LbsStreamFeedUIContract.LbsStreamFeedViewCallback";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9866n3(MMActivity mMActivity, int i, int i2, String str) {
        super(mMActivity, i, i2, false, 0, 24, (C8480h) null);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f30446u = str;
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
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
            C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6);
            if (i2Var instanceof BaseFinderFeed) {
                String str = this.f30447v;
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
                intent.putExtra("KEY_UI_TITLE", this.f30446u);
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                Context context2 = view.getContext();
                C87412m.m108593f(context2, "view.context");
                ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                Intent intent2 = !(context2 instanceof Activity) ? intent : null;
                if (intent2 != null) {
                    intent2.addFlags(268435456);
                }
                intent.setClass(context2, FinderLbsStreamListUI.class);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                Context context3 = context2;
                C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterLbsStreamListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context3, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterLbsStreamListUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                Context context4 = view.getContext();
                C87412m.m108593f(context4, "view.context");
                C13442s8 f = aVar.mo12873f(context4);
                if (f != null) {
                    C49712hj1 q3 = f.mo12861q3();
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    C58417y0.Qx0((C58417y0) c, q3, baseFinderFeed.mo3513o().getId(), this.f30220j.getRecyclerView(), 0, (String) null, 24, (Object) null);
                    C7450q.f25643a.mo8594b(q3, i2Var, 18);
                }
            }
        }
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: X0 */
    public boolean mo10354X0() {
        return false;
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
