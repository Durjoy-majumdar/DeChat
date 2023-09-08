package com.hilive.mediasdk;

public class LogDelegate {
    private static ILog sImp = new DefaultLog();

    public static class DefaultLog implements ILog {
        private DefaultLog() {
        }

        /* renamed from: d */
        public void mo111122d(String str, String str2, Object... objArr) {
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
        public void mo111123e(String str, String str2, Object... objArr) {
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
        public void mo111124i(String str, String str2, Object... objArr) {
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

        /* renamed from: v */
        public void mo111126v(String str, String str2, Object... objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String.format(str2, objArr);
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: w */
        public void mo111127w(String str, String str2, Object... objArr) {
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

    public interface ILog {
        /* renamed from: d */
        void mo111122d(String str, String str2, Object... objArr);

        /* renamed from: e */
        void mo111123e(String str, String str2, Object... objArr);

        /* renamed from: i */
        void mo111124i(String str, String str2, Object... objArr);

        void printStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* renamed from: v */
        void mo111126v(String str, String str2, Object... objArr);

        /* renamed from: w */
        void mo111127w(String str, String str2, Object... objArr);
    }

    /* renamed from: d */
    public static void m97521d(String str, String str2, Object... objArr) {
        sImp.mo111122d(str, str2, objArr);
    }

    /* renamed from: e */
    public static void m97522e(String str, String str2, Object... objArr) {
        sImp.mo111123e(str, str2, objArr);
    }

    /* renamed from: i */
    public static void m97523i(String str, String str2, Object... objArr) {
        sImp.mo111124i(str, str2, objArr);
    }

    public static void printStackTrace(String str, Throwable th, String str2, Object... objArr) {
        sImp.printStackTrace(str, th, str2, objArr);
    }

    public static void setImp(ILog iLog) {
        if (iLog != null) {
            sImp = iLog;
        }
    }

    /* renamed from: v */
    public static void m97524v(String str, String str2, Object... objArr) {
        sImp.mo111126v(str, str2, objArr);
    }

    /* renamed from: w */
    public static void m97525w(String str, String str2, Object... objArr) {
        sImp.mo111127w(str, str2, objArr);
    }
}
