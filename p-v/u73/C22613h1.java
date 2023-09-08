package u73;

import c00.C39885s;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FingerWebSearchActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.GlobalWebSearchClickRateStruct;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import kj2.C117407d;
import kj2.C61103a;
import ob0.C117747y;
import os2.C100421x;
import p166hy.C98565m0;
import te3.C51593us3;
import te3.rh4;
import zt3.C119157j;

/* renamed from: u73.h1 */
public class C22613h1 {

    /* renamed from: a */
    public static C22614b f65039a = new C22614b();

    /* renamed from: u73.h1$b */
    public static class C22614b {

        /* renamed from: a */
        public int f65040a;

        /* renamed from: b */
        public int f65041b;

        /* renamed from: c */
        public long f65042c;

        /* renamed from: d */
        public long f65043d;

        /* renamed from: e */
        public long f65044e;

        /* renamed from: f */
        public long f65045f;

        /* renamed from: g */
        public boolean f65046g = true;
    }

    /* renamed from: u73.h1$a */
    public class C22615a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f65047d;

        /* renamed from: e */
        public final /* synthetic */ long f65048e;

        /* renamed from: f */
        public final /* synthetic */ int f65049f;

        /* renamed from: g */
        public final /* synthetic */ int f65050g;

        /* renamed from: h */
        public final /* synthetic */ int f65051h;

        /* renamed from: i */
        public final /* synthetic */ long f65052i;

        /* renamed from: j */
        public final /* synthetic */ String f65053j;

        /* renamed from: n */
        public final /* synthetic */ int f65054n;

        public C22615a(String str, long j, int i, int i2, int i3, long j2, String str2, int i4) {
            this.f65047d = str;
            this.f65048e = j;
            this.f65049f = i;
            this.f65050g = i2;
            this.f65051h = i3;
            this.f65052i = j2;
            this.f65053j = str2;
            this.f65054n = i4;
        }

        public void run() {
            int i;
            Class cls = C98565m0.class;
            char c = !Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(68377, (Object) null));
            int kD = ((C98565m0) C86312j.m106911c(cls)).o70() != null ? ((C100421x) ((C98565m0) C86312j.m106911c(cls)).o70()).mo139896kD() : 0;
            if (kD > 0) {
                i = 2;
            } else if (c > 0) {
                kD = 0;
                i = 1;
            } else {
                kD = 0;
                i = 0;
            }
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{this.f65047d, Long.valueOf(this.f65048e), C43471q.m46979c(), Integer.valueOf(this.f65049f), Integer.valueOf(this.f65050g), Integer.valueOf(this.f65051h), Long.valueOf(this.f65052i), this.f65053j, Integer.valueOf(i), Integer.valueOf(kD), Integer.valueOf(this.f65054n)});
            Log.m105924i("MicroMsg.WebSearch.WebSearchReportLogic", "reportTopStoryRedDotKv 16654: " + format);
            C117407d.INSTANCE.kvStat(16654, format);
        }
    }

    /* renamed from: a */
    public static void m26475a(int i, int i2, String str) {
        C22614b bVar = f65039a;
        bVar.f65040a = i;
        bVar.f65041b = i2;
        bVar.f65042c = System.currentTimeMillis();
        bVar.f65043d = 0;
        bVar.f65044e = System.currentTimeMillis();
        bVar.f65045f = 0;
        bVar.f65046g = false;
        Log.m105927v("MicroMsg.WebSearch.WebSearchReportLogic", "initReport %d %d %s", Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* renamed from: b */
    public static void m26476b(int i, String str) {
        C117407d.INSTANCE.mo160131h(12070, Integer.valueOf(i), Integer.valueOf(C43471q.m46977a(0)), str, 4, 0, "", 1, 0);
    }

    /* renamed from: c */
    public static void m26477c(int i, int i2, String str, int i3, int i4, String str2, int i5) {
        Log.m105927v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchGuideDisplay %d %d %s %d %d %s %d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5));
        C117407d.INSTANCE.mo160131h(12098, Integer.valueOf(i), Integer.valueOf(C43471q.m46977a(0)), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), str2, Integer.valueOf(i5));
    }

    /* renamed from: d */
    public static void m26478d(String str, int i, int i2, int i3) {
        GlobalWebSearchClickRateStruct globalWebSearchClickRateStruct = new GlobalWebSearchClickRateStruct();
        globalWebSearchClickRateStruct.f48516d = globalWebSearchClickRateStruct.mo86045b("Query", str.replace(',', ' '), true);
        globalWebSearchClickRateStruct.f48517e = (long) i;
        globalWebSearchClickRateStruct.f48518f = (long) i2;
        globalWebSearchClickRateStruct.f48520h = (long) i3;
        globalWebSearchClickRateStruct.f48519g = 0;
        globalWebSearchClickRateStruct.mo86054n();
        Log.m105925i("MicroMsg.WebSearch.WebSearchReportLogic", "report12639 %s", globalWebSearchClickRateStruct.mo1006q().replace(APLogFileUtil.SEPARATOR_LINE, " "));
    }

    /* renamed from: e */
    public static void m26479e(int i, String str, int i2, int i3, String str2, String str3, String str4, String str5, int i4, String str6, long j, long j2, int i5, String str7, String str8, int i6) {
        FingerWebSearchActionStruct fingerWebSearchActionStruct = new FingerWebSearchActionStruct();
        fingerWebSearchActionStruct.f48495e = (long) i;
        String str9 = str;
        fingerWebSearchActionStruct.f48494d = fingerWebSearchActionStruct.mo86045b("RequestId", str, true);
        fingerWebSearchActionStruct.f48496f = (long) i2;
        fingerWebSearchActionStruct.f48497g = (long) i3;
        String str10 = str2;
        fingerWebSearchActionStruct.f48498h = fingerWebSearchActionStruct.mo86045b("HitWordList", str2, true);
        String str11 = str3;
        fingerWebSearchActionStruct.f48499i = fingerWebSearchActionStruct.mo86045b("HitWordVersion", str3, true);
        String str12 = str4;
        fingerWebSearchActionStruct.f48500j = fingerWebSearchActionStruct.mo86045b("MsgId", str4, true);
        fingerWebSearchActionStruct.f48501k = fingerWebSearchActionStruct.mo86045b("MsgFromUsername", "", true);
        fingerWebSearchActionStruct.f48502l = (long) i4;
        String str13 = str6;
        fingerWebSearchActionStruct.f48503m = fingerWebSearchActionStruct.mo86045b("ChatRoomID", str6, true);
        fingerWebSearchActionStruct.f48504n = j;
        fingerWebSearchActionStruct.f48505o = j2;
        fingerWebSearchActionStruct.f48506p = (long) i5;
        fingerWebSearchActionStruct.f48507q = fingerWebSearchActionStruct.mo86045b("ShowHitWord", str7, true);
        fingerWebSearchActionStruct.f48508r = fingerWebSearchActionStruct.mo86045b("MatchTypeList", str8, true);
        fingerWebSearchActionStruct.f48509s = (long) i6;
        fingerWebSearchActionStruct.mo86054n();
        m26490p(fingerWebSearchActionStruct);
    }

    /* renamed from: f */
    public static final void m26480f(int i) {
        Log.m105927v("MicroMsg.WebSearch.WebSearchReportLogic", "reportIdKey649 %d", Integer.valueOf(i));
        C117407d.INSTANCE.idkeyStat(649, (long) i, 1, true);
    }

    /* renamed from: g */
    public static final void m26481g(int i, int i2) {
        if (i == 21) {
            C117407d.INSTANCE.idkeyStat(649, (long) i2, 1, true);
        }
    }

    /* renamed from: h */
    public static void m26482h(int i, int i2, int i3, int i4, String str) {
        C117407d.INSTANCE.mo160131h(14457, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i == 21 ? C43471q.m46977a(1) : C43471q.m46977a(0)), Integer.valueOf(i3), Integer.valueOf(i4), str);
    }

    /* renamed from: i */
    public static void m26483i() {
        C22614b bVar = f65039a;
        if (!bVar.f65046g) {
            C117407d.INSTANCE.mo160131h(12044, Integer.valueOf(bVar.f65040a), Integer.valueOf(bVar.f65041b), Long.valueOf(bVar.f65043d / 1000), Long.valueOf(bVar.f65045f / 1000));
            bVar.f65046g = true;
        }
        Log.m105926v("MicroMsg.WebSearch.WebSearchReportLogic", "reportTime");
    }

    /* renamed from: j */
    public static void m26484j(rh4 rh4, int i, int i2, int i3, long j, String str) {
        Class cls = C98565m0.class;
        if (rh4 == null) {
            rh4 = new rh4();
            rh4.f64533d = "";
            rh4.f64541o = 0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("reddotreport=1");
        stringBuffer.append("&reddotid=");
        stringBuffer.append(Util.nullAsNil(rh4.f64533d));
        stringBuffer.append("&reddotts=");
        stringBuffer.append(rh4.f64541o);
        stringBuffer.append("&nettype=");
        stringBuffer.append(C43471q.m46979c());
        stringBuffer.append("&optype=");
        stringBuffer.append(i);
        stringBuffer.append("&reddottype=");
        stringBuffer.append(i2);
        stringBuffer.append("&reddotcnt=");
        stringBuffer.append(i3);
        stringBuffer.append("&reddotconsumets=");
        stringBuffer.append(j);
        stringBuffer.append("&notshowreason=");
        stringBuffer.append(str);
        stringBuffer.append("&reddotseq=");
        stringBuffer.append(rh4.f64546t);
        if (i == 100 || i == 101 || i == 102 || i == 108) {
            char c = !Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(68377, (Object) null));
            int kD = ((C98565m0) C86312j.m106911c(cls)).o70() != null ? ((C100421x) ((C98565m0) C86312j.m106911c(cls)).o70()).mo139896kD() : 0;
            if (kD > 0) {
                stringBuffer.append("&snsreddottype=2");
                stringBuffer.append("&snsreddotcnt=");
                stringBuffer.append(kD);
            } else if (c > 0) {
                stringBuffer.append("&snsreddottype=1");
                stringBuffer.append("&snsreddotcnt=");
                stringBuffer.append(0);
            } else {
                stringBuffer.append("&snsreddottype=0");
                stringBuffer.append("&snsreddotcnt=");
                stringBuffer.append(0);
            }
        }
        Log.m105925i("MicroMsg.TopStory", "reportTopStoryRedDot 16399 %s", stringBuffer.toString());
        C51593us3 us32 = new C51593us3();
        us32.f143104t = stringBuffer.toString();
        C86709a0.m107524d().mo123460f((C117747y) ((C39885s) C86312j.m106911c(C39885s.class)).mo62256Hr(us32));
    }

    /* renamed from: k */
    public static void m26485k(String str, long j, int i, int i2, int i3, long j2, String str2, int i4) {
        ((C119157j) C119157j.f356862d).mo183876g(new C22615a(str, j, i, i2, i3, j2, str2, i4), "ReportTopStoryRedDotKv");
    }

    /* renamed from: l */
    public static void m26486l(int i, int i2, String str, String str2, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("recnondocreport=1");
        stringBuffer.append("&type=51");
        stringBuffer.append("&content=");
        stringBuffer.append(i);
        stringBuffer.append("|");
        stringBuffer.append(i2);
        stringBuffer.append("|");
        stringBuffer.append(Util.nullAsNil(str));
        stringBuffer.append("|");
        stringBuffer.append(z ? 1 : 0);
        stringBuffer.append("&searchid=");
        stringBuffer.append(Util.nullAsNil(str2));
        Log.m105925i("MicroMsg.TopStory", "reportTopStoryRedDot 14791 %s", stringBuffer.toString());
        C51593us3 us32 = new C51593us3();
        us32.f143104t = stringBuffer.toString();
        C86709a0.m107524d().mo123460f((C117747y) ((C39885s) C86312j.m106911c(C39885s.class)).mo62256Hr(us32));
    }

    /* renamed from: m */
    public static void m26487m() {
        C22614b bVar = f65039a;
        long currentTimeMillis = System.currentTimeMillis();
        bVar.f65042c = currentTimeMillis;
        Log.m105927v("MicroMsg.WebSearch.WebSearchReportLogic", "startH5Report %s", Long.valueOf(currentTimeMillis));
    }

    /* renamed from: n */
    public static void m26488n() {
        C22614b bVar = f65039a;
        long currentTimeMillis = bVar.f65043d + (System.currentTimeMillis() - bVar.f65042c);
        bVar.f65043d = currentTimeMillis;
        Log.m105927v("MicroMsg.WebSearch.WebSearchReportLogic", "stopH5Report %s", Long.valueOf(currentTimeMillis));
    }

    /* renamed from: o */
    public static void m26489o() {
        C22614b bVar = f65039a;
        long currentTimeMillis = bVar.f65045f + (System.currentTimeMillis() - bVar.f65044e);
        bVar.f65045f = currentTimeMillis;
        Log.m105927v("MicroMsg.WebSearch.WebSearchReportLogic", "stopTotalReport %s", Long.valueOf(currentTimeMillis));
    }

    /* renamed from: p */
    public static void m26490p(C61103a aVar) {
        Log.m105925i("MicroMsg.WebSearch.WebSearchReportLogic", "report%s %s", Integer.valueOf(aVar.mo1004j()), aVar.mo1006q().replace(APLogFileUtil.SEPARATOR_LINE, " "));
    }
}
