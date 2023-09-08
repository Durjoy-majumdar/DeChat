package com.tencent.matrix.openglleak.detector;

class FuncSeeker {
    private static native int getBindFuncIndex(String str);

    public static int getFuncIndex(String str) {
        if (str.equals("glGetError")) {
            return getGlGetErrorIndex();
        }
        if (str.startsWith("glGen") || str.startsWith("glDelete")) {
            return getTargetFuncIndex(str);
        }
        if (str.startsWith("glBind")) {
            return getBindFuncIndex(str);
        }
        if (str.equals("glTexImage2D")) {
            return getGlTexImage2DIndex();
        }
        if (str.equals("glTexImage3D")) {
            return getGlTexImage3DIndex();
        }
        if (str.equals("glBufferData")) {
            return getGlBufferDataIndex();
        }
        if (str.equals("glRenderbufferStorage")) {
            return getGlRenderbufferStorageIndex();
        }
        return 0;
    }

    private static native int getGlBufferDataIndex();

    private static native int getGlGetErrorIndex();

    private static native int getGlRenderbufferStorageIndex();

    private static native int getGlTexImage2DIndex();

    private static native int getGlTexImage3DIndex();

    private static native int getTargetFuncIndex(String str);
}
