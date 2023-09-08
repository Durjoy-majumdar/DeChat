package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.internal.C114207sl;
import java.io.File;

/* renamed from: com.tencent.mapsdk.internal.u */
public final class C114361u implements C114204si, C114205sj, C114206sk {

    /* renamed from: c */
    private static final C114361u f342768c = new C114361u();

    /* renamed from: a */
    public C114205sj f342769a = new C114205sj() {
        /* renamed from: a */
        public final <T> T mo172870a(Class<T> cls, Object... objArr) {
            return Util.newInstance(cls, objArr);
        }

        /* renamed from: a */
        public final void mo172880a(Context context, String str) {
        }

        /* renamed from: b */
        public final Object mo172874b(String str) {
            return Util.newInstance(mo172867a(str), new Object[0]);
        }

        /* renamed from: c */
        public final int mo172875c() {
            return 0;
        }

        /* renamed from: d */
        public final File mo172876d() {
            return null;
        }

        /* renamed from: i */
        public final void mo172881i() {
        }

        /* renamed from: a */
        public final Object mo172872a(Object obj, String str, Object... objArr) {
            return Util.invokeMethod(obj, str, objArr);
        }

        /* renamed from: b */
        public final ClassLoader mo172873b() {
            return C1143621.class.getClassLoader();
        }

        /* renamed from: a */
        public final Object mo172871a(Object obj, String str, Class[] clsArr, Object[] objArr) {
            return Util.invokeMethod(obj, str, clsArr, objArr);
        }

        /* renamed from: a */
        public final Object mo172869a(Class cls, String str, Class[] clsArr, Object[] objArr) {
            return Util.invokeStaticMethod(cls, str, clsArr, objArr);
        }

        /* renamed from: a */
        public final Class mo172867a(String str) {
            return Util.findClass(str, C1143621.class.getClassLoader());
        }

        /* renamed from: a */
        public final <T> Class<? extends T> mo172868a(String str, Class<T> cls) {
            return Util.findClass(str, cls, C1143621.class.getClassLoader());
        }
    };

    /* renamed from: b */
    public C114195s f342770b;

    /* renamed from: d */
    private C114204si f342771d = new C114204si() {
        /* renamed from: a */
        public final void mo172880a(Context context, String str) {
        }

        /* renamed from: h */
        public final void mo172866h() {
        }

        /* renamed from: i */
        public final void mo172881i() {
        }
    };

    /* renamed from: e */
    private C114206sk f342772e = new C114206sk() {
        /* renamed from: a */
        public final void mo172880a(Context context, String str) {
        }

        /* renamed from: e */
        public final void mo172877e() {
        }

        /* renamed from: f */
        public final void mo172878f() {
        }

        /* renamed from: g */
        public final void mo172879g() {
        }

        /* renamed from: i */
        public final void mo172881i() {
        }
    };

    private C114361u() {
    }

    /* renamed from: a */
    public static C114361u m160481a() {
        return f342768c;
    }

    /* renamed from: j */
    private C114195s m160483j() {
        return this.f342770b;
    }

    /* renamed from: k */
    private File m160484k() {
        return this.f342769a.mo172876d();
    }

    /* renamed from: b */
    public final Object mo172874b(String str) {
        return this.f342769a.mo172874b(str);
    }

    /* renamed from: c */
    public final int mo172875c() {
        return this.f342769a.mo172875c();
    }

    /* renamed from: d */
    public final File mo172876d() {
        return this.f342769a.mo172876d();
    }

    /* renamed from: e */
    public final void mo172877e() {
    }

    /* renamed from: f */
    public final void mo172878f() {
    }

    /* renamed from: g */
    public final void mo172879g() {
    }

    /* renamed from: h */
    public final void mo172866h() {
    }

    /* renamed from: i */
    public final void mo172881i() {
    }

    /* renamed from: a */
    private void m160482a(Context context, String str, Callback<Void> callback) {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Context context2 = context;
        final String str2 = str;
        final Callback<Void> callback2 = callback;
        new Thread(new Runnable() {
            public final void run() {
                C114361u.this.mo172880a(context2, str2);
                handler.post(new Runnable() {
                    public final void run() {
                        Callback callback = callback2;
                        if (callback != null) {
                            callback.callback(null);
                        }
                    }
                });
            }
        }, "tms-plugin").start();
    }

    /* renamed from: b */
    public final ClassLoader mo172873b() {
        return this.f342769a.mo172873b();
    }

    /* renamed from: a */
    public final void mo172880a(Context context, String str) {
        C114207sl.m159649a(context);
        if (!C114207sl.f341944p.isEmpty()) {
            for (C114207sl.C114209b bVar : C114207sl.f341944p) {
                String str2 = "com.tencent.mapsdk." + bVar.f341949d;
                Object obj = null;
                if (Util.findClass(str2, C114361u.class.getClassLoader()) != null) {
                    obj = this.f342769a.mo172874b(str2);
                }
                if (obj instanceof C114207sl.C114208a) {
                    ((C114207sl.C114208a) obj).mo172880a(context, str);
                }
                if (obj instanceof C114205sj) {
                    this.f342769a = (C114205sj) obj;
                } else if (obj instanceof C114206sk) {
                    this.f342772e = (C114206sk) obj;
                } else if (obj instanceof C114204si) {
                    this.f342771d = (C114204si) obj;
                }
            }
        }
        this.f342770b = (C114195s) this.f342769a.mo172874b("com.tencent.mapsdk.core.MapDelegateFactoryImpl");
    }

    /* renamed from: a */
    public final Class mo172867a(String str) {
        return this.f342769a.mo172867a(str);
    }

    /* renamed from: a */
    public final <T> Class<? extends T> mo172868a(String str, Class<T> cls) {
        return this.f342769a.mo172868a(str, cls);
    }

    /* renamed from: a */
    public final <T> T mo172870a(Class<T> cls, Object... objArr) {
        return this.f342769a.mo172870a(cls, objArr);
    }

    /* renamed from: a */
    public final Object mo172872a(Object obj, String str, Object... objArr) {
        return this.f342769a.mo172872a(obj, str, objArr);
    }

    /* renamed from: a */
    public final Object mo172871a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        return this.f342769a.mo172871a(obj, str, clsArr, objArr);
    }

    /* renamed from: a */
    public final Object mo172869a(Class cls, String str, Class[] clsArr, Object[] objArr) {
        return this.f342769a.mo172869a(cls, str, clsArr, objArr);
    }
}
