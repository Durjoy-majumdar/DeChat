package p257w;

import fy3.C32226l;
import gy3.C87413o;

/* renamed from: w.a1 */
public final class C15030a1 extends C87413o implements C32226l<Long, Object> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Long, Object> f41167d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15030a1(C32226l<? super Long, Object> lVar) {
        super(1);
        this.f41167d = lVar;
    }

    public Object invoke(Object obj) {
        return this.f41167d.invoke(Long.valueOf(((Number) obj).longValue() / 1));
    }
}
