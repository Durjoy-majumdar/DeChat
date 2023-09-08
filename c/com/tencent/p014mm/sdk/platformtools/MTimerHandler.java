package com.tencent.p014mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;
import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.platformtools.MTimerHandler */
public class MTimerHandler extends MMHandler {
    private static final int MAX_TIMERID = 8192;
    private static final String TAG = "MicroMsg.MTimerHandler";
    private static int timerID;
    private CallBack mCallBack;
    private final boolean mLoop;
    private long mLoopInterval = 0;
    private boolean mStop = false;
    private final int myTimerID;

    /* renamed from: com.tencent.mm.sdk.platformtools.MTimerHandler$CallBack */
    public interface CallBack {
        boolean onTimerExpired();
    }

    public MTimerHandler(CallBack callBack, boolean z) {
        this.mCallBack = callBack;
        this.myTimerID = incTimerID();
        this.mLoop = z;
        if (Thread.currentThread().getName().equals("initThread") || "initThread".equals(C109639a.m148954e())) {
            Log.m105921e(TAG, "MTimerHandler can not init handler with initThread, stack %s", Util.getStack());
        }
    }

    private static int incTimerID() {
        if (timerID >= 8192) {
            timerID = 0;
        }
        int i = timerID + 1;
        timerID = i;
        return i;
    }

    public void finalize() {
        stopTimer();
        super.finalize();
    }

    public void handleMessage(Message message) {
        CallBack callBack;
        if (message.what == this.myTimerID && (callBack = this.mCallBack) != null && callBack.onTimerExpired() && this.mLoop && !this.mStop) {
            sendEmptyMessageDelayed(this.myTimerID, this.mLoopInterval);
        }
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void startTimer(long j) {
        startTimer(j, j);
    }

    public void stopTimer() {
        removeMessages(this.myTimerID);
        this.mStop = true;
    }

    public boolean stopped() {
        return this.mStop || !hasMessages(this.myTimerID);
    }

    public String toString() {
        if (this.mCallBack == null) {
            return "MTimerHandler(" + getClass().getName() + "){mCallBack = null}";
        }
        return "MTimerHandler(" + getClass().getName() + "){mCallBack = " + this.mCallBack.getClass().getName() + "}";
    }

    public void startTimer(long j, long j2) {
        this.mLoopInterval = j2;
        stopTimer();
        this.mStop = false;
        sendEmptyMessageDelayed(this.myTimerID, j);
    }

    public MTimerHandler(Looper looper, CallBack callBack, boolean z) {
        super(looper);
        this.mCallBack = callBack;
        this.myTimerID = incTimerID();
        this.mLoop = z;
        if (Thread.currentThread().getName().equals("initThread") || "initThread".equals(C109639a.m148954e())) {
            Log.m105921e(TAG, "MTimerHandler can not init handler with initThread, stack %s", Util.getStack());
        }
    }

    public MTimerHandler(String str, CallBack callBack, boolean z) {
        super(str);
        this.mCallBack = callBack;
        this.myTimerID = incTimerID();
        this.mLoop = z;
    }

    public MTimerHandler(C109639a aVar, CallBack callBack, boolean z) {
        super(aVar);
        this.mCallBack = callBack;
        this.myTimerID = incTimerID();
        this.mLoop = z;
    }
}
