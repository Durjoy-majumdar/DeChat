package com.tencent.p014mm.plugin.appbrand.shortlink;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.plugin.appbrand.shortlink.a */
public final class C1970a implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C1256g<WxaShortLinkRiskManager.UploadResult> f11882d;

    public C1970a(C1256g<WxaShortLinkRiskManager.UploadResult> gVar) {
        this.f11882d = gVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (dVar == null) {
            C1256g<WxaShortLinkRiskManager.UploadResult> gVar = this.f11882d;
            if (gVar != null) {
                gVar.mo894a(new WxaShortLinkRiskManager.UploadResult(false, (String) null, 2, (C8480h) null));
            }
            return 0;
        } else if (i != 0) {
            C1256g<WxaShortLinkRiskManager.UploadResult> gVar2 = this.f11882d;
            if (gVar2 != null) {
                gVar2.mo894a(new WxaShortLinkRiskManager.UploadResult(false, (String) null, 2, (C8480h) null));
            }
            Log.m105925i("MicroMsg.WxaShortLinkRiskManager", "cdn upload failed, startRet : %d", Integer.valueOf(i));
            return 0;
        } else {
            int i2 = dVar.field_retCode;
            if (i2 != 0) {
                Log.m105921e("MicroMsg.WxaShortLinkRiskManager", "cdn upload failed, retCode:%d sceneResult[%s]", Integer.valueOf(i2), dVar);
                C1256g<WxaShortLinkRiskManager.UploadResult> gVar3 = this.f11882d;
                if (gVar3 != null) {
                    gVar3.mo894a(new WxaShortLinkRiskManager.UploadResult(false, (String) null, 2, (C8480h) null));
                }
            } else {
                Log.m105925i("MicroMsg.WxaShortLinkRiskManager", "cdn upload success, media id : %s  file url=%s   thumb url=%s", str, dVar.field_fileUrl, dVar.field_thumbUrl);
                C1256g<WxaShortLinkRiskManager.UploadResult> gVar4 = this.f11882d;
                if (gVar4 != null) {
                    String str2 = dVar.field_fileUrl;
                    C87412m.m108593f(str2, "sceneResult.field_fileUrl");
                    gVar4.mo894a(new WxaShortLinkRiskManager.UploadResult(true, str2));
                }
            }
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
