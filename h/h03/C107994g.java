package h03;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.xeffect.InputAnimation;
import com.tencent.p014mm.xeffect.LayoutInfo;
import d03.C58010a;
import eu3.C58834h;
import eu3.C97749e;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import g03.C107665b;
import gy3.C87412m;
import gy3.C87413o;
import i03.C60241d;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C61926c;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import vp3.C111601n;
import wx3.C15601d;
import wx3.C66212f;
import x60.C102564a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: h03.g */
public final class C107994g extends C107989a {

    /* renamed from: A */
    public volatile boolean f323401A;

    /* renamed from: B */
    public volatile boolean f323402B;

    /* renamed from: C */
    public C0000n0 f323403C;

    /* renamed from: D */
    public C53973z1 f323404D;

    /* renamed from: E */
    public final Runnable f323405E;

    /* renamed from: F */
    public long f323406F;

    /* renamed from: k */
    public final String f323407k = ("MicroMsg.MultiMediaImagePlayer@" + hashCode());

    /* renamed from: l */
    public long f323408l;

    /* renamed from: m */
    public C58010a f323409m;

    /* renamed from: n */
    public String f323410n = "";

    /* renamed from: o */
    public String f323411o = "";

    /* renamed from: p */
    public String f323412p = "";

    /* renamed from: q */
    public String f323413q = "";

    /* renamed from: r */
    public Bitmap f323414r;

    /* renamed from: s */
    public final C111601n.C111604c f323415s = new C111601n.C111604c(new LayoutInfo(), new LayoutInfo(), new InputAnimation());

    /* renamed from: t */
    public MMHandler f323416t;

    /* renamed from: u */
    public HandlerThread f323417u;

    /* renamed from: v */
    public volatile long f323418v;

    /* renamed from: w */
    public boolean f323419w;

    /* renamed from: x */
    public volatile boolean f323420x;

    /* renamed from: y */
    public volatile boolean f323421y;

    /* renamed from: z */
    public volatile boolean f323422z;

    @C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.effect.player.MultiMediaImagePlayer$loadImageBitmap$1", mo125469f = "MultiMediaImagePlayer.kt", mo125470l = {144}, mo125471m = "invokeSuspend")
    /* renamed from: h03.g$a */
    public static final class C98294a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f288119d;

        /* renamed from: e */
        public final /* synthetic */ C53973z1 f288120e;

        /* renamed from: f */
        public final /* synthetic */ C107994g f288121f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f288122g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98294a(C53973z1 z1Var, C107994g gVar, C32224a<C13598b0> aVar, C15601d<? super C98294a> dVar) {
            super(2, dVar);
            this.f288120e = z1Var;
            this.f288121f = gVar;
            this.f288122g = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98294a(this.f288120e, this.f288121f, this.f288122g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98294a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f288119d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f288120e.mo74530c()) {
                    Log.m105924i(this.f288121f.f323407k, "bitmap loading job has been already finished");
                    this.f288122g.invoke();
                    return C13598b0.f38549a;
                }
                Log.m105924i(this.f288121f.f323407k, "joins the bitmap loading job");
                C53973z1 z1Var = this.f288120e;
                this.f288119d = 1;
                if (z1Var.mo74521O(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i(this.f288121f.f323407k, "bitmap loading job has been finished");
            this.f288122g.invoke();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.effect.player.MultiMediaImagePlayer$loadImageBitmap$2", mo125469f = "MultiMediaImagePlayer.kt", mo125470l = {153, 159}, mo125471m = "invokeSuspend")
    /* renamed from: h03.g$b */
    public static final class C98295b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f288123d;

        /* renamed from: e */
        public Object f288124e;

        /* renamed from: f */
        public int f288125f;

        /* renamed from: g */
        public final /* synthetic */ C107994g f288126g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f288127h;

        /* renamed from: h03.g$b$a */
        public static final class C98296a<T, R> implements C64207e {

            /* renamed from: a */
            public final /* synthetic */ C107994g f288128a;

            /* renamed from: b */
            public final /* synthetic */ C15601d<Bitmap> f288129b;

            public C98296a(C107994g gVar, C15601d<? super Bitmap> dVar) {
                this.f288128a = gVar;
                this.f288129b = dVar;
            }

            /* renamed from: a */
            public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                String str = this.f288128a.f323407k;
                Log.m105924i(str, "loadImageBitmap finished, url:" + aVar + ", resource:" + bitmap);
                this.f288129b.resumeWith(Result.m168114constructorimpl(bitmap));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98295b(C107994g gVar, C32224a<C13598b0> aVar, C15601d<? super C98295b> dVar) {
            super(2, dVar);
            this.f288126g = gVar;
            this.f288127h = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98295b(this.f288126g, this.f288127h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98295b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f288125f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r0 = r9.f288124e
                h03.g r0 = (h03.C107994g) r0
                java.lang.Object r1 = r9.f288123d
                h03.g r1 = (h03.C107994g) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x0099
            L_0x001a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x003e
            L_0x0026:
                kotlin.ResultKt.throwOnFailure(r10)
                h03.g r10 = r9.f288126g
                r9.f288125f = r3
                r10.getClass()
                a14.h0 r1 = a14.C53872d1.f151119c
                h03.h r3 = new h03.h
                r3.<init>(r10, r4)
                java.lang.Object r10 = a14.C53895h.m60469g(r1, r3, r9)
                if (r10 != r0) goto L_0x003e
                return r0
            L_0x003e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x0054
                h03.g r10 = r9.f288126g
                r10.mo158394r()
                fy3.a<rx3.b0> r10 = r9.f288127h
                if (r10 == 0) goto L_0x00ff
                r10.invoke()
                goto L_0x00ff
            L_0x0054:
                h03.g r10 = r9.f288126g
                java.lang.String r10 = r10.f323407k
                java.lang.String r1 = "do loadImageBitmap"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
                h03.g r10 = r9.f288126g
                r9.f288123d = r10
                r9.f288124e = r10
                r9.f288125f = r2
                wx3.h r1 = new wx3.h
                wx3.d r2 = xx3.C66447b.m78392b(r9)
                r1.<init>(r2)
                k60.d<f03.f> r2 = f03.C97781b.f286863a
                k60.d<f03.f> r2 = f03.C97781b.f286863a
                f03.f r3 = new f03.f
                java.lang.String r5 = r10.f323411o
                java.lang.String r6 = r10.f323410n
                java.lang.String r7 = r10.f323412p
                java.lang.String r8 = r10.f323413q
                r3.<init>(r5, r6, r7, r8)
                l60.b r2 = r2.mo85955a(r3)
                h03.g$b$a r3 = new h03.g$b$a
                r3.<init>(r10, r1)
                r2.getClass()
                r2.f291320d = r3
                r2.mo85953c()
                java.lang.Object r1 = r1.mo90314b()
                if (r1 != r0) goto L_0x0097
                return r0
            L_0x0097:
                r0 = r10
                r10 = r1
            L_0x0099:
                android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
                r0.f323414r = r10
                h03.g r10 = r9.f288126g
                android.graphics.Bitmap r0 = r10.f323414r
                if (r0 == 0) goto L_0x00ff
                r10.mo158394r()
                h03.g r10 = r9.f288126g
                java.lang.String r10 = r10.f323407k
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "loadImageBitmap:"
                r0.append(r1)
                h03.g r1 = r9.f288126g
                android.graphics.Bitmap r1 = r1.f323414r
                r0.append(r1)
                java.lang.String r1 = " from network, size:["
                r0.append(r1)
                h03.g r1 = r9.f288126g
                android.graphics.Bitmap r1 = r1.f323414r
                if (r1 == 0) goto L_0x00d1
                int r1 = r1.getWidth()
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r1)
                goto L_0x00d2
            L_0x00d1:
                r2 = r4
            L_0x00d2:
                r0.append(r2)
                java.lang.String r1 = ", "
                r0.append(r1)
                h03.g r1 = r9.f288126g
                android.graphics.Bitmap r1 = r1.f323414r
                if (r1 == 0) goto L_0x00e9
                int r1 = r1.getHeight()
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r1)
            L_0x00e9:
                r0.append(r4)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                fy3.a<rx3.b0> r10 = r9.f288127h
                if (r10 == 0) goto L_0x00ff
                r10.invoke()
            L_0x00ff:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: h03.C107994g.C98295b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: h03.g$c */
    public static final class C107995c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107994g f323423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107995c(C107994g gVar) {
            super(0);
            this.f323423d = gVar;
        }

        public Object invoke() {
            this.f323423d.f323420x = true;
            C107994g.m146291p(this.f323423d);
            this.f323423d.f323421y = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h03.g$d */
    public static final class C107996d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C107994g f323424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107996d(C107994g gVar) {
            super(0);
            this.f323424d = gVar;
        }

        public Object invoke() {
            String str = this.f323424d.f323407k;
            Log.m105924i(str, "start finished ensure imageBitmap, isStarted:" + this.f323424d.f323421y + ", isPlaying:" + this.f323424d.f323420x + ", isInvokeOnPlayStarted:" + this.f323424d.f323402B);
            this.f323424d.f323420x = true;
            C107994g.m146291p(this.f323424d);
            C107994g gVar = this.f323424d;
            synchronized (gVar) {
                if (!gVar.f323402B) {
                    C61926c.m72668M(new C107993f(gVar));
                    gVar.f323402B = true;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h03.g$e */
    public static final class C107997e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107994g f323425d;

        public C107997e(C107994g gVar) {
            this.f323425d = gVar;
        }

        public final void run() {
            this.f323425d.f323418v += this.f323425d.f323406F > 0 ? Util.currentTicks() - this.f323425d.f323406F : 33;
            C107994g gVar = this.f323425d;
            C32227p<? super Long, ? super C107989a, C13598b0> pVar = gVar.f323389g;
            if (pVar != null) {
                pVar.invoke(Long.valueOf(gVar.f323418v), this.f323425d);
            }
            long j = this.f323425d.f323418v;
            C107994g gVar2 = this.f323425d;
            if (j >= gVar2.f323408l) {
                if (!gVar2.f323419w || !gVar2.f323420x) {
                    Log.m105924i(this.f323425d.f323407k, "updateProgressTask play to end");
                    C107994g gVar3 = this.f323425d;
                    MMHandler mMHandler = gVar3.f323416t;
                    if (mMHandler != null) {
                        mMHandler.removeCallbacksAndMessages((Object) null);
                    }
                    HandlerThread handlerThread = gVar3.f323417u;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    gVar3.f323417u = null;
                    gVar3.f323416t = null;
                    synchronized (gVar3) {
                        if (!gVar3.f323401A) {
                            Log.m105924i(gVar3.f323407k, "invokeOnPlayFinished");
                            C61926c.m72668M(new C107992e(gVar3));
                            gVar3.f323401A = true;
                        }
                    }
                    return;
                }
                Log.m105924i(this.f323425d.f323407k, "updateProgressTask loop to first");
                this.f323425d.f323418v = 0;
            }
            if (this.f323425d.f323420x) {
                C107994g gVar4 = this.f323425d;
                gVar4.getClass();
                gVar4.f323406F = Util.currentTicks();
                MMHandler mMHandler2 = gVar4.f323416t;
                if (mMHandler2 != null) {
                    mMHandler2.removeCallbacks(gVar4.f323405E);
                }
                MMHandler mMHandler3 = gVar4.f323416t;
                if (mMHandler3 != null) {
                    mMHandler3.postDelayed(gVar4.f323405E, 33);
                }
            }
        }
    }

    public C107994g() {
        C53896h0 h0Var = C53872d1.f151117a;
        this.f323403C = C53930o0.m60554a(C58901s.f168555a);
        this.f323405E = new C107997e(this);
    }

    /* renamed from: p */
    public static final void m146291p(C107994g gVar) {
        if (gVar.f323417u == null) {
            int i = C58834h.f168432b;
            HandlerThread a = C97749e.m126093a("MvMediaImagePlayer_FakePlayThread", -4);
            gVar.f323417u = a;
            a.start();
            HandlerThread handlerThread = gVar.f323417u;
            gVar.f323416t = new MMHandler(handlerThread != null ? handlerThread.getLooper() : null);
        }
        gVar.f323406F = Util.currentTicks();
        MMHandler mMHandler = gVar.f323416t;
        if (mMHandler != null) {
            mMHandler.removeCallbacks(gVar.f323405E);
        }
        MMHandler mMHandler2 = gVar.f323416t;
        if (mMHandler2 != null) {
            mMHandler2.postDelayed(gVar.f323405E, 33);
        }
    }

    /* renamed from: a */
    public boolean mo158378a() {
        return this.f323420x;
    }

    /* renamed from: b */
    public boolean mo158379b() {
        return this.f323414r != null;
    }

    /* renamed from: c */
    public boolean mo158380c() {
        return this.f323421y;
    }

    /* renamed from: d */
    public C107990b mo158381d() {
        return C107990b.Image;
    }

    /* renamed from: e */
    public void mo158382e() {
        Log.m105924i(this.f323407k, "pause");
        this.f323406F = 0;
        this.f323420x = false;
        MMHandler mMHandler = this.f323416t;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        this.f323421y = false;
    }

    /* renamed from: f */
    public void mo158383f() {
        Log.m105924i(this.f323407k, "preloadMedia");
        mo158393q((C32224a<C13598b0>) null);
    }

    /* renamed from: g */
    public void mo158384g() {
        Log.m105924i(this.f323407k, "release");
        mo158392o();
        this.f323414r = null;
        this.f323422z = true;
    }

    /* renamed from: h */
    public void mo158385h() {
        String str = this.f323407k;
        Log.m105924i(str, "resume, isPlaying:" + this.f323420x + ", isStarted:" + this.f323421y);
        if (!this.f323420x) {
            C107991d dVar = new C107991d(this, new C107995c(this));
            if (this.f323414r == null) {
                mo158393q(new C8481c(dVar));
            } else {
                dVar.invoke();
            }
        }
    }

    /* renamed from: i */
    public void mo158386i(long j, C32224a<C13598b0> aVar) {
        String str = this.f323407k;
        Log.m105924i(str, "seek:" + j);
        mo158382e();
        this.f323418v = j;
        mo158391n();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: j */
    public void mo158387j(boolean z) {
        String str = this.f323407k;
        Log.m105924i(str, "setLoop:" + z);
        this.f323419w = z;
    }

    /* renamed from: l */
    public void mo158389l(long j, long j2) {
        String str = this.f323407k;
        Log.m105924i(str, "setPlayRange:[" + j + ',' + j2 + ']');
        this.f323408l = j2 - j;
    }

    /* renamed from: m */
    public void mo158390m(int i, int i2) {
        this.f323383a = i;
        this.f323384b = i2;
        mo158394r();
    }

    /* renamed from: n */
    public void mo158391n() {
        String str = this.f323407k;
        Log.m105924i(str, "start, isPlaying:" + this.f323420x + ", isStarted:" + this.f323421y);
        if (!this.f323421y && !this.f323420x) {
            C107991d dVar = new C107991d(this, new C107996d(this));
            if (this.f323414r == null) {
                mo158393q(new C8481c(dVar));
            } else {
                dVar.invoke();
            }
            this.f323421y = true;
            this.f323401A = false;
            this.f323402B = false;
        }
    }

    /* renamed from: o */
    public void mo158392o() {
        Log.m105924i(this.f323407k, "stop");
        this.f323420x = false;
        MMHandler mMHandler = this.f323416t;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
        HandlerThread handlerThread = this.f323417u;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f323417u = null;
        this.f323416t = null;
        this.f323421y = false;
        this.f323418v = 0;
    }

    /* renamed from: q */
    public final void mo158393q(C32224a<C13598b0> aVar) {
        C32224a<C13598b0> aVar2 = aVar;
        C53973z1 z1Var = this.f323404D;
        if (z1Var == null || !z1Var.mo74466a()) {
            this.f323404D = C53895h.m60466d(this.f323403C, (C66212f) null, (C53934p0) null, new C98295b(this, aVar2, (C15601d<? super C98295b>) null), 3, (Object) null);
            return;
        }
        Log.m105924i(this.f323407k, "bitmap is loading, ignore this request");
        if (aVar2 != null) {
            C53895h.m60466d(this.f323403C, (C66212f) null, (C53934p0) null, new C98294a(z1Var, this, aVar2, (C15601d<? super C98294a>) null), 3, (Object) null);
        }
    }

    /* renamed from: r */
    public final void mo158394r() {
        C111601n.C111604c cVar = this.f323415s;
        LayoutInfo layoutInfo = cVar.f334089a;
        InputAnimation inputAnimation = cVar.f334091c;
        layoutInfo.f319976b = this.f323383a / 2;
        layoutInfo.f319977c = this.f323384b / 2;
        layoutInfo.f319979e = 1;
        layoutInfo.f319978d = 1.0f;
        Bitmap bitmap = this.f323414r;
        C58010a aVar = this.f323409m;
        C60241d dVar = aVar instanceof C60241d ? (C60241d) aVar : null;
        if (bitmap != null && dVar != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = dVar.f171755A;
            C107665b bVar = i < C107665b.values().length + -1 ? C107665b.values()[i] : C107665b.Unknown;
            inputAnimation.f319973b = this.f323385c;
            inputAnimation.f319974c = this.f323386d;
            C111601n.C111604c cVar2 = this.f323415s;
            int i2 = this.f323383a;
            int i3 = this.f323384b;
            C87412m.m108594g(cVar2, "animation");
            C87412m.m108594g(bVar, "animationType");
            LayoutInfo layoutInfo2 = cVar2.f334089a;
            LayoutInfo layoutInfo3 = cVar2.f334090b;
            int i4 = i2 / 2;
            layoutInfo2.f319976b = i4;
            int i5 = i3 / 2;
            layoutInfo2.f319977c = i5;
            layoutInfo2.f319979e = 1;
            layoutInfo2.f319978d = 1.0f;
            layoutInfo3.f319976b = i4;
            layoutInfo3.f319977c = i5;
            layoutInfo3.f319978d = 1.0f;
            float f = (((float) i3) * 1.0f) / ((float) height);
            int i6 = width / 10;
            switch (bVar.ordinal()) {
                case 1:
                    layoutInfo2.f319979e = 0;
                    layoutInfo2.f319978d = f;
                    int i7 = width / 2;
                    int i8 = i6 / 2;
                    layoutInfo2.f319976b = i7 + i8;
                    layoutInfo3.f319978d = f;
                    layoutInfo3.f319976b = i7 - i8;
                    return;
                case 2:
                    layoutInfo2.f319979e = 0;
                    layoutInfo2.f319978d = f;
                    int i9 = width / 2;
                    int i15 = i6 / 2;
                    layoutInfo2.f319976b = i9 - i15;
                    layoutInfo3.f319978d = f;
                    layoutInfo3.f319976b = i9 + i15;
                    return;
                case 3:
                    layoutInfo2.f319979e = 4;
                    layoutInfo2.f319978d = 1.05f;
                    layoutInfo3.f319978d = 1.0f;
                    return;
                case 4:
                    layoutInfo2.f319979e = 4;
                    layoutInfo2.f319978d = 1.0f;
                    layoutInfo3.f319978d = 1.05f;
                    return;
                case 5:
                    layoutInfo2.f319979e = 3;
                    layoutInfo2.f319978d = 1.05f;
                    layoutInfo3.f319978d = 1.0f;
                    return;
                case 6:
                    layoutInfo2.f319979e = 3;
                    layoutInfo2.f319978d = 1.0f;
                    layoutInfo3.f319978d = 1.05f;
                    return;
                default:
                    return;
            }
        }
    }
}
