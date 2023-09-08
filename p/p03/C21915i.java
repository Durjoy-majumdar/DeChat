package p03;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import java.io.UnsupportedEncodingException;
import java.util.Set;
import kj2.C117407d;
import p1081gi.C98121d;
import p206nj.C117627q;
import te3.C51593us3;
import te3.C64467je0;
import te3.jh4;
import te3.uh4;
import te3.w25;
import te3.xh4;
import u73.C101987v0;
import u73.C52459d0;
import u73.C52464j0;
import v73.C102158a;
import v73.C102159b;

/* renamed from: p03.i */
public class C21915i {
    /* renamed from: a */
    public static void m25169a(uh4 uh4, xh4 xh4, Set<C64467je0> set, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("isfeedback=1");
        stringBuffer.append("&feedtype=0");
        stringBuffer.append("&businesstype=2");
        stringBuffer.append("&itemtype=");
        stringBuffer.append(xh4.f64700A);
        stringBuffer.append("&scene=");
        stringBuffer.append(uh4.f64642i);
        stringBuffer.append("&searchid=");
        stringBuffer.append(uh4.f64643j);
        stringBuffer.append("&clicktime=");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("&docid=");
        stringBuffer.append(xh4.f64706G);
        stringBuffer.append("&docpos=");
        stringBuffer.append(i);
        stringBuffer.append("&reasonid=");
        for (C64467je0 je02 : set) {
            stringBuffer.append(je02.f183790d);
            stringBuffer.append("#");
        }
        stringBuffer.append("&reasonwording=");
        StringBuffer stringBuffer2 = new StringBuffer();
        for (C64467je0 je03 : set) {
            stringBuffer2.append(je03.f183791e);
            stringBuffer2.append("#");
        }
        try {
            stringBuffer.append(C117627q.m165909b(stringBuffer2.toString(), "utf8"));
        } catch (UnsupportedEncodingException unused) {
        }
        stringBuffer.append("&offset=");
        stringBuffer.append(i);
        stringBuffer.append("&sessionid=");
        stringBuffer.append(C101987v0.m134271e(uh4.f64642i));
        stringBuffer.append("&reserveexpand=");
        stringBuffer.append(xh4.f64701B);
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportFeedBackClick %s", stringBuffer.toString());
        C51593us3 us32 = new C51593us3();
        us32.f143104t = stringBuffer.toString();
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
    }

    /* renamed from: b */
    public static void m25170b(int i) {
        if (i == -21020) {
            C102159b.m134601a(10);
        } else if (i == -21009) {
            C102159b.m134601a(9);
        } else if (i == -10012) {
            C102159b.m134601a(7);
        } else if (i == -10004) {
            C102159b.m134601a(8);
        } else if (i == -1010) {
            C102159b.m134601a(4);
        } else if (i == -1007) {
            C102159b.m134601a(5);
        } else if (i == -1004) {
            C102159b.m134601a(6);
        } else if (i == 416) {
            C102159b.m134601a(15);
        } else if (i == 502) {
            C102159b.m134601a(14);
        } else if (i != 503) {
            switch (i) {
                case 403:
                    C102159b.m134601a(12);
                    break;
                case 404:
                    C102159b.m134601a(11);
                    break;
                case 405:
                    C102159b.m134601a(16);
                    break;
                default:
                    C102159b.m134601a(255);
                    break;
            }
        } else {
            C102159b.m134601a(13);
        }
        C102158a.m134600a(7);
    }

    /* renamed from: c */
    public static void m25171c(xh4 xh4, int i, int i2, int i3, C98121d dVar) {
        if (dVar == null) {
            dVar = new C98121d();
        }
        String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(xh4.f64719U), Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(dVar.field_startTime), Long.valueOf(dVar.field_endTime), Integer.valueOf(dVar.field_averageSpeed), Integer.valueOf(dVar.field_averageConnectCost), Integer.valueOf(dVar.field_firstConnectCost), Integer.valueOf(dVar.field_moovFailReason), Integer.valueOf(dVar.field_httpStatusCode), dVar.field_clientIP, dVar.field_serverIP, dVar.field_xErrorNo, Integer.valueOf(dVar.field_cSeqCheck), Integer.valueOf(dVar.field_isCrossNet ? 1 : 0), Integer.valueOf(dVar.field_usePrivateProtocol ? 1 : 0), Integer.valueOf(i3)});
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryCdnDownloadError 16270 %s", format);
        C117407d.INSTANCE.kvStat(16270, format);
        if (i2 != 0) {
            C51593us3 us32 = new C51593us3();
            String str = "videoplayfailreport=1" + "&vt=" + xh4.f64719U + "&errorcode=" + i2 + "&filetype=" + i + "&startdownloadtime=" + dVar.field_startTime + "&enddownloadtime=" + dVar.field_endTime + "&averagespeed=" + dVar.field_averageSpeed + "&averageconnectcost=" + dVar.field_averageConnectCost + "&firstconnectcost=" + dVar.field_firstConnectCost + "&moovfailreason=" + dVar.field_moovFailReason + "&httpstatuscode=" + dVar.field_httpStatusCode + "&clientip=" + dVar.field_clientIP + "&serverip=" + dVar.field_serverIP + "&xerrno=" + dVar.field_xErrorNo + "&cseqresult=" + dVar.field_cSeqCheck + "&crossnet=" + (dVar.field_isCrossNet ? 1 : 0) + "&privateprotocol=" + (dVar.field_usePrivateProtocol ? 1 : 0) + "&nettype=" + i3 + "&cdnsourcetype=" + xh4.f64715Q + "&cdnscene=" + xh4.f64714P + "&expand=" + xh4.f64743x;
            us32.f143104t = str;
            String str2 = dVar.field_httpResponseHeader;
            us32.f143088R = str2;
            String str3 = xh4.f64726e;
            us32.f143089S = str3;
            String str4 = xh4.f64717S;
            us32.f143090T = str4;
            Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "NetSceneWebSearchReport16270 [logString:%s], [header:%s], [url:%s], [bypass:%s]", str, str2, str3, str4);
            C86709a0.m107524d().mo123460f(new C52464j0(us32));
        }
    }

    /* renamed from: d */
    public static void m25172d(xh4 xh4, int i, String str, int i2) {
        String format = String.format("%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(i), str, xh4 != null ? xh4.f64706G : "", Integer.valueOf(NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 2 : !NetStatusUtil.isConnected(MMApplicationContext.getContext()) ? 1 : 3), Integer.valueOf(i2)});
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryVideoPlayError %s", format);
        C117407d.INSTANCE.kvStat(15248, format);
    }

    /* renamed from: e */
    public static void m25173e(w25 w25, C72963f4 f4Var) {
        String str;
        int i;
        String str2;
        String t;
        if (C72996z1.m85820U5(f4Var.mo108768t())) {
            str2 = f4Var.mo108769t2() == 1 ? C75592q0.m90789s() : C75604z3.m90847s(f4Var.getContent());
            str = f4Var.mo108768t();
            i = 2;
        } else {
            if (f4Var.mo108769t2() == 1) {
                t = C75592q0.m90789s();
                str = f4Var.mo108768t();
            } else {
                t = f4Var.mo108768t();
                str = C75592q0.m90789s();
            }
            i = 1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("isShareClick=1");
        stringBuffer.append("&relevant_vid=");
        stringBuffer.append(w25.f259899d);
        stringBuffer.append("&relevant_pre_searchid=");
        stringBuffer.append(w25.f259901f);
        stringBuffer.append("&relevant_shared_openid=");
        stringBuffer.append(w25.f259902g);
        stringBuffer.append("&rec_category=");
        long j = w25.f259916x;
        if (j > 0) {
            stringBuffer.append(j);
        } else {
            stringBuffer.append(w25.f259903h);
        }
        stringBuffer.append("&source=");
        stringBuffer.append(w25.f259911s);
        stringBuffer.append("&fromUser=");
        stringBuffer.append(str2);
        stringBuffer.append("&fromScene=");
        stringBuffer.append(i);
        stringBuffer.append("&targetInfo=");
        stringBuffer.append(str);
        stringBuffer.append("&expand=");
        stringBuffer.append(w25.f259900e);
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", stringBuffer.toString());
        C51593us3 us32 = new C51593us3();
        us32.f143104t = stringBuffer.toString();
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
    }

    /* renamed from: f */
    public static void m25174f(jh4 jh4, String str, long j) {
        String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{Integer.valueOf(jh4.f64034i), jh4.f64038p, jh4.f64030e, Integer.valueOf(C43471q.m46977a(1)), str, Long.valueOf(j), Integer.valueOf(jh4.f64040r), Integer.valueOf(jh4.f64043u), jh4.f64045w, Long.valueOf((jh4.f64039q.size() <= 0 || !"clickTopStory".equals(jh4.f64039q.get(0).f142233d)) ? 0 : j - jh4.f64039q.get(0).f142234e), jh4.f64046x, jh4.f64036n});
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomeUIAction 15466 %s", format);
        C115669n.INSTANCE.kvStat(15466, format);
    }

    /* renamed from: g */
    public static final void m25175g(uh4 uh4, long j, xh4 xh4) {
        if (j > 0) {
            Object[] objArr = new Object[8];
            objArr[0] = Integer.valueOf(uh4.f64642i);
            objArr[1] = Long.valueOf(j / 1000);
            objArr[2] = Long.valueOf(uh4.f64641h);
            objArr[3] = 3;
            objArr[4] = "";
            objArr[5] = 2;
            objArr[6] = xh4 != null ? xh4.f64743x : uh4.f64638e;
            objArr[7] = uh4.f64643j;
            String format = String.format("videoflowbrowsereport=1&scene=%s&staytime=%s&channelid=%s&pageid=%s&nettype=%s&source=%s&expand=%s&searchid=%s", objArr);
            Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoPageBrowseTime 15018 %s", format);
            C51593us3 us32 = new C51593us3();
            us32.f143104t = format;
            C86709a0.m107524d().mo123460f(new C52464j0(us32));
        }
    }

    /* renamed from: h */
    public static void m25176h(uh4 uh4, xh4 xh4, String str, String str2, String str3) {
        String format = String.format("videosharereport=1&scene=%s&searchid=%s&docid=%s&cdnsourcetype=%s&videoid=%s&optype=%s&fromuser=%s&touser=%s&channelid=%s&optypes=%s&expand=%s", new Object[]{Integer.valueOf(uh4.f64642i), uh4.f64643j, xh4.f64706G, Integer.valueOf(xh4.f64715Q), xh4.f64729h, 0, str2, str3, Long.valueOf(uh4.f64641h), str, xh4.f64743x});
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoShare 15035 %s", format);
        C51593us3 us32 = new C51593us3();
        us32.f143104t = format;
        Log.m105924i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoShare:" + format);
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
    }

    /* renamed from: i */
    public static final void m25177i(uh4 uh4, xh4 xh4, int i) {
        C51593us3 us32 = new C51593us3();
        String format = String.format("logname=videopoint&scene=%s&docid=%s&searchid=%s&vid=%s&actiontype=%s&itemtype=%s", new Object[]{Integer.valueOf(uh4.f64642i), xh4.f64706G, uh4.f64643j, xh4.f64729h, Integer.valueOf(i), Integer.valueOf(xh4.f64700A)});
        us32.f143104t = format;
        Log.m105925i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportVideoPointAction %s", format);
        C86709a0.m107524d().mo123460f(new C52459d0(us32));
    }
}
