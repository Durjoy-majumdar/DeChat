package zx3;

import ay3.C79638a;
import by3.C79854a;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import gy3.C87412m;
import z04.C112550d0;

/* renamed from: zx3.b */
public final class C91945b {

    /* renamed from: a */
    public static final C91943a f263216a;

    static {
        C91943a aVar;
        Object newInstance;
        C79638a newInstance2;
        Object newInstance3;
        C79854a newInstance4;
        Class<C91943a> cls = C91943a.class;
        String property = System.getProperty("java.specification.version");
        int i = StartupILogsReport.TYPEID_FIRST_UI_SHOWN_WARM;
        if (property != null) {
            int D = C112550d0.m153768D(property, '.', 0, false, 6, (Object) null);
            if (D < 0) {
                try {
                    i = Integer.parseInt(property) * 65536;
                } catch (NumberFormatException unused) {
                }
            } else {
                int i2 = D + 1;
                int D2 = C112550d0.m153768D(property, '.', i2, false, 4, (Object) null);
                if (D2 < 0) {
                    D2 = property.length();
                }
                String substring = property.substring(0, D);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = property.substring(i2, D2);
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                i = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            }
        }
        if (i >= 65544 || i < 65536) {
            try {
                newInstance4 = C79854a.class.newInstance();
                C87412m.m108593f(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                aVar = newInstance4;
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance4.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                if (!C87412m.m108589b(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused2) {
                try {
                    newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C87412m.m108593f(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    aVar = (C91943a) newInstance3;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = cls.getClassLoader();
                    if (!C87412m.m108589b(classLoader3, classLoader4)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                    }
                    throw e2;
                } catch (ClassNotFoundException unused3) {
                }
            }
            f263216a = aVar;
        }
        if (i >= 65543 || i < 65536) {
            try {
                newInstance2 = C79638a.class.newInstance();
                C87412m.m108593f(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                aVar = newInstance2;
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                if (!C87412m.m108589b(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused4) {
                try {
                    newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C87412m.m108593f(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                    aVar = (C91943a) newInstance;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader8 = cls.getClassLoader();
                    if (!C87412m.m108589b(classLoader7, classLoader8)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                    }
                    throw e4;
                } catch (ClassNotFoundException unused5) {
                }
            }
            f263216a = aVar;
        }
        aVar = new C91943a();
        f263216a = aVar;
    }
}
