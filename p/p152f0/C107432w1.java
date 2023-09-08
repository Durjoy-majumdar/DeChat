package p152f0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C104240b;
import p009c2.C104247d;
import p155g0.C107655y;
import p735w1.C111703v;
import p735w1.C38006x;

/* renamed from: f0.w1 */
public final class C107432w1 extends C87413o implements C32226l<C107655y, C104247d> {

    /* renamed from: d */
    public static final C107432w1 f321437d = new C107432w1();

    public C107432w1() {
        super(1);
    }

    public Object invoke(Object obj) {
        C107655y yVar = (C107655y) obj;
        C87412m.m108594g(yVar, "$this$deleteIfSelectedOr");
        C111703v vVar = yVar.f322001c;
        Integer valueOf = vVar != null ? Integer.valueOf(yVar.mo158031d(vVar, yVar.f322002d.mo145897b(C38006x.m41695c(yVar.f322004f)))) : null;
        if (valueOf == null) {
            return null;
        }
        return new C104240b(C38006x.m41695c(yVar.f322004f) - valueOf.intValue(), 0);
    }
}
