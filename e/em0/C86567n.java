package em0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import java.util.HashMap;
import p576jp.C33610c;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.n */
public class C86567n extends C82926s {
    public static final int CTRL_INDEX = 520;
    public static final String NAME = "onVoIPChatInterrupted";

    /* renamed from: em0.n$a */
    public class C86568a {

        /* renamed from: a */
        public String f251485a;

        /* renamed from: b */
        public int f251486b;

        public C86568a(C86567n nVar, String str, int i) {
            this.f251485a = str;
            this.f251486b = i;
        }
    }

    public C86567n() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: s */
    public void mo121024s(C33610c.C33611a aVar) {
        C86568a aVar2;
        Log.m105925i("MicroMsg.OpenVoice.OnVoIPChatInterruptedJsEvent", "hy: dispath reason: %s", aVar);
        HashMap hashMap = new HashMap(2);
        switch (aVar.ordinal()) {
            case 0:
                aVar2 = new C86568a(this, "call interrupted due to native reason", -1000);
                break;
            case 1:
                aVar2 = new C86568a(this, "user manually exit the call", -1000);
                break;
            case 2:
                aVar2 = new C86568a(this, "device start failed", -1000);
                break;
            case 3:
                aVar2 = new C86568a(this, "in comming call", -2);
                break;
            case 4:
                aVar2 = new C86568a(this, "session update failed", -1000);
                break;
            case 5:
                aVar2 = new C86568a(this, "current mini app entered background", -1);
                break;
            case 6:
                aVar2 = new C86568a(this, "call interrupted due to close passive float ball", -3);
                break;
            default:
                aVar2 = new C86568a(this, "unknown reason", -1000);
                break;
        }
        hashMap.put("errMsg", aVar2.f251485a + ", room id: " + ((C105181w) ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp()).f312355R);
        hashMap.put("errCode", Integer.valueOf(aVar2.f251486b));
        hashMap.put(TPReportKeys.PlayerStep.PLAYER_REASON, aVar2.f251485a);
        mo115165o(hashMap);
        mo115158h();
    }
}
