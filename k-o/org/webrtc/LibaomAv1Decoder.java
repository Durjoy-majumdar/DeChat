package org.webrtc;

public class LibaomAv1Decoder extends WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
