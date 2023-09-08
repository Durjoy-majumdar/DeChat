package com.tencent.p014mm.plugin.appbrand.task.preload;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.c */
public class C1972c {

    /* renamed from: a */
    public static volatile C1972c f11884a;

    /* renamed from: b */
    public static Map<Integer, LinkedList<Map<Integer, Map<Integer, Float>>>> f11885b;

    static {
        f11885b = new HashMap();
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_preload_miniprogram, "");
        if (Util.isNullOrNil(Y60)) {
            Log.m105920e("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "clicfg_preload_miniprogram jsonStr error!");
            return;
        }
        Log.m105919d("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "generateScenePredictMap jsonStr:%s", Y60);
        try {
            JSONArray jSONArray = new JSONArray(Y60);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = new JSONObject(jSONArray.optString(i));
                int optInt = jSONObject.optInt("id");
                LinkedList linkedList = new LinkedList();
                JSONArray optJSONArray = jSONObject.optJSONArray("preloadRate");
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(optJSONArray.optString(i2));
                    int optInt2 = jSONObject2.optInt("innerScene");
                    float optDouble = (float) jSONObject2.optDouble("high");
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(0, Float.valueOf((float) jSONObject2.optDouble("low")));
                    hashMap2.put(1, Float.valueOf((float) jSONObject2.optDouble("middle")));
                    hashMap2.put(2, Float.valueOf(optDouble));
                    hashMap.put(Integer.valueOf(optInt2), hashMap2);
                    linkedList.add(hashMap);
                }
                f11885b.put(Integer.valueOf(optInt), linkedList);
            }
            Log.m105919d("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "scenePredictMap :%s", f11885b.toString());
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "generateScenePredictMap json exception:%s", e);
            f11885b.clear();
            f11885b = null;
        }
    }

    /* renamed from: a */
    public Map<Integer, Float> mo1871a(int i, int i2) {
        Map<Integer, LinkedList<Map<Integer, Map<Integer, Float>>>> map = f11885b;
        if (map == null || ((HashMap) map).size() <= 0) {
            Log.m105920e("MicroMsg.Predownload.AppBrandPreloadPredictLevel", "getScenePredictRate map null!");
            return null;
        }
        LinkedList linkedList = (LinkedList) ((HashMap) f11885b).get(Integer.valueOf(i));
        if (linkedList.size() > 0) {
            for (int i3 = 0; i3 < linkedList.size(); i3++) {
                Map map2 = (Map) linkedList.get(i3);
                if (map2.containsKey(Integer.valueOf(i2))) {
                    return (Map) map2.get(Integer.valueOf(i2));
                }
            }
        }
        return null;
    }
}
