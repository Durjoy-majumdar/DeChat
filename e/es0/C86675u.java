package es0;

import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C90419io3;
import te3.C90425kw;

/* renamed from: es0.u */
public final class C86675u extends C87413o implements C32227p<C90419io3, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRecommendUILogic f251671d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86675u(AppBrandRecommendUILogic appBrandRecommendUILogic) {
        super(2);
        this.f251671d = appBrandRecommendUILogic;
    }

    public Object invoke(Object obj, Object obj2) {
        C90419io3 io32 = (C90419io3) obj;
        int intValue = ((Number) obj2).intValue();
        C87412m.m108594g(io32, "recommendCard");
        C86668l lVar = this.f251671d.f247004p;
        lVar.getClass();
        Log.m105925i("MicroMsg.Recommend.AppBrandRecommendReport", "reportFooterClick position:%d, app_user_name:%s, app_nick_name:%s, card_type:%d, recommendId:%s", Integer.valueOf(intValue), io32.f259585f, io32.f259597u, Integer.valueOf(io32.f259583d), io32.f259594r);
        if (lVar.f251659g.containsKey(io32.f259594r)) {
            lVar.f251659g.get(io32.f259594r).f259661g++;
        } else {
            C90425kw a = lVar.mo121062a(intValue, io32);
            a.f259660f = 0;
            a.f259661g = 1;
            lVar.f251659g.put(io32.f259594r, a);
            lVar.f251658f.add(a);
        }
        return C13598b0.f38549a;
    }
}
