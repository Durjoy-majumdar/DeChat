package p180jy;

import ad0.C91998s;
import com.tencent.p014mm.autogen.events.ReportSnsEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import jp2.C33615q;
import jp2.C98962n;

/* renamed from: jy.n1 */
public class C99077n1 extends IStaticListener<ReportSnsEvent> {
    public boolean callback(IEvent iEvent) {
        boolean z;
        String str;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        ReportSnsEvent reportSnsEvent = (ReportSnsEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        String str2 = "MicroMsg.ReportSnsListener";
        if (!C86709a0.m107522a()) {
            Log.m105928w(str2, "ReportSnsEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        } else {
            ReportSnsEvent.C92555a aVar = reportSnsEvent.f265064d;
            SnsAdClick snsAdClick = aVar.f265065a;
            try {
                if (aVar.f265066b == 1) {
                    if (snsAdClick.f267475j == 1) {
                        AdSnsInfo jo = C94866e1.zx0().mo139864jo(snsAdClick.f267471f);
                        if (jo == null || !jo.isRecExpAd()) {
                            String str3 = str2;
                            C94866e1.Zx0().mo59225h(13155, Long.valueOf(snsAdClick.f267471f), jo.getAdInfo().uxInfo, Integer.valueOf(snsAdClick.f267470e), Long.valueOf(snsAdClick.f267474i), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(jo.getRecSrc()), "");
                        } else {
                            C33615q Zx0 = C94866e1.Zx0();
                            Object[] objArr = new Object[7];
                            try {
                                objArr[0] = Long.valueOf(snsAdClick.f267471f);
                                objArr[1] = jo.getAdInfo().uxInfo;
                                objArr[2] = Integer.valueOf(snsAdClick.f267470e);
                                objArr[3] = Long.valueOf(snsAdClick.f267474i);
                                objArr[4] = Long.valueOf(System.currentTimeMillis());
                                objArr[5] = Integer.valueOf(jo.getRecSrc());
                                objArr[6] = "";
                                Zx0.mo59225h(14647, objArr);
                            } catch (Exception e) {
                                e = e;
                                str2 = str2;
                                Log.printErrStackTrace(str2, e, "report ad click error", new Object[0]);
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                                return false;
                            }
                        }
                        C91998s.m115549c(750);
                        String str4 = jo.getAdInfo().uxInfo;
                        System.currentTimeMillis();
                    } else {
                        String str5 = str2;
                        AdSnsInfo jo4 = C94866e1.zx0().mo139864jo(snsAdClick.f267471f);
                        if (jo4 != null) {
                            str = jo4.getAdInfo().uxInfo;
                            z = jo4.isRecExpAd();
                            String str6 = str5;
                        } else {
                            str = reportSnsEvent.f265064d.f265067c;
                            if (str == null) {
                                str = "";
                            }
                            str2 = str5;
                            Log.m105924i(str2, "ReportSnsEvent, AdSnsInfo==null, uxInfo=" + str);
                            z = false;
                        }
                        String a = C98962n.m128836a(snsAdClick.f267471f, snsAdClick, str, Integer.valueOf(snsAdClick.f267470e), Long.valueOf(snsAdClick.f267474i), Long.valueOf(System.currentTimeMillis()));
                        StringBuilder sb = new StringBuilder();
                        sb.append(a);
                        sb.append(String.format(",%s", new Object[]{snsAdClick.f267476n + ""}));
                        String sb4 = sb.toString();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(sb4);
                        sb5.append(String.format(",%s", new Object[]{((System.currentTimeMillis() - snsAdClick.f267474i) - snsAdClick.f267478p) + ""}));
                        String sb6 = sb5.toString();
                        if (z) {
                            C94866e1.Zx0().mo59225h(14643, sb6);
                        } else {
                            C94866e1.Zx0().mo59225h(12013, sb6);
                        }
                        C91998s.m115549c(733);
                        System.currentTimeMillis();
                    }
                }
            } catch (Exception e2) {
                e = e2;
                Log.printErrStackTrace(str2, e, "report ad click error", new Object[0]);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportSnsListener");
        return false;
    }
}
