package p570iy;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverReportStruct;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94925p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95003w;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C35142u;
import ur2.C102075b;

/* renamed from: iy.s */
public class C98892s implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEnd");
        if (yVar.getType() == 207) {
            int i3 = 0;
            Log.m105925i("MicroMsg.SnsUploadSceneEnd", "snsUploadSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(hashCode()));
            boolean z = yVar instanceof C94925p0;
            if (z) {
                i3 = ((C94925p0) yVar).mo131184j1();
            }
            C95003w.m120753a(i3, i, i2);
            if (!(i == 0 && i2 == 0)) {
                C94866e1.gy0().mo131192c();
                if (z) {
                    int i4 = i2 + 10000;
                    SnsMethodCalculate.markStartTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                    if (i3 == C102075b.f300589c) {
                        SnsCoverReportStruct snsCoverReportStruct = C102075b.f300587a;
                        if (snsCoverReportStruct != null) {
                            snsCoverReportStruct.f265998o = (int) (System.currentTimeMillis() - C102075b.f300588b);
                        }
                        SnsCoverReportStruct snsCoverReportStruct2 = C102075b.f300587a;
                        if (snsCoverReportStruct2 != null) {
                            snsCoverReportStruct2.f265997n = i4;
                        }
                        if (snsCoverReportStruct2 != null) {
                            snsCoverReportStruct2.mo86054n();
                        }
                        C102075b.f300587a = null;
                    }
                    SnsMethodCalculate.markEndTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEnd");
    }
}
