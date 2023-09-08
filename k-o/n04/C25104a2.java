package n04;

import g04.C20770i;
import gy3.C87412m;
import java.util.List;

/* renamed from: n04.a2 */
public abstract class C25104a2 extends C25143j0 {
    /* renamed from: I0 */
    public List<C25158m1> mo37079I0() {
        return mo52230O0().mo37079I0();
    }

    /* renamed from: J0 */
    public C25122g1 mo37080J0() {
        return mo52230O0().mo37080J0();
    }

    /* renamed from: K0 */
    public C25144j1 mo37081K0() {
        return mo52230O0().mo37081K0();
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return mo52230O0().mo37082L0();
    }

    /* renamed from: N0 */
    public final C25198y1 mo52229N0() {
        C25143j0 O0 = mo52230O0();
        while (O0 instanceof C25104a2) {
            O0 = ((C25104a2) O0).mo52230O0();
        }
        C87412m.m108592e(O0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (C25198y1) O0;
    }

    /* renamed from: O0 */
    public abstract C25143j0 mo52230O0();

    /* renamed from: P0 */
    public boolean mo52231P0() {
        return true;
    }

    /* renamed from: n */
    public C20770i mo37088n() {
        return mo52230O0().mo37088n();
    }

    public String toString() {
        return mo52231P0() ? mo52230O0().toString() : "<Not computed yet>";
    }
}
