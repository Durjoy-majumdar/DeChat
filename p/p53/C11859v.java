package p53;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import m53.C10762h;
import ob0.C89132b;
import r53.C12953c;
import te3.C50943qc2;

/* renamed from: p53.v */
public class C11859v implements C87581a<Object, C89132b.C89134c<C50943qc2>> {

    /* renamed from: a */
    public final /* synthetic */ C10762h f34678a;

    public C11859v(C11854u uVar, C10762h hVar) {
        this.f34678a = hVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WeCoinManagerImplement", "CgiGetWecoinBalanceRequest errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        if (C12953c.m12398g(cVar)) {
            C10762h hVar = this.f34678a;
            if (hVar == null) {
                return null;
            }
            hVar.mo605a(cVar.f256793a, cVar.f256794b, cVar.f256795c);
            return null;
        }
        C50943qc2 qc22 = (C50943qc2) cVar.f256796d;
        qc22.f140242e = false;
        if (this.f34678a == null) {
            return null;
        }
        Log.m105925i("MicroMsg.WeCoinManagerImplement", "CgiGetWecoinBalanceRequest response.balance: %s newUserDiscount: %s", Long.valueOf(qc22.f140241d), Boolean.valueOf(qc22.f140242e));
        C12953c.m12403l(qc22.f140241d);
        this.f34678a.onSuccess(qc22);
        return null;
    }
}
