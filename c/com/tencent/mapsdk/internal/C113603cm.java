package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.map.tools.net.http.HttpProxyRule;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.cm */
public class C113603cm extends JsonComposer {
    @Json(name = "privacy_protection")

    /* renamed from: a */
    public boolean f339997a;
    @Json(name = "http_proxy")

    /* renamed from: b */
    public List<HttpProxyRule> f339998b;
}
