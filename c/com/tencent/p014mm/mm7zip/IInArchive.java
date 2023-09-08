package com.tencent.p014mm.mm7zip;

import com.tencent.p014mm.mm7zip.simple.ISimpleInArchive;
import java.io.Closeable;

/* renamed from: com.tencent.mm.mm7zip.IInArchive */
public interface IInArchive extends Closeable {
    void close();

    void extract(int[] iArr, boolean z, IArchiveExtractCallback iArchiveExtractCallback);

    ExtractOperationResult extractSlow(int i, ISequentialOutStream iSequentialOutStream);

    ArchiveFormat getArchiveFormat();

    Object getArchiveProperty(PropID propID);

    PropertyInfo getArchivePropertyInfo(int i);

    IOutUpdateArchive<IOutItemAllFormats> getConnectedOutArchive();

    IOutUpdateArchive7z getConnectedOutArchive7z();

    IOutUpdateArchiveZip getConnectedOutArchiveZip();

    int getNumberOfArchiveProperties();

    int getNumberOfItems();

    int getNumberOfProperties();

    Object getProperty(int i, PropID propID);

    PropertyInfo getPropertyInfo(int i);

    ISimpleInArchive getSimpleInterface();

    String getStringArchiveProperty(PropID propID);

    String getStringProperty(int i, PropID propID);
}
