package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import p53.C11862y;
import rx3.C13598b0;

/* renamed from: p53.x */
public final class C11861x<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11862y.C11863a f34680a;

    public C11861x(C11862y.C11863a aVar) {
        this.f34680a = aVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f34680a.mo11744a(5, 3, cVar.f256794b, cVar.f256795c);
        if (!(cVar.f256793a == 0 && cVar.f256794b == 0)) {
            Log.m105924i("MicroMsg.WeCoinMidasInitializer", "cancelWecoinRechargeRequest errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
