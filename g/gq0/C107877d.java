package gq0;

import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;

/* renamed from: gq0.d */
public final class C107877d extends C87413o implements C32228q<String, Integer, String, AppBrandOpenMaterialDetailModel> {

    /* renamed from: d */
    public final /* synthetic */ C107869a f323036d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107877d(C107869a aVar) {
        super(3);
        this.f323036d = aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        T t;
        boolean z;
        String str = (String) obj;
        ((Number) obj2).intValue();
        String str2 = (String) obj3;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "enterPath");
        List<AppBrandOpenMaterialDetailModel> list = this.f323036d.f323012f.f311217f;
        C87412m.m108593f(list, "openMaterialCollection.a…dOpenMaterialDetailModels");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = (AppBrandOpenMaterialDetailModel) t;
            if (!C87412m.m108589b(str, appBrandOpenMaterialDetailModel.f311218d.f311222d) || !C87412m.m108589b(str2, appBrandOpenMaterialDetailModel.f311218d.f311224f)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (AppBrandOpenMaterialDetailModel) t;
    }
}
