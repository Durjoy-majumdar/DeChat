package com.tencent.wcdb.database;

import java.io.Closeable;

public abstract class SQLiteClosable implements Closeable {
    private int mReferenceCount = 1;

    public void acquireReference() {
        synchronized (this) {
            int i = this.mReferenceCount;
            if (i > 0) {
                this.mReferenceCount = i + 1;
            } else {
                throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
            }
        }
    }

    public void close() {
        releaseReference();
    }

    public abstract void onAllReferencesReleased();

    @Deprecated
    public void onAllReferencesReleasedFromContainer() {
        onAllReferencesReleased();
    }

    public void releaseReference() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            onAllReferencesReleased();
        }
    }

    @Deprecated
    public void releaseReferenceFromContainer() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            onAllReferencesReleased();
        }
    }
}
