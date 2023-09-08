package po2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: po2.e */
public class C47517e {

    /* renamed from: a */
    public SnsAdNativeLandingPagesUI f127487a;

    /* renamed from: b */
    public View f127488b;

    /* renamed from: c */
    public TextView f127489c;

    public C47517e(SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f127487a = snsAdNativeLandingPagesUI;
    }

    /* renamed from: a */
    public static /* synthetic */ View m52853a(C47517e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        View view = eVar.f127488b;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        return view;
    }
}
