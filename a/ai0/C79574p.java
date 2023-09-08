package ai0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;

/* renamed from: ai0.p */
public final class C79574p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f233329d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79574p(AppBrandRuntime appBrandRuntime) {
        super(0);
        this.f233329d = appBrandRuntime;
    }

    public Object invoke() {
        C79570o.f233323d.remove(this.f233329d);
        ConcurrentHashMap<String, AppBrandRuntime> concurrentHashMap = C79570o.f233324e;
        if (C87412m.m108589b(concurrentHashMap.get(this.f233329d.f238147j), this.f233329d)) {
            concurrentHashMap.remove(this.f233329d.f238147j);
        }
        return C13598b0.f38549a;
    }
}
