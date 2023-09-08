package p53;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import r53.C12951a;
import r53.C12953c;
import rx3.C13598b0;
import te3.C48858bh3;
import te3.C49335eu3;
import te3.C49851ii2;

/* renamed from: p53.m */
public final class C11846m<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11844l f34648a;

    public C11846m(C11844l lVar) {
        this.f34648a = lVar;
    }

    public Object call(Object obj) {
        C49851ii2 ii22;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MicroMsg.WeCoinEncashViewModel", "prepareWecoinEncash errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
        C12951a.m12391a(this.f34648a.f34637i, Boolean.FALSE);
        if (C12953c.m12398g(cVar)) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1581, 92);
            T t = cVar.f256796d;
            C48858bh3 bh32 = (C48858bh3) t;
            if (bh32 == null || (ii22 = bh32.f131124f) == null) {
                this.f34648a.f34634f.postValue(new C11828a(cVar.f256793a, cVar.f256794b, cVar.f256795c, (C49335eu3) null, 8, (C8480h) null));
                this.f34648a.mo11728d3(6, 3, cVar.f256794b, cVar.f256795c);
            } else {
                C11844l lVar = this.f34648a;
                C87412m.m108593f(t, "cgiBack.resp");
                C12953c.m12402k("MicroMsg.WeCoinEncashViewModel", t);
                nVar.mo175911u(1581, 99);
                lVar.f34636h.postValue(cVar.f256796d);
                lVar.mo11728d3(6, 3, cVar.f256794b, ii22.f135362d);
            }
        } else {
            T t2 = cVar.f256796d;
            if (t2 == null) {
                C115669n.INSTANCE.mo175911u(1581, 92);
                this.f34648a.f34634f.postValue(new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null));
                this.f34648a.mo11728d3(6, 3, 3, "callback resp is null");
            } else {
                C48858bh3 bh33 = (C48858bh3) t2;
                C11844l lVar2 = this.f34648a;
                C115669n.INSTANCE.mo175911u(1581, 91);
                C12953c.m12402k("MicroMsg.WeCoinEncashViewModel", bh33);
                lVar2.f34639n = bh33.f131122d;
                lVar2.f34633e.postValue(bh33.f131123e);
                lVar2.mo11728d3(6, 3, 0, "");
            }
        }
        return C13598b0.f38549a;
    }
}
