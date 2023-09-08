package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.mapsdk.internal.C113667ef;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.ec */
public final class C113664ec implements JsonParser.Deserializer<C113667ef.C113668a.C113669a.C113670a> {
    /* renamed from: a */
    private static C113667ef.C113668a.C113669a.C113670a m156662a(Object obj) {
        if (obj == null || !(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = jSONObject.getString("type");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if ("Point".equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113673d.class, new Object[0]);
        }
        if ("Points".equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113674e.class, new Object[0]);
        }
        if ("Line".equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113671b.class, new Object[0]);
        }
        if (ExifInterface.TAG_MODEL.equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113672c.class, new Object[0]);
        }
        return null;
    }

    public final /* synthetic */ Object deserialize(Object obj, String str, Object obj2) {
        if (obj2 == null || !(obj2 instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj2;
        String string = jSONObject.getString("type");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if ("Point".equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113673d.class, new Object[0]);
        }
        if ("Points".equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113674e.class, new Object[0]);
        }
        if ("Line".equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113671b.class, new Object[0]);
        }
        if (ExifInterface.TAG_MODEL.equalsIgnoreCase(string)) {
            return (C113667ef.C113668a.C113669a.C113670a) JsonUtils.parseToModel(jSONObject, C113667ef.C113668a.C113669a.C113672c.class, new Object[0]);
        }
        return null;
    }
}
