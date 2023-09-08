package com.tencent.p014mm.feature.expt.forward;

import com.tencent.p014mm.feature.expt.forward.ForwardReport;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n31.C61612b;

/* renamed from: com.tencent.mm.feature.expt.forward.a */
public final class C92688a implements C61612b {

    /* renamed from: a */
    public static final C92688a f266747a = new C92688a();

    /* renamed from: a */
    public final void mo77120a(long j, String str, Map<String, Object> map) {
        Long l;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = map.get("udf_kv");
            Long l2 = null;
            if (obj != null) {
                Map map2 = obj instanceof Map ? (Map) obj : null;
                if (map2 != null) {
                    Iterator it = map2.entrySet().iterator();
                    loop0:
                    while (true) {
                        l = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            String str2 = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (!C87412m.m108589b(str2, "key_forwardTime")) {
                                linkedHashMap.put(str2, value);
                            } else if (value instanceof Long) {
                                l = (Long) value;
                            }
                        }
                    }
                    l2 = l;
                }
            }
            if (l2 != null) {
                Long valueOf = Long.valueOf(l2.longValue());
                ConcurrentHashMap<Long, ForwardReport.C92685a.C92687b> concurrentHashMap = ForwardReport.f266736b;
                C87412m.m108593f(str, "eventId");
                concurrentHashMap.put(valueOf, new ForwardReport.C92685a.C92687b(j, str, map, linkedHashMap));
            }
        } catch (Exception unused) {
        }
    }
}
