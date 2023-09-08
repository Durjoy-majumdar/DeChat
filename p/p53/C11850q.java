package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import hp3.C87581a;
import ob0.C89132b;
import r53.C12951a;
import r53.C12953c;
import rx3.C13598b0;
import te3.C49335eu3;

/* renamed from: p53.q */
public final class C11850q<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11851r f34653a;

    /* renamed from: b */
    public final /* synthetic */ String f34654b;

    public C11850q(C11851r rVar, String str) {
        this.f34653a = rVar;
        this.f34654b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MicroMsg.WeCoinIncomeDetailViewModel", "getRealNameAuthRequest errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
        C12951a.m12391a(this.f34653a.f34664p, Boolean.FALSE);
        if (C12953c.m12398g(cVar)) {
            this.f34653a.f34662n.postValue(new C11828a(cVar.f256793a, cVar.f256794b, cVar.f256795c, (C49335eu3) null, 8, (C8480h) null));
            this.f34653a.mo11731d3(this.f34654b, 10, 3, cVar.f256794b, cVar.f256795c);
        } else if (cVar.f256796d == null) {
            this.f34653a.f34662n.postValue(new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null));
            this.f34653a.mo11731d3(this.f34654b, 10, 3, 3, "callback resp is null");
        } else {
            this.f34653a.mo11731d3(this.f34654b, 10, 3, 0, "");
            this.f34653a.f34663o.postValue(Boolean.TRUE);
        }
        return C13598b0.f38549a;
    }
}
