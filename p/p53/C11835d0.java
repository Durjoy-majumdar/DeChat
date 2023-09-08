package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C8480h;
import hp3.C87581a;
import m53.C10756c;
import ob0.C89132b;
import p53.C11831b0;
import r53.C12953c;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C51224sc2;

/* renamed from: p53.d0 */
public final class C11835d0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11831b0 f34605a;

    public C11835d0(C11831b0 b0Var) {
        this.f34605a = b0Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MicroMsg.WeCoinRechargeViewModel", "getWecoinPageInfoRequest errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
        if (C12953c.m12398g(cVar)) {
            C11831b0 b0Var = this.f34605a;
            if (b0Var.f34597o == null) {
                b0Var.f34595j.postValue(new C11828a(cVar.f256793a, cVar.f256794b, cVar.f256795c, (C49335eu3) null, 8, (C8480h) null));
            }
            this.f34605a.mo11720c3(3, cVar.f256794b, cVar.f256795c);
        } else {
            T t = cVar.f256796d;
            if (t == null) {
                C11831b0 b0Var2 = this.f34605a;
                if (b0Var2.f34597o == null) {
                    b0Var2.f34595j.postValue(new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null));
                }
                this.f34605a.mo11720c3(3, 3, "callback resp is null");
            } else {
                C51224sc2 sc22 = (C51224sc2) t;
                C11831b0 b0Var3 = this.f34605a;
                C12953c.m12402k("MicroMsg.WeCoinRechargeViewModel", sc22);
                b0Var3.f34591f.postValue(new C11842j(sc22.f141435h, sc22.f141432e));
                b0Var3.f34590e.postValue(Long.valueOf(sc22.f141431d));
                b0Var3.f34592g.postValue(sc22.f141436i);
                b0Var3.f34593h.postValue(sc22.f141433f);
                b0Var3.f34594i.postValue(sc22.f141437j);
                b0Var3.f34596n.postValue(new C11831b0.C11832a(sc22.f141438n, sc22.f141439o));
                b0Var3.f34597o = sc22;
                C12953c.m12403l(sc22.f141431d);
                b0Var3.f34598p.postValue(Boolean.valueOf(((C10756c) C86709a0.m107533q(C10756c.class)).mo10998j3()));
                b0Var3.mo11720c3(3, 0, "");
            }
        }
        return C13598b0.f38549a;
    }
}
