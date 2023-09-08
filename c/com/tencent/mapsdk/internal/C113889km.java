package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.mapsdk.internal.C113880kc;
import java.io.File;

/* renamed from: com.tencent.mapsdk.internal.km */
public final class C113889km {

    /* renamed from: a */
    public static C113890kn f340717a;

    /* renamed from: a */
    private static void m157535a(C113890kn knVar) {
        if (f340717a != knVar) {
            f340717a = knVar;
        }
    }

    /* renamed from: b */
    public static void m157545b(String str, String str2) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172307b(str, str2);
        } else {
            m157566g(str, str2);
        }
    }

    /* renamed from: c */
    public static void m157550c(String str, String str2) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172312c(str, str2);
        } else {
            m157566g(str, str2);
        }
    }

    /* renamed from: d */
    private static void m157555d(String str, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172298a(str, th);
        } else {
            m157552c(str, th);
        }
    }

    /* renamed from: e */
    private static void m157557e(String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172306b(str);
        } else {
            System.out.println(str);
        }
    }

    /* renamed from: f */
    private static void m157561f(String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172311c(str);
        } else {
            System.out.println(str);
        }
    }

    /* renamed from: g */
    private static void m157565g(String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172325g(str);
        } else {
            System.out.println(str);
        }
    }

    /* renamed from: h */
    private static void m157567h(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public static void m157538a(String str, String str2) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172296a(str, str2);
        } else {
            m157566g(str, str2);
        }
    }

    /* renamed from: b */
    public static void m157544b(String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172319e(str);
        } else {
            System.out.println(str);
        }
    }

    /* renamed from: c */
    public static void m157549c(String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172323f(str);
        } else {
            System.out.println(str);
        }
    }

    /* renamed from: d */
    private static void m157554d(String str, String str2, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172297a(str, str2, th);
        } else {
            m157551c(str, str2, th);
        }
    }

    /* renamed from: e */
    private static void m157560e(String str, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172309b(str, th);
        } else {
            m157552c(str, th);
        }
    }

    /* renamed from: f */
    private static void m157564f(String str, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172314c(str, th);
        } else {
            m157552c(str, th);
        }
    }

    /* renamed from: g */
    private static void m157566g(String str, String str2) {
        System.out.println("[" + str + "]:" + str2);
    }

    /* renamed from: a */
    public static void m157539a(String str, String str2, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172308b(str, str2, th);
        } else {
            m157551c(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m157547b(String str, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172322e(str, th);
        } else {
            m157552c(str, th);
        }
    }

    /* renamed from: c */
    public static void m157551c(String str, String str2, Throwable th) {
        System.out.println("[" + str + "]:" + str2 + th);
    }

    /* renamed from: d */
    public static void m157553d(String str, String str2) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172316d(str, str2);
        } else {
            m157566g(str, str2);
        }
    }

    /* renamed from: e */
    private static void m157559e(String str, String str2, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172313c(str, str2, th);
        } else {
            m157551c(str, str2, th);
        }
    }

    /* renamed from: f */
    private static void m157563f(String str, String str2, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172317d(str, str2, th);
        } else {
            m157551c(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m157537a(String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172315d(str);
        } else {
            System.out.println(str);
        }
    }

    /* renamed from: c */
    public static void m157552c(String str, Throwable th) {
        System.out.println(str + th);
    }

    /* renamed from: b */
    public static void m157546b(String str, String str2, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172321e(str, str2, th);
        } else {
            m157551c(str, str2, th);
        }
    }

    /* renamed from: d */
    public static boolean m157556d(String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            return knVar.mo172304a(str);
        }
        return false;
    }

    /* renamed from: e */
    public static void m157558e(String str, String str2) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172320e(str, str2);
        } else {
            m157566g(str, str2);
        }
    }

    /* renamed from: f */
    public static void m157562f(String str, String str2) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172324f(str, str2);
        }
    }

    /* renamed from: a */
    public static void m157540a(String str, Throwable th) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172318d(str, th);
        } else {
            m157552c(str, th);
        }
    }

    /* renamed from: b */
    private static boolean m157548b() {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            return knVar.mo172302a();
        }
        return false;
    }

    /* renamed from: a */
    public static String m157533a() {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            return knVar.mo172305b();
        }
        return null;
    }

    /* renamed from: a */
    private static void m157536a(File file, String str, String str2) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172295a(file, str, str2);
        }
    }

    /* renamed from: a */
    private static boolean m157543a(int i, String str) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            return knVar.mo172303a(i, str);
        }
        return false;
    }

    /* renamed from: a */
    public static void m157534a(Context context, C113880kc.C113881a aVar) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172294a(context, aVar);
        }
    }

    /* renamed from: a */
    private static void m157542a(boolean z, String... strArr) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172301a(z, strArr);
        }
    }

    /* renamed from: a */
    private static void m157541a(boolean z, int i, String... strArr) {
        C113890kn knVar = f340717a;
        if (knVar != null) {
            knVar.mo172300a(z, i, strArr);
        }
    }
}
