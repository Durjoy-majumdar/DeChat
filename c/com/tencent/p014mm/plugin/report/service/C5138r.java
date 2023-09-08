package com.tencent.p014mm.plugin.report.service;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.report.service.r */
public class C5138r implements Callable<JSONArray> {

    /* renamed from: d */
    public final /* synthetic */ List f20521d;

    public C5138r(C115669n nVar, List list) {
        this.f20521d = list;
    }

    public Object call() {
        JSONArray jSONArray = new JSONArray();
        for (String put : this.f20521d) {
            jSONArray.put(new JSONObject().put("info", put));
        }
        return jSONArray;
    }
}
