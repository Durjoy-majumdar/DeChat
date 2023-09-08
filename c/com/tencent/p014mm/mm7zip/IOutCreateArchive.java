package com.tencent.p014mm.mm7zip;

import com.tencent.p014mm.mm7zip.IOutItemBase;
import java.io.Closeable;

/* renamed from: com.tencent.mm.mm7zip.IOutCreateArchive */
public interface IOutCreateArchive<T extends IOutItemBase> extends IOutArchiveBase, Closeable {
    void createArchive(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback<? extends T> iOutCreateCallback);

    ArchiveFormat getArchiveFormat();
}
