package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KEditTextOnFocusChangeCallback {

    public static final class CppProxy extends KEditTextOnFocusChangeCallback {
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

        private native void native_onFocusChange(long j, boolean z);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onFocusChange(boolean z) {
            native_onFocusChange(this.nativeRef, z);
        }
    }

    public abstract void onFocusChange(boolean z);
}
