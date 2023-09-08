package r60;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;
import rx3.C13604l;
import w60.C102353e;
import x60.C102564a;

/* renamed from: r60.g */
public final class C101348g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C101344e f296893d;

    /* renamed from: e */
    public final /* synthetic */ C102564a<?> f296894e;

    /* renamed from: f */
    public final /* synthetic */ C102353e<Object> f296895f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101348g(C101344e eVar, C102564a<?> aVar, C102353e<Object> eVar2) {
        super(0);
        this.f296893d = eVar;
        this.f296894e = aVar;
        this.f296895f = eVar2;
    }

    public Object invoke() {
        ConcurrentHashMap<Integer, C13604l<C102564a<?>, C101342d<Object>>> concurrentHashMap = this.f296893d.f296888a;
        C102564a<?> aVar = this.f296894e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : concurrentHashMap.entrySet()) {
            if (C87412m.m108589b(((C13604l) next.getValue()).f38555d, aVar)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            String str = C101344e.f296887d;
            Log.m105924i(str, "onDataItemLoadEnd can not found " + this.f296894e);
        }
        C102353e<Object> eVar = this.f296895f;
        C102564a<?> aVar2 = this.f296894e;
        C101344e eVar2 = this.f296893d;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            R r = eVar.f301453a;
            if (r != null) {
                String str2 = C101344e.f296887d;
                StringBuilder sb = new StringBuilder();
                sb.append("dispatch ");
                sb.append(((C13604l) entry.getValue()).f38556e);
                sb.append(" resource ");
                sb.append(r);
                sb.append(" url ");
                sb.append(aVar2);
                sb.append("  try get:");
                WeakReference<T> weakReference = ((C101342d) ((C13604l) entry.getValue()).f38556e).f296881a.f296896a;
                sb.append(weakReference == null ? null : weakReference.get());
                Log.m105924i(str2, sb.toString());
                C101342d dVar = (C101342d) ((C13604l) entry.getValue()).f38556e;
                C101347f fVar = new C101347f(eVar2, entry, aVar2);
                eVar2.getClass();
                try {
                    dVar.mo140833a(r, fVar);
                } catch (Exception e) {
                    String str3 = C101344e.f296887d;
                    Log.m105924i(str3, "exception " + e.getMessage());
                    fVar.mo138483a(true);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
