package p413ok;

import android.util.Log;

/* renamed from: ok.c */
public class C77014c {

    /* renamed from: a */
    public static C77015b f225001a = new C35179a();

    /* renamed from: ok.c$a */
    public static class C35179a implements C77015b {
        /* renamed from: e */
        public void mo59895e(String str, String str2) {
        }

        /* renamed from: i */
        public void mo59896i(String str, String str2) {
        }

        /* renamed from: v */
        public void mo59897v(String str, String str2) {
        }

        /* renamed from: w */
        public void mo59898w(String str, String str2) {
        }
    }

    /* renamed from: ok.c$b */
    public interface C77015b {
        /* renamed from: e */
        void mo59895e(String str, String str2);

        /* renamed from: i */
        void mo59896i(String str, String str2);

        /* renamed from: v */
        void mo59897v(String str, String str2);

        /* renamed from: w */
        void mo59898w(String str, String str2);
    }

    /* renamed from: a */
    public static void m92921a(String str, String str2, Object... objArr) {
        if (f225001a != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f225001a.mo59895e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m92922b(String str, String str2, Object... objArr) {
        if (f225001a != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f225001a.mo59896i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m92923c(String str, Throwable th, String str2, Object... objArr) {
        if (f225001a != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f225001a.mo59895e(str, str2 + "  " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: d */
    public static void m92924d(String str, String str2, Object... objArr) {
        if (f225001a != null) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f225001a.mo59898w(str, str2);
        }
    }
}
