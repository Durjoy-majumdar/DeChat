package po2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: po2.d */
public class C47516d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C47517e f127486d;

    public C47516d(C47517e eVar) {
        this.f127486d = eVar;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$3");
        if (C47517e.m52853a(this.f127486d) != null) {
            View a = C47517e.m52853a(this.f127486d);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(a, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(a, "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$3");
    }
}
