package np1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import cl1.C54979h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C62042e;
import rx3.C13598b0;
import sk1.C13696v;

/* renamed from: np1.g */
public final class C61862g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61817a f175898d;

    /* renamed from: e */
    public final /* synthetic */ boolean f175899e;

    /* renamed from: f */
    public final /* synthetic */ C13696v f175900f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61862g(C61817a aVar, boolean z, C13696v vVar) {
        super(0);
        this.f175898d = aVar;
        this.f175899e = z;
        this.f175900f = vVar;
    }

    public Object invoke() {
        C62042e eVar = C62042e.f176370a;
        Context context = this.f175898d.f175772e.getContext();
        C87412m.m108593f(context, "root.context");
        eVar.mo87047U1(context, false);
        if (!this.f175899e) {
            Log.m105928w("Finder.LiveShoppingListPlugin", "get shop shelf failed");
        } else {
            C54979h1 h1Var = (C54979h1) this.f175898d.f175774g.mo71262a(C54979h1.class);
            String str = this.f175900f.f38761s.f142891A;
            if (str == null) {
                str = "";
            }
            h1Var.f154128U = str;
            this.f175898d.mo86749f(Boolean.FALSE);
            ((C54116w) C86312j.m106911c(C54116w.class)).Tx0(C54067f0.C54081r0.CommerceActionCouponClick, this.f175900f, "0");
        }
        return C13598b0.f38549a;
    }
}
