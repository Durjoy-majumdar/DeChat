package wo2;

import android.os.Parcelable;
import ap2.C27993a;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.preload.PreloadInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: wo2.j */
public class C38248j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f100999d;

    /* renamed from: wo2.j$a */
    public class C38249a implements Runnable {
        public C38249a(C38248j jVar) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1$1");
            C102474i.m135260a();
            String name = PreloadInfo.class.getName();
            C27993a aVar = C27993a.f77262a;
            SnsMethodCalculate.markStartTimeMs("getProcessPreload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            C32226l<Parcelable, C13598b0> lVar = C27993a.f77264c;
            SnsMethodCalculate.markEndTimeMs("getProcessPreload", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            C102474i.m135261b(name, lVar);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1$1");
        }
    }

    public C38248j(long j) {
        this.f100999d = j;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1");
        Log.m105924i("AdToolsProcessPreloader", "AdLandingPagesProxy connected, cost=" + (System.currentTimeMillis() - this.f100999d));
        ((C119157j) C119157j.f356862d).mo183884o(new C38249a(this));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsProcessPreloader$1");
    }
}
