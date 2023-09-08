package p570iy;

import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsUploadReportStruct;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.model.NetSceneSnsPost;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95003w;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C117747y;
import ob0.C35142u;
import os2.C35299v;
import ur2.C102075b;

/* renamed from: iy.q */
public class C98891q implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsPostSceneEnd");
        if (yVar.getType() == 209) {
            Log.m105925i("MicroMsg.SnsPostSceneEnd", "snsPostSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(hashCode()));
            NetSceneSnsPost netSceneSnsPost = (NetSceneSnsPost) yVar;
            int n1 = netSceneSnsPost.mo130938n1();
            SnsMethodCalculate.markStartTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            if (n1 == C102075b.f300589c) {
                SnsCoverReportStruct snsCoverReportStruct = C102075b.f300587a;
                if (snsCoverReportStruct != null) {
                    snsCoverReportStruct.f265998o = (int) (System.currentTimeMillis() - C102075b.f300588b);
                }
                SnsCoverReportStruct snsCoverReportStruct2 = C102075b.f300587a;
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.f265997n = i3;
                }
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.mo86054n();
                }
                C102075b.f300587a = null;
            }
            SnsMethodCalculate.markEndTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            SnsMethodCalculate.markStartTimeMs("isDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            boolean z = netSceneSnsPost.f274724j;
            SnsMethodCalculate.markEndTimeMs("isDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            if (z) {
                SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                long j = netSceneSnsPost.f274722h;
                SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                Log.m105925i("MicroMsg.SnsPostSceneEnd", "get the del post come back %d " + j, Integer.valueOf(n1));
                int i4 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i4 != 0) {
                    C94866e1.Rx0().mo130947b(j);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94877g0(j, 1));
                }
                C94866e1.Yx0().mo139814bD(n1);
                if (i4 != 0) {
                    C94866e1.Tx0().mo139895jo(j);
                    C35299v.m40633a(j);
                }
            }
            if (i == 0 && i3 == 0) {
                C94866e1.gy0().mo131199j(netSceneSnsPost.mo130938n1(), true);
            } else {
                C94866e1.gy0().mo131199j(netSceneSnsPost.mo130938n1(), false);
            }
            C95003w.C95004a aVar = C95003w.f275626a;
            SnsMethodCalculate.markStartTimeMs("showTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
            long currentTimeMillis = System.currentTimeMillis();
            C95003w.C95004a aVar2 = C95003w.f275626a;
            SnsUploadReportStruct snsUploadReportStruct = aVar2.f275627a;
            long j2 = currentTimeMillis - aVar2.f275628b;
            snsUploadReportStruct.f266200o = j2;
            snsUploadReportStruct.mo86046c("TotalCostTimeMs", j2);
            C95003w.C95004a aVar3 = C95003w.f275626a;
            aVar3.f275627a.f266194i = 7;
            C95003w.m120754b(aVar3);
            SnsMethodCalculate.markEndTimeMs("showTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
            C94928p2 gy02 = C94866e1.gy0();
            gy02.getClass();
            SnsMethodCalculate.markStartTimeMs("setScenePost", "com.tencent.mm.plugin.sns.model.UploadManager");
            gy02.f275126b = null;
            SnsMethodCalculate.markEndTimeMs("setScenePost", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsPostSceneEnd");
    }
}
