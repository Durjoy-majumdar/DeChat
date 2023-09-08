package vp2;

import android.view.View;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import io2.C60570c;
import rq2.C101431r;
import tp2.C101914d;
import up2.C102060a;

/* renamed from: vp2.g */
public class C102232g extends C102060a {
    public C102232g(AdClickActionInfo adClickActionInfo) {
        this.f300548a = adClickActionInfo;
    }

    /* renamed from: c */
    public boolean mo73731c(View view, int i, SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
        if (snsInfo == null || adClickActionInfo == null || view == null) {
            Log.m105928w("SnsAd.FinderTopicActionButton", "the input param is invalid!!!");
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
            return false;
        }
        boolean a = C60570c.m70755a(view.getContext(), adClickActionInfo.f273640a0, adClickActionInfo.f273642b0, snsInfo, 6);
        if (a && dVar != null) {
            C101431r.m133118a((SnsAdClick) dVar.mo141403a("snsAdClick", null), 46);
        }
        SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderTopicActionButtonClick");
        return a;
    }
}
