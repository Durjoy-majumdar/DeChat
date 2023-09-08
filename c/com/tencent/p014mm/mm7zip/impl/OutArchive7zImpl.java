package com.tencent.p014mm.mm7zip.impl;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.mm7zip.IOutCreateArchive7z;
import com.tencent.p014mm.mm7zip.IOutItem7z;
import com.tencent.p014mm.mm7zip.IOutUpdateArchive7z;

/* renamed from: com.tencent.mm.mm7zip.impl.OutArchive7zImpl */
public class OutArchive7zImpl extends OutArchiveImpl<IOutItem7z> implements IOutCreateArchive7z, IOutUpdateArchive7z {
    private long countOfBytesPerBlock = -1;
    private int countOfFilesPerBlock = -1;
    private boolean solid = true;
    private boolean solidExtension;

    public void applyFeatures() {
        super.applyFeatures();
        StringBuilder sb = new StringBuilder();
        if (this.solidExtension) {
            sb.append(ExifInterface.LONGITUDE_EAST);
        }
        int i = this.countOfFilesPerBlock;
        if (i != -1) {
            sb.append(i);
            sb.append("F");
        }
        long j = this.countOfBytesPerBlock;
        if (j != -1) {
            sb.append(j);
            sb.append("B");
        }
        if (sb.length() > 0) {
            nativeSetSolidSpec(sb.toString());
        }
        if (!this.solid) {
            nativeSetSolidSpec((String) null);
        }
    }

    public void setHeaderEncryption(boolean z) {
        featureSetHeaderEncryption(z);
    }

    public void setLevel(int i) {
        featureSetLevel(i);
    }

    public void setSolid(boolean z) {
        this.solid = z;
    }

    public void setSolidExtension(boolean z) {
        this.solidExtension = z;
    }

    public void setSolidFiles(int i) {
        this.countOfFilesPerBlock = i;
    }

    public void setSolidSize(long j) {
        this.countOfBytesPerBlock = j;
    }

    public void setThreadCount(int i) {
        featureSetThreadCount(i);
    }
}
