package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import dp1.C7433e1;
import er1.C58736i1;
import er1.C58784w3;
import er1.C7853p2;
import fe1.C58969q;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import rs1.C13194da;
import z04.C112551y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lnj3/e0;", "kotlin.jvm.PlatformType", "menu", "Lrx3/b0;", "onCreateMMMenu", "(Lnj3/e0;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateSecondMoreMenuListener$1 */
public final class C3398x66d0f71e implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16012d;

    /* renamed from: e */
    public final /* synthetic */ BaseFinderFeed f16013e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f16014f;

    public C3398x66d0f71e(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, BaseFinderFeed baseFinderFeed, C77407n nVar) {
        this.f16012d = likedTimelinePresenter;
        this.f16013e = baseFinderFeed;
        this.f16014f = nVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        String str;
        FinderItem o;
        FinderObject feedObject;
        C58736i1 i1Var = C58736i1.f168173a;
        MMActivity mMActivity = this.f16012d.f15975d;
        C87412m.m108593f(e0Var, "menu");
        i1Var.mo83660f(mMActivity, e0Var, this.f16013e);
        FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f16012d;
        BaseFinderFeed baseFinderFeed = this.f16013e;
        likedTimelinePresenter.getClass();
        C58969q l = baseFinderFeed.mo3507l();
        String str2 = l != null ? l.field_username : null;
        C66785b bVar = C66785b.f191882e;
        if (C112551y.m153810j(str2, bVar.mo90662O5(), false, 2, (Object) null)) {
            i1Var.mo83661g(this.f16012d.f15975d, e0Var, this.f16013e);
        }
        BaseFinderFeed baseFinderFeed2 = this.f16013e;
        boolean B = (baseFinderFeed2 == null || (o = baseFinderFeed2.mo3513o()) == null || (feedObject = o.getFeedObject()) == null) ? false : C58784w3.f168295a.mo83857B(feedObject);
        if (this.f16013e.mo3513o().isLongVideo() && !B) {
            FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = this.f16012d;
            FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = likedTimelinePresenter2.f15984p;
            if (likedTimelineViewCallback != null) {
                str = C13194da.f37515v.mo12692a(likedTimelineViewCallback.getRecyclerView());
            } else {
                str = likedTimelinePresenter2.f15975d.getString(C0966R.string.grf);
                C87412m.m108593f(str, "context.getString(R.stri…ga_video_play_speed_text)");
            }
            e0Var.mo107144g(116, str, C0966R.raw.icons_outlined_play_control_2);
        }
        C58784w3 w3Var = C58784w3.f168295a;
        if (w3Var.mo83980y0(this.f16013e.mo3513o())) {
            e0Var.mo107151k(109, w3Var.mo83909X(this.f16013e), C0966R.raw.icons_outlined_bgm_play, !this.f16013e.mo3513o().isPostFinish() || this.f16013e.mo3513o().isPostFailed() || w3Var.mo83979y(this.f16013e.mo3513o().getFeedObject()));
        }
        C7853p2.f26439a.mo8958a(this.f16012d.f15975d, this.f16013e, e0Var, this.f16014f, 200);
        i1Var.mo83655a(this.f16012d.f15975d, e0Var, this.f16013e);
        i1Var.mo83663i(this.f16012d.f15975d, this.f16013e, e0Var);
        FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter3 = this.f16012d;
        BaseFinderFeed baseFinderFeed3 = this.f16013e;
        likedTimelinePresenter3.getClass();
        C58969q l2 = baseFinderFeed3.mo3507l();
        if (!C112551y.m153810j(l2 != null ? l2.field_username : null, bVar.mo90662O5(), false, 2, (Object) null)) {
            e0Var.mo107144g(101, this.f16012d.f15975d.getString(C0966R.string.gvt), C0966R.raw.icons_outlined_report_problem);
        }
        i1Var.mo83659e(this.f16012d.f15975d, this.f16013e, e0Var);
        i1Var.mo83658d(this.f16012d.f15975d, this.f16013e, e0Var);
        i1Var.mo83657c(this.f16012d.f15975d, this.f16013e, e0Var);
        C7433e1.f25622a.mo8573b(e0Var);
    }
}
