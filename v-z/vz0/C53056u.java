package vz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import te3.C22498fy;
import wz0.C53247c;

/* renamed from: vz0.u */
public class C53056u extends C22819h {

    /* renamed from: l */
    public String f148101l = "";

    /* renamed from: g */
    public C22818f0 mo35961g() {
        return new C53055t(this, this.f65605b);
    }

    /* renamed from: h */
    public String mo35962h(C53247c cVar) {
        return !Util.isNullOrNil(this.f65607d.mo23263J0().f63936C) ? this.f65607d.mo23263J0().f63936C : (!this.f65607d.mo23278d0() || Util.isNullOrNil(this.f148101l)) ? this.f65607d.mo23263J0().f63950o : this.f148101l;
    }

    /* renamed from: i */
    public C22818f0 mo35963i() {
        return new C53057v(this, this.f65605b);
    }

    /* renamed from: j */
    public C22818f0 mo35964j() {
        return new C53058w(this, this.f65605b);
    }

    /* renamed from: k */
    public boolean mo35965k(C20483c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        C20483c cVar2 = this.f65607d;
        if (cVar2 == null) {
            Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        } else if (cVar == null) {
            Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        } else {
            String str5 = cVar2.mo23263J0().f63950o;
            String str6 = cVar.mo23263J0().f63950o;
            if (Util.isNullOrNil(str5) || Util.isNullOrNil(str6) || str5.equals(str6)) {
                C22498fy fyVar = this.f65607d.mo23264L0().f64135Z;
                C22498fy fyVar2 = cVar.mo23264L0().f64135Z;
                if ((fyVar == null && fyVar2 != null) || (fyVar != null && fyVar2 == null)) {
                    Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
                    return true;
                } else if (fyVar != null && fyVar2 != null && (str3 = fyVar.f63884d) != null && (str4 = fyVar2.f63884d) != null && !str3.equals(str4)) {
                    Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
                    return true;
                } else if (fyVar != null && fyVar2 != null && (str = fyVar.f63886f) != null && (str2 = fyVar2.f63886f) != null && !str.equals(str2)) {
                    Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
                    return true;
                } else if (!this.f65607d.mo23278d0() || Util.isNullOrNil(this.f148101l)) {
                    return false;
                } else {
                    Log.m105924i("MicroMsg.CardCodeView", "dynamicCode updated！");
                    return true;
                }
            } else {
                Log.m105924i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
                return true;
            }
        }
    }
}
