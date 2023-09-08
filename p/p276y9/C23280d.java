package p276y9;

import java.util.Arrays;

/* renamed from: y9.d */
public final class C23280d {

    /* renamed from: a */
    public final C23282o f66911a;

    /* renamed from: b */
    public final String f66912b;

    public C23280d(C23282o oVar, String str) {
        this.f66911a = oVar;
        this.f66912b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23280d)) {
            return false;
        }
        C23280d dVar = (C23280d) obj;
        return this.f66911a == dVar.f66911a && this.f66912b.equals(dVar.f66912b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f66911a, this.f66912b});
    }
}
