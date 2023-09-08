package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.modelsimple.o0 */
public class C55390o0 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ String f157757d;

    public C55390o0(String str) {
        this.f157757d = str;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.PostTaskUploadHDHeadImg", "onSceneEnd errType:%d, erCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            C86013q1.m106447h(this.f157757d);
        }
        C55391p0.f157759b = false;
        C86709a0.m107524d().mo123470p(157, C55391p0.f157758a);
    }
}
