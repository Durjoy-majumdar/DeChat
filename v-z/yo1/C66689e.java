package yo1;

import gy3.C8480h;

/* renamed from: yo1.e */
public final class C66689e {

    /* renamed from: a */
    public final long f191726a;

    /* renamed from: b */
    public int f191727b;

    /* renamed from: c */
    public int f191728c;

    /* renamed from: d */
    public boolean f191729d;

    public C66689e() {
        this(0, 0, 0, false, 15, (C8480h) null);
    }

    public C66689e(long j, int i, int i2, boolean z) {
        this.f191726a = j;
        this.f191727b = i;
        this.f191728c = i2;
        this.f191729d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66689e)) {
            return false;
        }
        C66689e eVar = (C66689e) obj;
        return this.f191726a == eVar.f191726a && this.f191727b == eVar.f191727b && this.f191728c == eVar.f191728c && this.f191729d == eVar.f191729d;
    }

    public int hashCode() {
        long j = this.f191726a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.f191727b) * 31) + this.f191728c) * 31;
        boolean z = this.f191729d;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "liveId:" + this.f191726a + ", playOffset:" + this.f191727b + ",totalDuration:" + this.f191728c + ",forceReq:" + this.f191729d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C66689e(long j, int i, int i2, boolean z, int i3, C8480h hVar) {
        this((i3 & 1) != 0 ? 0 : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z);
    }
}
