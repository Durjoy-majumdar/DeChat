package com.tencent.p014mm.plugin.report.service;

import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.report.service.n$$r */
public class n$$r implements Callable<JSONArray> {

    /* renamed from: d */
    public final /* synthetic */ Map f248874d;

    /* renamed from: e */
    public final /* synthetic */ String f248875e;

    public n$$r(C115669n nVar, Map map, String str) {
        this.f248874d = map;
        this.f248875e = str;
    }

    public Object call() {
        return new JSONArray().put((this.f248874d == null ? new JSONObject() : new JSONObject(this.f248874d)).put("info", this.f248875e));
    }
}
