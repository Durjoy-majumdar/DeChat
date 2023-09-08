package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C98201k;

/* renamed from: com.tencent.mm.pluginsdk.model.app.q$$d */
public class q$$d implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ String f211508d;

    /* renamed from: e */
    public final /* synthetic */ String f211509e;

    public q$$d(C72689q qVar, String str, String str2) {
        this.f211508d = str;
        this.f211509e = str2;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        Log.m105925i("MicroMsg.AppMessageExtension", "getImgByCdn start callback: field_mediaId:%s cdnDataUrl:%s", str, this.f211508d);
        if (i != 0) {
            Log.m105921e("MicroMsg.AppMessageExtension", "getImgByCdn start failed: startRet:%d cdnDataUrl:%s", Integer.valueOf(i), this.f211508d);
            C72689q.m85027d(this.f211509e);
            return i;
        } else if (dVar == null) {
            return 0;
        } else {
            int i2 = dVar.field_retCode;
            if (i2 != 0) {
                Log.m105921e("MicroMsg.AppMessageExtension", "getImgByCdn failed: sceneResult.field_retCode:%d cdnDataUrl:%s", Integer.valueOf(i2), this.f211508d);
                C72689q.m85027d(this.f211509e);
                return dVar.field_retCode;
            }
            Log.m105925i("MicroMsg.AppMessageExtension", "getImgByCdn finished cdnDataUrl:%s", this.f211508d);
            ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi().doNotify();
            C72689q.m85027d(this.f211509e);
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }
}
