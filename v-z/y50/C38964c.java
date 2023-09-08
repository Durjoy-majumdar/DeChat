package y50;

import gy3.C87412m;

/* renamed from: y50.c */
public final class C38964c {

    /* renamed from: a */
    public final long f104977a;

    /* renamed from: b */
    public final int f104978b;

    /* renamed from: c */
    public final String f104979c;

    public C38964c(long j, int i, String str) {
        this.f104977a = j;
        this.f104978b = i;
        this.f104979c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38964c)) {
            return false;
        }
        C38964c cVar = (C38964c) obj;
        return this.f104977a == cVar.f104977a && this.f104978b == cVar.f104978b && C87412m.m108589b(this.f104979c, cVar.f104979c);
    }

    public int hashCode() {
        long j = this.f104977a;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.f104978b) * 31;
        String str = this.f104979c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BanLiveCommentInfo(LiveId=" + this.f104977a + ", enableComment=" + this.f104978b + ", wording=" + this.f104979c + ')';
    }
}
