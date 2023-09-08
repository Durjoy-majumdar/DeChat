package es0;

import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: es0.v */
public final class C86676v extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRecommendUILogic f251672d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86676v(AppBrandRecommendUILogic appBrandRecommendUILogic) {
        super(0);
        this.f251672d = appBrandRecommendUILogic;
    }

    public Object invoke() {
        this.f251672d.f247000i.notifyDataSetChanged();
        return C13598b0.f38549a;
    }
}
