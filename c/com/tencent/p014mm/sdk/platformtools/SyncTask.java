package com.tencent.p014mm.sdk.platformtools;

import mu3.C109639a;

/* renamed from: com.tencent.mm.sdk.platformtools.SyncTask */
public abstract class SyncTask<R> {
    private static final String TAG = "MicroMsg.SDK.SyncTask";
    /* access modifiers changed from: private */
    public long begin;
    private Object lock;
    /* access modifiers changed from: private */
    public boolean manualFinish;
    private R result;
    private Runnable task;
    private final long timeout;
    /* access modifiers changed from: private */
    public long wait;

    public SyncTask() {
        this(0, (Object) null);
    }

    public R exec(MMHandler mMHandler) {
        if (mMHandler == null) {
            Log.m105918d(TAG, "null handler, task in exec thread, return now");
            return run();
        }
        Log.m105924i(TAG, "sync task exec...");
        if (mMHandler.getLooper() != null ? Thread.currentThread().getId() == mMHandler.getLooper().getThread().getId() : mMHandler.getSerialTag().equals(C109639a.m148954e())) {
            Log.m105924i(TAG, "same tid, task in exec thread, return now");
            return run();
        }
        this.begin = Util.currentTicks();
        try {
            synchronized (this.lock) {
                Log.m105924i(TAG, "sync task exec at synchronized");
                mMHandler.post(this.task);
                this.lock.wait(this.timeout);
            }
        } catch (InterruptedException e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        long ticksToNow = Util.ticksToNow(this.begin);
        Log.m105925i(TAG, "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + this.result, Long.valueOf(ticksToNow), Long.valueOf(this.wait), Long.valueOf(ticksToNow - this.wait));
        return this.result;
    }

    public abstract R run();

    public void setResultFinish(R r) {
        Log.m105924i(TAG, "setResultFinish ");
        this.result = r;
        synchronized (this.lock) {
            Log.m105924i(TAG, "setResultFinish synchronized");
            this.lock.notify();
        }
    }

    public SyncTask(long j, R r, boolean z) {
        this.lock = new Object();
        this.manualFinish = false;
        this.task = new Runnable() {
            public void run() {
                Log.m105924i(SyncTask.TAG, "task run manualFinish = " + SyncTask.this.manualFinish);
                if (SyncTask.this.manualFinish) {
                    SyncTask.this.run();
                } else {
                    SyncTask syncTask = SyncTask.this;
                    syncTask.setResultFinish(syncTask.run());
                }
                SyncTask syncTask2 = SyncTask.this;
                long unused = syncTask2.wait = Util.ticksToNow(syncTask2.begin);
            }
        };
        this.timeout = j;
        this.result = r;
        this.manualFinish = z;
    }

    public SyncTask(long j, R r) {
        this.lock = new Object();
        this.manualFinish = false;
        this.task = new Runnable() {
            public void run() {
                Log.m105924i(SyncTask.TAG, "task run manualFinish = " + SyncTask.this.manualFinish);
                if (SyncTask.this.manualFinish) {
                    SyncTask.this.run();
                } else {
                    SyncTask syncTask = SyncTask.this;
                    syncTask.setResultFinish(syncTask.run());
                }
                SyncTask syncTask2 = SyncTask.this;
                long unused = syncTask2.wait = Util.ticksToNow(syncTask2.begin);
            }
        };
        this.timeout = j;
        this.result = r;
    }
}
