package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KEditTextOnTextEndEditingCallback {

    public static final class CppProxy extends KEditTextOnTextEndEditingCallback {
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

        private native void native_onTextEndEditing(long j, String str);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onTextEndEditing(String str) {
            native_onTextEndEditing(this.nativeRef, str);
        }
    }

    public abstract void onTextEndEditing(String str);
}
