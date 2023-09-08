package p004b0;

import androidx.compose.foundation.lazy.layout.C103589m;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p560i2.C108321c;
import p631o1.C109854n0;
import p631o1.C109899z;
import rx3.C13598b0;
import sx3.C36903g0;

/* renamed from: b0.u */
public final class C103971u extends C87413o implements C32228q<Integer, Integer, C32226l<? super C109854n0.C109855a, ? extends C13598b0>, C109899z> {

    /* renamed from: d */
    public final /* synthetic */ C103589m f307499d;

    /* renamed from: e */
    public final /* synthetic */ long f307500e;

    /* renamed from: f */
    public final /* synthetic */ int f307501f;

    /* renamed from: g */
    public final /* synthetic */ int f307502g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103971u(C103589m mVar, long j, int i, int i2) {
        super(3);
        this.f307499d = mVar;
        this.f307500e = j;
        this.f307501f = i;
        this.f307502g = i2;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        C32226l lVar = (C32226l) obj3;
        C87412m.m108594g(lVar, "placement");
        return this.f307499d.mo144573t(C108321c.m146708e(this.f307500e, intValue + this.f307501f), C108321c.m146707d(this.f307500e, intValue2 + this.f307502g), C36903g0.f97931d, lVar);
    }
}
