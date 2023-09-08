package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KPwdInputViewOnPasswordChangeCallback {

    public static final class CppProxy extends KPwdInputViewOnPasswordChangeCallback {
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

        private native void native_onPasswordChange(long j, int i, String str, String str2);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onPasswordChange(int i, String str, String str2) {
            native_onPasswordChange(this.nativeRef, i, str, str2);
        }
    }

    public abstract void onPasswordChange(int i, String str, String str2);
}
