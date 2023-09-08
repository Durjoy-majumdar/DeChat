package hl1;

import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vk1.C65762c;

/* renamed from: hl1.i1 */
public final class C59982i1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171136d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59982i1(C59988k kVar) {
        super(0);
        this.f171136d = kVar;
    }

    public Object invoke() {
        Class cls = C54991o.class;
        C59988k kVar = this.f171136d;
        C65762c cVar = kVar.f166848f;
        if (cVar != null) {
            AppCompatActivity appCompatActivity = kVar.f166847e;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            cVar.goGetLuckMoney((MMActivity) appCompatActivity, ((C54991o) this.f171136d.mo83051g(cls)).f154337l3, !((C54991o) this.f171136d.mo83051g(cls)).mo76004h4());
        }
        ((C54991o) this.f171136d.mo83051g(cls)).f154337l3 = null;
        return C13598b0.f38549a;
    }
}
