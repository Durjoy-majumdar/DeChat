package p850ek;

import p006bk.C54485h;
import p871zj.C66836c;

/* renamed from: ek.e */
public class C58614e {

    /* renamed from: a */
    public static C54485h f167820a;

    /* renamed from: b */
    public static final int f167821b = (C66836c.f191968b ? 4 : 3);

    /* renamed from: c */
    public static final StringBuilder f167822c = new StringBuilder();

    /* renamed from: a */
    public static void m68064a(String str, String str2) {
        C54485h hVar;
        if (f167821b >= 4 && (hVar = f167820a) != null) {
            hVar.mo14326d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m68065b(String str, Object... objArr) {
        if (f167821b >= 4 && f167820a != null) {
            f167822c.setLength(0);
            for (Object append : objArr) {
                f167822c.append(append);
            }
            f167820a.mo14326d(str, f167822c.toString());
        }
    }

    /* renamed from: c */
    public static void m68066c(String str, String str2, Throwable th) {
        C54485h hVar;
        if (f167821b >= 1 && (hVar = f167820a) != null) {
            hVar.mo14328e(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m68067d(String str, String str2) {
        C54485h hVar;
        if (f167821b >= 3 && (hVar = f167820a) != null) {
            hVar.mo14329i(str, str2);
        }
    }

    /* renamed from: e */
    public static void m68068e(String str, Object... objArr) {
        if (f167821b >= 3 && f167820a != null) {
            f167822c.setLength(0);
            for (Object append : objArr) {
                f167822c.append(append);
            }
            f167820a.mo14329i(str, f167822c.toString());
        }
    }

    /* renamed from: f */
    public static void m68069f(String str, String str2) {
        C54485h hVar;
        if (f167821b >= 5 && (hVar = f167820a) != null) {
            hVar.mo14330v(str, str2);
        }
    }

    /* renamed from: g */
    public static void m68070g(String str, Object... objArr) {
        if (f167821b >= 5 && f167820a != null) {
            f167822c.setLength(0);
            for (Object append : objArr) {
                f167822c.append(append);
            }
            f167820a.mo14330v(str, f167822c.toString());
        }
    }
}
