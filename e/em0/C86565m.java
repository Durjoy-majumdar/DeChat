package em0;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105154k0;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85147b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;
import p576jp.C33610c;
import p576jp.C88007b;
import wq0.C91062d;

/* renamed from: em0.m */
public class C86565m extends C86561i {
    public static final int CTRL_INDEX = 780;
    public static final String NAME = "subscribeVoIPMembers";

    /* renamed from: em0.m$a */
    public class C86566a implements C85147b<Integer> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f251482a;

        /* renamed from: b */
        public final /* synthetic */ int f251483b;

        public C86566a(C88267e eVar, int i) {
            this.f251482a = eVar;
            this.f251483b = i;
        }

        /* renamed from: a */
        public void mo118169a(int i, int i2, String str, Object obj) {
            Integer num = (Integer) obj;
            Log.m105925i("MicroMsg.OpenVoice.JsApiSubscribeVoIPMembers", "subscribe result result %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                this.f251482a.mo109647a(this.f251483b, C86565m.this.mo115109j("ok"));
                return;
            }
            HashMap hashMap = new HashMap();
            C86565m mVar = C86565m.this;
            mVar.mo121020w(hashMap, mVar.mo121021x(i, i2));
            this.f251482a.mo109647a(this.f251483b, C86565m.this.mo115112m(String.format("fail: %d, %d, %s, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(((C105181w) ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp()).f312355R)}), hashMap));
        }
    }

    public C86565m() {
        C91062d.m114234a(NAME);
    }

    /* renamed from: z */
    public void mo121015z(C88267e eVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            eVar.mo109647a(i, mo115109j("fail:data is null or nil"));
            return;
        }
        String appId = eVar.getAppId();
        Log.m105924i("MicroMsg.OpenVoice.JsApiSubscribeVoIPMembers", "hy: appId:" + appId + ", parmas:" + jSONObject.toString());
        C33610c Bp = ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp();
        C86566a aVar = new C86566a(eVar, i);
        C105181w wVar = (C105181w) Bp;
        wVar.getClass();
        wVar.mo149500g(new C105154k0(wVar, aVar, jSONObject));
    }
}
