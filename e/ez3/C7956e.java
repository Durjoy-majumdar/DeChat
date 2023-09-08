package ez3;

import java.io.Serializable;

/* renamed from: ez3.e */
public final class C7956e implements Serializable {

    /* renamed from: f */
    public static final C7956e f26641f = new C7956e(-1, -1);

    /* renamed from: d */
    public final int f26642d;

    /* renamed from: e */
    public final int f26643e;

    public C7956e(int i, int i2) {
        this.f26642d = i;
        this.f26643e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7956e)) {
            return false;
        }
        C7956e eVar = (C7956e) obj;
        return this.f26642d == eVar.f26642d && this.f26643e == eVar.f26643e;
    }

    public int hashCode() {
        return (this.f26642d * 31) + this.f26643e;
    }

    public String toString() {
        return "Position(line=" + this.f26642d + ", column=" + this.f26643e + ')';
    }
}
