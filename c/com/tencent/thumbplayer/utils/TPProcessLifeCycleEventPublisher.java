package com.tencent.thumbplayer.utils;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class TPProcessLifeCycleEventPublisher implements C0124r {
    public static final int EVENT_PROCESS_LIFE_CYCLE_CREATE = 0;
    public static final int EVENT_PROCESS_LIFE_CYCLE_DESTROY = 5;
    public static final int EVENT_PROCESS_LIFE_CYCLE_PAUSE = 2;
    public static final int EVENT_PROCESS_LIFE_CYCLE_RESUME = 3;
    public static final int EVENT_PROCESS_LIFE_CYCLE_START = 1;
    public static final int EVENT_PROCESS_LIFE_CYCLE_STOP = 4;
    public static final int EVENT_PROCESS_ON_BACKGROUND = 2;
    public static final int EVENT_PROCESS_ON_FOREGROUND = 3;
    private static final int STATE_INITED = 2;
    private static final int STATE_INITING = 1;
    private static final int STATE_UNINITED = 0;
    private static final int STATE_UNINITING = 3;
    private static final String TAG = "TPProcessLifeCycleEventPublisher";
    private static CopyOnWriteArraySet<ITPOnProcessLifeCycleChangeListener> mListeners = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */
    public static TPProcessLifeCycleEventPublisher mObserver = new TPProcessLifeCycleEventPublisher();
    /* access modifiers changed from: private */
    public static int mState = 0;

    public interface ITPOnProcessLifeCycleChangeListener {
        void onEvent(int i);
    }

    @Target({ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TPProcessLiftCycleEventId {
    }

    private TPProcessLifeCycleEventPublisher() {
    }

    public static void addEventListener(ITPOnProcessLifeCycleChangeListener iTPOnProcessLifeCycleChangeListener) {
        if (mListeners.add(iTPOnProcessLifeCycleChangeListener)) {
            TPLogUtil.m21897i(TAG, "add ProcessLifeCycleChangeListener: " + iTPOnProcessLifeCycleChangeListener);
        }
    }

    public static void clearEventListener() {
        mListeners.clear();
        TPLogUtil.m21897i(TAG, "clear ProcessLifeCycleChangeListeners");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void init() {
        /*
            java.lang.Class<com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher> r0 = com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.class
            monitor-enter(r0)
            int r1 = mState     // Catch:{ all -> 0x0061 }
            r2 = 2
            if (r1 == r2) goto L_0x0047
            r3 = 1
            if (r1 != r3) goto L_0x000c
            goto L_0x0047
        L_0x000c:
            r4 = 3
            if (r1 != r4) goto L_0x001a
            java.lang.String r1 = "TPProcessLifeCycleEventPublisher"
            java.lang.String r3 = "current state is UNINITING, no need to init, just change state to INITED"
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r3)     // Catch:{ all -> 0x0061 }
            mState = r2     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)
            return
        L_0x001a:
            mState = r3     // Catch:{ all -> 0x0061 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0061 }
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0061 }
            if (r1 != r3) goto L_0x0039
            androidx.lifecycle.c0 r1 = androidx.lifecycle.C112975c0.f338196o     // Catch:{ all -> 0x0061 }
            androidx.lifecycle.u r1 = r1.f338202i     // Catch:{ all -> 0x0061 }
            com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher r3 = mObserver     // Catch:{ all -> 0x0061 }
            r1.addObserver(r3)     // Catch:{ all -> 0x0061 }
            mState = r2     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "TPProcessLifeCycleEventPublisher"
            java.lang.String r2 = "init successfully"
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r2)     // Catch:{ all -> 0x0061 }
            goto L_0x0045
        L_0x0039:
            com.tencent.thumbplayer.utils.TPThreadPool r1 = com.tencent.thumbplayer.utils.TPThreadPool.getInstance()     // Catch:{ all -> 0x0061 }
            com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher$1 r2 = new com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher$1     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            r1.postRunnableOnMainThread(r2)     // Catch:{ all -> 0x0061 }
        L_0x0045:
            monitor-exit(r0)
            return
        L_0x0047:
            java.lang.String r1 = "TPProcessLifeCycleEventPublisher"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "no need to init, current state:"
            r2.append(r3)     // Catch:{ all -> 0x0061 }
            int r3 = mState     // Catch:{ all -> 0x0061 }
            r2.append(r3)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0061 }
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r2)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)
            return
        L_0x0061:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.init():void");
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    private void onCreate() {
        TPLogUtil.m21897i(TAG, "onCreate");
        postEventToAllListeners(0);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    private void onDestroy() {
        TPLogUtil.m21897i(TAG, "onDestroy");
        postEventToAllListeners(5);
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    private void onPause() {
        TPLogUtil.m21897i(TAG, "onPause");
        postEventToAllListeners(2);
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    private void onResume() {
        TPLogUtil.m21897i(TAG, "onResume");
        postEventToAllListeners(3);
    }

    @C112974b0(C39623j.C39625b.ON_START)
    private void onStart() {
        TPLogUtil.m21897i(TAG, "onStart");
        postEventToAllListeners(1);
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    private void onStop() {
        TPLogUtil.m21897i(TAG, "onStop");
        postEventToAllListeners(4);
    }

    private void postEventToAllListeners(int i) {
        Iterator<ITPOnProcessLifeCycleChangeListener> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent(i);
        }
    }

    public static void removeEventListener(ITPOnProcessLifeCycleChangeListener iTPOnProcessLifeCycleChangeListener) {
        if (mListeners.remove(iTPOnProcessLifeCycleChangeListener)) {
            TPLogUtil.m21897i(TAG, "remove ProcessLifeCycleChangeListener: " + iTPOnProcessLifeCycleChangeListener);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void uninit() {
        /*
            java.lang.Class<com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher> r0 = com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.class
            monitor-enter(r0)
            int r1 = mState     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0047
            r2 = 3
            if (r1 != r2) goto L_0x000b
            goto L_0x0047
        L_0x000b:
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x001a
            java.lang.String r1 = "TPProcessLifeCycleEventPublisher"
            java.lang.String r2 = "current state is initing, no need to uninit, just change state to uninited"
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r2)     // Catch:{ all -> 0x0061 }
            mState = r4     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)
            return
        L_0x001a:
            mState = r2     // Catch:{ all -> 0x0061 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0061 }
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0061 }
            if (r1 != r2) goto L_0x0039
            androidx.lifecycle.c0 r1 = androidx.lifecycle.C112975c0.f338196o     // Catch:{ all -> 0x0061 }
            androidx.lifecycle.u r1 = r1.f338202i     // Catch:{ all -> 0x0061 }
            com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher r2 = mObserver     // Catch:{ all -> 0x0061 }
            r1.removeObserver(r2)     // Catch:{ all -> 0x0061 }
            mState = r4     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "TPProcessLifeCycleEventPublisher"
            java.lang.String r2 = "uninit successfully"
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r2)     // Catch:{ all -> 0x0061 }
            goto L_0x0045
        L_0x0039:
            com.tencent.thumbplayer.utils.TPThreadPool r1 = com.tencent.thumbplayer.utils.TPThreadPool.getInstance()     // Catch:{ all -> 0x0061 }
            com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher$2 r2 = new com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher$2     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            r1.postRunnableOnMainThread(r2)     // Catch:{ all -> 0x0061 }
        L_0x0045:
            monitor-exit(r0)
            return
        L_0x0047:
            java.lang.String r1 = "TPProcessLifeCycleEventPublisher"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "no need to uninit, current state:"
            r2.append(r3)     // Catch:{ all -> 0x0061 }
            int r3 = mState     // Catch:{ all -> 0x0061 }
            r2.append(r3)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0061 }
            com.tencent.thumbplayer.utils.TPLogUtil.m21897i(r1, r2)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)
            return
        L_0x0061:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.uninit():void");
    }
}
