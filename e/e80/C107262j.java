package e80;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: e80.j */
public final class C107262j {

    /* renamed from: a */
    public volatile C107261i f320922a;

    /* renamed from: b */
    public volatile C107261i f320923b;

    /* renamed from: c */
    public volatile C107261i f320924c;

    /* renamed from: d */
    public volatile int f320925d;

    /* renamed from: e */
    public volatile boolean f320926e;

    public C107262j() {
        this((C107261i) null, (C107261i) null, (C107261i) null, 0, false, 31, (C8480h) null);
    }

    public C107262j(C107261i iVar, C107261i iVar2, C107261i iVar3, int i, boolean z, int i2, C8480h hVar) {
        iVar = (i2 & 1) != 0 ? new C107261i(0, 0) : iVar;
        iVar2 = (i2 & 2) != 0 ? new C107261i(0, 0) : iVar2;
        iVar3 = (i2 & 4) != 0 ? new C107261i(0, 0) : iVar3;
        i = (i2 & 8) != 0 ? 0 : i;
        z = (i2 & 16) != 0 ? false : z;
        C87412m.m108594g(iVar, "surfaceSize");
        C87412m.m108594g(iVar2, "cameraSize");
        C87412m.m108594g(iVar3, "outputSize");
        this.f320922a = iVar;
        this.f320923b = iVar2;
        this.f320924c = iVar3;
        this.f320925d = i;
        this.f320926e = z;
    }

    /* renamed from: a */
    public final void mo157743a() {
        C107261i iVar = this.f320922a;
        boolean z = false;
        if (iVar.f320920a > 0 && iVar.f320921b > 0) {
            C107261i iVar2 = this.f320923b;
            if (iVar2.f320920a > 0 && iVar2.f320921b > 0) {
                z = true;
            }
            if (!z) {
                return;
            }
            if (this.f320925d == 90 || this.f320925d == 270) {
                if (((float) 1) / this.f320923b.mo157739a() > this.f320922a.mo157739a()) {
                    this.f320924c.f320920a = this.f320923b.f320921b;
                    this.f320924c.f320921b = (int) (((float) this.f320924c.f320920a) * this.f320922a.mo157739a());
                    return;
                }
                this.f320924c.f320921b = this.f320923b.f320920a;
                this.f320924c.f320920a = (int) (((float) this.f320924c.f320921b) / this.f320922a.mo157739a());
            } else if (this.f320923b.mo157739a() > this.f320922a.mo157739a()) {
                this.f320924c.f320920a = this.f320923b.f320920a;
                this.f320924c.f320921b = (int) (((float) this.f320924c.f320920a) * this.f320922a.mo157739a());
            } else {
                this.f320924c.f320921b = this.f320923b.f320921b;
                this.f320924c.f320920a = (int) (((float) this.f320924c.f320921b) / this.f320922a.mo157739a());
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107262j)) {
            return false;
        }
        C107262j jVar = (C107262j) obj;
        return C87412m.m108589b(this.f320922a, jVar.f320922a) && C87412m.m108589b(this.f320923b, jVar.f320923b) && C87412m.m108589b(this.f320924c, jVar.f320924c) && this.f320925d == jVar.f320925d && this.f320926e == jVar.f320926e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f320922a.hashCode() * 31) + this.f320923b.hashCode()) * 31) + this.f320924c.hashCode()) * 31) + this.f320925d) * 31;
        boolean z = this.f320926e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "GLSizeParameter(surfaceSize=" + this.f320922a + ", cameraSize=" + this.f320923b + ", outputSize=" + this.f320924c + ", previewRotate=" + this.f320925d + ", mirror=" + this.f320926e + ')';
    }
}
