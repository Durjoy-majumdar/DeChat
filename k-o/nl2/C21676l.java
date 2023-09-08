package nl2;

import android.graphics.Point;
import cl2.C28609a;
import com.tencent.p014mm.plugin.scanner.model.C19011d;
import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C19027m0;
import com.tencent.p014mm.plugin.scanner.model.ScanFastFocusEngineNative;
import com.tencent.p014mm.plugin.scanner.model.ScanProductInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl2.C20469e;
import nl2.C21681q;
import rx3.C13604l;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: nl2.l */
public final class C21676l implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ C21683r f61342d;

    /* renamed from: e */
    public final /* synthetic */ C21672j f61343e;

    public C21676l(C21683r rVar, C21672j jVar) {
        this.f61342d = rVar;
        this.f61343e = jVar;
    }

    public final void run() {
        int i;
        int i2 = C28609a.f78508h;
        C20469e.C20472c cVar = C20469e.f57530v.f57536d;
        int i3 = 1;
        if (cVar != null) {
            cVar.f57569j++;
        }
        C21683r rVar = this.f61342d;
        Log.m105929w("MicroMsg.NewAiImageHandler", "uploadFullImage fullImageData: %s, source: %s, session: %s, originImageType: %d", rVar.f61386g, Integer.valueOf(rVar.f61380a), Long.valueOf(this.f61342d.f61381b), Integer.valueOf(i2));
        C21683r rVar2 = this.f61342d;
        byte[] bArr = rVar2.f61386g;
        int i4 = bArr == null ? 1 : 0;
        C19011d.C19012a aVar = new C19011d.C19012a(0);
        if (bArr != null) {
            C21672j jVar = this.f61343e;
            C21669g gVar = (C21669g) ((C36570n) jVar.f61336i).getValue();
            synchronized (Integer.valueOf(gVar.f61324a)) {
                i = gVar.f61324a - 1;
                gVar.f61324a = i;
            }
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr2 = null;
            if (i2 == 1) {
                C19021i0 i0Var = C19021i0.f53455a;
                if (C19021i0.f53461g) {
                    ScanFastFocusEngineNative scanFastFocusEngineNative = C19021i0.f53460f;
                    scanFastFocusEngineNative.fullImageData = null;
                    ScanFastFocusEngineNative uploadFullYUVImage = scanFastFocusEngineNative.getUploadFullYUVImage(bArr, i, false, 30.0f);
                    if (uploadFullYUVImage != null) {
                        bArr2 = uploadFullYUVImage.fullImageData;
                    }
                }
            } else if (i2 != 2) {
                C19021i0 i0Var2 = C19021i0.f53455a;
                if (C19021i0.f53461g) {
                    ScanFastFocusEngineNative scanFastFocusEngineNative2 = C19021i0.f53460f;
                    scanFastFocusEngineNative2.fullImageData = null;
                    ScanFastFocusEngineNative uploadFullYUVImage2 = scanFastFocusEngineNative2.getUploadFullYUVImage(bArr, i, false, 30.0f);
                    if (uploadFullYUVImage2 != null) {
                        bArr2 = uploadFullYUVImage2.fullImageData;
                    }
                }
                i2 = 1;
            } else if (C19021i0.f53461g) {
                ScanFastFocusEngineNative scanFastFocusEngineNative3 = C19021i0.f53460f;
                scanFastFocusEngineNative3.fullImageData = null;
                ScanFastFocusEngineNative uploadFullRGBAImage = scanFastFocusEngineNative3.getUploadFullRGBAImage(bArr, i, false, 30.0f);
                Log.m105927v("MicroMsg.ScanFastFocusEngineManager", "getUploadFullRGBAImage %s", C19021i0.f53460f.fullImageData);
                if (uploadFullRGBAImage != null) {
                    bArr2 = uploadFullRGBAImage.fullImageData;
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (bArr2 != null) {
                Point point = new Point(C19021i0.f53467m, C19021i0.f53468n);
                int i5 = C28609a.f78509i;
                long currentTimeMillis3 = System.currentTimeMillis();
                C13604l<byte[], Integer> e = jVar.mo33941e(bArr2, i2, i5, point);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                byte[] bArr3 = (byte[]) e.f38555d;
                int intValue = ((Number) e.f38556e).intValue();
                if (bArr3 != null) {
                    ScanProductInfo scanProductInfo = new ScanProductInfo();
                    scanProductInfo.setId(i);
                    int i6 = i4;
                    Log.m105919d("MicroMsg.NewAiImageHandler", "uploadFullImage localTrackId: %s", Integer.valueOf(scanProductInfo.getId()));
                    C21681q qVar = new C21681q(scanProductInfo);
                    C21681q.C21682a aVar2 = qVar.f61363f;
                    aVar2.f61371g = currentTimeMillis2;
                    aVar2.f61372h = currentTimeMillis4;
                    int length = bArr3.length;
                    aVar2.f61373i = length;
                    if (intValue == 1) {
                        i3 = 2;
                    } else if (intValue != 2) {
                        i3 = intValue != 3 ? -1 : 3;
                    }
                    aVar2.f61377m = i3;
                    aVar.f53411a = i3;
                    aVar.f53412b = length;
                    qVar.f61364g = aVar;
                    C19011d.m20064a(20, aVar);
                    C21656b bVar = jVar.f61335h;
                    C21670h hVar = new C21670h(qVar, 3, bArr3, intValue, point.x, point.y);
                    hVar.f61333m = i;
                    hVar.f61284c = rVar2.f61380a;
                    hVar.f61283b = rVar2.f61381b;
                    hVar.f61285d = 0;
                    bVar.getClass();
                    ((C119157j) C119157j.f356862d).mo183876g(new C21667e(hVar, bVar), "AiScanImageGetProductManager");
                    i3 = i6;
                } else {
                    C20469e.C20472c cVar2 = C20469e.f57530v.f57536d;
                    if (cVar2 != null) {
                        cVar2.f57570k++;
                    }
                }
            } else {
                C20469e.C20472c cVar3 = C20469e.f57530v.f57536d;
                if (cVar3 != null) {
                    cVar3.f57570k++;
                }
            }
            i4 = i3;
        } else {
            int i7 = i4;
        }
        if (i4 != 0) {
            C19011d.m20064a(21, aVar);
        }
    }
}
