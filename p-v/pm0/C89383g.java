package pm0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import kr0.C88267e;
import org.json.JSONException;
import org.json.JSONObject;
import pm0.C89377c;
import xj0.C91223h;
import xj0.C91233m;
import xj0.C91235n;
import xj0.C91237o;

/* renamed from: pm0.g */
public class C89383g extends C89377c {
    public static final int CTRL_INDEX = 686;
    public static final String NAME = "operateMediaContainer";

    /* renamed from: z */
    public void mo123717z(C88267e eVar, JSONObject jSONObject, int i) {
        C88267e eVar2 = eVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        Log.m105925i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: %s %s", NAME, jSONObject.toString());
        String optString = jSONObject2.optString("operationType");
        if (optString.equalsIgnoreCase("create")) {
            C91237o y = mo123722y(eVar);
            C89380d dVar = new C89380d(this, eVar2, i2);
            y.getClass();
            Log.m105924i("MicroMsg.GameRecorderMgr", "hy: trigger createMediaContainer");
            y.f261806a.postToWorker(new C91223h(y, jSONObject2, dVar));
        } else if (optString.equalsIgnoreCase(AssetExtension.SCENE_EXPORT)) {
            int optInt = jSONObject2.optInt("containerId");
            String optString2 = jSONObject2.optString("mimeType");
            if (Util.isNullOrNil(optString2)) {
                eVar2.mo109647a(i2, mo115109j(String.format("fail: parmas error %s", new Object[]{jSONObject.toString()})));
                return;
            }
            String str = "export_" + optInt + "_" + System.currentTimeMillis() + "." + optString2;
            C89377c.C89379b w = mo123720w(eVar2, str, true);
            if (w == null || Util.isNullOrNil(w.f257371a) || Util.isNullOrNil(w.f257372b)) {
                Log.m105921e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: %s, alloc file failed", NAME);
                eVar2.mo109647a(i2, mo115109j(String.format("fail: internal create file failed", new Object[0])));
                return;
            }
            try {
                jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, w.f257371a);
                C91237o y2 = mo123722y(eVar);
                y2.f261806a.postToWorker(new C91233m(y2, jSONObject2, new C89381e(this, w, eVar, optString2, i, str)));
            } catch (JSONException e) {
                eVar2.mo109647a(i2, mo115109j(String.format("fail: error %s", new Object[]{e.getMessage()})));
            } catch (Exception e2) {
                eVar2.mo109647a(i2, mo115109j(String.format("fail: error %s", new Object[]{e2.getMessage()})));
            }
        } else if (optString.equalsIgnoreCase("remove")) {
            C91237o y3 = mo123722y(eVar);
            y3.f261806a.postToWorker(new C91235n(y3, jSONObject2, new C89382f(this, eVar2, i2)));
        } else {
            Log.m105921e("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "hy: invalid operate type: %s", optString);
            eVar2.mo109647a(i2, mo115109j(String.format("fail: not valid operate type: %s", new Object[]{optString})));
        }
    }
}
