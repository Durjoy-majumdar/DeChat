package e21;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.lt4;
import te3.mt4;

/* renamed from: e21.n */
public class C45541n extends C75128o0<mt4> {
    public C45541n(int i) {
        Log.m105925i("MicroMsg.CgiVoiceOperateSwitchMch", "CgiSaveQrcodeNotifyMch request：op_type：%s", Integer.valueOf(i));
        C47350c.C47352b bVar = new C47350c.C47352b();
        lt4 lt4 = new lt4();
        lt4.f137641d = i;
        bVar.f127066a = lt4;
        bVar.f127067b = new mt4();
        bVar.f127068c = "/cgi-bin/mmpay-bin/sjtoprecvvoice";
        bVar.f127069d = 4997;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
    }
}
