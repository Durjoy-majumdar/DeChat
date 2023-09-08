package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.l2 */
public final class C1710l2 extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 762;
    private static final String NAME = "createWebViewForFastLoad";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        ArrayList arrayList;
        int optInt = jSONObject != null ? jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : -1;
        JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("itemShowTypes") : null;
        if (optJSONArray == null || optJSONArray.length() == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = optJSONArray.get(i2);
                C87412m.m108593f(obj, "get(index)");
                arrayList.add(Integer.valueOf(obj instanceof Integer ? ((Number) obj).intValue() : obj instanceof String ? Util.safeParseInt((String) obj) : -1));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() == -1) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        List B0 = C110818d0.m150900B0(arrayList2);
        ArrayList arrayList3 = (ArrayList) B0;
        if (arrayList3.isEmpty()) {
            arrayList3.add(0);
        }
        Log.m105925i("MicroMsg.JsApiCreateWebViewForFastLoad", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", Integer.valueOf(optInt), B0);
        ((C45696d) C86709a0.m107533q(C45696d.class)).mo70988e3(optInt, B0);
        if (fVar != null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            fVar.mo109647a(i, mo115115p("ok", jSONObject2));
        }
    }
}
