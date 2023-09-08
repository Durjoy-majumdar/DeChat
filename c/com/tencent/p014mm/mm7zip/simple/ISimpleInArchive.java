package com.tencent.p014mm.mm7zip.simple;

/* renamed from: com.tencent.mm.mm7zip.simple.ISimpleInArchive */
public interface ISimpleInArchive {
    void close();

    ISimpleInArchiveItem getArchiveItem(int i);

    ISimpleInArchiveItem[] getArchiveItems();

    int getNumberOfItems();
}
