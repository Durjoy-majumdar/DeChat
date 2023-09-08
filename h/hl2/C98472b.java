package hl2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: hl2.b */
public final class C98472b implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C98480h f288817d;

    /* renamed from: e */
    public final /* synthetic */ C98486k f288818e;

    public C98472b(C98480h hVar, C98486k kVar) {
        this.f288817d = hVar;
        this.f288818e = kVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (i != 0) {
            Log.m105920e("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage AIScanImageCdnUploader upload start fail: " + i);
            this.f288817d.mo137846a(new C98487l(3, 402));
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("checkCDNImage callback, mediaId:");
        sb.append(str);
        sb.append(" len:");
        Integer num = null;
        sb.append(cVar != null ? Long.valueOf(cVar.field_finishedLength) : null);
        sb.append(", totalLen:");
        sb.append(cVar != null ? Long.valueOf(cVar.field_toltalLength) : null);
        sb.append(", sceneResult.retCode: ");
        if (dVar != null) {
            num = Integer.valueOf(dVar.field_retCode);
        }
        sb.append(num);
        Log.m105924i("MicroMsg.AIScanImageCdnUploadUtil", sb.toString());
        if (dVar != null) {
            C98480h hVar = this.f288817d;
            C98486k kVar = this.f288818e;
            if (dVar.field_retCode != 0) {
                Log.m105920e("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage result fail: " + dVar.field_retCode);
                hVar.mo137846a(new C98487l(3, 403));
            } else {
                Log.m105924i("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage success");
                C98487l lVar = new C98487l(0, 0);
                int i2 = kVar.f288856c;
                String str2 = dVar.field_fileId;
                C87412m.m108593f(str2, "sceneResult.field_fileId");
                lVar.f288861c = str2;
                String str3 = dVar.field_aesKey;
                C87412m.m108593f(str3, "sceneResult.field_aesKey");
                lVar.f288862d = str3;
                hVar.mo137846a(lVar);
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        Log.m105924i("MicroMsg.AIScanImageCdnUploadUtil", "checkCDNImage getCdnAuthInfo, mediaId = " + str);
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        Log.m105925i("MicroMsg.AIScanImageCdnUploadUtil", "decodePrepareResponse, mediaId = %s", str);
        return new byte[0];
    }
}
