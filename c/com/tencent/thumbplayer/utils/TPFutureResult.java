package com.tencent.thumbplayer.utils;

public class TPFutureResult {
    private static final int INTERRUPTED_TIMES = 2;
    private static final String TAG = "TPFutureResult";
    private Throwable mException = null;
    private boolean mIsReady = false;
    private Object mRealResult = null;

    private void waitAndDealInterrupted() {
        int i = 2;
        boolean z = false;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            try {
                wait();
                break;
            } catch (InterruptedException unused) {
                z = true;
                TPLogUtil.m21897i(TAG, "getResult wait has InterruptedException, interrupted:" + i);
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized Object getResult() {
        if (!this.mIsReady) {
            waitAndDealInterrupted();
        }
        Throwable th = this.mException;
        if (th == null) {
        } else {
            throw th;
        }
        return this.mRealResult;
    }

    public synchronized void setException(Throwable th) {
        if (th != null) {
            this.mException = th;
            this.mIsReady = true;
            notifyAll();
        }
    }

    public synchronized void setResult(Object obj) {
        if (!this.mIsReady) {
            this.mRealResult = obj;
            this.mIsReady = true;
            notifyAll();
        }
    }

    private void waitAndDealInterrupted(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        while (j > 0) {
            try {
                wait(j);
                break;
            } catch (InterruptedException unused) {
                z = true;
                j -= System.currentTimeMillis() - currentTimeMillis;
                TPLogUtil.m21897i(TAG, "getResult wait has InterruptedException, remainTime:" + j);
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized Object getResult(long j) {
        if (!this.mIsReady) {
            waitAndDealInterrupted(j);
        }
        Throwable th = this.mException;
        if (th == null) {
        } else {
            throw th;
        }
        return this.mRealResult;
    }
}
