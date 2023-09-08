package p152f0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.text.BreakIterator;
import p009c2.C104240b;
import p009c2.C104247d;
import p155g0.C107655y;
import p735w1.C38006x;

/* renamed from: f0.u1 */
public final class C107426u1 extends C87413o implements C32226l<C107655y, C104247d> {

    /* renamed from: d */
    public static final C107426u1 f321431d = new C107426u1();

    public C107426u1() {
        super(1);
    }

    public Object invoke(Object obj) {
        C107655y yVar = (C107655y) obj;
        C87412m.m108594g(yVar, "$this$deleteIfSelectedOr");
        int c = C38006x.m41695c(yVar.f322004f);
        String str = yVar.f322005g.f100413d;
        int c2 = C38006x.m41695c(yVar.f322004f);
        C87412m.m108594g(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return new C104240b(c - characterInstance.preceding(c2), 0);
    }
}
