package mr1;

import android.media.AudioManager;
import co1.C55048e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderVideoPlayStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCStoryVideoPlayReportStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C45435i2;
import dp1.C58403t;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58739j4;
import er1.C58784w3;
import gr1.C45946r0;
import gy3.C87412m;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import o40.C61926c;
import or1.C62152a;
import org.json.JSONArray;
import org.json.JSONObject;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p501dz.C58466h;
import p707tz.C37315g;
import pl1.C62367r0;
import pl1.C62369u0;
import rx3.C13598b0;
import rx3.C13605o;
import te3.C49712hj1;
import te3.C51058r50;
import te3.C51822we1;
import te3.C64292cp1;
import te3.C64689rq2;
import te3.C64728tj0;
import te3.C64850yb1;
import up1.C37521f;
import wp1.C15585f;
import wp1.C66167g;
import z04.C112551y;

/* renamed from: mr1.r */
public final class C61572r {

    /* renamed from: a */
    public C49712hj1 f174996a;

    /* renamed from: b */
    public ConcurrentLinkedDeque<C61573a> f174997b = new ConcurrentLinkedDeque<>();

    /* renamed from: c */
    public int f174998c;

    /* renamed from: d */
    public ConcurrentHashMap<Long, C61573a> f174999d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public C62152a f175000e = new C62152a("Finder.Stat.FirstFrame");

    /* renamed from: f */
    public final int f175001f = 1505;

    /* renamed from: mr1.r$c */
    public static final class C34649c {

        /* renamed from: a */
        public final String f93169a;

        /* renamed from: b */
        public int f93170b;

        /* renamed from: c */
        public String f93171c = "";

        /* renamed from: d */
        public long f93172d;

        public C34649c(String str) {
            C87412m.m108594g(str, "mediaId");
            this.f93169a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C34649c) && C87412m.m108589b(this.f93169a, ((C34649c) obj).f93169a);
        }

        public int hashCode() {
            return this.f93169a.hashCode();
        }

        public String toString() {
            return "ReportTaskInfo(mediaId=" + this.f93169a + ')';
        }
    }

    /* renamed from: mr1.r$a */
    public static final class C61573a {

        /* renamed from: A */
        public int f175002A;

        /* renamed from: B */
        public long f175003B;

        /* renamed from: C */
        public long f175004C;

        /* renamed from: D */
        public long f175005D;

        /* renamed from: E */
        public long f175006E;

        /* renamed from: F */
        public long f175007F;

        /* renamed from: G */
        public long f175008G;

        /* renamed from: H */
        public int f175009H;

        /* renamed from: I */
        public long f175010I;

        /* renamed from: J */
        public long f175011J;

        /* renamed from: K */
        public long f175012K;

        /* renamed from: L */
        public int f175013L;

        /* renamed from: M */
        public long f175014M;

        /* renamed from: N */
        public C34649c f175015N;

        /* renamed from: O */
        public C61574b f175016O;

        /* renamed from: P */
        public boolean f175017P;

        /* renamed from: Q */
        public long f175018Q;

        /* renamed from: R */
        public long f175019R;

        /* renamed from: S */
        public float f175020S;

        /* renamed from: T */
        public float f175021T;

        /* renamed from: U */
        public int f175022U;

        /* renamed from: V */
        public int f175023V;

        /* renamed from: W */
        public float f175024W;

        /* renamed from: X */
        public float f175025X;

        /* renamed from: Y */
        public LinkedList<C64292cp1> f175026Y = new LinkedList<>();

        /* renamed from: Z */
        public HashSet<Integer> f175027Z = new HashSet<>();

        /* renamed from: a */
        public String f175028a = "";

        /* renamed from: a0 */
        public int f175029a0;

        /* renamed from: b */
        public long f175030b;

        /* renamed from: b0 */
        public int f175031b0;

        /* renamed from: c */
        public String f175032c = "";

        /* renamed from: c0 */
        public int f175033c0;

        /* renamed from: d */
        public String f175034d = "";

        /* renamed from: d0 */
        public int f175035d0;

        /* renamed from: e */
        public String f175036e = "";

        /* renamed from: e0 */
        public boolean f175037e0;

        /* renamed from: f */
        public String f175038f = "";

        /* renamed from: f0 */
        public int f175039f0;

        /* renamed from: g */
        public C62369u0 f175040g;

        /* renamed from: g0 */
        public String f175041g0 = "";

        /* renamed from: h */
        public C64689rq2 f175042h;

        /* renamed from: h0 */
        public int f175043h0;

        /* renamed from: i */
        public long f175044i;

        /* renamed from: i0 */
        public int f175045i0;

        /* renamed from: j */
        public long f175046j;

        /* renamed from: j0 */
        public String f175047j0 = "";

        /* renamed from: k */
        public int f175048k;

        /* renamed from: k0 */
        public String f175049k0 = "";

        /* renamed from: l */
        public long f175050l;

        /* renamed from: l0 */
        public boolean f175051l0;

        /* renamed from: m */
        public long f175052m;

        /* renamed from: m0 */
        public int f175053m0;

        /* renamed from: n */
        public int f175054n;

        /* renamed from: n0 */
        public float f175055n0;

        /* renamed from: o */
        public int f175056o;

        /* renamed from: o0 */
        public float f175057o0;

        /* renamed from: p */
        public int f175058p;

        /* renamed from: p0 */
        public int f175059p0;

        /* renamed from: q */
        public long f175060q;

        /* renamed from: q0 */
        public int f175061q0;

        /* renamed from: r */
        public int f175062r;

        /* renamed from: r0 */
        public int f175063r0 = -1;

        /* renamed from: s */
        public long f175064s;

        /* renamed from: s0 */
        public int f175065s0 = -1;

        /* renamed from: t */
        public long f175066t;

        /* renamed from: t0 */
        public int f175067t0 = -1;

        /* renamed from: u */
        public String f175068u = "";

        /* renamed from: u0 */
        public String f175069u0 = "0";

        /* renamed from: v */
        public long f175070v;

        /* renamed from: v0 */
        public int f175071v0 = -1;

        /* renamed from: w */
        public int f175072w;

        /* renamed from: w0 */
        public C61575s f175073w0;

        /* renamed from: x */
        public int f175074x;

        /* renamed from: x0 */
        public int f175075x0 = -1;

        /* renamed from: y */
        public boolean f175076y;

        /* renamed from: z */
        public int f175077z;
    }

    /* renamed from: mr1.r$b */
    public static final class C61574b {

        /* renamed from: A */
        public int f175078A;

        /* renamed from: B */
        public int f175079B;

        /* renamed from: C */
        public long f175080C;

        /* renamed from: D */
        public String f175081D = "";

        /* renamed from: E */
        public String f175082E = "";

        /* renamed from: F */
        public int f175083F;

        /* renamed from: G */
        public String f175084G = "";

        /* renamed from: H */
        public int f175085H;

        /* renamed from: I */
        public int f175086I = -1;

        /* renamed from: J */
        public int f175087J;

        /* renamed from: a */
        public final String f175088a;

        /* renamed from: b */
        public int f175089b;

        /* renamed from: c */
        public long f175090c;

        /* renamed from: d */
        public long f175091d;

        /* renamed from: e */
        public long f175092e;

        /* renamed from: f */
        public long f175093f;

        /* renamed from: g */
        public long f175094g;

        /* renamed from: h */
        public int f175095h;

        /* renamed from: i */
        public int f175096i;

        /* renamed from: j */
        public int f175097j;

        /* renamed from: k */
        public boolean f175098k;

        /* renamed from: l */
        public int f175099l;

        /* renamed from: m */
        public int f175100m;

        /* renamed from: n */
        public int f175101n;

        /* renamed from: o */
        public int f175102o;

        /* renamed from: p */
        public int f175103p;

        /* renamed from: q */
        public boolean f175104q;

        /* renamed from: r */
        public int f175105r;

        /* renamed from: s */
        public int f175106s;

        /* renamed from: t */
        public int f175107t;

        /* renamed from: u */
        public String f175108u = "";

        /* renamed from: v */
        public String f175109v = "";

        /* renamed from: w */
        public boolean f175110w;

        /* renamed from: x */
        public int f175111x;

        /* renamed from: y */
        public int f175112y;

        /* renamed from: z */
        public String f175113z = "";

        public C61574b(String str) {
            C87412m.m108594g(str, "mediaId");
            this.f175088a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C61574b) && C87412m.m108589b(this.f175088a, ((C61574b) obj).f175088a);
        }

        public int hashCode() {
            return this.f175088a.hashCode();
        }

        public String toString() {
            return "ReportSceneResult(mediaId=" + this.f175088a + ')';
        }
    }

    public C61572r(C49712hj1 hj12) {
        C87412m.m108594g(hj12, "contextObj");
        this.f174996a = hj12;
    }

    /* renamed from: a */
    public final String mo86502a(String str, C61573a aVar) {
        return str + " feedId:" + C61926c.m72691p(aVar.f175030b) + " mediaId:" + aVar.f175032c + " position:" + aVar.f175048k + " bgPreparedStatus:" + aVar.f175061q0;
    }

    /* renamed from: b */
    public final C61574b mo86503b(C98121d dVar) {
        C87412m.m108594g(dVar, "sceneResult");
        String str = dVar.f287609a;
        if (str == null) {
            str = "";
        }
        C61574b bVar = new C61574b(str);
        bVar.f175089b = dVar.field_retCode;
        bVar.f175090c = dVar.field_fileLength;
        bVar.f175091d = dVar.field_recvedBytes;
        bVar.f175092e = dVar.field_endTime;
        bVar.f175093f = dVar.field_startTime;
        bVar.f175094g = dVar.field_enQueueTime;
        bVar.f175095h = dVar.field_moovRequestTimes;
        bVar.f175096i = dVar.field_moovCost;
        bVar.f175097j = dVar.field_moovSize;
        bVar.f175098k = dVar.field_moovCompleted;
        bVar.f175099l = dVar.field_moovFailReason;
        bVar.f175100m = dVar.field_firstConnectCost;
        bVar.f175101n = dVar.field_firstRequestCost;
        bVar.f175102o = dVar.field_firstRequestSize;
        bVar.f175103p = dVar.field_firstRequestDownloadSize;
        bVar.f175104q = dVar.field_firstRequestCompleted;
        bVar.f175105r = dVar.field_averageSpeed;
        bVar.f175106s = dVar.field_averageConnectCost;
        bVar.f175107t = dVar.field_netConnectTimes;
        String a = dVar.mo137408a();
        if (a != null) {
            bVar.f175108u = a;
        }
        String str2 = dVar.field_clientIP;
        if (str2 != null) {
            bVar.f175109v = str2;
        }
        bVar.f175110w = dVar.field_isCrossNet;
        bVar.f175111x = dVar.f287618j;
        bVar.f175112y = dVar.f287619k;
        String str3 = dVar.f287612d;
        if (str3 != null) {
            bVar.f175113z = str3;
        }
        bVar.f175078A = dVar.f287613e;
        bVar.f175079B = dVar.f287614f;
        bVar.f175080C = dVar.f287620l;
        String str4 = dVar.field_videoCdnMsg;
        C87412m.m108593f(str4, "sceneResult.field_videoCdnMsg");
        bVar.f175081D = str4;
        String str5 = dVar.field_videoFlag;
        C87412m.m108593f(str5, "sceneResult.field_videoFlag");
        bVar.f175082E = str5;
        bVar.f175083F = dVar.f287611c > 0 ? 1 : 0;
        String str6 = dVar.f287621m;
        C87412m.m108593f(str6, "sceneResult.profile");
        bVar.f175084G = C112551y.m153814n(str6, ",", ";", false);
        bVar.f175085H = dVar.field_waitResponseCostTime;
        bVar.f175086I = dVar.f287618j;
        bVar.f175087J = dVar.field_receiveCostTime;
        Log.m105918d("13570", "trace id  " + (bVar.f175080C & -1) + " videoflag " + bVar.f175081D + ' ' + bVar.f175082E + ' ' + bVar.f175083F);
        return bVar;
    }

    /* renamed from: c */
    public final C34649c mo86504c(C98127h hVar) {
        C87412m.m108594g(hVar, "cloneTaskInfo");
        String str = hVar.field_mediaId;
        if (str == null) {
            str = "";
        }
        C34649c cVar = new C34649c(str);
        cVar.f93170b = hVar.field_requestVideoFormat;
        String str2 = hVar.f287699a1;
        C87412m.m108593f(str2, "cloneTaskInfo.videoFlag");
        cVar.f93171c = str2;
        cVar.f93172d = hVar.f287694X0;
        return cVar;
    }

    /* renamed from: d */
    public final void mo86505d(C61573a aVar) {
        String str;
        C61573a aVar2 = aVar;
        Log.m105924i("Finder.FinderVideoPlayReporter", aVar2 != null ? String.valueOf(mo86502a("report17000", aVar2)) : null);
        if (aVar2 != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            C64689rq2 rq22 = aVar2.f175042h;
            C34649c cVar = aVar2.f175015N;
            C61574b bVar = aVar2.f175016O;
            C58739j4 j4Var = C58739j4.f168176a;
            if (rq22 != null && cVar != null && bVar != null) {
                WCStoryVideoPlayReportStruct wCStoryVideoPlayReportStruct = new WCStoryVideoPlayReportStruct();
                C66167g gVar = C66167g.f190173a;
                C62369u0 u0Var = aVar2.f175040g;
                if (u0Var == null || (str = ((C62367r0) u0Var).mo11841b()) == null) {
                    str = "";
                }
                long c = C60641c.m70922c((double) (((float) (((long) aVar2.f175058p) * gVar.mo90234c(str, false).field_totalSize)) / 100.0f));
                wCStoryVideoPlayReportStruct.f156932d = wCStoryVideoPlayReportStruct.mo86045b("StoryId", C61926c.m72691p(aVar2.f175030b), true);
                wCStoryVideoPlayReportStruct.f156933e = (long) (this.f174996a.f134675i + 100);
                wCStoryVideoPlayReportStruct.f156934f = (long) aVar2.f175072w;
                wCStoryVideoPlayReportStruct.f156935g = aVar2.f175048k == 0 ? 1 : 0;
                int i = rq22.f185269g;
                wCStoryVideoPlayReportStruct.f156936h = (long) i;
                wCStoryVideoPlayReportStruct.f156937i = C60641c.m70922c((double) (((float) (i * aVar2.f175054n)) / 100.0f));
                wCStoryVideoPlayReportStruct.f156938j = aVar2.f175007F;
                wCStoryVideoPlayReportStruct.f156939k = aVar2.f175064s;
                wCStoryVideoPlayReportStruct.f156940l = aVar2.f175018Q;
                wCStoryVideoPlayReportStruct.f156942n = 0;
                wCStoryVideoPlayReportStruct.f156943o = 0;
                wCStoryVideoPlayReportStruct.f156944p = (long) bVar.f175089b;
                wCStoryVideoPlayReportStruct.f156945q = wCStoryVideoPlayReportStruct.mo86045b("ErrorDescription", "", true);
                wCStoryVideoPlayReportStruct.f156946r = (long) aVar2.f175043h0;
                wCStoryVideoPlayReportStruct.f156947s = wCStoryVideoPlayReportStruct.mo86045b("VideoFormat", String.valueOf(cVar.f93170b), true);
                wCStoryVideoPlayReportStruct.f156928Z = wCStoryVideoPlayReportStruct.mo86045b("VideoFlag", cVar.f93171c, true);
                wCStoryVideoPlayReportStruct.f156948t = bVar.f175090c;
                wCStoryVideoPlayReportStruct.f156949u = bVar.f175091d;
                wCStoryVideoPlayReportStruct.f156950v = bVar.f175093f;
                wCStoryVideoPlayReportStruct.f156951w = bVar.f175092e;
                wCStoryVideoPlayReportStruct.f156952x = (long) bVar.f175089b;
                wCStoryVideoPlayReportStruct.f156953y = bVar.f175094g;
                wCStoryVideoPlayReportStruct.f156954z = (long) bVar.f175095h;
                wCStoryVideoPlayReportStruct.f156903A = (long) bVar.f175096i;
                wCStoryVideoPlayReportStruct.f156904B = (long) bVar.f175097j;
                wCStoryVideoPlayReportStruct.f156905C = bVar.f175098k ? 1 : 0;
                wCStoryVideoPlayReportStruct.f156906D = (long) bVar.f175099l;
                wCStoryVideoPlayReportStruct.f156907E = (long) bVar.f175100m;
                wCStoryVideoPlayReportStruct.f156908F = (long) bVar.f175101n;
                wCStoryVideoPlayReportStruct.f156909G = (long) bVar.f175102o;
                wCStoryVideoPlayReportStruct.f156910H = (long) bVar.f175103p;
                wCStoryVideoPlayReportStruct.f156911I = bVar.f175104q ? 1 : 0;
                wCStoryVideoPlayReportStruct.f156912J = (long) bVar.f175105r;
                wCStoryVideoPlayReportStruct.f156913K = (long) bVar.f175106s;
                wCStoryVideoPlayReportStruct.f156914L = (long) bVar.f175107t;
                wCStoryVideoPlayReportStruct.f156915M = wCStoryVideoPlayReportStruct.mo86045b("Iplist", bVar.f175108u, true);
                wCStoryVideoPlayReportStruct.f156916N = wCStoryVideoPlayReportStruct.mo86045b("XClientIp", bVar.f175109v, true);
                wCStoryVideoPlayReportStruct.f156917O = bVar.f175110w ? 1 : 0;
                wCStoryVideoPlayReportStruct.f156918P = cVar.f93172d;
                wCStoryVideoPlayReportStruct.f156919Q = 0;
                wCStoryVideoPlayReportStruct.f156920R = aVar2.f175070v;
                wCStoryVideoPlayReportStruct.f156921S = aVar2.f175046j;
                wCStoryVideoPlayReportStruct.f156922T = c;
                wCStoryVideoPlayReportStruct.f156923U = 0;
                wCStoryVideoPlayReportStruct.f156924V = bVar.f175111x;
                wCStoryVideoPlayReportStruct.f156925W = bVar.f175112y;
                wCStoryVideoPlayReportStruct.f156926X = BuildInfo.DEBUG ? 0 : 62;
                wCStoryVideoPlayReportStruct.f156927Y = bVar.f175080C;
                int i2 = aVar2.f175009H;
                if (i2 == 0) {
                    wCStoryVideoPlayReportStruct.f156941m = 0;
                } else {
                    wCStoryVideoPlayReportStruct.f156941m = aVar2.f175011J / ((long) i2);
                }
                wCStoryVideoPlayReportStruct.mo86054n();
                ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(wCStoryVideoPlayReportStruct);
            }
        }
    }

    /* renamed from: e */
    public final void mo86506e(C61573a aVar) {
        C13598b0 b0Var;
        String str;
        boolean z;
        String str2;
        C13598b0 b0Var2;
        C64850yb1 yb12;
        String str3;
        C64850yb1 yb13;
        Iterator<T> it;
        String str4;
        C61573a aVar2 = aVar;
        Class cls = FinderCommonFeatureService.class;
        Class cls2 = C58417y0.class;
        Log.m105924i("Finder.FinderVideoPlayReporter", aVar2 != null ? String.valueOf(mo86502a("report19059", aVar2)) : null);
        if (aVar2 != null) {
            long j = 0;
            if (aVar2.f175030b != 0) {
                C62369u0 u0Var = aVar2.f175040g;
                if (u0Var != null) {
                    FinderVideoPlayStruct finderVideoPlayStruct = new FinderVideoPlayStruct();
                    finderVideoPlayStruct.f156210d = 0;
                    C62367r0 r0Var = (C62367r0) u0Var;
                    finderVideoPlayStruct.f156212e = finderVideoPlayStruct.mo86045b("MediaId", r0Var.mo11841b(), true);
                    finderVideoPlayStruct.f156201U = (long) this.f174996a.f134675i;
                    finderVideoPlayStruct.f156214f = (long) u0Var.mo87421f().f185269g;
                    finderVideoPlayStruct.f156216g = aVar2.f175052m;
                    finderVideoPlayStruct.f156218h = (long) aVar2.f175056o;
                    finderVideoPlayStruct.f156220i = (long) aVar2.f175058p;
                    finderVideoPlayStruct.f156222j = (long) u0Var.mo87421f().f185273n;
                    String b = r0Var.mo11841b();
                    if (b != null) {
                        finderVideoPlayStruct.f156222j = C66167g.f190173a.mo90234c(b, false).field_totalSize;
                        C13598b0 b0Var3 = C13598b0.f38549a;
                    }
                    finderVideoPlayStruct.f156224k = aVar2.f175050l;
                    finderVideoPlayStruct.f156226l = (long) aVar2.f175054n;
                    finderVideoPlayStruct.f156228m = aVar2.f175060q;
                    long j2 = aVar2.f175030b;
                    finderVideoPlayStruct.f156230n = aVar2.f175064s;
                    finderVideoPlayStruct.f156232o = aVar2.f175066t;
                    finderVideoPlayStruct.f156234p = aVar2.f175046j;
                    finderVideoPlayStruct.f156236q = finderVideoPlayStruct.mo86045b("NetType", aVar2.f175068u, true);
                    finderVideoPlayStruct.f156238r = finderVideoPlayStruct.mo86045b("SessionId", aVar2.f175028a, true);
                    finderVideoPlayStruct.f156240s = (long) aVar2.f175048k;
                    finderVideoPlayStruct.f156242t = 0;
                    finderVideoPlayStruct.f156244u = (long) aVar2.f175062r;
                    finderVideoPlayStruct.f156246v = (long) aVar2.f175072w;
                    finderVideoPlayStruct.f156248w = (long) aVar2.f175074x;
                    if (!BuildInfo.DEBUG) {
                        j = 62;
                    }
                    finderVideoPlayStruct.f156250x = j;
                    finderVideoPlayStruct.f156252y = (long) aVar2.f175077z;
                    finderVideoPlayStruct.f156254z = (long) aVar2.f175002A;
                    finderVideoPlayStruct.f156176A = aVar2.f175003B;
                    finderVideoPlayStruct.f156178B = aVar2.f175005D;
                    finderVideoPlayStruct.f156180C = aVar2.f175007F;
                    finderVideoPlayStruct.f156182D = finderVideoPlayStruct.mo86045b("NewFeedId", C61926c.m72691p(j2), true);
                    finderVideoPlayStruct.f156184E = (long) aVar2.f175009H;
                    finderVideoPlayStruct.f156186F = aVar2.f175012K;
                    if (this.f174996a.f134683t) {
                        finderVideoPlayStruct.f156233o0 = finderVideoPlayStruct.mo86045b("LongVideoId", C61926c.m72691p(aVar2.f175030b), true);
                    }
                    C61574b bVar = aVar2.f175016O;
                    if (bVar != null) {
                        finderVideoPlayStruct.f156189I = (long) bVar.f175105r;
                        finderVideoPlayStruct.f156192L = (long) bVar.f175106s;
                        finderVideoPlayStruct.f156193M = finderVideoPlayStruct.mo86045b("SvrIp", bVar.f175113z, true);
                        finderVideoPlayStruct.f156194N = (long) bVar.f175078A;
                        finderVideoPlayStruct.f156209c0 = bVar.f175089b;
                        finderVideoPlayStruct.f156235p0 = bVar.f175080C;
                        finderVideoPlayStruct.f156237q0 = finderVideoPlayStruct.mo86045b("VideoCdnMsg", bVar.f175081D, true);
                        finderVideoPlayStruct.f156241s0 = finderVideoPlayStruct.mo86045b("NetConnInfo", bVar.f175084G, true);
                        finderVideoPlayStruct.f156239r0 = (long) bVar.f175085H;
                        finderVideoPlayStruct.f156247v0 = bVar.f175086I;
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    String str5 = "";
                    if (b0Var == null) {
                        C66167g gVar = C66167g.f190173a;
                        String str6 = finderVideoPlayStruct.f156212e;
                        C87412m.m108593f(str6, "struct.mediaId");
                        String str7 = gVar.mo90234c(str6, false).field_netProfile;
                        if (str7 == null) {
                            str7 = str5;
                        }
                        finderVideoPlayStruct.f156241s0 = finderVideoPlayStruct.mo86045b("NetConnInfo", C112551y.m153814n(str7, ",", ";", false), true);
                        Log.m105924i("Finder.FinderVideoPlayReporter", "netprofile query " + finderVideoPlayStruct.f156212e + " = " + finderVideoPlayStruct.f156241s0);
                        C13598b0 b0Var4 = C13598b0.f38549a;
                    }
                    finderVideoPlayStruct.f156213e0 = aVar2.f175011J;
                    finderVideoPlayStruct.f156211d0 = aVar2.f175059p0;
                    Log.m105924i("Finder.FinderVideoPlayReporter", "netprofile now " + finderVideoPlayStruct.f156212e + " = " + finderVideoPlayStruct.f156241s0);
                    if (aVar2.f175029a0 != aVar2.f175031b0) {
                        aVar2.f175033c0 = 1;
                    } else {
                        aVar2.f175033c0 = 0;
                    }
                    Object systemService = MMApplicationContext.getContext().getSystemService("audio");
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                    int streamMaxVolume = ((AudioManager) systemService).getStreamMaxVolume(3);
                    StringBuilder sb = new StringBuilder();
                    sb.append((aVar2.f175029a0 * 100) / streamMaxVolume);
                    sb.append(';');
                    sb.append((aVar2.f175031b0 * 100) / streamMaxVolume);
                    sb.append(';');
                    sb.append(aVar2.f175033c0);
                    finderVideoPlayStruct.f156200T = finderVideoPlayStruct.mo86045b("VoiceInfo", sb.toString(), true);
                    JSONArray jSONArray = new JSONArray();
                    Iterator<C64728tj0> it4 = C45946r0.f123946b.iterator();
                    while (it4.hasNext()) {
                        C64728tj0 next = it4.next();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("pos", next.f185591s);
                            jSONObject.put("spe", next.f185588p);
                            jSONObject.put("loadCost", next.f185592t);
                            jSONObject.put("fSize", next.f185584i);
                            jSONArray.put(jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                    String jSONArray2 = jSONArray.toString();
                    C87412m.m108593f(jSONArray2, "historyInfoArray.toString()");
                    finderVideoPlayStruct.f156187G = finderVideoPlayStruct.mo86045b("HistoryPlayInfo", C112551y.m153814n(jSONArray2, ",", ";", false), true);
                    finderVideoPlayStruct.f156188H = aVar2.f175014M;
                    finderVideoPlayStruct.f156190J = aVar2.f175070v;
                    finderVideoPlayStruct.f156191K = aVar2.f175018Q;
                    finderVideoPlayStruct.f156198R = ((C58466h) C86312j.m106911c(C58466h.class)).mo31868LF() ? 1 : 0;
                    finderVideoPlayStruct.f156202V = (long) aVar2.f175035d0;
                    finderVideoPlayStruct.f156203W = (long) aVar2.f175039f0;
                    finderVideoPlayStruct.f156204X = finderVideoPlayStruct.mo86045b("PlayFormat", aVar2.f175049k0 + ';' + aVar2.f175043h0 + ';' + aVar2.f175041g0 + ';' + aVar2.f175045i0 + ';' + aVar2.f175053m0 + ';' + aVar2.f175055n0 + ';' + aVar2.f175057o0 + ';', true);
                    String str8 = this.f174996a.f134671e;
                    if (str8 == null) {
                        str8 = str5;
                    }
                    finderVideoPlayStruct.f156206Z = finderVideoPlayStruct.mo86045b("ContextId", str8, true);
                    String str9 = this.f174996a.f134672f;
                    if (str9 == null) {
                        str9 = str5;
                    }
                    finderVideoPlayStruct.f156205Y = finderVideoPlayStruct.mo86045b("ClickTabContextId", str9, true);
                    finderVideoPlayStruct.f156207a0 = finderVideoPlayStruct.mo86045b("SessionBuffer", !this.f174996a.f134683t ? ((C58417y0) C86312j.m106911c(cls2)).mo83281Cu(aVar2.f175030b, this.f174996a.f134675i) : ((C58417y0) C86312j.m106911c(cls2)).mo83281Cu(aVar2.f175030b, this.f174996a.f134675i), true);
                    finderVideoPlayStruct.f156208b0 = (long) ((Number) C37521f.f99374d.mo61163Q().f38555d).intValue();
                    finderVideoPlayStruct.f156197Q = finderVideoPlayStruct.mo86045b("PreloadStrategyId", String.valueOf(aVar2.f175044i), true);
                    finderVideoPlayStruct.f156215f0 = aVar2.f175043h0;
                    finderVideoPlayStruct.f156217g0 = finderVideoPlayStruct.mo86045b("PlayCodeFormat", aVar2.f175047j0, true);
                    finderVideoPlayStruct.f156219h0 = finderVideoPlayStruct.mo86045b("PlayFileFormat", aVar2.f175041g0, true);
                    finderVideoPlayStruct.f156221i0 = aVar2.f175045i0;
                    finderVideoPlayStruct.f156223j0 = aVar2.f175053m0;
                    finderVideoPlayStruct.f156225k0 = (int) (aVar2.f175055n0 * aVar2.f175057o0);
                    finderVideoPlayStruct.f156245u0 = this.f174998c;
                    finderVideoPlayStruct.f156255z0 = finderVideoPlayStruct.mo86045b("jump_id", this.f174996a.f134686w, true);
                    C45435i2 vP = ((C58417y0) C86312j.m106911c(cls2)).mo83349vP(aVar2.f175030b, this.f174996a.f134675i);
                    C51822we1 we12 = vP != null ? vP.f122975a : null;
                    finderVideoPlayStruct.f156177A0 = finderVideoPlayStruct.mo86045b("client_udf_kv", (we12 == null || (str4 = we12.f143989i) == null) ? str5 : C112551y.m153814n(str4, ",", ";", false), true);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, Float.valueOf(aVar2.f175055n0));
                    jSONObject2.put(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, Float.valueOf(aVar2.f175057o0));
                    jSONObject2.put("screenWidth", MMApplicationContext.getContext().getResources().getDisplayMetrics().widthPixels);
                    jSONObject2.put("screenHeight", MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels);
                    C55048e Hx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Hx0();
                    jSONObject2.put("isMultiBitRate", Hx0.f154564s);
                    jSONObject2.put("isSecondPre", Hx0.f154566u);
                    jSONObject2.put("playLinkCnt", Hx0.f154553h);
                    jSONObject2.put("preLinkCnt", Hx0.f154552g);
                    jSONObject2.put("startPrePercent", Hx0.f154554i);
                    jSONObject2.put("startPreSec", Hx0.f154555j);
                    jSONObject2.put("preTaskCnt", Hx0.f154551f);
                    jSONObject2.put("maxPrePercent", Hx0.f154549d);
                    jSONObject2.put("maxPreBytes", Hx0.f154550e);
                    jSONObject2.put("prevCnt", Hx0.f154547b);
                    jSONObject2.put("nextCnt", Hx0.f154548c);
                    jSONObject2.put("maxPreBitRate", Hx0.f154556k);
                    C13605o oVar = (C13605o) Hx0.f154563r.get(finderVideoPlayStruct.f156212e);
                    if (oVar == null || (str = (String) oVar.f38558e) == null) {
                        str = str5;
                    }
                    jSONObject2.put("findSpecStep", str);
                    jSONObject2.put("megaVideoMaxBitrate", Hx0.f154558m);
                    jSONObject2.put("megaVideoPrevCount", Hx0.f154559n);
                    jSONObject2.put("megaVideoNextCount", Hx0.f154560o);
                    jSONObject2.put("hitPreloadBitrate", aVar2.f175075x0);
                    jSONObject2.put("playDecoderType", aVar2.f175013L);
                    jSONObject2.put("fvfrd", aVar2.f175008G);
                    jSONObject2.put("mpnn", aVar2.f175034d);
                    jSONObject2.put("mpdp", aVar2.f175036e);
                    String str10 = C15585f.f42213c.get(Long.valueOf(aVar2.f175030b));
                    if (!C87412m.m108589b(str10, C15585f.f42214d.get(Long.valueOf(aVar2.f175030b)))) {
                        jSONObject2.put("sspec", 1);
                    } else {
                        jSONObject2.put("sspec", 0);
                    }
                    jSONObject2.put(FirebaseAnalytics.C113379b.SOURCE, str10);
                    C61575s sVar = aVar2.f175073w0;
                    if (sVar != null) {
                        jSONObject2.put("stup", sVar.f175118e);
                        jSONObject2.put("psta", sVar.f175120g);
                        jSONObject2.put("fttm", sVar.f175119f);
                        jSONObject2.put("fttc", sVar.f175121h);
                        jSONObject2.put("fmtm", sVar.f175122i);
                        jSONObject2.put("ffps", Float.valueOf(sVar.mo86512b()));
                        jSONObject2.put("maxfps", sVar.f175128r);
                        jSONObject2.put("minfps", sVar.f175129s);
                        jSONObject2.put("fsfps", sVar.f175126p);
                        jSONObject2.put("lsfps", sVar.f175127q);
                        jSONObject2.put("lvfps", sVar.f175130t);
                        jSONObject2.put("mopts", sVar.f175132v);
                        jSONObject2.put("mclts", sVar.f175133w);
                        jSONObject2.put("hpsz", sVar.f175115B);
                        jSONObject2.put("fpsg", 0);
                        jSONObject2.put("hdcd", sVar.f175116C);
                        Iterator<Integer> it5 = sVar.f175134x.iterator();
                        String str11 = str5;
                        while (it5.hasNext()) {
                            str11 = str11 + it5.next() + ';';
                        }
                        jSONObject2.put("pgsl", str11);
                        Iterator<Integer> it6 = sVar.f175135y.iterator();
                        String str12 = str5;
                        while (it6.hasNext()) {
                            str12 = str12 + it6.next() + ';';
                        }
                        jSONObject2.put("fpsl", str12);
                        JSONObject jSONObject3 = sVar.f175114A;
                        if (jSONObject3 != null) {
                            String jSONObject4 = jSONObject3.toString();
                            C87412m.m108593f(jSONObject4, "videoPlayTrace.toString()");
                            finderVideoPlayStruct.f156243t0 = finderVideoPlayStruct.mo86045b("FirstFrameDetail", C112551y.m153814n(jSONObject4, ",", ";", false), true);
                        }
                        Log.m105924i("OnStopPlayData", sVar.toString());
                        C13598b0 b0Var5 = C13598b0.f38549a;
                    }
                    C13598b0 b0Var6 = C13598b0.f38549a;
                    String jSONObject5 = jSONObject2.toString();
                    C87412m.m108593f(jSONObject5, "JSONObject().apply {\n   …             }.toString()");
                    finderVideoPlayStruct.f156227l0 = finderVideoPlayStruct.mo86045b("PlayFormatJson", C112551y.m153814n(jSONObject5, ",", ";", false), true);
                    C61575s sVar2 = aVar2.f175073w0;
                    finderVideoPlayStruct.f156249w0 = finderVideoPlayStruct.mo86045b("requestFormat", sVar2 != null ? sVar2.f175136z : null, true);
                    C61575s sVar3 = aVar2.f175073w0;
                    finderVideoPlayStruct.f156251x0 = finderVideoPlayStruct.mo86045b("svrDownloadFormat", sVar3 != null ? sVar3.f175136z : null, true);
                    String a = C58403t.f167322q.mo83247a(this.f174996a.f134681r);
                    if (a != null) {
                        z = false;
                        str2 = C112551y.m153814n(a, ",", ";", false);
                    } else {
                        z = false;
                        str2 = str5;
                    }
                    finderVideoPlayStruct.f156229m0 = finderVideoPlayStruct.mo86045b("ExtraInfo", str2, true);
                    String str13 = this.f174996a.f134682s;
                    finderVideoPlayStruct.f156231n0 = finderVideoPlayStruct.mo86045b("enterSourceInfo", str13 != null ? C112551y.m153814n(str13, ",", ";", z) : str5, true);
                    FinderItem Br0 = ((C58417y0) C86312j.m106911c(cls2)).Br0(aVar2.f175030b);
                    if (Br0 != null) {
                        finderVideoPlayStruct.f156196P = finderVideoPlayStruct.mo86045b("Username", Br0.getUserName(), true);
                        b0Var2 = C13598b0.f38549a;
                    } else {
                        b0Var2 = null;
                    }
                    if (b0Var2 == null) {
                        finderVideoPlayStruct.f156196P = finderVideoPlayStruct.mo86045b("Username", str5, true);
                    }
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator<T> it7 = aVar2.f175026Y.iterator();
                    while (it7.hasNext()) {
                        C64292cp1 cp12 = (C64292cp1) it7.next();
                        try {
                            JSONObject jSONObject6 = new JSONObject();
                            it = it7;
                            try {
                                jSONObject6.put("waitMs", cp12.f182553f);
                                jSONObject6.put("percent", cp12.f182552e);
                                jSONObject6.put("type", cp12.f182551d);
                                jSONArray3.put(jSONObject6);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            it = it7;
                        }
                        it7 = it;
                    }
                    String jSONArray4 = jSONArray3.toString();
                    C87412m.m108593f(jSONArray4, "waitingDetails.toString()");
                    finderVideoPlayStruct.f156195O = finderVideoPlayStruct.mo86045b("WaitingDetails", C112551y.m153814n(jSONArray4, ",", ";", false), true);
                    Iterator<Integer> it8 = aVar2.f175027Z.iterator();
                    String str14 = str5;
                    while (it8.hasNext()) {
                        str14 = str14 + it8.next().intValue() + ';';
                    }
                    finderVideoPlayStruct.f156181C0 = finderVideoPlayStruct.mo86045b("formatInfo", C15585f.f42214d.get(Long.valueOf(aVar2.f175030b)), true);
                    finderVideoPlayStruct.f156199S = finderVideoPlayStruct.mo86045b("PlayProgressInfo", str14, true);
                    finderVideoPlayStruct.f156253y0 = finderVideoPlayStruct.mo86045b("hdrInfo", ((C37315g) C86312j.m106911c(C37315g.class)).mo60894aA(), true);
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("playDecodingFps", Float.valueOf(aVar2.f175020S));
                    jSONObject7.put("playRenderingFps", Float.valueOf(aVar2.f175021T));
                    jSONObject7.put("playDecodeStuckCount", aVar2.f175022U);
                    jSONObject7.put("playRenderStuckCount", aVar2.f175023V);
                    jSONObject7.put("playDecodeStuckRatio", Float.valueOf(aVar2.f175024W));
                    jSONObject7.put("playRenderStuckRatio", Float.valueOf(aVar2.f175025X));
                    C13598b0 b0Var7 = C13598b0.f38549a;
                    String jSONObject8 = jSONObject7.toString();
                    C87412m.m108593f(jSONObject8, "JSONObject().apply {\n   …             }.toString()");
                    finderVideoPlayStruct.f156179B0 = finderVideoPlayStruct.mo86045b("playFpsInfo", C112551y.m153814n(jSONObject8, ",", ";", false), true);
                    finderVideoPlayStruct.f156183D0 = finderVideoPlayStruct.mo86045b("ampInfo", str5, true);
                    C13605o oVar2 = (C13605o) ((FinderCommonFeatureService) C86312j.m106911c(cls)).Hx0().f154563r.get(finderVideoPlayStruct.f156212e);
                    int i = (oVar2 == null || (yb13 = (C64850yb1) oVar2.f38557d) == null) ? -1 : yb13.f186476q;
                    aVar.getClass();
                    finderVideoPlayStruct.f156185E0 = i;
                    finderVideoPlayStruct.mo86055o();
                    mo86507f(finderVideoPlayStruct, aVar2);
                    ((C58417y0) C86312j.m106911c(cls2)).Ec0(finderVideoPlayStruct);
                    C61574b bVar2 = aVar2.f175016O;
                    if (bVar2 != null) {
                        C64728tj0 tj02 = new C64728tj0();
                        tj02.f185579d = aVar2.f175030b;
                        tj02.f185580e = 0;
                        tj02.f185588p = (int) finderVideoPlayStruct.f156189I;
                        tj02.f185592t = (int) finderVideoPlayStruct.f156180C;
                        long j3 = finderVideoPlayStruct.f156222j;
                        tj02.f185584i = (int) j3;
                        tj02.f185582g = C60641c.m70921b(((float) (j3 * finderVideoPlayStruct.f156220i)) / 100.0f);
                        tj02.f185583h = C60641c.m70921b(((float) (finderVideoPlayStruct.f156244u * finderVideoPlayStruct.f156222j)) / 100.0f);
                        tj02.f185581f = this.f174996a.f134675i;
                        tj02.f185585j = u0Var.mo87421f().f185269g;
                        tj02.f185591s = (int) finderVideoPlayStruct.f156240s;
                        tj02.f185590r = C31543z5.m39455e();
                        tj02.f185586n = (int) aVar2.f175052m;
                        tj02.f185587o = (int) aVar2.f175011J;
                        tj02.f185589q = aVar2.f175026Y;
                        tj02.f185567A = aVar2.f175041g0;
                        tj02.f185595w = bVar2.f175106s;
                        tj02.f185597y = bVar2.f175113z;
                        tj02.f185598z = bVar2.f175078A;
                        tj02.f185596x = bVar2.f175079B;
                        tj02.f185594v = aVar2.f175044i;
                        tj02.f185568B = this.f174996a.f134683t ? aVar2.f175030b : 0;
                        tj02.f185569C = aVar2.f175074x;
                        C51058r50 r502 = new C51058r50();
                        r502.f140695d = bVar2.f175091d;
                        r502.f140697f = bVar2.f175093f;
                        r502.f140698g = bVar2.f175092e;
                        r502.f140702n = bVar2.f175113z;
                        r502.f140700i = bVar2.f175109v;
                        r502.f140699h = bVar2.f175079B;
                        r502.f140701j = 0;
                        r502.f140696e = (long) bVar2.f175087J;
                        tj02.f185570D = r502;
                        C55048e Hx02 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Hx0();
                        C13605o oVar3 = (C13605o) Hx02.f154563r.get(finderVideoPlayStruct.f156212e);
                        tj02.f185571E = oVar3 != null ? (int) ((Number) oVar3.f38559f).longValue() : 0;
                        C13605o oVar4 = (C13605o) Hx02.f154563r.get(finderVideoPlayStruct.f156212e);
                        if (!(oVar4 == null || (yb12 = (C64850yb1) oVar4.f38557d) == null || (str3 = yb12.f186466d) == null)) {
                            str5 = str3;
                        }
                        tj02.f185572F = str5;
                        tj02.f185573G = u0Var.mo87421f().f185238E;
                        tj02.f185574H = aVar2.f175048k;
                        tj02.f185575I = bVar2.f175091d;
                        tj02.f185577K = (int) aVar2.f175020S;
                        tj02.f185578L = (int) aVar2.f175021T;
                        C45946r0 r0Var2 = C45946r0.f123945a;
                        r0Var2.mo71347a(tj02, ((FinderCommonFeatureService) C86312j.m106911c(cls)).Hx0().f154542H);
                        r0Var2.mo71348b(tj02);
                        Log.m105924i("Finder.FinderVideoPlayReporter", "downloadInfoList " + C45946r0.f123946b.size());
                    }
                }
                C13598b0 b0Var8 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: f */
    public final void mo86507f(FinderVideoPlayStruct finderVideoPlayStruct, C61573a aVar) {
        ArrayList arrayList = new ArrayList(8);
        if (finderVideoPlayStruct.f156191K > 0) {
            IDKey iDKey = new IDKey();
            iDKey.SetID(this.f175001f);
            iDKey.SetKey(0);
            iDKey.SetValue(finderVideoPlayStruct.f156191K);
            arrayList.add(iDKey);
        }
        if (finderVideoPlayStruct.f156246v > 0 && finderVideoPlayStruct.f156191K > 0) {
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(this.f175001f);
            iDKey2.SetKey(1);
            iDKey2.SetValue(finderVideoPlayStruct.f156191K);
            arrayList.add(iDKey2);
        }
        if (finderVideoPlayStruct.f156246v > 0 && finderVideoPlayStruct.f156218h > 0) {
            IDKey iDKey3 = new IDKey();
            iDKey3.SetID(this.f175001f);
            iDKey3.SetKey(2);
            iDKey3.SetValue(1);
            arrayList.add(iDKey3);
        }
        if (finderVideoPlayStruct.f156246v > 0 && finderVideoPlayStruct.f156180C > 0) {
            IDKey iDKey4 = new IDKey();
            iDKey4.SetID(this.f175001f);
            iDKey4.SetKey(3);
            iDKey4.SetValue(finderVideoPlayStruct.f156180C);
            arrayList.add(iDKey4);
            long j = finderVideoPlayStruct.f156180C;
            if (j <= 500) {
                IDKey iDKey5 = new IDKey();
                iDKey5.SetID(this.f175001f);
                iDKey5.SetKey(5);
                iDKey5.SetValue(1);
                arrayList.add(iDKey5);
            } else if (j <= 1000) {
                IDKey iDKey6 = new IDKey();
                iDKey6.SetID(this.f175001f);
                iDKey6.SetKey(6);
                iDKey6.SetValue(1);
                arrayList.add(iDKey6);
            } else if (j > 1000) {
                IDKey iDKey7 = new IDKey();
                iDKey7.SetID(this.f175001f);
                iDKey7.SetKey(7);
                iDKey7.SetValue(1);
                arrayList.add(iDKey7);
            }
        }
        if (finderVideoPlayStruct.f156246v > 0 && finderVideoPlayStruct.f156213e0 > 0) {
            IDKey iDKey8 = new IDKey();
            iDKey8.SetID(this.f175001f);
            iDKey8.SetKey(4);
            iDKey8.SetValue(finderVideoPlayStruct.f156213e0);
            arrayList.add(iDKey8);
        }
        if (finderVideoPlayStruct.f156198R == 1) {
            IDKey iDKey9 = new IDKey();
            iDKey9.SetID(this.f175001f);
            iDKey9.SetValue(1);
            int i = aVar.f175013L;
            if (i == 102) {
                iDKey9.SetKey(104);
                arrayList.add(iDKey9);
            } else if (i == 101) {
                iDKey9.SetKey(105);
                arrayList.add(iDKey9);
            }
        }
        IDKey iDKey10 = new IDKey();
        iDKey10.SetID(this.f175001f);
        iDKey10.SetKey(100);
        iDKey10.SetValue(1);
        arrayList.add(iDKey10);
        if (finderVideoPlayStruct.f156246v > 0) {
            IDKey iDKey11 = new IDKey();
            iDKey11.SetID(this.f175001f);
            iDKey11.SetKey(101);
            iDKey11.SetValue(1);
            arrayList.add(iDKey11);
        }
        if (finderVideoPlayStruct.f156246v > 0 && finderVideoPlayStruct.f156180C > 0) {
            IDKey iDKey12 = new IDKey();
            iDKey12.SetID(this.f175001f);
            iDKey12.SetKey(102);
            iDKey12.SetValue(1);
            arrayList.add(iDKey12);
        }
        if (finderVideoPlayStruct.f156246v > 0 && finderVideoPlayStruct.f156213e0 > 0) {
            IDKey iDKey13 = new IDKey();
            iDKey13.SetID(this.f175001f);
            iDKey13.SetKey(103);
            iDKey13.SetValue(1);
            arrayList.add(iDKey13);
        }
        if (!arrayList.isEmpty()) {
            C115669n.INSTANCE.mo160124a(arrayList, false);
        }
    }
}
