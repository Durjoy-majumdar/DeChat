package yn2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelstat.C29038l;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import jr2.C9509g;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yn2.c */
public class C39091c extends C86301e implements C9509g {
    public void Bi0(int i, String str, int i2) {
        SnsMethodCalculate.markStartTimeMs("doNetSceneAdDataReport", "com.tencent.mm.plugin.sns.AdDataReportService");
        C29038l lVar = new C29038l(i, str, i2);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(lVar);
        SnsMethodCalculate.markEndTimeMs("doNetSceneAdDataReport", "com.tencent.mm.plugin.sns.AdDataReportService");
    }
}
