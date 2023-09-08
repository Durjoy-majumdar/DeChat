package r14;

import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import n14.C25217e;
import q14.C110346e;
import q14.C110347l;
import q14.C25537a;
import q14.C25542j;
import sx3.C110818d0;
import sx3.C90364q0;

/* renamed from: r14.i */
public final class C26102i extends C26100g {

    /* renamed from: j */
    public final List<String> f72965j;

    /* renamed from: k */
    public final int f72966k;

    /* renamed from: l */
    public int f72967l = -1;

    /* renamed from: m */
    public final C110347l f72968m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26102i(C25537a aVar, C110347l lVar) {
        super(aVar, lVar, (String) null, (C25217e) null, 12, (C8480h) null);
        C87412m.m108594g(aVar, "json");
        C87412m.m108594g(lVar, "value");
        this.f72968m = lVar;
        List<String> y0 = C110818d0.m150953y0(lVar.keySet());
        this.f72965j = y0;
        this.f72966k = y0.size() * 2;
    }

    /* renamed from: B */
    public String mo52657B(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "desc");
        return this.f72965j.get(i / 2);
    }

    /* renamed from: D */
    public C110346e mo52948D(String str) {
        C87412m.m108594g(str, "tag");
        return this.f72967l % 2 == 0 ? new C25542j(str, true) : (C110346e) C90364q0.m113145d(this.f72968m, str);
    }

    /* renamed from: F */
    public C110346e mo52950F() {
        return this.f72968m;
    }

    /* renamed from: H */
    public C110347l mo52967H() {
        return this.f72968m;
    }

    /* renamed from: a */
    public void mo52508a(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
    }

    /* renamed from: e */
    public int mo52510e(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        int i = this.f72967l;
        if (i >= this.f72966k - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f72967l = i2;
        return i2;
    }
}
