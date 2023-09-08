package com.tencent.p014mm.p136ui;

import android.util.Log;

/* renamed from: com.tencent.mm.ui.v4 */
public class C85975v4 {

    /* renamed from: a */
    public static C85977b f250419a = new C85976a();

    /* renamed from: com.tencent.mm.ui.v4$a */
    public class C85976a implements C85977b {
        /* renamed from: d */
        public void mo119892d(String str, String str2, Object... objArr) {
        }

        /* renamed from: e */
        public void mo119893e(String str, String str2, Object... objArr) {
        }

        /* renamed from: i */
        public void mo119894i(String str, String str2, Object... objArr) {
        }

        /* renamed from: v */
        public void mo119895v(String str, String str2, Object... objArr) {
        }

        /* renamed from: w */
        public void mo119896w(String str, String str2, Object... objArr) {
        }
    }

    /* renamed from: com.tencent.mm.ui.v4$b */
    public interface C85977b {
        /* renamed from: d */
        void mo119892d(String str, String str2, Object... objArr);

        /* renamed from: e */
        void mo119893e(String str, String str2, Object... objArr);

        /* renamed from: i */
        void mo119894i(String str, String str2, Object... objArr);

        /* renamed from: v */
        void mo119895v(String str, String str2, Object... objArr);

        /* renamed from: w */
        void mo119896w(String str, String str2, Object... objArr);
    }

    /* renamed from: a */
    public static void m106304a(String str, String str2, Object... objArr) {
        C85977b bVar = f250419a;
        if (bVar != null) {
            bVar.mo119892d(str, str2, objArr);
        }
    }

    /* renamed from: b */
    public static void m106305b(String str, String str2, Object... objArr) {
        C85977b bVar = f250419a;
        if (bVar != null) {
            bVar.mo119893e(str, str2, objArr);
        }
    }

    /* renamed from: c */
    public static void m106306c(String str, String str2, Object... objArr) {
        C85977b bVar = f250419a;
        if (bVar != null) {
            bVar.mo119894i(str, str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m106307d(String str, Throwable th, String str2, Object... objArr) {
        if (f250419a != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f250419a.mo119893e(str, str2 + "  " + Log.getStackTraceString(th), new Object[0]);
        }
    }

    /* renamed from: e */
    public static void m106308e(String str, String str2, Object... objArr) {
        C85977b bVar = f250419a;
        if (bVar != null) {
            bVar.mo119895v(str, str2, objArr);
        }
    }

    /* renamed from: f */
    public static void m106309f(String str, String str2, Object... objArr) {
        C85977b bVar = f250419a;
        if (bVar != null) {
            bVar.mo119896w(str, str2, objArr);
        }
    }
}
