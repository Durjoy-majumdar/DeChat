package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor */
public final class ListenerInstanceMonitor {
    /* access modifiers changed from: private */
    public static final String ACTIVITY_CLASSNAME = Activity.class.getName();
    private static final int MONITOR_TRIGGER_INTERVAL_MILLIS = 10000;
    private static final int RECONFIRM_CHECK_COUNT = 3;
    private static final String TAG = "MicroMsg.ListenerInstanceMonitor";
    private static volatile Class sClass_DoNotCheckLeakForActivities = null;
    /* access modifiers changed from: private */
    public static volatile boolean sIsMonitorRunning = false;
    private static final Object sLock = new Object();
    private static Field sMContextField;
    /* access modifiers changed from: private */
    public static final byte[] sMapGuard = new byte[0];
    /* access modifiers changed from: private */
    public static final Map<Object, Set<HeldUIInfo>> sMarkedInstanceToHeldObjMap = new WeakHashMap();
    private static volatile Method sMehtod_value = null;
    /* access modifiers changed from: private */
    public static final Runnable sMonitorTask = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            if (android.os.Debug.isDebuggerConnected() == false) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.TAG, "[tomys] monitor task: found debugger connected, disable monitor works in case of misreport.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.TAG, "[tomys] monitor task: triggering gc...");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            java.lang.Runtime.getRuntime().gc();
            java.lang.Thread.sleep(100);
            java.lang.Runtime.getRuntime().runFinalization();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void doMonitorWorks() {
            /*
                r10 = this;
                byte[] r0 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sMapGuard
                monitor-enter(r0)
                java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sMarkedInstanceToHeldObjMap     // Catch:{ all -> 0x00f8 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f8 }
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "MicroMsg.ListenerInstanceMonitor"
                java.lang.String r2 = "[tomys] monitor task: no listener or cb was added, skip rest logic."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ all -> 0x00f8 }
                monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
                return
            L_0x0018:
                monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
                boolean r0 = android.os.Debug.isDebuggerConnected()
                if (r0 == 0) goto L_0x0027
                java.lang.String r0 = "MicroMsg.ListenerInstanceMonitor"
                java.lang.String r1 = "[tomys] monitor task: found debugger connected, disable monitor works in case of misreport."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                return
            L_0x0027:
                java.lang.String r0 = "MicroMsg.ListenerInstanceMonitor"
                java.lang.String r1 = "[tomys] monitor task: triggering gc..."
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0041 }
                r0.gc()     // Catch:{ all -> 0x0041 }
                r0 = 100
                java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x0041 }
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0041 }
                r0.runFinalization()     // Catch:{ all -> 0x0041 }
            L_0x0041:
                byte[] r1 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sMapGuard
                monitor-enter(r1)
                java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sMarkedInstanceToHeldObjMap     // Catch:{ all -> 0x00f5 }
                java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x00f5 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00f5 }
            L_0x0052:
                boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00f5 }
                if (r2 == 0) goto L_0x00f3
                java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00f5 }
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00f5 }
                java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00f5 }
                java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x00f5 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00f5 }
            L_0x0068:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00f5 }
                if (r3 == 0) goto L_0x0052
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00f5 }
                com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$HeldUIInfo r3 = (com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.HeldUIInfo) r3     // Catch:{ all -> 0x00f5 }
                java.lang.ref.WeakReference<java.lang.Object> r4 = r3.sentinel     // Catch:{ all -> 0x00f5 }
                java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x00f5 }
                java.lang.ref.WeakReference<android.app.Activity> r5 = r3.heldUIRef     // Catch:{ all -> 0x00f5 }
                java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00f5 }
                android.app.Activity r5 = (android.app.Activity) r5     // Catch:{ all -> 0x00f5 }
                r6 = 0
                r7 = 1
                if (r5 != 0) goto L_0x009b
                java.lang.String r4 = "MicroMsg.ListenerInstanceMonitor"
                java.lang.String r5 = "[tomys] monitor task: Ok, ui [%s] was recycled."
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00f5 }
                java.lang.Class<?> r3 = r3.heldUIClazz     // Catch:{ all -> 0x00f5 }
                java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x00f5 }
                r7[r6] = r3     // Catch:{ all -> 0x00f5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)     // Catch:{ all -> 0x00f5 }
                r2.remove()     // Catch:{ all -> 0x00f5 }
                goto L_0x0068
            L_0x009b:
                boolean r5 = r10.isUIActuallyDestroyed(r5)     // Catch:{ all -> 0x00f5 }
                if (r5 != 0) goto L_0x00a2
                goto L_0x0068
            L_0x00a2:
                if (r4 == 0) goto L_0x00a5
                goto L_0x0068
            L_0x00a5:
                int r4 = r3.checkedCount     // Catch:{ all -> 0x00f5 }
                r5 = 3
                if (r4 <= r5) goto L_0x00d3
                r2.remove()     // Catch:{ all -> 0x00f5 }
                boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x00f5 }
                if (r4 != 0) goto L_0x00bb
                boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isMonkeyEnv()     // Catch:{ all -> 0x00f5 }
                if (r4 == 0) goto L_0x00ba
                goto L_0x00bb
            L_0x00ba:
                r7 = 0
            L_0x00bb:
                com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$ListenerLeakedException r4 = new com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$ListenerLeakedException     // Catch:{ all -> 0x00f5 }
                java.lang.String r5 = r3.describe()     // Catch:{ all -> 0x00f5 }
                java.lang.Throwable r3 = r3.stacktrace     // Catch:{ all -> 0x00f5 }
                r4.<init>(r5, r3)     // Catch:{ all -> 0x00f5 }
                if (r7 != 0) goto L_0x00d2
                java.lang.String r3 = "MicroMsg.ListenerInstanceMonitor"
                java.lang.String r5 = ""
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00f5 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r5, r6)     // Catch:{ all -> 0x00f5 }
                goto L_0x0068
            L_0x00d2:
                throw r4     // Catch:{ all -> 0x00f5 }
            L_0x00d3:
                int r4 = r4 + 1
                r3.checkedCount = r4     // Catch:{ all -> 0x00f5 }
                java.lang.String r4 = "MicroMsg.ListenerInstanceMonitor"
                java.lang.String r5 = "[tomys] monitor task: ui [%s] was recycled, but its instance is still exists in %s time(s) check."
                r8 = 2
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00f5 }
                java.lang.Class<?> r9 = r3.heldUIClazz     // Catch:{ all -> 0x00f5 }
                java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x00f5 }
                r8[r6] = r9     // Catch:{ all -> 0x00f5 }
                int r3 = r3.checkedCount     // Catch:{ all -> 0x00f5 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00f5 }
                r8[r7] = r3     // Catch:{ all -> 0x00f5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r8)     // Catch:{ all -> 0x00f5 }
                goto L_0x0068
            L_0x00f3:
                monitor-exit(r1)     // Catch:{ all -> 0x00f5 }
                return
            L_0x00f5:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00f5 }
                throw r0
            L_0x00f8:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00f8 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.C857451.doMonitorWorks():void");
        }

        private boolean isUIActuallyDestroyed(Activity activity) {
            boolean isDestroyed = activity.isDestroyed();
            if (!isDestroyed) {
                return false;
            }
            for (StackTraceElement stackTraceElement : Looper.getMainLooper().getThread().getStackTrace()) {
                if (ListenerInstanceMonitor.ACTIVITY_CLASSNAME.equals(stackTraceElement.getClassName()) && "performDestroy".equals(stackTraceElement.getMethodName())) {
                    return false;
                }
            }
            return isDestroyed;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
            if (com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.access$100() == false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
            com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.access$200().postDelayed(r4, 10000);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
            doMonitorWorks();
            r1 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.access$000();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
            monitor-enter(r1);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                java.lang.Runnable r0 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sMonitorTask
                monitor-enter(r0)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sIsMonitorRunning     // Catch:{ all -> 0x002a }
                if (r1 != 0) goto L_0x000d
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                return
            L_0x000d:
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                r4.doMonitorWorks()
                java.lang.Runnable r1 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sMonitorTask
                monitor-enter(r1)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sIsMonitorRunning     // Catch:{ all -> 0x0027 }
                if (r0 == 0) goto L_0x0025
                com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.sMonitorThreadHandler     // Catch:{ all -> 0x0027 }
                r2 = 10000(0x2710, double:4.9407E-320)
                r0.postDelayed(r4, r2)     // Catch:{ all -> 0x0027 }
            L_0x0025:
                monitor-exit(r1)     // Catch:{ all -> 0x0027 }
                return
            L_0x0027:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0027 }
                throw r0
            L_0x002a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.C857451.run():void");
        }
    };
    /* access modifiers changed from: private */
    public static MMHandler sMonitorThreadHandler = null;

    /* renamed from: com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$HeldUIInfo */
    public static class HeldUIInfo {
        public int checkedCount;
        public Class<?> heldUIClazz;
        public WeakReference<Activity> heldUIRef;
        public Field holderField;
        public final WeakReference<Object> sentinel = new WeakReference<>(new Object());
        public Throwable stacktrace;

        public HeldUIInfo(Activity activity, Field field, Throwable th) {
            this.heldUIRef = new WeakReference<>(activity);
            this.heldUIClazz = activity.getClass();
            this.holderField = field;
            this.stacktrace = th;
            this.checkedCount = 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
            if (r1 != null) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
            r0 = r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String getHolderFieldDesc() {
            /*
                r4 = this;
                java.lang.reflect.Field r0 = r4.holderField
                if (r0 != 0) goto L_0x0007
                java.lang.String r0 = "#null#"
                return r0
            L_0x0007:
                java.lang.Class r0 = r0.getDeclaringClass()
                boolean r1 = r0.isAnonymousClass()
                java.lang.String r2 = "field "
                if (r1 != 0) goto L_0x0035
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.reflect.Field r2 = r4.holderField
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = " defined in "
                r1.append(r2)
                java.lang.String r0 = r0.getName()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            L_0x0035:
                java.lang.reflect.Type r1 = r0.getGenericSuperclass()
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                boolean r3 = r3.equals(r1)
                if (r3 == 0) goto L_0x0049
                java.lang.reflect.Type[] r0 = r0.getGenericInterfaces()
                r1 = 0
                r0 = r0[r1]
                goto L_0x004d
            L_0x0049:
                if (r1 != 0) goto L_0x004c
                goto L_0x004d
            L_0x004c:
                r0 = r1
            L_0x004d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.reflect.Field r2 = r4.holderField
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = " define in anonymous class of "
                r1.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 60
                r3 = 35
                java.lang.String r0 = r0.replace(r2, r3)
                r2 = 62
                java.lang.String r0 = r0.replace(r2, r3)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.HeldUIInfo.getHolderFieldDesc():java.lang.String");
        }

        private String getStackTraceString() {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = null;
            try {
                PrintWriter printWriter2 = new PrintWriter(stringWriter);
                try {
                    this.stacktrace.printStackTrace(printWriter2);
                    Util.qualityClose(printWriter2);
                    return stringWriter.toString();
                } catch (Throwable th) {
                    th = th;
                    printWriter = printWriter2;
                    Util.qualityClose(printWriter);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                Util.qualityClose(printWriter);
                throw th;
            }
        }

        public String describe() {
            if (this.heldUIRef.get() == null) {
                if (this.holderField != null) {
                    return "ui of class [" + this.heldUIClazz.getName() + "] held by\n [" + getHolderFieldDesc() + "] is recycled";
                }
                return "ui of class [" + this.heldUIClazz.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is recycled";
            } else if (this.holderField != null) {
                return "ui of class [" + this.heldUIClazz.getName() + "] held by\n [" + getHolderFieldDesc() + "] is leaked.\n Perhaps you should remove the holder from any 'Manager' class when the leaked ui was destroyed.";
            } else {
                return "ui of class [" + this.heldUIClazz.getName() + "] which is subclass of\n listener or callback and held by other 'Manager' class is leaked.\n Perhaps you should remove any instance of this class from any 'Manager'";
            }
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof HeldUIInfo)) {
                return false;
            }
            HeldUIInfo heldUIInfo = (HeldUIInfo) obj;
            Activity activity = this.heldUIRef.get();
            Activity activity2 = heldUIInfo.heldUIRef.get();
            if (!((activity == null && activity2 == null) ? true : (activity == null || activity2 == null) ? false : activity.equals(activity2))) {
                return false;
            }
            Field field = this.holderField;
            Field field2 = heldUIInfo.holderField;
            if (!((field == null && field2 == null) ? true : (field == null || field2 == null) ? false : field.equals(field2))) {
                return false;
            }
            Throwable th = this.stacktrace;
            Throwable th4 = heldUIInfo.stacktrace;
            if (th == null && th4 == null) {
                return true;
            }
            if (th == null || th4 == null) {
                return false;
            }
            return th.equals(th4);
        }

        public int hashCode() {
            Activity activity = this.heldUIRef.get();
            int i = 0;
            int hashCode = activity != null ? activity.hashCode() : 0;
            Field field = this.holderField;
            int hashCode2 = field != null ? field.hashCode() : 0;
            Throwable th = this.stacktrace;
            if (th != null) {
                i = th.hashCode();
            }
            return hashCode + hashCode2 + i;
        }

        public String toString() {
            return getHolderFieldDesc() + "@" + getStackTraceString().replace(10, '|');
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$ListenerLeakedException */
    public static final class ListenerLeakedException extends RuntimeException {
        public ListenerLeakedException(String str, Throwable th) {
            super(str + "\n See stacktrace to find where is the holder(listener) being added.");
            setStackTrace(th.getStackTrace());
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    static {
        sMContextField = null;
        if (!WeChatEnvironment.hasDebugger() && !WeChatEnvironment.isMonkeyEnv()) {
            Log.m105928w(TAG, "Not debug, assist or monkey env, keep disabled.");
        } else if (MMApplicationContext.isMMProcess()) {
            try {
                Field declaredField = View.class.getDeclaredField("mContext");
                sMContextField = declaredField;
                declaredField.setAccessible(true);
                startMonitor();
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "init failed, keep disabled.", new Object[0]);
            }
        } else {
            Log.m105928w(TAG, "Not mm process, keep disabled.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0089 A[Catch:{ all -> 0x0098 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void addHeldObjInfo(java.lang.Object r7, android.app.Activity r8, java.lang.reflect.Field r9, java.lang.Throwable r10) {
        /*
            r0 = 0
            java.lang.Class r1 = sClass_DoNotCheckLeakForActivities     // Catch:{ all -> 0x0098 }
            if (r1 != 0) goto L_0x0026
            java.lang.Object r1 = sLock     // Catch:{ all -> 0x0098 }
            monitor-enter(r1)     // Catch:{ all -> 0x0098 }
            java.lang.Class r2 = sClass_DoNotCheckLeakForActivities     // Catch:{ all -> 0x0023 }
            if (r2 != 0) goto L_0x0021
            java.lang.String r2 = "com.tencent.mm.sdk.platformtools.DoNotCheckLeakForActivities"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0023 }
            sClass_DoNotCheckLeakForActivities = r2     // Catch:{ all -> 0x0023 }
            java.lang.Class r2 = sClass_DoNotCheckLeakForActivities     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "value"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x0023 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x0023 }
            sMehtod_value = r2     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0026
        L_0x0023:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r2     // Catch:{ all -> 0x0098 }
        L_0x0026:
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x0098 }
            java.lang.Class r2 = sClass_DoNotCheckLeakForActivities     // Catch:{ all -> 0x0098 }
            boolean r1 = r1.isAnnotationPresent(r2)     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x003d
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x0098 }
            java.lang.Class r2 = sClass_DoNotCheckLeakForActivities     // Catch:{ all -> 0x0098 }
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)     // Catch:{ all -> 0x0098 }
            goto L_0x005e
        L_0x003d:
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x0098 }
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch:{ all -> 0x0098 }
            int r2 = r1.length     // Catch:{ all -> 0x0098 }
            r3 = 0
        L_0x0047:
            if (r3 >= r2) goto L_0x005d
            r4 = r1[r3]     // Catch:{ all -> 0x0098 }
            java.lang.Class r5 = sClass_DoNotCheckLeakForActivities     // Catch:{ all -> 0x0098 }
            boolean r5 = r4.isAnnotationPresent(r5)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x005a
            java.lang.Class r1 = sClass_DoNotCheckLeakForActivities     // Catch:{ all -> 0x0098 }
            java.lang.annotation.Annotation r1 = r4.getAnnotation(r1)     // Catch:{ all -> 0x0098 }
            goto L_0x005e
        L_0x005a:
            int r3 = r3 + 1
            goto L_0x0047
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x00a2
            java.lang.Class r2 = r8.getClass()     // Catch:{ all -> 0x0098 }
            java.lang.reflect.Method r3 = sMehtod_value     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0098 }
            java.lang.Object r1 = r3.invoke(r1, r4)     // Catch:{ all -> 0x0098 }
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch:{ all -> 0x0098 }
            r3 = 1
            if (r1 == 0) goto L_0x0086
            int r4 = r1.length     // Catch:{ all -> 0x0098 }
            if (r4 <= 0) goto L_0x0086
            int r4 = r1.length     // Catch:{ all -> 0x0098 }
            r5 = 0
        L_0x0076:
            if (r5 >= r4) goto L_0x0084
            r6 = r1[r5]     // Catch:{ all -> 0x0098 }
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x0098 }
            if (r6 == 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            int r5 = r5 + 1
            goto L_0x0076
        L_0x0084:
            r1 = 0
            goto L_0x0087
        L_0x0086:
            r1 = 1
        L_0x0087:
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = "MicroMsg.ListenerInstanceMonitor"
            java.lang.String r2 = "Activity %s held by %s is ignored !!"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0098 }
            r4[r0] = r8     // Catch:{ all -> 0x0098 }
            r4[r3] = r7     // Catch:{ all -> 0x0098 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r2, r4)     // Catch:{ all -> 0x0098 }
            return
        L_0x0098:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.ListenerInstanceMonitor"
            java.lang.String r3 = "addHeldObjInfo"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
        L_0x00a2:
            byte[] r0 = sMapGuard
            monitor-enter(r0)
            java.util.Map<java.lang.Object, java.util.Set<com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$HeldUIInfo>> r1 = sMarkedInstanceToHeldObjMap     // Catch:{ all -> 0x00c1 }
            java.lang.Object r2 = r1.get(r7)     // Catch:{ all -> 0x00c1 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x00c1 }
            if (r2 != 0) goto L_0x00b7
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00c1 }
            r2.<init>()     // Catch:{ all -> 0x00c1 }
            r1.put(r7, r2)     // Catch:{ all -> 0x00c1 }
        L_0x00b7:
            com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$HeldUIInfo r7 = new com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor$HeldUIInfo     // Catch:{ all -> 0x00c1 }
            r7.<init>(r8, r9, r10)     // Catch:{ all -> 0x00c1 }
            r2.add(r7)     // Catch:{ all -> 0x00c1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            return
        L_0x00c1:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c1 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.addHeldObjInfo(java.lang.Object, android.app.Activity, java.lang.reflect.Field, java.lang.Throwable):void");
    }

    public static void markInstanceRegistered(Object obj) {
        Class<Activity> cls = Activity.class;
        if (obj != null) {
            Throwable th = new Throwable();
            for (Class cls2 = obj.getClass(); !Object.class.equals(cls2); cls2 = cls2.getSuperclass()) {
                if (cls.isAssignableFrom(cls2)) {
                    processHeldActivity(obj, (Field) null, th);
                } else if (View.class.isAssignableFrom(cls2)) {
                    processHeldView(obj, (Field) null, th);
                } else {
                    for (Field field : cls2.getDeclaredFields()) {
                        Class<?> type = field.getType();
                        if (cls.isAssignableFrom(type)) {
                            processHeldActivity(obj, field, th);
                        } else if (View.class.isAssignableFrom(type)) {
                            processHeldView(obj, field, th);
                        }
                    }
                }
            }
        }
    }

    public static void markInstanceUnregistered(Object obj) {
        if (obj != null) {
            synchronized (sMapGuard) {
                sMarkedInstanceToHeldObjMap.remove(obj);
            }
        }
    }

    private static void processHeldActivity(Object obj, Field field, Throwable th) {
        Activity activity;
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                activity = (Activity) field.get(obj);
                if (activity == null) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        } else if (obj instanceof Activity) {
            activity = (Activity) obj;
        } else {
            return;
        }
        addHeldObjInfo(obj, activity, field, th);
    }

    private static void processHeldView(Object obj, Field field, Throwable th) {
        View view;
        if (field == null) {
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                return;
            }
        } else if (sMContextField != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                view = (View) field.get(obj);
                if (view == null) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        } else {
            return;
        }
        Object obj2 = sMContextField.get(view);
        if (obj2 instanceof Activity) {
            addHeldObjInfo(obj, (Activity) obj2, field, th);
        }
    }

    public static void startMonitor() {
        Runnable runnable = sMonitorTask;
        synchronized (runnable) {
            if (!sIsMonitorRunning) {
                MMHandler mMHandler = new MMHandler("ListenerInstanceMonitor");
                sMonitorThreadHandler = mMHandler;
                mMHandler.setLogging(false);
                sMonitorThreadHandler.postDelayed(runnable, 10000);
                sIsMonitorRunning = true;
            }
        }
    }

    public static void stopMonitor() {
        Runnable runnable = sMonitorTask;
        synchronized (runnable) {
            if (sIsMonitorRunning) {
                sMonitorThreadHandler.removeCallbacks(runnable);
                sMonitorThreadHandler.quit();
                sMonitorThreadHandler = null;
                sIsMonitorRunning = false;
            }
        }
    }
}
