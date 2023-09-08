package com.eclipsesource.mmv8.utils;

import com.eclipsesource.mmv8.C80135V8;

public final class ConcurrentV8 {

    /* renamed from: v8 */
    private C80135V8 f234643v8 = null;

    public ConcurrentV8() {
        C80135V8 createV8Runtime = C80135V8.createV8Runtime();
        this.f234643v8 = createV8Runtime;
        createV8Runtime.getLocker().release();
    }

    public C80135V8 getV8() {
        return this.f234643v8;
    }

    public void release() {
        C80135V8 v8 = this.f234643v8;
        if (v8 != null && !v8.isReleased()) {
            run(new V8Runnable() {
                public void run(C80135V8 v8) {
                    if (v8 != null && !v8.isReleased()) {
                        v8.release();
                    }
                }
            });
        }
    }

    public synchronized void run(V8Runnable v8Runnable) {
        try {
            this.f234643v8.getLocker().acquire();
            v8Runnable.run(this.f234643v8);
            C80135V8 v8 = this.f234643v8;
            if (!(v8 == null || v8.getLocker() == null || !this.f234643v8.getLocker().hasLock())) {
                this.f234643v8.getLocker().release();
            }
        } catch (Throwable th) {
            C80135V8 v84 = this.f234643v8;
            if (!(v84 == null || v84.getLocker() == null || !this.f234643v8.getLocker().hasLock())) {
                this.f234643v8.getLocker().release();
            }
            throw th;
        }
    }
}
