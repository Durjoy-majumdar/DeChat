package cm1;

import gy3.C87412m;
import rx3.C36570n;
import tf1.C13914m;
import up1.C14270b0;

/* renamed from: cm1.b */
public final class C0711b implements C0740i2 {

    /* renamed from: d */
    public final C14270b0 f1708d;

    public C0711b(C14270b0 b0Var) {
        C87412m.m108594g(b0Var, "localItem");
        this.f1708d = b0Var;
    }

    /* renamed from: c */
    public int mo75c() {
        return this.f1708d.f39813a.f138528d;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0711b) || !((C0711b) mVar).f1708d.mo13638a(this.f1708d)) ? -1 : 0;
    }

    public long getItemId() {
        return ((Number) ((C36570n) this.f1708d.f39814b).getValue()).longValue();
    }

    public String toString() {
        return "ItemId=" + getItemId() + ",ItemType=" + mo75c() + ' ';
    }
}
