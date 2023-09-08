package com.tencent.p014mm.plugin.appbrand.page;

import android.util.LongSparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x2 */
public final class C83970x2 {

    /* renamed from: a */
    public final LongSparseArray<C83817h4> f245151a = new LongSparseArray<>();

    /* renamed from: b */
    public final LongSparseArray<C83817h4> f245152b = new LongSparseArray<>();

    /* renamed from: c */
    public final LongSparseArray<Map<String, Object>> f245153c = new LongSparseArray<>();

    /* renamed from: a */
    public void mo116604a(long j, String str, Object obj, boolean z) {
        Map map = this.f245153c.get(j);
        if (map == null) {
            if (z) {
                map = new HashMap();
                this.f245153c.put(j, map);
            } else {
                return;
            }
        }
        if (!"routeInitReadyTime".equals(str) || !map.containsKey(str)) {
            map.put(str, obj);
        }
    }
}
