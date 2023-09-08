package cm1;

import gy3.C8480h;
import gy3.C87412m;
import pe3.C89349b;

/* renamed from: cm1.c3 */
public final class C0720c3 {

    /* renamed from: a */
    public C89349b f1727a;

    /* renamed from: b */
    public int f1728b;

    /* renamed from: c */
    public long f1729c;

    /* renamed from: d */
    public long f1730d;

    /* renamed from: e */
    public int f1731e;

    public C0720c3() {
        this((C89349b) null, 0, 0, 0, 0, 31, (C8480h) null);
    }

    public C0720c3(C89349b bVar, int i, long j, long j2, int i2, int i3, C8480h hVar) {
        bVar = (i3 & 1) != 0 ? null : bVar;
        i = (i3 & 2) != 0 ? -1 : i;
        j = (i3 & 4) != 0 ? 0 : j;
        j2 = (i3 & 8) != 0 ? 0 : j2;
        i2 = (i3 & 16) != 0 ? -1 : i2;
        this.f1727a = bVar;
        this.f1728b = i;
        this.f1729c = j;
        this.f1730d = j2;
        this.f1731e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0720c3)) {
            return false;
        }
        C0720c3 c3Var = (C0720c3) obj;
        return C87412m.m108589b(this.f1727a, c3Var.f1727a) && this.f1728b == c3Var.f1728b && this.f1729c == c3Var.f1729c && this.f1730d == c3Var.f1730d && this.f1731e == c3Var.f1731e;
    }

    public int hashCode() {
        C89349b bVar = this.f1727a;
        int hashCode = bVar == null ? 0 : bVar.hashCode();
        long j = this.f1729c;
        long j2 = this.f1730d;
        return (((((((hashCode * 31) + this.f1728b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f1731e;
    }

    public String toString() {
        return "TopicCollectionReqArgs(lastBuffer=" + this.f1727a + ", topicType=" + this.f1728b + ", fromObjectId=" + this.f1729c + ", topicId=" + this.f1730d + ", rollDir=" + this.f1731e + ')';
    }
}
