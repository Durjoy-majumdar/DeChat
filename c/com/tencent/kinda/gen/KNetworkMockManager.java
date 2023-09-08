package com.tencent.kinda.gen;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class KNetworkMockManager {

    public static final class CppProxy extends KNetworkMockManager {
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

        private native byte[] native_jsonToRequestData(long j, String str);

        private native byte[] native_jsonToResponseData(long j, String str);

        private native String native_requestDataToJson(long j, byte[] bArr);

        private native String native_responseDataToJson(long j, byte[] bArr);

        public void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        public byte[] jsonToRequestData(String str) {
            return native_jsonToRequestData(this.nativeRef, str);
        }

        public byte[] jsonToResponseData(String str) {
            return native_jsonToResponseData(this.nativeRef, str);
        }

        public String requestDataToJson(byte[] bArr) {
            return native_requestDataToJson(this.nativeRef, bArr);
        }

        public String responseDataToJson(byte[] bArr) {
            return native_responseDataToJson(this.nativeRef, bArr);
        }
    }

    public static native HashMap<Integer, String> getCgiList();

    public abstract byte[] jsonToRequestData(String str);

    public abstract byte[] jsonToResponseData(String str);

    public abstract String requestDataToJson(byte[] bArr);

    public abstract String responseDataToJson(byte[] bArr);
}
