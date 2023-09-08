package p723vf;

import android.util.Log;

/* renamed from: vf.d */
public class C118672d {

    /* renamed from: a */
    public static C118673b f355106a = new C37724a();

    /* renamed from: vf.d$a */
    public class C37724a implements C118673b {
        /* renamed from: d */
        public void mo61301d(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                String.format(str2, objArr);
            }
        }

        /* renamed from: e */
        public void mo61302e(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                String.format(str2, objArr);
            }
        }

        /* renamed from: i */
        public void mo61303i(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                String.format(str2, objArr);
            }
        }

        public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
            if (!(objArr == null || objArr.length == 0)) {
                String.format(str2, objArr);
            }
            Log.getStackTraceString(th);
        }

        /* renamed from: v */
        public void mo61305v(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                String.format(str2, objArr);
            }
        }

        /* renamed from: w */
        public void mo61306w(String str, String str2, Object... objArr) {
            if (objArr != null && objArr.length != 0) {
                String.format(str2, objArr);
            }
        }
    }

    /* renamed from: vf.d$b */
    public interface C118673b {
        /* renamed from: d */
        void mo61301d(String str, String str2, Object... objArr);

        /* renamed from: e */
        void mo61302e(String str, String str2, Object... objArr);

        /* renamed from: i */
        void mo61303i(String str, String str2, Object... objArr);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* renamed from: v */
        void mo61305v(String str, String str2, Object... objArr);

        /* renamed from: w */
        void mo61306w(String str, String str2, Object... objArr);
    }

    /* renamed from: a */
    public static void m167351a(String str, String str2, Object... objArr) {
        C118673b bVar = f355106a;
        if (bVar != null) {
            bVar.mo61301d(str, str2, objArr);
        }
    }

    /* renamed from: b */
    public static void m167352b(String str, String str2, Object... objArr) {
        C118673b bVar = f355106a;
        if (bVar != null) {
            bVar.mo61302e(str, str2, objArr);
        }
    }

    /* renamed from: c */
    public static void m167353c(String str, String str2, Object... objArr) {
        C118673b bVar = f355106a;
        if (bVar != null) {
            bVar.mo61303i(str, str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m167354d(String str, Throwable th, String str2, Object... objArr) {
        C118673b bVar = f355106a;
        if (bVar != null) {
            bVar.printErrStackTrace(str, th, str2, objArr);
        }
    }

    /* renamed from: e */
    public static void m167355e(String str, String str2, Object... objArr) {
        C118673b bVar = f355106a;
        if (bVar != null) {
            bVar.mo61305v(str, str2, objArr);
        }
    }

    /* renamed from: f */
    public static void m167356f(String str, String str2, Object... objArr) {
        C118673b bVar = f355106a;
        if (bVar != null) {
            bVar.mo61306w(str, str2, objArr);
        }
    }
}
