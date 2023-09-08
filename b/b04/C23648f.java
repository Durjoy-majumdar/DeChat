package b04;

import gy3.C87412m;
import vz3.C26408b;

/* renamed from: b04.f */
public final class C23648f {

    /* renamed from: a */
    public final C26408b f67837a;

    /* renamed from: b */
    public final int f67838b;

    public C23648f(C26408b bVar, int i) {
        C87412m.m108594g(bVar, "classId");
        this.f67837a = bVar;
        this.f67838b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23648f)) {
            return false;
        }
        C23648f fVar = (C23648f) obj;
        return C87412m.m108589b(this.f67837a, fVar.f67837a) && this.f67838b == fVar.f67838b;
    }

    public int hashCode() {
        return (this.f67837a.hashCode() * 31) + this.f67838b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f67838b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f67837a);
        int i3 = this.f67838b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }
}
