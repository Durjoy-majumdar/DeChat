package hm3;

import gy3.C87412m;

/* renamed from: hm3.i */
public final class C32964i {

    /* renamed from: a */
    public final String f89565a;

    /* renamed from: b */
    public final long f89566b;

    public C32964i(String str, long j) {
        C87412m.m108594g(str, "soName");
        this.f89565a = str;
        this.f89566b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32964i)) {
            return false;
        }
        C32964i iVar = (C32964i) obj;
        return C87412m.m108589b(this.f89565a, iVar.f89565a) && this.f89566b == iVar.f89566b;
    }

    public int hashCode() {
        long j = this.f89566b;
        return (this.f89565a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MemoryHookInfo(soName=" + this.f89565a + ", soSize=" + this.f89566b + ')';
    }
}
