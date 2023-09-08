package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.p074fs.C30190c;
import d42.C31064a0;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Locale;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.z0 */
public final class C30250z0 extends C86301e implements C30208m0 {
    public C81415h0 j70(String str) {
        C87412m.m108594g(str, "instanceName");
        C30190c cVar = C30190c.f81604a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        HashMap<String, C31064a0> hashMap = C30190c.f81605b;
        if (hashMap.containsKey(lowerCase)) {
            return hashMap.get(lowerCase);
        }
        HashMap<String, C31064a0> hashMap2 = C30190c.f81606c;
        if (hashMap2.containsKey(lowerCase)) {
            return hashMap2.get(lowerCase);
        }
        return null;
    }
}
