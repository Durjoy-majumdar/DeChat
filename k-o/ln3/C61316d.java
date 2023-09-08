package ln3;

import gy3.C87412m;
import p749xh.C38624o3;

/* renamed from: ln3.d */
public final class C61316d extends C76709a<C61316d> {

    /* renamed from: u */
    public final C38624o3 f174434u;

    public C61316d(C38624o3 o3Var) {
        C87412m.m108594g(o3Var, "data");
        this.f174434u = o3Var;
    }

    /* renamed from: c */
    public int mo75c() {
        return C76709a.f224429o;
    }

    /* renamed from: d */
    public int mo86281d() {
        return 0;
    }

    /* renamed from: g */
    public int mo86282g(Object obj) {
        C61316d dVar = (C61316d) obj;
        C87412m.m108594g(dVar, "other");
        return (int) (this.f174434u.field_timeStamp - dVar.f174434u.field_timeStamp);
    }

    public long getItemId() {
        return this.f174434u.field_liveId;
    }
}
