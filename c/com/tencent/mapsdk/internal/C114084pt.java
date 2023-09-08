package com.tencent.mapsdk.internal;

import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.map.tools.json.JsonParser;
import java.security.SecureRandom;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.pt */
public class C114084pt implements JsonParser {

    /* renamed from: a */
    public String f341378a;

    /* renamed from: b */
    public String f341379b;

    /* renamed from: c */
    public int f341380c;

    /* renamed from: d */
    public int f341381d;

    /* renamed from: e */
    public boolean f341382e;

    /* renamed from: f */
    private String f341383f;

    /* renamed from: g */
    private String[] f341384g;

    /* renamed from: h */
    private JSONObject f341385h;

    /* renamed from: a */
    public final String mo172669a(int i, int i2, int i3) {
        String[] strArr = this.f341384g;
        if (strArr == null || strArr.length == 0) {
            return this.f341383f;
        }
        String replace = this.f341383f.replace("{x}", String.valueOf(i)).replace("{y}", String.valueOf(i2)).replace("{z}", String.valueOf(i3));
        for (String str : this.f341384g) {
            Object opt = this.f341385h.opt(str);
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                int length = jSONArray.length() - 0;
                replace = replace.replace("{" + str + "}", jSONArray.optString(length > 0 ? new SecureRandom().nextInt(length) + 0 : 0, ""));
            } else if ((opt instanceof String) || (opt instanceof Number)) {
                replace = replace.replace("{" + str + "}", String.valueOf(opt));
            }
        }
        return replace;
    }

    public void parse(JSONObject jSONObject) {
        this.f341385h = jSONObject;
        if (jSONObject != null) {
            this.f341378a = jSONObject.optString("layerid");
            this.f341379b = jSONObject.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            this.f341383f = jSONObject.optString("url");
            this.f341380c = jSONObject.optInt("zoom_max", 20);
            this.f341381d = jSONObject.optInt("zoom_min", 1);
            JSONArray optJSONArray = jSONObject.optJSONArray("params");
            if (optJSONArray != null) {
                this.f341384g = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f341384g[i] = optJSONArray.optString(i);
                }
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CustomLayerModel{");
        stringBuffer.append("mLayerId='");
        stringBuffer.append(this.f341378a);
        stringBuffer.append('\'');
        stringBuffer.append(", mVersion='");
        stringBuffer.append(this.f341379b);
        stringBuffer.append('\'');
        stringBuffer.append(", mMaxZoomLevel=");
        stringBuffer.append(this.f341380c);
        stringBuffer.append(", mMinZoomLevel=");
        stringBuffer.append(this.f341381d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.f341383f);
        stringBuffer.append('\'');
        stringBuffer.append(", mParamsHolders=");
        String[] strArr = this.f341384g;
        stringBuffer.append(strArr == null ? "null" : Arrays.asList(strArr).toString());
        stringBuffer.append(", mVersionUpdated=");
        stringBuffer.append(this.f341382e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
