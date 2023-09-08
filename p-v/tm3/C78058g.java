package tm3;

import android.view.View;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: tm3.g */
public final class C78058g extends BaseStateAction {

    /* renamed from: a */
    public final C32226l<View, C13598b0> f228800a;

    /* renamed from: b */
    public final C32226l<View, C13598b0> f228801b;

    public C78058g(C32226l<? super View, C13598b0> lVar, C32226l<? super View, C13598b0> lVar2, WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(lVar, "addHeader");
        C87412m.m108594g(lVar2, "removeHeader");
        C87412m.m108594g(wxRecyclerView, "parentView");
        this.f228800a = lVar;
        this.f228801b = lVar2;
    }
}
