package com.tencent.p014mm.plugin.ext.qrcode;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import za1.C53766a;

/* renamed from: com.tencent.mm.plugin.ext.qrcode.g */
public class C41391g implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C41392h f111436d;

    public C41391g(C41392h hVar) {
        this.f111436d = hVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = ((C53766a) yVar).f150913f == 0;
        Log.m105925i("MicroMsg.ExtQrCodeHandler", "hy: check url done. errType: %d, errCode: %d, errMsg %s, scene: %b", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(z));
        C86709a0.m107529k().f251779b.mo123470p(782, this);
        if (i == 0 && i2 == 0) {
            this.f111436d.setResultFinish(Boolean.valueOf(z));
        } else {
            this.f111436d.setResultFinish(Boolean.FALSE);
        }
    }
}
