package my3;

/* renamed from: my3.d */
public final class C34688d implements C109647f<Double> {

    /* renamed from: d */
    public final double f93281d;

    /* renamed from: e */
    public final double f93282e;

    public C34688d(double d, double d2) {
        this.f93281d = d;
        this.f93282e = d2;
    }

    /* renamed from: a */
    public boolean mo59684a(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        return doubleValue >= this.f93281d && doubleValue <= this.f93282e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C34688d) {
            if (isEmpty() && ((C34688d) obj).isEmpty()) {
                return true;
            }
            C34688d dVar = (C34688d) obj;
            if (this.f93281d == dVar.f93281d) {
                if (this.f93282e == dVar.f93282e) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo59686f(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    /* renamed from: f0 */
    public Comparable mo59687f0() {
        return Double.valueOf(this.f93281d);
    }

    /* renamed from: g0 */
    public Comparable mo59688g0() {
        return Double.valueOf(this.f93282e);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.f93281d).hashCode() * 31) + Double.valueOf(this.f93282e).hashCode();
    }

    public boolean isEmpty() {
        return this.f93281d > this.f93282e;
    }

    public String toString() {
        return this.f93281d + ".." + this.f93282e;
    }
}
