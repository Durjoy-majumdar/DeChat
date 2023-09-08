package p515f2;

import android.graphics.Typeface;
import android.text.Spannable;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104021p;
import p451b2.C104022q;
import p735w1.C111699r;
import p925z1.C79302k;
import rx3.C13598b0;

/* renamed from: f2.d */
public final class C107447d extends C87413o implements C32228q<C111699r, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Spannable f321466d;

    /* renamed from: e */
    public final /* synthetic */ C32229r<C104014i, C104022q, C104020o, C104021p, Typeface> f321467e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107447d(Spannable spannable, C32229r<? super C104014i, ? super C104022q, ? super C104020o, ? super C104021p, ? extends Typeface> rVar) {
        super(3);
        this.f321466d = spannable;
        this.f321467e = rVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C111699r rVar = (C111699r) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        C87412m.m108594g(rVar, "spanStyle");
        Spannable spannable = this.f321466d;
        C32229r<C104014i, C104022q, C104020o, C104021p, Typeface> rVar2 = this.f321467e;
        C104014i iVar = rVar.f334346f;
        C104022q qVar = rVar.f334343c;
        if (qVar == null) {
            qVar = C104022q.f307654i;
        }
        C104020o oVar = rVar.f334344d;
        C104020o oVar2 = new C104020o(oVar != null ? oVar.f307648a : 0);
        C104021p pVar = rVar.f334345e;
        spannable.setSpan(new C79302k(rVar2.mo162I(iVar, qVar, oVar2, new C104021p(pVar != null ? pVar.f307649a : 1))), intValue, intValue2, 33);
        return C13598b0.f38549a;
    }
}
