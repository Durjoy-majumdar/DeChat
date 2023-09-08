package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C47269o0;
import nj3.C76875f0;
import qo3.C77407n;
import wc3.C15133e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "menuItem", "", "index", "Lrx3/b0;", "onMMMenuItemLongSelected", "(Landroid/view/MenuItem;I)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemLongSelectedListener$1 */
public final class C3400x91c4d978 implements C47269o0 {

    /* renamed from: a */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16016a;

    /* renamed from: b */
    public final /* synthetic */ C77407n f16017b;

    public C3400x91c4d978(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, C77407n nVar) {
        this.f16016a = likedTimelinePresenter;
        this.f16017b = nVar;
    }

    /* renamed from: a */
    public final void mo2584a(MenuItem menuItem, int i) {
        C15133e0 e0Var = this.f16016a.f15977f;
        C77407n nVar = this.f16017b;
        C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        boolean YM = e0Var.mo14089YM(nVar, (C76875f0) menuItem);
        String str = this.f16016a.f15983o;
        Log.m105924i(str, "getMoreMenuItemLongSelectedListener :" + YM);
    }
}
