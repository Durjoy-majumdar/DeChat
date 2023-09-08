package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import di3.C86312j;
import dp1.C7433e1;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import nj3.C76875f0;
import rx3.C13598b0;
import tf0.C64916p1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "userName", "Lrx3/b0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$getMoreMenuItemSelectedListener$1$onMMMenuItemSelected$6 */
public final class C3405x28461506 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f16027d;

    /* renamed from: e */
    public final /* synthetic */ MenuItem f16028e;

    /* renamed from: f */
    public final /* synthetic */ BaseFinderFeed f16029f;

    /* renamed from: g */
    public final /* synthetic */ int f16030g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3405x28461506(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter, MenuItem menuItem, BaseFinderFeed baseFinderFeed, int i) {
        super(1);
        this.f16027d = likedTimelinePresenter;
        this.f16028e = menuItem;
        this.f16029f = baseFinderFeed;
        this.f16030g = i;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "userName");
        String str2 = str;
        ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76652BO(this.f16027d.f15975d, str2, (C76875f0) this.f16028e, this.f16029f.mo3513o(), (C32226l<? super List<String>, C13598b0>) null);
        C7433e1.f25622a.mo8575d(this.f16027d.f15975d, str, this.f16029f.getItemId(), this.f16030g);
        return C13598b0.f38549a;
    }
}
