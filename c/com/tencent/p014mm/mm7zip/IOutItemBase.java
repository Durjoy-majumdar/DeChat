package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.IOutItemBase */
public interface IOutItemBase {
    ArchiveFormat getArchiveFormat();

    Long getDataSize();

    int getIndex();

    IOutArchive<?> getOutArchive();

    Boolean getUpdateIsNewData();

    Boolean getUpdateIsNewProperties();

    Integer getUpdateOldArchiveItemIndex();

    void setDataSize(Long l);

    void setUpdateIsNewData(Boolean bool);

    void setUpdateIsNewProperties(Boolean bool);

    void setUpdateOldArchiveItemIndex(Integer num);
}
