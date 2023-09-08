package com.tencent.p014mm.ipcinvoker;

import com.tencent.p014mm.ipcinvoker.extension.C80894e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import q20.C89450b;
import u20.C90594b;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.z */
public class C80938z {

    /* renamed from: a */
    public static final Map<String, C80894e> f237797a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m98813a(Class<?> cls, Class<?> cls2) {
        try {
            if (!cls2.isAssignableFrom(cls)) {
                C90741c.m113808a("IPC.ObjectStore", "%s isAssignableFrom %s return false", cls2, cls);
                return null;
            } else if (!cls.isAnnotationPresent(C89450b.class)) {
                return C90594b.m113495c(cls, cls2);
            } else {
                String name = cls.getName();
                Map<String, C80894e> map = f237797a;
                C80894e eVar = (C80894e) ((ConcurrentHashMap) map).get(name);
                if (eVar == null) {
                    eVar = new C80894e(cls);
                    ((ConcurrentHashMap) map).put(name, eVar);
                }
                if (eVar.f237722a == null) {
                    synchronized (eVar) {
                        if (eVar.f237722a == null) {
                            eVar.f237722a = C90594b.m113494b(eVar.f237723b);
                        }
                    }
                }
                return eVar.f237722a;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static <T> T m98814b(String str, Class<?> cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (!cls.isAssignableFrom(cls2)) {
                C90741c.m113808a("IPC.ObjectStore", "%s isAssignableFrom %s return false", cls, cls2);
                return null;
            } else if (!cls2.isAnnotationPresent(C89450b.class)) {
                return C90594b.m113496d(str, cls);
            } else {
                Map<String, C80894e> map = f237797a;
                C80894e eVar = (C80894e) ((ConcurrentHashMap) map).get(str);
                if (eVar == null) {
                    eVar = new C80894e(cls2);
                    ((ConcurrentHashMap) map).put(str, eVar);
                }
                if (eVar.f237722a == null) {
                    synchronized (eVar) {
                        if (eVar.f237722a == null) {
                            eVar.f237722a = C90594b.m113494b(eVar.f237723b);
                        }
                    }
                }
                return eVar.f237722a;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
