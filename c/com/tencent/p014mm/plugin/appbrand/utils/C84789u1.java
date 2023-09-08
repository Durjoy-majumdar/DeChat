package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p225rc.C48016e;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.u1 */
public class C84789u1 {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f247215a;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        f247215a = identityHashMap;
        identityHashMap.put(Boolean.class, Boolean.TYPE);
        identityHashMap.put(Byte.class, Byte.TYPE);
        identityHashMap.put(Character.class, Character.TYPE);
        identityHashMap.put(Double.class, Double.TYPE);
        identityHashMap.put(Float.class, Float.TYPE);
        identityHashMap.put(Integer.class, Integer.TYPE);
        identityHashMap.put(Long.class, Long.TYPE);
        identityHashMap.put(Short.class, Short.TYPE);
        identityHashMap.put(Void.class, Void.TYPE);
        identityHashMap.put(String.class, (Object) null);
        identityHashMap.put(Map[].class, (Object) null);
    }

    /* renamed from: a */
    public static Map<String, Object> m104469a(int i, Object obj) {
        HashMap hashMap = new HashMap();
        for (Field field : obj.getClass().getDeclaredFields()) {
            boolean z = true;
            field.setAccessible(true);
            String name = field.getName();
            if (i == 1 && !Util.isNullOrNil(name)) {
                int length = name.length();
                StringBuilder sb = new StringBuilder(length);
                boolean z2 = false;
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = name.charAt(i2);
                    if (charAt == '_') {
                        z2 = true;
                    } else if (z2) {
                        sb.append(Character.toUpperCase(charAt));
                        z2 = false;
                    } else {
                        sb.append(charAt);
                    }
                }
                name = sb.toString();
            }
            Object obj2 = null;
            try {
                obj2 = field.get(obj);
            } catch (IllegalAccessException unused) {
            }
            if (obj2 == null) {
                obj2 = "";
            } else if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                Map[] mapArr = new Map[size];
                for (int i3 = 0; i3 < size; i3++) {
                    mapArr[i3] = m104469a(i, list.get(i3));
                }
                obj2 = mapArr;
            }
            if (!obj2.getClass().isPrimitive()) {
                if (!((IdentityHashMap) f247215a).containsKey(obj2.getClass())) {
                    z = false;
                }
            }
            if (!z) {
                obj2 = m104469a(i, obj2);
            }
            hashMap.put(name, obj2);
        }
        C48016e.m53378d(hashMap);
        Log.m105924i("MicroMsg.ObjToMapUtil", new JSONObject(hashMap).toString());
        return hashMap;
    }
}
