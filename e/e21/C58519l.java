package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50434mq;
import te3.C64531lq;

/* renamed from: e21.l */
public class C58519l extends C75128o0<C50434mq> {
    public C58519l(int i, int i2, String str, String str2, C89349b bVar, boolean z, String str3) {
        Log.m105925i("MicroMsg.CgiSaveQrcodeNotify", "CgiSaveQrcodeNotify request：notifyType：%s，amount：%s，memo：%s，url：%s , desc_required:%s descPlaceholder:%s ", Integer.valueOf(i), Integer.valueOf(i2), str, str2, Boolean.valueOf(z), str3);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C64531lq lqVar = new C64531lq();
        lqVar.f184143d = i;
        lqVar.f184144e = i2;
        lqVar.f184145f = str;
        lqVar.f184146g = str2;
        lqVar.f184147h = (int) (System.currentTimeMillis() / 1000);
        lqVar.f184148i = bVar;
        lqVar.f184149j = z;
        lqVar.f184150n = str3;
        bVar2.f127066a = lqVar;
        bVar2.f127067b = new C50434mq();
        bVar2.f127068c = "/cgi-bin/mmpay-bin/qrcodesavenotify";
        bVar2.f127069d = 3781;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        mo123453j(bVar2.mo72403a());
    }
}
