package g03;

import ac3.C103353f0;
import ac3.C27850e0;
import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.decoder.logger.Logger;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import h03.C107989a;
import h03.C107999j;
import i03.C60238a;
import i03.C60240c;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedDeque;
import lu3.C34379c;
import m03.C109459m;
import o40.C61926c;
import rr3.C110625c0;
import rr3.C110632i;
import rx3.C13598b0;
import sp3.C110805h;
import sx3.C110818d0;
import vp3.C111596i;
import vp3.C111601n;
import yp3.C112478a;
import zt3.C119157j;

/* renamed from: g03.c */
public final class C107666c {

    /* renamed from: C */
    public static final long f322090C = 500;

    /* renamed from: D */
    public static final String f322091D = "pag/overlap.pag";

    /* renamed from: E */
    public static final long f322092E = 33;

    /* renamed from: A */
    public long f322093A;

    /* renamed from: B */
    public C60240c f322094B;

    /* renamed from: a */
    public C107680o f322095a;

    /* renamed from: b */
    public C109459m f322096b;

    /* renamed from: c */
    public boolean f322097c;

    /* renamed from: d */
    public C32224a<C13598b0> f322098d;

    /* renamed from: e */
    public C32227p<? super Long, ? super C58010a, C13598b0> f322099e;

    /* renamed from: f */
    public C32224a<C13598b0> f322100f;

    /* renamed from: g */
    public final String f322101g = ("MicroMsg.MultiMediaEffectController@" + hashCode());

    /* renamed from: h */
    public final C111601n f322102h;

    /* renamed from: i */
    public int f322103i;

    /* renamed from: j */
    public int f322104j;

    /* renamed from: k */
    public ConcurrentLinkedDeque<C107989a> f322105k;

    /* renamed from: l */
    public ConcurrentLinkedDeque<C107989a> f322106l;

    /* renamed from: m */
    public ConcurrentLinkedDeque<C107989a> f322107m;

    /* renamed from: n */
    public C107679n f322108n;

    /* renamed from: o */
    public ArrayList<C58010a> f322109o;

    /* renamed from: p */
    public volatile C107668b f322110p;

    /* renamed from: q */
    public volatile long f322111q;

    /* renamed from: r */
    public boolean f322112r;

    /* renamed from: s */
    public boolean f322113s;

    /* renamed from: t */
    public C34379c<?> f322114t;

    /* renamed from: u */
    public long f322115u;

    /* renamed from: v */
    public volatile long f322116v;

    /* renamed from: w */
    public volatile long f322117w;

    /* renamed from: x */
    public volatile long f322118x;

    /* renamed from: y */
    public SurfaceTexture f322119y;

    /* renamed from: z */
    public boolean f322120z;

    /* renamed from: g03.c$a */
    public /* synthetic */ class C107667a extends C24565l implements C32226l<Long, C13598b0> {
        public C107667a(Object obj) {
            super(1, obj, C107666c.class, "onFrameRender", "onFrameRender(J)V", 0);
        }

        public Object invoke(Object obj) {
            ((Number) obj).longValue();
            C107666c cVar = (C107666c) this.receiver;
            if (cVar.f322098d != null && cVar.f322105k.size() > 0 && cVar.f322105k.getFirst().f323392j && cVar.f322119y != null) {
                C61926c.m72668M(new C107673e(cVar));
            }
            if (!cVar.f322120z && cVar.f322093A > 0) {
                String str = cVar.f322101g;
                Log.m105924i(str, "first frame render cost:" + Util.ticksToNow(cVar.f322093A));
                cVar.f322120z = true;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g03.c$b */
    public enum C107668b {
        Unknown,
        Started,
        Pause,
        Stop,
        Seeking
    }

    /* renamed from: g03.c$c */
    public static final class C107669c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107666c f322127d;

        /* renamed from: e */
        public final /* synthetic */ long f322128e;

        /* renamed from: f */
        public final /* synthetic */ C107989a f322129f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107669c(C107666c cVar, long j, C107989a aVar) {
            super(0);
            this.f322127d = cVar;
            this.f322128e = j;
            this.f322129f = aVar;
        }

        public Object invoke() {
            String str = this.f322127d.f322101g;
            Log.m105924i(str, "seek firstPlayer:" + this.f322128e + " finished, isPlaying:" + this.f322129f.mo158378a());
            if (this.f322129f.mo158378a()) {
                this.f322127d.f322110p = C107668b.Started;
                this.f322127d.mo158089l();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g03.c$d */
    public static final class C107670d extends TimerTask {

        /* renamed from: d */
        public final /* synthetic */ C107666c f322130d;

        public C107670d(C107666c cVar) {
            this.f322130d = cVar;
        }

        public void run() {
            C107989a first;
            C107678m mVar;
            C58010a aVar;
            C107989a first2;
            C107678m mVar2;
            C60238a aVar2;
            C107679n nVar;
            ArrayList<C107678m> arrayList;
            int indexOf;
            if (this.f322130d.f322105k.isEmpty() && this.f322130d.f322106l.isEmpty()) {
                Log.m105924i(this.f322130d.f322101g, "finished play all player");
                this.f322130d.mo158090m();
            }
            if (this.f322130d.f322118x >= 0) {
                C107666c cVar = this.f322130d;
                cVar.f322111q = cVar.f322118x;
                Log.m105924i(this.f322130d.f322101g, "onProgressUpdate set renderPts to seekTime:" + this.f322130d.f322118x);
                this.f322130d.f322118x = -1;
            } else {
                this.f322130d.f322111q += this.f322130d.f322115u > 0 ? Util.currentTicks() - this.f322130d.f322115u : C107666c.f322092E;
            }
            C107666c cVar2 = this.f322130d;
            C111601n nVar2 = cVar2.f322102h;
            long j = cVar2.f322111q;
            nVar2.getClass();
            nVar2.mo163269e(new C111596i(nVar2, j));
            C107666c cVar3 = this.f322130d;
            long j2 = cVar3.f322111q;
            boolean z = true;
            String str = null;
            if ((!cVar3.f322105k.isEmpty()) && (mVar2 = first2.f323390h) != null && j2 >= (mVar2.f322143c + mVar2.f322147g.f331495c) - C107666c.f322092E) {
                cVar3.f322102h.mo163276j((first2 = cVar3.f322105k.getFirst()).f323391i);
                first2.mo158392o();
                first2.mo158384g();
                C107999j jVar = first2 instanceof C107999j ? (C107999j) first2 : null;
                if (!(jVar == null || (aVar2 = jVar.f323430l.f172867D) == null || (nVar = cVar3.f322108n) == null || (arrayList = nVar.f322149a) == null || (indexOf = arrayList.indexOf(mVar2)) < 0)) {
                    cVar3.f322094B.mo85227a(indexOf, aVar2);
                }
                C32226l<? super C107989a, C13598b0> lVar = first2.f323387e;
                if (lVar != null) {
                    lVar.invoke(first2);
                }
                cVar3.f322105k.remove(first2);
                Log.m105924i(cVar3.f322101g, "checkRemovePlayerTexture pts:" + j2 + ", remove player texture:" + first2.f323391i + ", type:" + first2.mo158381d() + ", playingPlayers.size:" + cVar3.f322105k.size());
            }
            C107666c cVar4 = this.f322130d;
            long j3 = cVar4.f322111q;
            if ((!cVar4.f322106l.isEmpty()) && (mVar = first.f323390h) != null && j3 >= mVar.f322142b && !(first = cVar4.f322106l.getFirst()).mo158380c()) {
                cVar4.f322106l.removeFirst();
                first.mo158391n();
                cVar4.f322105k.add(first);
                String str2 = cVar4.f322101g;
                StringBuilder sb = new StringBuilder();
                sb.append("checkToPlayNext, now can play next media, pts:");
                sb.append(j3);
                sb.append(", key:");
                C107678m mVar3 = first.f323390h;
                if (!(mVar3 == null || (aVar = mVar3.f322148h) == null)) {
                    str = aVar.f165947s;
                }
                sb.append(str);
                sb.append(", type:");
                sb.append(first.mo158381d());
                sb.append(", track.startTime:");
                sb.append(mVar.f322142b);
                sb.append(", playingPlayers.size:");
                sb.append(cVar4.f322105k.size());
                Log.m105924i(str2, sb.toString());
            }
            long j4 = this.f322130d.f322111q;
            long j5 = this.f322130d.f322117w;
            if (1 > j5 || j5 > j4) {
                z = false;
            }
            if (z && this.f322130d.f322116v >= 0) {
                C61926c.m72668M(new C107671e(this.f322130d));
            }
            C107666c cVar5 = this.f322130d;
            cVar5.getClass();
            C61926c.m72668M(new C107672d(cVar5));
            this.f322130d.f322115u = Util.currentTicks();
        }
    }

    /* renamed from: g03.c$e */
    public static final class C107671e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107666c f322131d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107671e(C107666c cVar) {
            super(0);
            this.f322131d = cVar;
        }

        public Object invoke() {
            C107666c cVar = this.f322131d;
            if (cVar.f322113s) {
                cVar.mo158083f(cVar.f322116v);
            } else {
                C32224a<C13598b0> aVar = cVar.f322100f;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f322131d.mo158080c();
            }
            return C13598b0.f38549a;
        }
    }

    static {
        Logger.setLogProxy(new C27850e0());
        Logger.setLevel(2);
        C112478a.f336787a = new C103353f0();
    }

    public C107666c() {
        C111601n nVar = new C111601n();
        this.f322102h = nVar;
        this.f322105k = new ConcurrentLinkedDeque<>();
        this.f322106l = new ConcurrentLinkedDeque<>();
        this.f322107m = new ConcurrentLinkedDeque<>();
        this.f322109o = new ArrayList<>();
        this.f322110p = C107668b.Unknown;
        this.f322115u = -1;
        this.f322116v = -1;
        this.f322117w = -1;
        this.f322118x = -1;
        this.f322094B = new C60240c();
        nVar.mo163272i(0, 0);
        nVar.mo163261d();
        nVar.f334048q = new C107667a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081 A[LOOP:0: B:5:0x0011->B:46:0x0081, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m145844a(g03.C107666c r8, h03.C107989a r9) {
        /*
            g03.n r8 = r8.f322108n
            r0 = -1
            if (r8 == 0) goto L_0x0084
            java.util.ArrayList<g03.m> r8 = r8.f322149a
            if (r8 != 0) goto L_0x000b
            goto L_0x0084
        L_0x000b:
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
            r2 = 0
        L_0x0011:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r8.next()
            g03.m r3 = (g03.C107678m) r3
            d03.a r4 = r3.f322148h
            r5 = 0
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = r4.f165947s
            goto L_0x0026
        L_0x0025:
            r4 = r5
        L_0x0026:
            g03.m r6 = r9.f323390h
            if (r6 == 0) goto L_0x0031
            d03.a r6 = r6.f322148h
            if (r6 == 0) goto L_0x0031
            java.lang.String r6 = r6.f165947s
            goto L_0x0032
        L_0x0031:
            r6 = r5
        L_0x0032:
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x007c
            d03.a r4 = r3.f322148h
            if (r4 == 0) goto L_0x0043
            long r6 = r4.f165942n
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            goto L_0x0044
        L_0x0043:
            r4 = r5
        L_0x0044:
            g03.m r6 = r9.f323390h
            if (r6 == 0) goto L_0x0053
            d03.a r6 = r6.f322148h
            if (r6 == 0) goto L_0x0053
            long r6 = r6.f165942n
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x0054
        L_0x0053:
            r6 = r5
        L_0x0054:
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 == 0) goto L_0x007c
            d03.a r3 = r3.f322148h
            if (r3 == 0) goto L_0x0065
            long r3 = r3.f165943o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0066
        L_0x0065:
            r3 = r5
        L_0x0066:
            g03.m r4 = r9.f323390h
            if (r4 == 0) goto L_0x0074
            d03.a r4 = r4.f322148h
            if (r4 == 0) goto L_0x0074
            long r4 = r4.f165943o
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
        L_0x0074:
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 == 0) goto L_0x007c
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            if (r3 == 0) goto L_0x0081
            r0 = r2
            goto L_0x0084
        L_0x0081:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.C107666c.m145844a(g03.c, h03.a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: h03.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: h03.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: h03.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: h03.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: h03.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h03.C107989a mo158079b(g03.C107678m r10, boolean r11) {
        /*
            r9 = this;
            d03.a r0 = r10.f322148h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            h03.b r2 = r10.f322141a
            int r2 = r2.ordinal()
            r3 = 1
            java.lang.String r4 = "setMediaInfo:"
            if (r2 == r3) goto L_0x007a
            r3 = 2
            if (r2 == r3) goto L_0x001d
            java.lang.String r2 = r9.f322101g
            java.lang.String r3 = "unknown track type!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
            goto L_0x00d4
        L_0x001d:
            h03.j r1 = new h03.j
            r1.<init>()
            int r2 = r9.f322103i
            int r3 = r9.f322104j
            r1.f323383a = r2
            r1.f323384b = r3
            java.lang.String r2 = r1.f323429k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            j03.d r2 = r1.f323430l
            r2.setMediaInfo(r0)
            long r2 = r0.f165935g
            r1.f323436r = r2
            boolean r2 = r0 instanceof i03.C60241d
            if (r2 == 0) goto L_0x0074
            r2 = r0
            i03.d r2 = (i03.C60241d) r2
            float r2 = r2.f171756x
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0074
            java.lang.String r3 = r1.f323429k
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setPlayRate:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            j03.d r3 = r1.f323430l
            j03.b r3 = r3.f172872c
            if (r3 == 0) goto L_0x0074
            r3.setPlaySpeedRatio(r2)
        L_0x0074:
            boolean r2 = r0.f165940l
            r1.mo158387j(r2)
            goto L_0x00d4
        L_0x007a:
            h03.g r1 = new h03.g
            r1.<init>()
            int r2 = r9.f322103i
            int r3 = r9.f322104j
            r1.mo158390m(r2, r3)
            java.lang.String r2 = r1.f323407k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r1.f323409m = r0
            java.lang.String r2 = r0.f165948t
            java.lang.String r3 = "mediaInfo.path"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = r0.f165949u
            java.lang.String r4 = "mediaInfo.url"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r4 = r0.f165932d
            java.lang.String r5 = r0.f165931c
            java.lang.String r6 = r1.f323407k
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setImagePath:"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = ", url:"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            r1.f323410n = r2
            r1.f323411o = r3
            r1.f323412p = r4
            r1.f323413q = r5
        L_0x00d4:
            if (r1 == 0) goto L_0x0128
            r1.f323390h = r10
            long r2 = r10.f322144d
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x00e9
            long r6 = r10.f322145e
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00e9
            r1.mo158389l(r2, r6)
        L_0x00e9:
            long r2 = r10.f322142b
            long r4 = r10.f322143c
            r1.f323385c = r2
            r1.f323386d = r4
            boolean r10 = r0.f165940l
            r1.mo158387j(r10)
            boolean r10 = r9.f322112r
            r1.mo158388k(r10)
            if (r11 == 0) goto L_0x0100
            r1.mo158383f()
        L_0x0100:
            java.lang.String r10 = r9.f322101g
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "setupPlayer:"
            r11.append(r0)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            g03.i r10 = new g03.i
            r10.<init>(r9)
            r1.f323387e = r10
            g03.j r10 = new g03.j
            r10.<init>(r9)
            r1.f323388f = r10
            g03.k r10 = g03.C32297k.f85768d
            r1.f323389g = r10
        L_0x0128:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.C107666c.mo158079b(g03.m, boolean):h03.a");
    }

    /* renamed from: c */
    public final void mo158080c() {
        String str = this.f322101g;
        Log.m105924i(str, "pause, current status:" + this.f322110p + ", playingPlayers.size:" + this.f322105k.size());
        if (!this.f322105k.isEmpty()) {
            this.f322105k.getFirst().mo158382e();
            this.f322110p = C107668b.Pause;
            C107680o oVar = this.f322095a;
            if (oVar != null) {
                oVar.onPause();
            }
            mo158090m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r5 = r5.f322148h;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo158081d(int r8) {
        /*
            r7 = this;
            g03.n r0 = r7.f322108n
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.util.ArrayList<g03.m> r1 = r0.f322149a
            int r1 = r1.size()
            if (r8 < r1) goto L_0x000e
            return
        L_0x000e:
            java.util.ArrayList<g03.m> r0 = r0.f322149a
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r1 = "composition.trackList[nextMediaIndex]"
            gy3.C87412m.m108593f(r0, r1)
            g03.m r0 = (g03.C107678m) r0
            d03.a r1 = r0.f322148h
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r2 = r7.f322107m
            java.util.Iterator r2 = r2.iterator()
        L_0x0023:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r2.next()
            r5 = r3
            h03.a r5 = (h03.C107989a) r5
            g03.m r5 = r5.f323390h
            if (r5 == 0) goto L_0x003c
            d03.a r5 = r5.f322148h
            if (r5 == 0) goto L_0x003c
            java.lang.String r5 = r5.f165947s
            goto L_0x003d
        L_0x003c:
            r5 = r4
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            java.lang.String r6 = r1.f165947s
            goto L_0x0043
        L_0x0042:
            r6 = r4
        L_0x0043:
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x0023
            goto L_0x004b
        L_0x004a:
            r3 = r4
        L_0x004b:
            h03.a r3 = (h03.C107989a) r3
            r2 = 0
            r5 = 1
            if (r3 == 0) goto L_0x005d
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r0 = r7.f322107m
            r0.remove(r3)
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r0 = r7.f322106l
            r0.add(r3)
            r2 = 1
            goto L_0x0069
        L_0x005d:
            h03.a r0 = r7.mo158079b(r0, r5)
            if (r0 != 0) goto L_0x0064
            return
        L_0x0064:
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r3 = r7.f322106l
            r3.add(r0)
        L_0x0069:
            java.lang.String r0 = r7.f322101g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "preloadMedia, pendingPlayers.size:"
            r3.append(r5)
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r5 = r7.f322106l
            int r5 = r5.size()
            r3.append(r5)
            java.lang.String r5 = ", nextMediaIndex:"
            r3.append(r5)
            r3.append(r8)
            java.lang.String r8 = ", mediaId:"
            r3.append(r8)
            if (r1 == 0) goto L_0x008f
            java.lang.String r4 = r1.f165947s
        L_0x008f:
            r3.append(r4)
            java.lang.String r8 = ", fromFreePlayer:"
            r3.append(r8)
            r3.append(r2)
            java.lang.String r8 = ", freePlayers.size:"
            r3.append(r8)
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r8 = r7.f322107m
            int r8 = r8.size()
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.C107666c.mo158081d(int):void");
    }

    /* renamed from: e */
    public final synchronized void mo158082e() {
        for (C107989a aVar : this.f322105k) {
            aVar.mo158392o();
            aVar.mo158384g();
            this.f322102h.mo163276j(aVar.f323391i);
        }
        for (C107989a g : this.f322107m) {
            g.mo158384g();
        }
        for (C107989a g2 : this.f322106l) {
            g2.mo158384g();
        }
        this.f322105k.clear();
        this.f322106l.clear();
        this.f322107m.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003b, code lost:
        r2 = r2.f322149a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo158083f(long r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f322101g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "seekTo:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", renderPts:"
            r1.append(r2)
            long r2 = r9.f322111q
            r1.append(r2)
            java.lang.String r2 = ", playingPlayers.size:"
            r1.append(r2)
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r2 = r9.f322105k
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = ", status:"
            r1.append(r2)
            g03.c$b r2 = r9.f322110p
            r1.append(r2)
            java.lang.String r2 = ", trackList.size:"
            r1.append(r2)
            g03.n r2 = r9.f322108n
            r3 = 0
            if (r2 == 0) goto L_0x0048
            java.util.ArrayList<g03.m> r2 = r2.f322149a
            if (r2 == 0) goto L_0x0048
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0049
        L_0x0048:
            r2 = r3
        L_0x0049:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r1, r4)
            g03.n r0 = r9.f322108n
            if (r0 == 0) goto L_0x00be
            java.util.ArrayList<g03.m> r0 = r0.f322149a
            if (r0 == 0) goto L_0x00be
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x0066:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0085
            java.lang.Object r1 = r0.previous()
            r4 = r1
            g03.m r4 = (g03.C107678m) r4
            long r5 = r4.f322142b
            long r7 = r4.f322143c
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x0081
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0081
            r4 = 1
            goto L_0x0082
        L_0x0081:
            r4 = 0
        L_0x0082:
            if (r4 == 0) goto L_0x0066
            r3 = r1
        L_0x0085:
            g03.m r3 = (g03.C107678m) r3
            if (r3 != 0) goto L_0x008a
            goto L_0x00be
        L_0x008a:
            long r0 = r3.f322142b
            long r0 = r10 - r0
            long r4 = r3.f322144d
            long r0 = r0 + r4
            java.lang.String r2 = r9.f322101g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "found seek target track:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", trackSeekTime:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", trackStartTimeMs:"
            r4.append(r5)
            long r5 = r3.f322144d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r9.f322118x = r10
            r9.mo158084g(r3, r0)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.C107666c.mo158083f(long):void");
    }

    /* renamed from: g */
    public final void mo158084g(C107678m mVar, long j) {
        C107668b bVar = C107668b.Started;
        mo158090m();
        C107989a aVar = (C107989a) C110818d0.m150915M(this.f322105k);
        this.f322110p = C107668b.Seeking;
        Boolean bool = null;
        boolean z = true;
        if (aVar == null || !C87412m.m108589b(aVar.f323390h, mVar)) {
            mo158082e();
            C107989a b = mo158079b(mVar, true);
            if (b != null) {
                b.mo158391n();
                C58010a aVar2 = mVar.f322148h;
                if (aVar2 == null || aVar2.f165941m) {
                    z = false;
                }
                if (z) {
                    b.mo158386i(j, (C32224a<C13598b0>) null);
                }
                this.f322105k.add(b);
                String str = this.f322101g;
                StringBuilder sb = new StringBuilder();
                sb.append("seekTo create new player, trackSeekTime:");
                sb.append(j);
                sb.append(", playingPlayers.size:");
                sb.append(this.f322105k.size());
                sb.append(", defaultVideo:");
                C58010a aVar3 = mVar.f322148h;
                if (aVar3 != null) {
                    bool = Boolean.valueOf(aVar3.f165941m);
                }
                sb.append(bool);
                Log.m105924i(str, sb.toString());
                return;
            }
            return;
        }
        String str2 = this.f322101g;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("seekTo locate to first playing player, trackSeekTime:");
        sb4.append(j);
        sb4.append(", isStarted:");
        sb4.append(aVar.mo158380c());
        sb4.append(", isPlaying:");
        sb4.append(aVar.mo158378a());
        sb4.append(", defaultVideo:");
        C58010a aVar4 = mVar.f322148h;
        if (aVar4 != null) {
            bool = Boolean.valueOf(aVar4.f165941m);
        }
        sb4.append(bool);
        Log.m105924i(str2, sb4.toString());
        C58010a aVar5 = mVar.f322148h;
        if (aVar5 == null || aVar5.f165941m) {
            z = false;
        }
        if (z) {
            aVar.mo158386i(j, new C107669c(this, j, aVar));
        } else {
            this.f322110p = bVar;
            mo158089l();
        }
        if (!aVar.mo158380c()) {
            this.f322110p = bVar;
            if (aVar.mo158379b()) {
                aVar.mo158385h();
            } else {
                aVar.mo158391n();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo158085h(java.util.List<? extends d03.C58010a> r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "mediaList"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = r0.f322101g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setMediaList size:"
            r4.append(r5)
            int r5 = r21.size()
            r4.append(r5)
            java.lang.String r5 = ", playStatus:"
            r4.append(r5)
            g03.c$b r5 = r0.f322110p
            r4.append(r5)
            java.lang.String r5 = ", resumePlayPosition:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", renderPts:"
            r4.append(r5)
            long r5 = r0.f322111q
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r20.mo158090m()
            r20.mo158082e()
            java.util.ArrayList<d03.a> r3 = r0.f322109o
            r3.clear()
            r3 = 0
            r0.f322108n = r3
            java.util.ArrayList<d03.a> r4 = r0.f322109o
            r4.addAll(r1)
            h03.b r4 = h03.C107990b.Video
            vp3.n r5 = r0.f322102h
            com.tencent.mm.xeffect.effect.EffectManager r5 = r5.f334033b
            r5.mo154926f()
            vp3.n r5 = r0.f322102h
            com.tencent.mm.xeffect.effect.EffectManager r5 = r5.f334033b
            rr3.k r5 = r5.mo154924d()
            long r6 = r5.f330969c
            r8 = 0
            r10 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            com.tencent.mm.xeffect.effect.VLogEffectJNI r11 = com.tencent.p014mm.xeffect.effect.VLogEffectJNI.INSTANCE
            r11.nSetGradientBlurEffectCenterCropBlur(r6, r10)
        L_0x0074:
            r6 = 1054280253(0x3ed70a3d, float:0.42)
            long r11 = r5.f330969c
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x008a
            float r7 = r5.f331000d
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x008a
            com.tencent.mm.xeffect.effect.VLogEffectJNI r7 = com.tencent.p014mm.xeffect.effect.VLogEffectJNI.INSTANCE
            r7.nSetGradientBlurContentOffsetPercent(r11, r6)
            r5.f331000d = r6
        L_0x008a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r21.iterator()
            r7 = r3
            r6 = 0
        L_0x0095:
            boolean r11 = r1.hasNext()
            java.lang.String r12 = "], trackTimeRange:["
            java.lang.String r13 = ", timeRange:["
            java.lang.String r14 = ", type:"
            r15 = 93
            r10 = 44
            r16 = 1
            if (r11 == 0) goto L_0x01cc
            java.lang.Object r11 = r1.next()
            int r17 = r6 + 1
            if (r6 < 0) goto L_0x01c7
            d03.a r11 = (d03.C58010a) r11
            g03.m r6 = new g03.m
            r6.<init>()
            r6.f322148h = r11
            r18 = r4
            long r3 = r11.f165942n
            int r19 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r19 < 0) goto L_0x00d5
            r21 = r1
            long r1 = r11.f165943o
            int r19 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x00d7
            r6.f322142b = r3
            long r3 = r3 + r1
            r6.f322143c = r3
            long r3 = r11.f165944p
            r6.f322144d = r3
            long r3 = r3 + r1
            r6.f322145e = r3
            goto L_0x00ec
        L_0x00d5:
            r21 = r1
        L_0x00d7:
            long r1 = r11.f165935g
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ec
            if (r7 == 0) goto L_0x00e2
            long r3 = r7.f322143c
            goto L_0x00e3
        L_0x00e2:
            r3 = r8
        L_0x00e3:
            r6.f322142b = r3
            long r3 = r3 + r1
            r6.f322143c = r3
            r6.f322144d = r8
            r6.f322145e = r1
        L_0x00ec:
            boolean r1 = r11 instanceof i03.C60241d
            if (r1 == 0) goto L_0x00ff
            r2 = r11
            i03.d r2 = (i03.C60241d) r2
            float r2 = r2.f171756x
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00fd:
            r6.f322146f = r2
        L_0x00ff:
            sp3.h r2 = r6.f322147g
            long r3 = f322090C
            r2.f331495c = r3
            boolean r2 = r11.f165941m
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0158
            r2 = r11
            i03.d r2 = (i03.C60241d) r2
            java.lang.String r2 = r2.f171757y
            if (r2 == 0) goto L_0x011b
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            r16 = 0
        L_0x011b:
            java.lang.String r3 = "<set-?>"
            if (r16 != 0) goto L_0x0131
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r4 != 0) goto L_0x0126
            goto L_0x0131
        L_0x0126:
            sp3.h r4 = r6.f322147g
            r4.getClass()
            gy3.C87412m.m108595h(r2, r3)
            r4.f331493a = r2
            goto L_0x0158
        L_0x0131:
            sp3.h r2 = r6.f322147g
            vp3.n r4 = r0.f322102h
            com.tencent.mm.xeffect.effect.EffectManager r4 = r4.f334033b
            rr3.i r7 = rr3.C110632i.PAGTransitionEffect
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.AssetManager r8 = r16.getAssets()
            java.lang.String r9 = "getContext().assets"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r9 = f322091D
            rr3.c0 r4 = r4.mo154928h(r7, r8, r9)
            r2.f331494b = r4
            sp3.h r2 = r6.f322147g
            r2.getClass()
            gy3.C87412m.m108595h(r9, r3)
            r2.f331493a = r9
        L_0x0158:
            if (r1 == 0) goto L_0x016f
            r1 = r11
            i03.d r1 = (i03.C60241d) r1
            boolean r1 = r1.mo85229a()
            if (r1 == 0) goto L_0x016a
            h03.b r1 = h03.C107990b.Image
            r6.f322141a = r1
            r1 = r18
            goto L_0x0173
        L_0x016a:
            r1 = r18
            r6.f322141a = r1
            goto L_0x0173
        L_0x016f:
            r1 = r18
            r6.f322141a = r1
        L_0x0173:
            r5.add(r6)
            java.lang.String r2 = r0.f322101g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "create track, media:"
            r3.append(r4)
            java.lang.String r4 = r11.f165947s
            r3.append(r4)
            r3.append(r14)
            h03.b r4 = r6.f322141a
            r3.append(r4)
            r3.append(r13)
            long r7 = r6.f322142b
            r3.append(r7)
            r3.append(r10)
            long r7 = r6.f322143c
            r3.append(r7)
            r3.append(r12)
            long r7 = r6.f322144d
            r3.append(r7)
            r3.append(r10)
            long r7 = r6.f322145e
            r3.append(r7)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = r22
            r4 = r1
            r7 = r6
            r6 = r17
            r3 = 0
            r8 = 0
            r10 = 0
            r1 = r21
            goto L_0x0095
        L_0x01c7:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x01cc:
            r1 = r3
            g03.n r2 = new g03.n
            r2.<init>(r5)
            r0.f322108n = r2
            java.util.ArrayList<g03.m> r2 = r2.f322149a
            if (r2 != 0) goto L_0x01d9
            goto L_0x01fe
        L_0x01d9:
            int r3 = r2.size()
            r4 = 1
        L_0x01de:
            if (r4 >= r3) goto L_0x01fe
            int r5 = r4 + -1
            java.lang.Object r5 = r2.get(r5)
            java.lang.String r6 = "trackList[i - 1]"
            gy3.C87412m.m108593f(r5, r6)
            g03.m r5 = (g03.C107678m) r5
            java.lang.Object r6 = r2.get(r4)
            java.lang.String r7 = "trackList[i]"
            gy3.C87412m.m108593f(r6, r7)
            g03.m r6 = (g03.C107678m) r6
            r0.mo158087j(r5, r6)
            int r4 = r4 + 1
            goto L_0x01de
        L_0x01fe:
            java.lang.String r2 = r0.f322101g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parseMediaList finished, total duration:"
            r3.append(r4)
            g03.n r4 = r0.f322108n
            if (r4 == 0) goto L_0x022a
            java.util.ArrayList<g03.m> r5 = r4.f322149a
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0223
            java.util.ArrayList<g03.m> r4 = r4.f322149a
            java.lang.Object r4 = sx3.C110818d0.m150923U(r4)
            g03.m r4 = (g03.C107678m) r4
            long r4 = r4.f322143c
            goto L_0x0225
        L_0x0223:
            r4 = 0
        L_0x0225:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x022b
        L_0x022a:
            r4 = r1
        L_0x022b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            g03.n r2 = r0.f322108n
            if (r2 == 0) goto L_0x0297
            java.util.ArrayList<g03.m> r2 = r2.f322149a
            if (r2 == 0) goto L_0x0297
            java.util.Iterator r2 = r2.iterator()
        L_0x0241:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0297
            java.lang.Object r3 = r2.next()
            g03.m r3 = (g03.C107678m) r3
            java.lang.String r4 = r0.f322101g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "track media:"
            r5.append(r6)
            d03.a r6 = r3.f322148h
            if (r6 == 0) goto L_0x0260
            java.lang.String r6 = r6.f165947s
            goto L_0x0261
        L_0x0260:
            r6 = r1
        L_0x0261:
            r5.append(r6)
            r5.append(r14)
            h03.b r6 = r3.f322141a
            r5.append(r6)
            r5.append(r13)
            long r6 = r3.f322142b
            r5.append(r6)
            r5.append(r10)
            long r6 = r3.f322143c
            r5.append(r6)
            r5.append(r12)
            long r6 = r3.f322144d
            r5.append(r6)
            r5.append(r10)
            long r6 = r3.f322145e
            r5.append(r6)
            r5.append(r15)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            goto L_0x0241
        L_0x0297:
            g03.c$b r1 = r0.f322110p
            g03.c$b r2 = g03.C107666c.C107668b.Unknown
            if (r1 != r2) goto L_0x02a3
            r1 = 0
            r0.mo158081d(r1)
            goto L_0x0368
        L_0x02a3:
            r1 = 0
            g03.c$b r2 = r0.f322110p
            g03.c$b r3 = g03.C107666c.C107668b.Seeking
            if (r2 != r3) goto L_0x0311
            g03.n r2 = r0.f322108n
            if (r2 == 0) goto L_0x0310
            java.util.ArrayList<g03.m> r2 = r2.f322149a
            if (r2 == 0) goto L_0x0310
            int r3 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r3)
        L_0x02ba:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x02de
            java.lang.Object r3 = r2.previous()
            g03.m r3 = (g03.C107678m) r3
            long r4 = r3.f322142b
            long r6 = r3.f322143c
            long r8 = r0.f322118x
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x02d6
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x02d6
            r3 = 1
            goto L_0x02d7
        L_0x02d6:
            r3 = 0
        L_0x02d7:
            if (r3 == 0) goto L_0x02ba
            int r1 = r2.nextIndex()
            goto L_0x02df
        L_0x02de:
            r1 = -1
        L_0x02df:
            java.lang.String r2 = r0.f322101g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setMediaList in seeking, seekTime:"
            r3.append(r4)
            long r4 = r0.f322118x
            r3.append(r4)
            java.lang.String r4 = ", trackIndex:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r0.mo158081d(r1)
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r1 = r0.f322106l
            java.lang.Object r1 = r1.removeLast()
            h03.a r1 = (h03.C107989a) r1
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r2 = r0.f322105k
            r2.add(r1)
            goto L_0x0368
        L_0x0310:
            return
        L_0x0311:
            g03.c$b r1 = r0.f322110p
            g03.c$b r2 = g03.C107666c.C107668b.Started
            if (r1 != r2) goto L_0x0368
            if (r22 == 0) goto L_0x0361
            g03.n r1 = r0.f322108n
            if (r1 == 0) goto L_0x0332
            java.util.ArrayList<g03.m> r2 = r1.f322149a
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0332
            java.util.ArrayList<g03.m> r1 = r1.f322149a
            java.lang.Object r1 = sx3.C110818d0.m150923U(r1)
            g03.m r1 = (g03.C107678m) r1
            long r1 = r1.f322143c
            goto L_0x0334
        L_0x0332:
            r1 = 0
        L_0x0334:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0361
            long r1 = r0.f322111q
            g03.n r3 = r0.f322108n
            if (r3 == 0) goto L_0x0355
            java.util.ArrayList<g03.m> r4 = r3.f322149a
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0355
            java.util.ArrayList<g03.m> r3 = r3.f322149a
            java.lang.Object r3 = sx3.C110818d0.m150923U(r3)
            g03.m r3 = (g03.C107678m) r3
            long r3 = r3.f322143c
            goto L_0x0357
        L_0x0355:
            r3 = 0
        L_0x0357:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0361
            long r1 = r0.f322111q
            r0.mo158083f(r1)
            goto L_0x0368
        L_0x0361:
            r1 = 0
            r0.f322111q = r1
            r20.mo158088k()
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.C107666c.mo158085h(java.util.List, boolean):void");
    }

    /* renamed from: i */
    public final void mo158086i(int i, int i2) {
        String str = this.f322101g;
        Log.m105924i(str, "setSize:[" + i + ',' + i2 + ']');
        this.f322102h.mo163272i(i, i2);
        this.f322103i = i;
        this.f322104j = i2;
        for (C107989a m : this.f322105k) {
            m.mo158390m(i, i2);
        }
        for (C107989a m2 : this.f322106l) {
            m2.mo158390m(i, i2);
        }
    }

    /* renamed from: j */
    public final void mo158087j(C107678m mVar, C107678m mVar2) {
        C110632i iVar = C110632i.PAGTransitionEffect;
        EffectManager effectManager = this.f322102h.f334033b;
        C110805h hVar = mVar.f322147g;
        if (hVar.mo162376b()) {
            if (hVar.f331494b == null) {
                if (C86013q1.m106450k(hVar.f331493a)) {
                    hVar.f331494b = effectManager.mo154929i(iVar, hVar.f331493a);
                } else {
                    EffectManager effectManager2 = this.f322102h.f334033b;
                    AssetManager assets = MMApplicationContext.getContext().getAssets();
                    C87412m.m108593f(assets, "getContext().assets");
                    hVar.f331494b = effectManager2.mo154928h(iVar, assets, f322091D);
                }
            }
            long j = mVar.f322143c;
            long j2 = mVar2.f322147g.f331495c + j;
            if (j > 0 && j2 > 0) {
                C110625c0 c0Var = hVar.f331494b;
                if (c0Var != null) {
                    c0Var.mo162189b(j, j2);
                }
                effectManager.mo154923c(hVar.f331494b);
            }
            String str = this.f322101g;
            StringBuilder sb = new StringBuilder();
            sb.append("set track transition time range:[");
            sb.append(j);
            sb.append(',');
            sb.append(j2);
            sb.append("], effect:");
            C110625c0 c0Var2 = hVar.f331494b;
            sb.append(c0Var2 != null ? Long.valueOf(c0Var2.f330967a) : null);
            Log.m105924i(str, sb.toString());
        }
    }

    /* renamed from: k */
    public final void mo158088k() {
        C107680o oVar;
        Log.m105924i(this.f322101g, "start, current status:" + this.f322110p + ", playingPlayers.size:" + this.f322105k.size() + ", pendingPlayers.size:" + this.f322106l.size());
        if (this.f322109o.isEmpty()) {
            Log.m105920e(this.f322101g, "start ignore not set mediaList");
            return;
        }
        C107668b bVar = this.f322110p;
        C107668b bVar2 = C107668b.Started;
        if (bVar != bVar2) {
            boolean z = !this.f322105k.isEmpty();
            if (this.f322105k.isEmpty()) {
                this.f322111q = 0;
                if (this.f322106l.isEmpty()) {
                    mo158081d(0);
                }
                this.f322105k.add(this.f322106l.removeFirst());
            }
            if (this.f322105k.isEmpty()) {
                Log.m105920e(this.f322101g, "start error playingPlayers is empty");
            }
            this.f322110p = bVar2;
            ((C107989a) C110818d0.m150913K(this.f322105k)).mo158391n();
            if (z && (oVar = this.f322095a) != null) {
                oVar.onResume();
            }
            Log.m105924i(this.f322101g, "start finished, playingPlayers.size:" + this.f322105k.size());
            if (this.f322116v > 0) {
                Log.m105924i(this.f322101g, "start finished seekTo playRange start:" + this.f322116v);
                mo158083f(this.f322116v);
            }
            this.f322093A = Util.currentTicks();
            this.f322120z = false;
        }
        C60240c cVar = this.f322094B;
        cVar.getClass();
        cVar.f171751b = Util.currentTicks();
    }

    /* renamed from: l */
    public final synchronized void mo158089l() {
        String str = this.f322101g;
        Log.m105924i(str, "startProgressUpdate " + this.f322110p);
        if (this.f322114t == null) {
            C107670d dVar = new C107670d(this);
            if (this.f322110p == C107668b.Pause) {
                dVar.run();
            } else {
                this.f322114t = ((C119157j) C119157j.f356862d).mo183872c(dVar, 0, f322092E);
            }
            this.f322115u = -1;
            Log.m105924i(this.f322101g, "do startProgressUpdate");
        }
    }

    /* renamed from: m */
    public final void mo158090m() {
        Log.m105924i(this.f322101g, "stopProgressUpdate");
        C34379c<?> cVar = this.f322114t;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f322114t = null;
    }
}
