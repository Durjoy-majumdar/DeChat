package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50022jq;
import te3.C50163kq;

/* renamed from: e21.m */
public class C45540m extends C75128o0<C50163kq> {
    public C45540m(int i, int i2, String str, String str2, C89349b bVar, boolean z, String str3) {
        Log.m105925i("MicroMsg.CgiSaveQrcodeNotifyMch", "CgiSaveQrcodeNotifyMch request：notifyType：%s，amount：%s，memo：%s，url：%s , desc_required:%s descPlaceholder:%s ", Integer.valueOf(i), Integer.valueOf(i2), str, str2, Boolean.valueOf(z), str3);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C50022jq jqVar = new C50022jq();
        jqVar.f136248d = i;
        jqVar.f136249e = i2;
        jqVar.f136250f = str;
        jqVar.f136251g = str2;
        jqVar.f136252h = (long) ((int) (System.currentTimeMillis() / 1000));
        jqVar.f136253i = bVar;
        jqVar.f136254j = z;
        jqVar.f136255n = str3;
        bVar2.f127066a = jqVar;
        bVar2.f127067b = new C50163kq();
        bVar2.f127068c = "/cgi-bin/mmpay-bin/sjtsaveqrnotify";
        bVar2.f127069d = 4590;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        mo123453j(bVar2.mo72403a());
    }
}
