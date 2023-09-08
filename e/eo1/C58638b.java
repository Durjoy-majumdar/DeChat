package eo1;

import android.os.SystemClock;
import bl3.C39818r;
import bo1.C54511w;
import bo1.C54512y;
import cm1.C55015f1;
import co1.C0898b;
import co1.C55048e;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import di3.C86312j;
import e03.C20504h;
import e03.C58469b;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C45946r0;
import gr1.C59670o2;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60184m;
import ht1.C60200t1;
import iy3.C60641c;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import mr1.C25026b;
import o40.C61926c;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p501dz.C58466h;
import p663qo.C101213l;
import p682rz.C101487r;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62367r0;
import pl1.C62372x;
import rx3.C13598b0;
import rx3.C13605o;
import sx3.C110818d0;
import sx3.C64175a0;
import sx3.C77813z;
import te3.C51058r50;
import te3.C64689rq2;
import te3.C64728tj0;
import te3.C64850yb1;
import up1.C27696y;
import up1.C37521f;
import wp1.C66167g;
import z04.C112551y;

/* renamed from: eo1.b */
public class C58638b {

    /* renamed from: a */
    public final C55048e f167872a;

    /* renamed from: b */
    public String f167873b;

    /* renamed from: c */
    public final ReentrantLock f167874c = new ReentrantLock();

    /* renamed from: d */
    public boolean f167875d;

    /* renamed from: e */
    public final HashMap<String, C54512y> f167876e = new HashMap<>();

    /* renamed from: f */
    public final LinkedList<C54512y> f167877f = new LinkedList<>();

    /* renamed from: g */
    public String f167878g = "";

    /* renamed from: h */
    public final boolean f167879h = C37521f.f99374d.mo61171Y();

    /* renamed from: i */
    public final ConcurrentLinkedQueue<C54511w> f167880i;

    /* renamed from: j */
    public final String f167881j;

    /* renamed from: k */
    public AtomicBoolean f167882k;

    /* renamed from: eo1.b$a */
    public static final class C58639a implements C54511w {

        /* renamed from: a */
        public final /* synthetic */ C58638b f167883a;

        public C58639a(C58638b bVar) {
            this.f167883a = bVar;
        }

        /* renamed from: a */
        public void mo12829a(String str, C54512y yVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(yVar, "task");
            String str2 = this.f167883a.f167881j;
            Log.m105920e(str2, "[onReject] mediaId=" + str);
        }

        /* renamed from: b */
        public void mo12830b(String str, int i, int i2, String str2, String str3, C54512y yVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "fileFormat");
            C87412m.m108594g(str3, "codingFormat");
            C87412m.m108594g(yVar, "task");
        }

        /* renamed from: c */
        public void mo12831c(String str, int i, long j) {
            C87412m.m108594g(str, "mediaId");
        }

        /* renamed from: d */
        public void mo12832d(String str, String str2, C54512y yVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "msg");
            C87412m.m108594g(yVar, "task");
            this.f167883a.mo83525g();
        }

        /* renamed from: e */
        public void mo12833e(String str) {
            C87412m.m108594g(str, "mediaId");
            String str2 = this.f167883a.f167881j;
            Log.m105920e(str2, "[onFormatChange] mediaId=" + str);
            this.f167883a.mo83520a(str, false, "onFormatChange");
            C66167g gVar = C66167g.f190173a;
            C86013q1.m106447h(gVar.mo90234c(str, false).mo76071l2());
            gVar.mo90241l(str, 0, 0, -2);
        }

        /* renamed from: f */
        public void mo12834f(String str, boolean z, int i, C54512y yVar, long j) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(yVar, "task");
            C66167g gVar = C66167g.f190173a;
            C55015f1 c = gVar.mo90234c(str, false);
            this.f167883a.f167872a.getClass();
            if (!c.field_moovReady && z) {
                gVar.mo90239j(str, yVar.mo75350c());
            }
            this.f167883a.mo83525g();
        }
    }

    /* renamed from: eo1.b$b */
    public final class C58640b implements C98124g.C98126b {

        /* renamed from: d */
        public final int f167884d;

        /* renamed from: e */
        public final long f167885e;

        /* renamed from: f */
        public final HashMap<String, C54512y> f167886f;

        /* renamed from: g */
        public final ConcurrentLinkedQueue<C54511w> f167887g;

        /* renamed from: h */
        public final /* synthetic */ C58638b f167888h;

        /* renamed from: eo1.b$b$a */
        public static final class C58641a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f167889d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58641a(String str) {
                super(0);
                this.f167889d = str;
            }

            public Object invoke() {
                String videoMediaId;
                FinderVideoRecycler finderVideoRecycler = (FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class);
                String str = this.f167889d;
                finderVideoRecycler.getClass();
                C87412m.m108594g(str, "mediaId");
                C37521f.f99374d.getClass();
                if (C37521f.f99124A4.mo60266n().intValue() == 1) {
                    Iterator<WeakReference<? extends C59670o2>> it = finderVideoRecycler.f162530j.iterator();
                    while (it.hasNext()) {
                        C59670o2 o2Var = (C59670o2) it.next().get();
                        if (!(o2Var == null || (videoMediaId = o2Var.getVideoMediaId()) == null)) {
                            Log.m105924i("Finder.VideoRecycler", "onPreloadComplete " + videoMediaId + ' ' + str);
                            if (C87412m.m108589b(videoMediaId, str)) {
                                o2Var.mo51228s();
                            }
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: eo1.b$b$b */
        public static final class C58642b extends C87413o implements C32224a<C54512y> {

            /* renamed from: d */
            public final /* synthetic */ C58640b f167890d;

            /* renamed from: e */
            public final /* synthetic */ String f167891e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58642b(C58640b bVar, String str) {
                super(0);
                this.f167890d = bVar;
                this.f167891e = str;
            }

            public Object invoke() {
                return this.f167890d.f167886f.remove(this.f167891e);
            }
        }

        /* renamed from: eo1.b$b$c */
        public static final class C58643c extends C87413o implements C32224a<C54512y> {

            /* renamed from: d */
            public final /* synthetic */ C58640b f167892d;

            /* renamed from: e */
            public final /* synthetic */ String f167893e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58643c(C58640b bVar, String str) {
                super(0);
                this.f167892d = bVar;
                this.f167893e = str;
            }

            public Object invoke() {
                return this.f167892d.f167886f.remove(this.f167893e);
            }
        }

        public C58640b(C58638b bVar, int i, long j, HashMap<String, C54512y> hashMap, ConcurrentLinkedQueue<C54511w> concurrentLinkedQueue) {
            C87412m.m108594g(hashMap, "loadingMap");
            C87412m.m108594g(concurrentLinkedQueue, "preLoadCallbacks");
            this.f167888h = bVar;
            this.f167884d = i;
            this.f167885e = j;
            this.f167886f = hashMap;
            this.f167887g = concurrentLinkedQueue;
        }

        /* renamed from: b */
        public void mo31987b(String str, C98121d dVar) {
            int i;
            int i2;
            String str2;
            C64850yb1 yb12;
            String str3;
            C64850yb1 yb13;
            String str4 = str;
            C98121d dVar2 = dVar;
            Class cls = FinderCommonFeatureService.class;
            C87412m.m108594g(str4, "mediaId");
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Fx0().mo52132i(str4, dVar2, "worker#complete");
            if (dVar2 != null && dVar2.field_retCode == -21112) {
                for (C54511w e : this.f167887g) {
                    e.mo12833e(str4);
                }
            } else if (dVar2 == null) {
                Log.m105920e(this.f167888h.f167881j, "[onPreloadCompleted] sceneResult == null");
                C54512y yVar = (C54512y) this.f167888h.mo83527i("onPreloadCompleted", new C58642b(this, str4));
                if (yVar != null) {
                    for (C54511w d : this.f167887g) {
                        d.mo12832d(str4, "onPreloadCompleted sceneResult null error", yVar);
                    }
                }
            } else {
                long[] jArr = new long[3];
                CdnLogic.queryDownloadedSize(str4, jArr);
                long j = jArr[0];
                long j2 = dVar2.field_fileLength;
                C54512y yVar2 = (C54512y) this.f167888h.mo83527i("onPreloadCompleted", new C58643c(this, str4));
                ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(str4);
                C66167g gVar = C66167g.f190173a;
                String str5 = dVar2.f287621m;
                C87412m.m108593f(str5, "sceneResult.profile");
                gVar.mo90240k(str4, str5);
                Class cls2 = cls;
                String str6 = "% fileFormat=";
                String str7 = "% result=";
                String str8 = " expect=";
                String str9 = " videoFormat=";
                int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i3 <= 0 || j2 <= 0 || yVar2 == null) {
                    String str10 = ") fileLength=";
                    C54512y yVar3 = yVar2;
                    String str11 = str6;
                    String str12 = str8;
                    String str13 = str9;
                    String str14 = " x:";
                    long j3 = j2;
                    String str15 = str7;
                    if (i3 <= 0 || j3 <= 0) {
                        C98121d dVar3 = dVar;
                        String str16 = str4;
                        String str17 = this.f167888h.f167881j;
                        Log.m105920e(str17, "[onPreloadCompleted] ERROR! mediaId=" + str16 + " startTick=" + this.f167885e + " recvedBytes=" + j + " fileLength=" + j3 + " fileFormat=" + dVar3.field_videoFlag + str13 + dVar3.field_videoFormat);
                        if (yVar3 != null) {
                            for (C54511w d2 : this.f167887g) {
                                d2.mo12832d(str16, "onPreloadCompleted error", yVar3);
                            }
                            return;
                        }
                        return;
                    }
                    long j4 = j3;
                    String str18 = this.f167888h.f167881j;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[onPreloadCompleted] canceled! mediaId=");
                    sb.append(str4);
                    sb.append(" startTick=");
                    sb.append(this.f167885e);
                    sb.append(" receivedBytes=");
                    sb.append(j);
                    sb.append(" (query[0]:");
                    sb.append(jArr[0]);
                    sb.append(str14);
                    C98121d dVar4 = dVar;
                    long j5 = j4;
                    sb.append(dVar4.field_recvedBytes);
                    sb.append(str10);
                    sb.append(j5);
                    sb.append(str12);
                    sb.append(this.f167884d);
                    sb.append(str15);
                    sb.append((int) ((((float) j) * 100.0f) / ((float) j5)));
                    sb.append(str11);
                    sb.append(dVar4.field_videoFlag);
                    sb.append(str13);
                    sb.append(dVar4.field_videoFormat);
                    Log.m105924i(str18, sb.toString());
                    C66167g gVar2 = gVar;
                    C55015f1 c = gVar2.mo90234c(str, false);
                    c.field_cacheSize = j;
                    c.field_totalSize = j5;
                    gVar2.mo90236f(c, "onPreloadCompleted#cancel");
                    return;
                }
                String str19 = " x:";
                String str20 = ") fileLength=";
                C55015f1 c2 = gVar.mo90234c(str4, false);
                c2.field_cacheSize = j;
                c2.field_totalSize = j2;
                int i4 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                if (i4 <= 0) {
                    i = i4;
                    i2 = 3;
                } else {
                    i = i4;
                    i2 = 2;
                }
                c2.field_state = i2;
                int i5 = c2.field_reqFormat;
                long j6 = j2;
                int i6 = dVar2.field_videoFormat;
                if (i5 != i6) {
                    c2.field_reqFormat = i6;
                }
                String str21 = dVar2.field_videoFlag;
                if (str21 == null) {
                    str21 = yVar2.mo75350c();
                }
                c2.field_fileFormat = str21;
                gVar.mo90236f(c2, "onPreloadCompleted");
                String str22 = this.f167888h.f167881j;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[onPreloadCompleted] successfully! mediaId=");
                sb4.append(str4);
                sb4.append(" startTick=");
                sb4.append(this.f167885e);
                sb4.append(" receivedBytes=");
                sb4.append(j);
                sb4.append(" (query[0]:");
                sb4.append(jArr[0]);
                sb4.append(str19);
                sb4.append(dVar2.field_recvedBytes);
                sb4.append(str20);
                long j7 = j6;
                sb4.append(j7);
                sb4.append(str8);
                sb4.append(this.f167884d);
                sb4.append(str7);
                float f = (((float) j) * 100.0f) / ((float) j7);
                sb4.append((int) f);
                sb4.append(str6);
                sb4.append(dVar2.field_videoFlag);
                sb4.append(str9);
                sb4.append(dVar2.field_videoFormat);
                Log.m105924i(str22, sb4.toString());
                for (C54511w f2 : this.f167887g) {
                    f2.mo12834f(str, i == 0, C60641c.m70921b(f), yVar2, j);
                }
                this.f167888h.getClass();
                C64728tj0 tj02 = new C64728tj0();
                tj02.f185579d = yVar2.f152811i1;
                tj02.f185580e = 0;
                tj02.f185588p = dVar2.field_averageSpeed;
                tj02.f185592t = dVar2.field_firstRequestCost;
                tj02.f185584i = (int) dVar2.field_fileLength;
                int i7 = (int) dVar2.field_recvedBytes;
                tj02.f185582g = i7;
                tj02.f185583h = i7;
                tj02.f185585j = yVar2.f152810h1.f177253e.f185269g;
                tj02.f185595w = dVar2.field_averageConnectCost;
                tj02.f185597y = dVar2.f287612d;
                tj02.f185598z = dVar2.f287613e;
                tj02.f185596x = dVar2.f287614f;
                tj02.f185594v = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Hx0().f154557l;
                tj02.f185568B = yVar2.f152810h1.f177253e.f185238E > 60000 ? yVar2.f152811i1 : 0;
                C51058r50 r502 = new C51058r50();
                long j8 = dVar2.field_recvedBytes;
                r502.f140695d = j8;
                r502.f140697f = dVar2.field_startTime;
                r502.f140698g = dVar2.field_endTime;
                r502.f140702n = dVar2.f287612d;
                r502.f140700i = dVar2.field_clientIP;
                r502.f140699h = dVar2.f287614f;
                r502.f140696e = (long) dVar2.field_receiveCostTime;
                tj02.f185570D = r502;
                tj02.f185573G = yVar2.f152810h1.f177253e.f185238E;
                tj02.f185574H = yVar2.f152816n1;
                tj02.f185575I = j8;
                tj02.f185577K = 0;
                tj02.f185578L = 0;
                C55048e Hx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Hx0();
                C13605o oVar = (C13605o) Hx0.f154563r.get(yVar2.f152814l1);
                tj02.f185571E = oVar != null ? (int) ((Number) oVar.f38559f).longValue() : 0;
                C13605o oVar2 = (C13605o) Hx0.f154563r.get(yVar2.f152814l1);
                String str23 = "";
                if (oVar2 == null || (yb13 = (C64850yb1) oVar2.f38557d) == null || (str2 = yb13.f186466d) == null) {
                    str2 = str23;
                }
                tj02.f185572F = str2;
                C13605o oVar3 = (C13605o) Hx0.f154563r.get(yVar2.f152814l1);
                if (!(oVar3 == null || (yb12 = (C64850yb1) oVar3.f38557d) == null || (str3 = yb12.f186466d) == null)) {
                    str23 = str3;
                }
                tj02.f185567A = str23;
                C45946r0 r0Var = C45946r0.f123945a;
                Log.m105924i("Finder.FinderNetworkStatusStatistic", "addNetworkInfo info:" + tj02 + " size:" + C45946r0.f123946b.size());
                CopyOnWriteArrayList<C64728tj0> copyOnWriteArrayList = C45946r0.f123948d;
                if (copyOnWriteArrayList.size() > 10) {
                    copyOnWriteArrayList.remove(0);
                }
                copyOnWriteArrayList.add(tj02);
                C61926c.m72668M(new C58641a(str4));
            }
        }
    }

    /* renamed from: eo1.b$c */
    public final class C58644c implements C98124g.C98125a {

        /* renamed from: d */
        public final int f167894d;

        /* renamed from: e */
        public final long f167895e;

        /* renamed from: f */
        public final HashMap<String, C54512y> f167896f;

        /* renamed from: g */
        public final ConcurrentLinkedQueue<C54511w> f167897g;

        /* renamed from: h */
        public final C62367r0 f167898h;

        /* renamed from: i */
        public final /* synthetic */ C58638b f167899i;

        /* renamed from: eo1.b$c$a */
        public static final class C58645a extends C87413o implements C32224a<C54512y> {

            /* renamed from: d */
            public final /* synthetic */ C58644c f167900d;

            /* renamed from: e */
            public final /* synthetic */ String f167901e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58645a(C58644c cVar, String str) {
                super(0);
                this.f167900d = cVar;
                this.f167901e = str;
            }

            public Object invoke() {
                return this.f167900d.f167896f.remove(this.f167901e);
            }
        }

        /* renamed from: eo1.b$c$b */
        public static final class C58646b extends C87413o implements C32224a<C54512y> {

            /* renamed from: d */
            public final /* synthetic */ C58644c f167902d;

            /* renamed from: e */
            public final /* synthetic */ String f167903e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58646b(C58644c cVar, String str) {
                super(0);
                this.f167902d = cVar;
                this.f167903e = str;
            }

            public Object invoke() {
                return this.f167902d.f167896f.remove(this.f167903e);
            }
        }

        public C58644c(C58638b bVar, int i, long j, HashMap<String, C54512y> hashMap, ConcurrentLinkedQueue<C54511w> concurrentLinkedQueue, C62367r0 r0Var) {
            C87412m.m108594g(hashMap, "loadingMap");
            C87412m.m108594g(concurrentLinkedQueue, "preLoadCallbacks");
            C87412m.m108594g(r0Var, "video");
            this.f167899i = bVar;
            this.f167894d = i;
            this.f167895e = j;
            this.f167896f = hashMap;
            this.f167897g = concurrentLinkedQueue;
            this.f167898h = r0Var;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2 = str;
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            C87412m.m108594g(str2, "mediaId");
            if (dVar2 != null && dVar2.field_retCode == -21112) {
                this.f167899i.mo83527i("callback#1", new C58645a(this, str2));
                for (C54511w e : this.f167897g) {
                    e.mo12833e(str2);
                }
                return -1;
            }
            if (dVar2 != null) {
                C66167g gVar = C66167g.f190173a;
                String str3 = dVar2.f287621m;
                C87412m.m108593f(str3, "sceneResult.profile");
                gVar.mo90240k(str2, str3);
            }
            if (cVar2 != null) {
                long j = cVar2.field_toltalLength;
                if (j > 0) {
                    long j2 = cVar2.field_finishedLength;
                    float f = (float) j2;
                    float f2 = (float) j;
                    int i3 = (((int) ((f / f2) * ((float) 100))) < this.f167894d || j2 >= j || this.f167895e > j2) ? j2 >= j ? 3 : 1 : 2;
                    C66167g gVar2 = C66167g.f190173a;
                    gVar2.mo90241l(str, j2, j, i3);
                    String str4 = dVar2 != null ? dVar2.field_videoFlag : null;
                    if (str4 == null) {
                        str4 = this.f167898h.mo87422g();
                    }
                    gVar2.getClass();
                    C55015f1 c = gVar2.mo90234c(str2, false);
                    c.field_fileFormat = str4;
                    C13598b0 b0Var = C13598b0.f38549a;
                    gVar2.mo90238i(str2, c, false);
                    for (C54511w c2 : this.f167897g) {
                        c2.mo12831c(str2, C60641c.m70921b((100.0f * f) / f2), j2);
                    }
                    return 0;
                }
            }
            if (i2 != 0) {
                String str5 = this.f167899i.f167881j;
                Log.m105920e(str5, "[VideoTaskCallTask] error! startRet=" + i2 + " mediaId=" + str2);
                if (-21006 != i2) {
                    C54512y yVar = (C54512y) this.f167899i.mo83527i("callback#2", new C58646b(this, str2));
                    C66167g.f190173a.mo90241l(str, 0, 0, -1);
                    if (yVar != null) {
                        for (C54511w d : this.f167897g) {
                            d.mo12832d(str2, "UPDATE ERROR", yVar);
                        }
                    }
                }
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: eo1.b$d */
    public static final class C58647d extends C87413o implements C32224a<C54512y> {

        /* renamed from: d */
        public final /* synthetic */ C58638b f167904d;

        /* renamed from: e */
        public final /* synthetic */ String f167905e;

        /* renamed from: f */
        public final /* synthetic */ boolean f167906f;

        /* renamed from: g */
        public final /* synthetic */ String f167907g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58647d(C58638b bVar, String str, boolean z, String str2) {
            super(0);
            this.f167904d = bVar;
            this.f167905e = str;
            this.f167906f = z;
            this.f167907g = str2;
        }

        public Object invoke() {
            Class cls = C58466h.class;
            Class cls2 = C101213l.class;
            Class cls3 = C101487r.class;
            C54512y remove = this.f167904d.f167876e.remove(this.f167905e);
            if (remove != null) {
                boolean z = this.f167906f;
                String str = this.f167905e;
                C58638b bVar = this.f167904d;
                String str2 = this.f167907g;
                int i = 24;
                boolean z2 = true;
                if (z || !C87412m.m108589b(str, bVar.f167878g)) {
                    if (((C58466h) C86312j.m106911c(cls)).mo31868LF()) {
                        ((C58466h) C86312j.m106911c(cls)).Qi0().mo32056d(str, new C58655c(bVar, str2, str));
                    } else {
                        ((C92755e0) ((C101487r) C86312j.m106911c(cls3)).mo140795W6()).mo126984h(str, (Object[]) null);
                        ((C101213l) C86312j.m106911c(cls2)).Gm0(str);
                    }
                    String str3 = bVar.f167881j;
                    StringBuilder sb = new StringBuilder();
                    sb.append("[cancel] ");
                    sb.append(str2);
                    sb.append(" [");
                    C87412m.m108594g(str, "mediaId");
                    if (str.length() != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        str = "";
                    } else if (str.length() > 13) {
                        int length = str.length();
                        if (length <= 24) {
                            i = length;
                        }
                        str = str.substring(13, i);
                        C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    sb.append(str);
                    sb.append("] from loadingMap, isIgnorePlaying=");
                    sb.append(z);
                    sb.append(" focusedMediaId=");
                    sb.append(bVar.f167878g);
                    Log.m105924i(str3, sb.toString());
                    return remove;
                }
                String str4 = bVar.f167881j;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[cancel] ");
                sb4.append(str2);
                sb4.append(" is not ignore Playing[");
                C87412m.m108594g(str, "mediaId");
                if (str.length() != 0) {
                    z2 = false;
                }
                if (z2) {
                    str = "";
                } else if (str.length() > 13) {
                    int length2 = str.length();
                    if (length2 <= 24) {
                        i = length2;
                    }
                    str = str.substring(13, i);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                sb4.append(str);
                sb4.append("], but you plan to cancel it. just return");
                Log.m105928w(str4, sb4.toString());
                return remove;
            }
            C58638b bVar2 = this.f167904d;
            boolean z3 = this.f167906f;
            String str5 = this.f167905e;
            if (z3) {
                ((C92755e0) ((C101487r) C86312j.m106911c(cls3)).mo140795W6()).mo126984h(str5, (Object[]) null);
                ((C101213l) C86312j.m106911c(cls2)).Gm0(str5);
            }
            bVar2.getClass();
            return (C54512y) C110818d0.m150916N((LinkedList) bVar2.mo83527i("cancelWaitingTask", new C58657e(bVar2, str5)));
        }
    }

    /* renamed from: eo1.b$e */
    public static final class C58648e extends C87413o implements C32226l<C54512y, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C54512y f167908d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58648e(C54512y yVar) {
            super(1);
            this.f167908d = yVar;
        }

        public Object invoke(Object obj) {
            boolean z;
            C54512y yVar = (C54512y) obj;
            C87412m.m108594g(yVar, LocaleUtil.ITALIAN);
            if (C87412m.m108589b(yVar.f152814l1, this.f167908d.f152814l1)) {
                long j = yVar.f287671r;
                C54512y yVar2 = this.f167908d;
                if (j == yVar2.f287671r && yVar.f287692W0 == yVar2.f287692W0) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: eo1.b$f */
    public static final class C58649f implements C20504h {

        /* renamed from: a */
        public final /* synthetic */ C58638b f167909a;

        /* renamed from: b */
        public final /* synthetic */ C54512y f167910b;

        /* renamed from: c */
        public final /* synthetic */ C55015f1 f167911c;

        /* renamed from: eo1.b$f$a */
        public static final class C58650a extends C87413o implements C32224a<C54512y> {

            /* renamed from: d */
            public final /* synthetic */ C58638b f167912d;

            /* renamed from: e */
            public final /* synthetic */ C54512y f167913e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58650a(C58638b bVar, C54512y yVar) {
                super(0);
                this.f167912d = bVar;
                this.f167913e = yVar;
            }

            public Object invoke() {
                return this.f167912d.f167876e.remove(this.f167913e.f152814l1);
            }
        }

        public C58649f(C58638b bVar, C54512y yVar, C55015f1 f1Var) {
            this.f167909a = bVar;
            this.f167910b = yVar;
            this.f167911c = f1Var;
        }

        /* renamed from: a */
        public void mo32066a(int i, C98127h hVar) {
            String str = this.f167909a.f167881j;
            Log.m105924i(str, "preload task on Start " + this.f167910b.field_mediaId + ' ' + i);
            if (i < 0) {
                C58638b bVar = this.f167909a;
                if (((C54512y) bVar.mo83527i("onPreloadCompleted", new C58650a(bVar, this.f167910b))) != null) {
                    C58638b bVar2 = this.f167909a;
                    C54512y yVar = this.f167910b;
                    for (C54511w d : bVar2.f167880i) {
                        String str2 = yVar.f152814l1;
                        d.mo12832d(str2, "onPreloadCompleted start ret=" + i + " error", yVar);
                    }
                }
            }
            if (i == 0) {
                C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0();
                String str3 = this.f167910b.field_mediaId;
                C87412m.m108593f(str3, "task.field_mediaId");
                C54512y yVar2 = this.f167910b;
                C55015f1 f1Var = this.f167911c;
                Fx0.getClass();
                C87412m.m108594g(f1Var, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
                if (yVar2 == null) {
                    Log.m105928w("FinderNetworkFlowReport", "PRELOAD_startPreload mediaId:" + str3 + " return for result is null  size:" + Fx0.f71360a.size() + " list:");
                    return;
                }
                Fx0.mo52131h(yVar2.f152811i1, str3, yVar2.f152809g1, yVar2, f1Var);
            }
        }
    }

    /* renamed from: eo1.b$g */
    public static final class C58651g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C54512y> f167914d;

        /* renamed from: e */
        public final /* synthetic */ C58638b f167915e;

        /* renamed from: f */
        public final /* synthetic */ List<C54512y> f167916f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<String> f167917g;

        /* renamed from: h */
        public final /* synthetic */ LinkedList<C54512y> f167918h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58651g(LinkedList<C54512y> linkedList, C58638b bVar, List<C54512y> list, LinkedList<String> linkedList2, LinkedList<C54512y> linkedList3) {
            super(0);
            this.f167914d = linkedList;
            this.f167915e = bVar;
            this.f167916f = list;
            this.f167917g = linkedList2;
            this.f167918h = linkedList3;
        }

        public Object invoke() {
            Iterator<C54512y> it = this.f167914d.iterator();
            C87412m.m108593f(it, "preloadList.iterator()");
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                C54512y next = it.next();
                C87412m.m108593f(next, "iterator.next()");
                C54512y yVar = next;
                C54512y yVar2 = this.f167915e.f167876e.get(yVar.f152814l1);
                if (yVar2 != null) {
                    C58638b bVar = this.f167915e;
                    LinkedList<String> linkedList = this.f167917g;
                    bVar.getClass();
                    if (yVar.f287671r == yVar2.f287671r && yVar.f287692W0 == yVar2.f287692W0 && yVar.field_requestVideoFormat == yVar2.field_requestVideoFormat && C87412m.m108589b(yVar.mo75350c(), yVar2.mo75350c())) {
                        z = true;
                    }
                    if (!z) {
                        linkedList.add(yVar2.f152814l1);
                    } else {
                        it.remove();
                    }
                }
            }
            for (Map.Entry next2 : this.f167915e.f167876e.entrySet()) {
                if (!this.f167916f.contains(next2.getValue())) {
                    this.f167917g.add(((C54512y) next2.getValue()).f152814l1);
                }
            }
            LinkedList<String> linkedList2 = this.f167917g;
            C58638b bVar2 = this.f167915e;
            LinkedList<C54512y> linkedList3 = this.f167918h;
            for (String a : linkedList2) {
                C54512y a2 = bVar2.mo83520a(a, false, "mergePreload");
                if (a2 != null) {
                    linkedList3.addFirst(a2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo1.b$h */
    public static final class C58652h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<C54512y> f167919d;

        /* renamed from: e */
        public final /* synthetic */ C58638b f167920e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58652h(LinkedList<C54512y> linkedList, C58638b bVar) {
            super(0);
            this.f167919d = linkedList;
            this.f167920e = bVar;
        }

        public Object invoke() {
            this.f167919d.addAll(this.f167920e.f167876e.values());
            LinkedList<C54512y> linkedList = this.f167919d;
            C58638b bVar = this.f167920e;
            for (C54512y yVar : linkedList) {
                bVar.mo83520a(yVar.f152814l1, true, "onClearAll");
            }
            this.f167919d.addAll(this.f167920e.f167877f);
            this.f167920e.f167876e.clear();
            this.f167920e.f167877f.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo1.b$i */
    public static final class C58653i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58638b f167921d;

        /* renamed from: e */
        public final /* synthetic */ String f167922e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58653i(C58638b bVar, String str) {
            super(0);
            this.f167921d = bVar;
            this.f167922e = str;
        }

        public Object invoke() {
            this.f167921d.f167878g = this.f167922e;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo1.b$j */
    public static final class C58654j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58638b f167923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58654j(C58638b bVar) {
            super(0);
            this.f167923d = bVar;
        }

        public Object invoke() {
            if (!this.f167923d.f167877f.isEmpty()) {
                C58638b bVar = this.f167923d;
                int size = bVar.f167872a.f154551f - bVar.f167876e.size();
                String str = this.f167923d.f167881j;
                Log.m105924i(str, "[pollWaiting] continue to preload next video. count=" + size + " size=" + this.f167923d.f167877f.size());
                C77813z.m93908n(this.f167923d.f167877f);
                for (int i = 0; i < size; i++) {
                    C54512y pollFirst = this.f167923d.f167877f.pollFirst();
                    if (pollFirst != null) {
                        this.f167923d.mo83522c(pollFirst);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C58638b(C55048e eVar, String str) {
        C87412m.m108594g(eVar, "model");
        C87412m.m108594g(str, "sceneTag");
        this.f167872a = eVar;
        this.f167873b = str;
        ConcurrentLinkedQueue<C54511w> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f167880i = concurrentLinkedQueue;
        this.f167881j = "Finder.VideoPreloadWorker_" + this.f167873b + '_' + hashCode();
        concurrentLinkedQueue.add(new C58639a(this));
        this.f167882k = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final C54512y mo83520a(String str, boolean z, String str2) {
        return (C54512y) mo83527i("cancel", new C58647d(this, str, z, str2));
    }

    /* renamed from: b */
    public final C54512y mo83521b(C55048e.C55049b bVar, long j, int i, int i2) {
        C55048e.C55049b bVar2 = bVar;
        boolean z = true;
        int i3 = C87412m.m108589b(bVar2.f154576e, "h265") ? 2 : 1;
        C54512y yVar = new C54512y(C58469b.m67900a(bVar2.f154572a, 0, 0, 0, 0, 0, (String) null, 0, 127, (Object) null), bVar2.f154577f);
        yVar.f152816n1 = i2;
        yVar.f152811i1 = j;
        yVar.f287660d = "task_VideoPreloadWorker";
        yVar.field_mediaId = bVar2.f154577f.mo11841b();
        yVar.f287705p0 = bVar2.f154577f.getUrl() + bVar2.f154577f.getUrlToken();
        yVar.field_fullpath = bVar2.f154577f.getPath();
        yVar.f287700b1 = bVar2.f154577f.getDecodeKey();
        if (bVar2.f154577f.f177253e.f185257U != 1) {
            z = false;
        }
        yVar.f287665i = z;
        yVar.f287654K = 2;
        yVar.f287689V = 2;
        yVar.f287655L = 8;
        int i4 = bVar2.f154573b;
        yVar.f287692W0 = i4;
        yVar.field_preloadRatio = i4;
        yVar.f287696Y0 = C60184m.C60185a.f171718a;
        yVar.f287657N = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154552g;
        yVar.f287662f = new C58644c(this, yVar.f287692W0, bVar2.f154574c, this.f167876e, this.f167880i, bVar2.f154577f);
        yVar.f287656M = new C58640b(this, yVar.f287692W0, SystemClock.uptimeMillis(), this.f167876e, this.f167880i);
        yVar.field_fileType = CdnLogic.kMediaTypeAppVideo;
        yVar.f287671r = bVar2.f154574c;
        yVar.f287698Z0 = 0;
        if (this.f167879h) {
            yVar.field_requestVideoFormat = 0;
            String str = bVar2.f154575d;
            C87412m.m108594g(str, "value");
            yVar.f287699a1 = str;
        } else {
            yVar.field_requestVideoFormat = i3;
        }
        yVar.f287688U0 = String.valueOf(i);
        String str2 = this.f167881j;
        Log.m105924i(str2, "[createPreloadCDNTask] isHot=" + yVar.f287665i + " mediaId=" + bVar2.f154577f.mo11841b() + " feedId:" + C61926c.m72691p(yVar.f152811i1));
        return yVar;
    }

    /* renamed from: c */
    public final int mo83522c(C54512y yVar) {
        Class<C11990s0> cls;
        Class cls2;
        C0898b.C0899a aVar;
        C54512y yVar2 = yVar;
        Class cls3 = C58466h.class;
        Class<C11990s0> cls4 = C11990s0.class;
        Class<C60200t1> cls5 = C60200t1.class;
        this.f167874c.lock();
        try {
            if (this.f167875d) {
                String str = this.f167881j;
                Log.m105924i(str, "[enqueue] VideoPreloadWorker has release. " + yVar2 + " just return.");
                Iterator<C54511w> it = this.f167880i.iterator();
                while (it.hasNext()) {
                    C54511w next = it.next();
                    String str2 = yVar2.f152810h1.f177253e.f185275p;
                    if (str2 == null) {
                        str2 = "";
                    }
                    next.mo12829a(str2, yVar2);
                }
            } else {
                C64689rq2 rq22 = yVar2.f152810h1.f177253e;
                String str3 = this.f167878g;
                String str4 = rq22.f185275p;
                if (str4 == null) {
                    str4 = "";
                }
                if (C112551y.m153808h(str3, str4, false, 2, (Object) null)) {
                    String str5 = this.f167881j;
                    Log.m105924i(str5, "[enqueue] is focused task " + yVar2 + " just return.");
                    Iterator<C54511w> it4 = this.f167880i.iterator();
                    while (it4.hasNext()) {
                        C54511w next2 = it4.next();
                        String str6 = yVar2.f152810h1.f177253e.f185275p;
                        if (str6 == null) {
                            str6 = "";
                        }
                        next2.mo12829a(str6, yVar2);
                    }
                } else {
                    C55015f1 d = C66167g.m78055d(C66167g.f190173a, yVar2.f152814l1, false, 2, (Object) null);
                    Iterator<C54511w> it5 = this.f167880i.iterator();
                    while (it5.hasNext()) {
                        C54511w next3 = it5.next();
                        String str7 = d.field_mediaId;
                        C87412m.m108593f(str7, "cache.field_mediaId");
                        next3.mo12830b(str7, d.mo76072m2(), yVar2.f287692W0, yVar.mo75350c(), yVar2.field_requestVideoFormat == 1 ? "H264" : "H265", yVar);
                    }
                    if (d.mo76073n2()) {
                        if (C86013q1.m106450k(d.mo76071l2())) {
                            String str8 = this.f167881j;
                            Log.m105924i(str8, "[enqueue] " + yVar2 + " has complete file(" + d.mo76072m2() + "%)! just return.");
                            Iterator<C54511w> it6 = this.f167880i.iterator();
                            while (it6.hasNext()) {
                                it6.next().mo12834f(yVar2.f152814l1, d.mo76072m2() >= 100, d.mo76072m2(), yVar, d.field_totalSize);
                            }
                            this.f167874c.unlock();
                            return 1;
                        }
                    }
                    if (d.mo76072m2() < yVar2.f287692W0 || d.field_cacheSize < yVar2.f287671r || !C86013q1.m106450k(d.mo76071l2())) {
                        int size = this.f167876e.size();
                        if (this.f167872a.f154551f > size) {
                            if (!this.f167882k.get()) {
                                yVar2.f152812j1 = C54512y.C54514b.LOADING;
                                C66167g gVar = C66167g.f190173a;
                                String str9 = yVar2.f152814l1;
                                String str10 = yVar2.f152815m1;
                                String url = yVar2.f152810h1.getUrl();
                                int i = yVar2.field_requestVideoFormat;
                                String c = yVar.mo75350c();
                                int i2 = yVar2.f152810h1.f177257i;
                                long j = d.field_cacheSize;
                                long j2 = d.field_totalSize;
                                int i3 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154540F;
                                if (i3 != 0) {
                                    cls2 = cls3;
                                    if (i3 == 1) {
                                        cls = cls4;
                                        aVar = new C0898b.C0899a(false, true, 1);
                                    } else if (i3 == 2) {
                                        cls = cls4;
                                        aVar = new C0898b.C0899a(false, true, 0);
                                    } else if (i3 == 3) {
                                        cls = cls4;
                                        aVar = new C0898b.C0899a(true, true, 1);
                                    } else if (i3 != 4) {
                                        cls = cls4;
                                        aVar = new C0898b.C0899a(false, false, 1);
                                    } else {
                                        cls = cls4;
                                        aVar = new C0898b.C0899a(true, true, 0);
                                    }
                                } else {
                                    cls2 = cls3;
                                    cls = cls4;
                                    aVar = new C0898b.C0899a(true, true, 1);
                                }
                                int i4 = (!aVar.mo786a() || !d.mo76074o2()) ? 1 : 2;
                                C64689rq2 rq23 = yVar2.f152810h1.f177253e;
                                C66167g.m78056h(gVar, str9, str10, url, i, c, i2, j, j2, i4, rq23.f185269g, rq23.f185286y, rq23.f185284x, false, 4096, (Object) null);
                                this.f167876e.put(yVar2.f152814l1, yVar2);
                                C62372x xVar = new C62372x(yVar2.f152810h1.f177253e, C27696y.THUMB_IMAGE, (String) null, 4, (C8480h) null);
                                C39818r rVar = C39818r.f106831a;
                                Class<C11990s0> cls6 = cls;
                                ((C11990s0) rVar.mo62446e(cls5).mo62447c(cls6)).mo11871f2().mo85956b(xVar, ((C11990s0) rVar.mo62446e(cls5).mo62447c(cls6)).mo11867O2(C11978e0.C11979a.TIMELINE)).mo85953c();
                                if (((C58466h) C86312j.m106911c(cls2)).mo31868LF()) {
                                    ((C58466h) C86312j.m106911c(cls2)).Qi0().mo32054b(yVar2, new C58649f(this, yVar2, d));
                                } else {
                                    ((C101213l) C86312j.m106911c(C101213l.class)).R30(yVar2);
                                }
                                String str11 = this.f167881j;
                                Log.m105924i(str11, "[enqueue] begin to preloadVideo... " + yVar2);
                                this.f167874c.unlock();
                                return 1;
                            }
                        }
                        C64175a0.m75512t(this.f167877f, new C58648e(yVar2));
                        this.f167877f.add(yVar2);
                        yVar2.f152812j1 = C54512y.C54514b.WAITING;
                        String str12 = this.f167881j;
                        Log.m105924i(str12, "[enqueue] " + yVar2 + " wait to preLoad, just return. isStop=" + this.f167882k + " preLoadingCount=" + size + " waitingSize=" + this.f167877f.size());
                        this.f167874c.unlock();
                        return 1;
                    }
                    String str13 = this.f167881j;
                    Log.m105924i(str13, "[enqueue] " + yVar2 + " has finish preload(" + d.mo76072m2() + "%)! just return.");
                    Iterator<C54511w> it7 = this.f167880i.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo12834f(yVar2.f152814l1, d.mo76072m2() >= 100, d.mo76072m2(), yVar, d.field_cacheSize);
                    }
                    this.f167874c.unlock();
                    return 1;
                }
            }
            return -1;
        } finally {
            this.f167874c.unlock();
        }
    }

    /* renamed from: d */
    public LinkedList<C54512y> mo78727d(LinkedList<C54512y> linkedList) {
        C87412m.m108594g(linkedList, "preloadList");
        List<T> B0 = C110818d0.m150900B0(linkedList);
        LinkedList linkedList2 = new LinkedList();
        LinkedList<C54512y> linkedList3 = (LinkedList) mo83527i("cancelWaitingTask", new C58657e(this, (String) null));
        mo83527i("mergePreload", new C58651g(linkedList, this, B0, linkedList2, linkedList3));
        if (linkedList.isEmpty()) {
            Log.m105924i(this.f167881j, "[mergePreload] preloadList is empty!");
        } else {
            StringBuilder sb = new StringBuilder("[mergePreload] -> \n");
            for (C54512y append : linkedList3) {
                sb.append("(-) ");
                sb.append(append);
                sb.append("\n");
            }
            Iterator it = ((ArrayList) B0).iterator();
            while (it.hasNext()) {
                C54512y yVar = (C54512y) it.next();
                if (linkedList.contains(yVar)) {
                    sb.append("(+) ");
                    sb.append(yVar);
                    sb.append("\n");
                } else {
                    sb.append("(~) ");
                    sb.append(yVar);
                    sb.append("\n");
                }
            }
            Log.m105924i(this.f167881j, sb.toString());
        }
        return linkedList;
    }

    /* renamed from: e */
    public void mo83523e() {
        LinkedList linkedList = new LinkedList();
        mo83527i("onClearAll", new C58652h(linkedList, this));
        String str = this.f167881j;
        Log.m105924i(str, "[onClearAll] " + linkedList);
    }

    /* renamed from: f */
    public void mo83524f(String str, boolean z) {
        String str2;
        C87412m.m108594g(str, "mediaId");
        String str3 = this.f167881j;
        StringBuilder sb = new StringBuilder();
        sb.append("[onMediaFocus] mediaId=");
        if (str.length() == 0) {
            str2 = "";
        } else if (str.length() <= 13) {
            str2 = str;
        } else {
            int length = str.length();
            if (length > 24) {
                length = 24;
            }
            str2 = str.substring(13, length);
            C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb.append(str2);
        sb.append(" isFocused=");
        sb.append(z);
        Log.m105924i(str3, sb.toString());
        if (z) {
            mo83527i("onMediaFocus", new C58653i(this, str));
            mo83520a(str, true, "onMediaFocus");
            mo83525g();
            return;
        }
        this.f167878g = "";
    }

    /* renamed from: g */
    public final void mo83525g() {
        mo83527i("pollWaiting", new C58654j(this));
    }

    /* JADX WARNING: type inference failed for: r42v0, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x01b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01b1  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedList<bo1.C54512y> mo83526h(e03.C58469b r55, com.tencent.p014mm.plugin.finder.storage.FeedData r56, java.util.List<rx3.C13604l<cm1.C0740i2, java.util.List<te3.C64689rq2>>> r57, int r58) {
        /*
            r54 = this;
            r6 = r54
            r5 = r55
            r4 = r57
            r2 = r58
            java.lang.String r0 = "taskContext"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "centerFeed"
            r1 = r56
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "dataList"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = r6.f167881j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "[preload] taskContext="
            r3.append(r7)
            r3.append(r5)
            java.lang.String r7 = " prevCount="
            r3.append(r7)
            co1.e r7 = r6.f167872a
            int r7 = r7.f154547b
            r3.append(r7)
            java.lang.String r7 = " nextCount="
            r3.append(r7)
            co1.e r7 = r6.f167872a
            int r7 = r7.f154548c
            r3.append(r7)
            java.lang.String r7 = " maxPreloadTaskCount="
            r3.append(r7)
            co1.e r7 = r6.f167872a
            int r7 = r7.f154551f
            r3.append(r7)
            java.lang.String r7 = " list="
            r3.append(r7)
            int r7 = r57.size()
            r3.append(r7)
            java.lang.String r7 = " center="
            r3.append(r7)
            long r7 = r56.getId()
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            r3.append(r7)
            java.lang.String r7 = " source="
            r3.append(r7)
            r3.append(r2)
            java.lang.String r7 = " isLongVideo="
            r3.append(r7)
            boolean r7 = r56.isLongVideo()
            r3.append(r7)
            java.lang.String r7 = " megaVideoPrevCnt="
            r3.append(r7)
            co1.e r7 = r6.f167872a
            int r7 = r7.f154559n
            r3.append(r7)
            java.lang.String r7 = " megaVideoNextCnt="
            r3.append(r7)
            co1.e r7 = r6.f167872a
            int r7 = r7.f154560o
            r3.append(r7)
            java.lang.String r7 = " stack:"
            r3.append(r7)
            com.tencent.mm.sdk.platformtools.MMStack r7 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Iterator r0 = r57.iterator()
            r15 = 0
            r7 = 0
        L_0x00b3:
            boolean r8 = r0.hasNext()
            r12 = 1
            if (r8 == 0) goto L_0x00db
            java.lang.Object r8 = r0.next()
            rx3.l r8 = (rx3.C13604l) r8
            A r8 = r8.f38555d
            cm1.i2 r8 = (cm1.C0740i2) r8
            long r8 = r8.getItemId()
            long r10 = r56.getId()
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x00d2
            r8 = 1
            goto L_0x00d3
        L_0x00d2:
            r8 = 0
        L_0x00d3:
            if (r8 == 0) goto L_0x00d8
            r18 = r7
            goto L_0x00dd
        L_0x00d8:
            int r7 = r7 + 1
            goto L_0x00b3
        L_0x00db:
            r18 = -1
        L_0x00dd:
            if (r18 < 0) goto L_0x061b
            boolean r0 = r56.isLongVideo()
            if (r0 == 0) goto L_0x00ea
            co1.e r0 = r6.f167872a
            int r0 = r0.f154559n
            goto L_0x00ee
        L_0x00ea:
            co1.e r0 = r6.f167872a
            int r0 = r0.f154547b
        L_0x00ee:
            boolean r1 = r56.isLongVideo()
            if (r1 == 0) goto L_0x00f9
            co1.e r1 = r6.f167872a
            int r1 = r1.f154560o
            goto L_0x00fd
        L_0x00f9:
            co1.e r1 = r6.f167872a
            int r1 = r1.f154548c
        L_0x00fd:
            int r0 = r18 - r0
            int r0 = java.lang.Math.max(r0, r15)
            int r1 = r18 + r1
            int r1 = r1 + r12
            int r7 = r57.size()
            int r1 = java.lang.Math.min(r1, r7)
            java.util.List r7 = r4.subList(r0, r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x011b:
            boolean r9 = r7.hasNext()
            r13 = 0
            if (r9 == 0) goto L_0x01b7
            java.lang.Object r9 = r7.next()
            r10 = r9
            rx3.l r10 = (rx3.C13604l) r10
            A r11 = r10.f38555d
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x0133
            r12 = r11
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r12
            goto L_0x0134
        L_0x0133:
            r12 = r13
        L_0x0134:
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
            if (r12 == 0) goto L_0x016f
            gy3.C87412m.m108592e(r11, r14)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            boolean r11 = r11.isUrlValid()
            if (r11 != 0) goto L_0x016f
            java.lang.String r11 = r6.f167881j
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "buildPreloadList feed url is not valid, feedId:"
            r12.append(r13)
            A r10 = r10.f38555d
            gy3.C87412m.m108592e(r10, r14)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
            long r13 = r10.field_id
            java.lang.String r10 = o40.C61926c.m72691p(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r10)
            goto L_0x01ac
        L_0x016f:
            A r11 = r10.f38555d
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x0178
            r13 = r11
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
        L_0x0178:
            if (r13 == 0) goto L_0x01ae
            gy3.C87412m.m108592e(r11, r14)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            boolean r11 = r11.mo3525y()
            if (r11 != 0) goto L_0x01ae
            java.lang.String r11 = r6.f167881j
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "buildPreloadList feed not needToPreload feedId:"
            r12.append(r13)
            A r10 = r10.f38555d
            gy3.C87412m.m108592e(r10, r14)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.mo3513o()
            long r13 = r10.field_id
            java.lang.String r10 = o40.C61926c.m72691p(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r10)
        L_0x01ac:
            r10 = 0
            goto L_0x01af
        L_0x01ae:
            r10 = 1
        L_0x01af:
            if (r10 == 0) goto L_0x01b4
            r8.add(r9)
        L_0x01b4:
            r12 = 1
            goto L_0x011b
        L_0x01b7:
            java.util.Iterator r19 = r8.iterator()
            r14 = 0
        L_0x01bc:
            boolean r7 = r19.hasNext()
            if (r7 == 0) goto L_0x061b
            java.lang.Object r7 = r19.next()
            int r20 = r14 + 1
            if (r14 < 0) goto L_0x0615
            r12 = r7
            rx3.l r12 = (rx3.C13604l) r12
            B r7 = r12.f38556e
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r21 = r7.iterator()
        L_0x01d5:
            boolean r7 = r21.hasNext()
            if (r7 == 0) goto L_0x0609
            java.lang.Object r7 = r21.next()
            r11 = r7
            te3.rq2 r11 = (te3.C64689rq2) r11
            int r7 = r11.f185268f
            r8 = 4
            if (r7 != r8) goto L_0x05ea
            java.lang.String r7 = r6.f167878g
            java.lang.String r9 = r11.f185275p
            java.lang.String r31 = ""
            if (r9 != 0) goto L_0x01f1
            r9 = r31
        L_0x01f1:
            r10 = 2
            boolean r7 = z04.C112551y.m153808h(r7, r9, r15, r10, r13)
            if (r7 != 0) goto L_0x05ea
            int r7 = r18 - r0
            if (r14 >= r7) goto L_0x0200
            int r7 = r0 - r18
            int r7 = r7 + r14
            goto L_0x0203
        L_0x0200:
            int r7 = r1 - r0
            int r7 = r7 - r14
        L_0x0203:
            r9 = r7
            A r7 = r12.f38555d
            cm1.i2 r7 = (cm1.C0740i2) r7
            java.util.Iterator r22 = r57.iterator()
            r23 = 0
        L_0x020e:
            boolean r24 = r22.hasNext()
            if (r24 == 0) goto L_0x0238
            java.lang.Object r24 = r22.next()
            r10 = r24
            rx3.l r10 = (rx3.C13604l) r10
            long r24 = r7.getItemId()
            A r10 = r10.f38555d
            cm1.i2 r10 = (cm1.C0740i2) r10
            long r26 = r10.getItemId()
            int r10 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r10 != 0) goto L_0x022e
            r10 = 1
            goto L_0x022f
        L_0x022e:
            r10 = 0
        L_0x022f:
            if (r10 == 0) goto L_0x0234
            r10 = r23
            goto L_0x0239
        L_0x0234:
            int r23 = r23 + 1
            r10 = 2
            goto L_0x020e
        L_0x0238:
            r10 = -1
        L_0x0239:
            java.lang.String r13 = "feed"
            gy3.C87412m.m108594g(r7, r13)
            boolean r13 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r13 == 0) goto L_0x0258
            r13 = r7
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r13 = r13.objectDesc
            if (r13 == 0) goto L_0x0255
            java.lang.String r13 = r13.description
            if (r13 != 0) goto L_0x025b
        L_0x0255:
            r13 = r31
            goto L_0x025b
        L_0x0258:
            java.lang.String r13 = "unknowntype"
        L_0x025b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r8 = "PREL"
            r15.append(r8)
            r8 = 46
            r15.append(r8)
            r15.append(r10)
            r15.append(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r13)
            if (r8 == 0) goto L_0x027c
            r32 = r0
            r0 = r31
            r8 = 0
            goto L_0x0292
        L_0x027c:
            int r8 = r13.length()
            r32 = r0
            r0 = 4
            int r0 = java.lang.Math.min(r0, r8)
            r8 = 0
            java.lang.String r0 = r13.substring(r8, r0)
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r0, r13)
        L_0x0292:
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            co1.e r15 = r6.f167872a
            r13 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = r9
            r27 = r10
            long r9 = r11.f185238E
            r28 = 0
            r29 = 79
            r30 = 0
            r33 = r7
            r7 = r55
            r34 = 0
            r8 = r13
            r35 = r9
            r13 = r26
            r9 = r23
            r37 = r27
            r38 = 2
            r10 = r24
            r39 = r11
            r11 = r25
            r40 = r12
            r41 = r13
            r42 = 0
            r12 = r35
            r35 = r14
            r14 = r0
            r56 = r15
            r0 = 0
            r15 = r28
            r16 = r29
            r17 = r30
            e03.b r7 = e03.C58469b.m67900a(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17)
            long r23 = r33.getItemId()
            r56.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            r11 = r39
            java.lang.String r12 = r11.f185275p
            if (r12 != 0) goto L_0x02f5
            r12 = r31
        L_0x02f5:
            r26 = 1
            int r13 = r7.f167447c
            r22 = r56
            r25 = r11
            r27 = r13
            rx3.o r13 = r22.mo76106c(r23, r25, r26, r27)
            A r14 = r13.f38557d
            te3.yb1 r14 = (te3.C64850yb1) r14
            java.lang.String r15 = r14.f186469g
            java.lang.String r0 = "h266"
            r6 = 1
            boolean r0 = z04.C112551y.m153809i(r15, r0, r6)
            if (r0 == 0) goto L_0x0315
            r26 = 3
            goto L_0x0324
        L_0x0315:
            java.lang.String r0 = r14.f186469g
            java.lang.String r15 = "h265"
            boolean r0 = z04.C112551y.m153809i(r0, r15, r6)
            if (r0 == 0) goto L_0x0322
            r26 = 2
            goto L_0x0324
        L_0x0322:
            r26 = 1
        L_0x0324:
            pl1.r0 r0 = new pl1.r0
            co1.e$a r15 = co1.C55048e.f154532L
            java.lang.String r6 = r14.f186466d
            up1.y r24 = r15.mo53892a(r6)
            java.lang.String r6 = r14.f186466d
            int r15 = r14.f186470h
            r53 = 0
            r29 = 32
            r30 = 0
            r28 = 0
            r22 = r0
            r23 = r11
            r25 = r6
            r27 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            co1.e$b r6 = new co1.e$b
            r44 = 0
            r45 = 3
            r46 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 125(0x7d, float:1.75E-43)
            r43 = r7
            e03.b r44 = e03.C58469b.m67900a(r43, r44, r45, r46, r47, r48, r50, r51, r52, r53)
            r45 = 1
            int r15 = r14.f186467e
            if (r15 <= 0) goto L_0x036b
            r17 = r3
            long r3 = (long) r15
            r46 = r3
            r3 = r56
            goto L_0x0373
        L_0x036b:
            r17 = r3
            r3 = r56
            long r4 = r3.f154550e
            r46 = r4
        L_0x0373:
            java.lang.String r4 = r14.f186466d
            if (r4 != 0) goto L_0x037a
            r48 = r31
            goto L_0x037c
        L_0x037a:
            r48 = r4
        L_0x037c:
            java.lang.String r4 = r14.f186469g
            if (r4 != 0) goto L_0x0383
            r49 = r31
            goto L_0x0385
        L_0x0383:
            r49 = r4
        L_0x0385:
            r51 = 0
            r52 = 64
            r53 = 0
            r43 = r6
            r50 = r0
            r43.<init>(r44, r45, r46, r48, r49, r50, r51, r52, r53)
            r10.add(r6)
            int r4 = r3.f154549d
            java.lang.String r5 = "Finder.MediaPreloadModel"
            if (r4 <= 0) goto L_0x04b6
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r4) goto L_0x04b6
            int r4 = r7.f167451g
            if (r4 != 0) goto L_0x04b6
            int r4 = r11.f185277q
            r6 = 3
            if (r4 != r6) goto L_0x03b5
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.yv2> r4 = r3.f154562q
            java.lang.Object r4 = r4.get(r12)
            te3.yv2 r4 = (te3.C52175yv2) r4
            if (r4 == 0) goto L_0x03c2
            float r4 = r4.f145537e
            goto L_0x03c3
        L_0x03b5:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.yh1> r4 = r3.f154561p
            java.lang.Object r4 = r4.get(r12)
            te3.yh1 r4 = (te3.C52117yh1) r4
            if (r4 == 0) goto L_0x03c2
            float r4 = r4.f145302e
            goto L_0x03c3
        L_0x03c2:
            r4 = 0
        L_0x03c3:
            int r6 = r3.f154571z
            r15 = -1
            if (r6 == r15) goto L_0x03e5
            if (r6 == 0) goto L_0x03e0
            r22 = r1
            long r1 = r11.f185238E
            r23 = 0
            int r25 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r25 != 0) goto L_0x03d7
            int r1 = r3.f154549d
            goto L_0x03e9
        L_0x03d7:
            r23 = 1120403456(0x42c80000, float:100.0)
            float r6 = (float) r6
            float r6 = r6 * r23
            float r1 = (float) r1
            float r1 = r6 / r1
            goto L_0x03ee
        L_0x03e0:
            r22 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ee
        L_0x03e5:
            r22 = r1
            int r1 = r3.f154549d
        L_0x03e9:
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
        L_0x03ee:
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 == 0) goto L_0x041c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "queryPreloadDetail invalid preloadPercent:"
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = " fix to "
            r2.append(r1)
            int r1 = r3.f154549d
            float r1 = (float) r1
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r6
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            int r1 = r3.f154549d
            float r1 = (float) r1
            float r1 = r1 * r6
        L_0x041c:
            boolean r2 = java.lang.Float.isNaN(r4)
            if (r2 == 0) goto L_0x043d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "queryPreloadDetail invalid interestFactor:"
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = ", fix to 0.5"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x043d:
            float r1 = r1 * r4
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r2, r1)
            int r1 = iy3.C60641c.m70921b(r1)
            r2 = 100
            int r1 = java.lang.Math.min(r2, r1)
            int r2 = r11.f185277q
            r4 = 3
            if (r2 != r4) goto L_0x045d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.yv2> r2 = r3.f154562q
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0467
            goto L_0x0465
        L_0x045d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.yh1> r2 = r3.f154561p
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0467
        L_0x0465:
            r2 = 1
            goto L_0x0468
        L_0x0467:
            r2 = 0
        L_0x0468:
            if (r2 == 0) goto L_0x04b2
            r6 = 1
            r3.f154566u = r6
            co1.e$b r2 = new co1.e$b
            r44 = 0
            r45 = 4
            r46 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 125(0x7d, float:1.75E-43)
            r53 = 0
            r43 = r7
            e03.b r44 = e03.C58469b.m67900a(r43, r44, r45, r46, r47, r48, r50, r51, r52, r53)
            r56 = r7
            long r6 = r3.f154550e
            java.lang.String r4 = r14.f186466d
            if (r4 != 0) goto L_0x0492
            r48 = r31
            goto L_0x0494
        L_0x0492:
            r48 = r4
        L_0x0494:
            java.lang.String r4 = r14.f186469g
            if (r4 != 0) goto L_0x049b
            r49 = r31
            goto L_0x049d
        L_0x049b:
            r49 = r4
        L_0x049d:
            r51 = 0
            r52 = 64
            r53 = 0
            r43 = r2
            r45 = r1
            r46 = r6
            r50 = r0
            r43.<init>(r44, r45, r46, r48, r49, r50, r51, r52, r53)
            r10.add(r2)
            goto L_0x04b4
        L_0x04b2:
            r56 = r7
        L_0x04b4:
            r1 = 0
            goto L_0x04be
        L_0x04b6:
            r22 = r1
            r56 = r7
            r15 = -1
            r1 = 0
            r3.f154566u = r1
        L_0x04be:
            sg.i<java.lang.String, rx3.o<te3.yb1, java.lang.String, java.lang.Long>> r2 = r3.f154563r
            java.lang.String r0 = r0.mo11841b()
            r2.put(r0, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[queryPreloadDetail] Cost="
            r0.append(r2)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r8
            r0.append(r6)
            java.lang.String r2 = " source = "
            r0.append(r2)
            r2 = r58
            r0.append(r2)
            java.lang.String r4 = ", taskContext="
            r0.append(r4)
            r4 = r56
            r0.append(r4)
            java.lang.String r4 = ", isSecondPreload="
            r0.append(r4)
            boolean r4 = r3.f154566u
            r0.append(r4)
            java.lang.String r4 = " mid="
            r0.append(r4)
            r0.append(r12)
            java.lang.String r4 = " stage=["
            r0.append(r4)
            B r4 = r13.f38558e
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            r4 = 58
            r0.append(r4)
            int r4 = r10.size()
            r0.append(r4)
            java.lang.String r4 = "] target"
            r0.append(r4)
            java.lang.String r4 = co1.C55051g.m62153b(r14)
            r0.append(r4)
            java.lang.String r4 = " details="
            r0.append(r4)
            r0.append(r10)
            java.lang.String r4 = ", allSpec="
            r0.append(r4)
            java.util.LinkedList<te3.yb1> r4 = r11.f185282v
            java.lang.String r6 = "media.spec"
            gy3.C87412m.m108593f(r4, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r4, r7)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x0546:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x055f
            java.lang.Object r7 = r4.next()
            te3.yb1 r7 = (te3.C64850yb1) r7
            java.lang.String r8 = "it"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r7 = co1.C55051g.m62153b(r7)
            r6.add(r7)
            goto L_0x0546
        L_0x055f:
            r0.append(r6)
            java.lang.String r4 = " maxBitrate:"
            r0.append(r4)
            long r3 = r3.f154556k
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.util.Iterator r6 = r10.iterator()
            r0 = 0
        L_0x0578:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x05e0
            java.lang.Object r3 = r6.next()
            int r7 = r0 + 1
            if (r0 < 0) goto L_0x05dc
            co1.e$b r3 = (co1.C55048e.C55049b) r3
            if (r0 != 0) goto L_0x05ae
            long r4 = r33.getItemId()
            r8 = r55
            int r9 = r8.f167447c
            r10 = r32
            r11 = 0
            r0 = r54
            r12 = r22
            r1 = r3
            r13 = r17
            r2 = r4
            r4 = r9
            r5 = r37
            bo1.y r0 = r0.mo83521b(r1, r2, r4, r5)
            r9 = r41
            int r1 = r9 + 1000
            r0.f152813k1 = r1
            r13.add(r0)
            goto L_0x05cf
        L_0x05ae:
            r8 = r55
            r13 = r17
            r12 = r22
            r10 = r32
            r9 = r41
            r11 = 0
            long r4 = r33.getItemId()
            int r14 = r8.f167447c
            r0 = r54
            r1 = r3
            r2 = r4
            r4 = r14
            r5 = r37
            bo1.y r0 = r0.mo83521b(r1, r2, r4, r5)
            r0.f152813k1 = r9
            r13.add(r0)
        L_0x05cf:
            r2 = r58
            r0 = r7
            r41 = r9
            r32 = r10
            r22 = r12
            r17 = r13
            r1 = 0
            goto L_0x0578
        L_0x05dc:
            sx3.C64197v.m75542k()
            throw r42
        L_0x05e0:
            r8 = r55
            r13 = r17
            r12 = r22
            r10 = r32
            r11 = 0
            goto L_0x05f6
        L_0x05ea:
            r10 = r0
            r8 = r5
            r40 = r12
            r42 = r13
            r35 = r14
            r11 = 0
            r15 = -1
            r12 = r1
            r13 = r3
        L_0x05f6:
            r6 = r54
            r4 = r57
            r2 = r58
            r5 = r8
            r0 = r10
            r1 = r12
            r3 = r13
            r14 = r35
            r12 = r40
            r13 = r42
            r15 = 0
            goto L_0x01d5
        L_0x0609:
            r11 = 0
            r15 = 0
            r6 = r54
            r4 = r57
            r2 = r58
            r14 = r20
            goto L_0x01bc
        L_0x0615:
            r42 = r13
            sx3.C64197v.m75542k()
            throw r42
        L_0x061b:
            r13 = r3
            sx3.C77813z.m93908n(r13)
            r0 = r54
            java.util.LinkedList r1 = r0.mo78727d(r13)
            java.util.Iterator r2 = r1.iterator()
        L_0x0629:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0639
            java.lang.Object r3 = r2.next()
            bo1.y r3 = (bo1.C54512y) r3
            r0.mo83522c(r3)
            goto L_0x0629
        L_0x0639:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eo1.C58638b.mo83526h(e03.b, com.tencent.mm.plugin.finder.storage.FeedData, java.util.List, int):java.util.LinkedList");
    }

    /* renamed from: i */
    public final <T> T mo83527i(String str, C32224a<? extends T> aVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f167874c.lock();
        try {
            return aVar.invoke();
        } finally {
            this.f167874c.unlock();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 > 100) {
                String str2 = this.f167881j;
                Log.m105928w(str2, "[syncLock] tag=" + str + " so slow! cost=" + uptimeMillis2 + LocaleUtil.MALAY);
            }
        }
    }
}
