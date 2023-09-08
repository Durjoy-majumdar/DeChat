package ef1;

import cm1.C0740i2;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C9508q;

/* renamed from: ef1.i */
public final class C58564i {

    /* renamed from: a */
    public final C0740i2 f167636a;

    /* renamed from: b */
    public final int f167637b;

    /* renamed from: c */
    public C9508q f167638c;

    public C58564i(C0740i2 i2Var, int i, C9508q qVar, int i2, C8480h hVar) {
        qVar = (i2 & 4) != 0 ? null : qVar;
        C87412m.m108594g(i2Var, "feed");
        this.f167636a = i2Var;
        this.f167637b = i;
        this.f167638c = qVar;
    }

    /* renamed from: a */
    public final int mo83461a() {
        return this.f167637b;
    }

    /* renamed from: b */
    public final C0740i2 mo83462b() {
        return this.f167636a;
    }

    /* renamed from: c */
    public final C9508q mo83463c() {
        return this.f167638c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58564i)) {
            return false;
        }
        C58564i iVar = (C58564i) obj;
        return C87412m.m108589b(this.f167636a, iVar.f167636a) && this.f167637b == iVar.f167637b && C87412m.m108589b(this.f167638c, iVar.f167638c);
    }

    public int hashCode() {
        int hashCode = ((this.f167636a.hashCode() * 31) + this.f167637b) * 31;
        C9508q qVar = this.f167638c;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public String toString() {
        return "FlowScrollEventFeedData(feed=" + this.f167636a + ", dataPos=" + this.f167637b + ", showInfo=" + this.f167638c + ')';
    }
}
