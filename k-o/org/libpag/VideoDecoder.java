package org.libpag;

import a34.C79461a;

public abstract class VideoDecoder {
    static {
        C79461a.m96419a("pag");
    }

    public static native void RegisterSoftwareDecoderFactory(long j);

    public static native void SetMaxHardwareDecoderCount(int i);
}
