package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.liteav.videobase.frame.k */
public abstract class C17236k {
    private static final String TAG = "RefCounted";
    private long mLastUsedTimestamp = -1;
    private final C17228g mRecycler;
    private final AtomicInteger mRefCnt = new AtomicInteger(0);
    private String mStackTrace;

    public C17236k(C17228g gVar) {
        this.mRecycler = gVar;
    }

    public void finalize() {
        super.finalize();
        if (this.mRecycler != null && this.mRefCnt.get() != 0) {
            LiteavLog.m16900e(TAG, "Object's reference count(%d) isn't zero when finalize.\n retainTrack:%s", Integer.valueOf(this.mRefCnt.get()), this.mStackTrace);
        }
    }

    public long getLastUsedTimestamp() {
        return this.mLastUsedTimestamp;
    }

    public void release() {
        C17228g gVar;
        if (this.mRefCnt.decrementAndGet() == 0 && (gVar = this.mRecycler) != null) {
            gVar.mo20189a(this);
        }
    }

    public int retain() {
        this.mStackTrace = null;
        return this.mRefCnt.addAndGet(1);
    }

    public void updateLastUsedTimestamp(long j) {
        this.mLastUsedTimestamp = j;
    }
}
