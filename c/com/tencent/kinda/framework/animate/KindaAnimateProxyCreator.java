package com.tencent.kinda.framework.animate;

import java.lang.ref.WeakReference;
import java.util.HashMap;

@Deprecated
public class KindaAnimateProxyCreator {
    private static HashMap<Integer, WeakReference<Object>> cache = new HashMap<>();

    public static Object checkCreateAnimateViewProxy(Object obj) {
        return obj;
    }
}
