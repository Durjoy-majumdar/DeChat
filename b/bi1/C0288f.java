package bi1;

import gy3.C8480h;
import gy3.C87412m;
import wx3.C66212f;

/* renamed from: bi1.f */
public final class C0288f<T> extends C0287e {

    /* renamed from: b */
    public final T f855b;

    /* renamed from: c */
    public final C66212f f856c;

    public C0288f(T t, C66212f fVar) {
        super(fVar, (C8480h) null);
        this.f855b = t;
        this.f856c = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0288f)) {
            return false;
        }
        C0288f fVar = (C0288f) obj;
        return C87412m.m108589b(this.f855b, fVar.f855b) && C87412m.m108589b(this.f856c, fVar.f856c);
    }

    public int hashCode() {
        T t = this.f855b;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        C66212f fVar = this.f856c;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Success(suc=" + this.f855b + ", context=" + this.f856c + ')';
    }
}
