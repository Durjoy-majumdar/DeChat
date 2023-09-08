package org.webrtc;

public class LibvpxVp8Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
