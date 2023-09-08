package o53;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import m53.C10763i;
import ob0.C89132b;
import qo3.C89779i0;
import r53.C12953c;
import rx3.C13598b0;

/* renamed from: o53.n */
public final class C11369n<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11371p f33472a;

    public C11369n(C11371p pVar) {
        this.f33472a = pVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("WeCoinEncashLogic", "getRealNameAuthRequest errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
        C89779i0 i0Var = this.f33472a.f33477d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (C12953c.m12397f(cVar)) {
            C10763i iVar = this.f33472a.f33476c.get();
            if (iVar != null) {
                iVar.mo11006a2();
            }
        } else {
            C10763i iVar2 = this.f33472a.f33476c.get();
            if (iVar2 != null) {
                iVar2.mo11005M1();
            }
            this.f33472a.mo11385b();
        }
        return C13598b0.f38549a;
    }
}
