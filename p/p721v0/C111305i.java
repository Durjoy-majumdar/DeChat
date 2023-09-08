package p721v0;

import androidx.compose.p002ui.platform.C103618e1;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: v0.i */
public final class C111305i extends C111296d {

    /* renamed from: f */
    public final String f333241f;

    /* renamed from: g */
    public final Object f333242g;

    /* renamed from: h */
    public final Object f333243h;

    /* renamed from: i */
    public final Object f333244i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111305i(String str, Object obj, Object obj2, Object obj3, C32226l<? super C103618e1, C13598b0> lVar, C32228q<? super C65503j, ? super C108504h, ? super Integer, ? extends C65503j> qVar) {
        super(lVar, qVar);
        C87412m.m108594g(str, "fqName");
        C87412m.m108594g(lVar, "inspectorInfo");
        C87412m.m108594g(qVar, "factory");
        this.f333241f = str;
        this.f333242g = obj;
        this.f333243h = obj2;
        this.f333244i = obj3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C111305i) {
            C111305i iVar = (C111305i) obj;
            return C87412m.m108589b(this.f333241f, iVar.f333241f) && C87412m.m108589b(this.f333242g, iVar.f333242g) && C87412m.m108589b(this.f333243h, iVar.f333243h) && C87412m.m108589b(this.f333244i, iVar.f333244i);
        }
    }

    public int hashCode() {
        int hashCode = this.f333241f.hashCode() * 31;
        Object obj = this.f333242g;
        int i = 0;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f333243h;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.f333244i;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode3 + i;
    }
}
