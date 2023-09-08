package com.tencent.p014mm.mm7zip.simple;

import com.tencent.p014mm.mm7zip.ExtractOperationResult;
import com.tencent.p014mm.mm7zip.ISequentialOutStream;
import java.util.Date;

/* renamed from: com.tencent.mm.mm7zip.simple.ISimpleInArchiveItem */
public interface ISimpleInArchiveItem {
    ExtractOperationResult extractSlow(ISequentialOutStream iSequentialOutStream);

    Integer getAttributes();

    Integer getCRC();

    String getComment();

    Date getCreationTime();

    String getGroup();

    String getHostOS();

    int getItemIndex();

    Date getLastAccessTime();

    Date getLastWriteTime();

    String getMethod();

    Long getPackedSize();

    String getPath();

    Integer getPosition();

    Long getSize();

    String getUser();

    Boolean isCommented();

    boolean isEncrypted();

    boolean isFolder();
}
