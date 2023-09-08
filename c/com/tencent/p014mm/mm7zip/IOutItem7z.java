package com.tencent.p014mm.mm7zip;

import java.util.Date;

/* renamed from: com.tencent.mm.mm7zip.IOutItem7z */
public interface IOutItem7z extends IOutItemBase {
    Integer getPropertyAttributes();

    Boolean getPropertyIsAnti();

    Boolean getPropertyIsDir();

    Date getPropertyLastModificationTime();

    String getPropertyPath();

    void setPropertyAttributes(Integer num);

    void setPropertyIsAnti(Boolean bool);

    void setPropertyIsDir(Boolean bool);

    void setPropertyLastModificationTime(Date date);

    void setPropertyPath(String str);
}
