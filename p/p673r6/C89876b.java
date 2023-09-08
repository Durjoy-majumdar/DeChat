package p673r6;

/* renamed from: r6.b */
public class C89876b {

    /* renamed from: a */
    public static C89879c f258326a = new C89878b((C89877a) null);

    /* renamed from: r6.b$b */
    public static class C89878b implements C89879c {
        public C89878b(C89877a aVar) {
        }

        /* renamed from: d */
        public void mo123902d(String str, String str2, Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String.format(str2, objArr);
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo123903e(String str, String str2, Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String.format(str2, objArr);
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: i */
        public void mo123904i(String str, String str2, Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String.format(str2, objArr);
                    }
                } catch (Exception unused) {
                }
            }
        }

        public void printStackTrace(String str, Throwable th, String str2, Object... objArr) {
            if (th != null && objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String.format(str2, objArr);
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: w */
        public void mo123906w(String str, String str2, Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String.format(str2, objArr);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: r6.b$c */
    public interface C89879c {
        /* renamed from: d */
        void mo123902d(String str, String str2, Object... objArr);

        /* renamed from: e */
        void mo123903e(String str, String str2, Object... objArr);

        /* renamed from: i */
        void mo123904i(String str, String str2, Object... objArr);

        void printStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* renamed from: w */
        void mo123906w(String str, String str2, Object... objArr);
    }

    /* renamed from: a */
    public static void m112384a(String str, String str2, Object... objArr) {
        f258326a.mo123903e(str, str2, objArr);
    }

    /* renamed from: b */
    public static void m112385b(String str, String str2, Object... objArr) {
        f258326a.mo123904i(str, str2, objArr);
    }

    /* renamed from: c */
    public static void m112386c(String str, Throwable th, String str2, Object... objArr) {
        f258326a.printStackTrace(str, th, str2, objArr);
    }
}
