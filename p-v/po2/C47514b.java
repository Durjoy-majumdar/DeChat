package po2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: po2.b */
public class C47514b implements View.OnClickListener {
    public C47514b(C47517e eVar) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$1");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
