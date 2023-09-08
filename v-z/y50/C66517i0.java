package y50;

import gy3.C87412m;

/* renamed from: y50.i0 */
public final class C66517i0 {

    /* renamed from: a */
    public final long f191347a;

    /* renamed from: b */
    public final String f191348b;

    /* renamed from: c */
    public final String f191349c;

    /* renamed from: d */
    public final String f191350d;

    /* renamed from: e */
    public final String f191351e;

    /* renamed from: f */
    public final String f191352f;

    public C66517i0(long j, String str, String str2, String str3, String str4, String str5) {
        this.f191347a = j;
        this.f191348b = str;
        this.f191349c = str2;
        this.f191350d = str3;
        this.f191351e = str4;
        this.f191352f = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66517i0)) {
            return false;
        }
        C66517i0 i0Var = (C66517i0) obj;
        return this.f191347a == i0Var.f191347a && C87412m.m108589b(this.f191348b, i0Var.f191348b) && C87412m.m108589b(this.f191349c, i0Var.f191349c) && C87412m.m108589b(this.f191350d, i0Var.f191350d) && C87412m.m108589b(this.f191351e, i0Var.f191351e) && C87412m.m108589b(this.f191352f, i0Var.f191352f);
    }

    public int hashCode() {
        long j = this.f191347a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f191348b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191349c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f191350d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f191351e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f191352f;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        return "LiveMicSuccessInfo(liveId=" + this.f191347a + ", audience=" + this.f191348b + ", headImg=" + this.f191349c + ", nickName=" + this.f191350d + ", sdkUid=" + this.f191351e + ", micId=" + this.f191352f + ')';
    }
}
