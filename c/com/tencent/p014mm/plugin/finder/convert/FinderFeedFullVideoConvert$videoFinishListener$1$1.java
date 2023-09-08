package com.tencent.p014mm.plugin.finder.convert;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import mf1.C10786a1;
import mf1.C10885z0;
import rs1.C13334ma;
import rs1.C13480ua;
import rs1.C13554z;
import rx3.C36570n;
import te3.C50687oi1;
import up1.C37521f;
import ve1.C14592p2;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$videoFinishListener$1$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedMegaVideoAnimPlayEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$videoFinishListener$1$1 */
public final class FinderFeedFullVideoConvert$videoFinishListener$1$1 extends IListener<FeedMegaVideoAnimPlayEvent> {

    /* renamed from: d */
    public final /* synthetic */ C14592p2 f12800d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFeedFullVideoConvert$videoFinishListener$1$1(MMActivity mMActivity, C14592p2 p2Var) {
        super(mMActivity);
        this.f12800d = p2Var;
    }

    public boolean callback(IEvent iEvent) {
        C4105m5<BaseFinderFeed> m5Var;
        LinearLayout linearLayout;
        FinderItem o;
        FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = (FeedMegaVideoAnimPlayEvent) iEvent;
        C87412m.m108594g(feedMegaVideoAnimPlayEvent, "event");
        if (feedMegaVideoAnimPlayEvent.f9160d.f9164d) {
            RecyclerView recyclerView = this.f12800d.f12554A;
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null) {
                C60905o oVar = (C60905o) C60898l.m71330b6(wxRecyclerAdapter, feedMegaVideoAnimPlayEvent.f9160d.f9161a, false, 2, (Object) null);
                C0740i2 i2Var = oVar != null ? (C0740i2) oVar.f173503E : null;
                BaseFinderFeed baseFinderFeed = i2Var instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var : null;
                boolean isPostFinish = (baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null) ? false : o.isPostFinish();
                if (oVar != null) {
                    C39818r rVar = C39818r.f106831a;
                    Context context = oVar.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    C10786a1 a1Var = (C10786a1) rVar.mo62443b(context).mo75002a(C10786a1.class);
                    a1Var.getClass();
                    a1Var.mo11061f3(oVar, new C10885z0(a1Var, oVar));
                }
                if (!((Boolean) ((C36570n) this.f12800d.f12576t).getValue()).booleanValue() && isPostFinish && oVar != null) {
                    C39818r rVar2 = C39818r.f106831a;
                    Context context2 = oVar.f173499A;
                    C87412m.m108593f(context2, "holder.context");
                    C13334ma maVar = (C13334ma) rVar2.mo62443b(context2).mo75002a(C13334ma.class);
                    maVar.getClass();
                    C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
                    if (!(oi12 != null && oi12.f139196d == 1)) {
                        Context context3 = oVar.f173499A;
                        C87412m.m108593f(context3, "holder.context");
                        C13554z zVar = (C13554z) rVar2.mo62443b(context3).mo62449e(C13554z.class);
                        if (!(zVar != null && zVar.f38450t)) {
                            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_STAR_GUIDE_DIALOG_SHOW_COUNT_INT_SYNC, 0);
                            C37521f.f99374d.getClass();
                            if (C37521f.f99550w7.mo60266n().intValue() != 0 && j <= 0) {
                                C85801v1 i = C86709a0.m107535s().mo121142i();
                                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_STAR_GUIDE_TIPS_COUNT_INT_SYNC;
                                int j2 = i.mo119689j(aVar, 0);
                                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_STAR_GUIDE_TIPS_LAST_SHOW_TIME_LONG_SYNC;
                                long G = i2.mo119673G(aVar2, 0);
                                long G2 = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_LAST_SHOW_TIME_LONG_SYNC, 0);
                                long c = C31543z5.m39453c() - G;
                                long c2 = C31543z5.m39453c() - G2;
                                View D = oVar.mo85812D(C0966R.C0970id.f26);
                                long j3 = C37521f.f99541v7.mo60266n().intValue() == 0 ? 86400000 : 300000;
                                if (j2 < 1 && c > j3 && c2 > j3) {
                                    Context context4 = oVar.f173499A;
                                    C87412m.m108593f(context4, "holder.context");
                                    FinderLikeGuideUIC finderLikeGuideUIC = (FinderLikeGuideUIC) rVar2.mo62443b(context4).mo62449e(FinderLikeGuideUIC.class);
                                    if (!(finderLikeGuideUIC == null || (linearLayout = finderLikeGuideUIC.f18758d) == null)) {
                                        linearLayout.setVisibility(8);
                                    }
                                    Context context5 = oVar.f173499A;
                                    C87412m.m108593f(context5, "holder.context");
                                    C13480ua uaVar = (C13480ua) rVar2.mo62443b(context5).mo62449e(C13480ua.class);
                                    if (!(uaVar == null || (m5Var = uaVar.f38200d) == null)) {
                                        m5Var.mo4985a();
                                    }
                                    View D2 = oVar.mo85812D(C0966R.C0970id.e6y);
                                    if (D2 != null) {
                                        C9556a aVar3 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                        aVar3.mo10233c(8);
                                        View view = D2;
                                        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderStarActionGuideUIC", "showStarGuideTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderStarActionGuideUIC", "showStarGuideTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                    Context context6 = oVar.f173499A;
                                    C87412m.m108593f(context6, "holder.context");
                                    C4105m5<BaseFinderFeed> m5Var2 = new C4105m5<>(context6, (C4105m5.C4106a) null, 2, (C8480h) null);
                                    m5Var2.f18267q = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                                    m5Var2.f18261h.setText(m5Var2.f18259f.getString(C0966R.string.m_c));
                                    m5Var2.f18260g = true;
                                    m5Var2.f18261h.setTextSize(0, oVar.f173499A.getResources().getDimension(C0966R.dimen.f3879hn));
                                    C87412m.m108593f(D, "anchor");
                                    m5Var2.mo4987c(D);
                                    maVar.f37825d = m5Var2;
                                    m5Var2.mo4986b();
                                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j2 + 1));
                                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(C31543z5.m39453c()));
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
