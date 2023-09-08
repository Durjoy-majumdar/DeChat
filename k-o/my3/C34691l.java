package my3;

import java.util.NoSuchElementException;
import sx3.C36905m0;

/* renamed from: my3.l */
public final class C34691l extends C36905m0 {

    /* renamed from: d */
    public final long f93289d;

    /* renamed from: e */
    public final long f93290e;

    /* renamed from: f */
    public boolean f93291f;

    /* renamed from: g */
    public long f93292g;

    public C34691l(long j, long j2, long j3) {
        this.f93289d = j3;
        this.f93290e = j2;
        boolean z = true;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.f93291f = z;
        this.f93292g = !z ? j2 : j;
    }

    /* renamed from: a */
    public long mo59697a() {
        long j = this.f93292g;
        if (j != this.f93290e) {
            this.f93292g = this.f93289d + j;
        } else if (this.f93291f) {
            this.f93291f = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public boolean hasNext() {
        return this.f93291f;
    }
}
