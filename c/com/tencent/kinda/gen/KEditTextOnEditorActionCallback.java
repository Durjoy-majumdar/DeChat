package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KEditTextOnEditorActionCallback {

    public static final class CppProxy extends KEditTextOnEditorActionCallback {
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

        private native void native_onEditorAction(long j, KeyEvent keyEvent);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onEditorAction(KeyEvent keyEvent) {
            native_onEditorAction(this.nativeRef, keyEvent);
        }
    }

    public abstract void onEditorAction(KeyEvent keyEvent);
}
