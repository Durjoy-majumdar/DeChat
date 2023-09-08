package sm3;

import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import om3.C77020b;
import p278yh.C79116m;
import pm3.C77115b;

/* renamed from: sm3.b */
public final class C77734b implements C77115b {

    /* renamed from: a */
    public long f226534a;

    /* renamed from: b */
    public long f226535b;

    public C77734b() {
        this(0, 0);
    }

    /* renamed from: a */
    public boolean mo105659a(C77115b bVar) {
        C87412m.m108594g(bVar, "other");
        if (!(bVar instanceof C77734b)) {
            return false;
        }
        C77734b bVar2 = (C77734b) bVar;
        return this.f226534a == bVar2.f226534a && this.f226535b == bVar2.f226535b;
    }

    /* renamed from: b */
    public int mo105660b() {
        return 0;
    }

    /* renamed from: c */
    public int mo105661c(C77020b bVar, C77020b bVar2, C77115b bVar3) {
        C87412m.m108594g(bVar, "thisItem");
        C87412m.m108594g(bVar2, "otherItem");
        C87412m.m108594g(bVar3, "other");
        if (!(bVar3 instanceof C77734b)) {
            return 0;
        }
        C77734b bVar4 = (C77734b) bVar3;
        int j = C87412m.m108597j(bVar4.f226535b, this.f226535b);
        return j == 0 ? C87412m.m108597j(bVar4.f226534a, this.f226534a) : j;
    }

    /* renamed from: d */
    public void mo105662d(C79116m mVar, C60905o oVar, C77020b bVar, int i, int i2, boolean z, List<Object> list) {
        C77115b.C77116a.m93095a(this, mVar, oVar, bVar, i, i2, z, list);
    }

    /* renamed from: e */
    public boolean mo105663e(C77020b bVar) {
        C87412m.m108594g(bVar, "item");
        return false;
    }

    public C77734b(long j, long j2) {
        this.f226534a = j;
        this.f226535b = j2;
    }
}
