package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.mars.p468mm.MMLogic;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.messenger.foundation.C69836a0;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import f62.C31934j0;
import f62.C75699i1;
import f62.C75701k1;
import nr3.C35015b;
import ob0.C35136m;
import ob0.C89137b0;
import te3.C49775hz3;
import te3.C49782i1;
import te3.C49799i43;
import te3.C49927j1;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.y$$a */
public final /* synthetic */ class y$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C30279y f115171d;

    /* renamed from: e */
    public final /* synthetic */ int f115172e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f115173f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f115174g;

    public /* synthetic */ y$$a(C30279y yVar, int i, byte[] bArr, byte[] bArr2) {
        this.f115171d = yVar;
        this.f115172e = i;
        this.f115173f = bArr;
        this.f115174g = bArr2;
    }

    public final void run() {
        C114770g gVar;
        C30279y yVar = this.f115171d;
        int i = this.f115172e;
        byte[] bArr = this.f115173f;
        byte[] bArr2 = this.f115174g;
        yVar.getClass();
        if (i == 321 && bArr != null) {
            C49775hz3 hz32 = new C49775hz3();
            try {
                hz32.parseFrom(bArr);
                byte[] bArr3 = hz32.f134985d.f257327a;
                if (hz32.f134986e != null) {
                    C49782i1 i1Var = new C49782i1();
                    i1Var.parseFrom(hz32.f134986e.f257327a);
                    if (i1Var.f135018d) {
                        C49927j1 j1Var = i1Var.f135019e;
                        Log.m105925i("MicroMsg.SecurityNotifyReceiverCallback", "summerbadcr MM_PKT_SILENCE_NOTIFY secureData[%d, %d, %d, %d, %d, %d]", Integer.valueOf(j1Var.f135802e), Integer.valueOf(j1Var.f135803f), Integer.valueOf(j1Var.f135804g), Integer.valueOf(j1Var.f135805h), Integer.valueOf(j1Var.f135806i), Integer.valueOf(j1Var.f135807j));
                        int i2 = j1Var.f135802e;
                        if (i2 == 13) {
                            C86709a0.m107528h();
                            byte[] c = C86709a0.m107529k().mo121128c(3);
                            bArr3 = UtilsJni.AesGcmDecryptWithUncompress(c, bArr3);
                            Object[] objArr = new Object[2];
                            int i3 = -1;
                            objArr[0] = Integer.valueOf(c == null ? -1 : c.length);
                            if (bArr3 != null) {
                                i3 = bArr3.length;
                            }
                            objArr[1] = Integer.valueOf(i3);
                            Log.m105925i("MicroMsg.SecurityNotifyReceiverCallback", "summerbadcr MM_PKT_SILENCE_NOTIFY AES_GCM_ENCRYPT serverSession[%s] data[%s]", objArr);
                        } else {
                            bArr3 = MMProtocalJni.decodeSecureNotifyData(bArr2, i2, j1Var.f135803f, j1Var.f135804g, j1Var.f135805h, j1Var.f135806i, j1Var.f135807j, j1Var.f135808n, bArr3);
                        }
                    }
                }
                C49799i43 i432 = new C49799i43();
                i432.parseFrom(bArr3);
                C31934j0 j0Var = (C31934j0) C86312j.m106911c(C31934j0.class);
                C75699i1 i1Var2 = null;
                C35136m.C35137a aVar = new C35136m.C35137a(i432.f135104d, (Object) null);
                C35015b<C75699i1> bVar = C75701k1.f222304b;
                if (bVar != null) {
                    i1Var2 = bVar.get();
                }
                if (i1Var2 == null) {
                    i1Var2 = new C69836a0.C69838b();
                }
                j0Var.mo57256nn(aVar, i1Var2);
                C86709a0.m107524d().f256809d.mo55475g5("", hz32.f134987f, MMLogic.ACTION_ACK_OK);
                Log.m105925i("MicroMsg.SecurityNotifyReceiverCallback", "deal succ, taskid:%d", Long.valueOf(hz32.f134987f));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SecurityNotifyReceiverCallback", e, "taskid:%d", Long.valueOf(hz32.f134987f));
                C89137b0 d = C86709a0.m107524d();
                if (d != null && (gVar = d.f256809d) != null) {
                    gVar.mo55475g5("", hz32.f134987f, MMLogic.ACTION_ACK_FAILED);
                }
            }
        }
    }
}
