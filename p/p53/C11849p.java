package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import hp3.C87581a;
import ob0.C89132b;
import p244tt.C14088e;
import r53.C12953c;
import rx3.C13598b0;
import te3.C48943c22;
import te3.C49335eu3;
import te3.C50292lo2;

/* renamed from: p53.p */
public final class C11849p<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11851r f34652a;

    public C11849p(C11851r rVar) {
        this.f34652a = rVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("getIncomePageInfoRequest errorType: ");
        sb.append(cVar.f256793a);
        sb.append(", errorCode: ");
        sb.append(cVar.f256794b);
        sb.append(", errorMsg: ");
        sb.append(cVar.f256795c);
        sb.append(",pending_income_balance:");
        C48943c22 c222 = (C48943c22) cVar.f256796d;
        String str = null;
        sb.append(c222 != null ? Long.valueOf(c222.f131464o) : null);
        Log.m105924i("MicroMsg.WeCoinIncomeDetailViewModel", sb.toString());
        if (C12953c.m12398g(cVar)) {
            C11851r rVar = this.f34652a;
            if (rVar.f34665q == null) {
                rVar.f34662n.postValue(new C11828a(cVar.f256793a, cVar.f256794b, cVar.f256795c, (C49335eu3) null, 8, (C8480h) null));
            }
            this.f34652a.mo11731d3("", 9, 3, cVar.f256794b, cVar.f256795c);
        } else {
            T t = cVar.f256796d;
            if (t == null) {
                C11851r rVar2 = this.f34652a;
                if (rVar2.f34665q == null) {
                    rVar2.f34662n.postValue(new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null));
                }
                this.f34652a.mo11731d3("", 9, 3, 3, "callback resp is null");
            } else {
                C48943c22 c223 = (C48943c22) t;
                C11851r rVar3 = this.f34652a;
                C12953c.m12402k("MicroMsg.WeCoinIncomeDetailViewModel", c223);
                rVar3.f34656e.postValue(c223.f131457e);
                rVar3.f34657f.postValue(c223.f131458f);
                rVar3.f34658g.postValue(Long.valueOf(c223.f131456d));
                rVar3.f34659h.postValue(Long.valueOf(c223.f131464o));
                rVar3.f34660i.postValue(c223.f131460h);
                rVar3.f34661j.postValue(c223.f131459g);
                rVar3.f34665q = c223;
                rVar3.f34666r = c223.f131465p;
                Log.m105924i("MicroMsg.WeCoinIncomeDetailViewModel", "getIncomePageInfoRequest encashInterceptJumpInfo: " + rVar3.mo11730c3());
                C50292lo2 lo22 = rVar3.f34666r;
                if (lo22 != null) {
                    String str2 = lo22.f137549d;
                    if (!(str2 == null || str2.length() == 0)) {
                        C14088e eVar = (C14088e) C86312j.m106911c(C14088e.class);
                        C50292lo2 lo23 = rVar3.f34666r;
                        if (lo23 != null) {
                            str = lo23.f137549d;
                        }
                        if (str == null) {
                            str = "";
                        }
                        eVar.u50(str, new C11848o(rVar3));
                    }
                }
                rVar3.mo11731d3("", 9, 3, 0, "");
            }
        }
        return C13598b0.f38549a;
    }
}
