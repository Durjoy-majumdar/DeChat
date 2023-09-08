package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class UseCase {

    public static final class CppProxy extends UseCase {
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

        private native void native_notify(long j, ITransmitKvData iTransmitKvData);

        private native void native_preStepDidDestory(long j);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public void notify(ITransmitKvData iTransmitKvData) {
            native_notify(this.nativeRef, iTransmitKvData);
        }

        public void preStepDidDestory() {
            native_preStepDidDestory(this.nativeRef);
        }
    }

    public abstract void notify(ITransmitKvData iTransmitKvData);

    public abstract void preStepDidDestory();
}
