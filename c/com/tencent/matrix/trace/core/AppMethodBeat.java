package com.tencent.matrix.trace.core;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p1013nf.C88933a;
import p1018of.C89206a;
import p1035sf.C90183c;
import p221qf.C89639a;
import p221qf.C89642e;
import p723vf.C118672d;
import p723vf.C90778c;

public class AppMethodBeat {
    public static final int METHOD_ID_DISPATCH = 1048574;
    private static final int METHOD_ID_MAX = 1048575;
    private static final int STATUS_DEFAULT = Integer.MAX_VALUE;
    private static final int STATUS_EXPIRED_START = -2;
    private static final int STATUS_OUT_RELEASE = -3;
    private static final int STATUS_READY = 1;
    private static final int STATUS_STARTED = 2;
    private static final int STATUS_STOPPED = -1;
    private static final String TAG = "Matrix.AppMethodBeat";
    private static boolean assertIn = false;
    private static Runnable checkStartExpiredRunnable = null;
    public static boolean isDev;
    /* access modifiers changed from: private */
    public static volatile boolean isPauseUpdateTime = false;
    private static final HashSet<C89639a> listeners = new HashSet<>();
    private static C89642e looperMonitorListener = new C80537a();
    private static Runnable realReleaseRunnable = new C80538b();
    private static long[] sBuffer = new long[1000000];
    /* access modifiers changed from: private */
    public static volatile long sCurrentDiffTime = SystemClock.uptimeMillis();
    /* access modifiers changed from: private */
    public static volatile long sDiffTime = sCurrentDiffTime;
    private static Set<String> sFocusActivitySet = new HashSet();
    private static Handler sHandler = new Handler(sTimerUpdateThread.getLooper());
    private static int sIndex = 0;
    /* access modifiers changed from: private */
    public static C80541e sIndexRecordHead = null;
    private static AppMethodBeat sInstance = new AppMethodBeat();
    private static int sLastIndex = -1;
    private static long sMainThreadId = Looper.getMainLooper().getThread().getId();
    public static C80542f sMethodEnterListener;
    private static HandlerThread sTimerUpdateThread = C90778c.m113845c("matrix_time_update_thread", 3);
    private static Runnable sUpdateDiffTimeRunnable = new C80539c();
    /* access modifiers changed from: private */
    public static volatile int status = Integer.MAX_VALUE;
    /* access modifiers changed from: private */
    public static final Object statusLock = new Object();
    /* access modifiers changed from: private */
    public static final Object updateTimeLock = new Object();

    /* renamed from: com.tencent.matrix.trace.core.AppMethodBeat$a */
    public class C80537a implements C89642e {
        /* renamed from: b */
        public void mo112114b(String str) {
            AppMethodBeat.dispatchBegin();
        }

        /* renamed from: e */
        public void mo112115e(String str, long j, long j2) {
            AppMethodBeat.dispatchEnd();
        }

        public boolean isValid() {
            return AppMethodBeat.status >= 1;
        }
    }

    /* renamed from: com.tencent.matrix.trace.core.AppMethodBeat$b */
    public class C80538b implements Runnable {
        public void run() {
            AppMethodBeat.realRelease();
        }
    }

    /* renamed from: com.tencent.matrix.trace.core.AppMethodBeat$c */
    public class C80539c implements Runnable {
        public void run() {
            while (true) {
                try {
                    if (AppMethodBeat.isPauseUpdateTime || AppMethodBeat.status <= -1) {
                        synchronized (AppMethodBeat.updateTimeLock) {
                            AppMethodBeat.updateTimeLock.wait();
                        }
                    } else {
                        long unused = AppMethodBeat.sCurrentDiffTime = SystemClock.uptimeMillis() - AppMethodBeat.sDiffTime;
                        SystemClock.sleep(5);
                    }
                } catch (Exception e) {
                    C118672d.m167352b(AppMethodBeat.TAG, "" + e.toString(), new Object[0]);
                    return;
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.trace.core.AppMethodBeat$d */
    public class C80540d implements Runnable {
        public void run() {
            synchronized (AppMethodBeat.statusLock) {
                C118672d.m167353c(AppMethodBeat.TAG, "[startExpired] timestamp:%s status:%s", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(AppMethodBeat.status));
                if (AppMethodBeat.status == Integer.MAX_VALUE || AppMethodBeat.status == 1) {
                    int unused = AppMethodBeat.status = -2;
                }
            }
        }
    }

    /* renamed from: com.tencent.matrix.trace.core.AppMethodBeat$f */
    public interface C80542f {
        /* renamed from: a */
        void mo112122a(int i, long j);
    }

    static {
        C90778c.m113843a().postDelayed(realReleaseRunnable, 10000);
    }

    /* renamed from: at */
    public static void m98134at(Activity activity, boolean z) {
        String name = activity.getClass().getName();
        if (z) {
            if (sFocusActivitySet.add(name)) {
                HashSet<C89639a> hashSet = listeners;
                synchronized (hashSet) {
                    Iterator<C89639a> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.next().mo123972d(activity);
                    }
                }
                C118672d.m167353c(TAG, "[at] visibleScene[%s] has %s focus!", getVisibleScene(), "attach");
            }
        } else if (sFocusActivitySet.remove(name)) {
            C118672d.m167353c(TAG, "[at] visibleScene[%s] has %s focus!", getVisibleScene(), "detach");
        }
    }

    private static void checkPileup(int i) {
        C80541e eVar = sIndexRecordHead;
        while (eVar != null) {
            int i2 = eVar.f235557a;
            if (i2 == i || (i2 == -1 && sLastIndex == 999999)) {
                eVar.f235559c = false;
                C118672d.m167356f(TAG, "[checkPileup] %s", eVar.toString());
                eVar = eVar.f235558b;
                sIndexRecordHead = eVar;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void dispatchBegin() {
        sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
        isPauseUpdateTime = false;
        Object obj = updateTimeLock;
        synchronized (obj) {
            obj.notify();
        }
    }

    /* access modifiers changed from: private */
    public static void dispatchEnd() {
        isPauseUpdateTime = true;
    }

    public static long getDiffTime() {
        return sDiffTime;
    }

    public static AppMethodBeat getInstance() {
        return sInstance;
    }

    public static String getVisibleScene() {
        ProcessUILifecycleOwner.f235399x.getClass();
        return ProcessUILifecycleOwner.f235397v;
    }

    /* renamed from: i */
    public static void m98135i(int i) {
        if (status > -1 && i < METHOD_ID_MAX) {
            if (status == Integer.MAX_VALUE) {
                synchronized (statusLock) {
                    if (status == Integer.MAX_VALUE) {
                        realExecute();
                        status = 1;
                    }
                }
            }
            long id = Thread.currentThread().getId();
            C80542f fVar = sMethodEnterListener;
            if (fVar != null) {
                fVar.mo112122a(i, id);
            }
            if (id == sMainThreadId && !assertIn) {
                assertIn = true;
                int i2 = sIndex;
                if (i2 < 1000000) {
                    mergeData(i, i2, true);
                } else {
                    sIndex = 0;
                    mergeData(i, 0, true);
                }
                sIndex++;
                assertIn = false;
            }
        }
    }

    public static boolean isRealTrace() {
        return status >= 1;
    }

    private static void mergeData(int i, int i2, boolean z) {
        if (i == 1048574) {
            sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
        }
        long j = 0;
        if (z) {
            j = Long.MIN_VALUE;
        }
        long j2 = j | (((long) i) << 43);
        try {
            sBuffer[i2] = j2 | (sCurrentDiffTime & 8796093022207L);
            checkPileup(i2);
            sLastIndex = i2;
        } catch (Throwable th) {
            C118672d.m167352b(TAG, th.getMessage(), new Object[0]);
        }
    }

    /* renamed from: o */
    public static void m98136o(int i) {
        if (status > -1 && i < METHOD_ID_MAX && Thread.currentThread().getId() == sMainThreadId) {
            int i2 = sIndex;
            if (i2 < 1000000) {
                mergeData(i, i2, false);
            } else {
                sIndex = 0;
                mergeData(i, 0, false);
            }
            sIndex++;
        }
    }

    private static void realExecute() {
        C118672d.m167353c(TAG, "[realExecute] timestamp:%s", Long.valueOf(System.currentTimeMillis()));
        sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
        sHandler.removeCallbacksAndMessages((Object) null);
        sHandler.postDelayed(sUpdateDiffTimeRunnable, 5);
        Handler handler = sHandler;
        C80540d dVar = new C80540d();
        checkStartExpiredRunnable = dVar;
        handler.postDelayed(dVar, 10000);
        C80541e eVar = C89206a.f257046c;
        try {
            C89206a.f257044a = SystemClock.uptimeMillis();
            C89206a.f257047d = getInstance().maskIndex("ApplicationCreateBeginMethodIndex");
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(cls);
            Field declaredField2 = cls.getDeclaredField("mH");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Class<? super Object> superclass = obj2.getClass().getSuperclass();
            if (superclass != null) {
                Field declaredField3 = superclass.getDeclaredField("mCallback");
                declaredField3.setAccessible(true);
                declaredField3.set(obj2, new C89206a.C89207a((Handler.Callback) declaredField3.get(obj2)));
            }
            C118672d.m167353c("Matrix.ActivityThreadHacker", "hook system handler completed. start:%s SDK_INT:%s", Long.valueOf(C89206a.f257044a), Integer.valueOf(Build.VERSION.SDK_INT));
        } catch (Exception e) {
            C118672d.m167352b("Matrix.ActivityThreadHacker", "hook system handler err! %s", e.getCause().toString());
        }
        C89642e eVar2 = looperMonitorListener;
        C88933a aVar = C88933a.f256476q;
        synchronized (aVar.f256483i) {
            ((HashMap) aVar.f256483i).put(eVar2, new C88933a.C88934a(eVar2));
        }
    }

    /* access modifiers changed from: private */
    public static void realRelease() {
        synchronized (statusLock) {
            if (status == Integer.MAX_VALUE || status <= 1) {
                C118672d.m167353c(TAG, "[realRelease] timestamp:%s", Long.valueOf(System.currentTimeMillis()));
                sHandler.removeCallbacksAndMessages((Object) null);
                C88933a.m111028d(looperMonitorListener);
                sTimerUpdateThread.quit();
                sBuffer = null;
                status = -3;
            }
        }
    }

    public void addListener(C89639a aVar) {
        HashSet<C89639a> hashSet = listeners;
        synchronized (hashSet) {
            hashSet.add(aVar);
        }
    }

    public long[] copyData(C80541e eVar) {
        return copyData(eVar, new C80541e(sIndex - 1));
    }

    public void forceStop() {
        synchronized (statusLock) {
            status = -1;
        }
    }

    public boolean isAlive() {
        return status >= 2;
    }

    public C80541e maskIndex(String str) {
        C80541e eVar = sIndexRecordHead;
        if (eVar == null) {
            C80541e eVar2 = new C80541e(sIndex - 1);
            sIndexRecordHead = eVar2;
            eVar2.f235560d = str;
            return eVar2;
        }
        C80541e eVar3 = new C80541e(sIndex - 1);
        eVar3.f235560d = str;
        C80541e eVar4 = null;
        while (eVar != null) {
            if (eVar3.f235557a <= eVar.f235557a) {
                if (eVar4 == null) {
                    C80541e eVar5 = sIndexRecordHead;
                    sIndexRecordHead = eVar3;
                    eVar3.f235558b = eVar5;
                } else {
                    C80541e eVar6 = eVar4.f235558b;
                    eVar4.f235558b = eVar3;
                    eVar3.f235558b = eVar6;
                }
                return eVar3;
            }
            C80541e eVar7 = eVar;
            eVar = eVar.f235558b;
            eVar4 = eVar7;
        }
        eVar4.f235558b = eVar3;
        return eVar3;
    }

    public void onStart() {
        synchronized (statusLock) {
            if (status >= 2 || status < -2) {
                C118672d.m167356f(TAG, "[onStart] current status:%s", Integer.valueOf(status));
            } else {
                sHandler.removeCallbacks(checkStartExpiredRunnable);
                C90778c.m113843a().removeCallbacks(realReleaseRunnable);
                if (sBuffer != null) {
                    C118672d.m167353c(TAG, "[onStart] preStatus:%s", Integer.valueOf(status), C90183c.m112856d());
                    status = 2;
                } else {
                    throw new RuntimeException("Matrix.AppMethodBeat sBuffer == null");
                }
            }
        }
    }

    public void onStop() {
        synchronized (statusLock) {
            if (status == 2) {
                C118672d.m167353c(TAG, "[onStop] %s", C90183c.m112856d());
                status = -1;
            } else {
                C118672d.m167356f(TAG, "[onStop] current status:%s", Integer.valueOf(status));
            }
        }
    }

    public void printIndexRecord() {
        StringBuilder sb = new StringBuilder(" \n");
        for (C80541e eVar = sIndexRecordHead; eVar != null; eVar = eVar.f235558b) {
            sb.append(eVar);
            sb.append("\n");
        }
        C118672d.m167353c(TAG, "[printIndexRecord] %s", sb.toString());
    }

    public void removeListener(C89639a aVar) {
        HashSet<C89639a> hashSet = listeners;
        synchronized (hashSet) {
            hashSet.remove(aVar);
        }
    }

    private long[] copyData(C80541e eVar, C80541e eVar2) {
        C80541e eVar3 = eVar;
        C80541e eVar4 = eVar2;
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[0];
        try {
            if (!eVar3.f235559c || !eVar4.f235559c) {
                C118672d.m167353c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", Integer.valueOf(Math.max(0, eVar3.f235557a)), Integer.valueOf(eVar4.f235557a), 0, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return jArr;
            }
            int max = Math.max(0, eVar3.f235557a);
            int max2 = Math.max(0, eVar4.f235557a);
            if (max2 > max) {
                int i = (max2 - max) + 1;
                jArr = new long[i];
                System.arraycopy(sBuffer, max, jArr, 0, i);
            } else if (max2 < max) {
                int i2 = max2 + 1;
                long[] jArr2 = sBuffer;
                jArr = new long[((jArr2.length - max) + i2)];
                System.arraycopy(jArr2, max, jArr, 0, jArr2.length - max);
                long[] jArr3 = sBuffer;
                System.arraycopy(jArr3, 0, jArr, jArr3.length - max, i2);
            }
            return jArr;
        } catch (Throwable th) {
            C118672d.m167352b(TAG, th.toString(), new Object[0]);
            return jArr;
        } finally {
            C118672d.m167353c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", Integer.valueOf(Math.max(0, eVar3.f235557a)), Integer.valueOf(eVar4.f235557a), Integer.valueOf(jArr.length), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* renamed from: com.tencent.matrix.trace.core.AppMethodBeat$e */
    public static final class C80541e {

        /* renamed from: a */
        public int f235557a;

        /* renamed from: b */
        public C80541e f235558b;

        /* renamed from: c */
        public boolean f235559c = false;

        /* renamed from: d */
        public String f235560d;

        public C80541e(int i) {
            this.f235557a = i;
        }

        /* renamed from: a */
        public void mo112120a() {
            this.f235559c = false;
            C80541e eVar = null;
            for (C80541e access$1000 = AppMethodBeat.sIndexRecordHead; access$1000 != null; access$1000 = access$1000.f235558b) {
                if (access$1000 == this) {
                    if (eVar != null) {
                        eVar.f235558b = access$1000.f235558b;
                    } else {
                        C80541e unused = AppMethodBeat.sIndexRecordHead = access$1000.f235558b;
                    }
                    access$1000.f235558b = null;
                    return;
                }
                eVar = access$1000;
            }
        }

        public String toString() {
            return "index:" + this.f235557a + ",\tisValid:" + this.f235559c + " source:" + this.f235560d;
        }

        public C80541e() {
        }
    }
}
