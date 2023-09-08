package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class VoidStringStringBinaryCallback {

    public static final class CppProxy extends VoidStringStringBinaryCallback {
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

        private native void native_call(long j, String str, String str2, byte[] bArr);

        public void call(String str, String str2, byte[] bArr) {
            native_call(this.nativeRef, str, str2, bArr);
        }

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

    public abstract void call(String str, String str2, byte[] bArr);
}
