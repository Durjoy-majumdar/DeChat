package com.tencent.p014mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.tencent.p014mm.sdk.thread.DeprecatedThreadFactory;
import junit.framework.Assert;

@Deprecated
/* renamed from: com.tencent.mm.sdk.platformtools.MMHandlerThread */
public class MMHandlerThread {
    private static final String TAG = "MicroMsg.MMHandlerThread";
    private static final int WORKER_THREAD_HIGH_PRIROITY = -8;
    private static final int WORKER_THREAD_LOWEST_PRIROITY = 19;
    private static final int WORKER_THREAD_LOW_PRIROITY = 0;
    private static MMHandler mainHandler;
    /* access modifiers changed from: private */
    public HandlerThread thread;
    private String threadName = null;
    private MMHandler workerHandler = null;

    /* renamed from: com.tencent.mm.sdk.platformtools.MMHandlerThread$ResetCallback */
    public interface ResetCallback {
        void callback();
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MMHandlerThread$IWaitWorkThread */
    public interface IWaitWorkThread {
        boolean doInBackground();

        boolean onPostExecute();
    }

    @Deprecated
    public MMHandlerThread(HandlerThread handlerThread) {
        this.thread = handlerThread;
        this.threadName = handlerThread.getName();
    }

    private static MMHandler getMainHandler() {
        if (mainHandler == null) {
            mainHandler = new MMHandler(Looper.getMainLooper());
        }
        return mainHandler;
    }

    /* access modifiers changed from: private */
    public void init(String str) {
        this.workerHandler = null;
        if (Util.isNullOrNil(str)) {
            str = "MMHandlerThread";
        }
        this.threadName = str;
        this.thread = DeprecatedThreadFactory.createHandlerThread(str);
    }

    public static boolean isMainThread() {
        return Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
    }

    public static void postToMainThread(Runnable runnable) {
        if (runnable != null) {
            getMainHandler().post(runnable);
        }
    }

    /* access modifiers changed from: private */
    public static void postToMainThreadAtFrontOfQueue(Runnable runnable) {
        if (runnable != null) {
            getMainHandler().postAtFrontOfQueue(runnable);
        }
    }

    public static void postToMainThreadDelayed(Runnable runnable, long j) {
        if (runnable != null) {
            getMainHandler().postDelayed(runnable, j);
        }
    }

    public static void removeRunnable(Runnable runnable) {
        if (runnable != null) {
            getMainHandler().removeCallbacks(runnable);
        }
    }

    public static void setCurrentPriority(int i) {
        try {
            Process.setThreadPriority(i);
            Log.m105925i(TAG, "setCurrentPriority to %d ok", Integer.valueOf(i));
        } catch (Exception e) {
            Log.m105925i(TAG, "setCurrentPriority to %d fail, %s", Integer.valueOf(i), e.getMessage());
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public String dump(boolean z, boolean z2) {
        Message runningMessage = getWorkerHandler().getRunningMessage();
        if (runningMessage == null) {
            return null;
        }
        return runningMessage.toString();
    }

    public Runnable findTaskByRunTime(boolean z, long j) {
        Message runningMessage = getWorkerHandler().getRunningMessage();
        if (runningMessage == null) {
            return null;
        }
        return runningMessage.getCallback();
    }

    public Looper getLooper() {
        return this.thread.getLooper();
    }

    public int getProcessTid() {
        HandlerThread handlerThread = this.thread;
        if (handlerThread == null) {
            return -1;
        }
        return handlerThread.getThreadId();
    }

    public MMHandler getWorkerHandler() {
        if (this.workerHandler == null) {
            this.workerHandler = new MMHandler(this.thread.getLooper());
        }
        return this.workerHandler;
    }

    public boolean inHighPriority() {
        HandlerThread handlerThread = this.thread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            Log.m105920e(TAG, "check inHighPriority failed thread is dead");
            return false;
        }
        int threadId = this.thread.getThreadId();
        try {
            return -8 == Process.getThreadPriority(threadId);
        } catch (Exception e) {
            Log.m105929w(TAG, "thread:%d  check inHighPriority failed", Integer.valueOf(threadId));
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public void interrupt() {
        this.thread.interrupt();
    }

    public boolean isThisHandlerThread() {
        return Thread.currentThread().getId() == this.thread.getId();
    }

    public int postAtFrontOfQueueToWorker(Runnable runnable) {
        if (runnable == null) {
            return -1;
        }
        getWorkerHandler().postAtFrontOfQueue(runnable);
        return 0;
    }

    public int postAtFrontOfWorker(final IWaitWorkThread iWaitWorkThread) {
        if (iWaitWorkThread == null) {
            return -1;
        }
        return new MMHandler(getLooper()).postAtFrontOfQueue(new Runnable() {
            public void run() {
                iWaitWorkThread.doInBackground();
                MMHandlerThread.postToMainThreadAtFrontOfQueue(new Runnable() {
                    public void run() {
                        iWaitWorkThread.onPostExecute();
                    }
                });
            }

            public String toString() {
                return super.toString() + "|" + iWaitWorkThread.toString();
            }
        }) ? 0 : -2;
    }

    public int postToWorker(Runnable runnable) {
        if (runnable == null) {
            return -1;
        }
        getWorkerHandler().post(runnable);
        return 0;
    }

    public int postToWorkerDelayed(Runnable runnable, long j) {
        if (runnable == null) {
            return -1;
        }
        getWorkerHandler().postDelayed(runnable, j);
        return 0;
    }

    public boolean quit() {
        return this.thread.quit();
    }

    public boolean quitSafely() {
        return this.thread.quitSafely();
    }

    public int reset(final IWaitWorkThread iWaitWorkThread) {
        Log.m105925i(TAG, "reset stack:%s", Util.getStack());
        final String str = this.threadName;
        return postAtFrontOfWorker(new IWaitWorkThread() {
            public boolean doInBackground() {
                IWaitWorkThread iWaitWorkThread = iWaitWorkThread;
                if (iWaitWorkThread != null) {
                    return iWaitWorkThread.doInBackground();
                }
                MMHandlerThread.this.thread.quit();
                MMHandlerThread.this.init(str);
                return true;
            }

            public boolean onPostExecute() {
                IWaitWorkThread iWaitWorkThread = iWaitWorkThread;
                if (iWaitWorkThread != null) {
                    return iWaitWorkThread.onPostExecute();
                }
                return true;
            }
        });
    }

    public void setHighPriority() {
        HandlerThread handlerThread = this.thread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            Log.m105920e(TAG, "setHighPriority failed thread is dead");
            return;
        }
        int threadId = this.thread.getThreadId();
        try {
            if (-8 == Process.getThreadPriority(threadId)) {
                Log.m105928w(TAG, "setHighPriority No Need.");
                return;
            }
            Process.setThreadPriority(threadId, -8);
            Log.m105925i(TAG, "thread:%d setHighPriority to %d", Integer.valueOf(threadId), Integer.valueOf(Process.getThreadPriority(threadId)));
        } catch (Exception e) {
            Log.m105929w(TAG, "thread:%d setHighPriority failed", Integer.valueOf(threadId));
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public void setLowPriority() {
        HandlerThread handlerThread = this.thread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            Log.m105920e(TAG, "setLowPriority failed thread is dead");
            return;
        }
        int threadId = this.thread.getThreadId();
        try {
            if (Process.getThreadPriority(threadId) == 0) {
                Log.m105928w(TAG, "setLowPriority No Need.");
                return;
            }
            Process.setThreadPriority(threadId, 0);
            Log.m105925i(TAG, "thread:%d setLowPriority to %d", Integer.valueOf(threadId), Integer.valueOf(Process.getThreadPriority(threadId)));
        } catch (Exception e) {
            Log.m105929w(TAG, "thread:%d setLowPriority failed", Integer.valueOf(threadId));
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public void setLowestPriority() {
        HandlerThread handlerThread = this.thread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            Log.m105920e(TAG, "setLowestPriority failed thread is dead");
            return;
        }
        int threadId = this.thread.getThreadId();
        try {
            if (19 == Process.getThreadPriority(threadId)) {
                Log.m105928w(TAG, "setLowestPriority No Need.");
                return;
            }
            Process.setThreadPriority(threadId, 19);
            Log.m105925i(TAG, "thread:%d setLowestPriority to %d", Integer.valueOf(threadId), Integer.valueOf(Process.getThreadPriority(threadId)));
        } catch (Exception e) {
            Log.m105929w(TAG, "thread:%d setLowestPriority failed", Integer.valueOf(threadId));
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public int syncReset(final ResetCallback resetCallback) {
        int postAtFrontOfWorker;
        Log.m105925i(TAG, "syncReset tid[%d] stack:%s", Long.valueOf(Thread.currentThread().getId()), Util.getStack());
        Assert.assertTrue("syncReset should in mainThread", isMainThread());
        long id = this.thread.getId();
        final byte[] bArr = new byte[0];
        final String str = this.threadName;
        C1159712 r7 = new IWaitWorkThread() {
            public boolean doInBackground() {
                Log.m105925i(MMHandlerThread.TAG, "syncReset doInBackground tid[%d]", Long.valueOf(Thread.currentThread().getId()));
                ResetCallback resetCallback = resetCallback;
                if (resetCallback != null) {
                    resetCallback.callback();
                }
                Log.m105925i(MMHandlerThread.TAG, "syncReset doInBackground callback done tid[%d]", Long.valueOf(Thread.currentThread().getId()));
                MMHandlerThread.this.thread.quit();
                Log.m105925i(MMHandlerThread.TAG, "syncReset init start old tid[%d]", Long.valueOf(MMHandlerThread.this.thread.getId()));
                MMHandlerThread.this.init(str);
                Log.m105925i(MMHandlerThread.TAG, "syncReset init done new tid[%d]", Long.valueOf(MMHandlerThread.this.thread.getId()));
                synchronized (bArr) {
                    Log.m105925i(MMHandlerThread.TAG, "syncReset notify tid[%d]", Long.valueOf(Thread.currentThread().getId()));
                    bArr.notifyAll();
                }
                return true;
            }

            public boolean onPostExecute() {
                Log.m105924i(MMHandlerThread.TAG, "syncReset onPostExecute");
                return true;
            }
        };
        synchronized (bArr) {
            postAtFrontOfWorker = postAtFrontOfWorker(r7);
            long id4 = this.thread.getId();
            Log.m105925i(TAG, "syncReset postAtFrontOfWorker ret[%d], oldTid[%d], curTid[%d]", Integer.valueOf(postAtFrontOfWorker), Long.valueOf(id), Long.valueOf(id4));
            if (postAtFrontOfWorker == 0 && id == id4) {
                try {
                    bArr.wait();
                } catch (Exception e) {
                    Log.m105919d(TAG, "syncReset lock wait end with exception[%s]", e.getMessage());
                }
            }
        }
        return postAtFrontOfWorker;
    }
}
