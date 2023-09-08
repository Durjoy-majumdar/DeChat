package p160gy;

import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86301e;
import ei3.C86522b;
import p166hy.C87602w;
import p166hy.C98559a0;

@C86522b
/* renamed from: gy.a */
public class C87408a extends C86301e implements C87602w {
    /* renamed from: Br */
    public void mo121824Br(String str, String str2, String str3, int i, C98559a0 a0Var) {
        SnsMethodCalculate.markStartTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadService");
        AdLandingPagesProxy.getInstance().downloadLandingPagesCDNFile(str, str2, str3, i, a0Var);
        SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.feature.sns.ADLandingPagesCDNDownloadService");
    }
}
