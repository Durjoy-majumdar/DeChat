package p04;

import gy3.C87412m;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import n04.C25143j0;
import n04.C25144j1;
import o04.C25323e;
import sx3.C64186f0;
import ty3.C26333e;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26446d1;

/* renamed from: p04.h */
public final class C25415h implements C25144j1 {

    /* renamed from: a */
    public final C25416i f71965a;

    /* renamed from: b */
    public final String[] f71966b;

    /* renamed from: c */
    public final String f71967c;

    public C25415h(C25416i iVar, String... strArr) {
        C87412m.m108594g(iVar, "kind");
        C87412m.m108594g(strArr, "formatParams");
        this.f71965a = iVar;
        this.f71966b = strArr;
        String str = iVar.f71998d;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        C87412m.m108593f(format, "format(this, *args)");
        String format2 = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{format}, 1));
        C87412m.m108593f(format2, "format(this, *args)");
        this.f71967c = format2;
    }

    public List<C26446d1> getParameters() {
        return C64186f0.f181907d;
    }

    /* renamed from: m */
    public C26336h mo37092m() {
        C26333e eVar = C26333e.f73353f;
        return C26333e.f73353f;
    }

    /* renamed from: n */
    public C25144j1 mo37093n(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: o */
    public C22935h mo37094o() {
        C25417j.f72000a.getClass();
        return C25417j.f72002c;
    }

    /* renamed from: p */
    public boolean mo37095p() {
        return false;
    }

    /* renamed from: r */
    public Collection<C25143j0> mo37096r() {
        return C64186f0.f181907d;
    }

    public String toString() {
        return this.f71967c;
    }
}
