package dy1;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.HashMap;
import ji3.C9457a;
import js0.C9512b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dy1.g */
public class C7548g extends C4770c {

    /* renamed from: dy1.g$a */
    public class C7549a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f25810d;

        public C7549a(JSONObject jSONObject) {
            this.f25810d = jSONObject;
        }

        public void run() {
            JSONArray jSONArray;
            int i;
            Context context = MMApplicationContext.getContext();
            JSONArray optJSONArray = this.f25810d.optJSONArray("packageName");
            String str = "null";
            if (optJSONArray != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                int i2 = 0;
                boolean z = false;
                while (i2 < optJSONArray.length()) {
                    try {
                        String optString = optJSONArray.optString(i2);
                        PackageInfo a = C9512b.m9207a(context, optString);
                        if (a == null) {
                            jSONArray = optJSONArray;
                            i = 0;
                        } else {
                            jSONArray = optJSONArray;
                            i = a.versionCode;
                        }
                        String str2 = a == null ? str : a.versionName;
                        String str3 = str;
                        StringBuilder sb = new StringBuilder();
                        Context context2 = context;
                        sb.append("getInstallState, packageName = ");
                        sb.append(optString);
                        sb.append(", version = ");
                        sb.append(i);
                        sb.append(", versionName = ");
                        sb.append(str2);
                        Log.m105924i("LiteAppJsApiGetInstallState", sb.toString());
                        if (!z && i > 0) {
                            z = true;
                        }
                        jSONObject.put(optString, i);
                        jSONObject2.put(optString, str2);
                        i2++;
                        optJSONArray = jSONArray;
                        str = str3;
                        context = context2;
                    } catch (Exception unused) {
                    }
                }
                HashMap hashMap = new HashMap();
                if (z) {
                    hashMap.put(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, jSONObject);
                    hashMap.put("versionName", jSONObject2);
                }
                hashMap.put("state", Boolean.valueOf(z));
                C7548g.this.f19815f.mo5691c(hashMap);
                return;
            }
            Context context3 = context;
            String str4 = str;
            String optString2 = this.f25810d.optString("packageName");
            if (Util.isNullOrNil(optString2)) {
                Log.m105924i("LiteAppJsApiGetInstallState", "packageName is null or nil");
                C7548g.this.f19815f.mo5689a("get_install_state:no_null_packageName");
                return;
            }
            PackageInfo a2 = C9512b.m9207a(context3, optString2);
            int i3 = a2 == null ? 0 : a2.versionCode;
            String str5 = a2 == null ? str4 : a2.versionName;
            Log.m105924i("LiteAppJsApiGetInstallState", "doGetInstallState, packageName = " + optString2 + ", version = " + i3 + ", versionName = " + str5);
            if (a2 == null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("state", Boolean.FALSE);
                C7548g.this.f19815f.mo5691c(hashMap2);
                return;
            }
            HashMap hashMap3 = new HashMap();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject3.put(optString2, i3);
                jSONObject4.put(optString2, str5);
            } catch (JSONException unused2) {
            }
            hashMap3.put(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, jSONObject3);
            hashMap3.put("versionName", jSONObject4);
            hashMap3.put("state", Boolean.TRUE);
            C7548g.this.f19815f.mo5691c(hashMap3);
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        C9457a.m9137a(new C7549a(jSONObject));
    }
}
