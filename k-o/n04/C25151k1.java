package n04;

import gy3.C87412m;
import java.util.Map;

/* renamed from: n04.k1 */
public final class C25151k1 extends C25154l1 {

    /* renamed from: c */
    public final /* synthetic */ Map<C25144j1, C25158m1> f71603c;

    /* renamed from: d */
    public final /* synthetic */ boolean f71604d;

    public C25151k1(Map<C25144j1, ? extends C25158m1> map, boolean z) {
        this.f71603c = map;
        this.f71604d = z;
    }

    /* renamed from: a */
    public boolean mo52289a() {
        return this.f71604d;
    }

    /* renamed from: e */
    public boolean mo52261e() {
        return this.f71603c.isEmpty();
    }

    /* renamed from: g */
    public C25158m1 mo52290g(C25144j1 j1Var) {
        C87412m.m108594g(j1Var, "key");
        return this.f71603c.get(j1Var);
    }
}
