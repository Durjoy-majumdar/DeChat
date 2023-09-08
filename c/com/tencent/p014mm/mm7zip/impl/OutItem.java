package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.ArchiveFormat;
import com.tencent.p014mm.mm7zip.IOutArchive;
import com.tencent.p014mm.mm7zip.IOutItemAllFormats;
import com.tencent.p014mm.mm7zip.SevenZipException;
import java.util.Date;

/* renamed from: com.tencent.mm.mm7zip.impl.OutItem */
public final class OutItem implements IOutItemAllFormats {
    private Long dataSize;
    private int index;
    private IOutArchive<?> outArchive;
    private Integer propertyAttributes;
    private Date propertyCreationTime;
    private String propertyGroup;
    private String propertyHardLink;
    private Boolean propertyIsAnti;
    private Boolean propertyIsDir;
    private Date propertyLastAccessTime;
    private Date propertyLastModificationTime;
    private String propertyPath;
    private Integer propertyPosixAttributes;
    private String propertySymLink;
    private String propertyUser;
    private Boolean updateIsNewData;
    private Boolean updateIsNewProperties;
    private Integer updateOldArchiveItemIndex;

    public OutItem(IOutArchive<?> iOutArchive, int i) {
        this.outArchive = iOutArchive;
        this.index = i;
    }

    public ArchiveFormat getArchiveFormat() {
        return this.outArchive.getArchiveFormat();
    }

    public Long getDataSize() {
        return this.dataSize;
    }

    public int getIndex() {
        return this.index;
    }

    public IOutArchive<?> getOutArchive() {
        return this.outArchive;
    }

    public Integer getPropertyAttributes() {
        return this.propertyAttributes;
    }

    public Date getPropertyCreationTime() {
        return this.propertyCreationTime;
    }

    public String getPropertyGroup() {
        return this.propertyGroup;
    }

    public String getPropertyHardLink() {
        return this.propertyHardLink;
    }

    public Boolean getPropertyIsAnti() {
        return this.propertyIsAnti;
    }

    public Boolean getPropertyIsDir() {
        return this.propertyIsDir;
    }

    public Date getPropertyLastAccessTime() {
        return this.propertyLastAccessTime;
    }

    public Date getPropertyLastModificationTime() {
        return this.propertyLastModificationTime;
    }

    public String getPropertyPath() {
        return this.propertyPath;
    }

    public Integer getPropertyPosixAttributes() {
        return this.propertyPosixAttributes;
    }

    public String getPropertySymLink() {
        return this.propertySymLink;
    }

    public String getPropertyUser() {
        return this.propertyUser;
    }

    public Boolean getUpdateIsNewData() {
        return this.updateIsNewData;
    }

    public Boolean getUpdateIsNewProperties() {
        return this.updateIsNewProperties;
    }

    public Integer getUpdateOldArchiveItemIndex() {
        return this.updateOldArchiveItemIndex;
    }

    public void setDataSize(Long l) {
        this.dataSize = l;
    }

    public void setPropertyAttributes(Integer num) {
        this.propertyAttributes = num;
    }

    public void setPropertyCreationTime(Date date) {
        this.propertyCreationTime = date;
    }

    public void setPropertyGroup(String str) {
        this.propertyGroup = str;
    }

    public void setPropertyHardLink(String str) {
        this.propertyHardLink = str;
    }

    public void setPropertyIsAnti(Boolean bool) {
        this.propertyIsAnti = bool;
    }

    public void setPropertyIsDir(Boolean bool) {
        this.propertyIsDir = bool;
    }

    public void setPropertyLastAccessTime(Date date) {
        this.propertyLastAccessTime = date;
    }

    public void setPropertyLastModificationTime(Date date) {
        this.propertyLastModificationTime = date;
    }

    public void setPropertyPath(String str) {
        this.propertyPath = str;
    }

    public void setPropertyPosixAttributes(Integer num) {
        this.propertyPosixAttributes = num;
    }

    public void setPropertySymLink(String str) {
        this.propertySymLink = str;
    }

    public void setPropertyUser(String str) {
        this.propertyUser = str;
    }

    public void setUpdateIsNewData(Boolean bool) {
        this.updateIsNewData = bool;
    }

    public void setUpdateIsNewProperties(Boolean bool) {
        this.updateIsNewProperties = bool;
    }

    public void setUpdateOldArchiveItemIndex(Integer num) {
        this.updateOldArchiveItemIndex = num;
    }

    public void verify(boolean z) {
        if (!z) {
            return;
        }
        if (this.updateIsNewData == null) {
            throw new SevenZipException("updateIsNewData can't be null");
        } else if (this.updateIsNewProperties != null) {
            Integer num = this.updateOldArchiveItemIndex;
            if (num != null) {
                if (num.intValue() == -1) {
                    if (!this.updateIsNewData.booleanValue()) {
                        throw new SevenZipException("updateOldArchiveItemIndex must be provided (updateIsNewData is false)");
                    } else if (!this.updateIsNewProperties.booleanValue()) {
                        throw new SevenZipException("updateOldArchiveItemIndex must be provided (updateIsNewProperties is false)");
                    }
                }
                if (this.updateIsNewData.booleanValue() && !this.updateIsNewProperties.booleanValue()) {
                    throw new SevenZipException("updateIsNewProperties must be set (updateIsNewData is true)");
                }
                return;
            }
            throw new SevenZipException("updateOldArchiveItemIndex can't be null");
        } else {
            throw new SevenZipException("updateIsNewProperties can't be null");
        }
    }
}
