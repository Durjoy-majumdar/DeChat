package yr1;

import gy3.C87412m;
import qo3.C101218e0;

/* renamed from: yr1.a */
public final class C16060a {

    /* renamed from: a */
    public final String f43195a;

    /* renamed from: b */
    public final int f43196b;

    /* renamed from: c */
    public final boolean f43197c;

    /* renamed from: d */
    public final C101218e0.C12907m f43198d;

    public C16060a() {
        this((String) null, 0, false, (C101218e0.C12907m) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16060a)) {
            return false;
        }
        C16060a aVar = (C16060a) obj;
        return C87412m.m108589b(this.f43195a, aVar.f43195a) && this.f43196b == aVar.f43196b && this.f43197c == aVar.f43197c && C87412m.m108589b(this.f43198d, aVar.f43198d);
    }

    public int hashCode() {
        String str = this.f43195a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f43196b) * 31;
        boolean z = this.f43197c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C101218e0.C12907m mVar = this.f43198d;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "BtnConfig(text=" + this.f43195a + ", colorStyle=" + this.f43196b + ", cancel=" + this.f43197c + ", callBack=" + this.f43198d + ')';
    }

    public C16060a(String str, int i, boolean z, C101218e0.C12907m mVar) {
        this.f43195a = str;
        this.f43196b = i;
        this.f43197c = z;
        this.f43198d = mVar;
    }
}
