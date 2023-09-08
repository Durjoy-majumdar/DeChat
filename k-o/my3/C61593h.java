package my3;

import hy3.C33145a;
import sx3.C36904l0;
import zx3.C66986c;

/* renamed from: my3.h */
public class C61593h implements Iterable<Integer>, C33145a {

    /* renamed from: d */
    public final int f175174d;

    /* renamed from: e */
    public final int f175175e;

    /* renamed from: f */
    public final int f175176f;

    public C61593h(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f175174d = i;
            this.f175175e = C66986c.m79137a(i, i2, i3);
            this.f175176f = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C61593h) {
            if (!isEmpty() || !((C61593h) obj).isEmpty()) {
                C61593h hVar = (C61593h) obj;
                if (!(this.f175174d == hVar.f175174d && this.f175175e == hVar.f175175e && this.f175176f == hVar.f175176f)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f175174d * 31) + this.f175175e) * 31) + this.f175176f;
    }

    /* renamed from: i */
    public C36904l0 iterator() {
        return new C34690i(this.f175174d, this.f175175e, this.f175176f);
    }

    public boolean isEmpty() {
        if (this.f175176f > 0) {
            if (this.f175174d > this.f175175e) {
                return true;
            }
        } else if (this.f175174d < this.f175175e) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f175176f > 0) {
            sb = new StringBuilder();
            sb.append(this.f175174d);
            sb.append("..");
            sb.append(this.f175175e);
            sb.append(" step ");
            i = this.f175176f;
        } else {
            sb = new StringBuilder();
            sb.append(this.f175174d);
            sb.append(" downTo ");
            sb.append(this.f175175e);
            sb.append(" step ");
            i = -this.f175176f;
        }
        sb.append(i);
        return sb.toString();
    }
}
