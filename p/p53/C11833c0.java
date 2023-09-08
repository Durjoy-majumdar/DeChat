package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import hp3.C87581a;
import ob0.C89132b;
import r53.C12953c;
import rx3.C13598b0;
import te3.C51224sc2;

/* renamed from: p53.c0 */
public final class C11833c0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C11831b0 f34603a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f34604b;

    public C11833c0(C11831b0 b0Var, C32226l<? super Boolean, C13598b0> lVar) {
        this.f34603a = b0Var;
        this.f34604b = lVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105924i("MicroMsg.WeCoinRechargeViewModel", "getWecoinPageInfoRequest errorType: " + cVar.f256793a + ", errorCode: " + cVar.f256794b + ", errorMsg: " + cVar.f256795c);
        this.f34603a.f34600r.postValue(Boolean.FALSE);
        boolean z = true;
        if (C12953c.m12398g(cVar)) {
            C32226l<Boolean, C13598b0> lVar = this.f34604b;
            Long value = this.f34603a.f34590e.getValue();
            if (value != null && value.longValue() == 0) {
                z = false;
            }
            lVar.invoke(Boolean.valueOf(z));
        } else {
            C32226l<Boolean, C13598b0> lVar2 = this.f34604b;
            if (((C51224sc2) cVar.f256796d).f141431d == 0) {
                z = false;
            }
            lVar2.invoke(Boolean.valueOf(z));
        }
        return C13598b0.f38549a;
    }
}
