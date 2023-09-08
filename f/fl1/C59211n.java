package fl1;

import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vk1.C65760a;

/* renamed from: fl1.n */
public final class C59211n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169356d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59211n(C59161f fVar) {
        super(0);
        this.f169356d = fVar;
    }

    public Object invoke() {
        Class cls = C54991o.class;
        C59161f fVar = this.f169356d;
        C65760a aVar = fVar.f166837f;
        if (aVar != null) {
            AppCompatActivity appCompatActivity = fVar.f166836e;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            aVar.goGetLuckMoney((MMActivity) appCompatActivity, ((C54991o) this.f169356d.mo83051g(cls)).f154337l3, true);
        }
        ((C54991o) this.f169356d.mo83051g(cls)).f154337l3 = null;
        return C13598b0.f38549a;
    }
}
