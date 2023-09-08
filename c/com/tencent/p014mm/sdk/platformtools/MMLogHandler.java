package com.tencent.p014mm.sdk.platformtools;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MessageTask;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.sdk.platformtools.MMLogHandler */
public class MMLogHandler extends Handler implements MessageTask.MessageTaskCallback {
    private static final String TAG = "MicroMsg.MMLogHandler";
    private MMHandler.Callback callback;
    public MessageTaskListener listener;
    private Looper looper = getLooper();
    private String toStringResult = null;

    /* renamed from: com.tencent.mm.sdk.platformtools.MMLogHandler$MessageTaskListener */
    public interface MessageTaskListener {
        void handleMessage(Message message);

        void onLog(Message message, Runnable runnable, Thread thread, long j, long j2, float f);

        void onTaskAdded(Runnable runnable, MessageTask messageTask);

        void onTaskRunEnd(Runnable runnable, MessageTask messageTask);
    }

    public MMLogHandler(MessageTaskListener messageTaskListener) {
        this.listener = messageTaskListener;
    }

    public void dispatchMessage(Message message) {
        if (message.getCallback() == null && this.callback == null) {
            long currentTimeMillis = System.currentTimeMillis();
            long threadCpuTimeNanos = Debug.threadCpuTimeNanos();
            handleMessage(message);
            MessageTaskListener messageTaskListener = this.listener;
            if (messageTaskListener != null) {
                messageTaskListener.onLog(message, (Runnable) null, this.looper.getThread(), System.currentTimeMillis() - currentTimeMillis, Debug.threadCpuTimeNanos() - threadCpuTimeNanos, -1.0f);
                return;
            }
            return;
        }
        super.dispatchMessage(message);
    }

    public void handleMessage(Message message) {
        MessageTaskListener messageTaskListener = this.listener;
        if (messageTaskListener != null) {
            messageTaskListener.handleMessage(message);
        }
    }

    public void onLog(Message message, Runnable runnable, Thread thread, long j, long j2, float f) {
        MessageTaskListener messageTaskListener = this.listener;
        if (messageTaskListener != null) {
            messageTaskListener.onLog(message, runnable, thread, j, j2, f);
        }
    }

    public void onRunEnd(Runnable runnable, MessageTask messageTask) {
        MessageTaskListener messageTaskListener = this.listener;
        if (messageTaskListener != null) {
            messageTaskListener.onTaskRunEnd(runnable, messageTask);
        }
    }

    public boolean sendMessageAtTime(Message message, long j) {
        MessageTaskListener messageTaskListener;
        Assert.assertTrue("msg is null", message != null);
        Runnable callback2 = message.getCallback();
        long uptimeMillis = j - SystemClock.uptimeMillis();
        if (callback2 == null) {
            return super.sendMessageAtTime(message, j);
        }
        MessageTask messageTask = new MessageTask(this.looper.getThread(), message.getTarget() == null ? this : message.getTarget(), callback2, message.obj, this);
        if (uptimeMillis > 0) {
            messageTask.delayTime = uptimeMillis;
        }
        Message obtain = Message.obtain(message.getTarget(), messageTask);
        obtain.what = message.what;
        obtain.arg1 = message.arg1;
        obtain.arg2 = message.arg2;
        obtain.obj = message.obj;
        obtain.replyTo = message.replyTo;
        obtain.setData(message.getData());
        message.recycle();
        if (getLooper() == null || getLooper().getThread().isAlive()) {
            MessageTaskListener messageTaskListener2 = this.listener;
            if (messageTaskListener2 != null) {
                messageTaskListener2.onTaskAdded(callback2, messageTask);
            }
            boolean sendMessageAtTime = super.sendMessageAtTime(obtain, j);
            if (!sendMessageAtTime && (messageTaskListener = this.listener) != null) {
                messageTaskListener.onTaskRunEnd(callback2, messageTask);
            }
            return sendMessageAtTime;
        }
        Log.m105929w(TAG, "sendMessageAtTime but thread[%d, %s] is dead so return false!", Long.valueOf(getLooper().getThread().getId()), getLooper().getThread().getName());
        return false;
    }

    public String toString() {
        if (this.toStringResult == null) {
            this.toStringResult = "MMLogHandler{listener = " + this.listener + "}";
        }
        return this.toStringResult;
    }

    public MMLogHandler(Looper looper2, MessageTaskListener messageTaskListener) {
        super(looper2);
        this.listener = messageTaskListener;
    }

    public MMLogHandler(MMHandler.Callback callback2, MessageTaskListener messageTaskListener) {
        super(callback2);
        this.callback = callback2;
        this.listener = messageTaskListener;
    }

    public MMLogHandler(Looper looper2, MMHandler.Callback callback2, MessageTaskListener messageTaskListener) {
        super(looper2, callback2);
        this.callback = callback2;
        this.listener = messageTaskListener;
    }
}
