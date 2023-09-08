package p04;

import gy3.C87412m;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25158m1;
import sx3.C22415w0;
import sx3.C64186f0;
import vz3.C22830f;
import wy3.C26448e0;
import wy3.C26469k;
import wy3.C26504r0;

/* renamed from: p04.j */
public final class C25417j {

    /* renamed from: a */
    public static final C25417j f72000a = new C25417j();

    /* renamed from: b */
    public static final C26448e0 f72001b = C25410c.f71944d;

    /* renamed from: c */
    public static final C25407a f72002c;

    /* renamed from: d */
    public static final C25143j0 f72003d = m32698c(C25416i.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e */
    public static final C25143j0 f72004e = m32698c(C25416i.ERROR_PROPERTY_TYPE, new String[0]);

    /* renamed from: f */
    public static final C26504r0 f72005f;

    /* renamed from: g */
    public static final Set<C26504r0> f72006g;

    static {
        String format = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C87412m.m108593f(format, "format(this, *args)");
        f72002c = new C25407a(C22830f.m26796h(format));
        C25411d dVar = new C25411d();
        f72005f = dVar;
        f72006g = C22415w0.m26092a(dVar);
    }

    /* renamed from: a */
    public static final C25412e m32696a(C25413f fVar, boolean z, String... strArr) {
        C87412m.m108594g(fVar, "kind");
        C87412m.m108594g(strArr, "formatParams");
        return z ? new C25418k(fVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C25412e(fVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public static final C25412e m32697b(C25413f fVar, String... strArr) {
        C87412m.m108594g(fVar, "kind");
        C87412m.m108594g(strArr, "formatParams");
        return m32696a(fVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public static final C25414g m32698c(C25416i iVar, String... strArr) {
        C87412m.m108594g(iVar, "kind");
        C87412m.m108594g(strArr, "formatParams");
        C25417j jVar = f72000a;
        C64186f0 f0Var = C64186f0.f181907d;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        jVar.getClass();
        C87412m.m108594g(strArr2, "formatParams");
        return jVar.mo52648e(iVar, f0Var, jVar.mo52647d(iVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* renamed from: f */
    public static final boolean m32699f(C26469k kVar) {
        if (kVar != null) {
            C25417j jVar = f72000a;
            jVar.getClass();
            if (!(kVar instanceof C25407a)) {
                C26469k b = kVar.mo51892b();
                jVar.getClass();
                if ((b instanceof C25407a) || kVar == f72001b) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C25415h mo52647d(C25416i iVar, String... strArr) {
        C87412m.m108594g(iVar, "kind");
        C87412m.m108594g(strArr, "formatParams");
        return new C25415h(iVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public final C25414g mo52648e(C25416i iVar, List<? extends C25158m1> list, C25144j1 j1Var, String... strArr) {
        C87412m.m108594g(iVar, "kind");
        C87412m.m108594g(list, "arguments");
        C87412m.m108594g(j1Var, "typeConstructor");
        C87412m.m108594g(strArr, "formatParams");
        return new C25414g(j1Var, m32697b(C25413f.ERROR_TYPE_SCOPE, j1Var.toString()), iVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
