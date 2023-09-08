package zu0;

import gy3.C87412m;

/* renamed from: zu0.o */
public final class C23585o<T> {

    /* renamed from: a */
    public C23586p<T> f67654a;

    /* renamed from: b */
    public T f67655b;

    /* renamed from: c */
    public final long f67656c;

    public C23585o(C23586p<T> pVar, T t, long j) {
        this.f67654a = pVar;
        this.f67655b = t;
        this.f67656c = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23585o)) {
            return false;
        }
        C23585o oVar = (C23585o) obj;
        return C87412m.m108589b(this.f67654a, oVar.f67654a) && C87412m.m108589b(this.f67655b, oVar.f67655b) && this.f67656c == oVar.f67656c;
    }

    public int hashCode() {
        C23586p<T> pVar = this.f67654a;
        int i = 0;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        T t = this.f67655b;
        if (t != null) {
            i = t.hashCode();
        }
        long j = this.f67656c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FlowData(runnbale=" + this.f67654a + ", obj=" + this.f67655b + ", size=" + this.f67656c + ')';
    }
}
