package jp2;

import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.math.BigInteger;
import java.util.ArrayList;
import jr2.C99019x;
import kg3.C76577a;
import lg3.C76695c;
import lo2.C99552l;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C100400e0;
import p180jy.C99074j1;
import pe3.C89349b;
import rq2.C63505q;
import te3.C101759b2;
import te3.C48941c2;
import vr2.C102240d;

/* renamed from: jp2.i */
public class C98959i extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f290108d;

    /* renamed from: e */
    public C11385n f290109e;

    /* renamed from: f */
    public C98952a f290110f;

    /* renamed from: g */
    public C98956f f290111g;

    /* renamed from: h */
    public long f290112h;

    public C98959i(long j, String str, int i, int i2, int i3, String str2, int i4, String str3, int i5, C89349b bVar, C89349b bVar2, long j2, String str4, String str5, C98952a aVar) {
        String str6;
        String str7 = str;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        String str8 = str2;
        int i9 = i4;
        String str9 = str3;
        int i15 = i5;
        C89349b bVar3 = bVar;
        C89349b bVar4 = bVar2;
        long j3 = j2;
        String str10 = str4;
        String str11 = str5;
        C98952a aVar2 = aVar;
        String str12 = "";
        C47350c.C47352b bVar5 = new C47350c.C47352b();
        bVar5.f127066a = new C101759b2();
        bVar5.f127067b = new C48941c2();
        ((C100400e0) C99019x.m128973e()).getClass();
        SnsMethodCalculate.markStartTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
        int adRecSrc = SE == null ? 0 : SE.getAdRecSrc();
        SnsMethodCalculate.markEndTimeMs("getAdRecSrc", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (adRecSrc != 2) {
            bVar5.f127068c = "/cgi-bin/mmoc-bin/ad/click";
            bVar5.f127069d = 1232;
        } else {
            bVar5.f127068c = "/cgi-bin/mmux-bin/adclick";
            bVar5.f127069d = 1817;
        }
        bVar5.f127070e = 0;
        bVar5.f127071f = 0;
        this.f290108d = bVar5.mo72403a();
        Log.m105925i("MicroMsg.NetSceneAdClick", "source %d, uri %s", Integer.valueOf(adRecSrc), this.f290108d.f127057c);
        C101759b2 b2Var = (C101759b2) this.f290108d.f127055a.f127080a;
        b2Var.f297928e = i6;
        b2Var.f297927d = str7;
        b2Var.f297930g = i8;
        b2Var.f297929f = str8;
        b2Var.f297933j = System.currentTimeMillis();
        b2Var.f297935o = i9;
        b2Var.f297936p = i7;
        b2Var.f297937q = adRecSrc;
        b2Var.f297938r = str9;
        b2Var.f297939s = i15;
        long j4 = j2;
        b2Var.f297942v = j4;
        b2Var.f297943w = aVar2.f290053f;
        b2Var.f297918C = aVar2.f290054g;
        b2Var.f297945y = str4;
        b2Var.f297944x = str5;
        C89349b bVar6 = bVar2;
        if (bVar6 != null) {
            b2Var.f297941u = bVar6;
        }
        String str13 = "MicroMsg.NetSceneAdClick";
        String str14 = str12;
        C89349b bVar7 = bVar;
        if (bVar7 != null) {
            b2Var.f297940t = bVar7;
        }
        this.f290110f = aVar2;
        b2Var.f297946z = aVar2.f290050c;
        b2Var.f297916A = aVar2.f290049b;
        b2Var.f297917B = aVar2.f290048a;
        b2Var.f297922G = aVar2.f290056i;
        b2Var.f297921F = aVar2.f290055h;
        b2Var.f297923H = aVar2.f290051d;
        b2Var.f297924I = C76695c.m92341b() ? 1 : 0;
        b2Var.f297925J = C76577a.m92163n(MMApplicationContext.getContext());
        b2Var.f297926K = aVar2.f290052e;
        try {
            C115669n.INSTANCE.mo175911u(1612, 53);
            StringBuilder sb = new StringBuilder();
            sb.append("##snsId:");
            sb.append(new BigInteger(Long.toBinaryString(j), 2).toString());
            sb.append(", clickPos:");
            sb.append(i6);
            sb.append(", clickAction:");
            sb.append(i7);
            sb.append(", sceneType:");
            sb.append(i8);
            sb.append(", descXml:");
            sb.append(str8);
            sb.append(", adtype:");
            sb.append(i9);
            sb.append(", snsStatStr:");
            sb.append(str9);
            sb.append(", flipStatus:");
            sb.append(i15);
            sb.append(", remind_source_info.length:");
            sb.append(bVar7 == null ? 0 : bVar7.f257327a.length);
            sb.append(", remind_self_info.length:");
            sb.append(bVar6 == null ? 0 : bVar6.f257327a.length);
            sb.append(", exposure_start_time:");
            sb.append(j4);
            sb.append(", followStatus:");
            sb.append(b2Var.f297916A);
            sb.append(", installStatus:");
            sb.append(b2Var.f297917B);
            sb.append(", videoCurTime:");
            sb.append(b2Var.f297946z);
            sb.append(", oaid:");
            sb.append(b2Var.f297943w);
            sb.append(", imei:");
            sb.append(b2Var.f297918C);
            sb.append(", waidPkg:");
            sb.append(str4);
            sb.append(", waid:");
            sb.append(str5);
            sb.append(", ua:");
            sb.append(b2Var.f297921F);
            sb.append(", relieved_buy_show:");
            sb.append(b2Var.f297926K);
            sb.append(", common_device_id:");
            sb.append(b2Var.f297922G);
            sb.append(", sub_clickpos:");
            sb.append(b2Var.f297923H);
            sb.append(", elder_mode:");
            StringBuilder sb4 = new StringBuilder();
            String str15 = str14;
            sb4.append(str15);
            sb4.append(b2Var.f297924I);
            sb.append(sb4.toString());
            sb.append(", font_level:");
            sb.append(str15 + b2Var.f297925J);
            String sb5 = sb.toString();
            str6 = str13;
            try {
                Log.m105924i(str6, sb5);
                StringBuilder sb6 = new StringBuilder();
                sb6.append("viewId.length=");
                String str16 = str;
                sb6.append(str16 == null ? 0 : str.length());
                sb6.append(", viewId=");
                sb6.append(str16);
                Log.m105924i(str6, sb6.toString());
            } catch (Throwable th) {
                th = th;
                Log.m105920e(str6, th.toString());
            }
        } catch (Throwable th4) {
            th = th4;
            str6 = str13;
            Log.m105920e(str6, th.toString());
        }
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        this.f290109e = nVar;
        if (this.f290111g != null) {
            this.f290112h = System.currentTimeMillis();
            C98956f fVar = this.f290111g;
            C98952a aVar = this.f290110f;
            ((C99074j1.C99075a) fVar).getClass();
            SnsMethodCalculate.markStartTimeMs("startAdClickCGI", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
            C99552l.m129935k(aVar, 4000001);
            SnsMethodCalculate.markEndTimeMs("startAdClickCGI", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
        }
        return dispatch(gVar, this.f290108d, this);
    }

    public int getType() {
        return 1232;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        boolean z;
        Log.m105924i("MicroMsg.NetSceneAdClick", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.f290112h);
        if (i2 == 0 && i3 == 0) {
            z = true;
        } else {
            z = false;
            C115669n.INSTANCE.mo175911u(1612, 54);
        }
        C98956f fVar = this.f290111g;
        if (fVar != null) {
            C98952a aVar = this.f290110f;
            ((C99074j1.C99075a) fVar).getClass();
            SnsMethodCalculate.markStartTimeMs("adClickCGIFinish", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
            ArrayList<Integer> arrayList = C99552l.f291829a;
            SnsMethodCalculate.markStartTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            if (aVar == null) {
                Log.m105920e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, params is null");
                SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            } else {
                SnsAdClick snsAdClick = aVar.f290057j;
                if (snsAdClick == null) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, snsAdClick is null");
                    SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                } else {
                    int i4 = 4000002;
                    if (z) {
                        i4 = 4000003;
                    }
                    try {
                        if (C99552l.f291829a.contains(Integer.valueOf(snsAdClick.f267472g))) {
                            Log.m105924i("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, except current click pos, the pos is " + snsAdClick.f267472g);
                            SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                        } else {
                            C102240d.C102242b bVar = new C102240d.C102242b();
                            bVar.mo141803k(i4);
                            bVar.mo141805m(aVar.f290058k);
                            bVar.mo141795c(aVar.f290059l);
                            bVar.mo141798f(currentTimeMillis);
                            bVar.mo141806n(aVar.f290060m);
                            bVar.mo141804l(aVar.f290061n);
                            bVar.mo141807o(aVar.f290062o);
                            C63505q.m74843b(bVar.mo141793a());
                            SnsMethodCalculate.markEndTimeMs("reportTimelineAdClickCgiFinish", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                        }
                    } catch (Throwable th) {
                        Log.m105920e("AdConversionOnlineReportHelper", "reportTimelineAdClickCgiFinish, eventId is " + i4 + ", exp is " + th.toString());
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("adClickCGIFinish", "com.tencent.mm.feature.sns.listener.ReportAdClickListener$1");
        }
        try {
            C48941c2 c2Var = (C48941c2) this.f290108d.f127056b.f127083a;
            Log.m105924i("MicroMsg.NetSceneAdClick", "resp=" + c2Var.f131450d + ", msg=" + c2Var.f131451e);
        } catch (Exception unused) {
        }
        this.f290109e.onSceneEnd(i2, i3, str, this);
    }
}
