package com.tencent.mapsdk.rastercore.tools;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.tencent.mapsdk.rastercore.tools.IO */
public class C40004IO {
    public static final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
