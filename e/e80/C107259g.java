package e80;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: e80.g */
public final class C107259g {

    /* renamed from: a */
    public final C107260h f320915a;

    /* renamed from: b */
    public final C107254b f320916b;

    /* renamed from: c */
    public final C107258f f320917c;

    public C107259g() {
        this((C107260h) null, (C107254b) null, (C107258f) null, 7, (C8480h) null);
    }

    public C107259g(C107260h hVar, C107254b bVar, C107258f fVar) {
        this.f320915a = hVar;
        this.f320916b = bVar;
        this.f320917c = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107259g)) {
            return false;
        }
        C107259g gVar = (C107259g) obj;
        return C87412m.m108589b(this.f320915a, gVar.f320915a) && C87412m.m108589b(this.f320916b, gVar.f320916b) && C87412m.m108589b(this.f320917c, gVar.f320917c);
    }

    public int hashCode() {
        C107260h hVar = this.f320915a;
        int i = 0;
        int hashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        C107254b bVar = this.f320916b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C107258f fVar = this.f320917c;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CameraKitSetting(uiSetting=" + this.f320915a + ", commonSetting=" + this.f320916b + ", reportSetting=" + this.f320917c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C107259g(C107260h hVar, C107254b bVar, C107258f fVar, int i, C8480h hVar2) {
        this((i & 1) != 0 ? null : hVar, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : fVar);
    }
}
