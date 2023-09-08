package qj1;

import android.view.View;
import android.widget.TextView;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import ig1.C8916d;
import l31.C61212e;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: qj1.ad */
public final class C12248ad extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12772zc f35325d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12248ad(C12772zc zcVar) {
        super(0);
        this.f35325d = zcVar;
    }

    public Object invoke() {
        CharSequence charSequence;
        if (this.f35325d.mo14483f0() == 0) {
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            View b1 = this.f35325d.mo12319b1();
            C13604l[] lVarArr = new C13604l[3];
            lVarArr[0] = new C13604l(this.f35325d.f36574A, 2);
            C12772zc zcVar = this.f35325d;
            String str = zcVar.f36584y;
            C8916d dVar = zcVar.f36583x;
            CharSequence charSequence2 = "";
            if (dVar == null || (charSequence = dVar.field_rewardProductId) == null) {
                charSequence = charSequence2;
            }
            lVarArr[1] = new C13604l(str, charSequence);
            String str2 = zcVar.f36585z;
            CharSequence text = ((TextView) ((C36570n) zcVar.f36577r).getValue()).getText();
            if (text != null) {
                charSequence2 = text;
            }
            lVarArr[2] = new C13604l(str2, charSequence2);
            eVar.mo86153W7("view_clk", b1, C90364q0.m113147f(lVarArr), 25561);
            this.f35325d.mo12318a1();
        }
        return C13598b0.f38549a;
    }
}
