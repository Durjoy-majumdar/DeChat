package cx1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import rx3.C13604l;
import sx3.C64186f0;

/* renamed from: cx1.b */
public final class C45220b {

    /* renamed from: a */
    public final List<C45221c> f122544a;

    /* renamed from: b */
    public final C13604l<Boolean, List<C45221c>> f122545b;

    /* renamed from: c */
    public final C13604l<Boolean, List<C45221c>> f122546c;

    /* renamed from: d */
    public final C13604l<Boolean, List<C45221c>> f122547d;

    public C45220b() {
        this((List) null, (C13604l) null, (C13604l) null, (C13604l) null, 15, (C8480h) null);
    }

    public C45220b(List<C45221c> list, C13604l<Boolean, ? extends List<C45221c>> lVar, C13604l<Boolean, ? extends List<C45221c>> lVar2, C13604l<Boolean, ? extends List<C45221c>> lVar3) {
        C87412m.m108594g(list, "atAllList");
        C87412m.m108594g(lVar, "recentlyMentioned");
        C87412m.m108594g(lVar2, "admins");
        C87412m.m108594g(lVar3, "members");
        this.f122544a = list;
        this.f122545b = lVar;
        this.f122546c = lVar2;
        this.f122547d = lVar3;
    }

    /* renamed from: a */
    public static C45220b m50019a(C45220b bVar, List<C45221c> list, C13604l<Boolean, List<C45221c>> lVar, C13604l<Boolean, List<C45221c>> lVar2, C13604l<Boolean, List<C45221c>> lVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bVar.f122544a;
        }
        if ((i & 2) != 0) {
            lVar = bVar.f122545b;
        }
        if ((i & 4) != 0) {
            lVar2 = bVar.f122546c;
        }
        if ((i & 8) != 0) {
            lVar3 = bVar.f122547d;
        }
        bVar.getClass();
        C87412m.m108594g(list, "atAllList");
        C87412m.m108594g(lVar, "recentlyMentioned");
        C87412m.m108594g(lVar2, "admins");
        C87412m.m108594g(lVar3, "members");
        return new C45220b(list, lVar, lVar2, lVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45220b)) {
            return false;
        }
        C45220b bVar = (C45220b) obj;
        return C87412m.m108589b(this.f122544a, bVar.f122544a) && C87412m.m108589b(this.f122545b, bVar.f122545b) && C87412m.m108589b(this.f122546c, bVar.f122546c) && C87412m.m108589b(this.f122547d, bVar.f122547d);
    }

    public int hashCode() {
        return (((((this.f122544a.hashCode() * 31) + this.f122545b.hashCode()) * 31) + this.f122546c.hashCode()) * 31) + this.f122547d.hashCode();
    }

    public String toString() {
        return "MentionUserResultWrapper(atAllList=" + this.f122544a + ", recentlyMentioned=" + this.f122545b + ", admins=" + this.f122546c + ", members=" + this.f122547d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45220b(List list, C13604l lVar, C13604l lVar2, C13604l lVar3, int i, C8480h hVar) {
        this((i & 1) != 0 ? C64186f0.f181907d : list, (i & 2) != 0 ? new C13604l(Boolean.FALSE, C64186f0.f181907d) : lVar, (i & 4) != 0 ? new C13604l(Boolean.FALSE, C64186f0.f181907d) : lVar2, (i & 8) != 0 ? new C13604l(Boolean.FALSE, C64186f0.f181907d) : lVar3);
    }
}
