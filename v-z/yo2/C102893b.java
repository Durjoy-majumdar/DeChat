package yo2;

import cc0.C92411b;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: yo2.b */
public class C102893b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102894c f303713d;

    public C102893b(C102894c cVar) {
        this.f303713d = cVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester$1");
        try {
            C102894c cVar = this.f303713d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            C92411b bVar = cVar.f303717g;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            bVar.mo126408b(this.f303713d);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester$1");
    }
}
