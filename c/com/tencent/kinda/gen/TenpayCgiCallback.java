package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class TenpayCgiCallback {

    public static final class CppProxy extends TenpayCgiCallback {
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

        private native void native_onError(long j, int i, String str);

        private native void native_onSuccess(long j, String str);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onError(int i, String str) {
            native_onError(this.nativeRef, i, str);
        }

        public void onSuccess(String str) {
            native_onSuccess(this.nativeRef, str);
        }
    }

    public abstract void onError(int i, String str);

    public abstract void onSuccess(String str);
}
