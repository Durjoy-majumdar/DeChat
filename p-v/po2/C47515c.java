package po2;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: po2.c */
public class C47515c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f127484d;

    /* renamed from: e */
    public final /* synthetic */ C47517e f127485e;

    public C47515c(C47517e eVar, String str) {
        this.f127485e = eVar;
        this.f127484d = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$2");
        C47517e eVar = this.f127485e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        eVar.getClass();
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        if (eVar.f127488b == null) {
            ViewStub viewStub = (ViewStub) eVar.f127487a.findViewById(C0966R.C0970id.g3n);
            if (viewStub != null) {
                eVar.f127488b = viewStub.inflate();
            }
            View view = eVar.f127488b;
            if (view != null) {
                ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.f5557ia);
                eVar.f127489c = (TextView) eVar.f127488b.findViewById(C0966R.C0970id.f5558ib);
                eVar.f127488b.setOnClickListener(new C47514b(eVar));
            }
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        if (C47517e.m52853a(this.f127485e) != null) {
            if (!TextUtils.isEmpty(this.f127484d)) {
                C47517e eVar2 = this.f127485e;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                TextView textView = eVar2.f127489c;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView.setText(this.f127484d);
                C47517e eVar3 = this.f127485e;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                TextView textView2 = eVar3.f127489c;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView2.setVisibility(0);
            } else {
                C47517e eVar4 = this.f127485e;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                TextView textView3 = eVar4.f127489c;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView3.setVisibility(8);
            }
            View a = C47517e.m52853a(this.f127485e);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = a;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$2");
    }
}
