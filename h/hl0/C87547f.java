package hl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONObject;
import p576jp.C88007b;
import p635os.C89291d;
import vk0.C90809a;
import xq0.C91324b;

/* renamed from: hl0.f */
public class C87547f extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1039;
    public static final String NAME = "getGameLivePermission";

    /* renamed from: hl0.f$a */
    public enum C87548a {
        GameLiveStatusErrCodeNormal(0),
        GameLiveStatusErrCodeNotPermitted(1),
        GameLiveStatusErrCodeIsLiving(2),
        GameLiveStatusErrCodeVoipConflict(3),
        GameLiveStatusErrCodeCameraConfict(4);
        

        /* renamed from: d */
        public int f253637d;

        /* access modifiers changed from: public */
        C87548a(int i) {
            this.f253637d = i;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        if (!Boolean.valueOf(C91324b.m114560a(eVar.getRuntime())).booleanValue()) {
            mo122011w(eVar, 0, C87548a.GameLiveStatusErrCodeNotPermitted, i);
            Log.m105924i("MicroMsg.JsApiGetGameLivePermission", "not permitted");
        } else if (((C89291d) C86312j.m106911c(C89291d.class)).Qq0(eVar.getAppId(), eVar.getRuntime().mo113210l1().f239365g).booleanValue()) {
            mo122011w(eVar, 0, C87548a.GameLiveStatusErrCodeIsLiving, i);
            Log.m105924i("MicroMsg.JsApiGetGameLivePermission", "is Living");
        } else if (((C105181w) ((C88007b) C86312j.m106911c(C88007b.class)).mo59116Bp()).f312350M) {
            mo122011w(eVar, 0, C87548a.GameLiveStatusErrCodeVoipConflict, i);
            Log.m105924i("MicroMsg.JsApiGetGameLivePermission", "is voIPTalking");
        } else if (C90809a.C90811b.f260763a.mo124931a().length > 0) {
            mo122011w(eVar, 0, C87548a.GameLiveStatusErrCodeCameraConfict, i);
            Log.m105924i("MicroMsg.JsApiGetGameLivePermission", "is Camera Capturing");
        } else {
            mo122011w(eVar, 1, C87548a.GameLiveStatusErrCodeNormal, i);
        }
    }

    /* renamed from: w */
    public final void mo122011w(C88267e eVar, int i, C87548a aVar, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", Integer.valueOf(i));
        hashMap.put("errCode", Integer.valueOf(aVar.f253637d));
        eVar.mo109647a(i2, mo115112m("ok", hashMap));
    }
}
