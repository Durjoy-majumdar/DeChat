package my3;

import hy3.C33145a;
import java.util.Iterator;
import zx3.C66986c;

/* renamed from: my3.a */
public class C61588a implements Iterable<Character>, C33145a {

    /* renamed from: d */
    public final char f175167d;

    /* renamed from: e */
    public final char f175168e;

    /* renamed from: f */
    public final int f175169f;

    public C61588a(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f175167d = c;
            this.f175168e = (char) C66986c.m79137a(c, c2, i);
            this.f175169f = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public Iterator iterator() {
        return new C61589b(this.f175167d, this.f175168e, this.f175169f);
    }
}
