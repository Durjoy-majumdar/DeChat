package zp2;

import android.view.View;
import co2.C92443k;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import io2.C60570c;
import tp2.C101914d;
import yp2.C102895a;

/* renamed from: zp2.a */
public class C103052a extends C102895a {
    /* renamed from: c */
    public boolean mo142614c(View view, int i, SnsInfo snsInfo, ADXml aDXml, C101914d dVar) {
        SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        C92443k kVar = aDXml.adFinderTopicInfo;
        if (kVar == null || view == null) {
            Log.m105928w("SnsAd.FinderTopicMaterialClick", "the finder topic info is null!!");
            SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
            return false;
        }
        boolean a = C60570c.m70755a(view.getContext(), kVar.f264539a, kVar.f264540b, snsInfo, 6);
        SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        return a;
    }

    /* renamed from: d */
    public int mo142615d() {
        SnsMethodCalculate.markStartTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        SnsMethodCalculate.markEndTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        return 46;
    }
}
