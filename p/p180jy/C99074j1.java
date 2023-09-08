package p180jy;

import com.tencent.p014mm.autogen.events.ReportAdClickEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import do2.C97503a;
import f40.C86709a0;
import jp2.C98952a;
import jp2.C98956f;
import jp2.C98959i;
import kv2.C34071b;
import lo2.C88617x;
import lo2.C99552l;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: jy.j1 */
public class C99074j1 extends IStaticListener<ReportAdClickEvent> {

    /* renamed from: d */
    public final C98956f f290435d = new C99075a(this);

    /* renamed from: jy.j1$a */
    public class C99075a implements C98956f {
        public C99075a(C99074j1 j1Var) {
        }
    }

    public boolean callback(IEvent iEvent) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C98952a aVar;
        long j;
        String str6;
        int i;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        ReportAdClickEvent reportAdClickEvent = (ReportAdClickEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ReportAdClickListener", "ReportAdClickEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
        } else {
            try {
                SnsAdClick snsAdClick = reportAdClickEvent.f9426d.f9427a;
                AdSnsInfo jo = C94866e1.zx0().mo139864jo(snsAdClick.f267471f);
                if (jo == null) {
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.ReportAdClickListener");
                } else {
                    SnsInfo convertToSnsInfo = jo.convertToSnsInfo();
                    ADInfo atAdInfo = snsAdClick.f267469d == 2 ? convertToSnsInfo.getAtAdInfo() : convertToSnsInfo.getAdInfo();
                    if (atAdInfo != null) {
                        String str7 = atAdInfo.waidPkg;
                        String d = C34071b.m40230d(str7);
                        C98952a aVar2 = new C98952a();
                        if (C102260r.m134845N()) {
                            aVar2.f290048a = C102260r.m134875o(convertToSnsInfo);
                        }
                        aVar2.f290049b = C102260r.m134879s(convertToSnsInfo);
                        aVar2.f290050c = (int) snsAdClick.f267481s;
                        aVar2.f290051d = snsAdClick.f267482t;
                        aVar2.f290057j = snsAdClick;
                        aVar2.f290058k = atAdInfo.uxInfo;
                        aVar2.f290060m = atAdInfo.aid;
                        aVar2.f290061n = atAdInfo.traceid;
                        aVar2.f290062o = atAdInfo.pId;
                        aVar2.f290059l = convertToSnsInfo.getAdXml().adExtInfo;
                        if (atAdInfo.isWeapp() && !convertToSnsInfo.isFullCardAd() && !convertToSnsInfo.isSlideFullCardAd()) {
                            aVar2.f290052e = C88617x.m110483a(atAdInfo.actionExtWeApp.f275645a) ? 1 : 0;
                        }
                        aVar2.f290053f = C97503a.m125622c();
                        aVar2.f290054g = C97503a.m125621b();
                        aVar2.f290055h = C97503a.m125623d();
                        aVar2.f290056i = C97503a.m125620a();
                        String q0 = C102236a0.m134765q0(convertToSnsInfo.field_snsId);
                        if (snsAdClick.f267469d == 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("report ad click, at detail, exposureTime=");
                            ADInfo aDInfo = atAdInfo;
                            try {
                                sb.append(snsAdClick.f267480r);
                                sb.append(", clkPos=");
                                sb.append(snsAdClick.f267472g);
                                sb.append(", source=");
                                sb.append(snsAdClick.f267469d);
                                sb.append(", snsId=");
                                sb.append(q0);
                                Log.m105924i("MicroMsg.ReportAdClickListener", sb.toString());
                                j = snsAdClick.f267471f;
                                str6 = aDInfo.viewId;
                                i = snsAdClick.f267472g;
                                str5 = "callback";
                            } catch (Exception e) {
                                e = e;
                                str5 = "callback";
                                str4 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                                str3 = "MicroMsg.ReportAdClickListener";
                                str = str5;
                                str2 = str4;
                                Log.printErrStackTrace(str3, e, "report ad click error", new Object[0]);
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                                z = false;
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                                return z;
                            }
                            try {
                                str4 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                                try {
                                    int i2 = snsAdClick.f267473h;
                                    long j2 = j;
                                    aVar = aVar2;
                                    C98959i iVar = new C98959i(j2, str6, i, i2, snsAdClick.f267470e, "", convertToSnsInfo.getAdType(), convertToSnsInfo.getTimeLine().statExtStr, snsAdClick.f267479q, convertToSnsInfo.getAdSnsInfo().getAtFriendRemindInfoSourceInfo(), convertToSnsInfo.getAdSnsInfo().getAtFriendRemindInfoSelfInfo(), snsAdClick.f267480r, str7, d, aVar);
                                    iVar.f290111g = this.f290435d;
                                    C86709a0.m107528h();
                                    C86709a0.m107529k().f251779b.mo123460f(iVar);
                                    Object obj = "MicroMsg.ReportAdClickListener";
                                } catch (Exception e2) {
                                    e = e2;
                                    str3 = "MicroMsg.ReportAdClickListener";
                                    str = str5;
                                    str2 = str4;
                                    Log.printErrStackTrace(str3, e, "report ad click error", new Object[0]);
                                    SnsMethodCalculate.markEndTimeMs(str, str2);
                                    z = false;
                                    SnsMethodCalculate.markEndTimeMs(str, str2);
                                    return z;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str4 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                                str3 = "MicroMsg.ReportAdClickListener";
                                str = str5;
                                str2 = str4;
                                Log.printErrStackTrace(str3, e, "report ad click error", new Object[0]);
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                                z = false;
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                                return z;
                            }
                        } else {
                            str5 = "callback";
                            str4 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                            ADInfo aDInfo2 = atAdInfo;
                            aVar = aVar2;
                            String str8 = str7;
                            Log.m105924i("MicroMsg.ReportAdClickListener", "report ad click, exposureTime=" + snsAdClick.f267480r + ", clkPos=" + snsAdClick.f267472g + ", source=" + snsAdClick.f267469d + ", snsId=" + q0);
                            str3 = "MicroMsg.ReportAdClickListener";
                            try {
                                C98959i iVar2 = new C98959i(snsAdClick.f267471f, aDInfo2.viewId, snsAdClick.f267472g, snsAdClick.f267473h, snsAdClick.f267470e, "", convertToSnsInfo.getAdType(), convertToSnsInfo.getTimeLine().statExtStr, snsAdClick.f267479q, convertToSnsInfo.getAdSnsInfo().getTimelineRemindInfoSourceInfo(), convertToSnsInfo.getAdSnsInfo().getTimelineRemindInfoSelfInfo(), snsAdClick.f267480r, str8, d, aVar);
                                iVar2.f290111g = this.f290435d;
                                C86709a0.m107528h();
                                C86709a0.m107529k().f251779b.mo123460f(iVar2);
                            } catch (Exception e4) {
                                e = e4;
                                str = str5;
                                str2 = str4;
                                Log.printErrStackTrace(str3, e, "report ad click error", new Object[0]);
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                                z = false;
                                SnsMethodCalculate.markEndTimeMs(str, str2);
                                return z;
                            }
                        }
                        C99552l.m129935k(aVar, 4000000);
                        str = str5;
                        str2 = str4;
                        SnsMethodCalculate.markEndTimeMs(str, str2);
                        z = true;
                        SnsMethodCalculate.markEndTimeMs(str, str2);
                        return z;
                    }
                    str = "callback";
                    str2 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                    z = false;
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                    return z;
                }
            } catch (Exception e5) {
                e = e5;
                str3 = "MicroMsg.ReportAdClickListener";
                str = "callback";
                str2 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
                Log.printErrStackTrace(str3, e, "report ad click error", new Object[0]);
                SnsMethodCalculate.markEndTimeMs(str, str2);
                z = false;
                SnsMethodCalculate.markEndTimeMs(str, str2);
                return z;
            }
        }
        z = false;
        str = "callback";
        str2 = "com.tencent.mm.feature.sns.listener.ReportAdClickListener";
        SnsMethodCalculate.markEndTimeMs(str, str2);
        return z;
    }
}
