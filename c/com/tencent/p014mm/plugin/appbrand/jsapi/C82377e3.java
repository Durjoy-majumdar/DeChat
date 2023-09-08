package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.xweb.internal.ConstValue;
import java.util.HashMap;
import java.util.Map;
import qe3.C89625d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e3 */
public final class C82377e3 extends C82368d3 {
    /* renamed from: v */
    public Map<String, Object> mo114774v(C81879g gVar) {
        Map<String, Object> v = super.mo114774v(gVar);
        HashMap hashMap = (HashMap) v;
        hashMap.put(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, Integer.valueOf(C89625d.f257841g));
        hashMap.put("x5Version", 0);
        return v;
    }
}
