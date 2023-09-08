package qy3;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import n04.C25143j0;
import sx3.C110818d0;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26463h1;
import wy3.C26504r0;
import wy3.C26509u0;
import wy3.C26516w;
import yz3.C23393c;

/* renamed from: qy3.p0 */
public final class C25974p0 {

    /* renamed from: a */
    public static final C25974p0 f72353a = new C25974p0();

    /* renamed from: b */
    public static final C23393c f72354b = C23393c.f67152a;

    /* renamed from: qy3.p0$a */
    public static final class C25975a extends C87413o implements C32226l<C26463h1, CharSequence> {

        /* renamed from: d */
        public static final C25975a f72355d = new C25975a();

        public C25975a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C25974p0 p0Var = C25974p0.f72353a;
            C25143j0 type = ((C26463h1) obj).getType();
            C87412m.m108593f(type, "it.type");
            return p0Var.mo52840d(type);
        }
    }

    /* renamed from: a */
    public final void mo52837a(StringBuilder sb, C26434a aVar) {
        C26509u0 e = C25987u0.m33174e(aVar);
        C26509u0 I = aVar.mo52627I();
        if (e != null) {
            C25143j0 type = e.getType();
            C87412m.m108593f(type, "receiver.type");
            sb.append(mo52840d(type));
            sb.append(".");
        }
        boolean z = (e == null || I == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        if (I != null) {
            C25143j0 type2 = I.getType();
            C87412m.m108593f(type2, "receiver.type");
            sb.append(mo52840d(type2));
            sb.append(".");
        }
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: b */
    public final String mo52838b(C26516w wVar) {
        C87412m.m108594g(wVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        C25974p0 p0Var = f72353a;
        p0Var.mo52837a(sb, wVar);
        C23393c cVar = f72354b;
        C22830f name = wVar.getName();
        C87412m.m108593f(name, "descriptor.name");
        sb.append(cVar.mo36862t(name, true));
        List<C26463h1> h = wVar.mo52639h();
        C87412m.m108593f(h, "descriptor.valueParameters");
        C110818d0.m150920R(h, sb, ", ", "(", ")", 0, (CharSequence) null, C25975a.f72355d, 48, (Object) null);
        sb.append(": ");
        C25143j0 returnType = wVar.getReturnType();
        C87412m.m108591d(returnType);
        sb.append(p0Var.mo52840d(returnType));
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: c */
    public final String mo52839c(C26504r0 r0Var) {
        C87412m.m108594g(r0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(r0Var.mo52631c0() ? "var " : "val ");
        C25974p0 p0Var = f72353a;
        p0Var.mo52837a(sb, r0Var);
        C23393c cVar = f72354b;
        C22830f name = r0Var.getName();
        C87412m.m108593f(name, "descriptor.name");
        sb.append(cVar.mo36862t(name, true));
        sb.append(": ");
        C25143j0 type = r0Var.getType();
        C87412m.m108593f(type, "descriptor.type");
        sb.append(p0Var.mo52840d(type));
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: d */
    public final String mo52840d(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "type");
        return f72354b.mo36863u(j0Var);
    }
}
