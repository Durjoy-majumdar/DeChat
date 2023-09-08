package oz2;

import gy3.C87412m;
import jq3.C9493c;
import rz2.C48201c;
import zb2.C66777a;

/* renamed from: oz2.d */
public final class C47412d extends C66777a<C47412d> implements C9493c {

    /* renamed from: d */
    public final C48201c f127195d;

    public C47412d(C48201c cVar) {
        C87412m.m108594g(cVar, "info");
        this.f127195d = cVar;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        String str = this.f127195d.field_StatusID;
        C87412m.m108593f(str, "info.field_StatusID");
        return str;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C47412d) obj, "other");
        return 0;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C47412d dVar = (C47412d) obj;
        C87412m.m108594g(dVar, "other");
        return C87412m.m108589b(this.f127195d.field_StatusID, dVar.f127195d.field_StatusID);
    }
}
