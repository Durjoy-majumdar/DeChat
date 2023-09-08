package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.game.model.m */
public abstract class C42076m {

    /* renamed from: a */
    public JSONObject f113370a = new JSONObject();

    public C42076m(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GameServerData", "Null or nil json string");
            return;
        }
        try {
            this.f113370a = new JSONObject(str);
        } catch (JSONException unused) {
            Log.m105920e("MicroMsg.GameServerData", "Json parsing error");
        }
    }

    /* renamed from: a */
    public static LinkedList<C42039b> m45777a(JSONArray jSONArray) {
        LinkedList<C42039b> linkedList = new LinkedList<>();
        if (jSONArray == null || jSONArray.length() == 0) {
            Log.m105924i("MicroMsg.GameServerData", "Null or empty json array");
            return linkedList;
        }
        Log.m105925i("MicroMsg.GameServerData", "Parsing json AppInfo, size: %d", Integer.valueOf(jSONArray.length()));
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            C42039b bVar = null;
            if (optJSONObject == null) {
                Log.m105920e("MicroMsg.GameServerData", "Invalid json object");
            } else {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("YYB");
                String b = m45778b(optJSONObject, "appID");
                if (Util.isNullOrNil(b)) {
                    Log.m105920e("MicroMsg.GameServerData", "No AppID field, abort");
                } else {
                    Log.m105925i("MicroMsg.GameServerData", "Parsing AppID: %s", b);
                    bVar = new C42039b();
                    bVar.field_appId = b;
                    bVar.field_appName = m45778b(optJSONObject, "name");
                    bVar.field_appIconUrl = m45778b(optJSONObject, "iconURL");
                    bVar.field_appType = ",1,";
                    bVar.field_packageName = m45778b(optJSONObject, "AndroidPackageName");
                    bVar.mo73948q2(m45778b(optJSONObject, "downloadURL"));
                    bVar.mo73947p2(m45778b(optJSONObject, "AndroidApkMd5"));
                    String b2 = m45778b(optJSONObject, "GooglePlayDownloadUrl");
                    int optInt = optJSONObject.optInt("GooglePlayDownloadFlag");
                    bVar.mo73949r2(b2);
                    if (!Util.isNullOrNil(b2)) {
                        Log.m105925i("MicroMsg.GameServerData", "GooglePlay URL: %s, Download Flag: %d", b2, Integer.valueOf(optInt));
                        bVar.mo73946o2(optInt);
                    }
                    if (optJSONObject2 != null) {
                        bVar.mo73946o2(optJSONObject2.optInt("AndroidDownloadFlag"));
                    }
                    if (optJSONObject2 != null) {
                        bVar.f149255V = m45778b(optJSONObject2, "DownloadUrl");
                        bVar.f149233A = true;
                        bVar.f149256W = m45778b(optJSONObject2, "ApkMd5");
                        bVar.f149233A = true;
                        bVar.f149253T = m45778b(optJSONObject2, "PreemptiveUrl");
                        bVar.f149233A = true;
                        bVar.f149254U = m45778b(optJSONObject2, "ExtInfo");
                        bVar.f149233A = true;
                        bVar.f149258Y = optJSONObject2.optInt("SupportedVersionCode");
                        bVar.f149233A = true;
                    }
                    bVar.f113249B1 = m45778b(optJSONObject, "desc");
                    bVar.f113248A1 = m45778b(optJSONObject, "brief");
                    bVar.f113271z1 = optJSONObject.optInt("type", 0);
                    bVar.f113270y1 = optJSONObject.optInt("status");
                    bVar.f113250C1 = m45778b(optJSONObject, "webURL");
                    bVar.f113251D1 = m45778b(optJSONObject, "adUrl");
                    bVar.f113252E1 = m45778b(optJSONObject, "noticeid");
                    bVar.f113253F1 = optJSONObject.optBoolean("isSubscribed");
                    bVar.f113257J1 = optJSONObject.optInt(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE);
                    if (optJSONObject2 != null) {
                        m45778b(optJSONObject2, "DownloadTipsWording");
                        m45778b(optJSONObject2, "BackBtnWording");
                        m45778b(optJSONObject2, "DownloadBtnWording");
                    }
                }
            }
            if (bVar != null) {
                linkedList.add(bVar);
            }
        }
        return linkedList;
    }

    /* renamed from: b */
    public static String m45778b(JSONObject jSONObject, String str) {
        if (jSONObject != null && !jSONObject.isNull(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }
}
