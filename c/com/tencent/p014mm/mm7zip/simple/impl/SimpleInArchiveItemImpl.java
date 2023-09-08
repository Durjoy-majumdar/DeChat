package com.tencent.p014mm.mm7zip.simple.impl;

import com.tencent.p014mm.mm7zip.ExtractOperationResult;
import com.tencent.p014mm.mm7zip.IInArchive;
import com.tencent.p014mm.mm7zip.ISequentialOutStream;
import com.tencent.p014mm.mm7zip.PropID;
import com.tencent.p014mm.mm7zip.simple.ISimpleInArchiveItem;
import java.util.Date;

/* renamed from: com.tencent.mm.mm7zip.simple.impl.SimpleInArchiveItemImpl */
public class SimpleInArchiveItemImpl implements ISimpleInArchiveItem {
    private final int index;
    private final SimpleInArchiveImpl simpleInArchiveImpl;

    public SimpleInArchiveItemImpl(SimpleInArchiveImpl simpleInArchiveImpl2, int i) {
        this.simpleInArchiveImpl = simpleInArchiveImpl2;
        this.index = i;
    }

    public ExtractOperationResult extractSlow(ISequentialOutStream iSequentialOutStream) {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().extractSlow(this.index, iSequentialOutStream);
    }

    public Integer getAttributes() {
        return (Integer) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.ATTRIBUTES);
    }

    public Integer getCRC() {
        return (Integer) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.CRC);
    }

    public String getComment() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, PropID.COMMENT);
    }

    public Date getCreationTime() {
        return (Date) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.CREATION_TIME);
    }

    public String getGroup() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, PropID.GROUP);
    }

    public String getHostOS() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, PropID.HOST_OS);
    }

    public int getItemIndex() {
        return this.index;
    }

    public Date getLastAccessTime() {
        return (Date) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.LAST_ACCESS_TIME);
    }

    public Date getLastWriteTime() {
        return (Date) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.LAST_MODIFICATION_TIME);
    }

    public String getMethod() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, PropID.METHOD);
    }

    public Long getPackedSize() {
        return (Long) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.PACKED_SIZE);
    }

    public String getPath() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, PropID.PATH);
    }

    public Integer getPosition() {
        return (Integer) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.POSITION);
    }

    public Long getSize() {
        return (Long) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.SIZE);
    }

    public String getUser() {
        return this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getStringProperty(this.index, PropID.USER);
    }

    public Boolean isCommented() {
        return (Boolean) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.COMMENTED);
    }

    public boolean isEncrypted() {
        return ((Boolean) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.ENCRYPTED)).booleanValue();
    }

    public boolean isFolder() {
        return ((Boolean) this.simpleInArchiveImpl.testAndGetSafeSevenZipInArchive().getProperty(this.index, PropID.IS_FOLDER)).booleanValue();
    }

    public SimpleInArchiveItemImpl(IInArchive iInArchive, int i) {
        this.simpleInArchiveImpl = new SimpleInArchiveImpl(iInArchive);
        this.index = i;
    }
}
