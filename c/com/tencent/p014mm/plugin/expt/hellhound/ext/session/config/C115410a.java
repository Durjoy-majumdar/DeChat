package com.tencent.p014mm.plugin.expt.hellhound.ext.session.config;

import android.app.Activity;
import java.lang.reflect.Field;
import te3.C118448o14;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.config.a */
public final class C115410a {
    /* renamed from: a */
    public static boolean m162217a(Activity activity, C118448o14 o142) {
        if (!(activity == null || o142 == null)) {
            Class<?> cls = Class.forName(o142.f354156d);
            String str = o142.f354157e;
            if (str != null && !str.isEmpty()) {
                String[] split = o142.f354157e.split(",");
                if (split.length <= 0) {
                    return false;
                }
                String[] split2 = split[0].split("\\|");
                Field declaredField = cls.getDeclaredField(split2[0]);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(activity);
                if (split.length == 1) {
                    return o142.f354158f.equals(obj);
                }
                int i = 1;
                while (i < split.length) {
                    Class<?> cls2 = Class.forName(split2[1]);
                    String[] split3 = split[i].split("\\|");
                    Field declaredField2 = cls2.getDeclaredField(split3[0]);
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(obj);
                    i++;
                    split2 = split3;
                }
                return o142.f354158f.equals(obj);
            }
        }
        return false;
    }
}
