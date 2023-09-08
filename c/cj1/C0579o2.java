package cj1;

import ak1.C54108o;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import qo3.C77426q;
import rx3.C13598b0;

/* renamed from: cj1.o2 */
public final class C0579o2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f1383d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f1384e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0579o2(Context context, C8479f0<String> f0Var) {
        super(0);
        this.f1383d = context;
        this.f1384e = f0Var;
    }

    public Object invoke() {
        C77426q qVar = new C77426q(this.f1383d);
        qVar.mo107595g(this.f1383d.getResources().getString(C0966R.string.dpr));
        qVar.mo107602n((String) this.f1384e.f27484d);
        qVar.mo107600l(C0574n2.f1378a);
        qVar.mo107603o();
        Log.m105924i("Finder.LiveJumpChecker", String.valueOf(this.f1383d.getResources().getString(C0966R.string.dpr)));
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c, 4, String.valueOf(1), (String) null, 4, (Object) null);
        return C13598b0.f38549a;
    }
}
