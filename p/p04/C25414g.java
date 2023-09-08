package p04;

import g04.C20770i;
import gy3.C87412m;
import java.util.Arrays;
import java.util.List;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25158m1;
import n04.C25176s0;
import n04.C25198y1;
import o04.C25323e;

/* renamed from: p04.g */
public final class C25414g extends C25176s0 {

    /* renamed from: e */
    public final C25144j1 f71958e;

    /* renamed from: f */
    public final C20770i f71959f;

    /* renamed from: g */
    public final C25416i f71960g;

    /* renamed from: h */
    public final List<C25158m1> f71961h;

    /* renamed from: i */
    public final boolean f71962i;

    /* renamed from: j */
    public final String[] f71963j;

    /* renamed from: n */
    public final String f71964n;

    public C25414g(C25144j1 j1Var, C20770i iVar, C25416i iVar2, List<? extends C25158m1> list, boolean z, String... strArr) {
        C87412m.m108594g(j1Var, "constructor");
        C87412m.m108594g(iVar, "memberScope");
        C87412m.m108594g(iVar2, "kind");
        C87412m.m108594g(list, "arguments");
        C87412m.m108594g(strArr, "formatParams");
        this.f71958e = j1Var;
        this.f71959f = iVar;
        this.f71960g = iVar2;
        this.f71961h = list;
        this.f71962i = z;
        this.f71963j = strArr;
        String str = iVar2.f71998d;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        C87412m.m108593f(format, "format(format, *args)");
        this.f71964n = format;
    }

    /* renamed from: I0 */
    public List<C25158m1> mo37079I0() {
        return this.f71961h;
    }

    /* renamed from: J0 */
    public C25122g1 mo37080J0() {
        C25122g1.f71557e.getClass();
        return C25122g1.f71558f;
    }

    /* renamed from: K0 */
    public C25144j1 mo37081K0() {
        return this.f71958e;
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return this.f71962i;
    }

    /* renamed from: M0 */
    public C25143j0 mo37083M0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: P0 */
    public C25198y1 mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: Q0 */
    public C25198y1 mo51873Q0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return this;
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        C25144j1 j1Var = this.f71958e;
        C20770i iVar = this.f71959f;
        C25416i iVar2 = this.f71960g;
        List<C25158m1> list = this.f71961h;
        String[] strArr = this.f71963j;
        return new C25414g(j1Var, iVar, iVar2, list, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return this;
    }

    /* renamed from: n */
    public C20770i mo37088n() {
        return this.f71959f;
    }
}
