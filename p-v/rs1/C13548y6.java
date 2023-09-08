package rs1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import te3.C50949qe1;

/* renamed from: rs1.y6 */
public final class C13548y6 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13502w6 f38428d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f38429e;

    /* renamed from: f */
    public final /* synthetic */ C50949qe1 f38430f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13548y6(C13502w6 w6Var, C60905o oVar, C50949qe1 qe12) {
        super(0);
        this.f38428d = w6Var;
        this.f38429e = oVar;
        this.f38430f = qe12;
    }

    public Object invoke() {
        C13502w6 w6Var = this.f38428d;
        C60905o oVar = this.f38429e;
        C50949qe1 qe12 = this.f38430f;
        w6Var.getClass();
        Log.m105924i("Finder.FinderNpsSurveyUIC", "popupSurveyLayout questionStyle=" + qe12.f140260g + " questionType=" + qe12.f140261h);
        int i = qe12.f140261h;
        if (i == 2) {
            w6Var.mo12904G3(oVar, qe12, (C32224a<C13598b0>) null);
        } else if (i == 1 && qe12.f140260g == 2) {
            w6Var.mo12905I3(oVar, qe12, (C32224a<C13598b0>) null);
        } else if (i == 1 && qe12.f140260g == 1) {
            w6Var.mo12903F3(oVar, qe12, (C32224a<C13598b0>) null);
        }
        return C13598b0.f38549a;
    }
}
