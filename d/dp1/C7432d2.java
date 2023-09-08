package dp1;

import ef1.C7637b;

/* renamed from: dp1.d2 */
public final class C7432d2 extends C7637b {

    /* renamed from: b */
    public final int f25621b;

    public C7432d2(int i) {
        this.f25621b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7432d2) && this.f25621b == ((C7432d2) obj).f25621b;
    }

    public int hashCode() {
        return this.f25621b;
    }

    public String toString() {
        return "PlayEvent(initPos=" + this.f25621b + ')';
    }
}
