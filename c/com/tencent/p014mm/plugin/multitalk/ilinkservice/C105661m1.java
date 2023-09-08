package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.m1 */
public class C105661m1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314172d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f314173e;

    /* renamed from: f */
    public final /* synthetic */ C105724z.C105732h f314174f;

    public C105661m1(C105724z.C105732h hVar, int i, byte[] bArr) {
        this.f314174f = hVar;
        this.f314172d = i;
        this.f314173e = bArr;
    }

    public void run() {
        if (this.f314172d == 18) {
            byte[] bArr = this.f314173e;
            int byteArrayToInt = (bArr == null || bArr.length != 4) ? 0 : Util.byteArrayToInt(bArr);
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "tim: on switch av fail, retrySeconds: %s", Integer.valueOf(byteArrayToInt));
            C105608d dVar = C105724z.this.f314406p0;
            if (dVar != null) {
                Integer valueOf = Integer.valueOf(byteArrayToInt);
                dVar.getClass();
                ((C119157j) C119157j.f356862d).mo183895z(new C105640i(dVar, -1700, valueOf));
            }
        }
    }
}
