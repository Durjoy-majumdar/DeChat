package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.HashMap;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sj0.C90203b;
import xj0.C91221g;
import xj0.C91237o;

/* renamed from: sj0.d */
public class C90207d extends C90203b {
    /* renamed from: A */
    public void mo124447A(C88267e eVar, int i, C90203b.C90205b bVar, String str, JSONArray jSONArray, C91237o.C91242e eVar2, JSONObject jSONObject) {
        throw null;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("MicroMsg.WAGameJsApiScreenRecorderEdit", "hy: request clip and share");
        String optString = jSONObject2.optString("videoSrc");
        String optString2 = jSONObject2.optString("bgmSrc");
        String optString3 = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        JSONArray optJSONArray = jSONObject2.optJSONArray("timeRange");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("shareOptions");
        double optDouble = jSONObject2.optDouble("volume", 1.0d);
        if (Util.isNullOrNil(optString)) {
            str = "not provide video file src!";
        } else {
            if (Util.isNullOrNil(optString2)) {
                Log.m105928w("MicroMsg.WAGameJsApiScreenRecorderEdit", "hy: not provide bgm, but it's ok");
            }
            if (eVar.getRuntime() == null) {
                str = "get runtime failed!";
            } else if (eVar.getRuntime().mo113034V() == null) {
                str = "get file system failed!";
            } else {
                C81410b0 access = eVar.getRuntime().mo113034V().access(optString);
                C81410b0 b0Var = C81410b0.OK;
                str = access != b0Var ? "not found video file!" : (Util.isNullOrNil(optString2) || eVar.getRuntime().mo113034V().access(optString2) == b0Var) ? "ok" : "not found audio file!";
            }
        }
        if (!"ok".equalsIgnoreCase(str)) {
            mo124448z(eVar, i, 2, C1862l.CTRL_INDEX, str);
            return;
        }
        C90203b.C90205b w = mo124444w(eVar, "cut_game_screenrecord.mp4", true);
        if (w == null || Util.isNullOrNil(w.f258967a)) {
            Log.m105920e("MicroMsg.WAGameJsApiScreenRecorderEdit", "hy: WAGameJsApiScreenRecorderOperate, alloc file failed");
            mo124448z(eVar, i, 2, -1, "internal create file failed!");
            return;
        }
        try {
            String i2 = ((C82419d1) eVar.getRuntime().f238163z).getAbsoluteFile(optString, false).mo119971i();
            String i3 = !Util.isNullOrNil(optString2) ? ((C82419d1) eVar.getRuntime().f238163z).getAbsoluteFile(optString2, false).mo119971i() : null;
            Log.m105919d("MicroMsg.WAGameJsApiScreenRecorderEdit", "hy: retrieved video full path: %s, audio full path: %s, clippedFilePath path: %s", i2, i3, w);
            jSONObject2.put("videoPath", i2);
            jSONObject2.put("videoSlices", optJSONArray);
            if (!Util.isNullOrNil(i3)) {
                jSONObject2.put("audioPath", i3);
                jSONObject2.put("audioVolume", optDouble);
                jSONObject2.put("audioTransBitrate", 64000);
                jSONObject2.put("audioTransSamplerate", 44100);
                jSONObject2.put("audioTransChannel", 2);
            }
            jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, w.f258967a);
            C91237o b = C91237o.m114472b(eVar.getAppId(), eVar);
            b.f261806a.postToWorker(new C91221g(b, jSONObject2, new C90206c(this, eVar, i, w, optString3, optJSONArray2, jSONObject)));
        } catch (JSONException e) {
            mo124448z(eVar, i, 1, -1, e.getMessage());
        } catch (Exception e2) {
            mo124448z(eVar, i, 1, -1, e2.getMessage());
        }
    }

    /* renamed from: z */
    public void mo124448z(C81925i2 i2Var, int i, int i2, int i3, String str) {
        Log.m105929w("MicroMsg.WAGameJsApiScreenRecorderEdit", "hy: fail errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        HashMap hashMap = new HashMap(1);
        hashMap.put("errCode", Integer.valueOf(i3));
        i2Var.mo109647a(i, mo115112m(String.format("fail: errType: %d, errCode: %d, %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}), hashMap));
    }
}
