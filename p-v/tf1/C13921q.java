package tf1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;

/* renamed from: tf1.q */
public final class C13921q {

    /* renamed from: a */
    public final int f39115a;

    /* renamed from: b */
    public int f39116b;

    /* renamed from: c */
    public final LinkedList<Integer> f39117c;

    /* renamed from: d */
    public final boolean f39118d;

    /* renamed from: e */
    public boolean f39119e;

    public C13921q(int i, int i2, LinkedList<Integer> linkedList, boolean z, boolean z2) {
        C87412m.m108594g(linkedList, "changeIndex");
        this.f39115a = i;
        this.f39116b = i2;
        this.f39117c = linkedList;
        this.f39118d = z;
        this.f39119e = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13921q)) {
            return false;
        }
        C13921q qVar = (C13921q) obj;
        return this.f39115a == qVar.f39115a && this.f39116b == qVar.f39116b && C87412m.m108589b(this.f39117c, qVar.f39117c) && this.f39118d == qVar.f39118d && this.f39119e == qVar.f39119e;
    }

    public int hashCode() {
        int hashCode = ((((this.f39115a * 31) + this.f39116b) * 31) + this.f39117c.hashCode()) * 31;
        boolean z = this.f39118d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f39119e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "MergeResult(insertIndex=" + this.f39115a + ", insertCount=" + this.f39116b + ", changeIndex=" + this.f39117c + ", isRemoveBeforeInsert=" + this.f39118d + ", dataReplace=" + this.f39119e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13921q(int i, int i2, LinkedList linkedList, boolean z, boolean z2, int i3, C8480h hVar) {
        this(i, i2, linkedList, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }
}
