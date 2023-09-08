package tm3;

import android.view.View;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: tm3.e */
public final class C78056e extends BaseStateAction {

    /* renamed from: a */
    public final C32226l<View, C13598b0> f228797a;

    /* renamed from: b */
    public final C32226l<View, C13598b0> f228798b;

    /* renamed from: c */
    public final WxRecyclerView f228799c;

    public C78056e(C32226l<? super View, C13598b0> lVar, C32226l<? super View, C13598b0> lVar2, WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(lVar, "addHeader");
        C87412m.m108594g(lVar2, "removeHeader");
        C87412m.m108594g(wxRecyclerView, "parentView");
        this.f228797a = lVar;
        this.f228798b = lVar2;
        this.f228799c = wxRecyclerView;
    }
}
