package cm0;

import android.os.Bundle;
import com.tencent.mapsdk.internal.C0938ej;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashMap;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: cm0.b */
public class C28613b extends C82268c {
    public static final int CTRL_INDEX = 635;
    public static final String NAME = "loadPaySpeechDialectConfig";

    /* renamed from: cm0.b$a */
    public class C28614a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f78514d;

        /* renamed from: e */
        public final /* synthetic */ int f78515e;

        public C28614a(C82381f fVar, int i) {
            this.f78514d = fVar;
            this.f78515e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            HashMap hashMap = new HashMap();
            String string = bundle.getString("idsStr", "");
            int i = 1;
            if (!Util.isNullOrNil(string)) {
                Vector vector = new Vector();
                String[] split = string.split(",");
                Vector vector2 = new Vector();
                Vector vector3 = new Vector();
                int length = split.length;
                int i2 = 0;
                while (i2 < length) {
                    String str = split[i2];
                    vector.add(str);
                    if (Util.isEqual(str, "0")) {
                        C28615c.m38294b();
                        String string2 = C28615c.m38293a().getString(str, "");
                        Object[] objArr = new Object[i];
                        objArr[0] = string2;
                        Log.m105925i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "resPath:%s", objArr);
                        if (Util.isNullOrNil(string2) || !C86013q1.m106450k(string2)) {
                            C28615c.m38294b();
                            vector2.add(C28615c.m38295c(str));
                            vector3.add("");
                        } else {
                            C28615c.m38294b();
                            vector2.add(C28615c.m38295c("0-1"));
                            C28615c.m38294b();
                            vector3.add(C28615c.m38293a().getString("0-1_version", ""));
                        }
                    } else {
                        C28615c.m38294b();
                        vector2.add(C28615c.m38295c(str));
                        C28615c.m38294b();
                        MultiProcessMMKV a = C28615c.m38293a();
                        vector3.add(a.getString(str + C0938ej.f2165t, ""));
                    }
                    i2++;
                    i = 1;
                }
                if (vector.size() > 0) {
                    hashMap.put("downloadedPackId", new JSONArray(vector));
                    hashMap.put("downloadedPackMD5", new JSONArray(vector2));
                    hashMap.put("downloadedPackVersions", new JSONArray(vector3));
                    Log.m105925i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "downloadedPackId:%s  ，downloadedPackMD5：%s, downloadedPackVersions:%s", new JSONArray(vector).toString(), new JSONArray(vector2).toString(), new JSONArray(vector3).toString());
                }
            }
            String string3 = bundle.getString("resId", "");
            Log.m105925i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "resId:%s", string3);
            hashMap.put("dialectPackId", string3);
            this.f78514d.mo109647a(this.f78515e, C28613b.this.mo115112m("ok", hashMap));
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105924i("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "invoke JsApiLoadPaySpeechDialectConfig!");
        if (fVar == null) {
            Log.m105920e("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "fail:component is null");
        } else if (fVar.getContext() == null) {
            Log.m105920e("MicroMsg.OfflineVoice.JsApiLoadPaySpeechDialectConfig", "fail:context is null");
            fVar.mo109647a(i, mo115109j("fail"));
        } else {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, null, C28612a.class, new C28614a(fVar, i));
        }
    }
}
