package pl1;

import cm1.C55015f1;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32224a;
import gr1.C59679v2;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicBoolean;
import o40.C61925b;
import o40.C61926c;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p682rz.C101487r;
import p682rz.C63688n;
import p910lj.C76701a;
import rx3.C13598b0;
import uf0.C65339f;
import vd3.C102171c0;
import wp1.C66167g;

/* renamed from: pl1.p0 */
public final class C62352p0 implements C62370v0 {

    /* renamed from: c */
    public static final C62360b f177207c = new C62360b((C8480h) null);

    /* renamed from: a */
    public final MediaPreloadCore f177208a;

    /* renamed from: b */
    public final int f177209b;

    /* renamed from: pl1.p0$a */
    public final class C62353a implements C98127h.C98128a {

        /* renamed from: d */
        public final C59679v2 f177210d;

        /* renamed from: e */
        public final C55394a.C55395a f177211e;

        /* renamed from: f */
        public final C62367r0 f177212f;

        /* renamed from: g */
        public final AtomicBoolean f177213g;

        /* renamed from: h */
        public final Object f177214h;

        /* renamed from: i */
        public final /* synthetic */ C62352p0 f177215i;

        /* renamed from: pl1.p0$a$a */
        public static final class C62354a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62353a f177216d;

            /* renamed from: e */
            public final /* synthetic */ String f177217e;

            /* renamed from: f */
            public final /* synthetic */ long f177218f;

            /* renamed from: g */
            public final /* synthetic */ long f177219g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62354a(C62353a aVar, String str, long j, long j2) {
                super(0);
                this.f177216d = aVar;
                this.f177217e = str;
                this.f177218f = j;
                this.f177219g = j2;
            }

            public Object invoke() {
                C55394a.C55395a aVar = this.f177216d.f177211e;
                if (aVar != null) {
                    aVar.onDataAvailable(this.f177217e, this.f177218f, this.f177219g);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: pl1.p0$a$b */
        public static final class C62355b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C62355b f177220d = new C62355b();

            public C62355b() {
                super(0);
            }

            public Object invoke() {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "[checkFinishValid] error!!!", 0).show();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: pl1.p0$a$c */
        public static final class C62356c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62353a f177221d;

            /* renamed from: e */
            public final /* synthetic */ String f177222e;

            /* renamed from: f */
            public final /* synthetic */ int f177223f;

            /* renamed from: g */
            public final /* synthetic */ C98121d f177224g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62356c(C62353a aVar, String str, int i, C98121d dVar) {
                super(0);
                this.f177221d = aVar;
                this.f177222e = str;
                this.f177223f = i;
                this.f177224g = dVar;
            }

            public Object invoke() {
                C55394a.C55395a aVar = this.f177221d.f177211e;
                if (aVar != null) {
                    aVar.mo76640m(this.f177222e, this.f177223f);
                }
                C62353a aVar2 = this.f177221d;
                C59679v2 v2Var = aVar2.f177210d;
                if (v2Var != null) {
                    v2Var.mo78328l(this.f177223f, aVar2.f177212f, this.f177224g);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: pl1.p0$a$d */
        public static final class C62357d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62353a f177225d;

            /* renamed from: e */
            public final /* synthetic */ String f177226e;

            /* renamed from: f */
            public final /* synthetic */ int f177227f;

            /* renamed from: g */
            public final /* synthetic */ C98121d f177228g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62357d(C62353a aVar, String str, int i, C98121d dVar) {
                super(0);
                this.f177225d = aVar;
                this.f177226e = str;
                this.f177227f = i;
                this.f177228g = dVar;
            }

            public Object invoke() {
                C55394a.C55395a aVar = this.f177225d.f177211e;
                if (aVar != null) {
                    aVar.mo76640m(this.f177226e, this.f177227f);
                }
                C62353a aVar2 = this.f177225d;
                C59679v2 v2Var = aVar2.f177210d;
                if (v2Var != null) {
                    v2Var.mo78328l(this.f177227f, aVar2.f177212f, this.f177228g);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: pl1.p0$a$e */
        public static final class C62358e extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62353a f177229d;

            /* renamed from: e */
            public final /* synthetic */ String f177230e;

            /* renamed from: f */
            public final /* synthetic */ long f177231f;

            /* renamed from: g */
            public final /* synthetic */ long f177232g;

            /* renamed from: h */
            public final /* synthetic */ C8477a0 f177233h;

            /* renamed from: i */
            public final /* synthetic */ boolean f177234i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62358e(C62353a aVar, String str, long j, long j2, C8477a0 a0Var, boolean z) {
                super(0);
                this.f177229d = aVar;
                this.f177230e = str;
                this.f177231f = j;
                this.f177232g = j2;
                this.f177233h = a0Var;
                this.f177234i = z;
            }

            public Object invoke() {
                if (!this.f177229d.f177213g.get()) {
                    C61925b bVar = new C61925b("onMoovReady");
                    C55394a.C55395a aVar = this.f177229d.f177211e;
                    if (aVar instanceof FinderVideoView) {
                        FinderVideoView finderVideoView = (FinderVideoView) aVar;
                        long j = this.f177231f;
                        boolean z = this.f177233h.f27482d;
                        Log.m105925i(finderVideoView.f283586e, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s isPreparedMoovReadyResult:%s", finderVideoView.mo76634K(), Long.valueOf(j), Integer.valueOf(finderVideoView.f267488S0), finderVideoView.f267494W, Boolean.valueOf(z));
                        if (finderVideoView.f267488S0 != 0) {
                            Log.m105928w(finderVideoView.f283586e, "moov had callback, do nothing.");
                        } else {
                            C102171c0 c0Var = finderVideoView.f283584N;
                            if (c0Var.f300847m == 0) {
                                c0Var.f300847m = Util.nowMilliSecond();
                            }
                            try {
                                C65339f fVar = finderVideoView.f267487R0;
                                if (fVar == null) {
                                    Log.m105929w(finderVideoView.f283586e, "%s parser is null, thread is error.", finderVideoView.mo76634K());
                                } else {
                                    if (!z) {
                                        if (!fVar.mo89446a(finderVideoView.f267504p0, j)) {
                                            Log.m105929w(finderVideoView.f283586e, "%s mp4 parse moov error. cdnMediaId %s", finderVideoView.mo76634K(), finderVideoView.f267494W);
                                            finderVideoView.f267492V.mo36230d(finderVideoView.f267494W, 0, -1);
                                        }
                                    }
                                    finderVideoView.f267488S0 = finderVideoView.f267487R0.mo89447b();
                                    Log.m105925i(finderVideoView.f283586e, "%s mp4 parse moov success. duration %d cdnMediaId %s ", finderVideoView.mo76634K(), Integer.valueOf(finderVideoView.f267488S0), finderVideoView.f267494W);
                                    if (finderVideoView.mo127232a0(0)) {
                                        finderVideoView.mo127234f0();
                                    }
                                    finderVideoView.f267486Q0 = finderVideoView.f267489T0 == -1 ? 1 : 2;
                                }
                            } catch (Exception e) {
                                Log.printErrStackTrace(finderVideoView.f283586e, e, "%s deal moov ready error [%s]", finderVideoView.mo76634K(), finderVideoView.f267494W);
                            }
                        }
                    }
                    C62353a aVar2 = this.f177229d;
                    C59679v2 v2Var = aVar2.f177210d;
                    if (v2Var != null) {
                        v2Var.mo78327j((int) this.f177231f, (int) this.f177232g, aVar2.f177212f, this.f177234i);
                    }
                    Log.m105924i("Finder.VideoDownloader", "onMoovReady man " + bVar + " mediaId: " + this.f177230e);
                } else {
                    Log.m105928w("Finder.VideoDownloader", "has stop!");
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: pl1.p0$a$f */
        public static final class C62359f extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62353a f177235d;

            /* renamed from: e */
            public final /* synthetic */ String f177236e;

            /* renamed from: f */
            public final /* synthetic */ long f177237f;

            /* renamed from: g */
            public final /* synthetic */ long f177238g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62359f(C62353a aVar, String str, long j, long j2) {
                super(0);
                this.f177235d = aVar;
                this.f177236e = str;
                this.f177237f = j;
                this.f177238g = j2;
            }

            public Object invoke() {
                C55394a.C55395a aVar = this.f177235d.f177211e;
                if (aVar != null) {
                    aVar.mo76638e(this.f177236e, this.f177237f, this.f177238g);
                }
                C62353a aVar2 = this.f177235d;
                C59679v2 v2Var = aVar2.f177210d;
                if (v2Var != null) {
                    v2Var.mo78310e((int) this.f177237f, (int) this.f177238g, aVar2.f177212f);
                }
                return C13598b0.f38549a;
            }
        }

        public C62353a(C62352p0 p0Var, C59679v2 v2Var, C55394a.C55395a aVar, C62367r0 r0Var, AtomicBoolean atomicBoolean, Object obj) {
            C87412m.m108594g(r0Var, "video");
            C87412m.m108594g(atomicBoolean, "isStopped");
            C87412m.m108594g(obj, "lock");
            this.f177215i = p0Var;
            this.f177210d = v2Var;
            this.f177211e = aVar;
            this.f177212f = r0Var;
            this.f177213g = atomicBoolean;
            this.f177214h = obj;
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            String str2 = str;
            C87412m.m108594g(str2, "mediaId");
            Object obj = this.f177214h;
            C62352p0 p0Var = this.f177215i;
            synchronized (obj) {
                if (!this.f177213g.get()) {
                    Log.m105924i("Finder.VideoDownloader", "[onProgress] mediaId=" + str2 + " offset=" + j + " total=" + j2);
                    C66167g.f190173a.mo90241l(str, j, j2, 1);
                    p0Var.mo87416b(new C62359f(this, str, j, j2));
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            C13598b0 b0Var;
            C87412m.m108594g(str, "mediaId");
            Object obj = this.f177214h;
            C62352p0 p0Var = this.f177215i;
            synchronized (obj) {
                if (!this.f177213g.get()) {
                    if (dVar != null) {
                        Log.m105924i("Finder.VideoDownloader", "[onFinish] mediaId=" + str + " ret=" + i + " fileLength=" + dVar.field_fileLength + " sceneResult=" + dVar.field_retCode + " videoFormat:" + dVar.field_videoFormat + " videoFlag=" + dVar.field_videoFlag);
                        if (!C62352p0.f177207c.mo87417a(str) && (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG)) {
                            C61926c.m72668M(C62355b.f177220d);
                        }
                        C66167g gVar = C66167g.f190173a;
                        String str2 = dVar.f287621m;
                        C87412m.m108593f(str2, "sceneResult.profile");
                        gVar.mo90240k(str, str2);
                        long j = dVar.field_fileLength;
                        gVar.mo90241l(str, j, j, 3);
                        p0Var.mo87416b(new C62356c(this, str, i, dVar));
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        Log.m105920e("Finder.VideoDownloader", "sceneResult is null! mediaId=" + str + " ret=" + i);
                        p0Var.mo87416b(new C62357d(this, str, i, dVar));
                    }
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }

        public void onDataAvailable(String str, long j, long j2) {
            C87412m.m108594g(str, "mediaId");
            Object obj = this.f177214h;
            C62352p0 p0Var = this.f177215i;
            synchronized (obj) {
                if (!this.f177213g.get()) {
                    p0Var.mo87416b(new C62354a(this, str, j, j2));
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            Log.m105924i("Finder.VideoDownloader", "[onDataAvailable] mediaId=" + str + " offset=" + j + " total=" + j2);
        }

        public void onM3U8Ready(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            boolean z;
            String str2 = str;
            long j3 = j;
            CdnLogic.VideoInfo videoInfo2 = videoInfo;
            C87412m.m108594g(str2, "mediaId");
            C87412m.m108594g(videoInfo2, "info");
            Object obj = this.f177214h;
            C62352p0 p0Var = this.f177215i;
            synchronized (obj) {
                Log.m105924i("Finder.VideoDownloader", "[onMoovReady] mediaId=" + str2 + " offset=" + j3 + " total=" + j2 + " fileFormat=[" + this.f177212f.mo87422g() + "=>" + videoInfo2.svrFlag + "]} isHasStop=" + this.f177213g.get());
                if (!this.f177213g.get()) {
                    C8477a0 a0Var = new C8477a0();
                    C55394a.C55395a aVar = this.f177211e;
                    boolean z2 = true;
                    if (aVar instanceof FinderVideoView) {
                        FinderVideoView finderVideoView = (FinderVideoView) aVar;
                        C65339f fVar = finderVideoView.f267487R0;
                        if (fVar == null) {
                            Log.m105929w(finderVideoView.f283586e, "%s parser is null, thread is error.", finderVideoView.mo76634K());
                            z = false;
                        } else {
                            z = fVar.mo89446a(finderVideoView.f267504p0, j3);
                        }
                        a0Var.f27482d = z;
                    }
                    C66167g gVar = C66167g.f190173a;
                    if (gVar.mo90234c(str2, false).field_moovReady) {
                        z2 = false;
                    }
                    String str3 = videoInfo2.svrFlag;
                    if (str3 == null) {
                        str3 = "";
                    }
                    gVar.mo90239j(str2, str3);
                    p0Var.mo87416b(new C62358e(this, str, j, j2, a0Var, z2));
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: pl1.p0$b */
    public static final class C62360b {
        public C62360b(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo87417a(String str) {
            C87412m.m108594g(str, "mediaId");
            long[] jArr = new long[3];
            CdnLogic.queryDownloadedSize(str, jArr);
            long j = jArr[0];
            long j2 = jArr[1];
            if (j == j2 && j2 == jArr[2]) {
                return true;
            }
            Log.m105920e("Finder.VideoDownloader", "[checkFinishValid] mediaId=" + str + ' ' + jArr[0] + XVFSFile.PATH_SEPARATOR_CHAR + jArr[1] + XVFSFile.PATH_SEPARATOR_CHAR + jArr[2]);
            return false;
        }
    }

    /* renamed from: pl1.p0$c */
    public final class C62361c implements C55394a {

        /* renamed from: d */
        public final C62367r0 f177239d;

        /* renamed from: e */
        public final C59679v2 f177240e;

        /* renamed from: f */
        public final AtomicBoolean f177241f = new AtomicBoolean(false);

        /* renamed from: g */
        public final Object f177242g = new Object();

        /* renamed from: h */
        public C55015f1 f177243h;

        /* renamed from: i */
        public C55394a.C55395a f177244i;

        /* renamed from: j */
        public final /* synthetic */ C62352p0 f177245j;

        /* renamed from: pl1.p0$c$a */
        public static final class C62362a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62361c f177246d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62362a(C62361c cVar) {
                super(0);
                this.f177246d = cVar;
            }

            public Object invoke() {
                C62361c cVar = this.f177246d;
                C59679v2 v2Var = cVar.f177240e;
                if (v2Var != null) {
                    v2Var.mo78311g(cVar.f177239d);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: pl1.p0$c$b */
        public static final class C62363b implements C63688n.C63689a {

            /* renamed from: a */
            public final /* synthetic */ C62352p0 f177247a;

            /* renamed from: b */
            public final /* synthetic */ C62361c f177248b;

            /* renamed from: pl1.p0$c$b$a */
            public static final class C62364a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C62361c f177249d;

                /* renamed from: e */
                public final /* synthetic */ C98127h f177250e;

                /* renamed from: f */
                public final /* synthetic */ C98121d f177251f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C62364a(C62361c cVar, C98127h hVar, C98121d dVar) {
                    super(0);
                    this.f177249d = cVar;
                    this.f177250e = hVar;
                    this.f177251f = dVar;
                }

                public Object invoke() {
                    C62361c cVar = this.f177249d;
                    C59679v2 v2Var = cVar.f177240e;
                    if (v2Var != null) {
                        v2Var.mo78325h(cVar.f177239d, this.f177250e, this.f177251f);
                    }
                    return C13598b0.f38549a;
                }
            }

            public C62363b(C62352p0 p0Var, C62361c cVar) {
                this.f177247a = p0Var;
                this.f177248b = cVar;
            }

            /* renamed from: a */
            public final void mo87418a(int i, C98127h hVar, C98121d dVar, boolean z) {
                this.f177247a.mo87416b(new C62364a(this.f177248b, hVar, dVar));
            }
        }

        public C62361c(C62352p0 p0Var, C62367r0 r0Var, C59679v2 v2Var) {
            C87412m.m108594g(r0Var, "video");
            this.f177245j = p0Var;
            this.f177239d = r0Var;
            this.f177240e = v2Var;
        }

        /* renamed from: a */
        public void mo36227a(String str) {
            Object obj = this.f177242g;
            C62352p0 p0Var = this.f177245j;
            synchronized (obj) {
                this.f177241f.compareAndSet(false, true);
                Log.m105924i("Finder.VideoDownloader", "[stop] mediaId=" + str);
                if (str != null) {
                    ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126985i(str, (Object[]) null, new C62363b(p0Var, this));
                    MediaPreloadCore mediaPreloadCore = p0Var.f177208a;
                    if (mediaPreloadCore != null) {
                        mediaPreloadCore.mo78443d3(str, false);
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo36228b(C55394a.C55395a aVar) {
            C87412m.m108594g(aVar, "callback");
            this.f177244i = aVar;
        }

        /* renamed from: c */
        public boolean mo36229c(String str, int i, int i2) {
            boolean m;
            C87412m.m108594g(str, "mediaId");
            synchronized (this.f177242g) {
                StringBuilder sb = new StringBuilder();
                sb.append("[isVideoDataAvailable] mediaId=");
                sb.append(str);
                sb.append(" offset=");
                sb.append(i);
                sb.append(" length=");
                sb.append(i2);
                sb.append(" cacheSize=");
                C55015f1 f1Var = this.f177243h;
                sb.append(f1Var != null ? Long.valueOf(f1Var.field_cacheSize) : null);
                Log.m105924i("Finder.VideoDownloader", sb.toString());
                C59679v2 v2Var = this.f177240e;
                if (v2Var != null) {
                    v2Var.mo78326i(str, i, i2);
                }
                m = ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126989m(str, i, i2);
            }
            return m;
        }

        /* renamed from: d */
        public void mo36230d(String str, int i, int i2) {
            C87412m.m108594g(str, "mediaId");
            synchronized (this.f177242g) {
                StringBuilder sb = new StringBuilder();
                sb.append("[requestVideoData] mediaId=");
                sb.append(str);
                sb.append(" offset=");
                sb.append(i);
                sb.append(" length=");
                sb.append(i2);
                sb.append(" cacheSize=");
                C55015f1 f1Var = this.f177243h;
                sb.append(f1Var != null ? Long.valueOf(f1Var.field_cacheSize) : null);
                Log.m105924i("Finder.VideoDownloader", sb.toString());
                ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126990n(str, i, i2, 0);
            }
        }

        /* renamed from: f */
        public void mo36231f(String str, String str2, String str3) {
            Object obj;
            C55015f1 f1Var;
            String str4;
            String str5 = str;
            C87412m.m108594g(str5, "mediaId");
            C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            C87412m.m108594g(str3, "url");
            Object obj2 = this.f177242g;
            C62352p0 p0Var = this.f177245j;
            synchronized (obj2) {
                try {
                    this.f177241f.set(false);
                    C66167g gVar = C66167g.f190173a;
                    C55015f1 c = gVar.mo90234c(str5, false);
                    C62367r0 r0Var = this.f177239d;
                    c.field_reqFormat = r0Var.f177256h;
                    String str6 = c.field_fileFormat;
                    String g = str6 == null ? r0Var.mo87422g() : str6;
                    c.field_fileFormat = g;
                    C62367r0 r0Var2 = this.f177239d;
                    String str7 = r0Var2.f177253e.f185275p;
                    if (str7 == null) {
                        str7 = "";
                    }
                    int i = r0Var2.f177256h;
                    C87412m.m108593f(g, "this.field_fileFormat");
                    C62367r0 r0Var3 = this.f177239d;
                    Object obj3 = obj2;
                    try {
                        C55015f1 f1Var2 = c;
                        obj = obj3;
                        C62352p0 p0Var2 = p0Var;
                        try {
                            C66167g.m78056h(gVar, str, str7, str3, i, g, r0Var3.f177257i, c.field_cacheSize, c.field_totalSize, 1, r0Var3.f177253e.f185269g, r0Var3.getUrlToken(), this.f177239d.getDecodeKey(), false, 4096, (Object) null);
                            C58784w3 w3Var = C58784w3.f168295a;
                            int i2 = f1Var2.field_reqFormat;
                            String str8 = f1Var2.field_fileFormat;
                            C87412m.m108593f(str8, "videoCache.field_fileFormat");
                            String urlToken = this.f177239d.getUrlToken();
                            String decodeKey = this.f177239d.getDecodeKey();
                            C62367r0 r0Var4 = this.f177239d;
                            C62352p0 p0Var3 = p0Var2;
                            C62352p0 p0Var4 = p0Var3;
                            C98127h w = w3Var.mo83973w(str, str3, str2, i2, str8, urlToken, decodeKey, r0Var4.f177253e.f185257U == 1, new C62353a(p0Var2, this.f177240e, this.f177244i, r0Var4, this.f177241f, this.f177242g), p0Var3.f177209b, "Finder.VideoDownloader");
                            this.f177243h = f1Var2;
                            MediaPreloadCore mediaPreloadCore = p0Var4.f177208a;
                            if (mediaPreloadCore != null) {
                                f1Var = f1Var2;
                                str4 = str;
                                mediaPreloadCore.mo78443d3(str4, true);
                            } else {
                                f1Var = f1Var2;
                                str4 = str;
                            }
                            Log.m105924i("Finder.VideoDownloader", "[startHttpStream] fallback cancel mediaId=" + str4 + " isPreLoadCompleted=" + f1Var.mo76074o2() + " isAllCompleted=" + f1Var.mo76073n2() + " file=" + str2 + ", " + str3 + " isMoovReady=" + f1Var.field_moovReady);
                            if (f1Var.mo76073n2()) {
                                Log.m105924i("Finder.VideoDownloader", "[finish] mediaId=" + str4 + " cacheSize=" + f1Var.field_cacheSize + " totalSize=" + f1Var.field_totalSize + '}');
                                C98127h.C98128a aVar = w.f287704f1;
                                long j = f1Var.field_cacheSize;
                                long j2 = f1Var.field_totalSize;
                                CdnLogic.VideoInfo videoInfo = new CdnLogic.VideoInfo();
                                videoInfo.svrFlag = f1Var.field_fileFormat;
                                C13598b0 b0Var = C13598b0.f38549a;
                                aVar.onMoovReady(str, j, j2, videoInfo);
                                w.f287704f1.mo17917e(str, f1Var.field_cacheSize, f1Var.field_totalSize);
                                w.f287704f1.mo17918g(str4, 0, (C98121d) null);
                                MediaPreloadCore mediaPreloadCore2 = p0Var4.f177208a;
                                if (mediaPreloadCore2 != null) {
                                    mediaPreloadCore2.mo78443d3(str4, false);
                                }
                                return;
                            }
                            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126982f(w);
                            p0Var4.mo87416b(new C62362a(this));
                            C13598b0 b0Var2 = C13598b0.f38549a;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj3;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    obj = obj2;
                    throw th;
                }
            }
        }
    }

    /* renamed from: pl1.p0$d */
    public static final class C62365d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f177252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62365d(C32224a<C13598b0> aVar) {
            super(0);
            this.f177252d = aVar;
        }

        public Object invoke() {
            this.f177252d.invoke();
            return C13598b0.f38549a;
        }
    }

    public C62352p0(int i, MediaPreloadCore mediaPreloadCore) {
        this.f177208a = mediaPreloadCore;
        this.f177209b = i;
    }

    /* renamed from: a */
    public C55394a mo87415a(C62367r0 r0Var, C59679v2 v2Var) {
        C87412m.m108594g(r0Var, "video");
        C87412m.m108594g(v2Var, "callback");
        return new C62361c(this, r0Var, v2Var);
    }

    /* renamed from: b */
    public final void mo87416b(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "run");
        C61926c.m72668M(new C62365d(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62352p0(int i, MediaPreloadCore mediaPreloadCore, int i2, C8480h hVar) {
        this(i, (i2 & 2) != 0 ? null : mediaPreloadCore);
    }
}
