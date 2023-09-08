package com.tencent.kinda.gen;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class VoidITransmitKvDataNoticeItemCallback {

    public static final class CppProxy extends VoidITransmitKvDataNoticeItemCallback {
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

        private native void native_call(long j, ITransmitKvData iTransmitKvData, NoticeItem noticeItem);

        public void call(ITransmitKvData iTransmitKvData, NoticeItem noticeItem) {
            native_call(this.nativeRef, iTransmitKvData, noticeItem);
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

    public abstract void call(ITransmitKvData iTransmitKvData, NoticeItem noticeItem);
}
