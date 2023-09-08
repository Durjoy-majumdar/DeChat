package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KHorizontalScrollViewOnScrollCallback {

    public static final class CppProxy extends KHorizontalScrollViewOnScrollCallback {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
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

        private native void native_onScroll(long j, float f, float f2);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onScroll(float f, float f2) {
            native_onScroll(this.nativeRef, f, f2);
        }
    }

    public abstract void onScroll(float f, float f2);
}
