package bi1;

import gy3.C8480h;
import gy3.C87412m;
import wx3.C66212f;

/* renamed from: bi1.b */
public final class C0281b<T> extends C0287e {

    /* renamed from: b */
    public final T f843b;

    /* renamed from: c */
    public final C66212f f844c;

    public C0281b(T t, C66212f fVar) {
        super(fVar, (C8480h) null);
        this.f843b = t;
        this.f844c = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0281b)) {
            return false;
        }
        C0281b bVar = (C0281b) obj;
        return C87412m.m108589b(this.f843b, bVar.f843b) && C87412m.m108589b(this.f844c, bVar.f844c);
    }

    public int hashCode() {
        T t = this.f843b;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        C66212f fVar = this.f844c;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Fail(fail=" + this.f843b + ", context=" + this.f844c + ')';
    }
}
