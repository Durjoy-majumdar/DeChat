package tz2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: tz2.d */
public final class C78117d implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C78116c f228926d;

    public C78117d(C78116c cVar) {
        this.f228926d = cVar;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C87412m.m108594g(str, "mediaId");
        if (i == -21005) {
            Log.m105919d("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback1 clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
            return 0;
        } else if (dVar != null && dVar.field_retCode == 0) {
            Log.m105925i("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback2 clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
            this.f228926d.mo108098a(0, true, dVar);
            return 0;
        } else if (dVar != null && dVar.field_retCode != 0) {
            Log.m105925i("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback3 clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
            this.f228926d.mo108098a(dVar.field_retCode, false, dVar);
            return 0;
        } else if (i != 0) {
            Log.m105925i("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback4 clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
            this.f228926d.mo108098a(i, false, dVar);
            return 0;
        } else {
            Log.m105919d("MicroMsg.TextStatus.TextStatusUploader", "cdntra cdnCallback5 clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
            return 0;
        }
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(byteArrayOutputStream, "buff");
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(bArr, "inbuf");
        return null;
    }
}
