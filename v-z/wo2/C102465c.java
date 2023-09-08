package wo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import wo2.C102466d;

/* renamed from: wo2.c */
public class C102465c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C102466d.C102467a f301720d;

    public C102465c(C102466d.C102467a aVar) {
        this.f301720d = aVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder$1");
        try {
            C102466d.m135252b(1673, 1, (long) this.f301720d.f301723a);
            C102466d.m135252b(1673, 2, (long) this.f301720d.f301724b);
            C102466d.m135252b(1673, 3, (long) this.f301720d.f301725c);
            C102466d.m135252b(1673, 4, (long) this.f301720d.f301726d);
            C102466d.m135252b(1673, 5, (long) this.f301720d.f301727e);
            C102466d.m135252b(1673, 15, (long) this.f301720d.f301728f);
            StringBuilder sb = new StringBuilder();
            sb.append("comInfo=");
            sb.append("imgCnt=" + this.f301720d.f301723a + ", sightCnt=" + this.f301720d.f301724b + ", streamCnt=" + this.f301720d.f301725c + ", commVideoCnt=" + this.f301720d.f301726d + ", total=" + this.f301720d.f301727e + ", normalTotal=" + this.f301720d.f301728f + "|" + "fpImgCnt=" + this.f301720d.f301729g + ", fpSightCnt=" + this.f301720d.f301730h + ", fpStreamCnt=" + this.f301720d.f301731i + ", fpCommVideoCnt=" + this.f301720d.f301732j + ", fpTotal=" + this.f301720d.f301733k + ", fpNormalTotal=" + this.f301720d.f301734l);
            Log.m105918d("AdLandingPageStaticHelper.ComponentStaticBuilder", sb.toString());
        } catch (Throwable th) {
            Log.m105920e("AdLandingPageStaticHelper.ComponentStaticBuilder", "report exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder$1");
    }
}
