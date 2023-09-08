package com.tencent.p014mm.app;

import com.tencent.stubs.logger.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kj2.C117407d;

/* renamed from: com.tencent.mm.app.s0 */
public class C80611s0 {

    /* renamed from: a */
    public static final List<C80613b> f235834a = new ArrayList();

    /* renamed from: b */
    public static final boolean[] f235835b = {false};

    /* renamed from: c */
    public static Log.Logger f235836c = new C80612a();

    /* renamed from: com.tencent.mm.app.s0$a */
    public class C80612a implements Log.Logger {
        public boolean isLoggable(String str, int i) {
            return true;
        }

        public void println(int i, String str, String str2) {
            if (i == 2) {
                Object[] objArr = new Object[0];
                boolean[] zArr = C80611s0.f235835b;
                synchronized (zArr) {
                    if (zArr[0]) {
                        com.tencent.p014mm.sdk.platformtools.Log.m105927v(str, str2, objArr);
                    } else {
                        List<C80613b> list = C80611s0.f235834a;
                        synchronized (list) {
                            ((ArrayList) list).add(new C80616e(2, str, str2));
                        }
                    }
                }
            } else if (i == 3) {
                Object[] objArr2 = new Object[0];
                boolean[] zArr2 = C80611s0.f235835b;
                synchronized (zArr2) {
                    if (zArr2[0]) {
                        com.tencent.p014mm.sdk.platformtools.Log.m105919d(str, str2, objArr2);
                    } else {
                        List<C80613b> list2 = C80611s0.f235834a;
                        synchronized (list2) {
                            ((ArrayList) list2).add(new C80616e(3, str, str2));
                        }
                    }
                }
            } else if (i == 4) {
                C80611s0.m98247e(str, str2, new Object[0]);
            } else if (i == 5) {
                C80611s0.m98248f(str, str2, new Object[0]);
            } else if (i == 6) {
                C80611s0.m98245c(str, str2, new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.app.s0$b */
    public static abstract class C80613b {

        /* renamed from: a */
        public final String f235837a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH).format(new Date());

        /* renamed from: a */
        public abstract void mo112356a();
    }

    /* renamed from: com.tencent.mm.app.s0$c */
    public static class C80614c extends C80613b {

        /* renamed from: b */
        public final int f235838b;

        /* renamed from: c */
        public final int f235839c;

        /* renamed from: d */
        public final int f235840d;

        public C80614c(int i, int i2, int i3) {
            this.f235838b = i;
            this.f235839c = i2;
            this.f235840d = i3;
        }

        /* renamed from: a */
        public void mo112356a() {
            C117407d.INSTANCE.idkeyStat((long) this.f235838b, (long) this.f235839c, (long) this.f235840d, true);
        }
    }

    /* renamed from: com.tencent.mm.app.s0$d */
    public static class C80615d extends C80613b {

        /* renamed from: b */
        public final int f235841b;

        /* renamed from: c */
        public final Object[] f235842c;

        public C80615d(int i, Object... objArr) {
            this.f235841b = i;
            this.f235842c = objArr;
        }

        /* renamed from: a */
        public void mo112356a() {
            C117407d.INSTANCE.mo160128e(this.f235841b, true, true, false, this.f235842c);
        }
    }

    /* renamed from: com.tencent.mm.app.s0$e */
    public static class C80616e extends C80613b {

        /* renamed from: b */
        public final int f235843b;

        /* renamed from: c */
        public final String f235844c;

        /* renamed from: d */
        public final String f235845d;

        public C80616e(int i, String str, String str2) {
            this.f235843b = i;
            this.f235844c = str;
            this.f235845d = str2;
        }

        /* renamed from: a */
        public void mo112356a() {
            int i = this.f235843b;
            if (i == 2) {
                com.tencent.p014mm.sdk.platformtools.Log.m105927v("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", this.f235844c, this.f235837a, this.f235845d);
            } else if (i == 3) {
                com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", this.f235844c, this.f235837a, this.f235845d);
            } else if (i == 4) {
                com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", this.f235844c, this.f235837a, this.f235845d);
            } else if (i == 5) {
                com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", this.f235844c, this.f235837a, this.f235845d);
            } else if (i == 6) {
                com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.PendingLogAndReport", "[%s @ %s] %s", this.f235844c, this.f235837a, this.f235845d);
            }
        }
    }

    /* renamed from: a */
    public static void m98243a(int i, int i2, int i3) {
        boolean[] zArr = f235835b;
        synchronized (zArr) {
            if (zArr[0]) {
                C117407d.INSTANCE.idkeyStat((long) i, (long) i2, (long) i3, true);
            } else {
                List<C80613b> list = f235834a;
                synchronized (list) {
                    ((ArrayList) list).add(new C80614c(i, i2, i3));
                }
            }
        }
    }

    /* renamed from: b */
    public static void m98244b(int i, Object... objArr) {
        boolean[] zArr = f235835b;
        synchronized (zArr) {
            if (zArr[0]) {
                C117407d.INSTANCE.mo160131h(i, objArr);
            } else {
                List<C80613b> list = f235834a;
                synchronized (list) {
                    ((ArrayList) list).add(new C80615d(i, objArr));
                }
            }
        }
    }

    /* renamed from: c */
    public static void m98245c(String str, String str2, Object... objArr) {
        boolean[] zArr = f235835b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(str, str2, objArr);
            } else {
                List<C80613b> list = f235834a;
                synchronized (list) {
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                str2 = String.format(str2, objArr);
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    ((ArrayList) list).add(new C80616e(6, str, str2));
                }
            }
        }
    }

    /* renamed from: d */
    public static void m98246d(String str, Throwable th, String str2, Object... objArr) {
        boolean[] zArr = f235835b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(str, th, str2, objArr);
            } else {
                StringBuilder sb = new StringBuilder();
                if (objArr == null || objArr.length <= 0) {
                    sb.append(str2);
                } else {
                    sb.append(String.format(str2, objArr));
                }
                sb.append("  ");
                sb.append(android.util.Log.getStackTraceString(th));
                List<C80613b> list = f235834a;
                synchronized (list) {
                    ((ArrayList) list).add(new C80616e(6, str, sb.toString()));
                }
            }
        }
    }

    /* renamed from: e */
    public static void m98247e(String str, String str2, Object... objArr) {
        boolean[] zArr = f235835b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(str, str2, objArr);
            } else {
                List<C80613b> list = f235834a;
                synchronized (list) {
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                str2 = String.format(str2, objArr);
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    ((ArrayList) list).add(new C80616e(4, str, str2));
                }
            }
        }
    }

    /* renamed from: f */
    public static void m98248f(String str, String str2, Object... objArr) {
        boolean[] zArr = f235835b;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(str, str2, objArr);
            } else {
                List<C80613b> list = f235834a;
                synchronized (list) {
                    if (objArr != null) {
                        try {
                            if (objArr.length > 0) {
                                str2 = String.format(str2, objArr);
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    ((ArrayList) list).add(new C80616e(5, str, str2));
                }
            }
        }
    }
}
