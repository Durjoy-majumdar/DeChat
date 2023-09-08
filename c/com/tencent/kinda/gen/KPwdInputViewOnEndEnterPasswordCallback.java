package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KPwdInputViewOnEndEnterPasswordCallback {

    public static final class CppProxy extends KPwdInputViewOnEndEnterPasswordCallback {
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

        private native void native_onEndEnterPassword(long j, String str, String str2);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onEndEnterPassword(String str, String str2) {
            native_onEndEnterPassword(this.nativeRef, str, str2);
        }
    }

    public abstract void onEndEnterPassword(String str, String str2);
}
