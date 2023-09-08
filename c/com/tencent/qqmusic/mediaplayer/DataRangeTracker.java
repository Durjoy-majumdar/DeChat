package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DataRangeTracker {
    private static final long LOCK_INTERVAL = 1000;
    private static final String TAG = "DataRangeTracker";
    private boolean isUpstreamSizeSet = false;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Comparator<Range> mComparator = new Comparator<Range>() {
        public int compare(Range range, Range range2) {
            return (int) (range.first - range2.first);
        }
    };
    private final ArrayList<Range> mDownloadDataList = new ArrayList<>();
    private long mFileTotalSize = 0;
    private long waitingPosition;
    private int waitingSize;

    public interface LockJudgerCallback {
        boolean isToAbandonLock();
    }

    public static class Range {
        /* access modifiers changed from: private */
        public final long first;
        /* access modifiers changed from: private */
        public final long second;

        public String toString() {
            return "[" + this.first + ", " + this.second + ']';
        }

        private Range(long j, long j2) {
            this.first = j;
            this.second = j2;
        }
    }

    private void lockRead() {
        this.lock.readLock().lock();
    }

    private synchronized void unlock() {
        Logger.m21791i(TAG, "[unlock].");
        notifyAll();
    }

    private void unlockRead() {
        this.lock.readLock().unlock();
    }

    public void abandonLock() {
        Logger.m21791i(TAG, "[abandonLock]");
        unblock();
        unlock();
    }

    public void addRange(long j, long j2, boolean z) {
        int i;
        boolean z2 = true;
        if (j > j2) {
            Logger.m21789e(TAG, "[addRange] illegal arguments! beginPos(%s) > endPos(%s)", Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        this.lock.writeLock().lock();
        try {
            ArrayList arrayList = new ArrayList();
            this.mDownloadDataList.add(new Range(j, j2));
            Collections.sort(this.mDownloadDataList, this.mComparator);
            int size = this.mDownloadDataList.size() - 1;
            Range range = this.mDownloadDataList.get(0);
            if (size > 0) {
                for (int i2 = 1; i2 <= size; i2++) {
                    Range range2 = this.mDownloadDataList.get(i2);
                    if (range.second + 1 < range2.first) {
                        arrayList.add(new Range(range.first, range.second));
                        range = new Range(range2.first, range2.second);
                    } else {
                        range = new Range(range.first, Math.max(range.second, range2.second));
                    }
                    if (i2 >= size) {
                        arrayList.add(range);
                    }
                }
                this.mDownloadDataList.clear();
                this.mDownloadDataList.addAll(arrayList);
            }
            long j3 = this.waitingPosition;
            if (j3 < 0 || (i = this.waitingSize) <= 0 || !isCached(j3, i)) {
                z2 = false;
            }
            if (z2) {
                Logger.m21791i(TAG, "[addRange] notify position: " + this.waitingPosition + ", size: " + this.waitingSize);
                synchronized (this) {
                    if (z) {
                        unlock();
                    }
                    this.waitingPosition = 0;
                    this.waitingSize = 0;
                }
            }
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public void block() {
        Logger.m21791i(TAG, "[block]");
    }

    public long findEnd(long j) {
        long j2;
        long access$200;
        int i;
        lockRead();
        try {
            int size = this.mDownloadDataList.size();
            if (size == 0) {
                j2 = -1;
            } else {
                int i2 = 0;
                while (i2 < size) {
                    if (j < this.mDownloadDataList.get(i2).first) {
                        access$200 = this.mDownloadDataList.get(i2).first;
                    } else if (j > this.mDownloadDataList.get(i2).second || (i = i2 + 1) >= size) {
                        i2++;
                    } else {
                        access$200 = this.mDownloadDataList.get(i).first;
                    }
                    j2 = access$200 - 1;
                    break;
                }
                j2 = 0;
            }
            return j2;
        } finally {
            unlockRead();
        }
    }

    public long findStart(long j) {
        long access$100;
        long j2;
        lockRead();
        try {
            int size = this.mDownloadDataList.size();
            if (size == 0) {
                j2 = -1;
            } else {
                int i = 0;
                long access$1002 = this.mDownloadDataList.get(0).second + 1;
                while (true) {
                    if (i >= size) {
                        ArrayList<Range> arrayList = this.mDownloadDataList;
                        access$100 = arrayList.get(arrayList.size() - 1).second;
                        break;
                    } else if (j < this.mDownloadDataList.get(i).first) {
                        unlockRead();
                        return access$1002;
                    } else {
                        access$1002 = this.mDownloadDataList.get(i).second + 1;
                        if (j <= this.mDownloadDataList.get(i).second) {
                            access$100 = this.mDownloadDataList.get(i).second;
                            break;
                        }
                        i++;
                    }
                }
                j2 = access$100 + 1;
            }
            return j2;
        } finally {
            unlockRead();
        }
    }

    public long getContinuousEnd() {
        lockRead();
        try {
            if (this.mDownloadDataList.size() == 0) {
                return -1;
            }
            long access$100 = this.mDownloadDataList.get(0).second;
            unlockRead();
            return access$100;
        } finally {
            unlockRead();
        }
    }

    public long getContinuousStart() {
        lockRead();
        try {
            if (this.mDownloadDataList.size() == 0) {
                return -1;
            }
            long access$200 = this.mDownloadDataList.get(0).first;
            unlockRead();
            return access$200;
        } finally {
            unlockRead();
        }
    }

    public boolean isCached(long j, int i) {
        lockRead();
        try {
            long findStart = findStart(j);
            long j2 = ((long) i) + j;
            long findStart2 = findStart(j2);
            long findEnd = findEnd(j);
            long findEnd2 = findEnd(j2);
            boolean z = false;
            if (findStart != findStart2 || findEnd != findEnd2) {
                unlockRead();
                return false;
            } else if (findEnd == -1) {
                return false;
            } else {
                long j3 = this.mFileTotalSize;
                if (j3 > 0 && j2 > j3) {
                    j2 = j3;
                }
                if (j2 <= findStart) {
                    z = true;
                }
                unlockRead();
                return z;
            }
        } finally {
            unlockRead();
        }
    }

    public synchronized boolean lock(long j, int i, long j2, LockJudgerCallback lockJudgerCallback) {
        Logger.m21791i(TAG, "[lock] position = [" + j + "]. size = [" + i + "]. timeout = [" + j2 + "].");
        this.waitingPosition = j;
        this.waitingSize = i;
        int i2 = (int) (j2 / 1000);
        if (i2 <= 0) {
            i2 = 1;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            wait(1000);
            if (lockJudgerCallback != null && lockJudgerCallback.isToAbandonLock()) {
                Logger.m21791i(TAG, "lockJudgerCallback.isToAbandonLock() is true, exit the wait loop");
                break;
            } else if (isCached(this.waitingPosition, this.waitingSize)) {
                Logger.m21791i(TAG, "isCached(waitingPosition, waitingSize) is true, exit the wait loop, wawaitingPosition = " + this.waitingPosition + ", waitingSize = " + this.waitingSize);
                break;
            } else {
                Logger.m21791i(TAG, "continue [lock] position = [" + j + "]. size = [" + i + "]. totalSize = [" + this.mFileTotalSize + "]. findStart(position) = [" + findStart(j) + "]. i = " + i3);
                i3++;
            }
        }
        return true;
    }

    public void setFileTotalSize(long j, boolean z) {
        if (j > 0 && this.mFileTotalSize != j) {
            Logger.m21791i(TAG, "setFileTotalSize mFileTotalSize = " + this.mFileTotalSize + " isUpstreamSizeSet = " + this.isUpstreamSizeSet + " fileTotalSize = " + j + " isUpstreamSize = " + z);
            if (!this.isUpstreamSizeSet) {
                this.mFileTotalSize = j;
                this.isUpstreamSizeSet = z;
            } else if (z) {
                this.mFileTotalSize = j;
            }
        }
    }

    public void unblock() {
        Logger.m21791i(TAG, "[unblock]");
    }
}
