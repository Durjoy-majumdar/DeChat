package n04;

import gy3.C8480h;
import gy3.C87412m;
import xy3.C26571h;

/* renamed from: n04.y */
public final class C25195y extends C25167p1 {

    /* renamed from: d */
    public static final /* synthetic */ int f71648d = 0;

    /* renamed from: b */
    public final C25167p1 f71649b;

    /* renamed from: c */
    public final C25167p1 f71650c;

    public C25195y(C25167p1 p1Var, C25167p1 p1Var2, C8480h hVar) {
        this.f71649b = p1Var;
        this.f71650c = p1Var2;
    }

    /* renamed from: a */
    public boolean mo52289a() {
        return this.f71649b.mo52289a() || this.f71650c.mo52289a();
    }

    /* renamed from: b */
    public boolean mo37098b() {
        return this.f71649b.mo37098b() || this.f71650c.mo37098b();
    }

    /* renamed from: c */
    public C26571h mo52305c(C26571h hVar) {
        C87412m.m108594g(hVar, "annotations");
        return this.f71650c.mo52305c(this.f71649b.mo52305c(hVar));
    }

    /* renamed from: d */
    public C25158m1 mo37099d(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "key");
        C25158m1 d = this.f71649b.mo37099d(j0Var);
        return d == null ? this.f71650c.mo37099d(j0Var) : d;
    }

    /* renamed from: f */
    public C25143j0 mo52306f(C25143j0 j0Var, C25202z1 z1Var) {
        C87412m.m108594g(j0Var, "topLevelType");
        C87412m.m108594g(z1Var, "position");
        return this.f71650c.mo52306f(this.f71649b.mo52306f(j0Var, z1Var), z1Var);
    }
}
