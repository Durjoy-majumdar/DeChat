package p720v;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import my3.C61595o;
import p257w.C111669n;
import p436a1.C103272w;
import p436a1.C103276y;
import p450b1.C103979c;
import p450b1.C103981e;

/* renamed from: v.i */
public final class C111260i extends C87413o implements C32226l<C111669n, C103272w> {

    /* renamed from: d */
    public final /* synthetic */ C103979c f333141d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111260i(C103979c cVar) {
        super(1);
        this.f333141d = cVar;
    }

    public Object invoke(Object obj) {
        C111669n nVar = (C111669n) obj;
        C87412m.m108594g(nVar, LocaleUtil.ITALIAN);
        double d = (double) 3.0f;
        float pow = (float) Math.pow((double) nVar.f334278b, d);
        float pow2 = (float) Math.pow((double) nVar.f334279c, d);
        float pow3 = (float) Math.pow((double) nVar.f334280d, d);
        float[] fArr = C111263j.f333149c;
        float a = C111263j.m151770a(0, pow, pow2, pow3, fArr);
        float a2 = C111263j.m151770a(1, pow, pow2, pow3, fArr);
        float a3 = C111263j.m151770a(2, pow, pow2, pow3, fArr);
        return new C103272w(C103272w.m136779a(C103276y.m136790a(C61595o.m72296d(a, -2.0f, 2.0f), C61595o.m72296d(a2, -2.0f, 2.0f), C61595o.m72296d(a3, -2.0f, 2.0f), C61595o.m72296d(nVar.f334277a, 0.0f, 1.0f), C103981e.f307555r), this.f333141d));
    }
}
