package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import er1.C58784w3;
import er1.C7888v2;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import wc3.C15133e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lnj3/e0;", "kotlin.jvm.PlatformType", "menu", "Lrx3/b0;", "onCreateMMMenu", "(Lnj3/e0;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getCreateQuickMoreMenuListener$1 */
public final class C3397xd17b6a0d implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f16009d;

    /* renamed from: e */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16010e;

    /* renamed from: f */
    public final /* synthetic */ C77407n f16011f;

    public C3397xd17b6a0d(BaseFinderFeed baseFinderFeed, FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, C77407n nVar) {
        this.f16009d = baseFinderFeed;
        this.f16010e = likedTimelinePresenter;
        this.f16011f = nVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (!this.f16009d.mo3513o().isNotShareConversation() && !C58784w3.f168295a.mo83855A0(this.f16009d.mo3513o().getFeedObject())) {
            FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f16010e;
            C15133e0 e0Var2 = likedTimelinePresenter.f15977f;
            MMActivity mMActivity = likedTimelinePresenter.f15975d;
            C87412m.m108593f(e0Var, "menu");
            e0Var2.el0(mMActivity, e0Var, this.f16011f);
            C7888v2.C7889a aVar = C7888v2.f26513a;
            int itemCount = this.f16010e.f15977f.getItemCount();
            aVar.getClass();
            C7888v2.C7889a.f26516c = itemCount;
        }
    }
}
