package ez2;

import gy3.C87412m;
import rz2.C48201c;
import sz2.C48518b;
import sz2.C48519c;
import zb2.C66777a;

/* renamed from: ez2.c */
public final class C45723c extends C66777a<C45723c> {

    /* renamed from: d */
    public final C48518b f123556d;

    /* renamed from: e */
    public final String f123557e;

    /* renamed from: f */
    public final int f123558f;

    /* renamed from: g */
    public final C48201c f123559g;

    public C45723c(C48518b bVar, String str, int i, C48201c cVar) {
        C87412m.m108594g(bVar, "groupItem");
        C87412m.m108594g(str, "userName");
        this.f123556d = bVar;
        this.f123557e = str;
        this.f123558f = i;
        this.f123559g = cVar;
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        return this.f123557e;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f123557e.hashCode();
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C45723c cVar = (C45723c) obj;
        C87412m.m108594g(cVar, "other");
        return cVar.f123558f - this.f123558f;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C45723c cVar = (C45723c) obj;
        C87412m.m108594g(cVar, "other");
        return C87412m.m108589b(this.f123557e, cVar.f123557e) && C87412m.m108589b(this.f123557e, cVar.f123557e) && this.f123558f == cVar.f123558f && C48519c.m53894a(this.f123559g, cVar.f123559g);
    }
}
