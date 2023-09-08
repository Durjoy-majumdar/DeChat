package com.tencent.p014mm.plugin.ext.qrcode;

import com.tencent.p014mm.plugin.ext.qrcode.C93387f;
import com.tencent.p014mm.plugin.facedetect.model.C93391x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.ext.qrcode.e */
public class C93386e implements C93391x {

    /* renamed from: a */
    public final /* synthetic */ C93387f.C93388a f269571a;

    public C93386e(C93387f.C93388a aVar) {
        this.f269571a = aVar;
    }

    /* renamed from: a */
    public void mo128189a(String str, int i, int i2) {
        Log.m105925i("MicroMsg.ExtQrCodeHandler", "hy: result: %s, code type: %d, code version: %d", str, Integer.valueOf(i), Integer.valueOf(i2));
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.ExtQrCodeHandler", "hy: not retrieved result!");
            this.f269571a.setResultFinish(null);
            return;
        }
        this.f269571a.setResultFinish(new C93387f.C93389b(i, str, i2));
    }
}
