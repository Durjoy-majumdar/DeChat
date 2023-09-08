package em0;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85153j0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import kr0.C88267e;
import org.json.JSONObject;
import p576jp.C33610c;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.a */
public class C86534a extends C86561i {
    public static final int CTRL_INDEX = 517;
    public static final String NAME = "exitVoIPChat";

    /* renamed from: em0.a$a */
    public class C86535a implements C85147b<String> {

        /* renamed from: a */
        public final /* synthetic */ long f251409a;

        /* renamed from: b */
        public final /* synthetic */ String f251410b;

        /* renamed from: c */
        public final /* synthetic */ C88267e f251411c;

        /* renamed from: d */
        public final /* synthetic */ int f251412d;

        public C86535a(long j, String str, C88267e eVar, int i) {
            this.f251409a = j;
            this.f251410b = str;
            this.f251411c = eVar;
            this.f251412d = i;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            String str2 = str;
            long ticksToNow = Util.ticksToNow(this.f251409a);
            Log.m105925i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "hy: exit conference result %d, %d, %s, %s, using %d ms", Integer.valueOf(i), Integer.valueOf(i2), str2, (String) obj, Long.valueOf(ticksToNow));
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(16093, this.f251410b, Integer.valueOf(i2), Long.valueOf(ticksToNow));
            if (i == 0 && i2 == 0) {
                nVar.mo175913w(935, 2, 1);
                this.f251411c.mo109647a(this.f251412d, C86534a.this.mo115109j("ok"));
                return;
            }
            nVar.mo175913w(935, 3, 1);
            C88267e eVar = this.f251411c;
            int i3 = this.f251412d;
            C86534a aVar = C86534a.this;
            eVar.mo109647a(i3, aVar.mo115109j("fail: " + str2));
        }
    }

    public C86534a() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: z */
    public void mo121015z(C88267e eVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "hy: invoke JsApiCloudVoiceExitVoIPChat");
        mo121019B(false);
        String appId = eVar.getAppId();
        long currentTicks = Util.currentTicks();
        C33610c Bp = ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp();
        C86535a aVar = new C86535a(currentTicks, appId, eVar, i);
        C33610c.C33611a aVar2 = C33610c.C33611a.ReasonManual;
        C105181w wVar = (C105181w) Bp;
        wVar.getClass();
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: user triggered exit conference");
        wVar.mo149500g(new C85153j0(wVar, aVar2, aVar));
    }
}
