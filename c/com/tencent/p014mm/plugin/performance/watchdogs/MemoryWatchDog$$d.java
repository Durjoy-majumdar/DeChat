package com.tencent.p014mm.plugin.performance.watchdogs;

import java.util.Comparator;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$d */
public class MemoryWatchDog$$d implements Comparator<Map.Entry<String, Long>> {
    public MemoryWatchDog$$d(MemoryWatchDog memoryWatchDog) {
    }

    public int compare(Object obj, Object obj2) {
        return Long.compare(((Long) ((Map.Entry) obj2).getValue()).longValue(), ((Long) ((Map.Entry) obj).getValue()).longValue());
    }
}
