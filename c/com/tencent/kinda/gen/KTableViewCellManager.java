package com.tencent.kinda.gen;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KTableViewCellManager {

    public static final class CppProxy extends KTableViewCellManager {
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

        private native ArrayList<KTableViewCellEditAction> native_getEditActions(long j);

        private native KViewLayout native_getView(long j);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public ArrayList<KTableViewCellEditAction> getEditActions() {
            return native_getEditActions(this.nativeRef);
        }

        public KViewLayout getView() {
            return native_getView(this.nativeRef);
        }
    }

    public abstract ArrayList<KTableViewCellEditAction> getEditActions();

    public abstract KViewLayout getView();
}
