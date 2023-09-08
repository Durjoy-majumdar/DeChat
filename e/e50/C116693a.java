package e50;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.qcloud.qvb.XNet;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveP2pStatReportStruct;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.network.C81034b0;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: e50.a */
public final class C116693a {

    /* renamed from: W */
    public static C116693a f349962W;

    /* renamed from: X */
    public static boolean f349963X;

    /* renamed from: A */
    public long f349964A;

    /* renamed from: B */
    public long f349965B;

    /* renamed from: C */
    public long f349966C;

    /* renamed from: D */
    public long f349967D;

    /* renamed from: E */
    public long f349968E;

    /* renamed from: F */
    public long f349969F;

    /* renamed from: G */
    public long f349970G;

    /* renamed from: H */
    public long f349971H;

    /* renamed from: I */
    public long f349972I;

    /* renamed from: J */
    public long f349973J;

    /* renamed from: K */
    public long f349974K;

    /* renamed from: L */
    public long f349975L;

    /* renamed from: M */
    public long f349976M;

    /* renamed from: N */
    public long f349977N;

    /* renamed from: O */
    public long f349978O;

    /* renamed from: P */
    public String f349979P = "";

    /* renamed from: Q */
    public final Object f349980Q = new Object();

    /* renamed from: R */
    public boolean f349981R;

    /* renamed from: S */
    public Context f349982S;

    /* renamed from: T */
    public final MTimerHandler f349983T = new MTimerHandler("MicroMsg.MMXp2pWrapper", (MTimerHandler.CallBack) new C116698d(this), true);

    /* renamed from: U */
    public final MTimerHandler f349984U = new MTimerHandler("MicroMsg.MMXp2pWrapper", (MTimerHandler.CallBack) new C116697c(this), true);

    /* renamed from: V */
    public final C29060q f349985V = new C116695b(this);

    /* renamed from: a */
    public int f349986a;

    /* renamed from: b */
    public int f349987b;

    /* renamed from: c */
    public int f349988c;

    /* renamed from: d */
    public int f349989d;

    /* renamed from: e */
    public int f349990e;

    /* renamed from: f */
    public int f349991f;

    /* renamed from: g */
    public int f349992g;

    /* renamed from: h */
    public int f349993h;

    /* renamed from: i */
    public int f349994i = 1;

    /* renamed from: j */
    public String f349995j = "";

    /* renamed from: k */
    public String f349996k = "";

    /* renamed from: l */
    public String f349997l = "";

    /* renamed from: m */
    public String f349998m = "";

    /* renamed from: n */
    public String f349999n = "";

    /* renamed from: o */
    public String f350000o = "";

    /* renamed from: p */
    public String f350001p;

    /* renamed from: q */
    public String f350002q = "";

    /* renamed from: r */
    public String f350003r = "";

    /* renamed from: s */
    public boolean f350004s;

    /* renamed from: t */
    public volatile boolean f350005t;

    /* renamed from: u */
    public volatile boolean f350006u = true;

    /* renamed from: v */
    public long f350007v;

    /* renamed from: w */
    public long f350008w;

    /* renamed from: x */
    public long f350009x;

    /* renamed from: y */
    public long f350010y;

    /* renamed from: z */
    public long f350011z;

    /* renamed from: e50.a$f */
    public static final class C58528f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116693a f167562d;

        public C58528f(C116693a aVar) {
            this.f167562d = aVar;
        }

        public final void run() {
            this.f167562d.mo180712f();
        }
    }

    /* renamed from: e50.a$a */
    public static final class C116694a {
        public C116694a(C8480h hVar) {
        }
    }

    /* renamed from: e50.a$b */
    public static final class C116695b extends C29060q.C29061a {

        /* renamed from: d */
        public final /* synthetic */ C116693a f350012d;

        /* renamed from: e50.a$b$a */
        public static final class C116696a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C116693a f350013d;

            public C116696a(C116693a aVar) {
                this.f350013d = aVar;
            }

            public final void run() {
                this.f350013d.mo180712f();
            }
        }

        public C116695b(C116693a aVar) {
            this.f350012d = aVar;
        }

        public void onNetworkChange(int i) {
            C119179t tVar = C119157j.f356862d;
            C116693a aVar = this.f350012d;
            C116696a aVar2 = new C116696a(aVar);
            aVar.getClass();
            ((C119157j) tVar).mo183876g(aVar2, "MMXp2pWrapper-THREAD-POOL-TAG");
            this.f350012d.getClass();
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper onNetworkChange");
        }
    }

    /* renamed from: e50.a$c */
    public static final class C116697c implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C116693a f350014d;

        public C116697c(C116693a aVar) {
            this.f350014d = aVar;
        }

        public final boolean onTimerExpired() {
            C116693a aVar = this.f350014d;
            if (!aVar.f349981R) {
                return true;
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C116700b(aVar), "MMXp2pWrapper-THREAD-POOL-TAG");
            return true;
        }
    }

    /* renamed from: e50.a$d */
    public static final class C116698d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C116693a f350015d;

        public C116698d(C116693a aVar) {
            this.f350015d = aVar;
        }

        public final boolean onTimerExpired() {
            C116693a aVar = this.f350015d;
            if (!C116693a.f349963X) {
                aVar.getClass();
            } else if (!(aVar.f349986a == 0 || aVar.f350001p == null)) {
                String proxyOf = XNet.proxyOf("live.p2p.com");
                C87412m.m108593f(proxyOf, "proxyOf(p2pDomain)");
                if (C87412m.m108589b(proxyOf, "live.p2p.com") || C87412m.m108589b(proxyOf, "")) {
                    Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper doReport proxy " + proxyOf);
                    return true;
                }
                String str = proxyOf + ("stat?xresid=" + aVar.f350001p + "&token=" + aVar.f350003r);
                C81034b0 b0Var = null;
                try {
                    b0Var = C81035d.m98963d(str, (C81035d.C81037b) null);
                    b0Var.mo112919d(10000);
                    b0Var.mo112923g(10000);
                    b0Var.mo112926h();
                    int a = b0Var.mo112916a();
                    if (a == 200) {
                        InputStream inputStream = b0Var.getInputStream();
                        C87412m.m108593f(inputStream, "con.getInputStream()");
                        String b = aVar.mo180708b(inputStream);
                        inputStream.close();
                        aVar.mo180709c(b);
                        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper getStat dataStr: " + b + " url: " + str);
                    } else {
                        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper getStat error, statusCode: " + a + " url: " + str);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMXp2pWrapper", e, "", new Object[0]);
                    Log.m105920e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper getStat error!!! " + str);
                }
                if (b0Var == null) {
                    return true;
                }
                b0Var.disconnect();
                return true;
            }
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper doReport warning! " + C116693a.f349963X + " p2pSwitch  " + aVar.f349986a + " p2pStremId " + aVar.f350001p);
            return true;
        }
    }

    /* renamed from: e50.a$e */
    public static final class C116699e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116693a f350016d;

        public C116699e(C116693a aVar) {
            this.f350016d = aVar;
        }

        public final void run() {
            if (this.f350016d.f350006u) {
                C116693a aVar = this.f350016d;
                synchronized (aVar.f349980Q) {
                    C116693a.m164564a(aVar, aVar.f349982S, aVar.f349995j, aVar.f349996k, aVar.f349997l);
                    aVar.f349980Q.notifyAll();
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                this.f350016d.f350006u = false;
                C86709a0.m107529k().mo121126a(this.f350016d.f349985V);
                this.f350016d.getClass();
                Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper startP2pService end");
                return;
            }
            C116693a aVar2 = this.f350016d;
            aVar2.f349981R = false;
            aVar2.f349984U.stopTimer();
        }
    }

    static {
        new C116694a((C8480h) null);
    }

    public C116693a() {
        boolean z = true;
        z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_p2p_enable_switch, 0) == 0 ? false : z;
        f349963X = z;
        if (z) {
            mo180711e(MMApplicationContext.getContext());
        }
        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper init " + f349963X);
    }

    /* renamed from: a */
    public static final void m164564a(C116693a aVar, Context context, String str, String str2, String str3) {
        aVar.getClass();
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 15; i++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
        }
        Log.m105920e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper randomString " + stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "buf.toString()");
        aVar.f350003r = stringBuffer2;
        try {
            XNet.create(context, str, str2, str3, stringBuffer2);
            XNet.setLoggerCallback(new C116701c());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMXp2pWrapper", e, "", new Object[0]);
            f349963X = false;
            Log.m105920e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper init P2P error ");
        }
    }

    /* renamed from: b */
    public final String mo180708b(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
        if (!useDelimiter.hasNext()) {
            return "";
        }
        String next = useDelimiter.next();
        C87412m.m108593f(next, "s.next()");
        return next;
    }

    /* renamed from: c */
    public final void mo180709c(String str) {
        String str2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        String str3;
        long j7;
        long j8;
        long j9;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j35;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("flow");
            long optLong = jSONObject.optLong("p2pBytes", 0);
            long optLong2 = jSONObject.optLong("cdnBytes", 0);
            String optString = jSONObject.optString("nat_str", "");
            long j36 = optLong2;
            long optLong3 = jSONObject.optLong("p2p_upload_switch", 0);
            long optLong4 = jSONObject.optLong("p2p_download_switch", 0);
            long optLong5 = jSONObject.optLong("connected", 0);
            long optLong6 = jSONObject.optLong("standby_c", 0);
            long optLong7 = jSONObject.optLong("load", 0);
            String optString2 = jSONObject.optString("isp", "");
            String optString3 = jSONObject.optString("url", "");
            String optString4 = jSONObject.optString("xs_full_url", "");
            String str4 = "url";
            String str5 = "isp";
            String str6 = optString3;
            long optLong8 = jSONObject.optLong("xs_4xx_status", 0);
            String str7 = optString2;
            long j37 = optLong7;
            long optLong9 = jSONObject.optLong("total_pieces", 0);
            long optLong10 = jSONObject.optLong("verify_pieces", 0);
            long optLong11 = jSONObject.optLong("invalid_pieces", 0);
            long optLong12 = jSONObject.optLong("tag_missed_invalid_pieces", 0);
            String optString5 = jSONObject.optString("uuid", "");
            String optString6 = jSONObject.optString("pieceid", "");
            String optString7 = jSONObject.optString("send", "");
            String str8 = "send";
            str2 = "";
            String optString8 = jSONObject.optString("recv", "");
            String str9 = "pieceid";
            String str10 = optString6;
            try {
                long optLong13 = jSONObject.optLong("abnormal_ts_count", 0);
                long optLong14 = jSONObject.optLong("play_ori_by_no_sei", 0);
                long optLong15 = jSONObject.optLong("buffer_length", 0);
                long optLong16 = jSONObject.optLong("max_cdn_firstframe", 0);
                long optLong17 = jSONObject.optLong("max_p2p_firstframe", 0);
                long optLong18 = jSONObject.optLong("first_frame_t", 0);
                long optLong19 = jSONObject.optLong("active_punch_total", 0);
                String str11 = "recv";
                String str12 = "uuid";
                String str13 = optString5;
                long optLong20 = jSONObject.optLong("acitve_punch_succ", 0);
                long optLong21 = jSONObject.optLong("passive_punch_total", 0);
                long optLong22 = jSONObject.optLong("passive_punch_succ", 0);
                long optLong23 = jSONObject.optLong("punch_hole", 0);
                long optLong24 = jSONObject.optLong("played_bytes", 0);
                long optLong25 = jSONObject.optLong("fullstream_bytes", 0);
                long optLong26 = jSONObject.optLong("cdn_substream_bytes", 0);
                long optLong27 = jSONObject.optLong("fillup_bytes", 0);
                long optLong28 = jSONObject.optLong("xntp_bytes", 0);
                long optLong29 = jSONObject.optLong("turn_bytes", 0);
                long optLong30 = jSONObject.optLong("punch_bytes", 0);
                long optLong31 = jSONObject.optLong("tlive_errmsg_early", 0);
                long optLong32 = jSONObject.optLong("tlive_errmsg_miss", 0);
                long optLong33 = jSONObject.optLong("tlive_errmsg_expire", 0);
                long optLong34 = jSONObject.optLong("subscribe_failure_c", 0);
                long optLong35 = jSONObject.optLong("subscribe_refused_c", 0);
                long optLong36 = jSONObject.optLong("subscribe_request_c", 0);
                long optLong37 = jSONObject.optLong("subscribe_success_c", 0);
                long optLong38 = jSONObject.optLong("subscribe_timeout_c", 0);
                long optLong39 = jSONObject.optLong("toofar_subscribe_c", 0);
                long optLong40 = jSONObject.optLong("too_depth_subscribe_c", 0);
                long optLong41 = jSONObject.optLong("checkout_subscribe_c", 0);
                long j38 = this.f350007v;
                if (optLong >= j38) {
                    j = optLong - j38;
                    this.f350007v = optLong;
                } else {
                    j = 0;
                }
                long j39 = this.f350008w;
                if (j36 >= j39) {
                    long j44 = j36 - j39;
                    this.f350008w = j36;
                    j2 = optLong41;
                    j3 = j44;
                } else {
                    j2 = optLong41;
                    j3 = 0;
                }
                long j45 = this.f350009x;
                if (optLong8 >= j45) {
                    j4 = optLong8 - j45;
                    this.f350009x = optLong8;
                } else {
                    j4 = 0;
                }
                long j46 = this.f350010y;
                if (optLong9 >= j46) {
                    this.f350010y = optLong9;
                    j5 = optLong9 - j46;
                } else {
                    j5 = 0;
                }
                long j47 = this.f350011z;
                if (optLong10 >= j47) {
                    this.f350011z = optLong10;
                    str3 = optString7;
                    j6 = optLong10 - j47;
                } else {
                    str3 = optString7;
                    j6 = 0;
                }
                long j48 = this.f349964A;
                if (optLong11 >= j48) {
                    j7 = optLong11 - j48;
                    this.f349964A = optLong11;
                } else {
                    j7 = 0;
                }
                long j49 = this.f349965B;
                if (optLong12 >= j49) {
                    j8 = optLong12 - j49;
                    this.f349965B = optLong12;
                } else {
                    j8 = 0;
                }
                long j54 = this.f349966C;
                if (optLong19 >= j54) {
                    j9 = optLong19 - j54;
                    this.f349966C = optLong19;
                } else {
                    j9 = 0;
                }
                long j55 = this.f349967D;
                if (optLong20 >= j55) {
                    j15 = optLong20 - j55;
                    this.f349967D = optLong20;
                } else {
                    j15 = 0;
                }
                long j56 = this.f349968E;
                if (optLong21 >= j56) {
                    j16 = optLong21 - j56;
                    this.f349968E = optLong21;
                } else {
                    j16 = 0;
                }
                long j57 = this.f349969F;
                if (optLong22 >= j57) {
                    j17 = optLong22 - j57;
                    this.f349969F = optLong22;
                } else {
                    j17 = 0;
                }
                long j58 = this.f349970G;
                if (optLong23 >= j58) {
                    j18 = optLong23 - j58;
                    this.f349970G = optLong23;
                } else {
                    j18 = 0;
                }
                long j59 = this.f349971H;
                if (optLong24 >= j59) {
                    j19 = optLong24 - j59;
                    this.f349971H = optLong24;
                } else {
                    j19 = 0;
                }
                long j64 = this.f349972I;
                if (optLong25 >= j64) {
                    j25 = optLong25 - j64;
                    this.f349972I = optLong25;
                } else {
                    j25 = 0;
                }
                long j65 = this.f349973J;
                if (optLong26 >= j65) {
                    j26 = optLong26 - j65;
                    this.f349973J = optLong26;
                } else {
                    j26 = 0;
                }
                long j66 = this.f349974K;
                if (optLong27 >= j66) {
                    j27 = optLong27 - j66;
                    this.f349974K = optLong27;
                } else {
                    j27 = 0;
                }
                long j67 = this.f349975L;
                if (optLong28 >= j67) {
                    j28 = optLong28 - j67;
                    this.f349975L = optLong28;
                } else {
                    j28 = 0;
                }
                long j68 = this.f349976M;
                if (optLong29 >= j68) {
                    j29 = optLong29 - j68;
                    this.f349976M = optLong29;
                } else {
                    j29 = 0;
                }
                long j69 = this.f349977N;
                if (optLong30 >= j69) {
                    j35 = optLong30 - j69;
                    this.f349977N = optLong30;
                } else {
                    j35 = 0;
                }
                FinderLiveP2pStatReportStruct finderLiveP2pStatReportStruct = new FinderLiveP2pStatReportStruct();
                finderLiveP2pStatReportStruct.f343702d = this.f349978O;
                finderLiveP2pStatReportStruct.f343703e = finderLiveP2pStatReportStruct.mo86045b("finderNickname", this.f349979P, true);
                finderLiveP2pStatReportStruct.f343704f = j;
                finderLiveP2pStatReportStruct.f343705g = j3;
                finderLiveP2pStatReportStruct.f343706h = finderLiveP2pStatReportStruct.mo86045b("natType", optString, true);
                finderLiveP2pStatReportStruct.f343707i = optLong3;
                finderLiveP2pStatReportStruct.f343708j = optLong4;
                finderLiveP2pStatReportStruct.f343709k = optLong5;
                finderLiveP2pStatReportStruct.f343710l = optLong6;
                finderLiveP2pStatReportStruct.f343711m = j37;
                finderLiveP2pStatReportStruct.f343712n = finderLiveP2pStatReportStruct.mo86045b(str5, str7, true);
                finderLiveP2pStatReportStruct.f343713o = finderLiveP2pStatReportStruct.mo86045b(str4, str6, true);
                finderLiveP2pStatReportStruct.f343714p = finderLiveP2pStatReportStruct.mo86045b("full_url", optString4, true);
                finderLiveP2pStatReportStruct.f343715q = j4;
                finderLiveP2pStatReportStruct.f343716r = j6;
                finderLiveP2pStatReportStruct.f343717s = j7;
                finderLiveP2pStatReportStruct.f343718t = j8;
                finderLiveP2pStatReportStruct.f343719u = finderLiveP2pStatReportStruct.mo86045b(str12, str13, true);
                finderLiveP2pStatReportStruct.f343720v = finderLiveP2pStatReportStruct.mo86045b(str9, str10, true);
                finderLiveP2pStatReportStruct.f343721w = finderLiveP2pStatReportStruct.mo86045b(str8, str3, true);
                finderLiveP2pStatReportStruct.f343722x = finderLiveP2pStatReportStruct.mo86045b(str11, optString8, true);
                finderLiveP2pStatReportStruct.f343723y = optLong13;
                finderLiveP2pStatReportStruct.f343724z = j5;
                finderLiveP2pStatReportStruct.f343674A = optLong14;
                finderLiveP2pStatReportStruct.f343675B = optLong15;
                finderLiveP2pStatReportStruct.f343676C = optLong16;
                finderLiveP2pStatReportStruct.f343677D = optLong17;
                finderLiveP2pStatReportStruct.f343678E = optLong18;
                finderLiveP2pStatReportStruct.f343679F = j9;
                finderLiveP2pStatReportStruct.f343680G = j15;
                finderLiveP2pStatReportStruct.f343681H = j16;
                finderLiveP2pStatReportStruct.f343682I = j17;
                finderLiveP2pStatReportStruct.f343683J = j18;
                finderLiveP2pStatReportStruct.f343684K = j19;
                finderLiveP2pStatReportStruct.f343685L = j25;
                finderLiveP2pStatReportStruct.f343686M = j26;
                finderLiveP2pStatReportStruct.f343687N = j27;
                finderLiveP2pStatReportStruct.f343688O = j28;
                finderLiveP2pStatReportStruct.f343689P = j29;
                finderLiveP2pStatReportStruct.f343690Q = j35;
                finderLiveP2pStatReportStruct.f343691R = optLong31;
                finderLiveP2pStatReportStruct.f343692S = optLong32;
                finderLiveP2pStatReportStruct.f343693T = optLong33;
                finderLiveP2pStatReportStruct.f343694U = optLong34;
                finderLiveP2pStatReportStruct.f343695V = optLong35;
                finderLiveP2pStatReportStruct.f343696W = optLong36;
                finderLiveP2pStatReportStruct.f343697X = optLong37;
                finderLiveP2pStatReportStruct.f343698Y = optLong38;
                finderLiveP2pStatReportStruct.f343699Z = optLong39;
                finderLiveP2pStatReportStruct.f343700a0 = optLong40;
                finderLiveP2pStatReportStruct.f343701b0 = j2;
                finderLiveP2pStatReportStruct.mo86054n();
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (JSONException e) {
                e = e;
                Log.printErrStackTrace("MicroMsg.MMXp2pWrapper", e, str2, new Object[0]);
                Log.m105920e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper parseJsonAndReport error!");
            }
        } catch (JSONException e2) {
            e = e2;
            str2 = "";
            Log.printErrStackTrace("MicroMsg.MMXp2pWrapper", e, str2, new Object[0]);
            Log.m105920e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper parseJsonAndReport error!");
        }
    }

    /* renamed from: d */
    public final void mo180710d() {
        this.f350005t = false;
        this.f350001p = null;
        this.f349986a = 0;
        this.f349987b = 0;
        this.f349988c = 0;
        this.f349989d = 0;
        this.f349990e = 0;
        this.f349991f = 0;
        this.f349992g = 0;
        this.f349993h = 0;
        this.f349994i = 1;
        this.f350004s = false;
        this.f349978O = 0;
        this.f349979P = "";
        this.f349995j = "";
        this.f349996k = "";
        this.f349997l = "";
        this.f349998m = "";
        this.f349999n = "";
        this.f350000o = "";
    }

    /* renamed from: e */
    public final void mo180711e(Context context) {
        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper startP2pService begin");
        this.f349982S = context;
        ((C119157j) C119157j.f356862d).mo183876g(new C116699e(this), "MMXp2pWrapper-THREAD-POOL-TAG");
        if (this.f350006u) {
            synchronized (this.f349980Q) {
                this.f349980Q.wait(300);
                Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper startP2pService wait end");
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: f */
    public final void mo180712f() {
        if (!f349963X || ((this.f349986a == 0 || this.f350001p == null) && !this.f350004s)) {
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper updateP2pService warning, " + f349963X + " p2pSwitch:" + this.f349986a + " p2pStremId:" + this.f350001p);
            return;
        }
        String proxyOf = XNet.proxyOf("live.p2p.com");
        C87412m.m108593f(proxyOf, "proxyOf(p2pDomain)");
        if (C87412m.m108589b(proxyOf, "live.p2p.com") || C87412m.m108589b(proxyOf, "")) {
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper updateP2pService proxy " + proxyOf);
            return;
        }
        Object systemService = MMApplicationContext.getContext().getSystemService("connectivity");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        int i = 1;
        boolean z = activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        int i2 = (!z || this.f349987b == 0) ? 0 : 1;
        if (this.f349988c == 0 && !z) {
            i = 0;
        }
        String str = proxyOf + ("feature?download=" + i + "&upload=" + i2 + "&max_load=" + this.f349991f + "&max_buffer_size=" + this.f349992g + "&verifyStream=" + this.f349994i + "&token=" + this.f350003r);
        C81034b0 b0Var = null;
        try {
            b0Var = C81035d.m98963d(str, (C81035d.C81037b) null);
            b0Var.mo112919d(10000);
            b0Var.mo112923g(10000);
            b0Var.mo112926h();
            int a = b0Var.mo112916a();
            if (a == 200) {
                InputStream inputStream = b0Var.getInputStream();
                C87412m.m108593f(inputStream, "con.getInputStream()");
                String b = mo180708b(inputStream);
                inputStream.close();
                Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper switch result: " + b + " url: " + str);
            } else {
                Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper switch error, statusCode: " + a + " url: " + str);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMXp2pWrapper", e, "", new Object[0]);
            Log.m105920e("MicroMsg.MMXp2pWrapper", "xp2p Wrapper switch error " + str);
        }
        if (b0Var != null) {
            b0Var.disconnect();
        }
        if (this.f349990e != 0) {
            XNet.enableDebug();
        } else {
            XNet.disableDebug();
        }
        if (!C87412m.m108589b(this.f349995j, this.f349998m) || !C87412m.m108589b(this.f349996k, this.f349999n) || !C87412m.m108589b(this.f349997l, this.f350000o)) {
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper start setInfo");
            XNet.setInfo(this.f349995j, this.f349996k, this.f349997l);
            this.f349998m = this.f349995j;
            this.f349999n = this.f349996k;
            this.f350000o = this.f349997l;
        }
        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper updateP2pService enableUpload:" + i2 + " enableDownload:" + i + " p2pMaxLoad:" + this.f349991f + " p2pMaxBufferSize:" + this.f349992g + " isOnWifi:" + z + " debugLog:" + this.f349990e);
    }

    /* renamed from: g */
    public final void mo180713g(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, int i9) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "p2pAppid");
        C87412m.m108594g(str2, "p2pKey");
        C87412m.m108594g(str3, "p2pSecret");
        if (!f349963X) {
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper updateP2pSwitches: " + f349963X);
            return;
        }
        int i15 = this.f349986a;
        if (i15 != 0 && i15 == 0) {
            this.f350004s = true;
        }
        this.f349986a = i;
        this.f349987b = i2;
        this.f349988c = i3;
        this.f349989d = i4;
        this.f349990e = i5;
        this.f349991f = i6;
        this.f349992g = i7;
        this.f349993h = i8;
        this.f349995j = str;
        this.f349996k = str2;
        this.f349997l = str3;
        this.f349994i = i9;
        if (C87412m.m108589b(str, "") || C87412m.m108589b(str2, "") || C87412m.m108589b(str3, "")) {
            Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update p2p params Error: " + str + ", " + str2 + ", " + str3);
            return;
        }
        mo180711e(context);
        if (this.f350004s || this.f350005t) {
            ((C119157j) C119157j.f356862d).mo183876g(new C58528f(this), "MMXp2pWrapper-THREAD-POOL-TAG");
            this.f350004s = false;
        }
        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper update p2p params: " + this.f349986a + ", " + this.f349987b + ", " + this.f349988c + ", " + this.f349989d + ", " + this.f349990e + ", " + this.f349991f + ", " + this.f349992g + ' ' + this.f349993h + ' ' + i9);
    }
}
