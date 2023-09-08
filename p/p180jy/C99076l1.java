package p180jy;

import com.tencent.p014mm.autogen.events.ReportAdH5LoadEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import vr2.C102236a0;

/* renamed from: jy.l1 */
public class C99076l1 extends IStaticListener<ReportAdH5LoadEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        ReportAdH5LoadEvent reportAdH5LoadEvent = (ReportAdH5LoadEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        boolean z = true;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ReportAdH5LoadListener", "ReportAdH5LoadEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        } else {
            try {
                SnsAdClick snsAdClick = reportAdH5LoadEvent.f107740d.f107741a;
                AdSnsInfo jo = C94866e1.zx0().mo139864jo(snsAdClick.f267471f);
                Log.m105924i("MicroMsg.ReportAdH5LoadListener", "ad h5 report, snsId=" + C102236a0.m134765q0(snsAdClick.f267471f) + ", reportType=" + reportAdH5LoadEvent.f107740d.f107744d + ", errCode=" + reportAdH5LoadEvent.f107740d.f107743c);
                if (jo != null) {
                    SnsInfo convertToSnsInfo = jo.convertToSnsInfo();
                    ADInfo atAdInfo = snsAdClick.f267469d == 2 ? convertToSnsInfo.getAtAdInfo() : convertToSnsInfo.getAdInfo();
                    if (atAdInfo != null) {
                        if (snsAdClick.f267469d == 2) {
                            Log.m105924i("MicroMsg.ReportAdH5LoadListener", "at_friend_detail report ad h5 load");
                        } else {
                            Log.m105924i("MicroMsg.ReportAdH5LoadListener", "report ad h5 load");
                        }
                        C115669n nVar = C115669n.INSTANCE;
                        ReportAdH5LoadEvent.C40160a aVar = reportAdH5LoadEvent.f107740d;
                        nVar.mo160131h(16972, Long.valueOf(snsAdClick.f267471f), Integer.valueOf(snsAdClick.f267470e), atAdInfo.uxInfo, Integer.valueOf(convertToSnsInfo.getAdRecSrc()), convertToSnsInfo.getTimeLine().statExtStr, aVar.f107742b, Integer.valueOf(aVar.f107744d), Integer.valueOf(reportAdH5LoadEvent.f107740d.f107743c), Long.valueOf(reportAdH5LoadEvent.f107740d.f107745e));
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                } else {
                    SnsInfo SE = C94866e1.Yx0().mo139806SE(snsAdClick.f267471f);
                    StringBuilder sb = new StringBuilder();
                    sb.append("report ad h5, AdSnsInfo==null, uxInfo=");
                    sb.append(reportAdH5LoadEvent.f107740d.f107746f);
                    sb.append(", snsInfo==null?");
                    sb.append(SE == null);
                    Log.m105924i("MicroMsg.ReportAdH5LoadListener", sb.toString());
                    String str = "";
                    if (SE != null) {
                        String str2 = reportAdH5LoadEvent.f107740d.f107746f;
                        int adRecSrc = SE.getAdRecSrc();
                        TimeLineObject timeLine = SE.getTimeLine();
                        String str3 = timeLine == null ? str : timeLine.statExtStr;
                        if (str3 != null) {
                            str = str3;
                        }
                        C115669n nVar2 = C115669n.INSTANCE;
                        ReportAdH5LoadEvent.C40160a aVar2 = reportAdH5LoadEvent.f107740d;
                        nVar2.mo160131h(16972, Long.valueOf(snsAdClick.f267471f), Integer.valueOf(snsAdClick.f267470e), str2, Integer.valueOf(adRecSrc), str, aVar2.f107742b, Integer.valueOf(aVar2.f107744d), Integer.valueOf(reportAdH5LoadEvent.f107740d.f107743c), Long.valueOf(reportAdH5LoadEvent.f107740d.f107745e));
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                    } else {
                        String str4 = reportAdH5LoadEvent.f107740d.f107746f;
                        C115669n nVar3 = C115669n.INSTANCE;
                        ReportAdH5LoadEvent.C40160a aVar3 = reportAdH5LoadEvent.f107740d;
                        nVar3.mo160131h(16972, Long.valueOf(snsAdClick.f267471f), Integer.valueOf(snsAdClick.f267470e), str4, 0, str, aVar3.f107742b, Integer.valueOf(aVar3.f107744d), Integer.valueOf(reportAdH5LoadEvent.f107740d.f107743c), Long.valueOf(reportAdH5LoadEvent.f107740d.f107745e));
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ReportAdH5LoadListener", e, "report load ad h5 error", new Object[0]);
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
            return z;
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdH5LoadListener");
        return z;
    }
}
