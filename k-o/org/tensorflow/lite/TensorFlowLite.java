package org.tensorflow.lite;

public final class TensorFlowLite {

    /* renamed from: a */
    public static volatile boolean f257228a;

    /* renamed from: a */
    public static void m111603a() {
        if (!f257228a) {
            try {
                nativeRuntimeVersion();
                f257228a = true;
            } catch (UnsatisfiedLinkError unused) {
                throw new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():");
            }
        }
    }

    public static native String nativeRuntimeVersion();

    public static native String nativeSchemaVersion();
}
