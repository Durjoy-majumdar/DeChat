package pm0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import xj0.C91225i;
import xj0.C91227j;
import xj0.C91229k;
import xj0.C91231l;
import xj0.C91237o;

/* renamed from: pm0.l */
public class C89388l extends C89377c {
    public static final int CTRL_INDEX = 687;
    public static final String NAME = "operateMediaTrack";

    /* renamed from: z */
    public void mo123717z(C88267e eVar, JSONObject jSONObject, int i) {
        Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "hy: %s %s", NAME, jSONObject.toString());
        String optString = jSONObject.optString("operationType");
        if (optString.equalsIgnoreCase("get")) {
            String optString2 = jSONObject.optString(FirebaseAnalytics.C113379b.SOURCE);
            if (Util.isNullOrNil(optString2)) {
                eVar.mo109647a(i, mo115109j(String.format("fail: parmas error %s", new Object[]{jSONObject.toString()})));
                return;
            }
            try {
                jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, ((C82419d1) eVar.getRuntime().f238163z).getAbsoluteFile(optString2, false).mo119971i());
                C91237o y = mo123722y(eVar);
                y.f261806a.postToWorker(new C91225i(y, jSONObject, new C89384h(this, eVar, i)));
            } catch (JSONException e) {
                eVar.mo109647a(i, mo115109j(String.format("fail: error %s", new Object[]{e.getMessage()})));
            } catch (Exception e2) {
                eVar.mo109647a(i, mo115109j(String.format("fail: error %s", new Object[]{e2.getMessage()})));
            }
        } else if (optString.equalsIgnoreCase("create")) {
            C91237o y2 = mo123722y(eVar);
            y2.f261806a.postToWorker(new C91227j(y2, jSONObject, new C89385i(this, eVar, i)));
        } else if (optString.equalsIgnoreCase("update")) {
            try {
                C91237o y3 = mo123722y(eVar);
                y3.f261806a.postToWorker(new C91229k(y3, jSONObject, new C89386j(this, eVar, i)));
            } catch (Exception e3) {
                eVar.mo109647a(i, mo115109j(String.format("fail: error %s", new Object[]{e3.getMessage()})));
            }
        } else if (optString.equalsIgnoreCase("remove")) {
            C91237o y4 = mo123722y(eVar);
            y4.f261806a.postToWorker(new C91231l(y4, jSONObject, new C89387k(this, eVar, i)));
        } else {
            Log.m105921e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "hy: invalid operate type: %s", optString);
            eVar.mo109647a(i, mo115109j(String.format("fail: not valid operate type: %s", new Object[]{optString})));
        }
    }
}
