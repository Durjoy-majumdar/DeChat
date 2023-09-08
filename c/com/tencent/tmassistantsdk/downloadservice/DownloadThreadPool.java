package com.tencent.tmassistantsdk.downloadservice;

import android.os.PowerManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.util.TMLog;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class DownloadThreadPool {
    public static final String TAG = "DownloadThreadPool";
    public static DownloadThreadPool mDownloadThreadPool;
    public final ArrayList<TaskThread> mDownloadThreadList = new ArrayList<>();
    public final ArrayList<DownloadTask> mExecList = new ArrayList<>();
    public final Comparator<DownloadTask> mPriorityQueueComparator;
    public final Object mTaskLock = new Object();
    public final Object mThreadlock = new Object();
    public final PriorityQueue<DownloadTask> mWaitingList;

    public class TaskThread extends Thread {
        private byte _hellAccFlag_;
        private int mIndex;

        public TaskThread(int i) {
            this.mIndex = i;
            setName("download_thread_" + this.mIndex);
            start();
        }

        public void run() {
            TMLog.m164114i(DownloadThreadPool.TAG, "Thread " + this.mIndex + " starts running...");
            while (true) {
                synchronized (DownloadThreadPool.this.mThreadlock) {
                    try {
                        TMLog.m164114i(DownloadThreadPool.TAG, "Thread " + this.mIndex + " is waitting...");
                        DownloadThreadPool.this.mThreadlock.wait();
                    } catch (InterruptedException e) {
                        TMLog.m164114i(DownloadThreadPool.TAG, "Thread " + this.mIndex + " is interrupted...");
                        Log.printErrStackTrace(DownloadThreadPool.TAG, e, "", new Object[0]);
                        return;
                    }
                }
                if (Thread.currentThread().isInterrupted()) {
                    TMLog.m164114i(DownloadThreadPool.TAG, "Thread " + this.mIndex + " is interrupted...");
                    return;
                }
                while (true) {
                    if (DownloadThreadPool.this.hasWaitingTask()) {
                        DownloadTask downloadTask = null;
                        synchronized (DownloadThreadPool.this.mTaskLock) {
                            if (DownloadThreadPool.this.mWaitingList.size() > 0) {
                                downloadTask = DownloadThreadPool.this.mWaitingList.remove();
                                DownloadThreadPool.this.mExecList.add(downloadTask);
                            }
                        }
                        if (Thread.currentThread().isInterrupted()) {
                            TMLog.m164114i(DownloadThreadPool.TAG, "Thread " + this.mIndex + " is interrupted...");
                            return;
                        }
                        if (downloadTask != null) {
                            TMLog.m164114i(DownloadThreadPool.TAG, "TaskThread::Run ThreadName: " + getName() + " url: " + downloadTask.getDownloadURI());
                            PowerManager.WakeLock wakeLock = DownloadHelper.getWakeLock();
                            downloadTask.exec(getName());
                            if (wakeLock != null) {
                                PowerManager.WakeLock wakeLock2 = wakeLock;
                                C117292a.m165357c(wakeLock2, "com/tencent/tmassistantsdk/downloadservice/DownloadThreadPool$TaskThread", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                                wakeLock.release();
                                C117292a.m165359e(wakeLock2, "com/tencent/tmassistantsdk/downloadservice/DownloadThreadPool$TaskThread", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                            }
                        }
                        synchronized (DownloadThreadPool.this.mTaskLock) {
                            if (downloadTask != null) {
                                DownloadThreadPool.this.mExecList.remove(downloadTask);
                            }
                        }
                    }
                }
            }
            while (true) {
            }
        }
    }

    private DownloadThreadPool() {
        C1164221 r0 = new Comparator<DownloadTask>() {
            public int compare(DownloadTask downloadTask, DownloadTask downloadTask2) {
                if (downloadTask.getPriority() > downloadTask2.getPriority()) {
                    return 1;
                }
                return downloadTask.getPriority() == downloadTask2.getPriority() ? 0 : -1;
            }
        };
        this.mPriorityQueueComparator = r0;
        this.mWaitingList = new PriorityQueue<>(16, r0);
        int maxTaskNum = DownloadSetting.getInstance().getMaxTaskNum();
        for (int i = 0; i < maxTaskNum; i++) {
            this.mDownloadThreadList.add(new TaskThread(i));
        }
    }

    public static DownloadThreadPool getInstance() {
        if (mDownloadThreadPool == null) {
            mDownloadThreadPool = new DownloadThreadPool();
        }
        return mDownloadThreadPool;
    }

    public int addDownloadTask(DownloadTask downloadTask) {
        int taskId;
        synchronized (this.mTaskLock) {
            this.mWaitingList.add(downloadTask);
            synchronized (this.mThreadlock) {
                this.mThreadlock.notifyAll();
            }
            taskId = downloadTask.getTaskId();
        }
        return taskId;
    }

    public void cancelDownloadTask(final int i) {
        new Thread(new Runnable() {
            public void run() {
                synchronized (DownloadThreadPool.this.mTaskLock) {
                    Iterator<DownloadTask> it = DownloadThreadPool.this.mExecList.iterator();
                    while (it.hasNext()) {
                        DownloadTask next = it.next();
                        if (next.getTaskId() == i) {
                            next.cancel();
                            DownloadThreadPool.this.mExecList.remove(next);
                            return;
                        }
                    }
                    Iterator<DownloadTask> it4 = DownloadThreadPool.this.mWaitingList.iterator();
                    while (it4.hasNext()) {
                        DownloadTask next2 = it4.next();
                        if (next2.getTaskId() == i) {
                            next2.cancel();
                            DownloadThreadPool.this.mWaitingList.remove(next2);
                            return;
                        }
                    }
                }
            }
        }).start();
    }

    public DownloadTask getDownloadTask(String str) {
        synchronized (this.mTaskLock) {
            Iterator<DownloadTask> it = this.mExecList.iterator();
            while (it.hasNext()) {
                DownloadTask next = it.next();
                if (next.getDownloadURI().equals(str)) {
                    return next;
                }
            }
            Iterator<DownloadTask> it4 = this.mWaitingList.iterator();
            while (it4.hasNext()) {
                DownloadTask next2 = it4.next();
                if (next2.getDownloadURI().equals(str)) {
                    return next2;
                }
            }
            return null;
        }
    }

    public boolean hasWaitingTask() {
        boolean z;
        synchronized (this.mTaskLock) {
            z = this.mWaitingList.size() > 0;
        }
        return z;
    }
}
