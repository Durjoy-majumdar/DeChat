package qj1;

import cj1.C54847z3;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pe3.C47465a;
import te3.C51416tm1;
import zp3.C23564m;

/* renamed from: qj1.b7 */
public final class C47843b7 extends C54847z3.C54849b<C51416tm1> {

    /* renamed from: b */
    public final /* synthetic */ C47844c7 f128422b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47843b7(C47844c7 c7Var, Class<C51416tm1> cls) {
        super(cls);
        this.f128422b = c7Var;
    }

    /* renamed from: a */
    public void mo9116a(C47465a aVar) {
        C51416tm1 tm12 = (C51416tm1) aVar;
        C87412m.m108594g(tm12, "result");
        Log.m105924i("FinderLiveGameWelfareTaskBubblePlugin", "#onPollingSuccess isMount=" + this.f128422b.f128424q);
        C47844c7 c7Var = this.f128422b;
        if (c7Var.f128424q) {
            C23564m.m28136f(new C47842a7(c7Var, tm12));
        }
    }
}
