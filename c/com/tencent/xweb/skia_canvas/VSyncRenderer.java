package com.tencent.xweb.skia_canvas;

import android.os.SystemClock;
import com.tencent.xweb.skia_canvas.VSyncWaiter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class VSyncRenderer implements VSyncWaiter.VSyncWaiterCallback {
    private static ThreadLocal<VSyncRenderer> sRendererList = new ThreadLocal<>();
    /* access modifiers changed from: private */
    public final Map<Long, AnimationCallback> mAnimationCallbackIdMap = new HashMap();
    private long mAnimationCallbackUniqueId;
    /* access modifiers changed from: private */
    public final List<PresentCallback> mPresentCallbackList = new LinkedList();
    /* access modifiers changed from: private */
    public final long mStartFrameTimeNanos = SystemClock.elapsedRealtimeNanos();
    private final IXWebWorkingHandler mThreadHandler;
    /* access modifiers changed from: private */
    public boolean mWaitingForNextVSync;

    public interface AnimationCallback {
        void doAnimation(long j);
    }

    public interface PresentCallback {
        void doPresent();
    }

    public VSyncRenderer(IXWebWorkingHandler iXWebWorkingHandler) {
        this.mThreadHandler = iXWebWorkingHandler;
    }

    private void checkAndPost(Runnable runnable) {
        if (this.mThreadHandler.isRunOnWorkingThread()) {
            runnable.run();
        } else {
            this.mThreadHandler.post(runnable);
        }
    }

    private long generateAnimationCallbackUniqueId() {
        long j = this.mAnimationCallbackUniqueId;
        this.mAnimationCallbackUniqueId = 1 + j;
        return j;
    }

    public static VSyncRenderer getInstance() {
        return sRendererList.get();
    }

    public static void initRenderer(IXWebWorkingHandler iXWebWorkingHandler) {
        if (sRendererList.get() == null) {
            sRendererList.set(new VSyncRenderer(iXWebWorkingHandler));
        }
    }

    private void schedulerNextVSync() {
        this.mWaitingForNextVSync = true;
        VSyncWaiter.getInstance().asyncWaitForVSync(this);
    }

    public long addAnimationCallback(AnimationCallback animationCallback) {
        long generateAnimationCallbackUniqueId = generateAnimationCallbackUniqueId();
        this.mAnimationCallbackIdMap.put(Long.valueOf(generateAnimationCallbackUniqueId), animationCallback);
        triggerNextVSync();
        return generateAnimationCallbackUniqueId;
    }

    public void addPresentCallback(PresentCallback presentCallback) {
        this.mPresentCallbackList.add(presentCallback);
        triggerNextVSync();
    }

    public void doFrame(long j) {
        checkAndPost(new Runnable() {
            public void run() {
                boolean unused = VSyncRenderer.this.mWaitingForNextVSync = false;
                for (PresentCallback doPresent : VSyncRenderer.this.mPresentCallbackList) {
                    doPresent.doPresent();
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - VSyncRenderer.this.mStartFrameTimeNanos;
                ArrayList arrayList = new ArrayList(VSyncRenderer.this.mAnimationCallbackIdMap.values());
                VSyncRenderer.this.mAnimationCallbackIdMap.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnimationCallback) it.next()).doAnimation(elapsedRealtimeNanos);
                }
            }
        });
    }

    public void removeAnimationCallback(long j) {
        this.mAnimationCallbackIdMap.remove(Long.valueOf(j));
    }

    public void removePresentCallback(PresentCallback presentCallback) {
        this.mPresentCallbackList.remove(presentCallback);
    }

    public void triggerNextVSync() {
        if (!this.mWaitingForNextVSync) {
            schedulerNextVSync();
        }
    }
}
