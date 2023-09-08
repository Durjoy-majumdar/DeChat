package my3;

import java.util.NoSuchElementException;
import sx3.C36904l0;

/* renamed from: my3.i */
public final class C34690i extends C36904l0 {

    /* renamed from: d */
    public final int f93285d;

    /* renamed from: e */
    public final int f93286e;

    /* renamed from: f */
    public boolean f93287f;

    /* renamed from: g */
    public int f93288g;

    public C34690i(int i, int i2, int i3) {
        this.f93285d = i3;
        this.f93286e = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f93287f = z;
        this.f93288g = !z ? i2 : i;
    }

    /* renamed from: a */
    public int mo59695a() {
        int i = this.f93288g;
        if (i != this.f93286e) {
            this.f93288g = this.f93285d + i;
        } else if (this.f93287f) {
            this.f93287f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f93287f;
    }
}
