package tt0;

/* renamed from: tt0.e */
public class C118516e {

    /* renamed from: a */
    public final double f354693a;

    /* renamed from: b */
    public final double f354694b;

    public C118516e(double d, double d2) {
        this.f354693a = d;
        this.f354694b = d2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C118516e)) {
            return false;
        }
        C118516e eVar = (C118516e) obj;
        return this.f354693a == eVar.f354693a && this.f354694b == eVar.f354694b;
    }

    public String toString() {
        return "Point{x=" + this.f354693a + ", y=" + this.f354694b + '}';
    }
}
