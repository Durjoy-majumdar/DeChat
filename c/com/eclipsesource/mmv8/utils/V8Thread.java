package com.eclipsesource.mmv8.utils;

import com.eclipsesource.mmv8.C80135V8;

public class V8Thread extends Thread {
    private C80135V8 runtime;
    private final V8Runnable target;

    public V8Thread(V8Runnable v8Runnable) {
        this.target = v8Runnable;
    }

    public void run() {
        C80135V8 createV8Runtime = C80135V8.createV8Runtime();
        this.runtime = createV8Runtime;
        try {
            this.target.run(createV8Runtime);
            synchronized (this) {
                if (this.runtime.getLocker().hasLock()) {
                    this.runtime.release();
                    this.runtime = null;
                }
            }
        } catch (Throwable th) {
            synchronized (this) {
                if (this.runtime.getLocker().hasLock()) {
                    this.runtime.release();
                    this.runtime = null;
                }
                throw th;
            }
        }
    }
}
