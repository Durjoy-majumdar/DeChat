package i31;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j31.C117294b;
import j31.C9276a;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C36570n;

/* renamed from: i31.f */
public final class C8848f extends C87413o implements C32224a<C117294b<Object, Object>> {

    /* renamed from: d */
    public final /* synthetic */ C117134d<Object, Object, C117139g<Object, Object>> f28098d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8848f(C117134d<Object, Object, C117139g<Object, Object>> dVar) {
        super(0);
        this.f28098d = dVar;
    }

    public Object invoke() {
        C9276a a = C9276a.f29023b.mo10053a();
        Object value = ((C36570n) this.f28098d.f350950c).getValue();
        Object a2 = this.f28098d.mo383a();
        a.getClass();
        C87412m.m108594g(value, "key");
        C87412m.m108594g(a2, "default");
        ConcurrentHashMap concurrentHashMap = a.f29025a;
        Object obj = concurrentHashMap.get(value);
        if (obj == null) {
            Object putIfAbsent = concurrentHashMap.putIfAbsent(value, a2);
            if (putIfAbsent != null) {
                a2 = putIfAbsent;
            }
            obj = a2;
        }
        return (C117294b) obj;
    }
}
