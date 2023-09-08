package cm1;

import gy3.C87412m;
import tf1.C13914m;

/* renamed from: cm1.e0 */
public final class C0727e0 implements C0740i2 {
    /* renamed from: c */
    public int mo75c() {
        return 2005;
    }

    public boolean equals(Object obj) {
        C0727e0 e0Var = obj instanceof C0727e0 ? (C0727e0) obj : null;
        return e0Var != null && ((long) e0Var.hashCode()) == ((long) hashCode());
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return ((mVar instanceof C0727e0 ? (C0727e0) mVar : null) == null || ((long) mVar.hashCode()) != ((long) hashCode())) ? -1 : 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }

    public String toString() {
        return "MoreLiveListItem" + ((long) hashCode());
    }
}
