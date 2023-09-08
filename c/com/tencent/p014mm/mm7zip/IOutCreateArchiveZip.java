package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.IOutCreateArchiveZip */
public interface IOutCreateArchiveZip extends IOutCreateArchive<IOutItemZip>, IOutFeatureSetLevel {
    void createArchive(IOutStream iOutStream, int i, IOutCreateCallback<? extends IOutItemZip> iOutCreateCallback);
}
