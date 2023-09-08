package r14;

import gy3.C8480h;
import gy3.C87412m;
import n14.C25217e;
import q14.C110345b;
import q14.C110346e;
import q14.C25537a;

/* renamed from: r14.h */
public final class C26101h extends C26095a {

    /* renamed from: f */
    public final int f72962f;

    /* renamed from: g */
    public int f72963g = -1;

    /* renamed from: h */
    public final C110345b f72964h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26101h(C25537a aVar, C110345b bVar) {
        super(aVar, bVar, (C8480h) null);
        C87412m.m108594g(aVar, "json");
        C87412m.m108594g(bVar, "value");
        this.f72964h = bVar;
        this.f72962f = bVar.size();
    }

    /* renamed from: B */
    public String mo52657B(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "desc");
        return String.valueOf(i);
    }

    /* renamed from: D */
    public C110346e mo52948D(String str) {
        C87412m.m108594g(str, "tag");
        C110345b bVar = this.f72964h;
        C110346e eVar = bVar.f330084d.get(Integer.parseInt(str));
        C87412m.m108593f(eVar, "get(...)");
        return eVar;
    }

    /* renamed from: F */
    public C110346e mo52950F() {
        return this.f72964h;
    }

    /* renamed from: e */
    public int mo52510e(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        int i = this.f72963g;
        if (i >= this.f72962f - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f72963g = i2;
        return i2;
    }
}
