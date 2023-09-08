package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.modelimage.b0 */
public class C68115b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f195766d;

    public C68115b0(C92809c0 c0Var, long j) {
        this.f195766d = j;
    }

    public void run() {
        C68118i0 a = C68118i0.m80524a();
        long j = this.f195766d;
        a.getClass();
        Log.m105925i("MicroMsg.SendImgSpeeder", "removeImgUploadingOffset %s", Long.valueOf(j));
        a.f195774a.remove(Long.valueOf(j));
    }
}
