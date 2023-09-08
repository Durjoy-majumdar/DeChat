package ke1;

import fe1.C58969q;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60187m5;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: ke1.c */
public final class C61010c extends C87413o implements C32226l<List<? extends C60187m5>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61001a f173750d;

    /* renamed from: e */
    public final /* synthetic */ String f173751e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C60187m5, C13598b0> f173752f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61010c(C61001a aVar, String str, C32226l<? super C60187m5, C13598b0> lVar) {
        super(1);
        this.f173750d = aVar;
        this.f173751e = str;
        this.f173752f = lVar;
    }

    public Object invoke(Object obj) {
        List list = (List) obj;
        C87412m.m108594g(list, "resultList");
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f173750d.f173724a;
        C24564k0.m30739c(concurrentHashMap).remove(this.f173751e);
        C32226l<C60187m5, C13598b0> lVar = this.f173752f;
        Object obj2 = (C60187m5) C110818d0.m150916N(list);
        if (obj2 == null) {
            obj2 = new C58969q();
        }
        lVar.invoke(obj2);
        return C13598b0.f38549a;
    }
}
