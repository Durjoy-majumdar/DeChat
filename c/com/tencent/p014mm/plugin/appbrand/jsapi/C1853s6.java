package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1878t6;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.s6 */
public class C1853s6 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C1256g f11667d;

    public C1853s6(C1878t6.C1879a aVar, C1256g gVar) {
        this.f11667d = gVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (dVar != null) {
            int i2 = dVar.field_retCode;
            if (i2 != 0) {
                Log.m105921e("MicroMsg.JsApiUploadToCommonCDN", "cdn upload failed, retCode:%d sceneResult[%s]", Integer.valueOf(i2), dVar);
                Bundle bundle = new Bundle();
                bundle.putInt("ret", 1);
                this.f11667d.mo894a(bundle);
            } else {
                Log.m105925i("MicroMsg.JsApiUploadToCommonCDN", "cdn upload success, media id : %s  file url=%s   thumb url=%s", str, dVar.field_fileUrl, dVar.field_thumbUrl);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("ret", 0);
                bundle2.putString("fileUrl", dVar.field_fileUrl);
                bundle2.putString("thumbUrl", dVar.field_thumbUrl);
                this.f11667d.mo894a(bundle2);
            }
        }
        if (i != 0) {
            Log.m105925i("MicroMsg.JsApiUploadToCommonCDN", "cdn upload failed, startRet : %d", Integer.valueOf(i));
            Bundle bundle3 = new Bundle();
            bundle3.putInt("ret", 1);
            this.f11667d.mo894a(bundle3);
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
