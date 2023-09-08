package com.tencent.p014mm.mm7zip;

import java.util.Date;

/* renamed from: com.tencent.mm.mm7zip.IOutItemZip */
public interface IOutItemZip extends IOutItemBase {
    Integer getPropertyAttributes();

    Date getPropertyCreationTime();

    Boolean getPropertyIsDir();

    Date getPropertyLastAccessTime();

    Date getPropertyLastModificationTime();

    String getPropertyPath();

    void setPropertyAttributes(Integer num);

    void setPropertyCreationTime(Date date);

    void setPropertyIsDir(Boolean bool);

    void setPropertyLastAccessTime(Date date);

    void setPropertyLastModificationTime(Date date);

    void setPropertyPath(String str);
}
