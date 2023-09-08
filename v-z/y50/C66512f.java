package y50;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: y50.f */
public final class C66512f {

    /* renamed from: a */
    public final long f191334a;

    /* renamed from: b */
    public final String f191335b;

    /* renamed from: c */
    public final String f191336c;

    /* renamed from: d */
    public final String f191337d;

    /* renamed from: e */
    public final int f191338e;

    public C66512f(long j, String str, String str2, String str3, int i) {
        this.f191334a = j;
        this.f191335b = str;
        this.f191336c = str2;
        this.f191337d = str3;
        this.f191338e = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66512f)) {
            return false;
        }
        C66512f fVar = (C66512f) obj;
        return this.f191334a == fVar.f191334a && C87412m.m108589b(this.f191335b, fVar.f191335b) && C87412m.m108589b(this.f191336c, fVar.f191336c) && C87412m.m108589b(this.f191337d, fVar.f191337d) && this.f191338e == fVar.f191338e;
    }

    public int hashCode() {
        long j = this.f191334a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f191335b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191336c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f191337d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.f191338e;
    }

    public String toString() {
        return "CloseLiveMicInfo(liveId=" + this.f191334a + ", audience=" + this.f191335b + ", micId=" + this.f191336c + ", sdkUserId=" + this.f191337d + ", micType=" + this.f191338e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C66512f(long j, String str, String str2, String str3, int i, int i2, C8480h hVar) {
        this(j, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 0 : i);
    }
}
