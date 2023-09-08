package p435a0;

import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import p560i2.C108322d;
import p631o1.C109852m0;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: a0.i0 */
public final class C103156i0 extends C54172f1 implements C109852m0 {

    /* renamed from: e */
    public final float f304310e;

    /* renamed from: f */
    public final boolean f304311f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103156i0(float f, boolean z, C32226l<? super C103618e1, C13598b0> lVar) {
        super(lVar);
        C87412m.m108594g(lVar, "inspectorInfo");
        this.f304310e = f;
        this.f304311f = z;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C103156i0 i0Var = obj instanceof C103156i0 ? (C103156i0) obj : null;
        if (i0Var == null) {
            return false;
        }
        return ((this.f304310e > i0Var.f304310e ? 1 : (this.f304310e == i0Var.f304310e ? 0 : -1)) == 0) && this.f304311f == i0Var.f304311f;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f304310e) * 31) + (this.f304311f ? 1231 : 1237);
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    /* renamed from: j0 */
    public Object mo142900j0(C108322d dVar, Object obj) {
        C87412m.m108594g(dVar, "<this>");
        C103189r0 r0Var = obj instanceof C103189r0 ? (C103189r0) obj : null;
        if (r0Var == null) {
            r0Var = new C103189r0(0.0f, false, (C103167m) null, 7, (C8480h) null);
        }
        r0Var.f304370a = this.f304310e;
        r0Var.f304371b = this.f304311f;
        return r0Var;
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.f304310e + ", fill=" + this.f304311f + ')';
    }
}
