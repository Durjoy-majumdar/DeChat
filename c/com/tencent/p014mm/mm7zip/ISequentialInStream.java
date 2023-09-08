package com.tencent.p014mm.mm7zip;

import java.io.Closeable;

/* renamed from: com.tencent.mm.mm7zip.ISequentialInStream */
public interface ISequentialInStream extends Closeable {
    int read(byte[] bArr);
}
