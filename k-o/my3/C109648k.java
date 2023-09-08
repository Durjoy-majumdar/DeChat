package my3;

import hy3.C33145a;
import java.util.Iterator;
import zx3.C66986c;

/* renamed from: my3.k */
public class C109648k implements Iterable<Long>, C33145a {

    /* renamed from: d */
    public final long f328248d;

    /* renamed from: e */
    public final long f328249e;

    /* renamed from: f */
    public final long f328250f;

    public C109648k(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f328248d = j;
            this.f328249e = C66986c.m79138b(j, j2, j3);
            this.f328250f = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public Iterator iterator() {
        return new C34691l(this.f328248d, this.f328249e, this.f328250f);
    }
}
