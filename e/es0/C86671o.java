package es0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendUILogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C90419io3;

/* renamed from: es0.o */
public final class C86671o extends C87413o implements C32228q<Integer, LinkedList<C90419io3>, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRecommendUILogic f251667d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86671o(AppBrandRecommendUILogic appBrandRecommendUILogic) {
        super(3);
        this.f251667d = appBrandRecommendUILogic;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        LinkedList linkedList = (LinkedList) obj2;
        int intValue2 = ((Number) obj3).intValue();
        C87412m.m108594g(linkedList, "fetchedDataList");
        Log.m105925i("MicroMsg.Recommend.AppBrandRecommendUILogic", "onFetchFinish, remainCount:%d, size:%d, result code:%d", Integer.valueOf(intValue2), Integer.valueOf(linkedList.size()), Integer.valueOf(intValue));
        if (intValue == 0 || intValue == 3) {
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C90419io3) it.next()).f259585f);
            }
            AppBrandRecommendUILogic appBrandRecommendUILogic = this.f251667d;
            appBrandRecommendUILogic.getClass();
            C81662k.m100184c(arrayList, C81652f.C81653a.WXA_RECOMMEND_CARD_LIST, (C81662k.C81674j) null);
            ((C81500i0) C81161g2.Bx0(C81500i0.class)).add(appBrandRecommendUILogic.f246999h.getSerial(), appBrandRecommendUILogic.f247006r);
            C81161g2.Cx0().add(appBrandRecommendUILogic.f246999h.getSerial(), appBrandRecommendUILogic.f247007s);
        }
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = this.f251667d.f247001j.f247013a;
        AppBrandRecommendUILogic appBrandRecommendUILogic2 = this.f251667d;
        synchronized (appBrandRecommendUILogic2.f247001j) {
            appBrandRecommendUILogic2.f247001j.f247013a = appBrandRecommendUILogic2.mo117375b().f257080h;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        AppBrandRecommendUILogic appBrandRecommendUILogic3 = this.f251667d;
        C86670n nVar = new C86670n(appBrandRecommendUILogic3, linkedList, intValue, d0Var, intValue2);
        C87412m.m108594g(appBrandRecommendUILogic3, "<this>");
        appBrandRecommendUILogic3.f246995d.runOnUiThread(new C86677w(nVar));
        return C13598b0.f38549a;
    }
}
