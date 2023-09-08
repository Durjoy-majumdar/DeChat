package com.tencent.p014mm.pluginguard;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.UiAutomation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.TestLooperManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C24564k0;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110818d0;
import tc3.C13871e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001JN\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/pluginguard/ActivityHookInstrumentation;", "Landroid/app/Instrumentation;", "Landroid/content/Context;", "who", "Landroid/os/IBinder;", "contextThread", "token", "Landroid/app/Activity;", "target", "Landroid/content/Intent;", "intent", "", "requestCode", "Landroid/os/Bundle;", "options", "Landroid/app/Instrumentation$ActivityResult;", "execStartActivity", "compat_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginguard.ActivityHookInstrumentation */
public final class ActivityHookInstrumentation extends Instrumentation {

    /* renamed from: a */
    public Instrumentation f249524a;

    /* renamed from: b */
    public final Set<String> f249525b = new LinkedHashSet();

    public ActivityHookInstrumentation(Instrumentation instrumentation) {
        C87412m.m108594g(instrumentation, "mOriginalInstrumentation");
        this.f249524a = instrumentation;
        Field[] declaredFields = Instrumentation.class.getDeclaredFields();
        int length = declaredFields.length;
        for (int i = 0; i < length; i++) {
            declaredFields[i].setAccessible(true);
            declaredFields[i].set(this, declaredFields[i].get(this.f249524a));
        }
    }

    public TestLooperManager acquireLooperManager(Looper looper) {
        TestLooperManager acquireLooperManager = this.f249524a.acquireLooperManager(looper);
        C87412m.m108593f(acquireLooperManager, "mOriginalInstrumentation…uireLooperManager(looper)");
        return acquireLooperManager;
    }

    public void addMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f249524a.addMonitor(activityMonitor);
    }

    public void addResults(Bundle bundle) {
        this.f249524a.addResults(bundle);
    }

    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.f249524a.callActivityOnCreate(activity, bundle);
    }

    public void callActivityOnDestroy(Activity activity) {
        this.f249524a.callActivityOnDestroy(activity);
    }

    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        this.f249524a.callActivityOnNewIntent(activity, intent);
    }

    public void callActivityOnPause(Activity activity) {
        this.f249524a.callActivityOnPause(activity);
    }

    public void callActivityOnPictureInPictureRequested(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f249524a.callActivityOnPictureInPictureRequested(activity);
    }

    public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f249524a.callActivityOnPostCreate(activity, bundle);
    }

    public void callActivityOnRestart(Activity activity) {
        this.f249524a.callActivityOnRestart(activity);
    }

    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "savedInstanceState");
        this.f249524a.callActivityOnRestoreInstanceState(activity, bundle);
    }

    public void callActivityOnResume(Activity activity) {
        this.f249524a.callActivityOnResume(activity);
    }

    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "outState");
        this.f249524a.callActivityOnSaveInstanceState(activity, bundle);
    }

    public void callActivityOnStart(Activity activity) {
        this.f249524a.callActivityOnStart(activity);
    }

    public void callActivityOnStop(Activity activity) {
        this.f249524a.callActivityOnStop(activity);
    }

    public void callActivityOnUserLeaving(Activity activity) {
        this.f249524a.callActivityOnUserLeaving(activity);
    }

    public void callApplicationOnCreate(Application application) {
        this.f249524a.callApplicationOnCreate(application);
    }

    public boolean checkMonitorHit(Instrumentation.ActivityMonitor activityMonitor, int i) {
        return this.f249524a.checkMonitorHit(activityMonitor, i);
    }

    public void endPerformanceSnapshot() {
        this.f249524a.endPerformanceSnapshot();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r2 == false) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[Catch:{ all -> 0x0121, all -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090 A[SYNTHETIC, Splitter:B:36:0x0090] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Instrumentation.ActivityResult execStartActivity(android.content.Context r24, android.os.IBinder r25, android.os.IBinder r26, android.app.Activity r27, android.content.Intent r28, int r29, android.os.Bundle r30) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r8 = r28
            java.lang.String r9 = "MicroMsg.ActivityHookInstrumentation"
            r10 = 2
            r11 = 0
            java.lang.String r2 = "Hook.execStartActivity"
            bp3.C79760s.m96908a(r2)     // Catch:{ all -> 0x0121 }
            f40.a0 r2 = f40.C86709a0.m107528h()     // Catch:{ all -> 0x0121 }
            f40.g0<j40.b> r2 = r2.f251724a     // Catch:{ all -> 0x0121 }
            boolean r2 = r2.f251792d     // Catch:{ all -> 0x0121 }
            java.lang.String r12 = ""
            java.lang.String r3 = "it"
            r13 = 1
            if (r2 == 0) goto L_0x004d
            java.util.List<ke3.b$e> r2 = ke3.C88144b.f254911a     // Catch:{ all -> 0x0121 }
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x0121 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0121 }
        L_0x0027:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0121 }
            ke3.b$e r4 = (ke3.C88144b.C9613e) r4     // Catch:{ all -> 0x0121 }
            if (r8 == 0) goto L_0x0041
            android.content.ComponentName r5 = r28.getComponent()     // Catch:{ all -> 0x0121 }
            if (r5 == 0) goto L_0x0041
            java.lang.String r5 = r5.getClassName()     // Catch:{ all -> 0x0121 }
            if (r5 != 0) goto L_0x0042
        L_0x0041:
            r5 = r12
        L_0x0042:
            boolean r4 = r4.mo2009d(r0, r5, r8)     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x0027
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            if (r2 != 0) goto L_0x0077
        L_0x004d:
            java.util.List<ke3.b$f> r2 = ke3.C88144b.f254912b     // Catch:{ all -> 0x0121 }
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x0121 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x0121 }
        L_0x0056:
            boolean r2 = r14.hasNext()     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r14.next()     // Catch:{ all -> 0x0121 }
            ke3.b$f r2 = (ke3.C88144b.C9614f) r2     // Catch:{ all -> 0x0121 }
            r3 = r24
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            boolean r2 = r2.mo1258a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0121 }
            if (r2 == 0) goto L_0x0056
            r2 = 1
            goto L_0x0075
        L_0x0074:
            r2 = 0
        L_0x0075:
            if (r2 == 0) goto L_0x0079
        L_0x0077:
            r2 = 1
            goto L_0x007a
        L_0x0079:
            r2 = 0
        L_0x007a:
            r3 = 0
            if (r2 == 0) goto L_0x0090
            tc3.e r14 = tc3.C13871e.f39036a     // Catch:{ all -> 0x0121 }
            r15 = 1856(0x740, double:9.17E-321)
            r17 = 0
            r19 = 0
            r21 = 4
            r22 = 0
            tc3.C13871e.m13176a(r14, r15, r17, r19, r21, r22)     // Catch:{ all -> 0x0121 }
            bp3.C79760s.m96909b()
            return r3
        L_0x0090:
            java.util.Set<java.lang.String> r2 = r1.f249525b     // Catch:{ all -> 0x0121 }
            if (r8 == 0) goto L_0x00a2
            android.content.ComponentName r4 = r28.getComponent()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x00a2
            java.lang.String r4 = r4.getClassName()     // Catch:{ all -> 0x0121 }
            if (r4 != 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r12 = r4
        L_0x00a2:
            r2.add(r12)     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.app.Instrumentation> r2 = android.app.Instrumentation.class
            java.lang.String r4 = "execStartActivity"
            r5 = 7
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r11] = r7     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r6[r13] = r7     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            r6[r10] = r7     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.app.Activity> r7 = android.app.Activity.class
            r12 = 3
            r6[r12] = r7     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.content.Intent> r7 = android.content.Intent.class
            r14 = 4
            r6[r14] = r7     // Catch:{ all -> 0x0121 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0121 }
            r15 = 5
            r6[r15] = r7     // Catch:{ all -> 0x0121 }
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            r16 = 6
            r6[r16] = r7     // Catch:{ all -> 0x0121 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r6)     // Catch:{ all -> 0x0121 }
            android.app.Instrumentation r4 = r1.f249524a     // Catch:{ all -> 0x0121 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0121 }
            r5[r11] = r0     // Catch:{ all -> 0x0121 }
            r5[r13] = r25     // Catch:{ all -> 0x0121 }
            r5[r10] = r26     // Catch:{ all -> 0x0121 }
            r5[r12] = r27     // Catch:{ all -> 0x0121 }
            r5[r14] = r8     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x0121 }
            r5[r15] = r0     // Catch:{ all -> 0x0121 }
            r5[r16] = r30     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r2.invoke(r4, r5)     // Catch:{ all -> 0x0121 }
            android.app.Instrumentation$ActivityResult r0 = (android.app.Instrumentation.ActivityResult) r0     // Catch:{ all -> 0x0121 }
            tc3.e r12 = tc3.C13871e.f39036a     // Catch:{ all -> 0x0121 }
            r13 = 1856(0x740, double:9.17E-321)
            r15 = 0
            r17 = 0
            r19 = 4
            r20 = 0
            tc3.C13871e.m13176a(r12, r13, r15, r17, r19, r20)     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r2.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = "success start "
            r2.append(r4)     // Catch:{ all -> 0x0121 }
            if (r8 == 0) goto L_0x0113
            android.content.ComponentName r4 = r28.getComponent()     // Catch:{ all -> 0x0121 }
            if (r4 == 0) goto L_0x0113
            java.lang.String r3 = r4.getClassName()     // Catch:{ all -> 0x0121 }
        L_0x0113:
            r2.append(r3)     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0121 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)     // Catch:{ all -> 0x0121 }
            bp3.C79760s.m96909b()
            return r0
        L_0x0121:
            r0 = move-exception
            boolean r2 = r0 instanceof java.lang.reflect.InvocationTargetException     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x0141
            r2 = r0
            java.lang.reflect.InvocationTargetException r2 = (java.lang.reflect.InvocationTargetException) r2     // Catch:{ all -> 0x0168 }
            java.lang.Throwable r2 = r2.getTargetException()     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "Guard ignore throwable"
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x0168 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r2, r3, r4)     // Catch:{ all -> 0x0168 }
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0     // Catch:{ all -> 0x0168 }
            java.lang.Throwable r0 = r0.getTargetException()     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "t.targetException"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x0141:
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "emergencyRepair!!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r3, r2)     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = "activity_hook"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "has_error"
            r4 = 2
            r2.encode((java.lang.String) r3, (long) r4)     // Catch:{ all -> 0x0168 }
            tc3.e r11 = tc3.C13871e.f39036a     // Catch:{ all -> 0x0168 }
            r11.mo13201b(r10)     // Catch:{ all -> 0x0168 }
            r12 = 1856(0x740, double:9.17E-321)
            r14 = 2
            r16 = 0
            r18 = 4
            r19 = 0
            tc3.C13871e.m13176a(r11, r12, r14, r16, r18, r19)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            bp3.C79760s.m96909b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginguard.ActivityHookInstrumentation.execStartActivity(android.content.Context, android.os.IBinder, android.os.IBinder, android.app.Activity, android.content.Intent, int, android.os.Bundle):android.app.Instrumentation$ActivityResult");
    }

    public void finish(int i, Bundle bundle) {
        this.f249524a.finish(i, bundle);
    }

    public Bundle getAllocCounts() {
        Bundle allocCounts = this.f249524a.getAllocCounts();
        C87412m.m108593f(allocCounts, "mOriginalInstrumentation.getAllocCounts()");
        return allocCounts;
    }

    public Bundle getBinderCounts() {
        Bundle binderCounts = this.f249524a.getBinderCounts();
        C87412m.m108593f(binderCounts, "mOriginalInstrumentation.getBinderCounts()");
        return binderCounts;
    }

    public ComponentName getComponentName() {
        ComponentName componentName = this.f249524a.getComponentName();
        C87412m.m108593f(componentName, "mOriginalInstrumentation.getComponentName()");
        return componentName;
    }

    public Context getContext() {
        Context context = this.f249524a.getContext();
        C87412m.m108593f(context, "mOriginalInstrumentation.getContext()");
        return context;
    }

    public String getProcessName() {
        String processName = this.f249524a.getProcessName();
        C87412m.m108593f(processName, "mOriginalInstrumentation.getProcessName()");
        return processName;
    }

    public Context getTargetContext() {
        Context targetContext = this.f249524a.getTargetContext();
        C87412m.m108593f(targetContext, "mOriginalInstrumentation.getTargetContext()");
        return targetContext;
    }

    public UiAutomation getUiAutomation() {
        UiAutomation uiAutomation = this.f249524a.getUiAutomation();
        C87412m.m108593f(uiAutomation, "mOriginalInstrumentation.getUiAutomation()");
        return uiAutomation;
    }

    public boolean invokeContextMenuAction(Activity activity, int i, int i2) {
        return this.f249524a.invokeContextMenuAction(activity, i, i2);
    }

    public boolean invokeMenuActionSync(Activity activity, int i, int i2) {
        return this.f249524a.invokeMenuActionSync(activity, i, i2);
    }

    public boolean isProfiling() {
        return this.f249524a.isProfiling();
    }

    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        Activity newActivity = this.f249524a.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        C87412m.m108593f(newActivity, "mOriginalInstrumentation…urationInstance\n        )");
        return newActivity;
    }

    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        Application newApplication = this.f249524a.newApplication(classLoader, str, context);
        C87412m.m108593f(newApplication, "mOriginalInstrumentation…n(cl, className, context)");
        return newApplication;
    }

    public void onCreate(Bundle bundle) {
        this.f249524a.onCreate(bundle);
    }

    public void onDestroy() {
        this.f249524a.onDestroy();
    }

    public boolean onException(Object obj, Throwable th) {
        return this.f249524a.onException(obj, th);
    }

    public void onStart() {
        this.f249524a.onStart();
    }

    public void removeMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        this.f249524a.removeMonitor(activityMonitor);
    }

    public void runOnMainSync(Runnable runnable) {
        this.f249524a.runOnMainSync(runnable);
    }

    public void sendCharacterSync(int i) {
        this.f249524a.sendCharacterSync(i);
    }

    public void sendKeyDownUpSync(int i) {
        this.f249524a.sendKeyDownUpSync(i);
    }

    public void sendKeySync(KeyEvent keyEvent) {
        this.f249524a.sendKeySync(keyEvent);
    }

    public void sendPointerSync(MotionEvent motionEvent) {
        this.f249524a.sendPointerSync(motionEvent);
    }

    public void sendStatus(int i, Bundle bundle) {
        this.f249524a.sendStatus(i, bundle);
    }

    public void sendStringSync(String str) {
        this.f249524a.sendStringSync(str);
    }

    public void sendTrackballEventSync(MotionEvent motionEvent) {
        this.f249524a.sendTrackballEventSync(motionEvent);
    }

    public void setAutomaticPerformanceSnapshots() {
        this.f249524a.setAutomaticPerformanceSnapshots();
    }

    public void setInTouchMode(boolean z) {
        this.f249524a.setInTouchMode(z);
    }

    public void start() {
        this.f249524a.start();
    }

    public Activity startActivitySync(Intent intent) {
        Activity startActivitySync = this.f249524a.startActivitySync(intent);
        C87412m.m108593f(startActivitySync, "mOriginalInstrumentation.startActivitySync(intent)");
        return startActivitySync;
    }

    public void startAllocCounting() {
        this.f249524a.startAllocCounting();
    }

    public void startPerformanceSnapshot() {
        this.f249524a.startPerformanceSnapshot();
    }

    public void startProfiling() {
        this.f249524a.startProfiling();
    }

    public void stopAllocCounting() {
        this.f249524a.stopAllocCounting();
    }

    public void stopProfiling() {
        this.f249524a.stopProfiling();
    }

    public void waitForIdle(Runnable runnable) {
        this.f249524a.waitForIdle(runnable);
    }

    public void waitForIdleSync() {
        this.f249524a.waitForIdleSync();
    }

    public Activity waitForMonitor(Instrumentation.ActivityMonitor activityMonitor) {
        Activity waitForMonitor = this.f249524a.waitForMonitor(activityMonitor);
        C87412m.m108593f(waitForMonitor, "mOriginalInstrumentation.waitForMonitor(monitor)");
        return waitForMonitor;
    }

    public Activity waitForMonitorWithTimeout(Instrumentation.ActivityMonitor activityMonitor, long j) {
        Activity waitForMonitorWithTimeout = this.f249524a.waitForMonitorWithTimeout(activityMonitor, j);
        C87412m.m108593f(waitForMonitorWithTimeout, "mOriginalInstrumentation…Timeout(monitor, timeOut)");
        return waitForMonitorWithTimeout;
    }

    public Instrumentation.ActivityMonitor addMonitor(IntentFilter intentFilter, Instrumentation.ActivityResult activityResult, boolean z) {
        Instrumentation.ActivityMonitor addMonitor = this.f249524a.addMonitor(intentFilter, activityResult, z);
        C87412m.m108593f(addMonitor, "mOriginalInstrumentation…or(filter, result, block)");
        return addMonitor;
    }

    public void callActivityOnCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        this.f249524a.callActivityOnCreate(activity, bundle, persistableBundle);
    }

    public void callActivityOnPostCreate(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f249524a.callActivityOnPostCreate(activity, bundle, persistableBundle);
    }

    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f249524a.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "outState");
        C87412m.m108594g(persistableBundle, "outPersistentState");
        this.f249524a.callActivityOnSaveInstanceState(activity, bundle, persistableBundle);
    }

    public UiAutomation getUiAutomation(int i) {
        UiAutomation uiAutomation = this.f249524a.getUiAutomation(i);
        C87412m.m108593f(uiAutomation, "mOriginalInstrumentation.getUiAutomation(flags)");
        return uiAutomation;
    }

    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        if (C110818d0.m150903D(this.f249525b, str)) {
            C24564k0.m30737a(this.f249525b).remove(str);
            Log.m105925i("MicroMsg.ActivityHookInstrumentation", "(%s)newActivity run after execStartActivity", str);
        } else {
            C13871e.f39036a.mo13201b(3);
            Log.m105921e("MicroMsg.ActivityHookInstrumentation", "may newActivity without execStartActivity? pending:%s classname:%s", this.f249525b.toString(), str);
        }
        Activity newActivity = this.f249524a.newActivity(classLoader, str, intent);
        C87412m.m108593f(newActivity, "mOriginalInstrumentation…ty(cl, className, intent)");
        return newActivity;
    }

    public Activity startActivitySync(Intent intent, Bundle bundle) {
        C87412m.m108594g(intent, "intent");
        Activity startActivitySync = this.f249524a.startActivitySync(intent, bundle);
        C87412m.m108593f(startActivitySync, "mOriginalInstrumentation…vitySync(intent, options)");
        return startActivitySync;
    }

    public Instrumentation.ActivityMonitor addMonitor(String str, Instrumentation.ActivityResult activityResult, boolean z) {
        Instrumentation.ActivityMonitor addMonitor = this.f249524a.addMonitor(str, activityResult, z);
        C87412m.m108593f(addMonitor, "mOriginalInstrumentation…nitor(cls, result, block)");
        return addMonitor;
    }
}
