package com.tencent.kinda.framework.app;

import com.tencent.kinda.gen.IUIPage;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class KindaUIPageMap {
    private static ConcurrentHashMap<String, Value> data = new ConcurrentHashMap<>();

    public static class Value {
        public IUIPage uiPage;
    }

    public static Value getAndRemove(String str) {
        if (!data.containsKey(str)) {
            return null;
        }
        Value value = data.get(str);
        data.remove(str);
        return value;
    }

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String put(IUIPage iUIPage) {
        String uuid = getUUID();
        Value value = new Value();
        value.uiPage = iUIPage;
        data.put(uuid, value);
        return uuid;
    }
}
