package d32;

import com.tencent.p014mm.C0966R;
import g62.C45881a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C60905o;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p278yh.C79116m;
import pm3.C77115b;

/* renamed from: d32.a */
public final class C75324a implements C77115b {

    /* renamed from: a */
    public long f221485a;

    /* renamed from: b */
    public long f221486b;

    /* renamed from: c */
    public C99681n f221487c;

    /* renamed from: d */
    public C99672i f221488d;

    /* renamed from: e */
    public int f221489e;

    /* renamed from: f */
    public int f221490f;

    public C75324a() {
        this(0, 0, (C99681n) null, (C99672i) null, 0, 0, 63, (C8480h) null);
    }

    public C75324a(long j, long j2, C99681n nVar, C99672i iVar, int i, int i2, int i3, C8480h hVar) {
        j = (i3 & 1) != 0 ? 0 : j;
        j2 = (i3 & 2) != 0 ? 0 : j2;
        nVar = (i3 & 4) != 0 ? null : nVar;
        iVar = (i3 & 8) != 0 ? null : iVar;
        i = (i3 & 16) != 0 ? 0 : i;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        this.f221485a = j;
        this.f221486b = j2;
        this.f221487c = nVar;
        this.f221488d = iVar;
        this.f221489e = i;
        this.f221490f = i2;
    }

    /* renamed from: a */
    public boolean mo105659a(C77115b bVar) {
        C87412m.m108594g(bVar, "other");
        if (!(bVar instanceof C75324a)) {
            return false;
        }
        C75324a aVar = (C75324a) bVar;
        return this.f221485a == aVar.f221485a && this.f221486b == aVar.f221486b && C87412m.m108589b(this.f221487c, aVar.f221487c) && C87412m.m108589b(this.f221488d, aVar.f221488d) && this.f221489e == aVar.f221489e && this.f221490f == aVar.f221490f;
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
        if (!(bVar3 instanceof C75324a)) {
            return 0;
        }
        int i = bVar.f225006e;
        if (i == 11 || i == 10) {
            C75324a aVar = (C75324a) bVar3;
            int i2 = C87412m.m108596i(this.f221489e, aVar.f221489e);
            if (i2 != 0) {
                return i2;
            }
            int i3 = C87412m.m108596i(bVar.f225006e, bVar2.f225006e);
            return i3 != 0 ? i3 : C87412m.m108596i(this.f221490f, aVar.f221490f);
        }
        int i4 = C87412m.m108596i(i, bVar2.f225006e);
        if (i4 != 0) {
            return i4;
        }
        C75324a aVar2 = (C75324a) bVar3;
        int j = C87412m.m108597j(aVar2.f221486b, this.f221486b);
        return j == 0 ? C87412m.m108597j(aVar2.f221485a, this.f221485a) : j;
    }

    /* renamed from: d */
    public void mo105662d(C79116m mVar, C60905o oVar, C77020b bVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(mVar, "uiBinding");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(bVar, "item");
        if (C45881a.m51164a(this.f221486b, 4, 0) != 0) {
            mVar.mo109062d().setBackgroundResource(C0966R.C0969drawable.b54);
        } else {
            mVar.mo109062d().setBackgroundResource(C0966R.C0969drawable.f4860p8);
        }
    }

    /* renamed from: e */
    public boolean mo105663e(C77020b bVar) {
        C87412m.m108594g(bVar, "item");
        return bVar.f225006e == 10;
    }
}
