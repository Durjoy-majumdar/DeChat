package al1;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: al1.m */
public final class C54132m {

    /* renamed from: a */
    public final int f152040a;

    /* renamed from: b */
    public String f152041b;

    /* renamed from: c */
    public int f152042c;

    /* renamed from: d */
    public int f152043d;

    /* renamed from: e */
    public int f152044e;

    public C54132m(int i, String str, int i2, int i3, int i4, int i5, C8480h hVar) {
        str = (i5 & 2) != 0 ? "" : str;
        i4 = (i5 & 16) != 0 ? 0 : i4;
        this.f152040a = i;
        this.f152041b = str;
        this.f152042c = i2;
        this.f152043d = i3;
        this.f152044e = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54132m)) {
            return false;
        }
        C54132m mVar = (C54132m) obj;
        return this.f152040a == mVar.f152040a && C87412m.m108589b(this.f152041b, mVar.f152041b) && this.f152042c == mVar.f152042c && this.f152043d == mVar.f152043d && this.f152044e == mVar.f152044e;
    }

    public int hashCode() {
        int i = this.f152040a * 31;
        String str = this.f152041b;
        return ((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.f152042c) * 31) + this.f152043d) * 31) + this.f152044e;
    }

    public String toString() {
        return "subtitle:" + this.f152041b + ",index:" + this.f152042c + ",duration:" + this.f152043d;
    }
}
