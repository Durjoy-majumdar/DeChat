package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51281sq;
import te3.C64687rq;

/* renamed from: e21.k */
public class C58518k extends C75128o0<C51281sq> {
    public C58518k(double d, String str, String str2, String str3, String str4, String str5, C89349b bVar, String str6, boolean z, String str7) {
        String str8 = str6;
        String str9 = str7;
        Log.m105924i("MicroMsg.CgiSaveQrcodeMch", "CgiSaveQrcodeMch request ");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C64687rq rqVar = new C64687rq();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        double d2 = d;
        sb4.append(d);
        sb4.append("");
        sb.append(C75228t.m90231X(sb4.toString(), "100"));
        sb.append("");
        rqVar.f185222d = sb.toString();
        rqVar.f185223e = str;
        rqVar.f185224f = str2;
        rqVar.f185225g = str3;
        rqVar.f185226h = str4;
        rqVar.f185227i = str5;
        rqVar.f185228j = bVar;
        rqVar.f185229n = str8;
        rqVar.f185230o = z;
        rqVar.f185231p = str9;
        Log.m105925i("MicroMsg.CgiSaveQrcodeMch", "fee：%s desc:%s desc_required:%s descPlaceholder:%s", Double.valueOf(d), str8, Boolean.valueOf(z), str9);
        bVar2.f127066a = rqVar;
        bVar2.f127067b = new C51281sq();
        bVar2.f127068c = "/cgi-bin/mmpay-bin/sjtsaveqrcheck";
        bVar2.f127069d = 5166;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        mo123453j(bVar2.mo72403a());
    }
}
