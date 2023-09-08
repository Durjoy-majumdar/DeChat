package com.tencent.magicbrush.gapid;

public class MagicGAPID {
    private static native int nativeAttach(String str, String str2, int i);

    private static native void nativeDetach();

    private static native int nativeSnapshotCapture();
}
