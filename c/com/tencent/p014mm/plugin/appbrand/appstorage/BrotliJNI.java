package com.tencent.p014mm.plugin.appbrand.appstorage;

import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.BrotliJNI */
public class BrotliJNI {
    public static native byte[] decompress(ByteBuffer byteBuffer);
}
