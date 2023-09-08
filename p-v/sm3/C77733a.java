package sm3;

import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import om3.C77020b;
import p278yh.C79116m;
import pm3.C77115b;

/* renamed from: sm3.a */
public final class C77733a implements C77115b {

    /* renamed from: a */
    public long f226532a;

    /* renamed from: b */
    public long f226533b;

    public C77733a() {
        this(0, 0);
    }

    /* renamed from: a */
    public boolean mo105659a(C77115b bVar) {
        C87412m.m108594g(bVar, "other");
        if (!(bVar instanceof C77733a)) {
            return false;
        }
        C77733a aVar = (C77733a) bVar;
        return this.f226532a == aVar.f226532a && this.f226533b == aVar.f226533b;
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
        if (!(bVar3 instanceof C77733a)) {
            return 0;
        }
        C77733a aVar = (C77733a) bVar3;
        int j = C87412m.m108597j(aVar.f226533b, this.f226533b);
        return j == 0 ? C87412m.m108597j(aVar.f226532a, this.f226532a) : j;
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

    public C77733a(long j, long j2) {
        this.f226532a = j;
        this.f226533b = j2;
    }
}
