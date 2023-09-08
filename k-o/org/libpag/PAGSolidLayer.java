package org.libpag;

import a34.C79461a;

public class PAGSolidLayer extends PAGLayer {
    static {
        C79461a.m96419a("pag");
        nativeInit();
    }

    public PAGSolidLayer(long j) {
        super(j);
    }

    private static native void nativeInit();

    public native void setSolidColor(int i);

    public native int solidColor();
}
