package d50;

import gy3.C8480h;

/* renamed from: d50.c */
public final class C31070c {

    /* renamed from: a */
    public int f83322a;

    public C31070c() {
        this(0, 1, (C8480h) null);
    }

    public C31070c(int i, int i2, C8480h hVar) {
        this.f83322a = (i2 & 1) != 0 ? 0 : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31070c) && this.f83322a == ((C31070c) obj).f83322a;
    }

    public int hashCode() {
        return this.f83322a;
    }

    public String toString() {
        return "LiveConfig(micWaveThresHolder=" + this.f83322a + ')';
    }
}
