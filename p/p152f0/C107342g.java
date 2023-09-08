package p152f0;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p155g0.C107649v;
import p155g0.C107650w;
import p683s0.C36606n;

/* renamed from: f0.g */
public final class C107342g extends C87413o implements C32227p<C36606n, Long, Long> {

    /* renamed from: d */
    public final /* synthetic */ C107649v f321156d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107342g(C107649v vVar) {
        super(2);
        this.f321156d = vVar;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj2).longValue();
        C87412m.m108594g((C36606n) obj, "$this$Saver");
        if (C107650w.m145825a(this.f321156d, longValue)) {
            return Long.valueOf(longValue);
        }
        return null;
    }
}
