package com.tencent.kinda.gen;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KCgi {

    public static final class CppProxy extends KCgi {
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

        private native int native_getCgiId(long j);

        private native String native_getCgiUrl(long j);

        private native int native_getChannelType(long j);

        private native boolean native_getNeedNotify(long j);

        private native byte[] native_getRequestData(long j);

        private native int native_getRetryCount(long j);

        private native String native_getRouteInfo(long j);

        private native int native_getTimeout(long j);

        private native void native_onResp(long j, int i, byte[] bArr, HashMap<String, String> hashMap);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public int getCgiId() {
            return native_getCgiId(this.nativeRef);
        }

        public String getCgiUrl() {
            return native_getCgiUrl(this.nativeRef);
        }

        public int getChannelType() {
            return native_getChannelType(this.nativeRef);
        }

        public boolean getNeedNotify() {
            return native_getNeedNotify(this.nativeRef);
        }

        public byte[] getRequestData() {
            return native_getRequestData(this.nativeRef);
        }

        public int getRetryCount() {
            return native_getRetryCount(this.nativeRef);
        }

        public String getRouteInfo() {
            return native_getRouteInfo(this.nativeRef);
        }

        public int getTimeout() {
            return native_getTimeout(this.nativeRef);
        }

        public void onResp(int i, byte[] bArr, HashMap<String, String> hashMap) {
            native_onResp(this.nativeRef, i, bArr, hashMap);
        }
    }

    public abstract int getCgiId();

    public abstract String getCgiUrl();

    public abstract int getChannelType();

    public abstract boolean getNeedNotify();

    public abstract byte[] getRequestData();

    public abstract int getRetryCount();

    public abstract String getRouteInfo();

    public abstract int getTimeout();

    public abstract void onResp(int i, byte[] bArr, HashMap<String, String> hashMap);
}
