package ap0;

import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Map;
import p969gc.C87174b;
import p969gc.C87175c;

/* renamed from: ap0.c */
public final class C79620c extends C87175c {
    /* renamed from: b */
    public final void mo109759b(QualitySession qualitySession) {
        C87412m.m108594g(qualitySession, "qualitySession");
        for (Map.Entry<Integer, C87174b<?>> value : this.f252816a.entrySet()) {
            C87174b bVar = (C87174b) value.getValue();
            if (bVar.f252811a != null) {
                try {
                    C79619a aVar = (C79619a) bVar;
                    ((C79619a) bVar).mo109758d(qualitySession);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrand.AppBrandParallelTaskCollection", "reportAll:report #" + bVar.mo109763b() + " task fail %s", e.getMessage());
                }
            }
        }
    }
}
