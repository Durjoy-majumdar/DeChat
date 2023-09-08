package p14;

import gy3.C8480h;
import gy3.C87412m;
import n14.C25217e;
import sx3.C110818d0;

/* renamed from: p14.a0 */
public abstract class C25420a0 extends C25445l0<String> {

    /* renamed from: c */
    public final String f72007c;

    public C25420a0(String str, int i, C8480h hVar) {
        str = (i & 1) != 0 ? "" : str;
        C87412m.m108594g(str, "rootName");
        this.f72007c = str;
    }

    /* renamed from: B */
    public String mo52657B(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "desc");
        return eVar.mo52327i(i);
    }

    /* renamed from: C */
    public final String mo52658C(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "$this$getTag");
        String B = mo52657B(eVar, i);
        C87412m.m108594g(B, "nestedName");
        String str = (String) C110818d0.m150925W(this.f72048a);
        if (str == null) {
            str = this.f72007c;
        }
        C87412m.m108594g(str, "parentName");
        return B;
    }
}
