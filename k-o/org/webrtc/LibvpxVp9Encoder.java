package org.webrtc;

public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    public static native boolean nativeIsSupported();

    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    public boolean isHardwareEncoder() {
        return false;
    }
}
