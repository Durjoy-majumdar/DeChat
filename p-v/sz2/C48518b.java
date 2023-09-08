package sz2;

import gy3.C87412m;
import jq3.C9493c;
import rz2.C48206h;
import zb2.C66777a;

/* renamed from: sz2.b */
public final class C48518b extends C66777a<C48518b> implements C9493c {

    /* renamed from: d */
    public final C48206h.C48208b f129772d;

    public C48518b(C48206h.C48208b bVar) {
        C87412m.m108594g(bVar, "info");
        this.f129772d = bVar;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f129772d.f129192a;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C48518b) obj, "other");
        return 0;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C48518b bVar = (C48518b) obj;
        C87412m.m108594g(bVar, "other");
        if (!C87412m.m108589b(this.f129772d.f129192a, bVar.f129772d.f129192a) || this.f129772d.f129193b.size() != bVar.f129772d.f129193b.size()) {
            return false;
        }
        int size = this.f129772d.f129193b.size();
        for (int i = 0; i < size; i++) {
            if (!C87412m.m108589b(this.f129772d.f129193b.get(i).field_StatusID, bVar.f129772d.f129193b.get(i).field_StatusID) || !C48519c.m53894a(this.f129772d.f129193b.get(i), bVar.f129772d.f129193b.get(i))) {
                return false;
            }
        }
        return true;
    }
}
