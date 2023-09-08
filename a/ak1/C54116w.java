package ak1;

import ak1.C54067f0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Base64;
import c30.C104289g;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0773s0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.mmdata.rpt.EnterFinderLiveFromRedDotReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderAudienceHistoryLiveActionLogStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveNoticeLogStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import ei3.C86522b;
import fj1.C45795b;
import gy3.C87412m;
import h81.C59774i;
import ht1.C8777j5;
import j50.C60735a;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import op3.C117878c;
import op3.C117882j;
import org.json.JSONArray;
import org.json.JSONObject;
import p185kq.C10383h;
import p185kq.C61130g;
import p185kq.C61131i;
import p204mr.C61568m;
import p565ir.C60606n;
import pe3.C89349b;
import qj1.C12677tg;
import rx3.C13598b0;
import rx3.C13603j;
import rx3.C13604l;
import sk1.C13696v;
import sx3.C90364q0;
import t91.C64208c;
import tf0.C64916p1;
import u24.C90599h;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import zc1.C66785b;
import zk1.C66880s0;

@C86522b
/* renamed from: ak1.w */
public final class C54116w extends C86301e implements C61568m {

    /* renamed from: j1 */
    public static boolean f151887j1 = false;

    /* renamed from: k1 */
    public static long f151888k1 = 0;

    /* renamed from: l1 */
    public static long f151889l1 = 0;

    /* renamed from: m1 */
    public static long f151890m1 = 0;

    /* renamed from: n1 */
    public static long f151891n1 = 0;

    /* renamed from: o1 */
    public static int f151892o1 = 0;

    /* renamed from: p1 */
    public static int f151893p1 = 0;

    /* renamed from: q1 */
    public static long f151894q1 = 0;

    /* renamed from: r1 */
    public static String f151895r1 = "";

    /* renamed from: s1 */
    public static Object f151896s1;

    /* renamed from: A */
    public ArrayList<String> f151897A = new ArrayList<>();

    /* renamed from: B */
    public int f151898B;

    /* renamed from: C */
    public int f151899C;

    /* renamed from: D */
    public int f151900D;

    /* renamed from: E */
    public int f151901E;

    /* renamed from: F */
    public int f151902F;

    /* renamed from: G */
    public int f151903G;

    /* renamed from: H */
    public int f151904H;

    /* renamed from: I */
    public int f151905I;

    /* renamed from: J */
    public boolean f151906J;

    /* renamed from: K */
    public String f151907K = "";

    /* renamed from: L */
    public long f151908L;

    /* renamed from: M */
    public long f151909M;

    /* renamed from: N */
    public long f151910N;

    /* renamed from: P */
    public long f151911P;

    /* renamed from: Q */
    public boolean f151912Q;

    /* renamed from: Q0 */
    public int f151913Q0;

    /* renamed from: R */
    public boolean f151914R;

    /* renamed from: R0 */
    public int f151915R0;

    /* renamed from: S */
    public String f151916S = "";

    /* renamed from: S0 */
    public final ArrayList<C117878c<C54067f0.C54068a0, Long, Boolean>> f151917S0 = new ArrayList<>();

    /* renamed from: T */
    public C54067f0.C54075o f151918T = C54067f0.C54075o.LIVE_LIVING;

    /* renamed from: T0 */
    public boolean f151919T0;

    /* renamed from: U */
    public boolean f151920U;

    /* renamed from: U0 */
    public boolean f151921U0;

    /* renamed from: V */
    public C54067f0.C54072j0 f151922V = C54067f0.C54072j0.LIVE_SCREEN_HORIZONTAL;

    /* renamed from: V0 */
    public C54067f0.C54068a0 f151923V0 = C54067f0.C54068a0.INVALIDATE;

    /* renamed from: W */
    public long f151924W;

    /* renamed from: W0 */
    public int f151925W0;

    /* renamed from: X */
    public long f151926X;

    /* renamed from: X0 */
    public String f151927X0 = "";

    /* renamed from: Y */
    public long f151928Y;

    /* renamed from: Y0 */
    public boolean f151929Y0;

    /* renamed from: Z */
    public long f151930Z;

    /* renamed from: Z0 */
    public boolean f151931Z0;

    /* renamed from: a1 */
    public C54067f0.C54079q0 f151932a1 = C54067f0.C54079q0.Unknown;

    /* renamed from: b1 */
    public boolean f151933b1;

    /* renamed from: c1 */
    public boolean f151934c1;

    /* renamed from: d */
    public long f151935d;

    /* renamed from: d1 */
    public String f151936d1 = "";

    /* renamed from: e */
    public long f151937e;

    /* renamed from: e1 */
    public boolean f151938e1;

    /* renamed from: f */
    public String f151939f = "";

    /* renamed from: f1 */
    public C0074h0 f151940f1 = C0074h0.ANCHOR;

    /* renamed from: g */
    public String f151941g = "";

    /* renamed from: g1 */
    public boolean f151942g1;

    /* renamed from: h */
    public long f151943h;

    /* renamed from: h1 */
    public boolean f151944h1;

    /* renamed from: i */
    public String f151945i = "";

    /* renamed from: i1 */
    public HashMap<Long, FinderLiveCdnUserEnterLiveTimeCostStruct> f151946i1 = new HashMap<>();

    /* renamed from: j */
    public int f151947j;

    /* renamed from: n */
    public int f151948n;

    /* renamed from: o */
    public int f151949o;

    /* renamed from: p */
    public long f151950p;

    /* renamed from: p0 */
    public int f151951p0;

    /* renamed from: q */
    public final ConcurrentHashMap<Long, Long> f151952q = new ConcurrentHashMap<>();

    /* renamed from: r */
    public Map<String, Object> f151953r = new LinkedHashMap();

    /* renamed from: s */
    public String f151954s = "";

    /* renamed from: t */
    public String f151955t = "";

    /* renamed from: u */
    public int f151956u;

    /* renamed from: v */
    public int f151957v;

    /* renamed from: w */
    public int f151958w;

    /* renamed from: x */
    public int f151959x;

    /* renamed from: x0 */
    public boolean f151960x0;

    /* renamed from: y */
    public int f151961y;

    /* renamed from: y0 */
    public boolean f151962y0;

    /* renamed from: z */
    public int f151963z;

    public static void Ex0(C54116w wVar, C54067f0.C54076o0 o0Var, String str, long j, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        Class cls;
        boolean z;
        String str7;
        String str8;
        Resources resources;
        Configuration configuration;
        Intent intent;
        C54116w wVar2 = wVar;
        C54067f0.C54076o0 o0Var2 = o0Var;
        int i2 = i;
        long j2 = (i2 & 4) != 0 ? -1 : j;
        String str9 = (i2 & 8) != 0 ? null : str2;
        String str10 = (i2 & 16) != 0 ? "" : str3;
        String str11 = (i2 & 32) != 0 ? "" : str4;
        String str12 = (i2 & 64) != 0 ? null : str5;
        String str13 = (i2 & 128) != 0 ? "" : str6;
        wVar.getClass();
        Class cls2 = C54979h1.class;
        C54067f0.C54076o0 o0Var3 = C54067f0.C54076o0.EXIT_BEFORE_JOIN_RESP;
        Class cls3 = C10383h.class;
        C87412m.m108594g(o0Var2, "action");
        C87412m.m108594g(str13, "contextId");
        String str14 = str == null ? "" : str;
        String str15 = str9;
        if (wVar2.f151918T != C54067f0.C54075o.LIVE_STOPPED || o0Var2 == o0Var3 || o0Var2 == C54067f0.C54076o0.REPLAY_TRANSITION) {
            if (j2 <= 0) {
                j2 = System.currentTimeMillis();
            }
            FinderAudienceActionLogStruct finderAudienceActionLogStruct = new FinderAudienceActionLogStruct();
            long j3 = j2;
            finderAudienceActionLogStruct.f155048d = finderAudienceActionLogStruct.mo86045b("LiveID", ((C10383h) C86312j.m106911c(cls3)).mo10700XQ(wVar2.f151937e), true);
            String str16 = str12;
            Class cls4 = cls2;
            finderAudienceActionLogStruct.f155049e = finderAudienceActionLogStruct.mo86045b("FeedID", ((C10383h) C86312j.m106911c(cls3)).mo10700XQ(wVar2.f151943h), true);
            finderAudienceActionLogStruct.f155050f = finderAudienceActionLogStruct.mo86045b("UserName", wVar2.f151939f, true);
            finderAudienceActionLogStruct.f155051g = finderAudienceActionLogStruct.mo86045b("Topic", URLEncoder.encode(wVar2.f151941g, "UTF-8"), true);
            finderAudienceActionLogStruct.f155044E = finderAudienceActionLogStruct.mo86045b("ClickSubTabContextId", wVar2.f151955t, true);
            if (C87412m.m108589b(wVar2.f151945i, "temp_6") && C87412m.m108589b(((C61131i) C86312j.m106911c(C61131i.class)).mo86084Y7(), "111")) {
                wVar2.f151945i = "temp_7";
            }
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "FinderLiveCommentScene get " + wVar2.f151945i + " when report21084");
            String str17 = wVar2.f151945i;
            if (str10 == null || str10.length() == 0) {
                str10 = str17;
            }
            if (str11 == null || str11.length() == 0) {
                str11 = wVar2.f151907K;
            }
            C66880s0 a = C54117x.m60830a();
            if (a != null) {
                if (a.f192141n) {
                    str11 = wVar2.vx0(str11, "enter_immerse_type", "194");
                }
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                Context context = bVar != null ? bVar.getContext() : null;
                MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
                Integer valueOf = (mMActivity == null || (intent = mMActivity.getIntent()) == null) ? null : Integer.valueOf(intent.getIntExtra("ScanScene", 0));
                if (valueOf == null || valueOf.intValue() != 0) {
                    str11 = wVar2.vx0(str11, "scan_code_sence", String.valueOf(valueOf));
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C0773s0 a2 = C0773s0.f1815b.mo714a();
            C55001u uVar = (C55001u) FinderLiveService.f159376d.mo77630e(C55001u.class);
            String b = a2.mo713b(uVar != null ? uVar.f154414h : 0, str11);
            finderAudienceActionLogStruct.f155052h = finderAudienceActionLogStruct.mo86045b("CommentScene", str10, true);
            finderAudienceActionLogStruct.f155053i = (long) wVar2.f151948n;
            if ((str13.length() == 0) && (str13 = ((C10383h) C86312j.m106911c(cls3)).mo10696E()) == null) {
                str13 = "";
            }
            finderAudienceActionLogStruct.f155054j = finderAudienceActionLogStruct.mo86045b("ContextId", str13, true);
            String S0 = ((C10383h) C86312j.m106911c(cls3)).mo10698S0();
            if (S0 == null) {
                S0 = "";
            }
            finderAudienceActionLogStruct.f155055k = finderAudienceActionLogStruct.mo86045b("ClickTabContextId", S0, true);
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderAudienceActionLogStruct.f155056l = finderAudienceActionLogStruct.mo86045b("SessionID", Wb, true);
            finderAudienceActionLogStruct.f155043D = finderAudienceActionLogStruct.mo86045b("chnl_extra", b != null ? C112551y.m153814n(b, ",", ";", false) : null, true);
            C56032b bVar2 = FinderLiveService.f159379g;
            Context context2 = bVar2 != null ? bVar2.getContext() : null;
            finderAudienceActionLogStruct.f155068x = context2 != null && (resources = context2.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2 ? 2 : 1;
            finderAudienceActionLogStruct.f155057m = finderAudienceActionLogStruct.mo86045b("SessionBuffer", wVar2.zx0(wVar2.f151943h, str10), true);
            C45795b bVar3 = C45795b.f123698n;
            if (bVar3 != null) {
                cls = cls4;
                z = ((C54979h1) bVar3.mo71262a(cls)).f154137i;
            } else {
                cls = cls4;
                z = false;
            }
            C45795b bVar4 = C45795b.f123698n;
            finderAudienceActionLogStruct.f155058n = (long) ((!z || !(bVar4 != null ? ((C54979h1) bVar4.mo71262a(cls)).f154134f : false)) ? z ? C54067f0.C54074k0.LIVE_SHOP_PERMIT_NO_SMALL_STORE : C54067f0.C54074k0.LIVE_NO_SHOP_PERMIT : C54067f0.C54074k0.LIVE_SHOP_PERMIT_SMALL_STORE).f151516d;
            finderAudienceActionLogStruct.f155059o = wVar2.yx0(wVar2.f151937e);
            C54067f0.C54076o0 o0Var4 = C54067f0.C54076o0.EnterRoom;
            if (o0Var2 == o0Var4 || o0Var2 == o0Var3) {
                Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "LiveKeyReport1# report21084 action:" + o0Var2 + ", enterSessionId:" + finderAudienceActionLogStruct.f155059o);
            }
            long j4 = j3;
            long j5 = j4 - wVar2.f151935d;
            if (j5 <= 0) {
                j5 = 0;
            }
            finderAudienceActionLogStruct.f155060p = j5;
            long j6 = wVar2.f151910N;
            String str18 = "HABBYGE-MALI.HellLiveVisitorReoprter";
            long j7 = wVar2.f151911P;
            if (wVar2.f151912Q) {
                str7 = "";
                long j8 = wVar2.f151909M;
                if (j8 > 0) {
                    long j9 = j4 - j8;
                    if (j9 <= 0) {
                        j9 = 0;
                    }
                    j7 += j9;
                }
            } else {
                str7 = "";
                long j15 = wVar2.f151908L;
                if (j15 > 0) {
                    long j16 = j4 - j15;
                    if (j16 <= 0) {
                        j16 = 0;
                    }
                    j6 += j16;
                }
            }
            finderAudienceActionLogStruct.f155062r = j7;
            finderAudienceActionLogStruct.f155061q = j6;
            finderAudienceActionLogStruct.f155063s = wVar2.f151918T.f151523d;
            finderAudienceActionLogStruct.f155064t = j4;
            finderAudienceActionLogStruct.f155065u = (long) o0Var2.f151603d;
            finderAudienceActionLogStruct.f155066v = finderAudienceActionLogStruct.mo86045b("ActionResult", C112551y.m153814n(str14, ",", ";", false), true);
            ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
            finderAudienceActionLogStruct.f155067w = C54108o.f151869h.mo74755e(finderAudienceActionLogStruct.f155052h, (long) wVar2.f151947j);
            finderAudienceActionLogStruct.f155068x = (long) wVar2.f151922V.f151506d;
            finderAudienceActionLogStruct.f155069y = finderAudienceActionLogStruct.mo86045b("AdData", C112551y.m153816p(C64208c.f181951a.mo89027b(wVar2.f151939f), ",", ";", false, 4, (Object) null), true);
            String str19 = wVar2.f151927X0;
            finderAudienceActionLogStruct.f155070z = finderAudienceActionLogStruct.mo86045b("Scenenote", str19 != null ? C112551y.m153814n(str19, ",", ";", false) : str7, true);
            finderAudienceActionLogStruct.f155040A = (long) C66785b.f191882e.mo90673n0().f131584h;
            if (str16 == null) {
                C45795b bVar5 = C45795b.f123698n;
                if (bVar5 == null || (str8 = ((C54991o) bVar5.mo71262a(C54991o.class)).f154318g2) == null) {
                    str8 = str7;
                }
                finderAudienceActionLogStruct.f155041B = finderAudienceActionLogStruct.mo86045b("request_id", str8, true);
            } else {
                finderAudienceActionLogStruct.f155041B = finderAudienceActionLogStruct.mo86045b("request_id", str16, true);
            }
            String str20 = str7;
            finderAudienceActionLogStruct.f155046G = finderAudienceActionLogStruct.mo86045b("CouponId", str20, true);
            if (str15 != null) {
                finderAudienceActionLogStruct.f155045F = finderAudienceActionLogStruct.mo86045b("ActionStyle", C112551y.m153814n(str15, ",", ";", false), true);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
            finderAudienceActionLogStruct.f155047H = finderAudienceActionLogStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
            finderAudienceActionLogStruct.mo86054n();
            Log.m105924i(str18, "report21084, liveId=" + finderAudienceActionLogStruct.f155048d + ", feedId=" + finderAudienceActionLogStruct.f155049e + ", username=" + finderAudienceActionLogStruct.f155050f + ", topic=" + finderAudienceActionLogStruct.f155051g + ", commentScene=" + finderAudienceActionLogStruct.f155052h + ", isPrivate=" + finderAudienceActionLogStruct.f155053i + ", contextId=" + finderAudienceActionLogStruct.f155054j + ", clickTabContextId=" + finderAudienceActionLogStruct.f155055k + ", sessionId=" + finderAudienceActionLogStruct.f155056l + ", sessionBuffer=" + finderAudienceActionLogStruct.f155057m + ", shopPermit=" + finderAudienceActionLogStruct.f155058n + ", enterSessionId=" + finderAudienceActionLogStruct.f155059o + ", liveTime=" + finderAudienceActionLogStruct.f155060p + ", floatDuration=" + finderAudienceActionLogStruct.f155062r + ", fullDuration=" + finderAudienceActionLogStruct.f155061q + ", enterStatus=" + finderAudienceActionLogStruct.f155063s + ", actionTS=" + finderAudienceActionLogStruct.f155064t + ", action=" + finderAudienceActionLogStruct.f155065u + ", enterIconType=" + finderAudienceActionLogStruct.f155067w + ", pageType=" + finderAudienceActionLogStruct.f155068x + ", adData=" + finderAudienceActionLogStruct.f155069y + ", scenenote=" + finderAudienceActionLogStruct.f155070z + ", identityType=" + finderAudienceActionLogStruct.f155040A + ", request_id=" + finderAudienceActionLogStruct.f155041B + ", actionStyle=" + finderAudienceActionLogStruct.f155045F + ", actionResult=" + finderAudienceActionLogStruct.f155066v + ", couponId=" + finderAudienceActionLogStruct.f155046G + ", chnlExtra=" + finderAudienceActionLogStruct.f155043D);
            if (o0Var2 == o0Var4) {
                C13604l[] lVarArr = new C13604l[12];
                String str21 = finderAudienceActionLogStruct.f155048d;
                if (str21 == null) {
                    str21 = str20;
                }
                lVarArr[0] = new C13604l("live_id", str21);
                String str22 = finderAudienceActionLogStruct.f155049e;
                if (str22 == null) {
                    str22 = str20;
                }
                lVarArr[1] = new C13604l("feed_id", str22);
                String str23 = finderAudienceActionLogStruct.f155050f;
                if (str23 == null) {
                    str23 = str20;
                }
                lVarArr[2] = new C13604l("finder_username", str23);
                String str24 = finderAudienceActionLogStruct.f155052h;
                if (str24 == null) {
                    str24 = str20;
                }
                lVarArr[3] = new C13604l("comment_scene", str24);
                String str25 = finderAudienceActionLogStruct.f155054j;
                if (str25 == null) {
                    str25 = str20;
                }
                lVarArr[4] = new C13604l("finder_context_id", str25);
                String str26 = finderAudienceActionLogStruct.f155055k;
                if (str26 == null) {
                    str26 = str20;
                }
                lVarArr[5] = new C13604l("finder_tab_context_id", str26);
                String str27 = finderAudienceActionLogStruct.f155056l;
                if (str27 == null) {
                    str27 = str20;
                }
                lVarArr[6] = new C13604l("behaviour_session_id", str27);
                String str28 = finderAudienceActionLogStruct.f155057m;
                lVarArr[7] = new C13604l("session_buffer", str28 == null ? str20 : str28);
                lVarArr[8] = new C13604l("enter_session_id", Long.valueOf(finderAudienceActionLogStruct.f155059o));
                lVarArr[9] = new C13604l("live_state", Long.valueOf(finderAudienceActionLogStruct.f155063s));
                lVarArr[10] = new C13604l("live_enter_icon_type", Long.valueOf(finderAudienceActionLogStruct.f155067w));
                lVarArr[11] = new C13604l("role_type", Long.valueOf(finderAudienceActionLogStruct.f155040A));
                wVar2.f151953r = C90364q0.m113148g(lVarArr);
                return;
            }
            return;
        }
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report21084, LIVE_STOPPED, do need to report !");
    }

    public static void Rx0(C54116w wVar, C54067f0.C54081r0 r0Var, String str, String str2, String str3, String str4, String str5, int i, long j, JSONObject jSONObject, int i2, Object obj) {
        int i3;
        String str6;
        C54067f0.C54081r0 r0Var2;
        C54116w wVar2;
        C45795b bVar;
        String str7;
        C54116w wVar3 = wVar;
        C54067f0.C54081r0 r0Var3 = r0Var;
        String str8 = str;
        String str9 = str2;
        int i4 = i2;
        String str10 = (i4 & 8) != 0 ? "" : str3;
        String str11 = (i4 & 16) != 0 ? "" : str4;
        String str12 = (i4 & 32) != 0 ? "" : str5;
        int i5 = (i4 & 64) != 0 ? -1 : i;
        long j2 = (i4 & 128) != 0 ? -1 : j;
        JSONObject jSONObject2 = (i4 & 256) != 0 ? null : jSONObject;
        wVar.getClass();
        C54067f0.C54081r0 r0Var4 = C54067f0.C54081r0.CommerceActionGoodsItemClick;
        Class cls = C54979h1.class;
        C87412m.m108594g(r0Var3, "action");
        C87412m.m108594g(str10, "canvasid");
        C87412m.m108594g(str11, "aid");
        C54067f0.C54081r0 r0Var5 = r0Var4;
        C87412m.m108594g(str12, "uxinfo");
        long j3 = j2;
        StringBuilder sb = new StringBuilder();
        sb.append("fxxkshopreport reportCommerceAction action:");
        sb.append(r0Var3);
        sb.append(", requestid:");
        C45795b bVar2 = C45795b.f123698n;
        if (bVar2 != null) {
            i3 = i5;
            str6 = ((C54991o) bVar2.mo71262a(C54991o.class)).f154318g2;
        } else {
            i3 = i5;
            str6 = null;
        }
        sb.append(str6);
        sb.append(", json:");
        sb.append(jSONObject2);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", sb.toString());
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        int ordinal = r0Var.ordinal();
        String str13 = "HABBYGE-MALI.HellLiveVisitorReoprter";
        if (ordinal != 0) {
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                        wVar3.f151916S = "";
                        jSONObject2.put("type", r0Var3.f151675d);
                        jSONObject2.put("canvasid", str10);
                        jSONObject2.put("aid", str11);
                        jSONObject2.put("uxinfo", str12);
                        break;
                }
            }
            jSONObject2.put("type", r0Var3.f151675d);
            jSONObject2.put("canvasid", str10);
            jSONObject2.put("aid", str11);
            jSONObject2.put("uxinfo", str12);
        } else {
            if (!C87412m.m108589b(str9 == null ? "" : str9, wVar3.f151916S)) {
                wVar3.f151916S = str9 == null ? "" : str9;
                jSONObject2.put("type", r0Var3.f151675d);
                jSONObject2.put("canvasid", str10);
                jSONObject2.put("aid", str11);
                jSONObject2.put("uxinfo", str12);
            } else {
                return;
            }
        }
        jSONObject2.put("commerceAction", r0Var3.f151675d);
        if (!C90599h.m113511d(str)) {
            jSONObject2.put("session", str8);
        }
        if (!C90599h.m113511d(str2)) {
            jSONObject2.put("productid", str9);
        }
        jSONObject2.put("clickid", C64208c.f181969s);
        jSONObject2.put("appid", C64208c.f181970t);
        jSONObject2.put("liveid", TextUtils.isEmpty(C64208c.f181971u) ? Long.valueOf(wVar3.f151937e) : C64208c.f181971u);
        jSONObject2.put("shopwindowid", C64208c.f181972v);
        jSONObject2.put("sessionid", C64208c.f181973w);
        if (!(jSONObject2.has("couponid") || (bVar = C45795b.f123698n) == null || (str7 = ((C54979h1) bVar.mo71262a(cls)).f154112D) == null)) {
            jSONObject2.put("couponid", str7);
        }
        C64208c.f181969s = "";
        C64208c.f181970t = "";
        C64208c.f181971u = "";
        C64208c.f181972v = "";
        C64208c.f181973w = "";
        if (i3 > 0) {
            jSONObject2.put("advertisement_type", i3);
        }
        long j4 = j3;
        if (j4 > 0) {
            jSONObject2.put("advertisement_id", j4);
        }
        String str14 = str13;
        Class cls2 = cls;
        C54067f0.C54081r0 r0Var6 = r0Var5;
        Ex0(wVar, C54067f0.C54076o0.Commerce, jSONObject2.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("reportCommerceAction, action=");
        sb4.append(r0Var.name());
        sb4.append(", shopSessionId=");
        sb4.append(str8);
        sb4.append(", productId=");
        sb4.append(str9);
        sb4.append(" couponId=");
        C45795b bVar3 = C45795b.f123698n;
        sb4.append(bVar3 != null ? ((C54979h1) bVar3.mo71262a(cls2)).f154112D : null);
        Log.m105924i(str14, sb4.toString());
        if ((r0Var3 == C54067f0.C54081r0.CommerceActionBubbleTipClick || r0Var3 == r0Var6 || r0Var3 == C54067f0.C54081r0.CommerceActionPurchaseButtonClick) && str9 != null) {
            wVar2 = wVar;
            r0Var2 = r0Var6;
            if (!wVar2.f151897A.contains(str9)) {
                wVar2.f151897A.add(str9);
            }
        } else {
            wVar2 = wVar;
            r0Var2 = r0Var6;
        }
        if (r0Var3 == r0Var2 || r0Var3 == C54067f0.C54081r0.CommerceActionGoodsOrderButtonClick) {
            wVar2.f151914R = true;
        }
    }

    public static /* synthetic */ void Yx0(C54116w wVar, C54067f0.C0069t0 t0Var, Boolean bool, C12677tg.C12678a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            aVar = C12677tg.C12678a.DEFAULT;
        }
        wVar.Xx0(t0Var, bool, aVar);
    }

    public static /* synthetic */ void dy0(C54116w wVar, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = "";
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        wVar.cy0(i, str, i2);
    }

    public static /* synthetic */ void gy0(C54116w wVar, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            str2 = null;
        }
        wVar.ey0(i, i2, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void my0(ak1.C54116w r12, ak1.C54067f0.C0071v0 r13, java.lang.String r14, java.lang.String r15, int r16, int r17, java.lang.Object r18) {
        /*
            r0 = r12
            r1 = r13
            r2 = r17 & 4
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x000a
            r2 = r3
            goto L_0x000b
        L_0x000a:
            r2 = r15
        L_0x000b:
            r4 = r17 & 8
            r5 = 0
            if (r4 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r16
        L_0x0014:
            r12.getClass()
            java.lang.String r6 = "type"
            gy3.C87412m.m108594g(r13, r6)
            java.lang.String r7 = "comment"
            gy3.C87412m.m108594g(r2, r7)
            int r7 = r13.ordinal()
            if (r7 == 0) goto L_0x006d
            r5 = 7
            r8 = 1
            if (r7 == r5) goto L_0x006a
            r5 = 2
            if (r7 == r5) goto L_0x0065
            r2 = 3
            if (r7 == r2) goto L_0x0056
            r2 = 4
            if (r7 == r2) goto L_0x0050
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "reportLettery ERROR: "
            r2.append(r5)
            java.lang.String r5 = r13.name()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            goto L_0x0071
        L_0x0050:
            int r2 = r0.f151951p0
            int r2 = r2 + r8
            r0.f151951p0 = r2
            goto L_0x0071
        L_0x0056:
            boolean r2 = r0.f151934c1
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = r0.f151936d1
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00a1
            java.lang.String r2 = r0.f151936d1
            goto L_0x0072
        L_0x0065:
            r0.f151934c1 = r8
            r0.f151936d1 = r2
            goto L_0x0071
        L_0x006a:
            r0.f151960x0 = r8
            goto L_0x0071
        L_0x006d:
            r0.f151934c1 = r5
            r0.f151936d1 = r3
        L_0x0071:
            r2 = r14
        L_0x0072:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            int r1 = r1.f380d
            r5.put(r6, r1)
            if (r2 != 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = r2
        L_0x0080:
            java.lang.String r1 = "result"
            r5.put(r1, r3)
            if (r4 == 0) goto L_0x008d
            java.lang.String r1 = "ui_type"
            r5.put(r1, r4)
        L_0x008d:
            ak1.f0$o0 r1 = ak1.C54067f0.C54076o0.LOTTERY
            java.lang.String r2 = r5.toString()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 252(0xfc, float:3.53E-43)
            r11 = 0
            r0 = r12
            Ex0(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54116w.my0(ak1.w, ak1.f0$v0, java.lang.String, java.lang.String, int, int, java.lang.Object):void");
    }

    public static /* synthetic */ void oy0(C54116w wVar, C54067f0.C54085u0 u0Var, C54067f0.C54068a0 a0Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            a0Var = C54067f0.C54068a0.INVALIDATE;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        wVar.ny0(u0Var, a0Var, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x07d6  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x07de  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0115 A[SYNTHETIC, Splitter:B:29:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void wy0(ak1.C54116w r28, android.content.Context r29, ak1.C54067f0.C54079q0 r30, android.os.Bundle r31, boolean r32, int r33, java.lang.Object r34) {
        /*
            r13 = r28
            r0 = r29
            r14 = r30
            r1 = r33 & 4
            if (r1 == 0) goto L_0x000c
            r1 = 0
            goto L_0x000e
        L_0x000c:
            r1 = r31
        L_0x000e:
            r2 = r33 & 8
            r12 = 0
            if (r2 == 0) goto L_0x0016
            r16 = 0
            goto L_0x0018
        L_0x0016:
            r16 = r32
        L_0x0018:
            r28.getClass()
            ak1.f0$o r11 = ak1.C54067f0.C54075o.LIVE_STOPPED
            ak1.f0$u0 r2 = ak1.C54067f0.C54085u0.INVALIDATE
            ak1.f0$u0 r3 = ak1.C54067f0.C54085u0.ACTIVE_STOP_AUDIO_LINKMIC
            ak1.f0$u0 r4 = ak1.C54067f0.C54085u0.ACTIVE_STOP_VIDEO_LINKMIC
            java.lang.String r5 = "type"
            gy3.C87412m.m108594g(r14, r5)
            boolean r5 = r13.f151962y0
            if (r5 != 0) goto L_0x0031
            if (r16 != 0) goto L_0x0031
            goto L_0x0806
        L_0x0031:
            boolean r5 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            java.lang.String r10 = ""
            if (r5 == 0) goto L_0x00f7
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            bl3.r$a r0 = r5.mo62444c(r0)
            java.lang.Class<dk1.g> r6 = dk1.C58312g.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r6)
            java.lang.String r6 = "UICProvider.of(context).…veSideBarUIC::class.java)"
            gy3.C87412m.m108593f(r0, r6)
            dk1.g r0 = (dk1.C58312g) r0
            boolean r6 = r0.f166967e
            if (r6 == 0) goto L_0x00f7
            dk1.g$a r0 = r0.f166971i
            r0.getClass()
            dk1.g r6 = dk1.C58312g.this
            android.app.Activity r6 = r6.getContext()
            bl3.r$a r5 = r5.mo62443b(r6)
            java.lang.Class<ht1.g4> r6 = ht1.C60172g4.class
            bl3.c r5 = r5.mo62447c(r6)
            ht1.g4 r5 = (ht1.C60172g4) r5
            java.lang.String r5 = r5.mo12868z3()
            boolean r6 = r0.f166974c
            java.lang.String r7 = "active_index"
            java.lang.String r8 = "active_id"
            if (r6 == 0) goto L_0x0088
            int r6 = r0.f166972a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r0.mo83063a(r5, r8, r6)
            int r6 = r0.f166977f
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r0.mo83063a(r5, r7, r6)
            goto L_0x00a5
        L_0x0088:
            java.lang.String r6 = "single_stream_type"
            java.lang.String r9 = "active"
            java.lang.String r5 = r0.mo83063a(r5, r6, r9)
            int r6 = r0.f166972a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r0.mo83063a(r5, r8, r6)
            int r6 = r0.f166977f
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r0.mo83063a(r5, r7, r6)
        L_0x00a5:
            dk1.g r6 = dk1.C58312g.this
            java.lang.String r6 = r6.f166966d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            dk1.g r8 = dk1.C58312g.this
            dk1.g$a r8 = r8.f166971i
            int r8 = r8.hashCode()
            r7.append(r8)
            java.lang.String r8 = "report genQuitLiveChnlExtra "
            r7.append(r8)
            boolean r8 = r0.f166974c
            r7.append(r8)
            java.lang.String r8 = ", "
            r7.append(r8)
            int r9 = r0.f166972a
            r7.append(r9)
            r7.append(r8)
            int r9 = r0.f166977f
            r7.append(r9)
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            boolean r0 = r0.f166974c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "temp_33"
            r17 = r0
            goto L_0x00fa
        L_0x00f4:
            r17 = r10
            goto L_0x00fa
        L_0x00f7:
            r5 = r10
            r17 = r5
        L_0x00fa:
            java.lang.String r0 = r13.f151945i
            java.lang.String r6 = "135"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r6)
            java.lang.String r9 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            if (r0 == 0) goto L_0x0158
            if (r1 == 0) goto L_0x0158
            java.util.Map r0 = r13.wx0(r1)
            r1 = r0
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0158
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x013f }
            r1.<init>()     // Catch:{ all -> 0x013f }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x013f }
            java.util.Set r6 = r0.keySet()     // Catch:{ all -> 0x013f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x013f }
        L_0x0124:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x013f }
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x013f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x013f }
            java.lang.Object r8 = r0.get(r7)     // Catch:{ all -> 0x013f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x013f }
            r1.putOpt(r7, r8)     // Catch:{ all -> 0x013f }
            goto L_0x0124
        L_0x013a:
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x013f }
            goto L_0x0158
        L_0x013f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "err:"
            r1.append(r6)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
        L_0x0158:
            r0 = r5
            fe1.d$b r18 = fe1.C58961d.f168673a
            java.lang.String r1 = r13.f151939f
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 14
            r24 = 0
            r19 = r1
            boolean r1 = fe1.C58961d.C58963b.m68836h(r18, r19, r20, r21, r22, r23, r24)
            r13.f151904H = r1
            r13.f151962y0 = r12
            int r1 = r30.ordinal()
            r8 = 2
            r7 = 1
            if (r1 == r7) goto L_0x019f
            if (r1 == r8) goto L_0x019f
            r5 = 4
            if (r1 == r5) goto L_0x019f
            r5 = 5
            if (r1 == r5) goto L_0x019f
            boolean r1 = r13.f151921U0
            if (r1 == 0) goto L_0x01bc
            r13.f151919T0 = r12
            ak1.f0$a0 r1 = r13.f151923V0
            int r1 = r1.ordinal()
            if (r1 == r7) goto L_0x0194
            if (r1 == r8) goto L_0x0192
            goto L_0x0195
        L_0x0192:
            r2 = r4
            goto L_0x0195
        L_0x0194:
            r2 = r3
        L_0x0195:
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r28
            oy0(r1, r2, r3, r4, r5, r6)
            goto L_0x01bc
        L_0x019f:
            boolean r1 = r13.f151921U0
            if (r1 == 0) goto L_0x01bc
            r13.f151919T0 = r7
            ak1.f0$a0 r1 = r13.f151923V0
            int r1 = r1.ordinal()
            if (r1 == r7) goto L_0x01b2
            if (r1 == r8) goto L_0x01b0
            goto L_0x01b3
        L_0x01b0:
            r2 = r4
            goto L_0x01b3
        L_0x01b2:
            r2 = r3
        L_0x01b3:
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r28
            oy0(r1, r2, r3, r4, r5, r6)
        L_0x01bc:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            p50.e r2 = r6.mo77631e0()
            if (r2 == 0) goto L_0x01d6
            b50.g r2 = r2.f176822Y0
            if (r2 == 0) goto L_0x01d6
            d50.g r2 = r2.f152628b
            if (r2 == 0) goto L_0x01d6
            int r2 = r2.mo82868a()
            goto L_0x01d7
        L_0x01d6:
            r2 = 0
        L_0x01d7:
            java.lang.String r3 = "birate"
            r1.put(r3, r2)
            ak1.f0$o0 r2 = ak1.C54067f0.C54076o0.QuitRoom
            int r3 = r14.f151635d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 0
            java.lang.String r18 = r1.toString()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 244(0xf4, float:3.42E-43)
            r24 = 0
            r1 = r28
            r15 = r6
            r6 = r18
            r7 = r19
            r8 = r20
            r25 = r9
            r9 = r21
            r26 = r10
            r10 = r22
            r27 = r11
            r11 = r23
            r18 = r15
            r15 = 0
            r12 = r24
            Ex0(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x021e
            int r1 = r0.length()
            if (r1 != 0) goto L_0x021c
            goto L_0x021e
        L_0x021c:
            r12 = 0
            goto L_0x021f
        L_0x021e:
            r12 = 1
        L_0x021f:
            if (r12 == 0) goto L_0x0223
            java.lang.String r0 = r13.f151907K
        L_0x0223:
            zk1.s0 r1 = ak1.C54117x.m60830a()
            if (r1 == 0) goto L_0x029b
            java.lang.String r0 = r1.mo90875c3(r0)
            boolean r2 = r1.f192141n
            if (r2 == 0) goto L_0x0239
            java.lang.String r2 = "enter_immerse_type"
            java.lang.String r3 = "194"
            java.lang.String r0 = r13.vx0(r0, r2, r3)
        L_0x0239:
            com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r2 == 0) goto L_0x0242
            android.content.Context r2 = r2.getContext()
            goto L_0x0243
        L_0x0242:
            r2 = 0
        L_0x0243:
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r3 == 0) goto L_0x024a
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            goto L_0x024b
        L_0x024a:
            r2 = 0
        L_0x024b:
            if (r2 == 0) goto L_0x025e
            android.content.Intent r2 = r2.getIntent()
            if (r2 == 0) goto L_0x025e
            java.lang.String r3 = "ScanScene"
            int r2 = r2.getIntExtra(r3, r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x025f
        L_0x025e:
            r2 = 0
        L_0x025f:
            if (r2 != 0) goto L_0x0262
            goto L_0x0268
        L_0x0262:
            int r3 = r2.intValue()
            if (r3 == 0) goto L_0x0272
        L_0x0268:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "scan_code_sence"
            java.lang.String r0 = r13.vx0(r0, r3, r2)
        L_0x0272:
            java.lang.String r2 = r1.f192144q
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x027c
            r12 = 1
            goto L_0x027d
        L_0x027c:
            r12 = 0
        L_0x027d:
            if (r12 == 0) goto L_0x029b
            int r1 = r1.f192143p
            r2 = 1
            if (r1 != r2) goto L_0x0286
            r12 = 1
            goto L_0x0287
        L_0x0286:
            r12 = 0
        L_0x0287:
            if (r12 == 0) goto L_0x029c
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r3 = 31
            r4 = 65
            r5 = 2
            java.lang.String r10 = r1.mo76802R1(r3, r5, r4)
            goto L_0x029f
        L_0x029b:
            r2 = 1
        L_0x029c:
            r5 = 2
            r10 = r26
        L_0x029f:
            java.lang.Class<kq.h> r1 = p185kq.C10383h.class
            ak1.f0$o r3 = r13.f151918T
            r4 = r27
            if (r3 != r4) goto L_0x02b4
            if (r16 != 0) goto L_0x02b4
            java.lang.String r0 = "report21178, LIVE_STOPPED, do need to report !"
            r3 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r3 = r26
            goto L_0x07cc
        L_0x02b4:
            r3 = r25
            int r6 = r14.f151635d
            r13.f151949o = r6
            long r6 = eb0.C31543z5.m39453c()
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveAudienceResultStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveAudienceResultStruct
            r8.<init>()
            di3.d r9 = di3.C86312j.m106911c(r1)
            kq.h r9 = (p185kq.C10383h) r9
            long r11 = r13.f151937e
            java.lang.String r9 = r9.mo10700XQ(r11)
            java.lang.String r11 = "LiveID"
            java.lang.String r9 = r8.mo86045b(r11, r9, r2)
            r8.f155465d = r9
            di3.d r9 = di3.C86312j.m106911c(r1)
            kq.h r9 = (p185kq.C10383h) r9
            long r11 = r13.f151943h
            java.lang.String r9 = r9.mo10700XQ(r11)
            java.lang.String r11 = "FeedID"
            java.lang.String r9 = r8.mo86045b(r11, r9, r2)
            r8.f155467e = r9
            java.lang.String r9 = r13.f151939f
            java.lang.String r11 = "UserName"
            java.lang.String r9 = r8.mo86045b(r11, r9, r2)
            r8.f155468f = r9
            java.lang.String r9 = r13.f151941g
            java.lang.String r11 = "UTF-8"
            java.lang.String r9 = java.net.URLEncoder.encode(r9, r11)
            java.lang.String r11 = "Topic"
            java.lang.String r9 = r8.mo86045b(r11, r9, r2)
            r8.f155469g = r9
            if (r0 == 0) goto L_0x0310
            int r9 = r0.length()
            if (r9 != 0) goto L_0x030e
            goto L_0x0310
        L_0x030e:
            r12 = 0
            goto L_0x0311
        L_0x0310:
            r12 = 1
        L_0x0311:
            if (r12 == 0) goto L_0x0315
            java.lang.String r0 = r13.f151907K
        L_0x0315:
            cm1.s0$b r9 = cm1.C0773s0.f1815b
            cm1.s0 r9 = r9.mo714a()
            java.lang.Class<cl1.u> r11 = cl1.C55001u.class
            r12 = r18
            androidx.lifecycle.i0 r11 = r12.mo77630e(r11)
            cl1.u r11 = (cl1.C55001u) r11
            r31 = r6
            r5 = 0
            if (r11 == 0) goto L_0x032e
            long r11 = r11.f154414h
            goto L_0x032f
        L_0x032e:
            r11 = r5
        L_0x032f:
            java.lang.String r0 = r9.mo713b(r11, r0)
            java.lang.String r7 = ";"
            java.lang.String r9 = ","
            if (r0 == 0) goto L_0x033e
            java.lang.String r0 = z04.C112551y.m153814n(r0, r9, r7, r15)
            goto L_0x0340
        L_0x033e:
            r0 = r26
        L_0x0340:
            java.lang.String r11 = "chnl_extra"
            java.lang.String r0 = r8.mo86045b(r11, r0, r2)
            r8.f155463b0 = r0
            long r11 = r13.f151937e
            long r11 = r13.yx0(r11)
            r8.f155470h = r11
            long r11 = r13.f151950p
            r25 = r3
            long r2 = r13.f151935d
            long r18 = r11 - r2
            int r0 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x035e
            r5 = r18
        L_0x035e:
            r8.f155471i = r5
            r5 = r31
            long r2 = r5 - r2
            r18 = 0
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x036b
            goto L_0x036d
        L_0x036b:
            r2 = r18
        L_0x036d:
            r8.f155472j = r2
            long r2 = r5 - r11
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0376
            goto L_0x0378
        L_0x0376:
            r2 = r18
        L_0x0378:
            r8.f155473k = r2
            long r11 = r13.f151911P
            r29 = r1
            long r0 = r13.f151910N
            boolean r15 = r13.f151912Q
            if (r15 == 0) goto L_0x039b
            r32 = r9
            r31 = r10
            long r9 = r13.f151909M
            int r15 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r15 <= 0) goto L_0x03b0
            long r0 = r5 - r9
            int r5 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r5 <= 0) goto L_0x0395
            goto L_0x0397
        L_0x0395:
            r0 = r18
        L_0x0397:
            long r11 = r11 + r0
            long r0 = r2 - r11
            goto L_0x03b0
        L_0x039b:
            r32 = r9
            r31 = r10
            long r9 = r13.f151908L
            int r15 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r15 <= 0) goto L_0x03b0
            long r5 = r5 - r9
            int r9 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r9 <= 0) goto L_0x03ab
            goto L_0x03ad
        L_0x03ab:
            r5 = 0
        L_0x03ad:
            long r0 = r0 + r5
            long r11 = r2 - r0
        L_0x03b0:
            r8.f155474l = r11
            r8.f155475m = r0
            if (r16 == 0) goto L_0x03c0
            r2 = 1
            r8.f155473k = r2
            r5 = 0
            r8.f155474l = r5
            r8.f155475m = r2
        L_0x03c0:
            r13.f151911P = r11
            r13.f151910N = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "LiveKeyReport1# report21178 type:"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ", enterSessionId:"
            r2.append(r3)
            long r5 = r8.f155470h
            r2.append(r5)
            java.lang.String r3 = ", fullDuration:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", floatDuration:"
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = ", duration:"
            r2.append(r0)
            long r0 = r8.f155473k
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            ak1.f0$o r0 = r13.f151918T
            long r2 = r0.f151523d
            r8.f155476n = r2
            int r0 = r13.f151956u
            long r2 = (long) r0
            r8.f155477o = r2
            r2 = 0
            r8.f155478p = r2
            r8.f155479q = r2
            int r0 = r13.f151957v
            long r5 = (long) r0
            r8.f155480r = r5
            r8.f155481s = r2
            java.util.ArrayList<java.lang.String> r0 = r13.f151897A
            int r0 = r0.size()
            long r2 = (long) r0
            r8.f155482t = r2
            int r0 = r13.f151898B
            long r2 = (long) r0
            r8.f155483u = r2
            int r0 = r13.f151958w
            long r2 = (long) r0
            r8.f155484v = r2
            int r0 = r13.f151959x
            long r2 = (long) r0
            r8.f155485w = r2
            int r0 = r13.f151961y
            long r2 = (long) r0
            r8.f155486x = r2
            int r0 = r13.f151963z
            long r2 = (long) r0
            r8.f155487y = r2
            int r0 = r13.f151899C
            long r2 = (long) r0
            r8.f155488z = r2
            int r0 = r13.f151900D
            long r2 = (long) r0
            r8.f155436A = r2
            int r0 = r13.f151901E
            long r2 = (long) r0
            r8.f155437B = r2
            int r0 = r13.f151902F
            long r2 = (long) r0
            r8.f155438C = r2
            int r0 = r13.f151903G
            long r2 = (long) r0
            r8.f155439D = r2
            int r0 = r13.f151904H
            long r2 = (long) r0
            r8.f155440E = r2
            boolean r0 = r13.f151906J
            long r2 = (long) r0
            r8.f155447L = r2
            int r0 = r14.f151635d
            long r2 = (long) r0
            r8.f155441F = r2
            int r0 = r31.length()
            if (r0 != 0) goto L_0x0468
            r12 = 1
            goto L_0x0469
        L_0x0468:
            r12 = 0
        L_0x0469:
            if (r12 == 0) goto L_0x047a
            di3.d r0 = di3.C86312j.m106911c(r29)
            kq.h r0 = (p185kq.C10383h) r0
            java.lang.String r10 = r0.mo10696E()
            if (r10 != 0) goto L_0x047c
            r10 = r26
            goto L_0x047c
        L_0x047a:
            r10 = r31
        L_0x047c:
            java.lang.String r0 = "ContextId"
            r2 = 1
            java.lang.String r0 = r8.mo86045b(r0, r10, r2)
            r8.f155442G = r0
            di3.d r0 = di3.C86312j.m106911c(r29)
            kq.h r0 = (p185kq.C10383h) r0
            java.lang.String r10 = r0.mo10698S0()
            if (r10 != 0) goto L_0x0493
            r10 = r26
        L_0x0493:
            java.lang.String r0 = "ClickTabContextId"
            java.lang.String r0 = r8.mo86045b(r0, r10, r2)
            r8.f155443H = r0
            java.lang.String r0 = r13.f151945i
            int r3 = r17.length()
            if (r3 != 0) goto L_0x04a5
            r12 = 1
            goto L_0x04a6
        L_0x04a5:
            r12 = 0
        L_0x04a6:
            if (r12 != 0) goto L_0x04aa
            r0 = r17
        L_0x04aa:
            java.lang.String r3 = "CommentScene"
            java.lang.String r3 = r8.mo86045b(r3, r0, r2)
            r8.f155448M = r3
            long r5 = r13.f151943h
            java.lang.String r0 = r13.zx0(r5, r0)
            java.lang.String r3 = "SessionBuffer"
            java.lang.String r0 = r8.mo86045b(r3, r0, r2)
            r8.f155444I = r0
            java.lang.Class<h81.i> r0 = h81.C59774i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.i r0 = (h81.C59774i) r0
            java.lang.String r10 = r0.mo84751Wb()
            if (r10 != 0) goto L_0x04d0
            r10 = r26
        L_0x04d0:
            java.lang.String r0 = "SessionID"
            java.lang.String r0 = r8.mo86045b(r0, r10, r2)
            r8.f155445J = r0
            int r0 = r13.f151948n
            long r2 = (long) r0
            r8.f155446K = r2
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            java.lang.String r2 = r8.f155448M
            int r3 = r13.f151947j
            long r5 = (long) r3
            long r2 = r0.mo74755e(r2, r5)
            r8.f155449N = r2
            long r2 = r13.f151924W
            r8.f155450O = r2
            long r2 = r13.f151926X
            r8.f155451P = r2
            long r2 = r13.f151928Y
            r8.f155452Q = r2
            long r2 = r13.f151930Z
            r8.f155453R = r2
            int r0 = r13.f151905I
            long r2 = (long) r0
            r8.f155454S = r2
            t91.c$a r0 = t91.C64208c.f181951a
            java.lang.String r2 = r13.f151939f
            java.lang.String r14 = r0.mo89027b(r2)
            r17 = 0
            r18 = 4
            r19 = 0
            java.lang.String r15 = ","
            java.lang.String r16 = ";"
            java.lang.String r0 = z04.C112551y.m153816p(r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = "AdData"
            r3 = 1
            java.lang.String r0 = r8.mo86045b(r2, r0, r3)
            r8.f155456U = r0
            int r0 = r13.f151951p0
            long r2 = (long) r0
            r8.f155455T = r2
            int r0 = r13.f151913Q0
            long r2 = (long) r0
            r8.f155457V = r2
            int r0 = r13.f151915R0
            long r2 = (long) r0
            r8.f155458W = r2
            int r0 = t91.C64208c.f181957g
            long r2 = (long) r0
            r8.f155462a0 = r2
            int r0 = r13.f151925W0
            long r2 = (long) r0
            r8.f155460Y = r2
            java.util.ArrayList<op3.c<ak1.f0$a0, java.lang.Long, java.lang.Boolean>> r0 = r13.f151917S0
            boolean r0 = r0.isEmpty()
            java.lang.String r2 = "ConnectDuration"
            if (r0 == 0) goto L_0x0557
            r3 = r26
            r0 = 1
            java.lang.String r2 = r8.mo86045b(r2, r3, r0)
            r8.f155459X = r2
            r11 = 1
            goto L_0x05c7
        L_0x0557:
            r3 = r26
            java.util.ArrayList<op3.c<ak1.f0$a0, java.lang.Long, java.lang.Boolean>> r0 = r13.f151917S0
            java.util.Iterator r0 = r0.iterator()
            r10 = r3
        L_0x0560:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05aa
            java.lang.Object r5 = r0.next()
            op3.c r5 = (op3.C117878c) r5
            r6 = 2
            java.lang.Object r9 = r5.mo182596a(r6)
            java.lang.String r11 = "tuple.`$3`()"
            gy3.C87412m.m108593f(r9, r11)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0560
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r10 = 0
            java.lang.Object r11 = r5.mo182596a(r10)
            ak1.f0$a0 r11 = (ak1.C54067f0.C54068a0) r11
            int r10 = r11.f151487d
            r9.append(r10)
            r10 = 124(0x7c, float:1.74E-43)
            r9.append(r10)
            r11 = 1
            java.lang.Object r5 = r5.mo182596a(r11)
            r9.append(r5)
            r5 = 59
            r9.append(r5)
            java.lang.String r10 = r9.toString()
            goto L_0x0560
        L_0x05aa:
            r11 = 1
            boolean r0 = gy3.C87412m.m108589b(r10, r3)
            if (r0 != 0) goto L_0x05c1
            int r0 = r10.length()
            int r0 = r0 - r11
            r5 = 0
            java.lang.String r10 = r10.substring(r5, r0)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r10, r0)
        L_0x05c1:
            java.lang.String r0 = r8.mo86045b(r2, r10, r11)
            r8.f155459X = r0
        L_0x05c7:
            java.lang.String r0 = r13.f151927X0
            if (r0 == 0) goto L_0x05d3
            r2 = r32
            r5 = 0
            java.lang.String r10 = z04.C112551y.m153814n(r0, r2, r7, r5)
            goto L_0x05d4
        L_0x05d3:
            r10 = r3
        L_0x05d4:
            java.lang.String r0 = "Scenenote"
            java.lang.String r0 = r8.mo86045b(r0, r10, r11)
            r8.f155461Z = r0
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            java.lang.String r0 = r0.tx0()
            java.lang.String r2 = "switch_extra"
            java.lang.String r0 = r8.mo86045b(r2, r0, r11)
            r8.f155466d0 = r0
            r8.mo86054n()
            t91.c$a r0 = t91.C64208c.f181951a
            long r5 = r13.f151937e
            java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, java.lang.String>> r0 = t91.C64208c.f181947N
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0.remove(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "report21178, duration="
            r0.append(r2)
            long r5 = r8.f155473k
            r0.append(r5)
            java.lang.String r2 = ", floatDuration="
            r0.append(r2)
            long r5 = r8.f155474l
            r0.append(r5)
            java.lang.String r2 = ", fullDuration="
            r0.append(r2)
            long r5 = r8.f155475m
            r0.append(r5)
            java.lang.String r2 = ", diffTime="
            r0.append(r2)
            long r5 = r8.f155475m
            long r9 = r8.f155474l
            long r5 = r5 + r9
            long r9 = r8.f155473k
            long r5 = r5 - r9
            r0.append(r5)
            java.lang.String r2 = ", commentScene="
            r0.append(r2)
            java.lang.String r2 = r8.f155448M
            r0.append(r2)
            java.lang.String r2 = ", pressLikeCount="
            r0.append(r2)
            long r5 = r8.f155479q
            r0.append(r5)
            java.lang.String r2 = ", enterStatus="
            r0.append(r2)
            long r5 = r8.f155476n
            r0.append(r5)
            java.lang.String r2 = ", acclaimCount="
            r0.append(r2)
            long r5 = r8.f155481s
            r0.append(r5)
            java.lang.String r2 = ", clickLikeCount="
            r0.append(r2)
            long r5 = r8.f155478p
            r0.append(r5)
            java.lang.String r2 = ", goodsClickCount="
            r0.append(r2)
            long r5 = r8.f155482t
            r0.append(r5)
            java.lang.String r2 = ", floatingCount="
            r0.append(r2)
            long r5 = r8.f155484v
            r0.append(r5)
            java.lang.String r2 = ", shareMoments="
            r0.append(r2)
            long r5 = r8.f155485w
            r0.append(r5)
            java.lang.String r2 = ", singleChat="
            r0.append(r2)
            long r5 = r8.f155486x
            r0.append(r5)
            java.lang.String r2 = ", groupChat="
            r0.append(r2)
            long r5 = r8.f155487y
            r0.append(r5)
            java.lang.String r2 = ", profileCount="
            r0.append(r2)
            long r5 = r8.f155488z
            r0.append(r5)
            java.lang.String r2 = ", complainAnchor="
            r0.append(r2)
            long r5 = r8.f155436A
            r0.append(r5)
            java.lang.String r2 = ", complainAudience="
            r0.append(r2)
            long r5 = r8.f155437B
            r0.append(r5)
            java.lang.String r2 = ", forbidden="
            r0.append(r2)
            long r5 = r8.f155438C
            r0.append(r5)
            java.lang.String r2 = ", enterFollow="
            r0.append(r2)
            long r5 = r8.f155439D
            r0.append(r5)
            java.lang.String r2 = ", exitFollow="
            r0.append(r2)
            long r5 = r8.f155440E
            r0.append(r5)
            java.lang.String r2 = ", exitType="
            r0.append(r2)
            long r5 = r8.f155441F
            r0.append(r5)
            java.lang.String r2 = ", contextId="
            r0.append(r2)
            java.lang.String r2 = r8.f155442G
            r0.append(r2)
            java.lang.String r2 = ", clickTabContextId="
            r0.append(r2)
            java.lang.String r2 = r8.f155443H
            r0.append(r2)
            java.lang.String r2 = ", sessionBuffer="
            r0.append(r2)
            java.lang.String r2 = r8.f155444I
            r0.append(r2)
            java.lang.String r2 = ", sessionID="
            r0.append(r2)
            java.lang.String r2 = r8.f155445J
            r0.append(r2)
            java.lang.String r2 = ", isPrivate="
            r0.append(r2)
            long r5 = r8.f155446K
            r0.append(r5)
            java.lang.String r2 = ", shopExp="
            r0.append(r2)
            long r5 = r8.f155447L
            r0.append(r5)
            java.lang.String r2 = ", enterIconType="
            r0.append(r2)
            long r5 = r8.f155449N
            r0.append(r5)
            java.lang.String r2 = ", clickToLandscape="
            r0.append(r2)
            long r5 = r8.f155450O
            r0.append(r5)
            java.lang.String r2 = ", clickToPortrait="
            r0.append(r2)
            long r5 = r8.f155452Q
            r0.append(r5)
            java.lang.String r2 = ", rotateToLandscape="
            r0.append(r2)
            long r5 = r8.f155451P
            r0.append(r5)
            java.lang.String r2 = ", rotateToPortrait="
            r0.append(r2)
            long r5 = r8.f155453R
            r0.append(r5)
            java.lang.String r2 = ", lotteryCount="
            r0.append(r2)
            long r5 = r8.f155455T
            r0.append(r5)
            java.lang.String r2 = ", adData="
            r0.append(r2)
            java.lang.String r2 = r8.f155456U
            r0.append(r2)
            java.lang.String r2 = ", commentsCount="
            r0.append(r2)
            long r5 = r8.f155477o
            r0.append(r5)
            java.lang.String r2 = ", replycount="
            r0.append(r2)
            long r5 = r8.f155454S
            r0.append(r5)
            java.lang.String r2 = ", tryToConnectCount="
            r0.append(r2)
            long r5 = r8.f155457V
            r0.append(r5)
            java.lang.String r2 = ", connectSuccessCount="
            r0.append(r2)
            long r5 = r8.f155458W
            r0.append(r5)
            java.lang.String r2 = ", connectDuration="
            r0.append(r2)
            java.lang.String r2 = r8.f155459X
            r0.append(r2)
            java.lang.String r2 = ", giftCount="
            r0.append(r2)
            long r5 = r8.f155460Y
            r0.append(r5)
            java.lang.String r2 = ", scenenote="
            r0.append(r2)
            java.lang.String r2 = r8.f155461Z
            r0.append(r2)
            java.lang.String r2 = "shareToStatus="
            r0.append(r2)
            long r5 = r8.f155462a0
            r0.append(r5)
            java.lang.String r2 = "chnl_extra="
            r0.append(r2)
            java.lang.String r2 = r8.f155463b0
            r0.append(r2)
            java.lang.String r2 = "emojiCount="
            r0.append(r2)
            long r5 = r8.f155480r
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x07cc:
            r13.f151918T = r4
            t91.c$a r0 = t91.C64208c.f181951a
            java.lang.String r1 = r13.f151939f
            if (r1 != 0) goto L_0x07d6
            r12 = 0
            goto L_0x07dc
        L_0x07d6:
            java.lang.String r2 = t91.C64208c.f181946M
            boolean r12 = gy3.C87412m.m108589b(r1, r2)
        L_0x07dc:
            if (r12 == 0) goto L_0x07e9
            t91.C64208c.f181945L = r3
            t91.C64208c.f181946M = r3
            java.lang.String r1 = "HABBYGE-MALI.HellFinderConfig"
            java.lang.String r2 = "resetSnsAdData!"
            r0.mo89029d(r1, r2)
        L_0x07e9:
            r1 = 0
            r13.f151921U0 = r1
            ak1.f0$a0 r0 = ak1.C54067f0.C54068a0.VIDEO
            r13.f151923V0 = r0
            java.util.ArrayList<op3.c<ak1.f0$a0, java.lang.Long, java.lang.Boolean>> r0 = r13.f151917S0
            r0.clear()
            r13.f151913Q0 = r1
            r13.f151915R0 = r1
            r13.f151925W0 = r1
            r13.f151938e1 = r1
            r13.f151933b1 = r1
            r13.f151944h1 = r1
            r2 = 0
            t91.C64208c.f181956f = r2
            t91.C64208c.f181957g = r1
        L_0x0806:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54116w.wy0(ak1.w, android.content.Context, ak1.f0$q0, android.os.Bundle, boolean, int, java.lang.Object):void");
    }

    public final void Ax0(long j, int i) {
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markHasMicInfo " + j);
        FinderLiveCdnUserEnterLiveTimeCostStruct xx02 = xx0(j);
        xx02.f155490e = j;
        xx02.f155496k = i;
    }

    public final void Ay0(boolean z, int i) {
        int i2;
        C54067f0.C54070g0 g0Var;
        boolean z2 = z;
        int i3 = i;
        C54067f0.C54072j0 j0Var = C54067f0.C54072j0.LIVE_SCREEN_PORTRAIT;
        C54067f0.C54070g0 g0Var2 = C54067f0.C54070g0.HORIZONTAL_BY_ROTATE_PHONE;
        C54067f0.C54070g0 g0Var3 = C54067f0.C54070g0.PORTRAIT_BY_ROTATE_PHONE;
        C54067f0.C54070g0 g0Var4 = C54067f0.C54070g0.PORTRAIT_BY_CLICK_BTN;
        C54067f0.C54072j0 j0Var2 = C54067f0.C54072j0.LIVE_SCREEN_HORIZONTAL;
        this.f151931Z0 = true;
        if (!z2) {
            this.f151929Y0 = true;
            if (i3 == 0) {
                i2 = 2;
            } else if (i3 != 1) {
                Log.m105920e("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSwitchScreen err:screenAction=" + i3);
                return;
            } else {
                i2 = 1;
            }
        } else {
            i2 = i3;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                Log.m105920e("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSwitchScreen err:isAuto=" + z2 + ",screenAction=" + i3);
                return;
            } else if (!z2) {
                this.f151924W++;
                g0Var = C54067f0.C54070g0.HORIZONTAL_BY_CLICK_BTN;
            } else if (this.f151929Y0) {
                this.f151929Y0 = false;
                return;
            } else {
                this.f151926X++;
                g0Var = g0Var2;
            }
        } else if (!z2) {
            this.f151928Y++;
            g0Var = g0Var4;
        } else if (this.f151929Y0) {
            this.f151929Y0 = false;
            return;
        } else {
            this.f151930Z++;
            g0Var = g0Var3;
        }
        if (g0Var == g0Var3 || g0Var == g0Var4) {
            this.f151922V = j0Var2;
        } else if (g0Var == g0Var2 || g0Var == g0Var2) {
            this.f151922V = j0Var;
        }
        Ex0(this, C54067f0.C54076o0.SWITCH_SCREEN, String.valueOf(g0Var.f151499d), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        C54067f0.C54072j0 j0Var3 = this.f151922V;
        if (j0Var3 == j0Var) {
            this.f151922V = j0Var2;
        } else if (j0Var3 == j0Var2) {
            this.f151922V = j0Var;
        }
    }

    public final void Bx0(long j) {
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markMicLaunched " + j);
        FinderLiveCdnUserEnterLiveTimeCostStruct xx02 = xx0(j);
        xx02.f155490e = j;
        xx02.f155497l = C31543z5.m39453c();
    }

    public final void By0(int i) {
        Ex0(this, C54067f0.C54076o0.VISITOR_MUSIC, String.valueOf(i), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Cx0(long j) {
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markPlayerConnect " + j);
        FinderLiveCdnUserEnterLiveTimeCostStruct xx02 = xx0(j);
        xx02.f155490e = j;
        if (xx02.f155493h == 0) {
            xx02.f155493h = C31543z5.m39453c();
        }
    }

    public final void Cy0(String str) {
        C87412m.m108594g(str, "actionResult");
        Ex0(this, C54067f0.C54076o0.VR_MODE, str, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Dx0(String str, String str2, String str3, Integer num, boolean z, String str4) {
        String str5 = str3;
        JSONObject jSONObject = new JSONObject();
        String str6 = "";
        jSONObject.put("content", URLEncoder.encode(str == null ? str6 : str, "UTF-8"));
        if (str2 != null) {
            str6 = str2;
        }
        jSONObject.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, URLEncoder.encode(str6, "UTF-8"));
        if (str5 != null) {
            jSONObject.put("grade", URLEncoder.encode(str5, "UTF-8"));
        }
        if (num != null && num.intValue() == 20035) {
            jSONObject.put("comment_type", URLEncoder.encode("2", "UTF-8"));
        } else if (num != null && num.intValue() == 1000066) {
            jSONObject.put("comment_type", URLEncoder.encode("1", "UTF-8"));
        } else {
            jSONObject.put("comment_type", URLEncoder.encode("0", "UTF-8"));
        }
        if (z) {
            jSONObject.put("is_group_box", "1");
        } else {
            jSONObject.put("is_group_box", "0");
        }
        jSONObject.put("group_box_number", str4);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportSendMsg: " + jSONObject);
        Ex0(this, C54067f0.C54076o0.Message, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Dy0(String str, String str2) {
        C87412m.m108594g(str, "pagId");
        C87412m.m108594g(str2, "pgUdfKv");
        FinderBroadcastPageInStruct finderBroadcastPageInStruct = new FinderBroadcastPageInStruct();
        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
        if (E == null) {
            E = "";
        }
        finderBroadcastPageInStruct.mo1021t(E);
        finderBroadcastPageInStruct.mo1022u(str);
        finderBroadcastPageInStruct.mo1023v(C112551y.m153814n(str2, ",", ";", false));
        finderBroadcastPageInStruct.mo1020s(str);
        finderBroadcastPageInStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22946, contextid = " + finderBroadcastPageInStruct.f9761i + ", page_id = " + finderBroadcastPageInStruct.f9757e + ", commentScene = " + finderBroadcastPageInStruct.f9766n + ", struct.pg_udf_kv = " + finderBroadcastPageInStruct.f9764l);
    }

    public final void Ey0(String str, String str2) {
        C87412m.m108594g(str, "pagId");
        C87412m.m108594g(str2, "pgUdfKv");
        FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
        if (E == null) {
            E = "";
        }
        finderBroadcastPageOutStruct.mo1025t(E);
        finderBroadcastPageOutStruct.mo1026u(str);
        finderBroadcastPageOutStruct.mo1027v(C112551y.m153814n(str2, ",", ";", false));
        finderBroadcastPageOutStruct.mo1024s(str);
        finderBroadcastPageOutStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22946, contextid = " + finderBroadcastPageOutStruct.f9773i + ", page_id = " + finderBroadcastPageOutStruct.f9769e + ", commentScene = " + finderBroadcastPageOutStruct.f9777m + ", struct.pg_udf_kv = " + finderBroadcastPageOutStruct.f9776l);
    }

    public final void Fx0(int i, String str, String str2) {
        C87412m.m108594g(str, "feedId");
        C87412m.m108594g(str2, "liveId");
        C55718s0 G5 = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76659G5("FinderLiveEntrance");
        EnterFinderLiveFromRedDotReportStruct enterFinderLiveFromRedDotReportStruct = new EnterFinderLiveFromRedDotReportStruct();
        enterFinderLiveFromRedDotReportStruct.f155000d = 1;
        String E = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
        String str3 = "";
        if (E == null) {
            E = str3;
        }
        enterFinderLiveFromRedDotReportStruct.f155006j = enterFinderLiveFromRedDotReportStruct.mo86045b("ContextId", E, true);
        enterFinderLiveFromRedDotReportStruct.f155001e = (long) i;
        enterFinderLiveFromRedDotReportStruct.f155002f = enterFinderLiveFromRedDotReportStruct.mo86045b("FeedID", str, true);
        enterFinderLiveFromRedDotReportStruct.f155003g = enterFinderLiveFromRedDotReportStruct.mo86045b("LiveID", str2, true);
        enterFinderLiveFromRedDotReportStruct.f155004h = enterFinderLiveFromRedDotReportStruct.mo86045b("RedDotTipsID", G5 != null ? G5.field_tipsId : null, true);
        if (G5 != null) {
            JSONObject h = C61937h.m72709h(G5.mo77309p2());
            h.put("object_id", C61926c.m72691p(G5.mo77309p2().object_id));
            String jSONObject = h.toString();
            C87412m.m108593f(jSONObject, "extInfo.toString()");
            enterFinderLiveFromRedDotReportStruct.f155007k = enterFinderLiveFromRedDotReportStruct.mo86045b("ReportExtInfo", C112551y.m153814n(jSONObject, ",", ";", false), true);
        }
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb != null) {
            str3 = Wb;
        }
        enterFinderLiveFromRedDotReportStruct.f155005i = enterFinderLiveFromRedDotReportStruct.mo86045b("SessionID", str3, true);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report " + enterFinderLiveFromRedDotReportStruct.mo1006q());
        enterFinderLiveFromRedDotReportStruct.mo86054n();
    }

    public final void Fy0(int i, int i2, int i3, String str) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C87412m.m108594g(str2, "audienceFinderUsername");
        C104289g gVar = new C104289g();
        int i6 = 3;
        boolean z = false;
        int i7 = 2;
        int i8 = (i5 == 0 || i5 == 1) ? 3 : i5 != 2 ? i5 != 3 ? 0 : 1 : 2;
        if (i4 == 1) {
            i6 = 1;
        } else if (i4 == 2) {
            i6 = 2;
        } else if (i4 != 3) {
            i6 = 0;
        }
        gVar.mo145967r("result", Integer.valueOf(i));
        gVar.mo145967r("type", Integer.valueOf(i8));
        gVar.mo145967r(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(i6));
        if (!(str.length() == 0)) {
            gVar.mo145967r("audience_finder_username", str2);
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (aVar != null && aVar.mo85682Z()) {
                z = true;
            }
            gVar.mo145967r("operate_role", Integer.valueOf(z ? 2 : 1));
            C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
            if (C87412m.m108589b(oVar != null ? oVar.f154345o : null, str2)) {
                i7 = 1;
            }
            gVar.mo145967r("to_operate_role", Integer.valueOf(i7));
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   …  }\n\n        }.toString()");
        Ex0(this, C54067f0.C54076o0.PROFILE_HALF_SCREEN, gVar2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Gx0(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("button_type", i);
            Ex0(this, C54067f0.C54076o0.ASSISTANT_LOTTERY, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        } catch (Throwable unused) {
        }
    }

    public final void Gy0(C54067f0.C54079q0 q0Var) {
        C87412m.m108594g(q0Var, "value");
        if (q0Var == C54067f0.C54079q0.Unknown || this.f151932a1 != C54067f0.C54079q0.CloseTypeKickedOut) {
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "setquitLiveType " + q0Var);
            this.f151932a1 = q0Var;
            return;
        }
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "setquitLiveType " + q0Var + ", but CloseTypeKickedOut");
    }

    /* renamed from: HG */
    public void mo74856HG(C0077k0 k0Var, String str, long j, int i, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, long j2, int i2) {
        byte[] bArr;
        C0077k0 k0Var2 = k0Var;
        String str10 = str3;
        String str11 = str6;
        String str12 = str7;
        Class cls = C10383h.class;
        C87412m.m108594g(k0Var, "action");
        if (C0077k0.Click == k0Var2) {
            ((C61130g) C86312j.m106911c(C61130g.class)).mo33245po(true);
        }
        FinderLiveNoticeLogStruct finderLiveNoticeLogStruct = new FinderLiveNoticeLogStruct();
        String str13 = "";
        finderLiveNoticeLogStruct.f9853d = finderLiveNoticeLogStruct.mo86045b("FinderUsrName", str == null ? str13 : str, true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = str13;
        }
        finderLiveNoticeLogStruct.f9854e = finderLiveNoticeLogStruct.mo86045b("FinderSessionId", Wb, true);
        long currentTimeMillis = System.currentTimeMillis();
        finderLiveNoticeLogStruct.f9855f = currentTimeMillis;
        finderLiveNoticeLogStruct.mo86046c("ActionTimeMs", currentTimeMillis);
        finderLiveNoticeLogStruct.f9856g = (long) k0Var2.f484d;
        finderLiveNoticeLogStruct.f9857h = finderLiveNoticeLogStruct.mo86045b("EnterLiveId", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j), true);
        finderLiveNoticeLogStruct.f9858i = (long) i;
        finderLiveNoticeLogStruct.f9859j = finderLiveNoticeLogStruct.mo86045b("commentscene", str2 == null ? str13 : str2, true);
        String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
        if (E == null) {
            E = str13;
        }
        finderLiveNoticeLogStruct.f9860k = finderLiveNoticeLogStruct.mo86045b("contextid", E, true);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 == null) {
            S0 = str13;
        }
        finderLiveNoticeLogStruct.f9861l = finderLiveNoticeLogStruct.mo86045b("ClickTabContextId", S0, true);
        finderLiveNoticeLogStruct.f9862m = finderLiveNoticeLogStruct.mo86045b("AdData", C112551y.m153816p(C64208c.f181951a.mo89027b(finderLiveNoticeLogStruct.f9853d), ",", ";", false, 4, (Object) null), true);
        String str14 = this.f151927X0;
        finderLiveNoticeLogStruct.f9863n = finderLiveNoticeLogStruct.mo86045b("Scenenote", str14 != null ? C112551y.m153814n(str14, ",", ";", false) : str13, true);
        if (str10 != null) {
            if (str3.length() > 0) {
                finderLiveNoticeLogStruct.f9864o = finderLiveNoticeLogStruct.mo86045b("ForcePushId", str10, true);
            }
        }
        String b = C0773s0.f1815b.mo714a().mo713b(j2, str9);
        finderLiveNoticeLogStruct.f9865p = l != null ? l.longValue() : 0;
        finderLiveNoticeLogStruct.f9866q = finderLiveNoticeLogStruct.mo86045b("NotificationId", str5 == null ? str13 : str5, true);
        finderLiveNoticeLogStruct.f9867r = finderLiveNoticeLogStruct.mo86045b("ReportContent", str4 == null ? str13 : str4, true);
        String str15 = null;
        if (str11 != null) {
            bArr = str11.getBytes(C119027c.f356488a);
            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr = null;
        }
        finderLiveNoticeLogStruct.f9870u = finderLiveNoticeLogStruct.mo86045b("Description", Base64.encodeToString(bArr, 0), true);
        finderLiveNoticeLogStruct.f9871v = finderLiveNoticeLogStruct.mo86045b("Scene", str12 != null ? C112551y.m153814n(str12, ",", ";", false) : str13, true);
        finderLiveNoticeLogStruct.f9873x = finderLiveNoticeLogStruct.mo86045b("NoticeID", str8, true);
        if (b != null) {
            str15 = C112551y.m153814n(b, ",", ";", false);
        }
        finderLiveNoticeLogStruct.f9872w = finderLiveNoticeLogStruct.mo86045b("chnlExtra", str15, true);
        finderLiveNoticeLogStruct.mo86054n();
        StringBuilder sb = new StringBuilder();
        sb.append("report21158, finderUsrName=");
        sb.append(finderLiveNoticeLogStruct.f9853d);
        sb.append(", finderSessionId=");
        sb.append(finderLiveNoticeLogStruct.f9854e);
        sb.append(", actionTimeMs=");
        sb.append(finderLiveNoticeLogStruct.f9855f);
        sb.append(", actionType=");
        sb.append(finderLiveNoticeLogStruct.f9856g);
        sb.append(", enterLiveId=");
        sb.append(finderLiveNoticeLogStruct.f9857h);
        sb.append(", enterStatus=");
        sb.append(finderLiveNoticeLogStruct.f9858i);
        sb.append(", commentscene=");
        sb.append(finderLiveNoticeLogStruct.f9859j);
        sb.append(", contextid=");
        sb.append(finderLiveNoticeLogStruct.f9860k);
        sb.append(", adData=");
        sb.append(finderLiveNoticeLogStruct.f9862m);
        sb.append(", scenenote=");
        sb.append(finderLiveNoticeLogStruct.f9863n);
        sb.append(", scene=");
        sb.append(finderLiveNoticeLogStruct.f9871v);
        sb.append(", clickTabContextId=");
        sb.append(finderLiveNoticeLogStruct.f9861l);
        sb.append(", forcePushId=");
        String str16 = finderLiveNoticeLogStruct.f9864o;
        if (str16 != null) {
            str13 = str16;
        }
        sb.append(str13);
        sb.append(",clickTabContextId=");
        sb.append(finderLiveNoticeLogStruct.f9861l);
        sb.append(",notificationId=");
        sb.append(finderLiveNoticeLogStruct.f9866q);
        sb.append(",reportContent=");
        sb.append(finderLiveNoticeLogStruct.f9867r);
        sb.append(",noticetype=");
        sb.append(finderLiveNoticeLogStruct.f9865p);
        sb.append(",chnlExtra=");
        sb.append(finderLiveNoticeLogStruct.f9872w);
        sb.append(",description=");
        sb.append(finderLiveNoticeLogStruct.f9870u);
        sb.append(", noticeId=");
        sb.append(finderLiveNoticeLogStruct.f9873x);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", sb.toString());
    }

    public final void Hx0(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("button_type", i);
            if (str != null) {
                jSONObject.put("theme_content", str);
            }
            Ex0(this, C54067f0.C54076o0.ASSISTANT_MORE, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        } catch (Throwable unused) {
        }
    }

    public final void Ix0(int i, int i2, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            int i4 = i;
            jSONObject.put("model_type", i);
            jSONObject.put("click_type", i2);
            jSONObject.put("card_index", i3);
            Ex0(this, C54067f0.C54076o0.ASSISTANT_SHOP, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        } catch (Throwable unused) {
        }
    }

    public final void Jx0(int i, List<String> list, String str) {
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.C113379b.METHOD, i);
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (String put : list) {
                    jSONArray.put(put);
                }
            }
            jSONObject.put("user_list", jSONArray);
            if (!(str2 == null || str.length() == 0)) {
                jSONObject.put("is_group_box", "1");
                jSONObject.put("group_box_number", str2);
            } else {
                jSONObject.put("is_group_box", "0");
            }
            Ex0(this, C54067f0.C54076o0.AT_WX_SOMEONE, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        } catch (Throwable unused) {
        }
    }

    public final void Kx0(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jump_type", z ? "mmbiz_profile" : "findervideo_profile");
        Ex0(this, C54067f0.C54076o0.BIZ_NAME, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Lx0(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "json");
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        Ex0(this, C54067f0.C54076o0.BOX_LIVE, C112551y.m153814n(jSONObject2, ",", ";", false), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Mx0(C54067f0.C0055f fVar) {
        C87412m.m108594g(fVar, "result");
        Ex0(this, C54067f0.C54076o0.CAST_SCREEN, String.valueOf(fVar.f119d), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Nx0(C54067f0.C54076o0 o0Var, int i, long j) {
        C87412m.m108594g(o0Var, "action");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", j);
        Ex0(this, o0Var, String.valueOf(i), 0, jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, 244, (Object) null);
    }

    public final void Ox0(C54067f0.C0057g gVar) {
        C87412m.m108594g(gVar, "action");
        Ex0(this, C54067f0.C54076o0.HideOpearation, String.valueOf(gVar.f128d), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        if (gVar != C54067f0.C0057g.CLICK_CLEAR_SCREEN_CANCEL) {
            this.f151898B++;
        }
    }

    public final void Px0(int i) {
        Ex0(this, C54067f0.C54076o0.COMMENT_OPTION, String.valueOf(i), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Qx0(int i, int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(str3, "boxId");
        C87412m.m108594g(str4, "likeComment");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_group_box", i2);
        jSONObject.put("group_box_number", str3);
        jSONObject.put("like_comment", str4);
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.COMMENT_OPTION;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(';');
        sb.append(jSONObject);
        Ex0(this, o0Var, sb.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Sx0(C54067f0.C54081r0 r0Var, List<C13696v> list) {
        C87412m.m108594g(r0Var, "action");
        C87412m.m108594g(list, "itemList");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        StringBuilder sb7 = new StringBuilder();
        StringBuilder sb8 = new StringBuilder();
        for (C13696v vVar : list) {
            String str = vVar.f38763u;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            sb.append(str);
            sb.append(";");
            sb4.append(vVar.f38761s.f142896g);
            sb4.append(";");
            String str3 = vVar.f38765w;
            if (str3 == null) {
                str3 = str2;
            }
            sb5.append(str3);
            sb5.append(";");
            String str4 = vVar.f38757D;
            if (str4 != null) {
                str2 = str4;
            }
            sb6.append(str2);
            sb6.append(";");
            sb7.append(vVar.f38764v);
            sb7.append(";");
            sb8.append(vVar.f38761s.f142892B);
            sb8.append(";");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("couponid", C112550d0.m153779O(sb, ";").toString());
        jSONObject.put("style", C112550d0.m153779O(sb4, ";").toString());
        jSONObject.put("discount", C112550d0.m153779O(sb5, ";").toString());
        jSONObject.put("condi", C112550d0.m153779O(sb6, ";").toString());
        jSONObject.put("c_type", C112550d0.m153779O(sb7, ";").toString());
        jSONObject.put("click_button_action", C112550d0.m153779O(sb8, ";").toString());
        Rx0(this, r0Var, (String) null, "", (String) null, (String) null, (String) null, 0, 0, jSONObject, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportCommerceCouponAction json:" + jSONObject);
    }

    public final void Tx0(C54067f0.C54081r0 r0Var, C13696v vVar, String str) {
        C13696v vVar2 = vVar;
        String str2 = str;
        C87412m.m108594g(r0Var, "action");
        C87412m.m108594g(vVar2, "item");
        JSONObject jSONObject = new JSONObject();
        String str3 = vVar2.f38763u;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        jSONObject.put("couponid", str3);
        jSONObject.put("style", vVar2.f38761s.f142896g);
        String str5 = vVar2.f38765w;
        if (str5 == null) {
            str5 = str4;
        }
        jSONObject.put("discount", str5);
        String str6 = vVar2.f38757D;
        if (str6 != null) {
            str4 = str6;
        }
        jSONObject.put("condi", str4);
        jSONObject.put("c_type", vVar2.f38764v);
        if (str2 != null) {
            jSONObject.put("click_result", str2);
        }
        jSONObject.put("click_button_action", vVar2.f38761s.f142892B);
        Rx0(this, r0Var, (String) null, "", (String) null, (String) null, (String) null, 0, 0, jSONObject, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportCommerceCouponAction json:" + jSONObject);
    }

    public final void Ux0(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Ex0(this, C54067f0.C54076o0.Commerce, jSONObject != null ? jSONObject.toString() : null, 0, jSONObject2 != null ? jSONObject2.toString() : null, (String) null, (String) null, str, (String) null, 180, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "fxxkshopreport reportCommerceReplayAction, requestId:" + str + ", actionResult:" + jSONObject);
    }

    public final void Vx0(String str, C54067f0.C0061j jVar) {
        C87412m.m108594g(jVar, FirebaseAnalytics.C113379b.SOURCE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("username", str == null ? "" : str);
        jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, jVar.f151d);
        Ex0(this, C54067f0.C54076o0.CommentExpose, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        this.f151901E++;
    }

    public final void Wx0(int i, int i2, int i3) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (i2 > 0) {
            jSONObject.put("type", i2);
        }
        jSONObject.put("barrage_type", i3);
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(';');
            sb.append(jSONObject);
            str = sb.toString();
        } else {
            str = jSONObject.toString();
            C87412m.m108593f(str, "{\n            json.toString()\n        }");
        }
        Ex0(this, C54067f0.C54076o0.LIVE_DANMAKU, str, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Xx0(C54067f0.C0069t0 t0Var, Boolean bool, C12677tg.C12678a aVar) {
        C54067f0.C0069t0 t0Var2 = t0Var;
        C12677tg.C12678a aVar2 = aVar;
        C87412m.m108594g(t0Var2, "type");
        C87412m.m108594g(aVar2, "fromScene");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", t0Var2.f360d);
        int i = 1;
        if (bool != null) {
            jSONObject.put("ispaid", bool.booleanValue() ^ true ? 1 : 0);
        }
        if (aVar2 != C12677tg.C12678a.GIFT_PANEL) {
            i = 0;
        }
        jSONObject.put("isgift", i);
        jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, aVar2.f36320d);
        Ex0(this, C54067f0.C54076o0.FANS_CLUB, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void Zx0(boolean z, C54067f0.C54084t tVar) {
        C87412m.m108594g(tVar, "floatType");
        C54067f0.C54084t tVar2 = C54067f0.C54084t.LIVE_FLOAT_ACTION_MAXIMIZE;
        if (tVar == tVar2) {
            this.f151960x0 = false;
        }
        long c = C31543z5.m39453c();
        if (z) {
            if (!this.f151912Q) {
                long j = this.f151908L;
                if (j > 0) {
                    long j2 = c - j;
                    long j3 = this.f151910N;
                    if (j2 <= 0) {
                        j2 = 0;
                    }
                    this.f151910N = j3 + j2;
                    this.f151908L = 0;
                }
                this.f151909M = c;
                this.f151912Q = true;
                this.f151958w++;
            } else {
                return;
            }
        } else if (this.f151912Q) {
            long j4 = this.f151909M;
            if (j4 > 0) {
                long j5 = c - j4;
                long j6 = this.f151911P;
                if (j5 <= 0) {
                    j5 = 0;
                }
                this.f151911P = j6 + j5;
                this.f151909M = 0;
            }
            this.f151908L = c;
            this.f151912Q = false;
        } else {
            return;
        }
        if (tVar == C54067f0.C54084t.LIVE_FLOAT_ACTION_UNKNOWN) {
            if (((C61130g) C86312j.m106911c(C61130g.class)).mo33248vG()) {
                tVar = C54067f0.C54084t.LIVE_FLOAT_ACTION_MINIMIZE_FOR_BG;
            } else if (this.f151914R) {
                tVar = C54067f0.C54084t.LIVE_FLOAT_ACTION_MINIMIZE_FOR_WEAPP;
                this.f151914R = false;
            } else {
                tVar = C54067f0.C54084t.LIVE_FLOAT_ACTION_MINIMIZE_INTERACTIVE;
            }
        } else if (tVar == tVar2) {
            this.f151914R = false;
        }
        if (this.f151920U) {
            tVar = C54067f0.C54084t.LIVE_FLOAT_ACTION_ENTER_PROFILE;
            this.f151920U = false;
        }
        Ex0(this, C54067f0.C54076o0.Float, String.valueOf(tVar.f151699d), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void ay0(boolean z, int i, long j, int i2, int i3) {
        int i4 = i;
        C54067f0.C54076o0 o0Var = C54067f0.C54076o0.INNER_FLOAT_MODE;
        C54067f0.C54076o0 o0Var2 = C54067f0.C54076o0.OUTER_FLOAT_MODE;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", i4);
        jSONObject.put("windows_type", i2);
        jSONObject.put("liveid_type", i3);
        if (i4 == 2 || i4 == 3) {
            jSONObject.put("stay_time", j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("reportFloatMode 21084, action:");
        sb.append(z ? o0Var : o0Var2);
        sb.append(", chnlExtra:");
        sb.append(jSONObject);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", sb.toString());
        Ex0(this, z ? o0Var : o0Var2, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void by0(C54067f0.C0070u uVar, boolean z) {
        C54067f0.C0070u uVar2 = uVar;
        C87412m.m108594g(uVar2, "action");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("focus_types", z ? 2 : 1);
        Ex0(this, C54067f0.C54076o0.FOLLOW_LIVE, String.valueOf(uVar2.f364d), 0, jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, 244, (Object) null);
    }

    public final void cy0(int i, String str, int i2) {
        int i3 = i;
        String str2 = str;
        int i4 = i2;
        C87412m.m108594g(str2, "appid");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i3);
        if (i3 == 5 || i3 == 6 || i3 == 7) {
            jSONObject.put("appid", str2);
        }
        if (i3 == 6) {
            jSONObject.put("error", i4);
        }
        Ex0(this, C54067f0.C54076o0.GAME_RANK, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportGameRank 21084 type:" + i3 + ", appid:" + str2 + ", error:" + i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r15.length() > 0) == true) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ey0(int r13, int r14, java.lang.String r15, java.lang.String r16) {
        /*
            r12 = this;
            r0 = r14
            r1 = r15
            ak1.f0$o0 r2 = ak1.C54067f0.C54076o0.GAME_TEAM
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "type"
            r5 = r13
            r3.put(r4, r13)
            if (r0 <= 0) goto L_0x0017
            java.lang.String r4 = "money"
            r3.put(r4, r14)
        L_0x0017:
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0027
            int r5 = r15.length()
            if (r5 <= 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            if (r5 != r0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "errmsg"
            r3.put(r0, r15)
        L_0x002f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.String r3 = r3.toString()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 220(0xdc, float:3.08E-43)
            r11 = 0
            r0 = r12
            r1 = r2
            r2 = r3
            r3 = r4
            r5 = r6
            r6 = r7
            r7 = r16
            Ex0(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54116w.ey0(int, int, java.lang.String, java.lang.String):void");
    }

    public final void fy0(String str) {
        C87412m.m108594g(str, "actionResult");
        Ex0(this, C54067f0.C54076o0.GAME_TEAM, str, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public void h10(long j, long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6) {
        String str7 = str2;
        String str8 = str3;
        String str9 = str5;
        String str10 = str6;
        String str11 = str;
        C87412m.m108594g(str11, "anchorFinderUsername");
        C87412m.m108594g(str7, "topic");
        C87412m.m108594g(str8, "commentScene");
        String str12 = str4;
        C87412m.m108594g(str12, "contextid");
        C87412m.m108594g(str9, "sessionbuffer");
        C87412m.m108594g(str10, "adData");
        String O5 = str.length() == 0 ? C66785b.f191882e.mo90662O5() : str11;
        Class cls = C10383h.class;
        long currentTimeMillis = System.currentTimeMillis();
        FinderAudienceActionLogStruct finderAudienceActionLogStruct = new FinderAudienceActionLogStruct();
        finderAudienceActionLogStruct.f155048d = finderAudienceActionLogStruct.mo86045b("LiveID", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j), true);
        finderAudienceActionLogStruct.f155049e = finderAudienceActionLogStruct.mo86045b("FeedID", ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j2), true);
        finderAudienceActionLogStruct.f155050f = finderAudienceActionLogStruct.mo86045b("UserName", O5, true);
        finderAudienceActionLogStruct.f155051g = finderAudienceActionLogStruct.mo86045b("Topic", URLEncoder.encode(str7, "UTF-8"), true);
        finderAudienceActionLogStruct.f155052h = finderAudienceActionLogStruct.mo86045b("CommentScene", str8, true);
        if (str4.length() == 0) {
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            str12 = E == null ? "" : E;
        }
        finderAudienceActionLogStruct.f155054j = finderAudienceActionLogStruct.mo86045b("ContextId", str12, true);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 == null) {
            S0 = "";
        }
        finderAudienceActionLogStruct.f155055k = finderAudienceActionLogStruct.mo86045b("ClickTabContextId", S0, true);
        finderAudienceActionLogStruct.f155057m = finderAudienceActionLogStruct.mo86045b("SessionBuffer", str9, true);
        finderAudienceActionLogStruct.f155064t = currentTimeMillis;
        finderAudienceActionLogStruct.f155065u = j3;
        finderAudienceActionLogStruct.f155069y = finderAudienceActionLogStruct.mo86045b("AdData", C112551y.m153814n(str10, ",", ";", false), true);
        finderAudienceActionLogStruct.f155046G = finderAudienceActionLogStruct.mo86045b("CouponId", "", true);
        finderAudienceActionLogStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportOnce21084Inner, liveId=" + finderAudienceActionLogStruct.f155048d + ", feedId=" + finderAudienceActionLogStruct.f155049e + ", username=" + finderAudienceActionLogStruct.f155050f + ", topic=" + finderAudienceActionLogStruct.f155051g + ", commentScene=" + finderAudienceActionLogStruct.f155052h + ", isPrivate=" + finderAudienceActionLogStruct.f155053i + ", contextId=" + finderAudienceActionLogStruct.f155054j + ", clickTabContextId=" + finderAudienceActionLogStruct.f155055k + ", sessionId=" + finderAudienceActionLogStruct.f155056l + ", sessionBuffer=" + finderAudienceActionLogStruct.f155057m + ", shopPermit=" + finderAudienceActionLogStruct.f155058n + ", enterSessionId=" + finderAudienceActionLogStruct.f155059o + ", liveTime=" + finderAudienceActionLogStruct.f155060p + ", floatDuration=" + finderAudienceActionLogStruct.f155062r + ", fullDuration=" + finderAudienceActionLogStruct.f155061q + ", enterStatus=" + finderAudienceActionLogStruct.f155063s + ", actionTS=" + finderAudienceActionLogStruct.f155064t + ", action=" + finderAudienceActionLogStruct.f155065u + ", enterIconType=" + finderAudienceActionLogStruct.f155067w + ", pageType=" + finderAudienceActionLogStruct.f155068x + ", adData=" + finderAudienceActionLogStruct.f155069y + ", scenenote=" + finderAudienceActionLogStruct.f155070z + ", identityType=" + finderAudienceActionLogStruct.f155040A + ", request_id=" + finderAudienceActionLogStruct.f155041B + ", actionStyle=" + finderAudienceActionLogStruct.f155045F + ", actionResult=" + finderAudienceActionLogStruct.f155066v + ", couponId=" + finderAudienceActionLogStruct.f155046G + ", chnlExtra=" + finderAudienceActionLogStruct.f155043D);
    }

    public final void hy0(C54067f0.C39610v vVar, C89349b bVar, int i) {
        C54067f0.C39610v vVar2 = vVar;
        int i2 = i;
        C87412m.m108594g(vVar2, "type");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", vVar2.f106356d);
        String h = bVar != null ? bVar.mo123705h() : null;
        if (h == null) {
            h = "";
        }
        jSONObject.put("extra_info", h);
        if (i2 != 0) {
            jSONObject.put("ui_type", i2);
        }
        Ex0(this, C54067f0.C54076o0.GAME_WELFARE, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void iy0(C54067f0.C0072w wVar, String str) {
        C54067f0.C0072w wVar2 = wVar;
        String str2 = str;
        C87412m.m108594g(wVar2, "type");
        C87412m.m108594g(str2, "giftId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", wVar2.f386d);
        jSONObject.put("giftid", str2);
        Ex0(this, C54067f0.C54076o0.GIFT_ALLOWANCE, String.valueOf(jSONObject), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void jy0(C54067f0.C54082s sVar, long j, long j2, int i) {
        C87412m.m108594g(sVar, "action");
        Class cls = C10383h.class;
        FinderAudienceHistoryLiveActionLogStruct finderAudienceHistoryLiveActionLogStruct = new FinderAudienceHistoryLiveActionLogStruct();
        String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
        if (E == null) {
            E = "";
        }
        finderAudienceHistoryLiveActionLogStruct.f155071d = finderAudienceHistoryLiveActionLogStruct.mo86045b("contextid", E, true);
        finderAudienceHistoryLiveActionLogStruct.f155072e = (long) sVar.f151680d;
        finderAudienceHistoryLiveActionLogStruct.f155073f = finderAudienceHistoryLiveActionLogStruct.mo86045b("liveid", j == -1 ? String.valueOf(j) : ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j), true);
        finderAudienceHistoryLiveActionLogStruct.f155074g = finderAudienceHistoryLiveActionLogStruct.mo86045b("feedid", j2 == -1 ? String.valueOf(j2) : ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j2), true);
        finderAudienceHistoryLiveActionLogStruct.f155075h = finderAudienceHistoryLiveActionLogStruct.mo86045b(FirebaseAnalytics.C113379b.INDEX, String.valueOf(i), true);
        finderAudienceHistoryLiveActionLogStruct.f155076i = System.currentTimeMillis();
        finderAudienceHistoryLiveActionLogStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23432, action=" + finderAudienceHistoryLiveActionLogStruct.f155072e + ", liveid=" + finderAudienceHistoryLiveActionLogStruct.f155073f + ", feedid=" + finderAudienceHistoryLiveActionLogStruct.f155074g + ", index=" + finderAudienceHistoryLiveActionLogStruct.f155075h + ", actionts_new=" + finderAudienceHistoryLiveActionLogStruct.f155076i + ", contextid=" + finderAudienceHistoryLiveActionLogStruct.f155071d);
    }

    public final void ky0(boolean z, String str) {
        JSONObject jSONObject = new JSONObject(URLDecoder.decode(str, "utf-8"));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("actionType", z ? 2 : 1);
        jSONObject2.put("WxaGameReportInfo", jSONObject);
        Ex0(this, C54067f0.C54076o0.JUMP_GAME, URLEncoder.encode(jSONObject2.toString(), "utf-8"), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void ly0(boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("exposeClick", z ? 2 : 1);
        String str3 = "";
        jSONObject.put("bizuin", str == null ? str3 : str);
        if (str2 != null) {
            str3 = str2;
        }
        jSONObject.put("bizusername", str3);
        Ex0(this, C54067f0.C54076o0.JUMP_TO_OFFICIAL_ACCOUNT, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public void nv0(C0076j0 j0Var, String str, int i) {
        C0076j0 j0Var2 = j0Var;
        int i2 = i;
        C87412m.m108594g(j0Var, "type");
        long currentTimeMillis = System.currentTimeMillis();
        int ordinal = j0Var.ordinal();
        if (ordinal == 2) {
            C64208c.f181963m = String.valueOf(this.f151950p);
            C64208c.f181964n = currentTimeMillis;
            this.f151925W0 += i2;
        } else if (ordinal == 3 || ordinal == 5) {
            C64208c.f181963m = String.valueOf(this.f151950p);
            C64208c.f181964n = currentTimeMillis;
        } else if (ordinal == 6) {
            if (i2 == 0 && !this.f151938e1) {
                this.f151938e1 = true;
            } else {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", j0Var2.f477d);
        String str2 = str;
        jSONObject.put("giftid", str);
        jSONObject.put("num", i2);
        Ex0(this, C54067f0.C54076o0.GIFT, jSONObject.toString(), currentTimeMillis, (String) null, (String) null, (String) null, (String) null, (String) null, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
    }

    public final void ny0(C54067f0.C54085u0 u0Var, C54067f0.C54068a0 a0Var, int i) {
        C54067f0.C54068a0 a0Var2 = C54067f0.C54068a0.INVALIDATE;
        C87412m.m108594g(u0Var, "action");
        C87412m.m108594g(a0Var, "linkeType");
        int ordinal = u0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 3) {
                    this.f151913Q0++;
                } else if (ordinal == 4) {
                    this.f151921U0 = true;
                    this.f151915R0++;
                    if (a0Var != a0Var2) {
                        this.f151923V0 = a0Var;
                    }
                    this.f151917S0.add(C117882j.m166285d(this.f151923V0, Long.valueOf(System.currentTimeMillis()), Boolean.FALSE));
                } else if (ordinal == 7 || ordinal == 8) {
                    Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportLinkMic, action=" + u0Var.name() + ", gLinkMicTimeList=" + this.f151917S0.size() + ", activeCloselinkMic=" + this.f151919T0);
                    this.f151921U0 = false;
                    int size = this.f151917S0.size() - 1;
                    while (true) {
                        if (-1 >= size) {
                            break;
                        }
                        C117878c<C54067f0.C54068a0, Long, Boolean> cVar = this.f151917S0.get(size);
                        C87412m.m108593f(cVar, "gLinkMicTimeList[i]");
                        C117878c cVar2 = cVar;
                        Object a = cVar2.mo182596a(0);
                        int ordinal2 = u0Var.ordinal();
                        if (a == (ordinal2 != 7 ? ordinal2 != 8 ? a0Var2 : C54067f0.C54068a0.VIDEO : C54067f0.C54068a0.AUDIO)) {
                            Object a2 = cVar2.mo182596a(1);
                            C87412m.m108593f(a2, "tuple.`$2`()");
                            if (((Number) a2).longValue() > 0 && C87412m.m108589b(cVar2.mo182596a(2), Boolean.FALSE)) {
                                long currentTimeMillis = System.currentTimeMillis();
                                Object a3 = cVar2.mo182596a(1);
                                C87412m.m108593f(a3, "tuple.`$2`()");
                                long longValue = (currentTimeMillis - ((Number) a3).longValue()) / 1000;
                                if (longValue >= 0) {
                                    this.f151917S0.set(size, C117882j.m166285d(cVar2.mo182596a(0), Long.valueOf(longValue), Boolean.TRUE));
                                    break;
                                }
                            }
                        }
                        size--;
                    }
                    if (this.f151919T0) {
                        this.f151919T0 = false;
                    } else {
                        return;
                    }
                } else if (ordinal == 9) {
                    if (i == 0 && !this.f151933b1) {
                        this.f151933b1 = true;
                    } else {
                        return;
                    }
                }
            } else if (this.f151921U0) {
                return;
            }
            Ex0(this, C54067f0.C54076o0.LINKMIC, String.valueOf(u0Var.f151719d), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
    }

    public final void py0(int i, String str) {
        String str2 = str;
        C87412m.m108594g(str2, "activeId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("active_id", str2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        Ex0(this, C54067f0.C54076o0.LIVE_CONCERT, C112551y.m153814n(jSONObject2, ",", ";", false), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public void qw0(String str, C54097l0 l0Var, Map<String, String> map) {
        int i;
        String str2 = str;
        C54097l0 l0Var2 = l0Var;
        Map<String, String> map2 = map;
        C87412m.m108594g(l0Var2, "type");
        C87412m.m108594g(map2, "actionResult");
        JSONObject jSONObject = new JSONObject();
        if (!C90599h.m113511d(str)) {
            jSONObject.put("username", str2);
        }
        jSONObject.put("type", l0Var2.f151816d);
        try {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, map2.get(str3));
            }
        } catch (Throwable unused) {
        }
        boolean z = false;
        String vx02 = C45628s0.m50749N(str) ? vx0(this.f151907K, "is_enterprise", 1) : vx0(this.f151907K, "is_enterprise", 0);
        if (l0Var2 == C54097l0.PERSIONAL_STATE_SHARE_SUCC) {
            C64208c.C64209a aVar = C64208c.f181951a;
            C64208c.f181956f = null;
        }
        Ex0(this, C54067f0.C54076o0.Share, jSONObject.toString(), 0, (String) null, (String) null, vx02, (String) null, (String) null, 220, (Object) null);
        if (l0Var2 == C54097l0.Chat) {
            if (str2 != null) {
                i = 1;
                if (C112550d0.m153801u(str2, "@chatroom", false)) {
                    z = true;
                }
            } else {
                i = 1;
            }
            if (z) {
                this.f151963z += i;
            } else {
                this.f151961y += i;
            }
        } else if (l0Var2 == C54097l0.Timeline) {
            this.f151959x++;
        }
    }

    public final void qy0(String str) {
        C87412m.m108594g(str, "userName");
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "1002");
        hashMap.put("username", str);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.LIVE_END_PROFILE, hashMap, (String) null, 4, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, page_id = " + ((String) hashMap.get("page_id")) + ", username = " + ((String) hashMap.get("username")));
    }

    public final void ry0(C54067f0.C0064m mVar, String str, String str2, String str3, int i) {
        C87412m.m108594g(mVar, "elementId");
        C87412m.m108594g(str, "finderUsrName");
        C87412m.m108594g(str2, "liveId");
        C87412m.m108594g(str3, "lotteryId");
        HashMap hashMap = new HashMap();
        hashMap.put("finder_username", str);
        hashMap.put("liveId", str2);
        hashMap.put("lottery_id", str3);
        hashMap.put("source_type", String.valueOf(i));
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, mVar, hashMap, (String) null, 4, (Object) null);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, LotteryPrivateClicked reportMap = " + hashMap);
    }

    /* renamed from: sS */
    public void mo74891sS(String str) {
        C87412m.m108594g(str, "_scenenote");
        this.f151927X0 = str;
    }

    public final void sy0(C54067f0.C0066n nVar, String str, String str2, String str3, int i) {
        C87412m.m108594g(nVar, "elementId");
        C87412m.m108594g(str, "finderUsrName");
        C87412m.m108594g(str2, "liveId");
        C87412m.m108594g(str3, "lotteryId");
        HashMap hashMap = new HashMap();
        hashMap.put("finder_username", str);
        hashMap.put("liveId", str2);
        hashMap.put("lottery_id", str3);
        hashMap.put("source_type", String.valueOf(i));
        ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(nVar, hashMap);
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, LotteryPrivateExposed reportMap = " + hashMap);
    }

    /* renamed from: td */
    public void mo74893td(C54090i0 i0Var, C0074h0 h0Var, boolean z, int i) {
        String str;
        C54090i0 i0Var2 = i0Var;
        C0074h0 h0Var2 = h0Var;
        boolean z2 = z;
        int i2 = i;
        C87412m.m108594g(i0Var, "type");
        C87412m.m108594g(h0Var, "src");
        if (!C62042e.f176370a.mo87027N0()) {
            Log.m105928w("HABBYGE-MALI.HellLiveVisitorReoprter", "reportRedPacket, type=" + i0Var2.f151756d + ", src" + h0Var2.f453d + ", inLive=" + z2);
            switch (i0Var.ordinal()) {
                case 3:
                    this.f151942g1 = z2;
                    if (!z2) {
                        return;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    if (!this.f151942g1) {
                        return;
                    }
                    break;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i0Var2.f151756d);
            if (h0Var2 == C0074h0.UNKNOWN) {
                str = String.valueOf(this.f151940f1.f453d);
            } else {
                this.f151940f1 = h0Var2;
                str = String.valueOf(h0Var2.f453d);
            }
            jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, str);
            if (i2 != 0) {
                jSONObject.put("ui_type", i2);
            }
            Ex0(this, C54067f0.C54076o0.RED_PACKET, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
    }

    public final void ty0(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service_type", i);
        jSONObject.put("commerceAction", 1015);
        Ex0(this, C54067f0.C54076o0.Commerce, String.valueOf(jSONObject), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final void uy0(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C87412m.m108594g(jSONObject2, "action");
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        if (bVar != null) {
            int n3 = ((C54991o) bVar.mo71262a(C54991o.class)).mo76014n3();
            if (n3 == 1) {
                jSONObject2.put("house_manager_identity", "2");
            } else if (n3 == 2) {
                jSONObject2.put("house_manager_identity", "3");
            } else if (n3 != 3) {
                C13598b0 b0Var = C13598b0.f38549a;
            } else {
                jSONObject2.put("house_manager_identity", "1");
            }
        }
        String jSONObject3 = jSONObject.toString();
        C87412m.m108593f(jSONObject3, "action.toString()");
        Ex0(this, C54067f0.C54076o0.LIVE_MANAGER_ABILITY, C112551y.m153814n(jSONObject3, ",", ";", false), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final String vx0(String str, String str2, Object obj) {
        C87412m.m108594g(str2, "key");
        if (str == null) {
            return "";
        }
        try {
            JSONObject jSONObject = str.length() == 0 ? new JSONObject() : new JSONObject(C112551y.m153814n(str, ";", ",", false));
            jSONObject.put(str2, obj);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            return C112551y.m153814n(jSONObject2, ",", ";", false);
        } catch (Exception e) {
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "append ChatFields err: " + e.getMessage());
            return str;
        }
    }

    public final void vy0(Integer num, int i, C54067f0.C0060i0 i0Var) {
        int i2 = i;
        C87412m.m108594g(i0Var, "event");
        if (!C62042e.f176370a.mo87027N0()) {
            C54067f0.C54072j0 j0Var = C54067f0.C54072j0.LIVE_SCREEN_PORTRAIT;
            boolean z = true;
            if (i2 != 1 && i2 == 2) {
                j0Var = C54067f0.C54072j0.LIVE_SCREEN_HORIZONTAL;
            }
            this.f151922V = j0Var;
            if (this.f151931Z0) {
                this.f151931Z0 = false;
            } else if (num != null && num.intValue() == 0) {
                int ordinal = i0Var.ordinal();
                if (ordinal == 0) {
                    z = false;
                } else if (!(ordinal == 1 || ordinal == 2)) {
                    throw new C13603j();
                }
                if (z) {
                    Ex0(this, C54067f0.C54076o0.EXPLORE_SCREEN_SWITCH_BTN, "", 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017 A[Catch:{ Exception -> 0x0012 }, LOOP:0: B:10:0x0017->B:12:0x001d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.String> wx0(android.os.Bundle r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r5 == 0) goto L_0x0014
            java.util.Set r1 = r5.keySet()     // Catch:{ Exception -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r5 = move-exception
            goto L_0x0034
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x004e
        L_0x0017:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0012 }
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0012 }
            java.lang.String r3 = "key"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r3 = r5.get(r2)     // Catch:{ Exception -> 0x0012 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0012 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0017
        L_0x0034:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "buildActionResult err:"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54116w.wx0(android.os.Bundle):java.util.Map");
    }

    public final FinderLiveCdnUserEnterLiveTimeCostStruct xx0(long j) {
        FinderLiveCdnUserEnterLiveTimeCostStruct finderLiveCdnUserEnterLiveTimeCostStruct = this.f151946i1.get(Long.valueOf(j));
        if (finderLiveCdnUserEnterLiveTimeCostStruct != null) {
            return finderLiveCdnUserEnterLiveTimeCostStruct;
        }
        FinderLiveCdnUserEnterLiveTimeCostStruct finderLiveCdnUserEnterLiveTimeCostStruct2 = new FinderLiveCdnUserEnterLiveTimeCostStruct();
        finderLiveCdnUserEnterLiveTimeCostStruct2.f155490e = j;
        this.f151946i1.put(Long.valueOf(j), finderLiveCdnUserEnterLiveTimeCostStruct2);
        return finderLiveCdnUserEnterLiveTimeCostStruct2;
    }

    public final void xy0(C54067f0.C0068p0 p0Var) {
        C87412m.m108594g(p0Var, "action");
        Ex0(this, C54067f0.C54076o0.Auth, String.valueOf(p0Var.f344d), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }

    public final long yx0(long j) {
        Long l = this.f151952q.get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        long c = C31543z5.m39453c();
        Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "LiveKeyReport1# getEnterSessionId not exist, add new, liveId:" + C61926c.m72691p(j) + ", enterSessionId:" + c);
        this.f151952q.put(Long.valueOf(j), Long.valueOf(c));
        return c;
    }

    public final void yy0(String str, String str2, String str3, Integer num, boolean z, String str4) {
        C87412m.m108594g(str4, "groupId");
        Dx0(str, str2, str3, num, z, str4);
        this.f151956u++;
    }

    public final String zx0(long j, String str) {
        String Cu;
        Class cls = C10383h.class;
        C87412m.m108594g(str, "mScene");
        String str2 = "";
        if (!Util.isNullOrNil(str) && !C112550d0.m153801u(str, "temp", false) && (Cu = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76655Cu(j, Integer.parseInt(str))) != null) {
            str2 = Cu;
        }
        if (Util.isNullOrNil(str2)) {
            str2 = this.f151954s;
            Log.m105928w("HABBYGE-MALI.HellLiveVisitorReoprter", "getSessionBuf error " + ((C10383h) C86312j.m106911c(cls)).mo10700XQ(j) + " feedId:" + ((C10383h) C86312j.m106911c(cls)).mo10700XQ(this.f151943h) + " mScene:" + str + " result" + str2.length());
        }
        return C112551y.m153814n(str2, ",", ";", false);
    }

    public final void zy0(String str, int i, String str2) {
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(str3, "userId");
        C87412m.m108594g(str4, "boxId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", str3);
        jSONObject.put("is_group_box", i);
        jSONObject.put("group_box_number", str4);
        Ex0(this, C54067f0.C54076o0.SOMEONE_AT_ME_CLICK, jSONObject.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
    }
}
