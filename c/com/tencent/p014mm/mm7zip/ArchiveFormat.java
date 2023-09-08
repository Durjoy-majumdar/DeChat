package com.tencent.p014mm.mm7zip;

import com.tencent.p014mm.mm7zip.impl.OutArchive7zImpl;
import com.tencent.p014mm.mm7zip.impl.OutArchiveImpl;
import com.tencent.p014mm.mm7zip.impl.OutArchiveZipImpl;

/* renamed from: com.tencent.mm.mm7zip.ArchiveFormat */
public enum ArchiveFormat {
    ZIP("Zip", OutArchiveZipImpl.class, true),
    SEVEN_ZIP("7z", OutArchive7zImpl.class, true);
    
    private int codecIndex;
    private String methodName;
    public Class<? extends OutArchiveImpl<?>> outArchiveImplementation;
    private boolean supportMultipleFiles;

    private ArchiveFormat(String str, boolean z) {
        this(r7, r8, str, (Class<? extends OutArchiveImpl<?>>) null, z);
    }

    public static ArchiveFormat findOutArchiveImplementationToInterface(Class<? extends IOutCreateArchive<?>> cls) {
        for (ArchiveFormat archiveFormat : values()) {
            Class<? extends OutArchiveImpl<?>> outArchiveImplementation2 = archiveFormat.getOutArchiveImplementation();
            if (outArchiveImplementation2 != null && cls.isAssignableFrom(outArchiveImplementation2)) {
                return archiveFormat;
            }
        }
        Class<IOutArchive> cls2 = IOutArchive.class;
        throw new SevenZipException("Can't determine corresponding archive format to the interface IOutArchive.");
    }

    public String getMethodName() {
        return this.methodName;
    }

    public Class<? extends OutArchiveImpl<?>> getOutArchiveImplementation() {
        return this.outArchiveImplementation;
    }

    public boolean isOutArchiveSupported() {
        return this.outArchiveImplementation != null;
    }

    public boolean supportMultipleFiles() {
        return this.supportMultipleFiles;
    }

    public String toString() {
        return this.methodName;
    }

    private ArchiveFormat(String str, Class<? extends OutArchiveImpl<?>> cls, boolean z) {
        this.codecIndex = -2;
        this.methodName = str;
        this.outArchiveImplementation = cls;
        this.supportMultipleFiles = z;
    }
}
