package com.tencent.thumbplayer.utils;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TPReadWriteLock extends ReentrantReadWriteLock {
    private static final int INTERRUPTED_TIMES = 3;
    private static final String TAG = "TPReadWriteLock";
    private Condition mWriteLockCond = writeLock().newCondition();

    public void read() {
        readLock().lock();
    }

    public boolean readTryLock(long j) {
        int i = 3;
        while (true) {
            i--;
            if (i >= 0) {
                try {
                    return readLock().tryLock(j, TimeUnit.MICROSECONDS);
                } catch (InterruptedException e) {
                    TPLogUtil.m21895e(TAG, (Throwable) e);
                }
            } else {
                throw new InterruptedException("tryLock interrupted.");
            }
        }
    }

    public void unReadLock() {
        readLock().unlock();
    }

    public void unWriteLock() {
        writeLock().unlock();
    }

    public void write() {
        writeLock().lock();
    }

    public void writeLockCondSignal() {
        this.mWriteLockCond.signal();
    }

    public void writeLockCondSignalAll() {
        this.mWriteLockCond.signalAll();
    }

    public boolean writeLockCondWait(long j) {
        int i = 3;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            try {
                return this.mWriteLockCond.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public boolean writeTryLock(long j) {
        int i = 3;
        while (true) {
            i--;
            if (i >= 0) {
                try {
                    return writeLock().tryLock(j, TimeUnit.MICROSECONDS);
                } catch (InterruptedException e) {
                    TPLogUtil.m21895e(TAG, (Throwable) e);
                }
            } else {
                throw new InterruptedException("tryLock interrupted.");
            }
        }
    }
}
