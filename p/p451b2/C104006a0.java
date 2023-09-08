package p451b2;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: b2.a0 */
public final class C104006a0 {

    /* renamed from: a */
    public final C104014i f307625a;

    /* renamed from: b */
    public final C104022q f307626b;

    /* renamed from: c */
    public final int f307627c;

    /* renamed from: d */
    public final int f307628d;

    /* renamed from: e */
    public final Object f307629e;

    public C104006a0(C104014i iVar, C104022q qVar, int i, int i2, Object obj, C8480h hVar) {
        this.f307625a = iVar;
        this.f307626b = qVar;
        this.f307627c = i;
        this.f307628d = i2;
        this.f307629e = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104006a0)) {
            return false;
        }
        C104006a0 a0Var = (C104006a0) obj;
        if (!C87412m.m108589b(this.f307625a, a0Var.f307625a) || !C87412m.m108589b(this.f307626b, a0Var.f307626b)) {
            return false;
        }
        if (!(this.f307627c == a0Var.f307627c)) {
            return false;
        }
        return (this.f307628d == a0Var.f307628d) && C87412m.m108589b(this.f307629e, a0Var.f307629e);
    }

    public int hashCode() {
        C104014i iVar = this.f307625a;
        int i = 0;
        int hashCode = (((((((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f307626b.f307657d) * 31) + this.f307627c) * 31) + this.f307628d) * 31;
        Object obj = this.f307629e;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f307625a + ", fontWeight=" + this.f307626b + ", fontStyle=" + C104020o.m138752a(this.f307627c) + ", fontSynthesis=" + C104021p.m138753a(this.f307628d) + ", resourceLoaderCacheKey=" + this.f307629e + ')';
    }
}
