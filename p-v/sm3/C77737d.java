package sm3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p278yh.C79116m;
import pm3.C77115b;

/* renamed from: sm3.d */
public final class C77737d implements C77115b {

    /* renamed from: a */
    public long f226543a;

    /* renamed from: b */
    public C99681n f226544b;

    /* renamed from: c */
    public C99672i f226545c;

    /* renamed from: d */
    public int f226546d;

    public C77737d() {
        this(0, (C99681n) null, (C99672i) null, 0, 15, (C8480h) null);
    }

    public C77737d(long j, C99681n nVar, C99672i iVar, int i, int i2, C8480h hVar) {
        j = (i2 & 1) != 0 ? 0 : j;
        nVar = (i2 & 2) != 0 ? null : nVar;
        iVar = (i2 & 4) != 0 ? null : iVar;
        i = (i2 & 8) != 0 ? 0 : i;
        this.f226543a = j;
        this.f226544b = nVar;
        this.f226545c = iVar;
        this.f226546d = i;
    }

    /* renamed from: a */
    public boolean mo105659a(C77115b bVar) {
        C87412m.m108594g(bVar, "other");
        if (!(bVar instanceof C77737d)) {
            return false;
        }
        C77737d dVar = (C77737d) bVar;
        return this.f226543a == dVar.f226543a && C87412m.m108589b(this.f226544b, dVar.f226544b) && C87412m.m108589b(this.f226545c, dVar.f226545c) && this.f226546d == dVar.f226546d;
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
        if (!(bVar3 instanceof C77737d)) {
            return 0;
        }
        int i = C87412m.m108596i(bVar.f225006e, bVar2.f225006e);
        if (i != 0) {
            return i;
        }
        if (bVar.f225006e == 10) {
            return C87412m.m108596i(this.f226546d, ((C77737d) bVar3).f226546d);
        }
        int i2 = C87412m.m108596i(bVar2.f225017s ? 1 : 0, bVar.f225017s ? 1 : 0);
        return i2 != 0 ? i2 : C87412m.m108597j(((C77737d) bVar3).f226543a, this.f226543a);
    }

    /* renamed from: d */
    public void mo105662d(C79116m mVar, C60905o oVar, C77020b bVar, int i, int i2, boolean z, List<Object> list) {
        C77115b.C77116a.m93095a(this, mVar, oVar, bVar, i, i2, z, list);
    }

    /* renamed from: e */
    public boolean mo105663e(C77020b bVar) {
        C87412m.m108594g(bVar, "item");
        return bVar.f225006e == 10;
    }
}
