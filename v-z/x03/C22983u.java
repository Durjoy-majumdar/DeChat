package x03;

import android.view.ViewGroup;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.topstory.p113ui.video.TopStoryVideoPlayTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import kj2.C117407d;
import nc3.C34767b;
import p03.C21915i;
import p03.C35360a;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p500dy.C97560f;
import p663qo.C101213l;
import p682rz.C101487r;
import r03.C22193b;
import t03.C22422f;
import t03.C22426h;
import te3.qh4;
import te3.xh4;
import te3.yh4;
import u73.C101987v0;
import v73.C102158a;
import x03.C22967p;

/* renamed from: x03.u */
public class C22983u {

    /* renamed from: a */
    public int f66027a = 0;

    /* renamed from: b */
    public C102532t f66028b;

    /* renamed from: c */
    public C22951f f66029c;

    /* renamed from: d */
    public xh4 f66030d;

    /* renamed from: e */
    public boolean f66031e;

    /* renamed from: f */
    public boolean f66032f;

    /* renamed from: g */
    public C34767b.C34768c f66033g;

    /* renamed from: h */
    public boolean f66034h = false;

    /* renamed from: i */
    public final C34767b.C21622a f66035i = new C22984a();

    /* renamed from: j */
    public C22947b f66036j;

    /* renamed from: k */
    public boolean f66037k;

    /* renamed from: x03.u$a */
    public class C22984a implements C34767b.C21622a {
        public C22984a() {
        }

        /* renamed from: a */
        public void mo17997a(boolean z) {
            Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onPause: ");
            C22983u.this.mo36220l(true);
        }

        public void onResume() {
            Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onResume: ");
            C22983u.this.mo36220l(false);
        }

        public void onStop() {
            Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onStop: ");
            C22983u.this.mo36216h();
        }
    }

    /* renamed from: x03.u$b */
    public class C22985b implements C98127h.C98128a {

        /* renamed from: d */
        public boolean f66039d;

        /* renamed from: e */
        public boolean f66040e;

        /* renamed from: x03.u$b$a */
        public class C22986a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ long f66042d;

            /* renamed from: e */
            public final /* synthetic */ long f66043e;

            /* renamed from: f */
            public final /* synthetic */ C94554a f66044f;

            /* renamed from: g */
            public final /* synthetic */ CdnLogic.VideoInfo f66045g;

            /* renamed from: h */
            public final /* synthetic */ String f66046h;

            public C22986a(long j, long j2, C94554a aVar, CdnLogic.VideoInfo videoInfo, String str) {
                this.f66042d = j;
                this.f66043e = j2;
                this.f66044f = aVar;
                this.f66045g = videoInfo;
                this.f66046h = str;
            }

            public void run() {
                C22947b bVar;
                C22983u uVar = C22983u.this;
                if (uVar.f66028b != null && (bVar = uVar.f66036j) != null) {
                    C22193b bVar2 = bVar.mo24967U2().f66025f;
                    if (bVar2 != null && bVar2.f62817n == 0) {
                        long currentTimeMillis = System.currentTimeMillis() - bVar2.f62804a;
                        bVar2.f62817n = currentTimeMillis;
                        long j = this.f66042d;
                        bVar2.f62818o = j;
                        bVar2.f62819p = j + this.f66043e;
                        bVar2.f62825v = this.f66044f;
                        Log.m105925i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onMoovReady %d %d %d", Long.valueOf(currentTimeMillis), Long.valueOf(this.f66042d), Long.valueOf(this.f66043e));
                    }
                    CdnLogic.VideoInfo videoInfo = this.f66045g;
                    C22983u.this.f66028b.mo76639l(this.f66046h, this.f66042d, this.f66043e, videoInfo != null ? videoInfo.svrFlag : "");
                }
            }
        }

        /* renamed from: x03.u$b$b */
        public class C22987b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f66048d;

            /* renamed from: e */
            public final /* synthetic */ long f66049e;

            /* renamed from: f */
            public final /* synthetic */ long f66050f;

            public C22987b(String str, long j, long j2) {
                this.f66048d = str;
                this.f66049e = j;
                this.f66050f = j2;
            }

            public void run() {
                C102532t tVar = C22983u.this.f66028b;
                if (tVar != null) {
                    tVar.onDataAvailable(this.f66048d, this.f66049e, this.f66050f);
                }
            }
        }

        /* renamed from: x03.u$b$c */
        public class C22988c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f66052d;

            /* renamed from: e */
            public final /* synthetic */ long f66053e;

            /* renamed from: f */
            public final /* synthetic */ long f66054f;

            public C22988c(String str, long j, long j2) {
                this.f66052d = str;
                this.f66053e = j;
                this.f66054f = j2;
            }

            public void run() {
                C102532t tVar = C22983u.this.f66028b;
                if (tVar != null) {
                    tVar.mo76638e(this.f66052d, this.f66053e, this.f66054f);
                }
                C22983u uVar = C22983u.this;
                long j = this.f66053e;
                uVar.getClass();
                if ((100 * j) / this.f66054f >= 50 || j > 5242880) {
                    C22985b.this.mo36222a();
                }
            }
        }

        /* renamed from: x03.u$b$d */
        public class C22989d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f66056d;

            /* renamed from: e */
            public final /* synthetic */ int f66057e;

            public C22989d(String str, int i) {
                this.f66056d = str;
                this.f66057e = i;
            }

            public void run() {
                C22947b bVar;
                C22983u uVar = C22983u.this;
                if (uVar.f66028b != null && (bVar = uVar.f66036j) != null) {
                    C22193b bVar2 = bVar.mo24967U2().f66025f;
                    if (bVar2 != null && bVar2.f62816m == 0) {
                        bVar2.f62816m = System.currentTimeMillis() - bVar2.f62804a;
                    }
                    C22983u.this.f66028b.mo76640m(this.f66056d, this.f66057e);
                    if (this.f66057e != 0) {
                        C102158a.m134600a(9);
                    } else {
                        C102158a.m134600a(27);
                    }
                }
            }
        }

        public C22985b(C22984a aVar) {
        }

        /* renamed from: a */
        public void mo36222a() {
            C22947b bVar;
            yh4 yh4;
            int i;
            if (!this.f66040e) {
                C22983u uVar = C22983u.this;
                if (uVar.f66030d != null && (bVar = uVar.f66036j) != null) {
                    if ((bVar.mo24973X4().f65984c == 1) || C101987v0.m134275i()) {
                        Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "startPreload");
                        this.f66040e = true;
                        C22967p n3 = C22983u.this.f66036j.mo24987n3();
                        xh4 xh4 = C22983u.this.f66030d;
                        C22974q C6 = n3.f65989a.mo24946C6();
                        ArrayList arrayList = new ArrayList();
                        synchronized (C6) {
                            int size = ((LinkedList) C6.mo36192b()).size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    i2 = -1;
                                    break;
                                } else if (xh4.f64729h.equals(((xh4) ((LinkedList) C6.mo36192b()).get(i2)).f64729h)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (i2 >= 0 && (i = i2 + 1) < size) {
                                for (i = i2 + 1; i < size; i++) {
                                    arrayList.add((xh4) ((LinkedList) C6.mo36192b()).get(i));
                                }
                            }
                        }
                        HashMap hashMap = new HashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            xh4 xh42 = (xh4) it.next();
                            String b = C22426h.m26100b(xh42.f64729h, xh42.f64741v);
                            if (n3.f65991c.containsKey(b)) {
                                yh4 = n3.f65991c.get(b);
                            } else {
                                yh4 = new yh4();
                                yh4.f354603d = b;
                                yh4.f354606g = xh42.f64709J;
                            }
                            hashMap.put(b, yh4);
                            int a = (int) n3.mo36185a(C35360a.f94688a.longValue(), xh42.f64709J);
                            if (a < 20) {
                                a = 20;
                            } else if (a > 100) {
                                a = 100;
                            }
                            long j = yh4.f354605f;
                            if (j < ((long) a)) {
                                String str = xh42.f64726e;
                                C98127h hVar = new C98127h();
                                hVar.f287660d = "task_TopStoryPreloadMgr";
                                hVar.field_mediaId = b;
                                hVar.f287705p0 = str;
                                hVar.f287654K = 2;
                                hVar.f287689V = 2;
                                hVar.f287655L = 3;
                                hVar.f287692W0 = a;
                                hVar.field_preloadRatio = a;
                                hVar.f287696Y0 = 4;
                                hVar.field_fullpath = n3.f65989a.mo24975Z2() + b + ".mp4";
                                hVar.f287662f = new C22967p.C22972e((C22967p.C22968a) null);
                                hVar.f287656M = new C22967p.C22971d((C22967p.C22968a) null);
                                ((C101213l) C86312j.m106911c(C101213l.class)).xf0(hVar);
                                Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "Preload video %s from %s to %s", b, Long.valueOf(yh4.f354605f), Integer.valueOf(a));
                            } else {
                                Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "Already Preload video %s %s", b, Long.valueOf(j));
                            }
                            if (hashMap.size() == 6) {
                                break;
                            }
                        }
                        n3.f65992d.clear();
                        n3.f65992d.addAll(hashMap.keySet());
                        n3.f65991c.putAll(hashMap);
                        ThreadPool.post(new C22967p.C22969b(n3.f65990b), "TopStory.DeleteVideoCacheTask");
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            C22947b bVar = C22983u.this.f66036j;
            if (bVar != null) {
                C22967p n3 = bVar.mo24987n3();
                if (n3.f65991c.containsKey(str)) {
                    yh4 yh4 = n3.f65991c.get(str);
                    yh4.f354603d = str;
                    yh4.f354606g = j2;
                    yh4.f354604e = j;
                    yh4.f354605f = n3.mo36185a(j, j2);
                    n3.f65991c.put(str, yh4);
                }
                C22193b bVar2 = C22983u.this.f66036j.mo24967U2().f66025f;
                if (bVar2 != null) {
                    bVar2.f62826w = j2;
                }
            }
            MMHandlerThread.postToMainThread(new C22988c(str, j, j2));
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            if (1 >= Log.getLogLevel()) {
                C22983u uVar = C22983u.this;
                if (uVar.f66034h) {
                    uVar.f66034h = false;
                    i = 404;
                }
            }
            Log.m105925i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFinish %s %d", str, Integer.valueOf(i));
            C22947b bVar = C22983u.this.f66036j;
            if (bVar != null) {
                C22967p n3 = bVar.mo24987n3();
                if (n3.f65991c.containsKey(str)) {
                    yh4 yh4 = n3.f65991c.get(str);
                    if (i == 0) {
                        yh4.f354603d = str;
                        long j = yh4.f354606g;
                        yh4.f354604e = j;
                        yh4.f354605f = n3.mo36185a(j, j);
                        n3.f65991c.put(str, yh4);
                    }
                    Log.m105925i("MicroMsg.TopStory.TopStoryPreloadMgr", "onCurrentVideoDownloadFinish onFinish %s %d %s %d", str, Long.valueOf(yh4.f354605f), Util.getSizeMB(yh4.f354604e, 100.0d), Integer.valueOf(i));
                }
            }
            try {
                C21915i.m25171c(C22983u.this.f66036j.mo24946C6().mo36193d(C22983u.this.f66036j.mo24981e2()), 2, i, C22974q.m27135c(), dVar);
            } catch (Exception unused) {
            }
            MMHandlerThread.postToMainThread(new C22989d(str, i));
        }

        public void onDataAvailable(String str, long j, long j2) {
            MMHandlerThread.postToMainThread(new C22987b(str, j, j2));
        }

        public void onM3U8Ready(String str, String str2) {
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            if (!this.f66039d) {
                this.f66039d = true;
                if (C22983u.this.f66036j != null) {
                    C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(C22983u.this.f66036j.mo24975Z2() + str + ".mp4");
                    MMHandlerThread.postToMainThread(new C22986a(j, j2, Z40, videoInfo, str));
                }
            }
        }
    }

    /* renamed from: x03.u$c */
    public class C22990c implements C55394a {

        /* renamed from: d */
        public yh4 f66059d;

        public C22990c(C22984a aVar) {
        }

        /* renamed from: a */
        public void mo36227a(String str) {
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126983g(str, (Object[]) null);
        }

        /* renamed from: b */
        public void mo36228b(C55394a.C55395a aVar) {
        }

        /* renamed from: c */
        public boolean mo36229c(String str, int i, int i2) {
            C22947b bVar;
            C22193b bVar2;
            yh4 yh4 = this.f66059d;
            boolean z = yh4 != null && ((long) (i + i2)) <= yh4.f354604e;
            if (i == 0 && z && (bVar = C22983u.this.f66036j) != null && (bVar2 = bVar.mo24967U2().f66025f) != null && bVar2.f62820q == 0) {
                bVar2.f62820q = System.currentTimeMillis() - bVar2.f62804a;
                bVar2.f62821r = (long) i;
                bVar2.f62822s = (long) (i + i2);
                Log.m105925i("MicroMsg.TopStory.TopStoryVideoViewMgr", "firstDataAvailable %d %d %d", Long.valueOf(bVar2.f62817n), Integer.valueOf(i), Integer.valueOf(i2));
            }
            return !z ? ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126989m(str, i, i2) : z;
        }

        /* renamed from: d */
        public void mo36230d(String str, int i, int i2) {
            yh4 yh4 = this.f66059d;
            if (yh4 == null || ((long) (i + i2)) > yh4.f354604e) {
                ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126990n(str, i, i2, 0);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0164  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36231f(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
            /*
                r18 = this;
                r0 = r18
                r8 = r19
                r1 = r20
                r2 = r21
                java.lang.Class<rz.r> r3 = p682rz.C101487r.class
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r9 = 0
                r5[r9] = r8
                r10 = 1
                r5[r10] = r1
                java.lang.String r6 = "MicroMsg.TopStory.TopStoryVideoViewMgr"
                java.lang.String r7 = "startHttpStream %s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
                x03.u r5 = x03.C22983u.this
                x03.b r5 = r5.f66036j
                if (r5 != 0) goto L_0x0022
                return
            L_0x0022:
                x03.p r5 = r5.mo24987n3()
                x03.b r7 = r5.f65989a
                x03.r r7 = r7.mo24967U2()
                r03.b r7 = r7.f66025f
                if (r7 == 0) goto L_0x009e
                java.util.Map<java.lang.String, te3.yh4> r12 = r5.f65991c
                boolean r12 = r12.containsKey(r8)
                if (r12 == 0) goto L_0x0092
                java.util.Map<java.lang.String, te3.yh4> r12 = r5.f65991c
                java.lang.Object r12 = r12.get(r8)
                te3.yh4 r12 = (te3.yh4) r12
                long r13 = r12.f354605f
                r15 = 5
                r11 = 3
                java.lang.String r4 = "MicroMsg.TopStory.TopStoryPreloadMgr"
                int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r17 < 0) goto L_0x0075
                java.lang.Object[] r5 = new java.lang.Object[r11]
                r5[r9] = r8
                java.lang.Long r11 = java.lang.Long.valueOf(r13)
                r5[r10] = r11
                long r13 = r12.f354604e
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.getSizeMB(r13)
                r13 = 2
                r5[r13] = r11
                java.lang.String r11 = "hit preload cache %s percent %d offset %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r5)
                r4 = 1
                r7.f62812i = r4
                long r4 = r12.f354605f
                r7.f62813j = r4
                long r4 = r12.f354604e
                r7.f62814k = r4
                r4 = 25
                v73.C102158a.m134600a(r4)
                goto L_0x00a2
            L_0x0075:
                java.lang.Object[] r11 = new java.lang.Object[r11]
                r11[r9] = r8
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r11[r10] = r13
                long r12 = r12.f354604e
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.getSizeMB(r12)
                r13 = 2
                r11[r13] = r12
                java.lang.String r12 = "hit preload cache %s but preload percent too small %d offset %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r11)
                r11 = 3
                r7.f62812i = r11
                goto L_0x009e
            L_0x0092:
                te3.yh4 r4 = new te3.yh4
                r4.<init>()
                r4.f354603d = r8
                java.util.Map<java.lang.String, te3.yh4> r7 = r5.f65991c
                r7.put(r8, r4)
            L_0x009e:
                r5.mo36186b()
                r12 = 0
            L_0x00a2:
                r0.f66059d = r12
                x03.u$b r11 = new x03.u$b
                x03.u r4 = x03.C22983u.this
                r5 = 0
                r11.<init>(r5)
                if (r12 == 0) goto L_0x0164
                r4 = 2
                long[] r5 = new long[r4]
                long r12 = r12.f354605f
                r14 = 100
                int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r4 >= 0) goto L_0x00e3
                di3.d r3 = di3.C86312j.m106911c(r3)
                rz.r r3 = (p682rz.C101487r) r3
                rz.n r3 = r3.mo140795W6()
                x03.u r4 = x03.C22983u.this
                gi.h r4 = x03.C22983u.m27161a(r4, r8, r2, r1, r11)
                com.tencent.mm.modelcdntran.e0 r3 = (com.tencent.p014mm.modelcdntran.C92755e0) r3
                r3.mo126981e(r4, r9)
                com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest r3 = new com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest
                r3.<init>()
                r3.fileKey = r8
                r4 = 90
                r3.fileType = r4
                r3.url = r2
                r3.setSavePath(r1)
                boolean r1 = com.tencent.mars.cdn.CdnLogic.queryVideoMoovInfo(r3, r5)
                goto L_0x00ef
            L_0x00e3:
                uf0.b r2 = new uf0.b
                r2.<init>()
                long r1 = r2.mo141510a(r1)
                r5[r9] = r1
                r1 = 1
            L_0x00ef:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r9] = r8
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                r2[r10] = r3
                java.lang.String r3 = "moov check mediaId %s ret %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r2)
                if (r1 == 0) goto L_0x0118
                boolean r1 = r11.f66039d
                if (r1 != 0) goto L_0x0118
                r1 = r5[r9]
                int r2 = (int) r1
                long r3 = (long) r2
                r1 = r5[r10]
                int r2 = (int) r1
                long r5 = (long) r2
                com.tencent.mars.cdn.CdnLogic$VideoInfo r7 = new com.tencent.mars.cdn.CdnLogic$VideoInfo
                r7.<init>()
                r1 = r11
                r2 = r19
                r1.onMoovReady(r2, r3, r5, r7)
            L_0x0118:
                x03.u r1 = x03.C22983u.this
                te3.yh4 r2 = r0.f66059d
                long r3 = r2.f354605f
                long r5 = r2.f354604e
                r1.getClass()
                r1 = 50
                int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r7 >= 0) goto L_0x0132
                r1 = 5242880(0x500000, double:2.590327E-317)
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x0131
                goto L_0x0132
            L_0x0131:
                r10 = 0
            L_0x0132:
                if (r10 == 0) goto L_0x0137
                r11.mo36222a()
            L_0x0137:
                x03.u r1 = x03.C22983u.this
                x03.b r1 = r1.f66036j
                x03.r r1 = r1.mo24967U2()
                r03.b r1 = r1.f66025f
                if (r1 == 0) goto L_0x0149
                te3.yh4 r2 = r0.f66059d
                long r2 = r2.f354606g
                r1.f62826w = r2
            L_0x0149:
                te3.yh4 r1 = r0.f66059d
                long r2 = r1.f354605f
                int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r4 != 0) goto L_0x0179
                long r2 = r1.f354604e
                int r3 = (int) r2
                long r3 = (long) r3
                long r1 = r1.f354606g
                int r2 = (int) r1
                long r5 = (long) r2
                r1 = r11
                r2 = r19
                r1.mo17917e(r2, r3, r5)
                r1 = 0
                r11.mo17918g(r8, r9, r1)
                goto L_0x0179
            L_0x0164:
                di3.d r3 = di3.C86312j.m106911c(r3)
                rz.r r3 = (p682rz.C101487r) r3
                rz.n r3 = r3.mo140795W6()
                x03.u r4 = x03.C22983u.this
                gi.h r1 = x03.C22983u.m27161a(r4, r8, r2, r1, r11)
                com.tencent.mm.modelcdntran.e0 r3 = (com.tencent.p014mm.modelcdntran.C92755e0) r3
                r3.mo126981e(r1, r9)
            L_0x0179:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x03.C22983u.C22990c.mo36231f(java.lang.String, java.lang.String, java.lang.String):void");
        }
    }

    /* renamed from: x03.u$d */
    public class C22991d implements C96814a.C96816c {
        public C22991d(C22983u uVar, C22984a aVar) {
        }

        public void idkeyStat(long j, long j2, long j3, boolean z) {
            C117407d.INSTANCE.idkeyStat(j, j2, j3, z);
        }

        public void kvStat(int i, String str) {
            C117407d.INSTANCE.kvStat(i, str);
        }
    }

    /* renamed from: a */
    public static C98127h m27161a(C22983u uVar, String str, String str2, String str3, C22985b bVar) {
        uVar.getClass();
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_TopStoryVideoViewMgr";
        hVar.field_mediaId = str;
        hVar.f287705p0 = str2;
        hVar.f287689V = 1;
        hVar.f287655L = 3;
        hVar.f287696Y0 = 4;
        hVar.field_fullpath = str3;
        hVar.f287704f1 = bVar;
        return hVar;
    }

    /* renamed from: b */
    public void mo36210b(C22951f fVar, C96814a.C96817e eVar) {
        if (fVar != this.f66029c && this.f66036j != null) {
            if (this.f66028b == null) {
                C102532t tVar = new C102532t(this.f66036j.mo24990t(), this.f66036j);
                tVar.setRootPath(this.f66036j.mo24975Z2());
                tVar.setIOnlineVideoProxy(new C22990c((C22984a) null));
                tVar.setReporter(new C22991d(this, (C22984a) null));
                this.f66028b = tVar;
            }
            if (this.f66028b.getParent() != null) {
                ((ViewGroup) this.f66028b.getParent()).removeView(this.f66028b);
            }
            fVar.getVideoViewParent().addView(this.f66028b);
            this.f66028b.setVideoFooterView(fVar.getControlBar());
            this.f66028b.setScaleType(eVar);
            this.f66028b.setIMMVideoViewCallback(fVar.getVideoViewCallback());
            mo36218j();
            this.f66029c = fVar;
        }
    }

    /* renamed from: c */
    public int mo36211c() {
        C102532t tVar = this.f66028b;
        if (tVar != null) {
            return tVar.getCurrPosMs();
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo36212d() {
        C102532t tVar = this.f66028b;
        if (tVar != null) {
            return tVar.isPlaying();
        }
        return false;
    }

    /* renamed from: e */
    public void mo36213e(int i, int i2) {
        if (i == 0) {
            if (this.f66031e && this.f66037k) {
                this.f66037k = false;
                mo36219k();
            }
        } else if (i2 == 0 && this.f66031e && mo36212d()) {
            this.f66037k = true;
            mo36216h();
        }
    }

    /* renamed from: f */
    public void mo36214f() {
        int i = this.f66027a - 1;
        this.f66027a = i;
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onUIDestroy %d", Integer.valueOf(i));
        if (this.f66027a <= 0) {
            if (this.f66028b != null) {
                mo36221m();
                this.f66028b.mo79616c();
            }
            this.f66036j = null;
        }
    }

    /* renamed from: g */
    public void mo36215g(String str) {
        C22193b bVar = this.f66036j.mo24967U2().f66025f;
        if (bVar != null) {
            bVar.f62808e = 1;
        }
        C102532t tVar = this.f66028b;
        if (tVar != null && tVar.getSessionId().equals(str)) {
            if (this.f66030d != null) {
                ((C22422f) C86312j.m106911c(C22422f.class)).f63534f.remove(this.f66030d.f64729h);
            }
            mo36221m();
        }
        C102158a.m134600a(26);
    }

    /* renamed from: h */
    public void mo36216h() {
        if (this.f66028b != null) {
            Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "abandonAudioFocus: ");
            if (this.f66033g != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(this.f66033g);
            }
            this.f66033g = null;
            this.f66028b.setKeepScreenOn(false);
            this.f66028b.pause();
            this.f66032f = true;
        }
    }

    /* renamed from: i */
    public void mo36217i(C22947b bVar, xh4 xh4, String str, int i) {
        qh4 qh4 = xh4.f64723Y;
        if (qh4 != null) {
            qh4.f64508o = false;
        }
        Log.m105925i("MicroMsg.TopStory.TopStoryVideoViewMgr", "replay video %s %s %s", xh4.f64729h, xh4.f64725d, str);
        bVar.mo24967U2().mo36209g(bVar.mo24989r4());
        bVar.mo24967U2().mo36205c();
        bVar.mo24967U2().mo36208f(xh4, i, str);
        this.f66028b.setKeepScreenOn(true);
        ((TopStoryVideoPlayTextureView) this.f66028b.f283595q).setAlpha(1.0f);
        C102532t tVar = this.f66028b;
        tVar.f301893h1 = str;
        tVar.start();
        this.f66030d = xh4;
        this.f66031e = true;
        this.f66032f = false;
        ((C22422f) C86312j.m106911c(C22422f.class)).f63534f.put(xh4.f64729h, 0);
    }

    /* renamed from: j */
    public void mo36218j() {
        Class cls = C34767b.class;
        Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "requestAudioFocus: ");
        if (this.f66033g != null) {
            ((C34767b) C86312j.m106911c(cls)).b20(this.f66033g);
        }
        C34767b.C34768c el = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34782l.f93465c, this.f66035i);
        this.f66033g = el;
        if (!el.mo34198a()) {
            Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "requestAudioFocus: not gain focus");
            mo36220l(false);
        }
    }

    /* renamed from: k */
    public void mo36219k() {
        if (this.f66028b != null) {
            mo36218j();
            this.f66028b.setKeepScreenOn(true);
            this.f66028b.play();
            this.f66032f = false;
        }
    }

    /* renamed from: l */
    public void mo36220l(boolean z) {
        C102532t tVar = this.f66028b;
        if (tVar != null) {
            tVar.setMute(z);
        }
    }

    /* renamed from: m */
    public void mo36221m() {
        if (this.f66028b != null) {
            Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "stop play");
            Log.m105924i("MicroMsg.TopStory.TopStoryVideoViewMgr", "abandonAudioFocus: ");
            if (this.f66033g != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(this.f66033g);
            }
            this.f66033g = null;
            ((TopStoryVideoPlayTextureView) this.f66028b.f283595q).setAlpha(0.0f);
            this.f66028b.setKeepScreenOn(false);
            this.f66028b.stop();
            this.f66030d = null;
            this.f66031e = false;
            this.f66032f = false;
            C22947b bVar = this.f66036j;
            if (bVar != null) {
                bVar.mo24967U2().mo36209g(this.f66036j.mo24989r4());
                this.f66036j.mo24967U2().mo36205c();
            }
            C22951f fVar = this.f66029c;
            if (fVar != null) {
                fVar.mo36161q();
            }
        }
    }
}
