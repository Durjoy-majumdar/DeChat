package p281yz;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import di3.C86301e;
import eb0.C45628s0;
import ei3.C86522b;
import gy3.C87412m;
import p287zz.C16417e;

@C86522b
/* renamed from: yz.p */
public final class C79170p extends C86301e implements C16417e {
    /* renamed from: Qm */
    public int mo14874Qm(String str) {
        return (C72996z1.m85843n5(str) ? WCPaySessionInfoRecorder.C72488a.EnterpriseTimeline : C72996z1.m85809L5(str) ? WCPaySessionInfoRecorder.C72488a.Timeline : WCPaySessionInfoRecorder.C72488a.Unknown).f210873d;
    }

    /* renamed from: Zg */
    public int mo14875Zg(String str) {
        return (C45628s0.m50748M(str) ? WCPaySessionInfoRecorder.C72488a.EnterpriseGroup : C72996z1.m85843n5(str) ? WCPaySessionInfoRecorder.C72488a.EnterpriseSingle : C72996z1.m85807K5(str) ? WCPaySessionInfoRecorder.C72488a.Group : C72996z1.m85809L5(str) ? WCPaySessionInfoRecorder.C72488a.Single : WCPaySessionInfoRecorder.C72488a.Unknown).f210873d;
    }

    public int kb0(String str) {
        return (C72996z1.m85809L5(str) ? WCPaySessionInfoRecorder.C72491c.Common : C72996z1.m85843n5(str) ? WCPaySessionInfoRecorder.C72491c.Enterprise : WCPaySessionInfoRecorder.C72491c.Unknown).f210882d;
    }

    /* renamed from: nf */
    public void mo14877nf(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "bizType");
        C87412m.m108594g(str2, "bizId");
        C87412m.m108594g(str3, OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        C87412m.m108594g(str4, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        C115669n.INSTANCE.mo160131h(24610, str, str2, str3, str4);
    }
}
