package com.tencent.p014mm.plugin.wallet_core.utils;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C49995ji2;
import te3.C77935gl2;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.h */
public class C72501h {

    /* renamed from: a */
    public String f210902a;

    /* renamed from: b */
    public C77935gl2 f210903b;

    /* renamed from: c */
    public C77935gl2 f210904c;

    /* renamed from: d */
    public int f210905d;

    /* renamed from: e */
    public int f210906e;

    /* renamed from: f */
    public String f210907f;

    /* renamed from: g */
    public int f210908g;

    /* renamed from: a */
    public static C72501h m84833a(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105928w("MicroMsg.InterceptWin", "createFromJSONObject() jsonObject == null");
            return null;
        }
        C72501h hVar = new C72501h();
        hVar.f210902a = jSONObject.optString("wording");
        try {
            hVar.f210903b = C75129p.m90106a(jSONObject.getJSONObject("left_button"));
            hVar.f210904c = C75129p.m90106a(jSONObject.getJSONObject("right_button"));
            hVar.f210905d = jSONObject.optInt("win_type");
            hVar.f210906e = jSONObject.optInt("show_type");
            hVar.f210907f = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            hVar.f210908g = jSONObject.optInt("icon_type");
            return hVar;
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.InterceptWin", "createFromJSONObject() Exception:%s", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static C72501h m84834b(C49995ji2 ji22) {
        if (ji22 == null) {
            return null;
        }
        C72501h hVar = new C72501h();
        hVar.f210902a = ji22.f136133d;
        hVar.f210903b = ji22.f136134e;
        hVar.f210904c = ji22.f136135f;
        hVar.f210905d = ji22.f136136g;
        hVar.f210906e = ji22.f136137h;
        hVar.f210907f = ji22.f136138i;
        hVar.f210908g = ji22.f136139j;
        return hVar;
    }
}
