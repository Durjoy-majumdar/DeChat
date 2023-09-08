package com.tencent.p014mm.mm7zip;

import com.tencent.p014mm.mm7zip.IOutItemBase;

/* renamed from: com.tencent.mm.mm7zip.IOutUpdateArchive */
public interface IOutUpdateArchive<T extends IOutItemBase> extends IOutArchiveBase {
    ArchiveFormat getArchiveFormat();

    IInArchive getConnectedInArchive();

    void updateItems(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback<T> iOutCreateCallback);
}
