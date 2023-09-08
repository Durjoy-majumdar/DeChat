package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.IArchiveOpenVolumeCallback */
public interface IArchiveOpenVolumeCallback {
    Object getProperty(PropID propID);

    IInStream getStream(String str);
}
