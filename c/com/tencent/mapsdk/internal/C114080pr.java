package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mapsdk.internal.pr */
public class C114080pr implements JsonParser {

    /* renamed from: a */
    public boolean f341361a;

    /* renamed from: b */
    public List<C114084pt> f341362b;

    /* renamed from: a */
    private boolean m158873a() {
        return this.f341361a;
    }

    /* renamed from: b */
    private List<C114084pt> m158874b() {
        return this.f341362b;
    }

    public void parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean z = true;
            if (jSONObject.optInt("enable", 0) != 1) {
                z = false;
            }
            this.f341361a = z;
            JSONArray optJSONArray = jSONObject.optJSONArray("layers");
            if (optJSONArray != null) {
                this.f341362b = JsonUtils.parseToList(optJSONArray, C114084pt.class, new Object[0]);
            }
        }
    }
}
