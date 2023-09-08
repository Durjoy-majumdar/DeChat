package com.tencent.matrix.lifecycle.owners;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Handler;
import androidx.lifecycle.C0125s;
import com.tencent.matrix.lifecycle.C80392a0;
import com.tencent.matrix.lifecycle.C80396b;
import com.tencent.matrix.lifecycle.C80398c;
import com.tencent.matrix.lifecycle.C80403e;
import com.tencent.matrix.lifecycle.C80404f;
import com.tencent.matrix.lifecycle.C80406g;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.C80411j;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.StatefulOwner;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import p1012ne.C88932a;
import p723vf.C118672d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

public final class ProcessUILifecycleOwner {

    /* renamed from: a */
    public static String f235376a;

    /* renamed from: b */
    public static String f235377b;

    /* renamed from: c */
    public static ActivityManager f235378c;

    /* renamed from: d */
    public static ActivityInfo[] f235379d;

    /* renamed from: e */
    public static final Handler f235380e = C80392a0.f235326f.mo111887a();

    /* renamed from: f */
    public static final Object f235381f = new Object();

    /* renamed from: g */
    public static final WeakHashMap<Activity, Object> f235382g = new WeakHashMap<>();

    /* renamed from: h */
    public static final WeakHashMap<Activity, Object> f235383h = new WeakHashMap<>();

    /* renamed from: i */
    public static final WeakHashMap<Activity, Object> f235384i = new WeakHashMap<>();

    /* renamed from: j */
    public static final WeakHashMap<Activity, Object> f235385j = new WeakHashMap<>();

    /* renamed from: k */
    public static boolean f235386k = true;

    /* renamed from: l */
    public static boolean f235387l = true;

    /* renamed from: m */
    public static final IForegroundStatefulOwner f235388m = new CreatedStateOwner();

    /* renamed from: n */
    public static final IForegroundStatefulOwner f235389n = new AsyncOwner();

    /* renamed from: o */
    public static final IForegroundStatefulOwner f235390o = new AsyncOwner();

    /* renamed from: p */
    public static C80437b f235391p;

    /* renamed from: q */
    public static String f235392q = "";

    /* renamed from: r */
    public static final Runnable f235393r = C80438d.f235400d;

    /* renamed from: s */
    public static final C13601g f235394s = C36568h.m40985a(C28661c.f78634d);

    /* renamed from: t */
    public static final HashSet<C88932a> f235395t = new HashSet<>();

    /* renamed from: u */
    public static volatile boolean f235396u;

    /* renamed from: v */
    public static String f235397v = "default";

    /* renamed from: w */
    public static String f235398w;

    /* renamed from: x */
    public static final ProcessUILifecycleOwner f235399x = new ProcessUILifecycleOwner();

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$c */
    public static final class C28661c extends C87413o implements C32224a<HashMap<String, String>> {

        /* renamed from: d */
        public static final C28661c f78634d = new C28661c();

        public C28661c() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessUILifecycleOwner$CreatedStateOwner;", "Lcom/tencent/matrix/lifecycle/owners/ProcessUILifecycleOwner$AsyncOwner;", "()V", "active", "", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class CreatedStateOwner extends AsyncOwner {

        /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$CreatedStateOwner$a */
        public static final class C0962a extends C87413o implements C32226l<WeakHashMap<Activity, Object>, Boolean> {

            /* renamed from: d */
            public static final C0962a f2308d = new C0962a();

            public C0962a() {
                super(1);
            }

            public Object invoke(Object obj) {
                boolean z;
                WeakHashMap weakHashMap = (WeakHashMap) obj;
                C87412m.m108594g(weakHashMap, "$receiver");
                boolean z2 = true;
                if (!weakHashMap.isEmpty()) {
                    Iterator it = weakHashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Activity activity = (Activity) ((Map.Entry) it.next()).getKey();
                            if (activity == null || activity.isFinishing()) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (!z) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        }

        public boolean active() {
            Object invoke;
            if (super.active()) {
                ProcessUILifecycleOwner processUILifecycleOwner = ProcessUILifecycleOwner.f235399x;
                WeakHashMap<Activity, Object> weakHashMap = ProcessUILifecycleOwner.f235382g;
                C0962a aVar = C0962a.f2308d;
                processUILifecycleOwner.getClass();
                synchronized (weakHashMap) {
                    invoke = aVar.invoke(weakHashMap);
                }
                if (((Boolean) invoke).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$a */
    public static final class C80436a implements C80406g {
        public void off() {
            ProcessUILifecycleOwner.f235399x.getClass();
            if (ProcessUILifecycleOwner.f235396u) {
                C118672d.m167353c("Matrix.ProcessLifecycle", "onBackground... visibleScene[" + ProcessUILifecycleOwner.f235397v + '@' + ProcessUILifecycleOwner.f235376a + ']', new Object[0]);
                C80411j jVar = C80392a0.f235321a;
                ((Executor) C80392a0.f235324d.getValue()).execute(C80445e.f235406d);
            }
        }

        /* renamed from: on */
        public void mo60742on() {
            ProcessUILifecycleOwner.f235399x.getClass();
            if (!ProcessUILifecycleOwner.f235396u) {
                C118672d.m167353c("Matrix.ProcessLifecycle", "onForeground... visibleScene[" + ProcessUILifecycleOwner.f235397v + '@' + ProcessUILifecycleOwner.f235376a + ']', new Object[0]);
                C80411j jVar = C80392a0.f235321a;
                ((Executor) C80392a0.f235324d.getValue()).execute(C80446f.f235407d);
            }
        }

        public boolean serial() {
            return true;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$b */
    public interface C80437b {
        /* renamed from: a */
        void mo111931a(String str, String str2);
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner$d */
    public static final class C80438d implements Runnable {

        /* renamed from: d */
        public static final C80438d f235400d = new C80438d();

        public final void run() {
            ProcessUILifecycleOwner processUILifecycleOwner = ProcessUILifecycleOwner.f235399x;
            processUILifecycleOwner.getClass();
            if (ProcessUILifecycleOwner.f235383h.isEmpty()) {
                ProcessUILifecycleOwner.f235386k = true;
                IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235389n;
                if (iForegroundStatefulOwner != null) {
                    ((AsyncOwner) iForegroundStatefulOwner).turnOffAsync();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
                }
            }
            processUILifecycleOwner.mo111926b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        if (r4.getTaskInfo().numActivities > 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c2, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (r4.getTaskInfo().id == -1) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m98000c() {
        /*
            java.lang.String r0 = "Matrix.ProcessLifecycle"
            android.app.ActivityManager r1 = f235378c
            if (r1 == 0) goto L_0x00dd
            r1 = 1
            r2 = 0
            android.app.ActivityManager r3 = f235378c     // Catch:{ all -> 0x00d4 }
            gy3.C87412m.m108591d(r3)     // Catch:{ all -> 0x00d4 }
            java.util.List r3 = r3.getAppTasks()     // Catch:{ all -> 0x00d4 }
            java.lang.String r4 = "activityManager!!.appTasks"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ all -> 0x00d4 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00d4 }
            r4.<init>()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x001f:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00d4 }
            java.lang.String r6 = "it.taskInfo"
            java.lang.String r7 = "it"
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00d4 }
            r8 = r5
            android.app.ActivityManager$AppTask r8 = (android.app.ActivityManager.AppTask) r8     // Catch:{ all -> 0x00d4 }
            com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner r9 = f235399x     // Catch:{ all -> 0x00d4 }
            gy3.C87412m.m108593f(r8, r7)     // Catch:{ all -> 0x00d4 }
            android.app.ActivityManager$RecentTaskInfo r7 = r8.getTaskInfo()     // Catch:{ all -> 0x00d4 }
            gy3.C87412m.m108593f(r7, r6)     // Catch:{ all -> 0x00d4 }
            java.lang.String r6 = f235376a     // Catch:{ all -> 0x00d4 }
            boolean r6 = r9.mo111925a(r7, r6)     // Catch:{ all -> 0x00d4 }
            if (r6 == 0) goto L_0x001f
            r4.add(r5)     // Catch:{ all -> 0x00d4 }
            goto L_0x001f
        L_0x0048:
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x004c:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r5 == 0) goto L_0x0082
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00d4 }
            android.app.ActivityManager$AppTask r5 = (android.app.ActivityManager.AppTask) r5     // Catch:{ all -> 0x00d4 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
            r8.<init>()     // Catch:{ all -> 0x00d4 }
            java.lang.String r9 = f235376a     // Catch:{ all -> 0x00d4 }
            r8.append(r9)     // Catch:{ all -> 0x00d4 }
            java.lang.String r9 = " task: "
            r8.append(r9)     // Catch:{ all -> 0x00d4 }
            gy3.C87412m.m108593f(r5, r7)     // Catch:{ all -> 0x00d4 }
            android.app.ActivityManager$RecentTaskInfo r5 = r5.getTaskInfo()     // Catch:{ all -> 0x00d4 }
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ all -> 0x00d4 }
            java.lang.String r5 = p723vf.C90787j.m113851a(r5)     // Catch:{ all -> 0x00d4 }
            r8.append(r5)     // Catch:{ all -> 0x00d4 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d4 }
            p723vf.C118672d.m167353c(r0, r5, r8)     // Catch:{ all -> 0x00d4 }
            goto L_0x004c
        L_0x0082:
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x00d4 }
            if (r3 == 0) goto L_0x008a
        L_0x0088:
            r1 = 0
            goto L_0x00dc
        L_0x008a:
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x008e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00d4 }
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4     // Catch:{ all -> 0x00d4 }
            java.lang.String r5 = "hasRunningAppTask run any"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00d4 }
            p723vf.C118672d.m167351a(r0, r5, r6)     // Catch:{ all -> 0x00d4 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00d4 }
            r6 = 29
            if (r5 < r6) goto L_0x00b1
            gy3.C87412m.m108593f(r4, r7)     // Catch:{ all -> 0x00d4 }
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()     // Catch:{ all -> 0x00d4 }
            boolean r4 = r4.isRunning     // Catch:{ all -> 0x00d4 }
            goto L_0x00d1
        L_0x00b1:
            r6 = 23
            if (r5 < r6) goto L_0x00c4
            gy3.C87412m.m108593f(r4, r7)     // Catch:{ all -> 0x00d4 }
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()     // Catch:{ all -> 0x00d4 }
            int r4 = r4.numActivities     // Catch:{ all -> 0x00d4 }
            if (r4 <= 0) goto L_0x00c2
        L_0x00c0:
            r4 = 1
            goto L_0x00d1
        L_0x00c2:
            r4 = 0
            goto L_0x00d1
        L_0x00c4:
            gy3.C87412m.m108593f(r4, r7)     // Catch:{ all -> 0x00d4 }
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()     // Catch:{ all -> 0x00d4 }
            int r4 = r4.id     // Catch:{ all -> 0x00d4 }
            r5 = -1
            if (r4 != r5) goto L_0x00c2
            goto L_0x00c0
        L_0x00d1:
            if (r4 == 0) goto L_0x008e
            goto L_0x00dc
        L_0x00d4:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = ""
            p723vf.C118672d.m167354d(r0, r3, r4, r2)
        L_0x00dc:
            return r1
        L_0x00dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NOT initialized yet"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.m98000c():boolean");
    }

    /* renamed from: a */
    public final boolean mo111925a(ActivityManager.RecentTaskInfo recentTaskInfo, String str) {
        int i = Build.VERSION.SDK_INT;
        Intent intent = recentTaskInfo.baseIntent;
        C87412m.m108593f(intent, "this.baseIntent");
        return mo111927d(intent.getComponent(), str) || mo111927d(recentTaskInfo.origActivity, str) || (i >= 23 ? mo111927d(recentTaskInfo.baseActivity, str) : false) || (i >= 23 ? mo111927d(recentTaskInfo.topActivity, str) : false);
    }

    /* renamed from: b */
    public final void mo111926b() {
        if (f235384i.isEmpty() && f235386k) {
            f235387l = true;
            IForegroundStatefulOwner iForegroundStatefulOwner = f235390o;
            if (iForegroundStatefulOwner != null) {
                ((AsyncOwner) iForegroundStatefulOwner).turnOffAsync();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
        }
    }

    /* renamed from: d */
    public final boolean mo111927d(ComponentName componentName, String str) {
        ActivityInfo activityInfo;
        String str2;
        if (componentName == null || (!C87412m.m108589b(componentName.getPackageName(), f235377b))) {
            return false;
        }
        if (f235379d == null) {
            return true;
        }
        HashMap hashMap = (HashMap) ((C36570n) f235394s).getValue();
        String className = componentName.getClassName();
        C87412m.m108593f(className, "component.className");
        Object obj = hashMap.get(className);
        if (obj == null) {
            ActivityInfo[] activityInfoArr = f235379d;
            C87412m.m108591d(activityInfoArr);
            int length = activityInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    activityInfo = null;
                    break;
                }
                activityInfo = activityInfoArr[i];
                if (C87412m.m108589b(activityInfo.name, componentName.getClassName())) {
                    break;
                }
                i++;
            }
            if (activityInfo == null) {
                C118672d.m167352b("Matrix.ProcessLifecycle", "got task info not appeared in package manager " + activityInfo, new Object[0]);
                str2 = f235377b;
                C87412m.m108591d(str2);
            } else {
                str2 = activityInfo.processName;
            }
            obj = str2;
            C87412m.m108593f(obj, "if (info == null) {\n    …processName\n            }");
            hashMap.put(className, obj);
        }
        return C87412m.m108589b(str, (String) obj);
    }

    /* renamed from: e */
    public final Map<String, Integer> mo111928e() {
        HashMap hashMap = new HashMap();
        Runtime.getRuntime().gc();
        Set<Map.Entry<Activity, Object>> entrySet = f235385j.entrySet();
        C87412m.m108593f(entrySet, "destroyedActivities.entries");
        Object[] array = entrySet.toArray(new Map.Entry[0]);
        if (array != null) {
            for (Map.Entry key : (Map.Entry[]) array) {
                Activity activity = (Activity) key.getKey();
                if (activity != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    int i = hashMap.get(simpleName);
                    if (i == null) {
                        i = 0;
                        hashMap.put(simpleName, 0);
                    }
                    hashMap.put(simpleName, Integer.valueOf(((Number) i).intValue() + 1));
                }
            }
            return hashMap;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/ProcessUILifecycleOwner$AsyncOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IForegroundStatefulOwner;", "Lrx3/b0;", "turnOnAsync", "turnOffAsync", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static class AsyncOwner extends StatefulOwner implements IForegroundStatefulOwner {
        public AsyncOwner() {
            super(false, 1, (C8480h) null);
        }

        public void addLifecycleCallback(C0125s sVar, C80404f fVar) {
            C87412m.m108594g(sVar, "lifecycleOwner");
            C87412m.m108594g(fVar, "callback");
            throw null;
        }

        public void addLifecycleCallback(C80403e eVar) {
            C87412m.m108594g(eVar, "callback");
            C80396b bVar = new C80396b(eVar);
            eVar.f235335a = bVar;
            C13598b0 b0Var = C13598b0.f38549a;
            observeForever(bVar);
        }

        public void addLifecycleCallback(C80404f fVar) {
            C87412m.m108594g(fVar, "callback");
            throw null;
        }

        public boolean isForeground() {
            return active();
        }

        public void removeLifecycleCallback(C80403e eVar) {
            C87412m.m108594g(eVar, "callback");
            C80407h hVar = eVar.f235335a;
            if (hVar != null) {
                removeObserver(hVar);
            }
        }

        public void removeLifecycleCallback(C80404f fVar) {
            C87412m.m108594g(fVar, "callback");
            throw null;
        }

        public void turnOffAsync() {
            turnOff();
        }

        public void turnOnAsync() {
            turnOn();
        }

        public void addLifecycleCallback(C0125s sVar, C80403e eVar) {
            C87412m.m108594g(sVar, "lifecycleOwner");
            C87412m.m108594g(eVar, "callback");
            C80398c cVar = new C80398c(eVar);
            eVar.f235335a = cVar;
            C13598b0 b0Var = C13598b0.f38549a;
            observeWithLifecycle(sVar, cVar);
        }
    }
}
