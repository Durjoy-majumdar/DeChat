package p1014o4;

/* renamed from: o4.m */
public abstract class C117693m {

    /* renamed from: a */
    public static C117693m f352015a;

    /* renamed from: o4.m$a */
    public static class C117694a extends C117693m {

        /* renamed from: b */
        public int f352016b;

        public C117694a(int i) {
            super(i);
            this.f352016b = i;
        }

        /* renamed from: a */
        public void mo182389a(String str, String str2, Throwable... thArr) {
            if (this.f352016b <= 3 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: b */
        public void mo182390b(String str, String str2, Throwable... thArr) {
            if (this.f352016b <= 6 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: d */
        public void mo182391d(String str, String str2, Throwable... thArr) {
            if (this.f352016b <= 4 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }

        /* renamed from: f */
        public void mo182392f(String str, String str2, Throwable... thArr) {
            if (this.f352016b <= 5 && thArr != null && thArr.length >= 1) {
                Throwable th = thArr[0];
            }
        }
    }

    public C117693m(int i) {
    }

    /* renamed from: c */
    public static synchronized C117693m m165966c() {
        C117693m mVar;
        synchronized (C117693m.class) {
            if (f352015a == null) {
                f352015a = new C117694a(3);
            }
            mVar = f352015a;
        }
        return mVar;
    }

    /* renamed from: e */
    public static String m165967e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo182389a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo182390b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo182391d(String str, String str2, Throwable... thArr);

    /* renamed from: f */
    public abstract void mo182392f(String str, String str2, Throwable... thArr);
}
