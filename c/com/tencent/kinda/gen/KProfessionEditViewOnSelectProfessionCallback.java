package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KProfessionEditViewOnSelectProfessionCallback {

    public static final class CppProxy extends KProfessionEditViewOnSelectProfessionCallback {
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

        private native void native_onSelectProfession(long j, String str, int i);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void onSelectProfession(String str, int i) {
            native_onSelectProfession(this.nativeRef, str, i);
        }
    }

    public abstract void onSelectProfession(String str, int i);
}
