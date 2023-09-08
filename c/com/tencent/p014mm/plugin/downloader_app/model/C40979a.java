package com.tencent.p014mm.plugin.downloader_app.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v41.C52742a;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.a */
public class C40979a {

    /* renamed from: a */
    public String f110289a;

    /* renamed from: b */
    public String f110290b;

    /* renamed from: c */
    public String f110291c;

    /* renamed from: d */
    public String f110292d;

    /* renamed from: e */
    public String f110293e;

    /* renamed from: f */
    public String f110294f;

    /* renamed from: g */
    public long f110295g;

    /* renamed from: h */
    public String f110296h;

    /* renamed from: i */
    public int f110297i;

    /* renamed from: j */
    public String f110298j;

    /* renamed from: k */
    public int f110299k;

    /* renamed from: l */
    public boolean f110300l;

    /* renamed from: m */
    public boolean f110301m = true;

    /* renamed from: n */
    public int f110302n;

    /* renamed from: o */
    public int f110303o;

    /* renamed from: p */
    public int f110304p;

    /* renamed from: q */
    public int f110305q;

    /* renamed from: r */
    public int f110306r;

    /* renamed from: s */
    public boolean f110307s;

    /* renamed from: t */
    public LinkedList<C52742a> f110308t;

    /* renamed from: u */
    public boolean f110309u = false;

    /* renamed from: a */
    public static C40979a m44407a(JSONObject jSONObject) {
        C40979a aVar = new C40979a();
        if (jSONObject == null) {
            return aVar;
        }
        aVar.f110291c = jSONObject.optString("taskName");
        aVar.f110289a = jSONObject.optString("taskUrl");
        aVar.f110290b = jSONObject.optString("alterUrl");
        aVar.f110295g = jSONObject.optLong("taskSize");
        aVar.f110296h = jSONObject.optString("fileMd5");
        aVar.f110298j = jSONObject.optString("extInfo");
        boolean z = false;
        aVar.f110302n = Util.getInt(jSONObject.optString("fileType"), 0);
        aVar.f110292d = jSONObject.optString("appId");
        aVar.f110293e = jSONObject.optString("rawAppId");
        aVar.f110294f = jSONObject.optString("packageName");
        aVar.f110299k = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        aVar.f110297i = jSONObject.optInt("downloaderType", 1);
        aVar.f110300l = jSONObject.optBoolean("downloadInWifi", false);
        if (jSONObject.optInt("ignoreNetwork", 0) == 1) {
            z = true;
        }
        aVar.f110309u = z;
        return aVar;
    }

    /* renamed from: b */
    public static C40979a m44408b(JSONObject jSONObject) {
        C40979a aVar = new C40979a();
        if (jSONObject == null) {
            return aVar;
        }
        aVar.f110291c = jSONObject.optString("task_name");
        aVar.f110289a = jSONObject.optString("task_url");
        aVar.f110290b = jSONObject.optString("alternative_url");
        aVar.f110295g = jSONObject.optLong("task_size");
        aVar.f110296h = jSONObject.optString("file_md5");
        aVar.f110298j = jSONObject.optString("extInfo");
        boolean z = false;
        aVar.f110302n = Util.getInt(jSONObject.optString("fileType"), 0);
        aVar.f110292d = jSONObject.optString("appid");
        aVar.f110293e = jSONObject.optString("raw_appid");
        aVar.f110294f = jSONObject.optString("packageName");
        aVar.f110299k = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        aVar.f110297i = jSONObject.optInt("downloader_type", 1);
        aVar.f110300l = jSONObject.optBoolean("download_in_wifi", false);
        aVar.f110303o = jSONObject.optInt("download_type", 1);
        aVar.f110304p = jSONObject.optInt("uiarea");
        aVar.f110305q = jSONObject.optInt("notice_id");
        aVar.f110306r = jSONObject.optInt(TPDownloadProxyEnum.USER_SSID);
        JSONArray optJSONArray = jSONObject.optJSONArray("fileSectionMd5");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            aVar.f110308t = new LinkedList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C52742a aVar2 = new C52742a();
                    aVar2.f147342d = optJSONObject.optLong("android_md5_section_begin");
                    aVar2.f147343e = optJSONObject.optLong("android_md5_section_end");
                    aVar2.f147344f = optJSONObject.optString("android_md5_section_md5");
                    aVar.f110308t.add(aVar2);
                }
            }
        }
        if (jSONObject.optInt("ignoreNetwork", 0) == 1) {
            z = true;
        }
        aVar.f110309u = z;
        return aVar;
    }

    /* renamed from: c */
    public static C40979a m44409c(Map<String, Object> map) {
        C40979a aVar = new C40979a();
        if (map == null) {
            return aVar;
        }
        aVar.f110291c = (String) map.get("task_name");
        aVar.f110289a = (String) map.get("task_url");
        aVar.f110290b = (String) map.get("alternative_url");
        aVar.f110295g = Util.getLong((String) map.get("task_size"), 0);
        aVar.f110296h = (String) map.get("file_md5");
        aVar.f110298j = (String) map.get("extInfo");
        boolean z = false;
        aVar.f110302n = Util.getInt((String) map.get("fileType"), 0);
        aVar.f110292d = (String) map.get("appid");
        aVar.f110293e = (String) map.get("raw_appid");
        aVar.f110294f = (String) map.get("package_name");
        aVar.f110299k = Util.getInt((String) map.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 1000);
        aVar.f110297i = Util.getInt((String) map.get("downloader_type"), 1);
        aVar.f110303o = Util.getInt((String) map.get("download_type"), 1);
        aVar.f110304p = Util.getInt((String) map.get("uiarea"), 0);
        aVar.f110305q = Util.getInt((String) map.get("notice_id"), 0);
        aVar.f110306r = Util.getInt((String) map.get(TPDownloadProxyEnum.USER_SSID), 0);
        String str = (String) map.get("fileSectionMd5");
        if (!Util.isNullOrNil(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    aVar.f110308t = new LinkedList<>();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            C52742a aVar2 = new C52742a();
                            aVar2.f147342d = optJSONObject.optLong("android_md5_section_begin");
                            aVar2.f147343e = optJSONObject.optLong("android_md5_section_end");
                            aVar2.f147344f = optJSONObject.optString("android_md5_section_md5");
                            aVar.f110308t.add(aVar2);
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        if (Util.getInt((String) map.get("ignoreNetwork"), 0) == 1) {
            z = true;
        }
        aVar.f110309u = z;
        return aVar;
    }
}
