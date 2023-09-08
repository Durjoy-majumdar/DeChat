package p721v0;

import androidx.compose.p002ui.platform.C103618e1;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: v0.h */
public final class C111304h extends C111296d {

    /* renamed from: f */
    public final String f333238f;

    /* renamed from: g */
    public final Object f333239g;

    /* renamed from: h */
    public final Object f333240h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111304h(String str, Object obj, Object obj2, C32226l<? super C103618e1, C13598b0> lVar, C32228q<? super C65503j, ? super C108504h, ? super Integer, ? extends C65503j> qVar) {
        super(lVar, qVar);
        C87412m.m108594g(str, "fqName");
        C87412m.m108594g(lVar, "inspectorInfo");
        C87412m.m108594g(qVar, "factory");
        this.f333238f = str;
        this.f333239g = obj;
        this.f333240h = obj2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C111304h) {
            C111304h hVar = (C111304h) obj;
            return C87412m.m108589b(this.f333238f, hVar.f333238f) && C87412m.m108589b(this.f333239g, hVar.f333239g) && C87412m.m108589b(this.f333240h, hVar.f333240h);
        }
    }

    public int hashCode() {
        int hashCode = this.f333238f.hashCode() * 31;
        Object obj = this.f333239g;
        int i = 0;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f333240h;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode2 + i;
    }
}
