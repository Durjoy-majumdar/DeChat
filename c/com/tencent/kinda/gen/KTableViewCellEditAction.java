package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KTableViewCellEditAction {

    public static final class CppProxy extends KTableViewCellEditAction {
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

        private native boolean native_getIsDestructive(long j);

        private native String native_getTitle(long j);

        private native void native_triggered(long j);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public boolean getIsDestructive() {
            return native_getIsDestructive(this.nativeRef);
        }

        public String getTitle() {
            return native_getTitle(this.nativeRef);
        }

        public void triggered() {
            native_triggered(this.nativeRef);
        }
    }

    public abstract boolean getIsDestructive();

    public abstract String getTitle();

    public abstract void triggered();
}
