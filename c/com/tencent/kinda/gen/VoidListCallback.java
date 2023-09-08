package com.tencent.kinda.gen;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class VoidListCallback {

    public static final class CppProxy extends VoidListCallback {
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

        private native void native_call(long j, ArrayList<Integer> arrayList);

        public void call(ArrayList<Integer> arrayList) {
            native_call(this.nativeRef, arrayList);
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

    public abstract void call(ArrayList<Integer> arrayList);
}
