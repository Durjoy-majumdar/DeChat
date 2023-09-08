package kk0;

import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82220a;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82225c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ok0.C89240g;
import org.json.JSONObject;
import qk0.C89687b;
import qk0.C89696k;
import rx3.C13604l;
import sk0.C90215a;
import sx3.C90364q0;

/* renamed from: kk0.k */
public final class C88186k extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 815;
    public static final String NAME = "makeBluetoothPair";

    /* renamed from: kk0.k$a */
    public static final class C88187a implements C89687b {

        /* renamed from: a */
        public final /* synthetic */ String f254983a;

        /* renamed from: b */
        public final /* synthetic */ C88186k f254984b;

        /* renamed from: c */
        public final /* synthetic */ int f254985c;

        /* renamed from: d */
        public final /* synthetic */ C82381f f254986d;

        public C88187a(String str, C88186k kVar, int i, C82381f fVar) {
            this.f254983a = str;
            this.f254984b = kVar;
            this.f254985c = i;
            this.f254986d = fVar;
        }

        /* renamed from: a */
        public final void mo114631a(C89696k kVar) {
            Log.m105925i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "appId: " + this.f254983a + ", result: " + kVar, new Object[0]);
            int i = kVar.f257988a;
            if (i == 0) {
                C90215a.m112930b(this.f254984b, this.f254985c, this.f254986d, (HashMap<String, Object>) null);
                return;
            }
            this.f254986d.mo109647a(this.f254985c, this.f254984b.mo115110k(kVar.f257989b, kVar.f257990c, C90364q0.m113148g(new C13604l("errCode", Integer.valueOf(i)))));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        int i2;
        byte[] bArr;
        String str;
        int i3;
        int i4;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i5 = i;
        if (fVar2 == null) {
            Log.m105929w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "env is null", new Object[0]);
        } else if (jSONObject2 == null || !jSONObject2.has("deviceId")) {
            Log.m105929w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "data is null or do not have key: deviceId", new Object[0]);
            Map g = C90364q0.m113148g(new C13604l("errCode", 10013));
            if (BuildInfo.DEBUG) {
                i2 = 101;
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
            } else {
                i2 = 101;
            }
            g.put("errno", Integer.valueOf(i2));
            fVar2.mo109647a(i5, mo115114o("fail:invalid data", g));
        } else {
            String appId = fVar.getAppId();
            Log.m105925i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "appId: " + appId + ", data: " + jSONObject2, new Object[0]);
            C82225c b = C82220a.m100947b(appId);
            if (b == null) {
                Log.m105929w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "bleWorker is null", new Object[0]);
                Map g2 = C90364q0.m113148g(new C13604l("errCode", 10000));
                if (BuildInfo.DEBUG) {
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1500101, "fail:not init");
                }
                g2.put("errno", 1500101);
                fVar2.mo109647a(i5, mo115114o("fail:not init", g2));
                return;
            }
            String optString = jSONObject2.optString("deviceId", (String) null);
            if (optString == null) {
                Log.m105929w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "deviceId is null", new Object[0]);
                Map g3 = C90364q0.m113148g(new C13604l("errCode", 10013));
                if (BuildInfo.DEBUG) {
                    i4 = 101;
                    Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
                } else {
                    i4 = 101;
                }
                g3.put("errno", Integer.valueOf(i4));
                fVar2.mo109647a(i5, mo115114o("fail:invalid data", g3));
                return;
            }
            String optString2 = jSONObject2.optString("pin", (String) null);
            if (optString2 == null) {
                bArr = null;
            } else {
                try {
                    bArr = Base64.decode(optString2, 2);
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.AppBrand.JsApiMakeBluetoothPair", "decode pin fail since " + e, new Object[0]);
                    Map g4 = C90364q0.m113148g(new C13604l("errCode", 10013));
                    if (BuildInfo.DEBUG) {
                        i3 = 101;
                        Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:invalid data");
                    } else {
                        i3 = 101;
                    }
                    g4.put("errno", Integer.valueOf(i3));
                    fVar2.mo109647a(i5, mo115114o("fail:invalid data", g4));
                    return;
                }
            }
            long optLong = jSONObject2.optLong("timeout", 20000);
            boolean optBoolean = jSONObject2.optBoolean("forcePair", false);
            boolean optBoolean2 = jSONObject2.optBoolean("useOldImpl", false);
            StringBuilder sb = new StringBuilder();
            sb.append("deviceId: ");
            sb.append(optString);
            sb.append(", pin: ");
            if (bArr != null) {
                str = Arrays.toString(bArr);
                C87412m.m108593f(str, "toString(this)");
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", timeoutMs: ");
            sb.append(optLong);
            sb.append(", forcePair: ");
            sb.append(optBoolean);
            sb.append(", useOldImpl: ");
            sb.append(optBoolean2);
            Log.m105925i("MicroMsg.AppBrand.JsApiMakeBluetoothPair", sb.toString(), new Object[0]);
            b.mo114614g(optString, new C89240g(optString, bArr, optLong, optBoolean, optBoolean2), new C88187a(appId, this, i5, fVar2));
        }
    }
}
