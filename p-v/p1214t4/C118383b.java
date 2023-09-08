package p1214t4;

/* renamed from: t4.b */
public class C118383b {

    /* renamed from: a */
    public boolean f353788a;

    /* renamed from: b */
    public boolean f353789b;

    /* renamed from: c */
    public boolean f353790c;

    /* renamed from: d */
    public boolean f353791d;

    public C118383b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f353788a = z;
        this.f353789b = z2;
        this.f353790c = z3;
        this.f353791d = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118383b)) {
            return false;
        }
        C118383b bVar = (C118383b) obj;
        return this.f353788a == bVar.f353788a && this.f353789b == bVar.f353789b && this.f353790c == bVar.f353790c && this.f353791d == bVar.f353791d;
    }

    public int hashCode() {
        int i = this.f353788a;
        if (this.f353789b) {
            i += 16;
        }
        if (this.f353790c) {
            i += 256;
        }
        return this.f353791d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f353788a), Boolean.valueOf(this.f353789b), Boolean.valueOf(this.f353790c), Boolean.valueOf(this.f353791d)});
    }
}
