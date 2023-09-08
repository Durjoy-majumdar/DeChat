package zj2;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import d03.C58010a;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import ou0.C110066a;
import ou0.C110071c;
import p13.C62189a;
import p156gj.C107835h0;
import p206nj.C11171e;
import pu0.C110248b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wj2.C53183e;
import wj2.C66130c;
import wj2.C66131d;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: zj2.f */
public final class C66862f {

    /* renamed from: A */
    public int f192045A;

    /* renamed from: B */
    public boolean f192046B;

    /* renamed from: C */
    public String f192047C;

    /* renamed from: D */
    public boolean f192048D;

    /* renamed from: a */
    public C58010a f192049a;

    /* renamed from: b */
    public C66132f f192050b;

    /* renamed from: c */
    public C66857b f192051c;

    /* renamed from: d */
    public C58010a f192052d;

    /* renamed from: e */
    public C66130c f192053e;

    /* renamed from: f */
    public long f192054f;

    /* renamed from: g */
    public boolean f192055g;

    /* renamed from: h */
    public final C13601g f192056h = C36568h.m40985a(C39364a.f105793d);

    /* renamed from: i */
    public float f192057i = -1.0f;

    /* renamed from: j */
    public C53973z1 f192058j;

    /* renamed from: k */
    public final C0000n0 f192059k = C53930o0.m60555b();

    /* renamed from: l */
    public C53973z1 f192060l;

    /* renamed from: m */
    public final C0000n0 f192061m;

    /* renamed from: n */
    public C53973z1 f192062n;

    /* renamed from: o */
    public final C0000n0 f192063o;

    /* renamed from: p */
    public C62189a f192064p;

    /* renamed from: q */
    public boolean f192065q;

    /* renamed from: r */
    public long f192066r;

    /* renamed from: s */
    public long f192067s;

    /* renamed from: t */
    public long f192068t;

    /* renamed from: u */
    public boolean f192069u;

    /* renamed from: v */
    public String f192070v;

    /* renamed from: w */
    public long f192071w;

    /* renamed from: x */
    public C53183e f192072x;

    /* renamed from: y */
    public String f192073y;

    /* renamed from: z */
    public int f192074z;

    /* renamed from: zj2.f$a */
    public static final class C39364a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C39364a f105793d = new C39364a();

        public C39364a() {
            super(0);
        }

        public Object invoke() {
            return Long.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ringtone_cgi_timeout_in_voip, 10000));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.service.RingtoneServiceHelper$setMusicStreamMute$1", mo125469f = "RingtoneServiceHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: zj2.f$b */
    public static final class C66863b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ boolean f192075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66863b(boolean z, C15601d<? super C66863b> dVar) {
            super(2, dVar);
            this.f192075d = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C66863b(this.f192075d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66863b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C110248b.class;
            ResultKt.throwOnFailure(obj);
            if (this.f192075d) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
                C110066a aVar = ((C110248b) c).f329779e;
                if (aVar == null) {
                    aVar = new C110071c();
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                    ((C110248b) c2).f329781g[0] = "music";
                }
                aVar.f329358h.setStreamMute(3, true);
            } else {
                C7335d c3 = C86312j.m106911c(cls);
                C87412m.m108593f(c3, "getService(SubCoreAudio::class.java)");
                C110066a aVar2 = ((C110248b) c3).f329779e;
                if (aVar2 == null) {
                    aVar2 = new C110071c();
                    C7335d c4 = C86312j.m106911c(cls);
                    C87412m.m108593f(c4, "getService(SubCoreAudio::class.java)");
                    ((C110248b) c4).f329781g[0] = "music";
                }
                aVar2.f329358h.setStreamMute(3, false);
            }
            return C13598b0.f38549a;
        }
    }

    public C66862f() {
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151119c;
        this.f192061m = C53930o0.m60554a(((C53884f2) a).plus(h0Var));
        this.f192063o = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(h0Var));
        this.f192069u = true;
        this.f192070v = "";
        this.f192072x = C53183e.UNKNOWN;
        this.f192073y = "";
        this.f192047C = "";
    }

    /* renamed from: a */
    public static final long m78972a(C66862f fVar) {
        return ((Number) ((C36570n) fVar.f192056h).getValue()).longValue();
    }

    /* renamed from: b */
    public final void mo90863b() {
        C53973z1 z1Var = this.f192062n;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f192062n = null;
        C66857b bVar = this.f192051c;
        if (bVar != null) {
            if (bVar != null) {
                try {
                    bVar.mo36981k();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.f192051c = null;
                    throw th;
                }
            }
            C66857b bVar2 = this.f192051c;
            if (bVar2 != null) {
                bVar2.mo36978h();
            }
            this.f192051c = null;
            this.f192052d = null;
            this.f192049a = null;
            this.f192053e = null;
            Log.m105924i("MicroMsg.RingtoneServiceHelper", "Player destroyed");
            this.f192051c = null;
        }
    }

    /* renamed from: c */
    public final void mo90864c() {
        Log.m105924i("MicroMsg.RingtoneServiceHelper", AssetExtension.SCENE_PLAY);
        try {
            C66130c cVar = this.f192053e;
            if ((cVar != null ? cVar.f190068a : null) == C66131d.START_SOUND) {
                mo90866e(true);
            }
            C66857b bVar = this.f192051c;
            if (bVar != null) {
                bVar.mo36976f();
            }
        } catch (Exception unused) {
            mo90863b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        if (gy3.C87412m.m108589b(r14, r2 != null ? r2.f165947s : null) == false) goto L_0x0102;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90865d(wj2.C66129b r14) {
        /*
            r13 = this;
            wj2.d r0 = wj2.C66131d.START_SOUND
            java.lang.String r1 = "action"
            gy3.C87412m.m108594g(r14, r1)
            int r14 = r14.ordinal()
            r1 = 0
            java.lang.String r2 = " and vibrate is "
            java.lang.String r3 = "MicroMsg.RingtoneServiceHelper"
            if (r14 == 0) goto L_0x01fd
            r4 = 2
            r5 = 0
            r6 = 1
            if (r14 == r4) goto L_0x00dc
            r4 = 4
            if (r14 == r4) goto L_0x0048
            r0 = 6
            if (r14 == r0) goto L_0x003e
            r0 = 7
            if (r14 == r0) goto L_0x0022
            goto L_0x022c
        L_0x0022:
            a14.z1 r14 = r13.f192062n
            if (r14 == 0) goto L_0x0029
            a14.C53973z1.C53974a.m60623a(r14, r5, r6, r5)
        L_0x0029:
            r13.f192062n = r5
            a14.n0 r7 = r13.f192063o
            r8 = 0
            r9 = 0
            zj2.c r10 = new zj2.c
            r10.<init>(r13, r5)
            r11 = 3
            r12 = 0
            a14.z1 r14 = a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
            r13.f192062n = r14
            goto L_0x022c
        L_0x003e:
            java.lang.String r14 = "Received continue Intent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            r13.mo90864c()
            goto L_0x022c
        L_0x0048:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r4 = "Received stop Intent and player is "
            r14.append(r4)
            zj2.b r4 = r13.f192051c
            r14.append(r4)
            r14.append(r2)
            p13.a r2 = r13.f192064p
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            r13.mo90863b()
            r13.mo90866e(r1)
            p13.a r14 = r13.f192064p
            if (r14 == 0) goto L_0x0073
            r14.mo87248c()
        L_0x0073:
            r13.f192065q = r1
            a14.z1 r14 = r13.f192058j
            if (r14 == 0) goto L_0x007c
            a14.C53973z1.C53974a.m60623a(r14, r5, r6, r5)
        L_0x007c:
            androidx.lifecycle.z<wj2.f> r14 = nj2.C61767o.f175578d
            r14.postValue(r5)
            wj2.c r14 = r13.f192053e
            if (r14 == 0) goto L_0x0088
            wj2.d r14 = r14.f190068a
            goto L_0x0089
        L_0x0088:
            r14 = r5
        L_0x0089:
            if (r14 != r0) goto L_0x0094
            long r2 = java.lang.System.currentTimeMillis()
            long r7 = r13.f192066r
            long r2 = r2 - r7
            r13.f192068t = r2
        L_0x0094:
            r2 = 0
            r13.f192054f = r2
            java.lang.String r14 = nj2.C61768p.f175594i
            int r14 = r14.length()
            if (r14 <= 0) goto L_0x00a1
            r1 = 1
        L_0x00a1:
            if (r1 == 0) goto L_0x022c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "postCheckRingtone: "
            r14.append(r0)
            java.lang.String r0 = nj2.C61768p.f175594i
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "MicroMsg.RingtoneManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r14)
            java.lang.String r14 = nj2.C61768p.f175594i
            java.lang.String r0 = ""
            nj2.C61768p.f175594i = r0
            a14.z1 r0 = nj2.C61768p.f175593h
            if (r0 == 0) goto L_0x00c9
            a14.C53973z1.C53974a.m60623a(r0, r5, r6, r5)
        L_0x00c9:
            a14.n0 r7 = nj2.C61768p.f175592g
            r8 = 0
            r9 = 0
            nj2.q r10 = new nj2.q
            r10.<init>(r14, r5)
            r11 = 3
            r12 = 0
            a14.z1 r14 = a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
            nj2.C61768p.f175593h = r14
            goto L_0x022c
        L_0x00dc:
            java.lang.Object[] r14 = new java.lang.Object[r1]
            java.lang.String r2 = "Received start Intent "
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r3, r2, r14)
            d03.a r14 = r13.f192052d
            if (r14 != 0) goto L_0x00ee
            java.lang.String r14 = "media info not ready "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r14)
            return
        L_0x00ee:
            zj2.b r2 = r13.f192051c
            if (r2 == 0) goto L_0x0102
            java.lang.String r14 = r14.f165947s
            d03.a r2 = r13.f192049a
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = r2.f165947s
            goto L_0x00fc
        L_0x00fb:
            r2 = r5
        L_0x00fc:
            boolean r14 = gy3.C87412m.m108589b(r14, r2)
            if (r14 != 0) goto L_0x01f9
        L_0x0102:
            java.lang.String r14 = "player not ready, recreate player and start play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            java.lang.String r14 = "initPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            zj2.b r14 = r13.f192051c
            if (r14 == 0) goto L_0x011d
            r14.mo36981k()
            zj2.b r14 = r13.f192051c
            if (r14 == 0) goto L_0x011b
            r14.mo36978h()
        L_0x011b:
            r13.f192051c = r5
        L_0x011d:
            p13.a r14 = r13.f192064p
            java.lang.String r2 = "vibrate player no release"
            if (r14 == 0) goto L_0x0130
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            p13.a r14 = r13.f192064p
            if (r14 == 0) goto L_0x012e
            r14.mo87248c()
        L_0x012e:
            r13.f192064p = r5
        L_0x0130:
            d03.a r14 = r13.f192052d
            wj2.c r4 = r13.f192053e
            if (r14 == 0) goto L_0x01f9
            if (r4 == 0) goto L_0x01f9
            boolean r7 = r4.f190070c
            r14.f165940l = r7
            boolean r7 = r13.f192055g
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "create ringtonePlayer, mediaInfo:"
            r8.append(r9)
            r8.append(r14)
            java.lang.String r9 = ", soundInfo:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = ", isOutCall:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.RingtonePlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            boolean r8 = r14.f165933e
            if (r8 == 0) goto L_0x016e
            zj2.a r8 = new zj2.a
            r8.<init>(r14, r4, r7)
            goto L_0x0173
        L_0x016e:
            zj2.i r8 = new zj2.i
            r8.<init>(r14, r4, r7)
        L_0x0173:
            r13.f192051c = r8
            float r14 = r13.f192057i
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x017f
            r10 = 1
            goto L_0x0180
        L_0x017f:
            r10 = 0
        L_0x0180:
            if (r10 != 0) goto L_0x018f
            if (r9 != 0) goto L_0x0185
            r1 = 1
        L_0x0185:
            if (r1 != 0) goto L_0x018d
            r8.mo36971a(r14, r14)
            r13.f192057i = r7
            goto L_0x018f
        L_0x018d:
            r13.f192057i = r14
        L_0x018f:
            zj2.b r14 = r13.f192051c
            if (r14 == 0) goto L_0x0198
            long r7 = r13.f192054f
            r14.mo36977g(r7)
        L_0x0198:
            wj2.d r14 = r4.f190068a
            if (r14 != r0) goto L_0x01f9
            zj2.b r14 = r13.f192051c
            if (r14 == 0) goto L_0x01a8
            zj2.d r0 = new zj2.d
            r0.<init>(r13)
            r14.mo36980j(r0)
        L_0x01a8:
            boolean r14 = r13.f192065q
            if (r14 == 0) goto L_0x01f9
            p13.a r14 = r13.f192064p
            if (r14 == 0) goto L_0x01b3
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x01b3:
            p13.a r14 = new p13.a
            r14.<init>()
            r13.f192064p = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "init vibrate in shake with music  "
            r14.append(r0)
            p13.a r0 = r13.f192064p
            r14.append(r0)
            r0 = 32
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            wj2.f r14 = r13.f192050b
            if (r14 == 0) goto L_0x01f9
            gk2.a r14 = r14.mo90178i()
            a14.z1 r0 = r13.f192062n
            if (r0 == 0) goto L_0x01e4
            a14.C53973z1.C53974a.m60623a(r0, r5, r6, r5)
        L_0x01e4:
            r13.f192062n = r5
            a14.n0 r7 = r13.f192063o
            r8 = 0
            r9 = 0
            zj2.e r10 = new zj2.e
            r10.<init>(r13, r14, r5)
            r11 = 3
            r12 = 0
            a14.z1 r14 = a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
            r13.f192062n = r14
            r13.f192046B = r6
        L_0x01f9:
            r13.mo90864c()
            goto L_0x022c
        L_0x01fd:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Received pause Intent and player is "
            r14.append(r0)
            zj2.b r0 = r13.f192051c
            r14.append(r0)
            r14.append(r2)
            p13.a r0 = r13.f192064p
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
            p13.a r14 = r13.f192064p
            if (r14 == 0) goto L_0x0222
            r14.mo87248c()
        L_0x0222:
            zj2.b r14 = r13.f192051c
            if (r14 == 0) goto L_0x0229
            r14.mo36975e()
        L_0x0229:
            r13.mo90866e(r1)
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zj2.C66862f.mo90865d(wj2.b):void");
    }

    /* renamed from: e */
    public final void mo90866e(boolean z) {
        C53973z1 z1Var = this.f192060l;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f192060l = null;
        this.f192060l = C53895h.m60466d(this.f192061m, (C66212f) null, (C53934p0) null, new C66863b(z, (C15601d<? super C66863b>) null), 3, (Object) null);
    }

    /* renamed from: f */
    public final void mo90867f(boolean z) {
        int i;
        int i2 = z ? 0 : C11171e.m11046c(21) ? 3 : 2;
        if ((z && (i = C107835h0.f322846c.f322704N) > -1) || (!z && (i = C107835h0.f322846c.f322700L) > -1)) {
            i2 = i;
        }
        C110248b.C110249a aVar = C110248b.f329777h;
        if (i2 != aVar.mo161661f()) {
            Log.m105925i("MicroMsg.RingtoneServiceHelper", "set AudioManager mode: %s", Integer.valueOf(i2));
            aVar.mo161669n(i2);
        }
        if (z != aVar.mo161667l()) {
            Log.m105925i("MicroMsg.RingtoneServiceHelper", "set AudioManager speakerphoneOn: %s", Boolean.valueOf(z));
            C110066a b = aVar.mo161657b();
            b.f329356f = z;
            b.f329358h.setSpeakerphoneOn(z);
        }
    }
}
