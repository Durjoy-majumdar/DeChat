package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.IOutCreateArchiveZip;
import com.tencent.p014mm.mm7zip.IOutCreateCallback;
import com.tencent.p014mm.mm7zip.IOutItemZip;
import com.tencent.p014mm.mm7zip.IOutStream;
import com.tencent.p014mm.mm7zip.IOutUpdateArchiveZip;

/* renamed from: com.tencent.mm.mm7zip.impl.OutArchiveZipImpl */
public class OutArchiveZipImpl extends OutArchiveImpl<IOutItemZip> implements IOutCreateArchiveZip, IOutUpdateArchiveZip {
    public void createArchive(IOutStream iOutStream, int i, IOutCreateCallback<? extends IOutItemZip> iOutCreateCallback) {
        createArchive(iOutStream, i, iOutCreateCallback);
    }

    public void setLevel(int i) {
        featureSetLevel(i);
    }
}
