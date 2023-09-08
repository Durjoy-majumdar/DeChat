package h03;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.IXWebBroadcastListener;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import j03.C60698b;
import j03.C60700d;
import m03.C61431n;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: h03.j */
public final class C107999j extends C107989a {

    /* renamed from: k */
    public final String f323429k = ("MicroMsg.MultiMediaVideoPlayer@" + hashCode());

    /* renamed from: l */
    public C60700d f323430l;

    /* renamed from: m */
    public long f323431m;

    /* renamed from: n */
    public long f323432n;

    /* renamed from: o */
    public int f323433o;

    /* renamed from: p */
    public int f323434p;

    /* renamed from: q */
    public int f323435q;

    /* renamed from: r */
    public long f323436r;

    /* renamed from: s */
    public volatile boolean f323437s;

    /* renamed from: t */
    public volatile boolean f323438t;

    /* renamed from: u */
    public boolean f323439u;

    /* renamed from: v */
    public boolean f323440v;

    /* renamed from: w */
    public long f323441w;

    /* renamed from: h03.j$a */
    public static final class C108000a implements C61431n {

        /* renamed from: a */
        public final /* synthetic */ C107999j f323442a;

        public C108000a(C107999j jVar) {
            this.f323442a = jVar;
        }

        /* renamed from: a */
        public void mo79982a(C58010a aVar, long j) {
            C107999j jVar = this.f323442a;
            long j2 = jVar.f323436r;
            long j3 = jVar.f323432n;
            if ((!(1 <= j3 && j3 <= j2) || j < j3) && j < j2) {
                C32227p<? super Long, ? super C107989a, C13598b0> pVar = jVar.f323389g;
                if (pVar != null) {
                    pVar.invoke(Long.valueOf(j), this.f323442a);
                }
                if (!this.f323442a.f323438t) {
                    C107999j.m146309q(this.f323442a);
                    String str = this.f323442a.f323429k;
                    Log.m105924i(str, "onProgress try invoke play start, video size:[" + this.f323442a.f323433o + ", " + this.f323442a.f323434p + "], rotate:" + this.f323442a.f323435q);
                    C107999j.m146308p(this.f323442a);
                    return;
                }
                return;
            }
            String str2 = jVar.f323429k;
            Log.m105924i(str2, "reach playRange end timeMs:" + j + ", playRange:[" + this.f323442a.f323431m + ',' + this.f323442a.f323432n + "], isLoop:" + this.f323442a.f323440v);
            C107999j jVar2 = this.f323442a;
            if (jVar2.f323440v) {
                long j4 = jVar2.f323431m;
                if (j4 >= 0) {
                    C60695a.C60696a.m70999b(jVar2.f323430l, (int) j4, true, (C32226l) null, 4, (Object) null);
                    return;
                }
            }
            jVar2.f323430l.stop();
            C107999j jVar3 = this.f323442a;
            synchronized (jVar3) {
                if (!jVar3.f323437s) {
                    Log.m105924i(jVar3.f323429k, "invokeOnPlayFinished");
                    C61926c.m72668M(new C108006m(jVar3));
                    jVar3.f323437s = true;
                }
            }
        }
    }

    /* renamed from: h03.j$b */
    public static final class C108001b extends C87413o implements C32226l<C60695a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107999j f323443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108001b(C107999j jVar) {
            super(1);
            this.f323443d = jVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60695a) obj, LocaleUtil.ITALIAN);
            C107999j jVar = this.f323443d;
            synchronized (jVar) {
                if (!jVar.f323437s) {
                    Log.m105924i(jVar.f323429k, "invokeOnPlayFinished");
                    C61926c.m72668M(new C108006m(jVar));
                    jVar.f323437s = true;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h03.j$c */
    public static final class C108002c extends C87413o implements C32226l<C60695a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107999j f323444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108002c(C107999j jVar) {
            super(1);
            this.f323444d = jVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60695a) obj, LocaleUtil.ITALIAN);
            Log.m105924i(this.f323444d.f323429k, "onPlayStarted");
            C107999j.m146309q(this.f323444d);
            C107999j jVar = this.f323444d;
            jVar.f323439u = true;
            if (jVar.f323441w >= 0) {
                String str = jVar.f323429k;
                Log.m105924i(str, "onPlayStarted seek to target:" + this.f323444d.f323441w);
                C107999j jVar2 = this.f323444d;
                jVar2.f323430l.mo85618l((int) jVar2.f323441w, true, new C108004k(jVar2));
                this.f323444d.f323441w = -1;
            } else {
                long j = jVar.f323431m;
                if (j < 0 || jVar.f323432n <= 0 || j >= jVar.f323436r) {
                    C107999j.m146308p(jVar);
                } else {
                    String str2 = jVar.f323429k;
                    Log.m105924i(str2, "onPlayStarted seek to playRange:[" + this.f323444d.f323431m + ',' + this.f323444d.f323432n + ']');
                    C107999j jVar3 = this.f323444d;
                    jVar3.f323430l.mo85618l((int) jVar3.f323431m, true, new C108005l(jVar3));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h03.j$d */
    public static final class C108003d extends C87413o implements C32226l<ITPPlayer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107999j f323445d;

        /* renamed from: e */
        public final /* synthetic */ long f323446e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f323447f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108003d(C107999j jVar, long j, C32224a<C13598b0> aVar) {
            super(1);
            this.f323445d = jVar;
            this.f323446e = j;
            this.f323447f = aVar;
        }

        public Object invoke(Object obj) {
            ITPPlayer iTPPlayer = (ITPPlayer) obj;
            String str = this.f323445d.f323429k;
            Log.m105924i(str, "seek:" + this.f323446e + " finished");
            C32224a<C13598b0> aVar = this.f323447f;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    public C107999j() {
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C60700d dVar = new C60700d(context);
        this.f323430l = dVar;
        this.f323441w = -1;
        dVar.mo85620n(new C108000a(this), 33);
        this.f323430l.f172886q = new C108001b(this);
        this.f323430l.mo85613h(new C108002c(this));
    }

    /* renamed from: p */
    public static final void m146308p(C107999j jVar) {
        synchronized (jVar) {
            if (!jVar.f323438t && jVar.f323433o > 0 && jVar.f323434p > 0) {
                C61926c.m72668M(new C108007n(jVar));
                jVar.f323438t = true;
            }
        }
    }

    /* renamed from: q */
    public static final void m146309q(C107999j jVar) {
        C60698b bVar = jVar.f323430l.f172872c;
        if (bVar != null) {
            int propertyLong = (int) bVar.getPropertyLong(205);
            jVar.f323435q = propertyLong;
            boolean z = propertyLong == 90 || propertyLong == 270;
            jVar.f323433o = z ? bVar.getVideoHeight() : bVar.getVideoWidth();
            jVar.f323434p = z ? bVar.getVideoWidth() : bVar.getVideoHeight();
            long propertyLong2 = bVar.getPropertyLong(206);
            if (bVar.getDurationMs() > 0) {
                jVar.f323436r = bVar.getDurationMs();
            }
            String str = jVar.f323429k;
            Log.m105924i(str, "updateVideoSize, video size:[" + jVar.f323433o + ", " + jVar.f323434p + "], rotate:" + jVar.f323435q + ", videoFps:" + propertyLong2 + ", duration:" + jVar.f323436r);
        }
    }

    /* renamed from: a */
    public boolean mo158378a() {
        return this.f323430l.isPlaying();
    }

    /* renamed from: b */
    public boolean mo158379b() {
        return this.f323438t;
    }

    /* renamed from: c */
    public boolean mo158380c() {
        return this.f323439u;
    }

    /* renamed from: d */
    public C107990b mo158381d() {
        return C107990b.Video;
    }

    /* renamed from: e */
    public void mo158382e() {
        Log.m105924i(this.f323429k, "pause");
        C60695a.C60696a.m70998a(this.f323430l, false, 1, (Object) null);
        this.f323439u = false;
    }

    /* renamed from: f */
    public void mo158383f() {
        Log.m105924i(this.f323429k, "preloadMedia");
        C60700d dVar = this.f323430l;
        dVar.f172880k = false;
        dVar.mo85619m();
    }

    /* renamed from: g */
    public void mo158384g() {
        Log.m105924i(this.f323429k, "release");
        this.f323430l.mo85613h((C32226l<? super C60695a, C13598b0>) null);
        this.f323430l.mo85609g();
        C60695a.C60696a.m71001d(this.f323430l, (C32224a) null, 1, (Object) null);
        this.f323430l.stopAsync();
        this.f323430l.recycle();
    }

    /* renamed from: h */
    public void mo158385h() {
        C60700d dVar = this.f323430l;
        dVar.f172880k = true;
        dVar.mo85619m();
        this.f323439u = true;
    }

    /* renamed from: i */
    public void mo158386i(long j, C32224a<C13598b0> aVar) {
        String str = this.f323429k;
        Log.m105924i(str, "seek:" + j);
        if (!this.f323438t) {
            this.f323441w = j;
        }
        this.f323430l.mo85618l((int) j, true, new C108003d(this, j, aVar));
    }

    /* renamed from: j */
    public void mo158387j(boolean z) {
        String str = this.f323429k;
        Log.m105924i(str, "setLoop:" + z);
        this.f323440v = z;
        this.f323430l.setLoop(z);
    }

    /* renamed from: k */
    public void mo158388k(boolean z) {
        this.f323430l.setMute(z);
    }

    /* renamed from: l */
    public void mo158389l(long j, long j2) {
        String str = this.f323429k;
        Log.m105924i(str, "setPlayRange:[" + j + ',' + j2 + ']');
        this.f323431m = j;
        this.f323432n = j2;
    }

    /* renamed from: n */
    public void mo158391n() {
        Log.m105924i(this.f323429k, IXWebBroadcastListener.STAGE_START);
        C60700d dVar = this.f323430l;
        dVar.f172880k = true;
        dVar.mo85619m();
        this.f323437s = false;
        this.f323438t = false;
        this.f323439u = true;
    }

    /* renamed from: o */
    public void mo158392o() {
        Log.m105924i(this.f323429k, "stop");
        this.f323430l.stop();
        this.f323439u = false;
    }
}
