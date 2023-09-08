package di0;

import gy3.C87412m;

/* renamed from: di0.m */
public final class C7331m {

    /* renamed from: a */
    public final String f25445a;

    /* renamed from: b */
    public final int f25446b;

    public C7331m(String str, int i) {
        C87412m.m108594g(str, "snapshotPath");
        this.f25445a = str;
        this.f25446b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7331m)) {
            return false;
        }
        C7331m mVar = (C7331m) obj;
        return C87412m.m108589b(this.f25445a, mVar.f25445a) && this.f25446b == mVar.f25446b;
    }

    public int hashCode() {
        return (this.f25445a.hashCode() * 31) + this.f25446b;
    }

    public String toString() {
        return "NodeOnlySnapshotInfo(snapshotPath='" + this.f25445a + "', mainContextSnapshotIndex=" + this.f25446b + ')';
    }
}
