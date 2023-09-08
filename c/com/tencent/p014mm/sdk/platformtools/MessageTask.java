package com.tencent.p014mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.tencent.tav.coremedia.TimeUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tencent.mm.sdk.platformtools.MessageTask */
public class MessageTask implements Runnable {
    private static final String CONSICE_FORMAT = "taskName = %s | addTime = %s | endTime = %s | usedTime = %d | cpuTime = %d | threadCpuTime = %d | totalCpuTime = %d | threadCpuRate = %.1f";
    private static final String TAG = "MicroMsg.MessageTask";
    private static final String VERBOSE_FORMAT = "taskName = %s|token = %s|handler = %s|threadName = %s|threadId = %d|priority = %d|addTime = %d|delayTime = %d|usedTime = %d|cpuTime = %d|started = %b";
    public long addTime;
    public final MessageTaskCallback callback;
    public long cpuTime;
    public long delayTime;
    public long endTime;
    public final Handler handler;
    public int priority;
    public boolean started = false;
    public final Runnable task;
    public final String taskName;
    public final Thread thread;
    public float threadCpuRate = -1.0f;
    public long threadCpuTime;
    public long threadId;
    public String threadName;
    public final Object token;
    public long totalCpuTime;
    public long usedTime;
    public long waitTime;

    /* renamed from: com.tencent.mm.sdk.platformtools.MessageTask$MessageTaskCallback */
    public interface MessageTaskCallback {
        void onLog(Message message, Runnable runnable, Thread thread, long j, long j2, float f);

        void onRunEnd(Runnable runnable, MessageTask messageTask);
    }

    public MessageTask(Thread thread2, Handler handler2, Runnable runnable, Object obj, MessageTaskCallback messageTaskCallback) {
        int indexOf;
        this.thread = thread2;
        if (thread2 != null) {
            this.threadName = thread2.getName();
            this.threadId = thread2.getId();
            this.priority = thread2.getPriority();
        }
        this.handler = handler2;
        this.task = runnable;
        String name = runnable.getClass().getName();
        String obj2 = runnable.toString();
        if (!Util.isNullOrNil(obj2) && (indexOf = obj2.indexOf(124)) > 0) {
            name = name + "_" + obj2.substring(indexOf + 1);
        }
        this.taskName = name;
        this.token = obj;
        this.callback = messageTaskCallback;
        this.addTime = System.currentTimeMillis();
    }

    private static long getThreadCpuTime(String str) {
        return -1;
    }

    private static long getTotalCpuTime() {
        return -1;
    }

    public String dump(boolean z) {
        if (z) {
            return String.format(VERBOSE_FORMAT, new Object[]{this.taskName, this.token, this.handler, this.threadName, Long.valueOf(this.threadId), Integer.valueOf(this.priority), Long.valueOf(this.addTime), Long.valueOf(this.delayTime), Long.valueOf(this.usedTime), Long.valueOf(this.cpuTime), Boolean.valueOf(this.started)});
        }
        return String.format(CONSICE_FORMAT, new Object[]{this.taskName, new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.addTime)), new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(this.endTime)), Long.valueOf(this.usedTime), Long.valueOf(this.cpuTime), Long.valueOf(this.threadCpuTime), Long.valueOf(this.totalCpuTime), Float.valueOf(this.threadCpuRate)});
    }

    public void run() {
        String str = "/proc/self/task/" + Process.myTid() + "/stat";
        this.usedTime = System.currentTimeMillis();
        this.cpuTime = Debug.threadCpuTimeNanos();
        this.waitTime = (this.usedTime - this.addTime) - this.delayTime;
        this.threadCpuTime = getThreadCpuTime(str);
        this.totalCpuTime = getTotalCpuTime();
        this.started = true;
        this.task.run();
        this.threadCpuTime = getThreadCpuTime(str) - this.threadCpuTime;
        this.totalCpuTime = getTotalCpuTime() - this.totalCpuTime;
        long currentTimeMillis = System.currentTimeMillis();
        this.endTime = currentTimeMillis;
        this.usedTime = currentTimeMillis - this.usedTime;
        this.cpuTime = (Debug.threadCpuTimeNanos() - this.cpuTime) / TimeUtil.SECOND_TO_US;
        long j = this.totalCpuTime;
        if (j != 0) {
            this.threadCpuRate = ((float) (this.threadCpuTime * 100)) / ((float) j);
        }
        MessageTaskCallback messageTaskCallback = this.callback;
        if (messageTaskCallback != null) {
            messageTaskCallback.onRunEnd(this.task, this);
            this.callback.onLog((Message) null, this, Thread.currentThread(), this.usedTime, this.cpuTime, this.threadCpuRate);
        }
    }

    public String toString() {
        return this.taskName + ", " + this.task;
    }
}
