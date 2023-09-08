package bh3;

import android.os.IBinder;
import android.os.IInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Map;
import rx3.C13604l;

/* renamed from: bh3.y */
public final class C113194y {

    /* renamed from: a */
    public String f338697a;

    /* renamed from: b */
    public String f338698b;

    /* renamed from: c */
    public C113197b f338699c;

    /* renamed from: d */
    public IBinder f338700d;

    /* renamed from: e */
    public IBinder f338701e;

    /* renamed from: f */
    public C113195a f338702f;

    /* renamed from: bh3.y$a */
    public static final class C113195a implements InvocationHandler {

        /* renamed from: c */
        public static final C113196a f338703c = new C113196a((C8480h) null);

        /* renamed from: a */
        public IBinder f338704a;

        /* renamed from: b */
        public Object f338705b;

        /* renamed from: bh3.y$a$a */
        public static final class C113196a {
            public C113196a(C8480h hVar) {
            }

            /* renamed from: a */
            public static final Object m154912a(C113196a aVar, String str, String str2, IBinder iBinder, C113197b bVar) {
                aVar.getClass();
                Class<?> cls = Class.forName(str2);
                Class<?> cls2 = Class.forName(str2 + "$Stub");
                ClassLoader classLoader = cls2.getClassLoader();
                if (classLoader != null) {
                    Object invoke = cls2.getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{iBinder});
                    C87412m.m108593f(invoke, "originManagerService");
                    Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class, IInterface.class, cls}, new C113198c(str, str2, bVar, invoke));
                    C87412m.m108593f(newProxyInstance, "if (classLoader == null)…rvice))\n                }");
                    return newProxyInstance;
                }
                throw new IllegalStateException("get service manager ClassLoader fail!");
            }

            /* renamed from: b */
            public final IBinder mo165726b(String str) {
                Class<?> cls = Class.forName("android.os.ServiceManager");
                Field declaredField = cls.getDeclaredField("sCache");
                declaredField.setAccessible(true);
                Object obj = declaredField.get((Object) null);
                Map map = C24564k0.m30744h(obj) ? (Map) obj : null;
                if (map != null) {
                    IBinder iBinder = (IBinder) map.remove(str);
                }
                Boolean valueOf = map != null ? Boolean.valueOf(map.containsKey(str)) : null;
                Log.m105924i("getCurrentBinder", "isContaints " + str + " : " + valueOf);
                Object invoke = cls.getDeclaredMethod("getService", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
                C87412m.m108592e(invoke, "null cannot be cast to non-null type android.os.IBinder");
                return (IBinder) invoke;
            }
        }

        public C113195a(String str, String str2, C113197b bVar) {
            try {
                C113196a aVar = f338703c;
                IBinder b = aVar.mo165726b(str);
                this.f338704a = b;
                this.f338705b = C113196a.m154912a(aVar, str, str2, b, bVar);
            } catch (Throwable th) {
                Log.m105924i("SystemServiceBinderHooker", "catch exception on init, e:" + th.getMessage());
            }
        }

        /* renamed from: a */
        public final IBinder mo165724a() {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class}, this);
                C87412m.m108592e(newProxyInstance, "null cannot be cast to non-null type android.os.IBinder");
                return (IBinder) newProxyInstance;
            }
            throw new IllegalStateException("Can not get ClassLoader of " + cls.getName());
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C87412m.m108594g(obj, "proxy");
            C87412m.m108594g(method, FirebaseAnalytics.C113379b.METHOD);
            if (C87412m.m108589b("queryLocalInterface", method.getName())) {
                return this.f338705b;
            }
            IBinder iBinder = this.f338704a;
            return objArr == null ? method.invoke(iBinder, new Object[0]) : method.invoke(iBinder, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: bh3.y$b */
    public interface C113197b {
        /* renamed from: a */
        C13604l<Boolean, Object> mo165727a(Object obj, Method method, Object[] objArr);

        /* renamed from: b */
        void mo165728b(Method method, Object[] objArr);

        /* renamed from: c */
        void mo165729c(Method method, Object obj);
    }

    /* renamed from: bh3.y$c */
    public static final class C113198c implements InvocationHandler {

        /* renamed from: a */
        public final String f338706a;

        /* renamed from: b */
        public final String f338707b;

        /* renamed from: c */
        public final C113197b f338708c;

        /* renamed from: d */
        public final Object f338709d;

        public C113198c(String str, String str2, C113197b bVar, Object obj) {
            C87412m.m108594g(obj, "originManagerService");
            this.f338706a = str;
            this.f338707b = str2;
            this.f338708c = bVar;
            this.f338709d = obj;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
            /*
                r5 = this;
                java.lang.String r6 = "[DeadObjectException]: re hook"
                java.lang.String r0 = "SystemServiceBinderHooker"
                java.lang.String r1 = ""
                bh3.y$b r2 = r5.f338708c
                if (r2 == 0) goto L_0x000d
                r2.mo165728b(r7, r8)
            L_0x000d:
                bh3.y$b r2 = r5.f338708c
                r3 = 0
                if (r2 == 0) goto L_0x0019
                java.lang.Object r4 = r5.f338709d
                rx3.l r2 = r2.mo165727a(r4, r7, r8)
                goto L_0x001a
            L_0x0019:
                r2 = r3
            L_0x001a:
                if (r2 == 0) goto L_0x0030
                A r4 = r2.f38555d
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x002a
                r4 = r2
                goto L_0x002b
            L_0x002a:
                r4 = r3
            L_0x002b:
                if (r4 == 0) goto L_0x0030
                B r6 = r2.f38556e
                return r6
            L_0x0030:
                java.lang.Object r2 = r5.f338709d     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
                if (r8 != 0) goto L_0x003e
                if (r7 == 0) goto L_0x004a
                r8 = 0
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
                java.lang.Object r8 = r7.invoke(r2, r8)     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
                goto L_0x004b
            L_0x003e:
                if (r7 == 0) goto L_0x004a
                int r4 = r8.length     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
                java.lang.Object r8 = r7.invoke(r2, r8)     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
                goto L_0x004b
            L_0x004a:
                r8 = r3
            L_0x004b:
                bh3.y$b r2 = r5.f338708c     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
                if (r2 == 0) goto L_0x0052
                r2.mo165729c(r7, r8)     // Catch:{ RemoteException -> 0x0112, InvocationTargetException -> 0x0079, all -> 0x0053 }
            L_0x0052:
                return r8
            L_0x0053:
                r6 = move-exception
                hh3.b r8 = hh3.C117092b.f350860a
                if (r7 == 0) goto L_0x005c
                java.lang.String r3 = r7.getName()
            L_0x005c:
                if (r3 != 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r1 = r3
            L_0x0060:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "[Throwable]: "
                r7.append(r0)
                java.lang.String r0 = r6.getMessage()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r8.mo181043b(r1, r7)
                throw r6
            L_0x0079:
                r8 = move-exception
                hh3.b r2 = hh3.C117092b.f350860a
                if (r7 == 0) goto L_0x0082
                java.lang.String r3 = r7.getName()
            L_0x0082:
                if (r3 != 0) goto L_0x0085
                goto L_0x0086
            L_0x0085:
                r1 = r3
            L_0x0086:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r3 = "[InvocationTargetException]: "
                r7.append(r3)
                r7.append(r8)
                java.lang.String r3 = ",targetException:"
                r7.append(r3)
                java.lang.Throwable r3 = r8.getTargetException()
                r7.append(r3)
                java.lang.String r7 = r7.toString()
                r2.mo181043b(r1, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r1 = "catch InvocationTargetException: "
                r7.append(r1)
                java.lang.String r1 = r8.getMessage()
                r7.append(r1)
                java.lang.String r1 = "， target:"
                r7.append(r1)
                java.lang.Throwable r1 = r8.getTargetException()
                java.lang.String r1 = r1.getMessage()
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                bh3.y r6 = new bh3.y
                java.lang.String r7 = r5.f338706a
                java.lang.String r1 = r5.f338707b
                bh3.y$b r2 = r5.f338708c
                r6.<init>(r7, r1, r2)
                r6.mo165723a()
                java.lang.Throwable r6 = r8.getTargetException()
                boolean r6 = r6 instanceof android.os.RemoteException
                java.lang.String r7 = "e.targetException"
                if (r6 == 0) goto L_0x010a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = "catch InvocationTargetException target is RemoteException: "
                r6.append(r1)
                java.lang.String r1 = r8.getMessage()
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                java.lang.Throwable r6 = r8.getTargetException()
                gy3.C87412m.m108593f(r6, r7)
                throw r6
            L_0x010a:
                java.lang.Throwable r6 = r8.getTargetException()
                gy3.C87412m.m108593f(r6, r7)
                throw r6
            L_0x0112:
                r8 = move-exception
                hh3.b r2 = hh3.C117092b.f350860a
                if (r7 == 0) goto L_0x011b
                java.lang.String r3 = r7.getName()
            L_0x011b:
                if (r3 != 0) goto L_0x011e
                goto L_0x011f
            L_0x011e:
                r1 = r3
            L_0x011f:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r3 = "[RemoteException]: "
                r7.append(r3)
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r2.mo181043b(r1, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r1 = "[DeadObjectException]: "
                r7.append(r1)
                java.lang.String r1 = r8.getMessage()
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
                bh3.y r6 = new bh3.y
                java.lang.String r7 = r5.f338706a
                java.lang.String r0 = r5.f338707b
                bh3.y$b r1 = r5.f338708c
                r6.<init>(r7, r0, r1)
                r6.mo165723a()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: bh3.C113194y.C113198c.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    public C113194y(String str, String str2, C113197b bVar) {
        this.f338697a = str;
        this.f338698b = str2;
        this.f338699c = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Boolean, java.lang.String> mo165723a() {
        /*
            r6 = this;
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doHook: serviceName:"
            r1.append(r2)
            java.lang.String r2 = r6.f338697a
            r1.append(r2)
            java.lang.String r2 = ", serviceClsName:"
            r1.append(r2)
            java.lang.String r2 = r6.f338698b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SystemServiceBinderHooker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            bh3.y$a r1 = new bh3.y$a     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r6.f338697a     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r6.f338698b     // Catch:{ all -> 0x008f }
            bh3.y$b r5 = r6.f338699c     // Catch:{ all -> 0x008f }
            r1.<init>(r3, r4, r5)     // Catch:{ all -> 0x008f }
            r6.f338702f = r1     // Catch:{ all -> 0x008f }
            android.os.IBinder r1 = r1.f338704a     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0085
            bh3.y$a r1 = r6.f338702f     // Catch:{ all -> 0x008f }
            gy3.C87412m.m108591d(r1)     // Catch:{ all -> 0x008f }
            java.lang.Object r1 = r1.f338705b     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x003f
            goto L_0x0085
        L_0x003f:
            bh3.y$a r1 = r6.f338702f     // Catch:{ all -> 0x008f }
            gy3.C87412m.m108591d(r1)     // Catch:{ all -> 0x008f }
            android.os.IBinder r1 = r1.mo165724a()     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "android.os.ServiceManager"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "sCache"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ all -> 0x008f }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ all -> 0x008f }
            r4 = 0
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x008f }
            boolean r5 = gy3.C24564k0.m30744h(r3)     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x0066
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x008f }
        L_0x0066:
            if (r4 == 0) goto L_0x0072
            java.lang.String r3 = r6.f338697a     // Catch:{ all -> 0x008f }
            r4.remove(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r6.f338697a     // Catch:{ all -> 0x008f }
            r4.put(r3, r1)     // Catch:{ all -> 0x008f }
        L_0x0072:
            r6.f338701e = r1     // Catch:{ all -> 0x008f }
            bh3.y$a r1 = r6.f338702f     // Catch:{ all -> 0x008f }
            gy3.C87412m.m108591d(r1)     // Catch:{ all -> 0x008f }
            android.os.IBinder r1 = r1.f338704a     // Catch:{ all -> 0x008f }
            r6.f338700d = r1     // Catch:{ all -> 0x008f }
            rx3.l r1 = new rx3.l     // Catch:{ all -> 0x008f }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008f }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x008f }
            goto L_0x00bb
        L_0x0085:
            rx3.l r1 = new rx3.l     // Catch:{ all -> 0x008f }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "get origin binder failed"
            r1.<init>(r3, r4)     // Catch:{ all -> 0x008f }
            return r1
        L_0x008f:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#doHook exp: "
            r3.append(r4)
            java.lang.String r4 = r1.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)
            rx3.l r2 = new rx3.l
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.String r1 = r1.getMessage()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            r2.<init>(r3, r0)
            r1 = r2
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bh3.C113194y.mo165723a():rx3.l");
    }
}
