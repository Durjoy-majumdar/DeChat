package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;

public class WaitNotify {
    private static final String TAG = "WaitNotify";
    private volatile boolean isWaiting = false;
    private final MonitorObject myMonitorObject = new MonitorObject();
    private volatile boolean wasSignalled = false;

    public interface WaitListener {
        boolean keepWaiting();
    }

    public void doNotify() {
        Logger.m21786d(TAG, "doNotify " + Thread.currentThread().getName());
        synchronized (this.myMonitorObject) {
            this.wasSignalled = true;
            Logger.m21786d(TAG, "doNotify internal " + Thread.currentThread().getName());
            this.myMonitorObject.notifyAll();
            Logger.m21786d(TAG, "doNotify over " + Thread.currentThread().getName());
        }
    }

    public void doWait() {
        doWait(MAlarmHandler.NEXT_FIRE_INTERVAL, 0, new WaitListener() {
            public boolean keepWaiting() {
                return true;
            }
        });
    }

    public boolean isWaiting() {
        return this.isWaiting;
    }

    public void doWait(long j, int i, WaitListener waitListener) {
        Logger.m21786d(TAG, "doWait " + Thread.currentThread().getName());
        synchronized (this.myMonitorObject) {
            this.wasSignalled = false;
            int i2 = 0;
            while (true) {
                if (this.wasSignalled) {
                    break;
                }
                try {
                    Logger.m21786d(TAG, "doWait internal " + Thread.currentThread().getName() + " " + i2);
                    this.isWaiting = true;
                    if (i2 < i) {
                        this.myMonitorObject.wait(j, 0);
                        if (!waitListener.keepWaiting()) {
                            doNotify();
                            break;
                        }
                    } else {
                        this.myMonitorObject.wait();
                    }
                    Logger.m21786d(TAG, "doWait wake " + Thread.currentThread().getName() + " " + i2);
                } catch (InterruptedException e) {
                    Logger.m21787e(TAG, e.toString());
                }
                i2++;
            }
            this.isWaiting = false;
        }
    }
}
