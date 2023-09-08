package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KListViewCallback {

    public static final class CppProxy extends KListViewCallback {
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

        private native KView native_fillData(long j, int i, KViewLayout kViewLayout);

        private native int native_getCount(long j);

        private native int native_getViewType(long j, int i);

        private native int native_getViewTypeCount(long j);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public KView fillData(int i, KViewLayout kViewLayout) {
            return native_fillData(this.nativeRef, i, kViewLayout);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public int getCount() {
            return native_getCount(this.nativeRef);
        }

        public int getViewType(int i) {
            return native_getViewType(this.nativeRef, i);
        }

        public int getViewTypeCount() {
            return native_getViewTypeCount(this.nativeRef);
        }
    }

    public abstract KView fillData(int i, KViewLayout kViewLayout);

    public abstract int getCount();

    public abstract int getViewType(int i);

    public abstract int getViewTypeCount();
}
