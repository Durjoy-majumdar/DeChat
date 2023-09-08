package p152f0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p009c2.C104240b;
import p009c2.C104247d;
import p155g0.C107655y;
import p735w1.C38006x;

/* renamed from: f0.y1 */
public final class C107438y1 extends C87413o implements C32226l<C107655y, C104247d> {

    /* renamed from: d */
    public static final C107438y1 f321449d = new C107438y1();

    public C107438y1() {
        super(1);
    }

    public Object invoke(Object obj) {
        C107655y yVar = (C107655y) obj;
        C87412m.m108594g(yVar, "$this$deleteIfSelectedOr");
        Integer b = yVar.mo158029b();
        if (b == null) {
            return null;
        }
        return new C104240b(C38006x.m41695c(yVar.f322004f) - b.intValue(), 0);
    }
}
