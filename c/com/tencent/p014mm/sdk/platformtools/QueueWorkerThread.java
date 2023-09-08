package com.tencent.p014mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.sdk.platformtools.QueueWorkerThread */
public class QueueWorkerThread {
    private static final long DEF_WAIT_OFFER = 1;
    private static final int MAX_WAIT_COUNT = 60;
    private static final String TAG = "QueueWorkerThread.QueueWorkerThread";
    private static final int WAIT_MILL_TIME = 2000;
    /* access modifiers changed from: private */
    public Object lock;
    /* access modifiers changed from: private */
    public String name;
    /* access modifiers changed from: private */
    public MMHandler onPostExc;
    /* access modifiers changed from: private */
    public boolean pause;
    /* access modifiers changed from: private */
    public int priority;
    /* access modifiers changed from: private */
    public LinkedBlockingQueue<ThreadObject> queueToReq;
    private int threadCount;
    /* access modifiers changed from: private */
    public Vector<WorkerThread> vectorThread;

    /* renamed from: com.tencent.mm.sdk.platformtools.QueueWorkerThread$ThreadObject */
    public interface ThreadObject {
        boolean doInBackground();

        boolean onPostExecute();
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.QueueWorkerThread$WorkerThread */
    public final class WorkerThread extends Thread {
        private int waitTimes;

        public void run() {
            ThreadObject threadObject;
            while (this.waitTimes > 0) {
                synchronized (QueueWorkerThread.this.lock) {
                    try {
                        if (QueueWorkerThread.this.pause) {
                            QueueWorkerThread.this.lock.wait();
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace(QueueWorkerThread.TAG, e, "", new Object[0]);
                    }
                }
                try {
                    threadObject = (ThreadObject) QueueWorkerThread.this.queueToReq.poll(2000, TimeUnit.MILLISECONDS);
                } catch (Exception e2) {
                    Log.printErrStackTrace(QueueWorkerThread.TAG, e2, "", new Object[0]);
                    threadObject = null;
                }
                if (threadObject == null) {
                    this.waitTimes--;
                } else {
                    this.waitTimes = 60;
                    if (threadObject.doInBackground()) {
                        QueueWorkerThread.this.onPostExc.sendMessage(QueueWorkerThread.this.onPostExc.obtainMessage(0, threadObject));
                    }
                }
            }
            QueueWorkerThread.this.vectorThread.remove(this);
            Log.m105918d(QueueWorkerThread.TAG, "dktest Finish queueToReqSize:" + QueueWorkerThread.this.queueToReq.size() + " ThreadSize:" + QueueWorkerThread.this.vectorThread.size());
        }

        private WorkerThread() {
            super(QueueWorkerThread.this.name);
            this.waitTimes = 60;
            setPriority(QueueWorkerThread.this.priority);
            QueueWorkerThread.this.vectorThread.add(this);
        }
    }

    public QueueWorkerThread(int i, String str) {
        this(i, str, 1);
    }

    public int add(ThreadObject threadObject) {
        if (threadObject == null) {
            Log.m105920e(TAG, "add empty thread object");
            return -1;
        }
        try {
            if (!this.queueToReq.offer(threadObject, 1, TimeUnit.MILLISECONDS)) {
                Log.m105920e(TAG, "add To Queue failed");
                return -2;
            }
            if (this.vectorThread.size() == 0 || (this.queueToReq.size() > 0 && this.threadCount > this.vectorThread.size())) {
                new WorkerThread().start();
            }
            return 0;
        } catch (Exception e) {
            Log.m105920e(TAG, "add To Queue failed :" + e.getMessage());
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return -3;
        }
    }

    public void clear() {
        this.queueToReq.clear();
    }

    public int getQueueSize() {
        return this.queueToReq.size();
    }

    @Deprecated
    public boolean isDead() {
        Vector<WorkerThread> vector = this.vectorThread;
        return vector == null || vector.size() == 0;
    }

    public void pause(boolean z) {
        synchronized (this.lock) {
            this.pause = z;
            if (!z) {
                synchronized (this.lock) {
                    this.lock.notifyAll();
                }
            }
        }
    }

    public QueueWorkerThread(int i, String str, int i2) {
        this(i, str, i2, Looper.myLooper());
    }

    public QueueWorkerThread(int i, String str, int i2, Looper looper) {
        this.queueToReq = new LinkedBlockingQueue<>();
        this.pause = false;
        this.threadCount = 1;
        this.priority = 1;
        this.name = "";
        this.lock = new byte[0];
        this.vectorThread = new Vector<>();
        this.threadCount = i2;
        this.name = str;
        this.priority = i;
        if (looper == null && Looper.getMainLooper() != null) {
            looper = Looper.getMainLooper();
            Log.m105924i(TAG, "looper is null use MainLooper!");
        }
        this.onPostExc = new MMHandler(looper) {
            public void handleMessage(Message message) {
                Object obj;
                if (message != null && (obj = message.obj) != null) {
                    ((ThreadObject) obj).onPostExecute();
                }
            }
        };
    }
}
