package es0;

import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C90419io3;

/* renamed from: es0.s */
public final class C86673s extends C87413o implements C32227p<C90419io3, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRecommendUILogic f251669d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86673s(AppBrandRecommendUILogic appBrandRecommendUILogic) {
        super(2);
        this.f251669d = appBrandRecommendUILogic;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        C87412m.m108594g((C90419io3) obj, "recommendCard");
        if (intValue == 0) {
            AppBrandRecommendUILogic appBrandRecommendUILogic = this.f251669d;
            C7930y.m8095a(appBrandRecommendUILogic.f246996e, appBrandRecommendUILogic.f247003o.f246981g);
        }
        return C13598b0.f38549a;
    }
}
