package com.tencent.matrix.lifecycle.owners;

import android.app.ActivityManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.ArrayMap;
import com.tencent.matrix.lifecycle.C80392a0;
import com.tencent.matrix.lifecycle.StatefulOwner;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p723vf.C118672d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\"#B\t\b\u0002¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/ForegroundServiceLifecycleOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lrx3/b0;", "inject", "Landroid/content/Context;", "context", "", "enable", "init", "hasForegroundService", "", "TAG", "Ljava/lang/String;", "", "CREATE_SERVICE", "I", "STOP_SERVICE", "Ljava/lang/reflect/Field;", "fieldServicemActivityManager", "Ljava/lang/reflect/Field;", "Landroid/app/ActivityManager;", "activityManager", "Landroid/app/ActivityManager;", "Landroid/util/ArrayMap;", "ActivityThreadmServices", "Landroid/util/ArrayMap;", "Landroid/os/Handler;", "ActivityThreadmH", "Landroid/os/Handler;", "Lcom/tencent/matrix/lifecycle/owners/ForegroundServiceLifecycleOwner$a;", "fgServiceHandler", "Lcom/tencent/matrix/lifecycle/owners/ForegroundServiceLifecycleOwner$a;", "<init>", "()V", "a", "b", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ForegroundServiceLifecycleOwner extends StatefulOwner {
    /* access modifiers changed from: private */
    public static Handler ActivityThreadmH = null;
    /* access modifiers changed from: private */
    public static ArrayMap<?, ?> ActivityThreadmServices = null;
    private static final int CREATE_SERVICE = 114;
    public static final ForegroundServiceLifecycleOwner INSTANCE = new ForegroundServiceLifecycleOwner();
    private static final int STOP_SERVICE = 116;
    private static final String TAG = "Matrix.lifecycle.FgService";
    /* access modifiers changed from: private */
    public static ActivityManager activityManager;
    /* access modifiers changed from: private */
    public static C80420a fgServiceHandler;
    /* access modifiers changed from: private */
    public static final Field fieldServicemActivityManager;

    /* renamed from: com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner$a */
    public static final class C80420a implements InvocationHandler {

        /* renamed from: a */
        public final C13601g f235363a = C36568h.m40985a(C80421a.f235365d);

        /* renamed from: b */
        public final Object f235364b;

        /* renamed from: com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner$a$a */
        public static final class C80421a extends C87413o implements C32224a<HashSet<ComponentName>> {

            /* renamed from: d */
            public static final C80421a f235365d = new C80421a();

            public C80421a() {
                super(0);
            }

            public Object invoke() {
                return new HashSet();
            }
        }

        public C80420a(Object obj) {
            this.f235364b = obj;
        }

        /* renamed from: a */
        public final HashSet<ComponentName> mo111907a() {
            return (HashSet) ((C36570n) this.f235363a).getValue();
        }

        /* renamed from: b */
        public final void mo111908b(ComponentName componentName) {
            boolean z;
            C87412m.m108594g(componentName, "componentName");
            synchronized (mo111907a()) {
                C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "hack onStartForeground: " + componentName, new Object[0]);
                if (mo111907a().isEmpty()) {
                    C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "should turn ON", new Object[0]);
                    z = true;
                } else {
                    z = false;
                }
                mo111907a().add(componentName);
            }
            if (z) {
                C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "do turn ON", new Object[0]);
                ForegroundServiceLifecycleOwner.INSTANCE.turnOn();
            }
        }

        /* renamed from: c */
        public final void mo111909c(ComponentName componentName) {
            boolean z;
            C87412m.m108594g(componentName, "componentName");
            synchronized (mo111907a()) {
                C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "hack onStopForeground: " + componentName, new Object[0]);
                mo111907a().remove(componentName);
                if (mo111907a().isEmpty()) {
                    C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "should turn OFF", new Object[0]);
                    z = true;
                } else {
                    z = false;
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            if (z) {
                C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "do turn OFF", new Object[0]);
                ForegroundServiceLifecycleOwner.INSTANCE.turnOff();
            }
        }

        public Object invoke(Object obj, Method method, Object... objArr) {
            Object obj2;
            C87412m.m108594g(objArr, "args");
            if (method != null) {
                try {
                    obj2 = method.invoke(this.f235364b, Arrays.copyOf(objArr, objArr.length));
                } catch (Throwable th) {
                    C118672d.m167354d(ForegroundServiceLifecycleOwner.TAG, th, "", new Object[0]);
                    return null;
                }
            } else {
                obj2 = null;
            }
            if (C87412m.m108589b(method != null ? method.getName() : null, "setServiceForeground")) {
                StringBuilder sb = new StringBuilder();
                sb.append("real invoked setServiceForeground: ");
                String arrays = Arrays.toString(objArr);
                C87412m.m108593f(arrays, "java.util.Arrays.toString(this)");
                sb.append(arrays);
                C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, sb.toString(), new Object[0]);
                if (objArr.length > 3) {
                    if (objArr[3] == null) {
                        ComponentName componentName = objArr[0];
                        if (componentName != null) {
                            mo111909c(componentName);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.content.ComponentName");
                        }
                    }
                }
                ComponentName componentName2 = objArr[0];
                if (componentName2 != null) {
                    mo111908b(componentName2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.content.ComponentName");
                }
            }
            return obj2;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner$b */
    public static final class C80422b implements Handler.Callback {

        /* renamed from: d */
        public boolean f235366d;

        /* renamed from: e */
        public final Handler.Callback f235367e;

        /* renamed from: com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner$b$a */
        public static final class C80423a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80422b f235368d;

            public C80423a(C80422b bVar) {
                this.f235368d = bVar;
            }

            public final void run() {
                try {
                    C80422b.m97995a(this.f235368d);
                } catch (Throwable th) {
                    C118672d.m167354d(ForegroundServiceLifecycleOwner.TAG, th, "", new Object[0]);
                }
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner$b$b */
        public static final class C80424b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C80422b f235369d;

            /* renamed from: com.tencent.matrix.lifecycle.owners.ForegroundServiceLifecycleOwner$b$b$a */
            public static final class C80425a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C80424b f235370d;

                public C80425a(C80424b bVar) {
                    this.f235370d = bVar;
                }

                public final void run() {
                    C80422b bVar = this.f235370d.f235369d;
                    try {
                        ForegroundServiceLifecycleOwner.INSTANCE.hasForegroundService();
                    } catch (Throwable th) {
                        C118672d.m167354d(ForegroundServiceLifecycleOwner.TAG, th, "", new Object[0]);
                    }
                }
            }

            public C80424b(C80422b bVar) {
                this.f235369d = bVar;
            }

            public final void run() {
                C80392a0.f235326f.mo111887a().post(new C80425a(this));
            }
        }

        public C80422b(Handler.Callback callback) {
            this.f235367e = callback;
        }

        /* renamed from: a */
        public static final void m97995a(C80422b bVar) {
            bVar.getClass();
            ArrayMap access$getActivityThreadmServices$p = ForegroundServiceLifecycleOwner.ActivityThreadmServices;
            if (access$getActivityThreadmServices$p != null) {
                for (Map.Entry entry : access$getActivityThreadmServices$p.entrySet()) {
                    ForegroundServiceLifecycleOwner foregroundServiceLifecycleOwner = ForegroundServiceLifecycleOwner.INSTANCE;
                    Field access$getFieldServicemActivityManager$p = ForegroundServiceLifecycleOwner.fieldServicemActivityManager;
                    Object obj = access$getFieldServicemActivityManager$p != null ? access$getFieldServicemActivityManager$p.get(entry.getValue()) : null;
                    C87412m.m108591d(obj);
                    if (!Proxy.isProxyClass(obj.getClass()) || !C87412m.m108589b(Proxy.getInvocationHandler(obj), ForegroundServiceLifecycleOwner.fgServiceHandler)) {
                        if (ForegroundServiceLifecycleOwner.fgServiceHandler == null) {
                            C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "first inject", new Object[0]);
                            ForegroundServiceLifecycleOwner.fgServiceHandler = new C80420a(obj);
                        }
                        C118672d.m167353c(ForegroundServiceLifecycleOwner.TAG, "going to inject " + entry.getValue(), new Object[0]);
                        Object value = entry.getValue();
                        if (value != null) {
                            Service service = (Service) value;
                            C80392a0.f235326f.mo111887a().post(new C80441b(bVar, new ComponentName(service, service.getClass().getName())));
                            Field access$getFieldServicemActivityManager$p2 = ForegroundServiceLifecycleOwner.fieldServicemActivityManager;
                            if (access$getFieldServicemActivityManager$p2 != null) {
                                Object value2 = entry.getValue();
                                ClassLoader classLoader = obj.getClass().getClassLoader();
                                Class[] interfaces = obj.getClass().getInterfaces();
                                C80420a access$getFgServiceHandler$p = ForegroundServiceLifecycleOwner.fgServiceHandler;
                                C87412m.m108591d(access$getFgServiceHandler$p);
                                access$getFieldServicemActivityManager$p2.set(value2, Proxy.newProxyInstance(classLoader, interfaces, access$getFgServiceHandler$p));
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.app.Service");
                        }
                    }
                }
            }
        }

        public boolean handleMessage(Message message) {
            Handler access$getActivityThreadmH$p;
            C87412m.m108594g(message, "msg");
            if (this.f235366d) {
                C118672d.m167352b(ForegroundServiceLifecycleOwner.TAG, "reentrant!!! ignore this msg: " + message.what, new Object[0]);
                return false;
            }
            int i = message.what;
            if (i == 114) {
                Handler access$getActivityThreadmH$p2 = ForegroundServiceLifecycleOwner.ActivityThreadmH;
                if (access$getActivityThreadmH$p2 != null) {
                    access$getActivityThreadmH$p2.post(new C80423a(this));
                }
            } else if (i == 116 && (access$getActivityThreadmH$p = ForegroundServiceLifecycleOwner.ActivityThreadmH) != null) {
                access$getActivityThreadmH$p.post(new C80424b(this));
            }
            this.f235366d = true;
            Handler.Callback callback = this.f235367e;
            Boolean valueOf = callback != null ? Boolean.valueOf(callback.handleMessage(message)) : null;
            this.f235366d = false;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
            return false;
        }
    }

    static {
        Field field;
        try {
            field = Class.forName("android.app.Service").getDeclaredField("mActivityManager");
            field.setAccessible(true);
        } catch (Throwable th) {
            C118672d.m167354d(TAG, th, "", new Object[0]);
            field = null;
        }
        fieldServicemActivityManager = field;
    }

    private ForegroundServiceLifecycleOwner() {
        super(false, 1, (C8480h) null);
    }

    private final void inject() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Field declaredField = cls.getDeclaredField("mH");
            declaredField.setAccessible(true);
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            C87412m.m108593f(method, LocaleUtil.ITALIAN);
            method.setAccessible(true);
            String str = null;
            Object invoke = method.invoke((Object) null, new Object[0]);
            Field declaredField2 = cls.getDeclaredField("mServices");
            C87412m.m108593f(declaredField2, LocaleUtil.ITALIAN);
            declaredField2.setAccessible(true);
            ActivityThreadmServices = (ArrayMap) declaredField2.get(invoke);
            Object obj = declaredField.get(invoke);
            if (obj != null) {
                ActivityThreadmH = (Handler) obj;
                Field declaredField3 = Handler.class.getDeclaredField("mCallback");
                declaredField3.setAccessible(true);
                Handler.Callback callback = (Handler.Callback) declaredField3.get(ActivityThreadmH);
                declaredField3.set(ActivityThreadmH, new C80422b(callback));
                StringBuilder sb = new StringBuilder();
                sb.append("origin is ");
                if (callback != null) {
                    str = callback.getClass().getName();
                }
                sb.append(str);
                C118672d.m167353c(TAG, sb.toString(), new Object[0]);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        } catch (Throwable th) {
            C118672d.m167354d(TAG, th, "", new Object[0]);
        }
    }

    public final boolean hasForegroundService() {
        boolean z;
        C80420a aVar;
        ActivityManager activityManager2 = activityManager;
        if (activityManager2 != null) {
            boolean z2 = true;
            try {
                C87412m.m108591d(activityManager2);
                List<ActivityManager.RunningServiceInfo> runningServices = activityManager2.getRunningServices(Integer.MAX_VALUE);
                C87412m.m108593f(runningServices, "activityManager!!.getRun…ngServices(Int.MAX_VALUE)");
                ArrayList arrayList = new ArrayList();
                for (T next : runningServices) {
                    ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo) next;
                    if (runningServiceInfo.uid == Process.myUid() && runningServiceInfo.pid == Process.myPid()) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ActivityManager.RunningServiceInfo) it.next()).foreground) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                C118672d.m167354d(TAG, th, "", new Object[0]);
            }
            z = false;
            if (!z && (aVar = fgServiceHandler) != null) {
                synchronized (aVar.mo111907a()) {
                    if (!aVar.mo111907a().isEmpty()) {
                        aVar.mo111907a().clear();
                        C118672d.m167353c(TAG, "clear done, should turn OFF", new Object[0]);
                    } else {
                        z2 = false;
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                if (z2) {
                    C118672d.m167353c(TAG, "fix clear: do turn OFF", new Object[0]);
                    INSTANCE.turnOff();
                }
            }
            return z;
        }
        throw new IllegalStateException("NOT initialized yet");
    }

    public final void init(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (systemService != null) {
            activityManager = (ActivityManager) systemService;
            if (!z) {
                C118672d.m167353c(TAG, "disabled", new Object[0]);
            } else {
                inject();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }
}
