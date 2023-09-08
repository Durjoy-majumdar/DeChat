package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.IArchiveExtractCallback */
public interface IArchiveExtractCallback extends IProgress {
    ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode);

    void prepareOperation(ExtractAskMode extractAskMode);

    void setOperationResult(ExtractOperationResult extractOperationResult);
}
