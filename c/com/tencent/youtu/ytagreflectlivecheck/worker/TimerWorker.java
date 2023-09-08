package com.tencent.youtu.ytagreflectlivecheck.worker;

import android.os.SystemClock;
import com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface;
import java.util.Timer;
import java.util.TimerTask;

public abstract class TimerWorker {
    private static final String TAG = "CloudFaceCountDownTimer";
    /* access modifiers changed from: private */
    public boolean mCancelled = false;
    private final long mCountdownInterval;
    private final long mMillisInFuture;
    private long mStopTimeInFuture;
    private Timer mTimer;

    public TimerWorker(long j, long j2) {
        YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[TimerWorker.TimerWorker] mCountDownTimer");
        this.mMillisInFuture = j;
        this.mCountdownInterval = j2;
    }

    /* access modifiers changed from: private */
    public void continueTimerJudge() {
        if (!this.mCancelled) {
            long elapsedRealtime = this.mStopTimeInFuture - SystemClock.elapsedRealtime();
            if (elapsedRealtime <= 0) {
                this.mTimer.cancel();
                onFinish();
            } else if (elapsedRealtime >= this.mCountdownInterval) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                onTick(elapsedRealtime);
                long elapsedRealtime3 = (elapsedRealtime2 + this.mCountdownInterval) - SystemClock.elapsedRealtime();
                while (elapsedRealtime3 < 0) {
                    elapsedRealtime3 += this.mCountdownInterval;
                }
            }
        }
    }

    public final synchronized void cancel() {
        this.mCancelled = true;
        if (this.mTimer != null) {
            this.mTimer = null;
        }
    }

    public abstract void onFinish();

    public abstract void onTick(long j);

    public final synchronized TimerWorker start() {
        this.mCancelled = false;
        if (this.mMillisInFuture <= 0) {
            onFinish();
            return this;
        }
        this.mStopTimeInFuture = SystemClock.elapsedRealtime() + this.mMillisInFuture;
        Timer timer = new Timer();
        this.mTimer = timer;
        timer.schedule(new TimerTask() {
            public void run() {
                if (!TimerWorker.this.mCancelled) {
                    TimerWorker.this.continueTimerJudge();
                }
            }
        }, 0, this.mCountdownInterval);
        return this;
    }
}
