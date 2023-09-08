package fz3;

import gy3.C8480h;
import gy3.C87412m;
import rx3.C36567f;

/* renamed from: fz3.z */
public final class C24525z {

    /* renamed from: d */
    public static final C24525z f70084d = new C24525z(C24507k0.STRICT, (C36567f) null, (C24507k0) null, 6, (C8480h) null);

    /* renamed from: a */
    public final C24507k0 f70085a;

    /* renamed from: b */
    public final C36567f f70086b;

    /* renamed from: c */
    public final C24507k0 f70087c;

    public C24525z(C24507k0 k0Var, C36567f fVar, C24507k0 k0Var2) {
        C87412m.m108594g(k0Var, "reportLevelBefore");
        C87412m.m108594g(k0Var2, "reportLevelAfter");
        this.f70085a = k0Var;
        this.f70086b = fVar;
        this.f70087c = k0Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24525z)) {
            return false;
        }
        C24525z zVar = (C24525z) obj;
        return this.f70085a == zVar.f70085a && C87412m.m108589b(this.f70086b, zVar.f70086b) && this.f70087c == zVar.f70087c;
    }

    public int hashCode() {
        int hashCode = this.f70085a.hashCode() * 31;
        C36567f fVar = this.f70086b;
        return ((hashCode + (fVar == null ? 0 : fVar.f97255g)) * 31) + this.f70087c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f70085a + ", sinceVersion=" + this.f70086b + ", reportLevelAfter=" + this.f70087c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24525z(C24507k0 k0Var, C36567f fVar, C24507k0 k0Var2, int i, C8480h hVar) {
        this(k0Var, (i & 2) != 0 ? new C36567f(1, 0, 0) : fVar, (i & 4) != 0 ? k0Var : k0Var2);
    }
}
