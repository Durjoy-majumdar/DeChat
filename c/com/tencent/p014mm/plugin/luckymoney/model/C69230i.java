package com.tencent.p014mm.plugin.luckymoney.model;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C50860pp3;
import te3.C77994sf2;
import te3.C77999tf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.i */
public class C69230i {

    /* renamed from: a */
    public C77994sf2 f199197a;

    /* renamed from: b */
    public String f199198b;

    /* renamed from: c */
    public boolean f199199c;

    /* renamed from: d */
    public String f199200d;

    /* renamed from: a */
    public static C69230i m81575a(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return m81576b(new JSONObject(str));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.EnvelopSourceMac", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static C69230i m81576b(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m105928w("MicroMsg.EnvelopSourceMac", "json is null");
            return null;
        }
        C69230i iVar = new C69230i();
        iVar.f199198b = jSONObject.optString("showSourceMac");
        iVar.f199200d = jSONObject.optString("illegal_msg");
        iVar.f199199c = jSONObject.optBoolean("is_illegal");
        JSONObject optJSONObject = jSONObject.optJSONObject("showSource");
        if (optJSONObject != null) {
            iVar.f199197a = C69232i1.m81578b(optJSONObject);
        }
        String optString = jSONObject.optString("cover_info_buffer_for_place_order");
        if (!Util.isNullOrNil(optString)) {
            C77994sf2 sf22 = iVar.f199197a;
            C50860pp3 pp32 = new C50860pp3();
            try {
                pp32.parseFrom(Base64.decode(optString.getBytes(), 0));
            } catch (IOException unused) {
            }
            C77999tf2 tf22 = sf22.f228203g;
            if (tf22 != null) {
                tf22.f228257u = pp32.f139898d;
                tf22.f228258v = pp32.f139899e;
                tf22.f228262z = pp32.f139900f;
            }
            iVar.f199197a = sf22;
        }
        return iVar;
    }
}
