package com.tencent.p014mm.mm7zip;

import com.tencent.p014mm.mm7zip.SevenZipUtil;

/* renamed from: com.tencent.mm.mm7zip.SevenZipUtil$ExtractCallback$$a */
public final /* synthetic */ class SevenZipUtil$ExtractCallback$$a implements ISequentialOutStream {

    /* renamed from: d */
    public final /* synthetic */ SevenZipUtil.ExtractCallback f48961d;

    /* renamed from: e */
    public final /* synthetic */ int f48962e;

    public /* synthetic */ SevenZipUtil$ExtractCallback$$a(SevenZipUtil.ExtractCallback extractCallback, int i) {
        this.f48961d = extractCallback;
        this.f48962e = i;
    }

    public final int write(byte[] bArr) {
        return this.f48961d.lambda$getStream$0(this.f48962e, bArr);
    }
}
