package em0;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.Map;
import kr0.C88267e;
import n11.C88873b;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C89922k;
import qq0.C89790a;
import qq0.C89816t;
import wq0.C91085v;

/* renamed from: em0.i */
public abstract class C86561i extends C82268c<C88267e> {

    /* renamed from: h */
    public static C89816t.C89818b f251470h;

    /* renamed from: g */
    public C83780d1 f251471g = null;

    /* renamed from: em0.i$a */
    public class C86562a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f251472d;

        public C86562a(boolean z) {
            this.f251472d = z;
        }

        public void run() {
            C86561i.this.mo121019B(this.f251472d);
        }
    }

    /* renamed from: A */
    public C88873b mo121018A(C88267e eVar, JSONObject jSONObject) {
        C88873b bVar = new C88873b();
        try {
            bVar.f256331b = eVar.getAppId();
            bVar.f256333d = jSONObject.optString("signature", "");
            bVar.f256334e = jSONObject.optString("nonceStr", "");
            bVar.f256335f = jSONObject.optString("groupId", "");
            bVar.f256336g = jSONObject.optInt("timeStamp", 0);
            bVar.f256343n = jSONObject.optInt("lifespan", 86400);
            bVar.f256337h = jSONObject.optInt("roomType", 2);
            bVar.f256338i = jSONObject.optInt("maxWidth", 480);
            bVar.f256339j = jSONObject.optInt("maxHeight", 640);
            bVar.f256341l = jSONObject.optString("privateData", "");
            bVar.f256342m = jSONObject.optString("sessionKey", "");
            bVar.f256344o = jSONObject.optLong("roomId", -1);
            JSONObject jSONObject2 = jSONObject.getJSONObject("muteConfig");
            bVar.f256340k.f256327a = jSONObject2.optBoolean("muteMicrophone", false);
            bVar.f256340k.f256328b = jSONObject2.optBoolean("muteEarphone", false);
            bVar.f256340k.f256329c = jSONObject.optBoolean("handsFree", false);
            bVar.f256330a = (eVar.getRuntime() == null || !eVar.getRuntime().mo121254q1()) ? 1 : 0;
            return bVar;
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.OpenVoice.JsApiOpenVoiceBase", e, "handle join voice voip data exception", new Object[0]);
            return null;
        }
    }

    /* renamed from: B */
    public void mo121019B(boolean z) {
        try {
            if (!MMHandlerThread.isMainThread()) {
                MMHandlerThread.postToMainThread(new C86562a(z));
                return;
            }
            C83780d1 d1Var = this.f251471g;
            if (d1Var == null) {
                return;
            }
            if (d1Var.getRuntime() != null) {
                C89816t.C89818b bVar = f251470h;
                if (bVar != null) {
                    bVar.dismiss();
                    f251470h = null;
                }
                if (z) {
                    f251470h = C89790a.C89791a.m112271a(this.f251471g.getRuntime()).mo124076f(C89790a.C89793b.VOICE);
                }
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "setSubTitle error:" + e.toString());
        }
    }

    /* renamed from: w */
    public void mo121020w(Map<String, Object> map, int i) {
        map.put("errCode", Integer.valueOf(i));
    }

    /* renamed from: x */
    public int mo121021x(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return 0;
        }
        if (i != -10086 && i != -10087) {
            return -1000;
        }
        if (i2 == -9) {
            return -3;
        }
        if (i2 == -7) {
            return -2;
        }
        if (i2 != -1) {
            return i2 != 0 ? -1000 : 0;
        }
        return -1;
    }

    /* renamed from: y */
    public final void mo1505u(C88267e eVar, JSONObject jSONObject, int i) {
        boolean z;
        if (eVar.mo114344o0() == null) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no page context");
            return;
        }
        C91085v.m114266a(eVar.getAppId(), new C86563j(this, eVar, jSONObject, i));
        Context context = eVar.getContext();
        boolean z2 = false;
        if (context == null || !(context instanceof Activity)) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "fail, requestAudioPermission pageContext is null");
            eVar.mo109647a(i, mo115109j("fail: context is null"));
            z = false;
        } else {
            z = C89922k.m112464a((Activity) context, eVar, "android.permission.RECORD_AUDIO", 121, "", "");
            if (z) {
                C91085v.m114268c(eVar.getAppId());
            }
        }
        if (!z) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestAudioPermission is fail");
            Log.m105928w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no record audio permission");
            eVar.mo109647a(i, mo115109j("fail: no record audio permission"));
            return;
        }
        C91085v.m114266a(eVar.getAppId(), new C86564k(this, eVar, jSONObject, i));
        Context context2 = eVar.getContext();
        if (context2 == null || !(context2 instanceof Activity)) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "fail, requestCameraPermission pageContext is null");
            eVar.mo109647a(i, mo115109j("fail: context is null"));
        } else {
            z2 = C89922k.m112464a((Activity) context2, eVar, "android.permission.CAMERA", 122, "", "");
            if (z2) {
                C91085v.m114268c(eVar.getAppId());
            }
        }
        if (!z2) {
            Log.m105920e("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "requestCameraPermission is fail");
            Log.m105928w("MicroMsg.OpenVoice.JsApiOpenVoiceBase", "hy: no record video permission");
            eVar.mo109647a(i, mo115109j("fail: no record video permission"));
            return;
        }
        AppBrandPageContainerWC P1 = eVar.getRuntime().mo113212m1();
        if (!(P1.getCurrentPage() == null && P1.getCurrentPage().getCurrentPageView() == null)) {
            this.f251471g = P1.getCurrentPage().getCurrentPageView();
        }
        mo121015z(eVar, jSONObject, i);
    }

    /* renamed from: z */
    public abstract void mo121015z(C88267e eVar, JSONObject jSONObject, int i);
}
