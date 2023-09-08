package rl1;

import al1.C0082q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import te3.C52204z21;

/* renamed from: rl1.h0 */
public final class C13040h0 extends C87413o implements C32226l<C0082q, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f37145d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13040h0(String str) {
        super(1);
        this.f37145d = str;
    }

    public Object invoke(Object obj) {
        C0082q qVar = (C0082q) obj;
        C87412m.m108594g(qVar, "item");
        C52204z21 z212 = qVar.f509d;
        return Boolean.valueOf(C87412m.m108589b(z212 != null ? z212.f145640d : null, this.f37145d));
    }
}
