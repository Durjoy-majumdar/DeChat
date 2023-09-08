package com.tencent.kinda.framework.app;

import android.os.Looper;
import com.tencent.kinda.gen.KTimerService;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import zt3.C119157j;

public class KindaTimerService implements KTimerService {
    private static final String TAG = "KindaTimerService";
    private float interval;
    /* access modifiers changed from: private */
    public boolean needThrottle;
    private MTimerHandler throttleTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new MTimerHandler.CallBack() {
        public boolean onTimerExpired() {
            return true;
        }
    }, true);
    /* access modifiers changed from: private */
    public VoidCallback timeCheckCallback;
    private MTimerHandler timerHandler;

    public void dispatchAfterImpl(float f, final VoidCallback voidCallback) {
        if (this.throttleTimerHandler == null) {
            this.throttleTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new MTimerHandler.CallBack() {
                public boolean onTimerExpired() {
                    return true;
                }
            }, true);
        }
        this.throttleTimerHandler.postDelayed(new Runnable() {
            public void run() {
                voidCallback.call();
            }
        }, (long) f);
    }

    public void dispatchAsyncInBgThreadImpl(final VoidCallback voidCallback) {
        ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
            public void run() {
                voidCallback.call();
            }
        });
    }

    public void dispatchAsyncInMainThreadImpl(final VoidCallback voidCallback) {
        ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
            public void run() {
                voidCallback.call();
            }
        });
    }

    public void initIntervalAndCheckedCallbackImpl(float f, VoidCallback voidCallback) {
        this.interval = f;
        this.timeCheckCallback = voidCallback;
    }

    public double now() {
        return (double) System.currentTimeMillis();
    }

    public void startTimeCheck() {
        MTimerHandler mTimerHandler = this.timerHandler;
        if (mTimerHandler != null && !mTimerHandler.stopped()) {
            this.timerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new MTimerHandler.CallBack() {
            public boolean onTimerExpired() {
                KindaTimerService.this.timeCheckCallback.call();
                Log.m105918d(KindaTimerService.TAG, "A callback to C++ from Kinda timer was performed.");
                return true;
            }
        }, true);
        this.timerHandler = mTimerHandler2;
        mTimerHandler2.startTimer((long) (this.interval * 1000.0f));
        Log.m105918d(TAG, "Kinda timer has started, interval(second): " + this.interval);
    }

    public void stopTimeCheck() {
        MTimerHandler mTimerHandler = this.timerHandler;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            Log.m105918d(TAG, "Kinda timer has stopped.");
        }
    }

    public void throttleImpl(float f, VoidCallback voidCallback) {
        if (this.throttleTimerHandler == null) {
            this.throttleTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new MTimerHandler.CallBack() {
                public boolean onTimerExpired() {
                    return true;
                }
            }, true);
        }
        if (!this.needThrottle) {
            voidCallback.call();
            this.needThrottle = true;
            this.throttleTimerHandler.postDelayed(new Runnable() {
                public void run() {
                    boolean unused = KindaTimerService.this.needThrottle = false;
                }
            }, (long) f);
        }
    }
}
