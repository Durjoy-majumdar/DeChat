package org.webrtc;

public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    public boolean isHardwareEncoder() {
        return false;
    }
}
