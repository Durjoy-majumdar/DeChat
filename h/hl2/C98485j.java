package hl2;

import android.graphics.Point;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hl2.C98481i;
import te3.C101856vd;

/* renamed from: hl2.j */
public final class C98485j implements C98480h {

    /* renamed from: a */
    public final /* synthetic */ C98481i.C98484c f288850a;

    /* renamed from: b */
    public final /* synthetic */ C98486k f288851b;

    /* renamed from: c */
    public final /* synthetic */ C98481i.C98482a f288852c;

    /* renamed from: d */
    public final /* synthetic */ C98481i.C98483b f288853d;

    public C98485j(C98481i.C98484c cVar, C98486k kVar, C98481i.C98482a aVar, C98481i.C98483b bVar) {
        this.f288850a = cVar;
        this.f288851b = kVar;
        this.f288852c = aVar;
        this.f288853d = bVar;
    }

    /* renamed from: a */
    public void mo137846a(C98487l lVar) {
        C87412m.m108594g(lVar, "checkCDNImageResult");
        Log.m105924i("MicroMsg.AiScanImageCDNCheckHelper", "alvinluo checkImageCdnStatus result errType: " + lVar.f288859a + ", errCode: " + lVar.f288860b);
        C98481i.C98484c cVar = this.f288850a;
        cVar.f288847c = lVar.f288859a;
        cVar.f288848d = lVar.f288860b;
        cVar.getClass();
        cVar.f288849e = "check cdn image error";
        if (lVar.f288859a == 0 && lVar.f288860b == 0) {
            C98486k kVar = this.f288851b;
            int i = 0;
            if (C87412m.m108589b(kVar.f288854a, lVar.f288861c) && C87412m.m108589b(kVar.f288855b, lVar.f288862d)) {
                Log.m105925i("MicroMsg.AiScanImageCDNCheckHelper", "alvinluo checkImageCdnStatus no need to re-upload, fileId: %s", this.f288851b.f288854a);
            } else {
                Log.m105925i("MicroMsg.AiScanImageCDNCheckHelper", "alvinluo checkImageCdnStatus re-upload image fileId: %s", lVar.f288861c);
                C98481i.C98484c cVar2 = this.f288850a;
                C101856vd vdVar = new C101856vd();
                C98481i.C98483b bVar = this.f288853d;
                int i2 = bVar.f288843f;
                if (i2 == 1) {
                    vdVar.f299665d = 3;
                } else if (i2 == 0) {
                    vdVar.f299665d = 5;
                }
                Point point = bVar.f288840c;
                vdVar.f299666e = point != null ? point.x : 0;
                if (point != null) {
                    i = point.y;
                }
                vdVar.f299667f = i;
                vdVar.f299670i = 1;
                vdVar.f299668g = lVar.f288861c;
                vdVar.f299669h = lVar.f288862d;
                cVar2.f288846b = vdVar;
            }
        }
        C98481i.C98482a aVar = this.f288852c;
        if (aVar != null) {
            aVar.mo137842a(this.f288850a);
        }
    }

    /* renamed from: b */
    public void mo137848b(String str) {
        C87412m.m108594g(str, "mediaId");
        C98481i.C98482a aVar = this.f288852c;
        if (aVar != null) {
            aVar.mo137843b(str);
        }
    }
}
