package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import r53.C12951a;
import r53.C12953c;
import r53.C12959f;
import rx3.C13598b0;
import te3.C49335eu3;
import te3.C51526uc2;

/* renamed from: p53.g */
public final class C11839g<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11840h f34609a;

    /* renamed from: b */
    public final /* synthetic */ int f34610b;

    public C11839g(C11840h hVar, int i) {
        this.f34609a = hVar;
        this.f34610b = i;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MicroMsg.RechargeProductsDialogViewModel", "getWecoinPriceListInfo errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
        C11840h hVar = this.f34609a;
        hVar.f34618n = null;
        C12951a.m12391a(hVar.f34616i, Boolean.FALSE);
        if (C12953c.m12398g(cVar)) {
            if (this.f34609a.f34617j.getValue() == null) {
                C12951a.m12391a(this.f34609a.f34614g, new C11828a(cVar.f256793a, cVar.f256794b, cVar.f256795c, (C49335eu3) null, 8, (C8480h) null));
                this.f34609a.mo11725e3();
            }
            this.f34609a.mo11723c3(8, 3, cVar.f256794b, cVar.f256795c);
        } else {
            T t = cVar.f256796d;
            if (t == null) {
                if (this.f34609a.f34617j.getValue() == null) {
                    C12951a.m12391a(this.f34609a.f34614g, new C11828a(3, -1, "", (C49335eu3) null, 8, (C8480h) null));
                    this.f34609a.mo11725e3();
                }
                this.f34609a.mo11723c3(8, 3, 3, "callback resp is null");
            } else {
                C51526uc2 uc22 = (C51526uc2) t;
                C11840h hVar2 = this.f34609a;
                int i = this.f34610b;
                C12953c.m12402k("MicroMsg.RechargeProductsDialogViewModel", uc22);
                hVar2.f34612e.postValue(uc22.f142740e);
                hVar2.f34613f.postValue(Integer.valueOf(uc22.f142741f));
                hVar2.f34619o = uc22.f142742g;
                hVar2.f34617j.postValue(uc22);
                Log.m105918d("MicroMsg.WeCoinUtils", "save WecoinPriceListResponse snapshot");
                C61926c.m72656A((String) null, new C12959f(uc22, i));
                hVar2.mo11723c3(8, 3, 0, "");
            }
        }
        return C13598b0.f38549a;
    }
}
