package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.IInStream;
import com.tencent.p014mm.mm7zip.PropID;

/* renamed from: com.tencent.mm.mm7zip.impl.IArchiveOpenVolumeCallback */
public interface IArchiveOpenVolumeCallback {
    Object getProperty(PropID propID);

    IInStream getStream(String str);
}
