package sp3;

/* renamed from: sp3.j */
public final class C110806j {

    /* renamed from: a */
    public final int f331496a;

    /* renamed from: b */
    public final int f331497b;

    /* renamed from: c */
    public final int f331498c;

    /* renamed from: d */
    public final int f331499d;

    public C110806j(int i, int i2, int i3, int i4) {
        this.f331496a = i;
        this.f331497b = i2;
        this.f331498c = i3;
        this.f331499d = i4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110806j) {
                C110806j jVar = (C110806j) obj;
                if (this.f331496a == jVar.f331496a) {
                    if (this.f331497b == jVar.f331497b) {
                        if (this.f331498c == jVar.f331498c) {
                            if (this.f331499d == jVar.f331499d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f331496a * 31) + this.f331497b) * 31) + this.f331498c) * 31) + this.f331499d;
    }

    public String toString() {
        return "VideoClipInfo(width=" + this.f331496a + ", height=" + this.f331497b + ", rotate=" + this.f331498c + ", durationMs=" + this.f331499d + ")";
    }
}
