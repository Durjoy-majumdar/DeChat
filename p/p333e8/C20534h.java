package p333e8;

/* renamed from: e8.h */
public final class C20534h {

    /* renamed from: a */
    public int f57786a;

    /* renamed from: b */
    public long[] f57787b = new long[32];

    /* renamed from: a */
    public long mo32080a(int i) {
        if (i >= 0 && i < this.f57786a) {
            return this.f57787b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f57786a);
    }
}
