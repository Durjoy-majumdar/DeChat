package org.libpag;

import a34.C79461a;
import java.nio.ByteBuffer;

public class PAGImageLayer extends PAGLayer {
    static {
        C79461a.m96419a("pag");
        nativeInit();
    }

    public PAGImageLayer(long j) {
        super(j);
    }

    public static PAGImageLayer Make(int i, int i2, long j) {
        long nativeMake = nativeMake(i, i2, j);
        if (nativeMake == 0) {
            return null;
        }
        return new PAGImageLayer(nativeMake);
    }

    private static native void nativeInit();

    private static native long nativeMake(int i, int i2, long j);

    private native void replaceImage(long j);

    private native void setImage(long j);

    public native long contentDuration();

    public native PAGVideoRange[] getVideoRanges();

    public native ByteBuffer imageBytes();

    public void replaceImage(PAGImage pAGImage) {
        replaceImage(pAGImage == null ? 0 : pAGImage.nativeContext);
    }

    public void setImage(PAGImage pAGImage) {
        setImage(pAGImage == null ? 0 : pAGImage.nativeContext);
    }
}
