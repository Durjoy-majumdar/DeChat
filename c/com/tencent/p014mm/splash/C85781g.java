package com.tencent.p014mm.splash;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.p014mm.legacy.app.C80967m;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.tencent.mm.splash.g */
public class C85781g {

    /* renamed from: a */
    public static final ArrayList<SplashHackActivity> f249823a = new ArrayList<>();

    /* renamed from: b */
    public static final ArrayList<Message> f249824b = new ArrayList<>();

    /* renamed from: c */
    public static Application f249825c;

    /* renamed from: d */
    public static String f249826d;

    /* renamed from: e */
    public static C85779d f249827e;

    /* renamed from: f */
    public static C85778c f249828f;

    /* renamed from: g */
    public static C85780e f249829g;

    /* renamed from: h */
    public static Set<SplashActivity> f249830h = new HashSet();

    /* renamed from: i */
    public static boolean f249831i = false;

    /* renamed from: j */
    public static volatile boolean f249832j = false;

    /* renamed from: k */
    public static boolean f249833k = false;

    /* renamed from: l */
    public static C85791o f249834l;

    /* renamed from: m */
    public static boolean f249835m = false;

    /* renamed from: n */
    public static C85777b f249836n;

    /* renamed from: o */
    public static Class<? extends SplashActivity> f249837o;

    /* renamed from: p */
    public static Set<String> f249838p = new HashSet();

    /* renamed from: q */
    public static Class<? extends Activity> f249839q;

    /* renamed from: r */
    public static C85790n f249840r = new C85790n();

    /* renamed from: s */
    public static HashSet<String> f249841s = new HashSet<>();

    /* renamed from: t */
    public static boolean f249842t = false;

    /* renamed from: com.tencent.mm.splash.g$a */
    public class C85782a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Handler f249843d;

        public C85782a(Handler handler) {
            this.f249843d = handler;
        }

        public void run() {
            C85781g.f249842t = true;
            this.f249843d.removeCallbacksAndMessages((Object) null);
            C85781g.m105955c("WxSplash.Splash", "verify mH callback hack, result ok.", new Object[0]);
        }
    }

    /* renamed from: com.tencent.mm.splash.g$b */
    public class C85783b implements Runnable {
        public void run() {
            if (!C85781g.f249842t) {
                C85781g.m105955c("WxSplash.Splash", "verify mH callback hack, result failed!.", new Object[0]);
                C85781g.f249840r.mo119635a(675, 32, 1);
                try {
                    Object f = C85781g.m105958f(C85781g.f249825c);
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(f == C85786k.f249853a);
                    C85781g.m105955c("WxSplash.Splash", "spy, activityThread %s", objArr);
                    Field declaredField = f.getClass().getDeclaredField("mH");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(f);
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Boolean.valueOf(handler == C85786k.f249854b);
                    C85781g.m105955c("WxSplash.Splash", "spy, ActivityThread_mH %s", objArr2);
                    Field declaredField2 = Handler.class.getDeclaredField("mCallback");
                    declaredField2.setAccessible(true);
                    Handler.Callback callback = (Handler.Callback) declaredField2.get(handler);
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = Boolean.valueOf(callback == C85786k.f249857e);
                    objArr3[1] = callback;
                    C85781g.m105955c("WxSplash.Splash", "spy, callback %s %s", objArr3);
                } catch (Exception e) {
                    C85781g.m105956d(e, "spy failed.");
                }
            }
        }
    }

    /* renamed from: a */
    public static void m105953a() {
        m105955c("WxSplash.Splash", "splash done, do finally things. ", new Object[0]);
        f249831i = false;
        int size = ((HashSet) f249830h).size();
        Iterator it = ((HashSet) f249830h).iterator();
        while (it.hasNext()) {
            SplashActivity splashActivity = (SplashActivity) it.next();
            m105955c("WxSplash.Splash", "iterate splash activity %s.", splashActivity);
            splashActivity.mo119623F7();
        }
        if (size == 0) {
            m105955c("WxSplash.Splash", "no splash activity found, so we terminate hacked activities manually.", new Object[0]);
            Iterator<SplashHackActivity> it4 = f249823a.iterator();
            while (it4.hasNext()) {
                m105960h(it4.next());
            }
        }
        m105955c("WxSplash.Splash", "resend all %s pending message. ", Integer.valueOf(f249824b.size()));
        if (!f249832j) {
            m105959g();
        }
        f249834l = null;
        m105955c("WxSplash.Splash", "we need splash no more.", new Object[0]);
        synchronized (C85781g.class) {
            f249835m = false;
        }
        C85790n nVar = f249840r;
        if (nVar.f249870c > 0) {
            long currentTimeMillis = System.currentTimeMillis() - nVar.f249870c;
            if (C44650f.f121058a) {
                C85790n nVar2 = nVar;
                nVar2.mo119635a(676, 1, 1);
                nVar2.mo119635a(676, 3, currentTimeMillis);
                return;
            }
            C85790n nVar3 = nVar;
            nVar3.mo119635a(676, 0, 1);
            nVar3.mo119635a(676, 2, currentTimeMillis);
        }
    }

    /* renamed from: b */
    public static boolean m105954b(Instrumentation instrumentation) {
        if (Object.class != instrumentation.getClass().getSuperclass()) {
            String canonicalName = instrumentation.getClass().getCanonicalName();
            if (canonicalName.startsWith("android.support.test") || canonicalName.startsWith("android.test")) {
                m105955c("WxSplash.Splash", "android instrument test is running, do not need splash.", new Object[0]);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m105955c(String str, String str2, Object... objArr) {
        C85777b bVar = f249836n;
        if (bVar != null) {
            ((C80967m) bVar).getClass();
            Log.m105925i(str, str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m105956d(Throwable th, String str) {
        C85777b bVar = f249836n;
        if (bVar != null) {
            ((C80967m) bVar).getClass();
            Log.printErrStackTrace("WxSplash.WeChatSplash", th, str, new Object[0]);
            if (str == null) {
                str = "";
            }
            f249840r.f249869b.add(str + "  " + android.util.Log.getStackTraceString(th));
        }
    }

    /* renamed from: e */
    public static void m105957e() {
        Handler handler = new Handler();
        C85782a aVar = new C85782a(handler);
        C85784i.f249845i = true;
        C85784i.f249846j = aVar;
        C85786k.f249854b.sendEmptyMessage(987654321);
        handler.postDelayed(new C85783b(), 2000);
    }

    /* renamed from: f */
    public static Object m105958f(Context context) {
        Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke((Object) null, new Object[0]);
        if (invoke != null) {
            return invoke;
        }
        Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: g */
    public static void m105959g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ArrayList<Message> arrayList = f249824b;
            m105955c("WxSplash.Splash", "Gonna replay %s pending message(s).", Integer.valueOf(arrayList.size()));
            Iterator<Message> it = arrayList.iterator();
            while (it.hasNext()) {
                C85786k.f249854b.handleMessage(it.next());
            }
            f249824b.clear();
            return;
        }
        throw new AssertionError("replayPendingMessages() must be run in main thread. current thread: " + Looper.myLooper() + "(tid:" + Process.myTid() + ")");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0071, code lost:
        if (r1.exported == false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m105960h(com.tencent.p014mm.splash.SplashHackActivity r7) {
        /*
            java.lang.String r0 = r7.f249821d
            com.tencent.mm.splash.c r1 = f249828f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x007d
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r0
            java.lang.String r4 = "MicroMsg.PreventAccountNotReady"
            java.lang.String r5 = "eatActivity %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
            boolean r1 = com.tencent.p014mm.legacy.app.C80965k.m98851a(r3)
            if (r1 == 0) goto L_0x001a
            goto L_0x007d
        L_0x001a:
            if (r0 == 0) goto L_0x007d
            java.util.HashSet r1 = com.tencent.p014mm.legacy.app.C80965k.f237823b
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x002f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r0
            java.lang.String r0 = "protect this activity %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r1)
            goto L_0x0073
        L_0x002f:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0075 }
            f40.j r5 = f40.C86709a0.m107531m()     // Catch:{ NameNotFoundException -> 0x0075 }
            j40.a r5 = r5.mo58407a()     // Catch:{ NameNotFoundException -> 0x0075 }
            j40.b r5 = (j40.C87829b) r5     // Catch:{ NameNotFoundException -> 0x0075 }
            r5.getClass()     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()     // Catch:{ NameNotFoundException -> 0x0075 }
            r1.<init>(r5, r0)     // Catch:{ NameNotFoundException -> 0x0075 }
            f40.j r5 = f40.C86709a0.m107531m()     // Catch:{ NameNotFoundException -> 0x0075 }
            j40.a r5 = r5.mo58407a()     // Catch:{ NameNotFoundException -> 0x0075 }
            j40.b r5 = (j40.C87829b) r5     // Catch:{ NameNotFoundException -> 0x0075 }
            android.app.Application r5 = r5.f124990c     // Catch:{ NameNotFoundException -> 0x0075 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0075 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r1 = r5.getActivityInfo(r1, r6)     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r1 == 0) goto L_0x007d
            java.lang.String r5 = "%s info.exported = %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ NameNotFoundException -> 0x0075 }
            r6[r2] = r0     // Catch:{ NameNotFoundException -> 0x0075 }
            boolean r0 = r1.exported     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x0075 }
            r6[r3] = r0     // Catch:{ NameNotFoundException -> 0x0075 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ NameNotFoundException -> 0x0075 }
            boolean r0 = r1.exported     // Catch:{ NameNotFoundException -> 0x0075 }
            if (r0 != 0) goto L_0x007d
        L_0x0073:
            r0 = 1
            goto L_0x007e
        L_0x0075:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r1)
        L_0x007d:
            r0 = 0
        L_0x007e:
            java.lang.String r1 = "WxSplash.Splash"
            if (r0 != 0) goto L_0x0091
            r7.recreate()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r7 = r7.f249821d
            r0[r2] = r7
            java.lang.String r7 = "do recreate for %s"
            m105955c(r1, r7, r0)
            goto L_0x009f
        L_0x0091:
            r7.finish()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r7 = r7.f249821d
            r0[r2] = r7
            java.lang.String r7 = "eat activity, %s"
            m105955c(r1, r7, r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.splash.C85781g.m105960h(com.tencent.mm.splash.SplashHackActivity):void");
    }

    /* renamed from: i */
    public static void m105961i() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityManagerNative");
            Method declaredMethod = cls.getDeclaredMethod("getDefault", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, new Object[0]);
            if (invoke != null) {
                m105955c("WxSplash.Splash", "getDefault %s", invoke);
                if (invoke.getClass().getCanonicalName().startsWith("com.morgoo.droidplugin")) {
                    f249840r.mo119635a(675, 33, 1);
                    m105955c("WxSplash.Splash", "found using droidplugin", new Object[0]);
                }
                if (Proxy.isProxyClass(invoke.getClass())) {
                    m105955c("WxSplash.Splash", "found ActivityManager is a Proxy class, " + invoke.getClass(), new Object[0]);
                }
            }
        } catch (Exception e) {
            m105956d(e, "validateEnvironment found some thing.");
        }
    }

    /* renamed from: j */
    public static void m105962j(Instrumentation instrumentation) {
        if (instrumentation == null) {
            throw new NullPointerException("Instrumentation original should not be null.");
        } else if (Object.class != instrumentation.getClass().getSuperclass()) {
            f249840r.mo119635a(675, 7, 1);
            m105955c("WxSplash.Splash", "Instrumentation original's super class is not Object, maybe hacked by others. orig: %s, super: %s.", instrumentation.getClass(), instrumentation.getClass().getSuperclass());
            String canonicalName = instrumentation.getClass().getCanonicalName();
            RuntimeException runtimeException = new RuntimeException("invalid environment for hack, " + instrumentation.getClass());
            if (canonicalName.startsWith(new String[]{"com.excelliance", "com.lbe", "com.beike", "com.lody", "com.doubleagent", "com.svm", "com.morgoo"}[0])) {
                f249840r.mo119635a(675, 30, 1);
                m105955c("WxSplash.Splash", "invalid environment for hack, dual open.", new Object[0]);
            }
            f249840r.mo119635a(675, (long) 0, 1);
            throw runtimeException;
        }
    }
}
