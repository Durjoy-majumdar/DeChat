package vz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import wz0.C53247c;

/* renamed from: vz0.m */
public class C53049m extends C22819h {
    /* renamed from: g */
    public C22818f0 mo35961g() {
        return new C53045g(this, this.f65605b);
    }

    /* renamed from: h */
    public String mo35962h(C53247c cVar) {
        return this.f65607d.mo23263J0().f63950o;
    }

    /* renamed from: i */
    public C22818f0 mo35963i() {
        return new C53059x(this, this.f65605b);
    }

    /* renamed from: j */
    public C22818f0 mo35964j() {
        return new C53060z(this, this.f65605b);
    }

    /* renamed from: k */
    public boolean mo35965k(C20483c cVar) {
        C20483c cVar2 = this.f65607d;
        if (cVar2 == null) {
            Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        } else if (cVar == null) {
            Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        } else {
            String str = cVar2.mo23263J0().f63950o;
            String str2 = cVar.mo23263J0().f63950o;
            if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || str.equals(str2)) {
                return false;
            }
            Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
            return true;
        }
    }
}
