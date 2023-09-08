package dd3;

/* renamed from: dd3.e */
public class C75352e {

    /* renamed from: a */
    public float f221513a;

    /* renamed from: b */
    public float f221514b;

    /* renamed from: c */
    public int f221515c;

    /* renamed from: d */
    public long f221516d;

    public C75352e(long j, float f, float f2, int i, int i2) {
        this.f221513a = f;
        this.f221514b = f2;
        this.f221515c = i;
        this.f221516d = j;
    }

    public String toString() {
        return String.format("%d-%d-%d", new Object[]{Integer.valueOf((int) (this.f221513a * 1000000.0f)), Integer.valueOf((int) (this.f221514b * 1000000.0f)), Integer.valueOf(this.f221515c)});
    }
}
