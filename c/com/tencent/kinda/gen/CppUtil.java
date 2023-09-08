package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CppUtil {

    public static final class CppProxy extends CppUtil {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }
    }

    public static native String getFilterLog(String str);
}
