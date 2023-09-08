package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.i */
public class C1608i implements C1256g<IPCString> {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f11213d;

    /* renamed from: e */
    public final /* synthetic */ int f11214e;

    /* renamed from: f */
    public final /* synthetic */ C1609j f11215f;

    public C1608i(C1609j jVar, C81925i2 i2Var, int i) {
        this.f11215f = jVar;
        this.f11213d = i2Var;
        this.f11214e = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCString iPCString = (IPCString) obj;
        if (iPCString == null || iPCString.f10315d == null) {
            this.f11213d.mo109647a(this.f11214e, (String) null);
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("result", new JSONArray(iPCString.f10315d));
        } catch (JSONException unused) {
        }
        this.f11213d.mo109647a(this.f11214e, this.f11215f.mo115112m("ok", hashMap));
    }
}
