package p502e0;

import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112536b;
import p1166z0.C112539e;
import p1166z0.C112541g;
import p1166z0.C112542h;
import p1166z0.C112543i;
import p436a1.C103237h0;
import p560i2.C33183o;

/* renamed from: e0.f */
public final class C107073f extends C107071a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107073f(C31353b bVar, C31353b bVar2, C31353b bVar3, C31353b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
        C87412m.m108594g(bVar, "topStart");
        C87412m.m108594g(bVar2, "topEnd");
        C87412m.m108594g(bVar3, "bottomEnd");
        C87412m.m108594g(bVar4, "bottomStart");
    }

    /* renamed from: b */
    public C103237h0 mo157521b(long j, float f, float f2, float f3, float f4, C33183o oVar) {
        long j2 = j;
        C33183o oVar2 = oVar;
        C87412m.m108594g(oVar2, "layoutDirection");
        if (((f + f2) + f3) + f4 == 0.0f) {
            return new C103237h0.C103238b(C112542h.m153752a(C112539e.f336955b, j2));
        }
        C112541g a = C112542h.m153752a(C112539e.f336955b, j2);
        C33183o oVar3 = C33183o.Ltr;
        return new C103237h0.C103239c(new C112543i(a.f336961a, a.f336962b, a.f336963c, a.f336964d, C112536b.m153732b(oVar2 == oVar3 ? f : f2, 0.0f, 2, (Object) null), C112536b.m153732b(oVar2 == oVar3 ? f2 : f, 0.0f, 2, (Object) null), C112536b.m153732b(oVar2 == oVar3 ? f3 : f4, 0.0f, 2, (Object) null), C112536b.m153732b(oVar2 == oVar3 ? f4 : f3, 0.0f, 2, (Object) null), (C8480h) null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107073f)) {
            return false;
        }
        C107073f fVar = (C107073f) obj;
        return C87412m.m108589b(this.f320489a, fVar.f320489a) && C87412m.m108589b(this.f320490b, fVar.f320490b) && C87412m.m108589b(this.f320491c, fVar.f320491c) && C87412m.m108589b(this.f320492d, fVar.f320492d);
    }

    public int hashCode() {
        return (((((this.f320489a.hashCode() * 31) + this.f320490b.hashCode()) * 31) + this.f320491c.hashCode()) * 31) + this.f320492d.hashCode();
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + this.f320489a + ", topEnd = " + this.f320490b + ", bottomEnd = " + this.f320491c + ", bottomStart = " + this.f320492d + ')';
    }
}
