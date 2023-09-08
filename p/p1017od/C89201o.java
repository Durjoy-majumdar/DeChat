package p1017od;

/* renamed from: od.o */
public final class C89201o {

    /* renamed from: a */
    public final long f257030a;

    /* renamed from: b */
    public final long f257031b;

    /* renamed from: c */
    public final long f257032c;

    public C89201o(long j, long j2, long j3) {
        this.f257030a = j;
        this.f257031b = j2;
        this.f257032c = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89201o)) {
            return false;
        }
        C89201o oVar = (C89201o) obj;
        return this.f257030a == oVar.f257030a && this.f257031b == oVar.f257031b && this.f257032c == oVar.f257032c;
    }

    public int hashCode() {
        long j = this.f257030a;
        long j2 = this.f257031b;
        long j3 = this.f257032c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "V8RawPointer(isolatePtr=" + this.f257030a + ", contextPtr=" + this.f257031b + ", uvLoopPtr=" + this.f257032c + ')';
    }
}
