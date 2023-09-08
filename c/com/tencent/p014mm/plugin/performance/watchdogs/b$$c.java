package com.tencent.p014mm.plugin.performance.watchdogs;

import java.util.Comparator;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.b$$c */
public class b$$c implements Comparator<Map.Entry<String, Integer>> {
    public b$$c(C85325b bVar) {
    }

    public int compare(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        if (entry2.getValue() == null || entry.getValue() == null) {
            return 0;
        }
        return ((Integer) entry2.getValue()).intValue() - ((Integer) entry.getValue()).intValue();
    }
}
