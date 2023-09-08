package my3;

/* renamed from: my3.e */
public final class C34689e implements C109647f<Float> {

    /* renamed from: d */
    public final float f93283d;

    /* renamed from: e */
    public final float f93284e;

    public C34689e(float f, float f2) {
        this.f93283d = f;
        this.f93284e = f2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C34689e) {
            if (isEmpty() && ((C34689e) obj).isEmpty()) {
                return true;
            }
            C34689e eVar = (C34689e) obj;
            if (this.f93283d == eVar.f93283d) {
                if (this.f93284e == eVar.f93284e) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo59686f(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* renamed from: f0 */
    public Comparable mo59687f0() {
        return Float.valueOf(this.f93283d);
    }

    /* renamed from: g0 */
    public Comparable mo59688g0() {
        return Float.valueOf(this.f93284e);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f93283d).hashCode() * 31) + Float.valueOf(this.f93284e).hashCode();
    }

    public boolean isEmpty() {
        return this.f93283d > this.f93284e;
    }

    public String toString() {
        return this.f93283d + ".." + this.f93284e;
    }
}
