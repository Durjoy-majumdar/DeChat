package o40;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: o40.g */
public final class C35102g<T> {

    /* renamed from: a */
    public final T f94176a;

    /* renamed from: b */
    public final long f94177b;

    /* renamed from: c */
    public final boolean f94178c;

    public C35102g(Object obj, long j, boolean z, int i, C8480h hVar) {
        z = (i & 4) != 0 ? false : z;
        this.f94176a = obj;
        this.f94177b = j;
        this.f94178c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35102g)) {
            return false;
        }
        C35102g gVar = (C35102g) obj;
        return C87412m.m108589b(this.f94176a, gVar.f94176a) && this.f94177b == gVar.f94177b && this.f94178c == gVar.f94178c;
    }

    public int hashCode() {
        T t = this.f94176a;
        int hashCode = t == null ? 0 : t.hashCode();
        long j = this.f94177b;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f94178c;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb;
        if (this.f94178c) {
            sb = new StringBuilder();
            sb.append(this.f94177b);
            str = "ns";
        } else {
            sb = new StringBuilder();
            sb.append(this.f94177b);
            str = LocaleUtil.MALAY;
        }
        sb.append(str);
        return sb.toString();
    }
}
