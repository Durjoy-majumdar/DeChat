package com.tencent.p014mm.mm7zip.simple.impl;

import com.tencent.p014mm.mm7zip.IInArchive;
import com.tencent.p014mm.mm7zip.SevenZipException;
import com.tencent.p014mm.mm7zip.simple.ISimpleInArchive;
import com.tencent.p014mm.mm7zip.simple.ISimpleInArchiveItem;

/* renamed from: com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveImpl */
public class SimpleInArchiveImpl implements ISimpleInArchive {
    private final IInArchive sevenZipInArchive;
    private boolean wasClosed = false;

    public SimpleInArchiveImpl(IInArchive iInArchive) {
        this.sevenZipInArchive = iInArchive;
    }

    public void close() {
        this.sevenZipInArchive.close();
        this.wasClosed = true;
    }

    public ISimpleInArchiveItem getArchiveItem(int i) {
        if (i >= 0 && i < this.sevenZipInArchive.getNumberOfItems()) {
            return new SimpleInArchiveItemImpl(this, i);
        }
        throw new SevenZipException("Index " + i + " is out of range. Number of items in archive: " + this.sevenZipInArchive.getNumberOfItems());
    }

    public ISimpleInArchiveItem[] getArchiveItems() {
        int numberOfItems = getNumberOfItems();
        ISimpleInArchiveItem[] iSimpleInArchiveItemArr = new ISimpleInArchiveItem[numberOfItems];
        for (int i = 0; i < numberOfItems; i++) {
            iSimpleInArchiveItemArr[i] = new SimpleInArchiveItemImpl(this, i);
        }
        return iSimpleInArchiveItemArr;
    }

    public int getNumberOfItems() {
        return testAndGetSafeSevenZipInArchive().getNumberOfItems();
    }

    public IInArchive testAndGetSafeSevenZipInArchive() {
        if (!this.wasClosed) {
            return this.sevenZipInArchive;
        }
        throw new SevenZipException("Archive was closed");
    }
}
