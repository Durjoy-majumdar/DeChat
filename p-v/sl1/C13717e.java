package sl1;

import al1.C0082q;
import android.content.Context;
import android.os.Bundle;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import dj1.C7339i0;
import eb0.C31543z5;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import ok1.C62042e;
import pe3.C89349b;
import rl1.C13022d0;
import rl1.C13043j0;
import rl1.C13050l0;
import rx3.C13598b0;
import te3.C48770aw0;
import te3.C50617o01;
import te3.C52204z21;
import zt3.C119157j;

/* renamed from: sl1.e */
public final class C13717e implements C13712a {

    /* renamed from: d */
    public final Context f38800d;

    /* renamed from: e */
    public final C45795b f38801e;

    /* renamed from: f */
    public final C58124b f38802f;

    /* renamed from: g */
    public final String f38803g = "FinderLiveLotteryBubblePresenter";

    /* renamed from: h */
    public C13713b f38804h;

    /* renamed from: i */
    public String f38805i = "";

    /* renamed from: j */
    public int f38806j;

    /* renamed from: n */
    public final int f38807n = 10;

    /* renamed from: o */
    public volatile boolean f38808o;

    /* renamed from: p */
    public final int f38809p;

    /* renamed from: q */
    public final int f38810q;

    /* renamed from: r */
    public final String f38811r;

    /* renamed from: s */
    public final Runnable f38812s;

    /* renamed from: t */
    public int f38813t;

    /* renamed from: u */
    public MTimerHandler f38814u;

    /* renamed from: sl1.e$a */
    public static final class C13718a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13717e f38815d;

        /* renamed from: sl1.e$a$a */
        public static final class C13719a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C13717e f38816d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13719a(C13717e eVar) {
                super(0);
                this.f38816d = eVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
                r2 = r2.f509d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r5 = this;
                    java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
                    sl1.e r1 = r5.f38816d
                    fj1.b r1 = r1.f38801e
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                    rl1.d0 r1 = (rl1.C13022d0) r1
                    al1.q r1 = r1.f37098n
                    r2 = 1
                    if (r1 != 0) goto L_0x0012
                    goto L_0x0014
                L_0x0012:
                    r1.f512g = r2
                L_0x0014:
                    sl1.e r1 = r5.f38816d
                    fj1.b r1 = r1.f38801e
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                    rl1.d0 r1 = (rl1.C13022d0) r1
                    al1.q r1 = r1.f37098n
                    if (r1 == 0) goto L_0x0027
                    boolean r1 = r1.f511f
                    if (r1 != r2) goto L_0x0027
                    goto L_0x0028
                L_0x0027:
                    r2 = 0
                L_0x0028:
                    if (r2 != 0) goto L_0x0060
                    sl1.e r1 = r5.f38816d
                    fj1.b r1 = r1.f38801e
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
                    rl1.d0 r1 = (rl1.C13022d0) r1
                    sl1.e r2 = r5.f38816d
                    fj1.b r2 = r2.f38801e
                    androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
                    rl1.d0 r2 = (rl1.C13022d0) r2
                    al1.q r2 = r2.f37098n
                    if (r2 == 0) goto L_0x0049
                    te3.z21 r2 = r2.f509d
                    if (r2 == 0) goto L_0x0049
                    java.lang.String r2 = r2.f145640d
                    goto L_0x004a
                L_0x0049:
                    r2 = 0
                L_0x004a:
                    sl1.e r3 = r5.f38816d
                    fj1.b r3 = r3.f38801e
                    androidx.lifecycle.i0 r3 = r3.mo71262a(r0)
                    rl1.d0 r3 = (rl1.C13022d0) r3
                    boolean r3 = r3.mo12541g3()
                    rl1.i0 r4 = new rl1.i0
                    r4.<init>(r3, r1, r2)
                    o40.C61926c.m72668M(r4)
                L_0x0060:
                    sl1.e r1 = r5.f38816d
                    java.lang.String r1 = r1.f38803g
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "closeBubbleTask running lotteryInfo:"
                    r2.append(r3)
                    sl1.e r3 = r5.f38816d
                    fj1.b r3 = r3.f38801e
                    androidx.lifecycle.i0 r0 = r3.mo71262a(r0)
                    rl1.d0 r0 = (rl1.C13022d0) r0
                    al1.q r0 = r0.f37098n
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: sl1.C13717e.C13718a.C13719a.invoke():java.lang.Object");
            }
        }

        public C13718a(C13717e eVar) {
            this.f38815d = eVar;
        }

        public final void run() {
            C58124b bVar;
            C13717e eVar = this.f38815d;
            C58124b bVar2 = eVar.f38802f;
            C56032b bVar3 = bVar2 instanceof C56032b ? (C56032b) bVar2 : null;
            if (bVar3 != null && !bVar3.isDestroyed()) {
                C0082q qVar = ((C13022d0) eVar.f38801e.mo71262a(C13022d0.class)).f37098n;
                boolean z = true;
                if (qVar == null || qVar.f506a != 1) {
                    z = false;
                }
                if (!z && (bVar = eVar.f38802f) != null) {
                    C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_HIDE, (Bundle) null, 2, (Object) null);
                }
            }
            C61926c.m72668M(new C13719a(this.f38815d));
        }
    }

    /* renamed from: sl1.e$b */
    public static final class C13720b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13717e f38817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13720b(C13717e eVar) {
            super(0);
            this.f38817d = eVar;
        }

        public Object invoke() {
            if (!C62042e.f176370a.mo87087i1(this.f38817d.f38801e, (LinkedList<C48770aw0>) null)) {
                this.f38817d.mo13102t();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sl1.e$c */
    public static final class C13721c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13717e f38818d;

        /* renamed from: e */
        public final /* synthetic */ C0082q f38819e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13721c(C13717e eVar, C0082q qVar) {
            super(0);
            this.f38818d = eVar;
            this.f38819e = qVar;
        }

        public Object invoke() {
            String str = this.f38818d.f38803g;
            Log.m105924i(str, "resumeStatus statusResume:" + this.f38818d.f38808o + ",lotteryInfo:" + this.f38819e);
            if (this.f38819e.f509d != null && !this.f38818d.f38808o) {
                this.f38818d.f38808o = true;
                C13729k e = C13717e.m13022e(this.f38818d, this.f38819e);
                e.f38832e = true;
                String str2 = this.f38818d.f38803g;
                Log.m105924i(str2, "resumeStatus " + e);
                this.f38818d.mo13098G(e.f38828a, e.f38829b, e.f38831d, e.f38832e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sl1.e$d */
    public static final class C13722d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C13717e f38820d;

        public C13722d(C13717e eVar) {
            this.f38820d = eVar;
        }

        public final boolean onTimerExpired() {
            C13717e eVar = this.f38820d;
            eVar.getClass();
            C61926c.m72668M(new C13726g(eVar));
            return true;
        }
    }

    /* renamed from: sl1.e$e */
    public static final class C13723e implements C7339i0.C7340a {

        /* renamed from: a */
        public final /* synthetic */ C13717e f38821a;

        public C13723e(C13717e eVar) {
            this.f38821a = eVar;
        }

        /* renamed from: a */
        public void mo8508a(int i, int i2, String str, C50617o01 o012) {
            Class cls = C13022d0.class;
            C87412m.m108594g(o012, "resp");
            if (i == 0 && i2 == 0) {
                ((C13022d0) this.f38821a.f38801e.mo71262a(cls)).mo12537L3(o012.f138872d);
                ((C13022d0) this.f38821a.f38801e.mo71262a(cls)).mo12545l3(o012);
            }
        }
    }

    /* renamed from: sl1.e$f */
    public static final class C13724f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0082q f38822d;

        /* renamed from: e */
        public final /* synthetic */ C13717e f38823e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13724f(C0082q qVar, C13717e eVar) {
            super(0);
            this.f38822d = qVar;
            this.f38823e = eVar;
        }

        public Object invoke() {
            C0082q qVar = this.f38822d;
            if (qVar.f509d != null) {
                C13729k e = C13717e.m13022e(this.f38823e, qVar);
                String str = this.f38823e.f38803g;
                Log.m105924i(str, "updateStatus " + e);
                boolean z = e.f38828a;
                if (z) {
                    this.f38823e.mo13098G(z, e.f38829b, e.f38831d, e.f38832e);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C13717e(Context context, C45795b bVar, C58124b bVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f38800d = context;
        this.f38801e = bVar;
        this.f38802f = bVar2;
        C32444a aVar = C32444a.f86121a;
        this.f38809p = C32444a.f86057G0.mo60266n().intValue();
        this.f38810q = C32444a.f86061H0.mo60266n().intValue();
        this.f38811r = "LOTTERY_BUBBLE_CLOSE_TAG";
        this.f38812s = new C13718a(this);
        this.f38814u = new MTimerHandler("LiveLotteryBubble::Timer", (MTimerHandler.CallBack) new C13722d(this), true);
    }

    /* renamed from: e */
    public static final C13729k m13022e(C13717e eVar, C0082q qVar) {
        int i;
        int i2;
        C52204z21 z212;
        C52204z21 z213;
        C52204z21 z214;
        eVar.getClass();
        Class cls = C13022d0.class;
        C13729k kVar = new C13729k(false, false, 0, 0, false, 31, (C8480h) null);
        C52204z21 z215 = qVar.f509d;
        String str = null;
        String str2 = z215 != null ? z215.f145640d : null;
        C0082q qVar2 = ((C13022d0) eVar.f38801e.mo71262a(cls)).f37098n;
        if (!(qVar2 == null || (z214 = qVar2.f509d) == null)) {
            str = z214.f145640d;
        }
        boolean z = true;
        boolean z2 = false;
        if (((C13022d0) eVar.f38801e.mo71262a(cls)).f37098n != null) {
            if ((str2 == null || str2.length() == 0) || C87412m.m108589b(str2, str)) {
                C61926c.m72668M(new C13050l0(qVar, (C13022d0) eVar.f38801e.mo71262a(cls)));
                C0082q qVar3 = ((C13022d0) eVar.f38801e.mo71262a(cls)).f37098n;
                i = (qVar3 == null || (z213 = qVar3.f509d) == null) ? 0 : z213.f145648o;
                C0082q qVar4 = ((C13022d0) eVar.f38801e.mo71262a(cls)).f37098n;
                i2 = qVar4 != null ? qVar4.f506a : 0;
                if (i == i2 || !(i2 == 1 || (i2 == 2 && (i == 3 || i == 4)))) {
                    z = false;
                }
                kVar.f38828a = z;
                kVar.f38829b = z2;
                kVar.f38831d = i;
                kVar.f38830c = i2;
                return kVar;
            }
        }
        C61926c.m72668M(new C13043j0((C13022d0) eVar.f38801e.mo71262a(cls), qVar));
        C0082q qVar5 = ((C13022d0) eVar.f38801e.mo71262a(cls)).f37098n;
        i = (qVar5 == null || (z212 = qVar5.f509d) == null) ? 0 : z212.f145648o;
        C0082q qVar6 = ((C13022d0) eVar.f38801e.mo71262a(cls)).f37098n;
        int i3 = qVar6 != null ? qVar6.f506a : 0;
        eVar.f38806j = 0;
        i2 = i3;
        z2 = true;
        kVar.f38828a = z;
        kVar.f38829b = z2;
        kVar.f38831d = i;
        kVar.f38830c = i2;
        return kVar;
    }

    /* renamed from: B */
    public void mo13087B(C0082q qVar) {
        C87412m.m108594g(qVar, "lotteryInfoWrapper");
        C61926c.m72668M(new C13721c(this, qVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13098G(boolean r18, boolean r19, int r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            java.lang.Class<rl1.d0> r4 = rl1.C13022d0.class
            r5 = 1
            r0.f38808o = r5
            zt3.t r6 = zt3.C119157j.f356862d
            java.lang.String r7 = r0.f38811r
            zt3.j r6 = (zt3.C119157j) r6
            r6.mo183894y(r7)
            fj1.b r6 = r0.f38801e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            rl1.d0 r6 = (rl1.C13022d0) r6
            al1.q r6 = r6.f37098n
            if (r6 != 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            r7 = r20
            r6.f506a = r7
        L_0x0027:
            fj1.b r6 = r0.f38801e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            rl1.d0 r6 = (rl1.C13022d0) r6
            al1.q r6 = r6.f37098n
            r7 = 4
            r8 = 0
            if (r6 == 0) goto L_0x003b
            int r6 = r6.f506a
            if (r6 != r7) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r9 = 0
            if (r6 == 0) goto L_0x0063
            fj1.b r6 = r0.f38801e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            rl1.d0 r6 = (rl1.C13022d0) r6
            fj1.b r10 = r0.f38801e
            androidx.lifecycle.i0 r10 = r10.mo71262a(r4)
            rl1.d0 r10 = (rl1.C13022d0) r10
            al1.q r10 = r10.f37098n
            if (r10 == 0) goto L_0x005a
            te3.z21 r10 = r10.f509d
            if (r10 == 0) goto L_0x005a
            java.lang.String r10 = r10.f145640d
            goto L_0x005b
        L_0x005a:
            r10 = r9
        L_0x005b:
            rl1.i0 r11 = new rl1.i0
            r11.<init>(r8, r6, r10)
            o40.C61926c.m72668M(r11)
        L_0x0063:
            fj1.b r6 = r0.f38801e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            rl1.d0 r6 = (rl1.C13022d0) r6
            al1.q r6 = r6.f37098n
            if (r6 == 0) goto L_0x0072
            te3.z21 r6 = r6.f509d
            goto L_0x0073
        L_0x0072:
            r6 = r9
        L_0x0073:
            com.tencent.mm.sdk.platformtools.MTimerHandler r10 = r0.f38814u
            boolean r10 = r10.stopped()
            java.lang.String r11 = r0.f38803g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "updateTimer statusChange:"
            r12.append(r13)
            r12.append(r1)
            java.lang.String r13 = ",newLottery:"
            r12.append(r13)
            r12.append(r2)
            java.lang.String r14 = ",lotteryInfo is null:"
            r12.append(r14)
            if (r6 != 0) goto L_0x009a
            r14 = 1
            goto L_0x009b
        L_0x009a:
            r14 = 0
        L_0x009b:
            r12.append(r14)
            java.lang.String r14 = ",timerStoped:"
            r12.append(r14)
            r12.append(r10)
            java.lang.String r10 = ",resumeState:"
            r12.append(r10)
            r12.append(r3)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            fj1.b r10 = r0.f38801e
            androidx.lifecycle.i0 r10 = r10.mo71262a(r4)
            rl1.d0 r10 = (rl1.C13022d0) r10
            al1.q r10 = r10.f37098n
            if (r10 == 0) goto L_0x00c7
            int r10 = r10.f506a
            if (r10 != r5) goto L_0x00c7
            r10 = 1
            goto L_0x00c8
        L_0x00c7:
            r10 = 0
        L_0x00c8:
            if (r10 == 0) goto L_0x012b
            if (r6 == 0) goto L_0x012b
            if (r2 != 0) goto L_0x00d0
            if (r3 == 0) goto L_0x0131
        L_0x00d0:
            java.lang.String r3 = "startTimer"
            r0.mo13100n(r3)
            ok1.e r3 = ok1.C62042e.f176370a
            int r10 = r6.f145641e
            int r11 = r6.f145642f
            int r12 = r6.f145643g
            int r3 = r3.mo87099n0(r10, r11, r12)
            r0.f38813t = r3
            java.lang.String r10 = ""
            if (r3 <= 0) goto L_0x00f8
            java.lang.String r3 = r6.f145640d
            if (r3 != 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r10 = r3
        L_0x00ee:
            r0.f38805i = r10
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f38814u
            r10 = 1000(0x3e8, double:4.94E-321)
            r3.startTimer(r10)
            goto L_0x00fd
        L_0x00f8:
            r0.f38805i = r10
            r0.mo13103x(r3)
        L_0x00fd:
            java.lang.String r3 = r0.f38803g
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "startTimer id:"
            r10.append(r11)
            java.lang.String r6 = r6.f145640d
            r10.append(r6)
            java.lang.String r6 = " remainTimeSecond:"
            r10.append(r6)
            int r6 = r0.f38813t
            r10.append(r6)
            java.lang.String r6 = ", timerLotteryId:"
            r10.append(r6)
            java.lang.String r6 = r0.f38805i
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            goto L_0x0131
        L_0x012b:
            java.lang.String r3 = "updateTimer"
            r0.mo13100n(r3)
        L_0x0131:
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x0144
            int r3 = r3.f506a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0145
        L_0x0144:
            r3 = r9
        L_0x0145:
            java.lang.String r6 = " participated:"
            java.lang.String r10 = ",statusChange:"
            r12 = 2
            if (r3 != 0) goto L_0x014d
            goto L_0x0186
        L_0x014d:
            int r14 = r3.intValue()
            if (r14 != r5) goto L_0x0186
            if (r1 == 0) goto L_0x0163
            sl1.b r2 = r0.f38804h
            if (r2 == 0) goto L_0x015c
            r2.mo11422p()
        L_0x015c:
            sl1.b r2 = r0.f38804h
            if (r2 == 0) goto L_0x0163
            r2.mo11421k0()
        L_0x0163:
            d60.b r2 = r0.f38802f
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_SHOW
            d60.C58124b.C7172a.m7372a(r2, r3, r9, r12, r9)
            if (r1 == 0) goto L_0x0179
            sl1.b r2 = r0.f38804h
            if (r2 == 0) goto L_0x019d
            sl1.h r3 = new sl1.h
            r3.<init>(r0)
            r2.mo13094p0(r3)
            goto L_0x019d
        L_0x0179:
            sl1.b r2 = r0.f38804h
            if (r2 == 0) goto L_0x019d
            sl1.i r3 = new sl1.i
            r3.<init>(r0)
            r2.mo13093b0(r3)
            goto L_0x019d
        L_0x0186:
            if (r3 != 0) goto L_0x0189
            goto L_0x01a1
        L_0x0189:
            int r14 = r3.intValue()
            if (r14 != r7) goto L_0x01a1
            java.lang.String r2 = r0.f38803g
            java.lang.String r3 = "cancel LotteryBubble!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            d60.b r2 = r0.f38802f
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_HIDE
            d60.C58124b.C7172a.m7372a(r2, r3, r9, r12, r9)
        L_0x019d:
            r16 = r6
            goto L_0x03b2
        L_0x01a1:
            java.lang.String r14 = ",cardShowing:"
            java.lang.String r15 = ",lastDoneLottery:"
            java.lang.String r8 = ",delayDuration:"
            if (r3 != 0) goto L_0x01ab
            goto L_0x02a6
        L_0x01ab:
            int r7 = r3.intValue()
            if (r7 != r12) goto L_0x02a6
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x01c4
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x01c4
            int r3 = r3.f145649p
            goto L_0x01c5
        L_0x01c4:
            r3 = 0
        L_0x01c5:
            boolean r3 = o40.C61926c.m72696u(r3, r5)
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r7 = r7.mo87027N0()
            java.lang.String r5 = r0.f38803g
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = "doLotteryBubbleComputingLogic isAnchor:"
            r11.append(r9)
            r11.append(r7)
            r11.append(r6)
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            sl1.b r3 = r0.f38804h
            if (r3 == 0) goto L_0x01f2
            r3.mo13097w0()
        L_0x01f2:
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x0205
            boolean r3 = r3.f510e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0206
        L_0x0205:
            r3 = 0
        L_0x0206:
            fj1.b r5 = r0.f38801e
            androidx.lifecycle.i0 r5 = r5.mo71262a(r4)
            rl1.d0 r5 = (rl1.C13022d0) r5
            al1.q r5 = r5.f37098n
            if (r5 == 0) goto L_0x0219
            boolean r5 = r5.f511f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x021a
        L_0x0219:
            r5 = 0
        L_0x021a:
            fj1.b r7 = r0.f38801e
            androidx.lifecycle.i0 r7 = r7.mo71262a(r4)
            rl1.d0 r7 = (rl1.C13022d0) r7
            al1.q r7 = r7.f37098n
            if (r7 == 0) goto L_0x0229
            te3.z21 r7 = r7.f509d
            goto L_0x022a
        L_0x0229:
            r7 = 0
        L_0x022a:
            if (r7 == 0) goto L_0x022f
            java.lang.String r9 = r7.f145640d
            goto L_0x0230
        L_0x022f:
            r9 = 0
        L_0x0230:
            int r11 = r0.f38810q
            int r7 = r0.mo13101q(r1, r7, r11)
            java.lang.String r11 = r0.f38803g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r16 = r6
            java.lang.String r6 = "showComputingBubble localLotteryId:"
            r12.append(r6)
            r12.append(r9)
            r12.append(r10)
            r12.append(r1)
            r12.append(r13)
            r12.append(r2)
            java.lang.String r2 = ",BUBBLE_COMPUTING_STAY_DURATION:"
            r12.append(r2)
            int r2 = r0.f38810q
            r12.append(r2)
            r12.append(r8)
            r12.append(r7)
            r12.append(r15)
            r12.append(r3)
            r12.append(r14)
            r12.append(r5)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            if (r9 == 0) goto L_0x029b
            if (r7 <= 0) goto L_0x029b
            zt3.t r2 = zt3.C119157j.f356862d
            java.lang.String r3 = r0.f38811r
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183894y(r3)
            zt3.t r2 = zt3.C119157j.f356862d
            java.lang.Runnable r3 = r0.f38812s
            long r5 = (long) r7
            java.lang.String r7 = r0.f38811r
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183879j(r3, r5, r7)
            d60.b r2 = r0.f38802f
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_SHOW
            r5 = 2
            r6 = 0
            d60.C58124b.C7172a.m7372a(r2, r3, r6, r5, r6)
            goto L_0x03b2
        L_0x029b:
            r5 = 2
            r6 = 0
            d60.b r2 = r0.f38802f
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_HIDE
            d60.C58124b.C7172a.m7372a(r2, r3, r6, r5, r6)
            goto L_0x03b2
        L_0x02a6:
            r16 = r6
            if (r3 != 0) goto L_0x02ac
            goto L_0x03a9
        L_0x02ac:
            int r3 = r3.intValue()
            r5 = 3
            if (r3 != r5) goto L_0x03a9
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x02c6
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x02c6
            int r3 = r3.f145649p
            goto L_0x02c7
        L_0x02c6:
            r3 = 0
        L_0x02c7:
            r5 = 1
            boolean r3 = o40.C61926c.m72696u(r3, r5)
            ok1.e r5 = ok1.C62042e.f176370a
            boolean r5 = r5.mo87027N0()
            java.lang.String r6 = r0.f38803g
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "doLotteryBubbleDoneLogic isAnchor:"
            r7.append(r9)
            r7.append(r5)
            r5 = r16
            r7.append(r5)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            zt3.t r3 = zt3.C119157j.f356862d
            java.lang.String r6 = r0.f38811r
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183894y(r6)
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x030c
            boolean r3 = r3.f510e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x030d
        L_0x030c:
            r3 = 0
        L_0x030d:
            fj1.b r6 = r0.f38801e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            rl1.d0 r6 = (rl1.C13022d0) r6
            al1.q r6 = r6.f37098n
            if (r6 == 0) goto L_0x0320
            boolean r6 = r6.f511f
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0321
        L_0x0320:
            r6 = 0
        L_0x0321:
            fj1.b r7 = r0.f38801e
            androidx.lifecycle.i0 r7 = r7.mo71262a(r4)
            rl1.d0 r7 = (rl1.C13022d0) r7
            al1.q r7 = r7.f37098n
            if (r7 == 0) goto L_0x0330
            te3.z21 r7 = r7.f509d
            goto L_0x0331
        L_0x0330:
            r7 = 0
        L_0x0331:
            if (r7 == 0) goto L_0x0336
            java.lang.String r9 = r7.f145640d
            goto L_0x0337
        L_0x0336:
            r9 = 0
        L_0x0337:
            int r11 = r0.f38809p
            int r7 = r0.mo13101q(r1, r7, r11)
            java.lang.String r11 = r0.f38803g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r16 = r5
            java.lang.String r5 = "showFinishBubble localLotteryId:"
            r12.append(r5)
            r12.append(r9)
            r12.append(r10)
            r12.append(r1)
            r12.append(r13)
            r12.append(r2)
            java.lang.String r2 = ",BUBBLE_STAY_DURATION:"
            r12.append(r2)
            int r2 = r0.f38809p
            r12.append(r2)
            r12.append(r8)
            r12.append(r7)
            r12.append(r15)
            r12.append(r3)
            r12.append(r14)
            r12.append(r6)
            java.lang.String r2 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            if (r9 == 0) goto L_0x039f
            if (r7 <= 0) goto L_0x039f
            sl1.b r2 = r0.f38804h
            if (r2 == 0) goto L_0x0389
            r2.mo13095r0()
        L_0x0389:
            zt3.t r2 = zt3.C119157j.f356862d
            java.lang.Runnable r3 = r0.f38812s
            long r5 = (long) r7
            java.lang.String r7 = r0.f38811r
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183879j(r3, r5, r7)
            d60.b r2 = r0.f38802f
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_SHOW
            r5 = 2
            r6 = 0
            d60.C58124b.C7172a.m7372a(r2, r3, r6, r5, r6)
            goto L_0x03b2
        L_0x039f:
            r5 = 2
            r6 = 0
            d60.b r2 = r0.f38802f
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_HIDE
            d60.C58124b.C7172a.m7372a(r2, r3, r6, r5, r6)
            goto L_0x03b2
        L_0x03a9:
            r5 = 2
            r6 = 0
            d60.b r2 = r0.f38802f
            d60.b$b r3 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_BUBBLE_HIDE
            d60.C58124b.C7172a.m7372a(r2, r3, r6, r5, r6)
        L_0x03b2:
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.String r3 = r0.f38803g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "updateCard localStatus:"
            r5.append(r6)
            fj1.b r6 = r0.f38801e
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            rl1.d0 r6 = (rl1.C13022d0) r6
            al1.q r6 = r6.f37098n
            if (r6 == 0) goto L_0x03d4
            int r6 = r6.f506a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x03d5
        L_0x03d4:
            r6 = 0
        L_0x03d5:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x03f3
            int r3 = r3.f506a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = r3
            goto L_0x03f4
        L_0x03f3:
            r6 = 0
        L_0x03f4:
            if (r6 != 0) goto L_0x03f7
            goto L_0x03fe
        L_0x03f7:
            int r3 = r6.intValue()
            r5 = 1
            if (r3 == r5) goto L_0x058c
        L_0x03fe:
            if (r6 != 0) goto L_0x0401
            goto L_0x0413
        L_0x0401:
            int r3 = r6.intValue()
            r5 = 4
            if (r3 != r5) goto L_0x0413
            d60.b r1 = r0.f38802f
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE_COUNTDOWN
            r3 = 2
            r4 = 0
            d60.C58124b.C7172a.m7372a(r1, r2, r4, r3, r4)
            goto L_0x058c
        L_0x0413:
            r3 = 2
            java.lang.String r5 = "PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS"
            java.lang.String r7 = ",isAnchor:"
            if (r6 != 0) goto L_0x041c
            goto L_0x04e1
        L_0x041c:
            int r8 = r6.intValue()
            if (r8 != r3) goto L_0x04e1
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x0436
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x0436
            int r8 = r3.f145649p
            r3 = 1
            goto L_0x0438
        L_0x0436:
            r3 = 1
            r8 = 0
        L_0x0438:
            boolean r6 = o40.C61926c.m72696u(r8, r3)
            ok1.e r3 = ok1.C62042e.f176370a
            boolean r3 = r3.mo87027N0()
            fj1.b r8 = r0.f38801e
            androidx.lifecycle.i0 r8 = r8.mo71262a(r2)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.mo75999e4()
            java.lang.String r9 = r0.f38803g
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "doLotteryCardComputingLogic liveState:"
            r11.append(r12)
            fj1.b r12 = r0.f38801e
            androidx.lifecycle.i0 r2 = r12.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154295b1
            r11.append(r2)
            r11.append(r7)
            r11.append(r3)
            java.lang.String r2 = " localStatus:"
            r11.append(r2)
            fj1.b r2 = r0.f38801e
            androidx.lifecycle.i0 r2 = r2.mo71262a(r4)
            rl1.d0 r2 = (rl1.C13022d0) r2
            al1.q r2 = r2.f37098n
            if (r2 == 0) goto L_0x0485
            int r2 = r2.f506a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0486
        L_0x0485:
            r2 = 0
        L_0x0486:
            r11.append(r2)
            java.lang.String r2 = ",participated:"
            r11.append(r2)
            r11.append(r6)
            r11.append(r10)
            r11.append(r1)
            java.lang.String r2 = ",computingGetLotteryRecordTimes:"
            r11.append(r2)
            int r2 = r0.f38806j
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            if (r1 == 0) goto L_0x04c7
            if (r8 == 0) goto L_0x04c7
            if (r3 != 0) goto L_0x04b0
            if (r6 == 0) goto L_0x04c7
        L_0x04b0:
            r17.mo13099N()
            d60.b r1 = r0.f38802f
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_CARD_SHOW
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = 1
            r3.putBoolean(r5, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r1.statusChange(r2, r3)
            goto L_0x058c
        L_0x04c7:
            if (r8 == 0) goto L_0x04d6
            int r1 = r0.f38806j
            int r2 = r1 + 1
            r0.f38806j = r2
            int r2 = r0.f38807n
            if (r1 >= r2) goto L_0x04d6
            r17.mo13099N()
        L_0x04d6:
            d60.b r1 = r0.f38802f
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE_COUNTDOWN
            r3 = 2
            r4 = 0
            d60.C58124b.C7172a.m7372a(r1, r2, r4, r3, r4)
            goto L_0x058c
        L_0x04e1:
            if (r6 != 0) goto L_0x04e5
            goto L_0x058c
        L_0x04e5:
            int r3 = r6.intValue()
            r6 = 3
            if (r3 != r6) goto L_0x058c
            fj1.b r3 = r0.f38801e
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            rl1.d0 r3 = (rl1.C13022d0) r3
            al1.q r3 = r3.f37098n
            if (r3 == 0) goto L_0x04ff
            te3.z21 r3 = r3.f509d
            if (r3 == 0) goto L_0x04ff
            int r3 = r3.f145649p
            goto L_0x0500
        L_0x04ff:
            r3 = 0
        L_0x0500:
            r6 = 1
            boolean r3 = o40.C61926c.m72696u(r3, r6)
            ok1.e r6 = ok1.C62042e.f176370a
            boolean r6 = r6.mo87027N0()
            fj1.b r8 = r0.f38801e
            androidx.lifecycle.i0 r4 = r8.mo71262a(r4)
            rl1.d0 r4 = (rl1.C13022d0) r4
            al1.q r4 = r4.f37098n
            if (r4 == 0) goto L_0x051a
            boolean r8 = r4.f508c
            goto L_0x051b
        L_0x051a:
            r8 = 0
        L_0x051b:
            fj1.b r4 = r0.f38801e
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.mo75999e4()
            java.lang.String r9 = r0.f38803g
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "doLotteryCardDoneLogic liveState:"
            r11.append(r12)
            fj1.b r12 = r0.f38801e
            androidx.lifecycle.i0 r2 = r12.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154295b1
            r11.append(r2)
            r11.append(r7)
            r11.append(r6)
            r2 = r16
            r11.append(r2)
            r11.append(r3)
            r11.append(r10)
            r11.append(r1)
            java.lang.String r2 = ", haveLottering:"
            r11.append(r2)
            r11.append(r8)
            java.lang.String r2 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            if (r8 != 0) goto L_0x0583
            if (r4 == 0) goto L_0x0583
            if (r1 == 0) goto L_0x0583
            if (r3 != 0) goto L_0x056d
            if (r6 == 0) goto L_0x0583
        L_0x056d:
            r17.mo13099N()
            d60.b r1 = r0.f38802f
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_CARD_SHOW
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = 1
            r3.putBoolean(r5, r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r1.statusChange(r2, r3)
            goto L_0x058c
        L_0x0583:
            d60.b r1 = r0.f38802f
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE_COUNTDOWN
            r3 = 2
            r4 = 0
            d60.C58124b.C7172a.m7372a(r1, r2, r4, r3, r4)
        L_0x058c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.C13717e.mo13098G(boolean, boolean, int, boolean):void");
    }

    /* renamed from: N */
    public final void mo13099N() {
        C54795n5 finderLiveAssistant;
        String str;
        C52204z21 z212;
        C58124b bVar = this.f38802f;
        C56032b bVar2 = bVar instanceof C56032b ? (C56032b) bVar : null;
        if (bVar2 != null && (finderLiveAssistant = bVar2.getFinderLiveAssistant()) != null) {
            C0082q qVar = ((C13022d0) ((C54991o) this.f38801e.mo71262a(C54991o.class)).business(C13022d0.class)).f37098n;
            if (qVar == null || (z212 = qVar.f509d) == null || (str = z212.f145640d) == null) {
                str = "";
            }
            finderLiveAssistant.mo75711O(str, (C89349b) null, new C13723e(this));
        }
    }

    /* renamed from: b */
    public void mo13088b() {
        C62042e eVar = C62042e.f176370a;
        Context context = this.f38800d;
        C45795b bVar = this.f38801e;
        String string = context.getString(C0966R.string.f8144ob);
        C87412m.m108593f(string, "context.getString(R.stri…ous_dialog_title_lottery)");
        String string2 = this.f38800d.getString(C0966R.string.f8142o9);
        C87412m.m108593f(string2, "context.getString(R.stri…ious_dialog_desc_lottery)");
        if (!eVar.mo87117t(context, bVar, string, string2, new C13720b(this))) {
            mo13102t();
        }
    }

    public int getCurrentStatus() {
        C0082q qVar = ((C13022d0) this.f38801e.mo71262a(C13022d0.class)).f37098n;
        if (qVar != null) {
            return qVar.f506a;
        }
        return 0;
    }

    /* renamed from: n */
    public final void mo13100n(String str) {
        String str2 = this.f38803g;
        Log.m105924i(str2, str + ":endTimer remainTimeSecond:" + this.f38813t + ", timerLotteryId:" + this.f38805i);
        this.f38814u.stopTimer();
    }

    public void onAttach(Object obj) {
        C13713b bVar = (C13713b) obj;
        C87412m.m108594g(bVar, "callback");
        Log.m105924i(this.f38803g, "onAttach");
        this.f38804h = bVar;
        bVar.mo13092a();
    }

    public void onDetach() {
        Log.m105924i(this.f38803g, "onDetach");
        C13713b bVar = this.f38804h;
        if (bVar != null) {
            bVar.reset();
        }
        this.f38804h = null;
        mo13100n("onDetach");
        ((C119157j) C119157j.f356862d).mo183894y(this.f38811r);
    }

    /* renamed from: q */
    public final int mo13101q(boolean z, C52204z21 z212, int i) {
        int i2 = i * 1000;
        if (z) {
            return i2;
        }
        int e = C31543z5.m39455e();
        int i3 = e - (z212 != null ? z212.f145642f : e);
        if (i3 <= 0) {
            return i2;
        }
        boolean z2 = true;
        if (1 > i3 || i3 >= i) {
            z2 = false;
        }
        if (z2) {
            return (i - i3) * 1000;
        }
        String str = this.f38803g;
        Log.m105924i(str, "getBubbleStayDuration serverTime:" + e + ",finishDuration:" + i3);
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [sl1.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13102t() {
        /*
            r11 = this;
            java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
            fj1.b r1 = r11.f38801e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            rl1.d0 r1 = (rl1.C13022d0) r1
            al1.q r1 = r1.f37098n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0043
            te3.z21 r1 = r1.f509d
            if (r1 == 0) goto L_0x0043
            te3.c31 r1 = r1.f145652s
            if (r1 == 0) goto L_0x0043
            boolean r4 = r1.f131479f
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r1.f131478e
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r4 = 0
            goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            if (r4 == 0) goto L_0x003a
            android.content.Context r1 = r11.f38800d
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131827901(0x7f111cbd, float:1.9288728E38)
            java.lang.String r1 = r1.getString(r4)
            goto L_0x003c
        L_0x003a:
            java.lang.String r1 = r1.f131478e
        L_0x003c:
            android.content.Context r4 = r11.f38800d
            nj3.C76912y0.m92773l(r4, r1)
            r1 = 0
            goto L_0x0044
        L_0x0043:
            r1 = 1
        L_0x0044:
            java.lang.String r4 = ""
            r5 = 0
            if (r1 != 0) goto L_0x0051
            java.lang.String r0 = r11.f38803g
            java.lang.String r1 = "customerOpenCard checkEnableOpenCard false!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x00ad
        L_0x0051:
            fj1.b r1 = r11.f38801e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            rl1.d0 r1 = (rl1.C13022d0) r1
            al1.q r1 = r1.f37098n
            if (r1 == 0) goto L_0x0064
            int r1 = r1.f506a
            r6 = 3
            if (r1 != r6) goto L_0x0064
            r1 = 1
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            if (r1 != 0) goto L_0x0097
            d60.b r1 = r11.f38802f
            boolean r6 = r1 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r6 == 0) goto L_0x0070
            com.tencent.mm.plugin.finder.live.view.b r1 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r1
            goto L_0x0071
        L_0x0070:
            r1 = r5
        L_0x0071:
            if (r1 == 0) goto L_0x00ad
            cj1.n5 r1 = r1.getFinderLiveAssistant()
            if (r1 == 0) goto L_0x00ad
            fj1.b r6 = r11.f38801e
            androidx.lifecycle.i0 r0 = r6.mo71262a(r0)
            rl1.d0 r0 = (rl1.C13022d0) r0
            al1.q r0 = r0.f37098n
            if (r0 == 0) goto L_0x008d
            te3.z21 r0 = r0.f509d
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r0.f145640d
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r0 = r4
        L_0x008e:
            sl1.f r6 = new sl1.f
            r6.<init>(r11)
            r1.mo75711O(r0, r5, r6)
            goto L_0x00ad
        L_0x0097:
            r11.mo13099N()
            d60.b r0 = r11.f38802f
            d60.b$b r1 = d60.C58124b.C58125b.FINDER_LIVE_LOTTERY_CARD_SHOW
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "PARAM_FINDER_LIVE_LOTTERY_CARD_SHOW_STATUS"
            r6.putBoolean(r7, r2)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r0.statusChange(r1, r6)
        L_0x00ad:
            fj1.b r0 = r11.f38801e
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75990Y3()
            if (r0 == 0) goto L_0x00df
            d60.b r0 = r11.f38802f
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
            if (r1 == 0) goto L_0x00c6
            com.tencent.mm.plugin.finder.live.view.b r0 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r0
            goto L_0x00c7
        L_0x00c6:
            r0 = r5
        L_0x00c7:
            if (r0 == 0) goto L_0x00df
            java.lang.Class<hq1.d> r1 = hq1.C60085d.class
            qj1.c r0 = r0.getPlugin(r1)
            hq1.d r0 = (hq1.C60085d) r0
            if (r0 == 0) goto L_0x00df
            hq1.e r0 = r0.f171450r
            if (r0 == 0) goto L_0x00df
            r0.mo84955a()
            r1 = 2019(0x7e3, float:2.829E-42)
            r0.mo84957c(r1)
        L_0x00df:
            d60.b r0 = r11.f38802f
            int r0 = r0.getLiveRole()
            if (r0 != r3) goto L_0x00f5
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.o r0 = (ak1.C54108o) r0
            ak1.f0$c r1 = ak1.C54067f0.C0051c.CLICK_LUCKY_BAG
            r0.Mx0(r1, r4)
            goto L_0x0134
        L_0x00f5:
            d60.b r0 = r11.f38802f
            int r0 = r0.getLiveRole()
            if (r0 != 0) goto L_0x0134
            sl1.b r0 = r11.f38804h
            boolean r1 = r0 instanceof og1.C62008a
            if (r1 == 0) goto L_0x0106
            r5 = r0
            og1.a r5 = (og1.C62008a) r5
        L_0x0106:
            r0 = 2
            if (r5 == 0) goto L_0x0117
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r1 = r5.f176277f
            if (r1 == 0) goto L_0x0113
            int r1 = r1.f159272i
            if (r1 != r0) goto L_0x0113
            r1 = 1
            goto L_0x0114
        L_0x0113:
            r1 = 0
        L_0x0114:
            if (r1 != r3) goto L_0x0117
            r2 = 1
        L_0x0117:
            if (r2 == 0) goto L_0x011b
            r8 = 2
            goto L_0x011c
        L_0x011b:
            r8 = 1
        L_0x011c:
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r4 = r0
            ak1.w r4 = (ak1.C54116w) r4
            ak1.f0$v0 r5 = ak1.C54067f0.C0071v0.CLICK_LUCKY_BAG
            r7 = 0
            r9 = 4
            r10 = 0
            java.lang.String r6 = ""
            ak1.C54116w.my0(r4, r5, r6, r7, r8, r9, r10)
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl1.C13717e.mo13102t():void");
    }

    /* renamed from: x */
    public final void mo13103x(int i) {
        mo13100n("onTimerEnd");
        C0082q qVar = ((C13022d0) this.f38801e.mo71262a(C13022d0.class)).f37098n;
        if (qVar != null && qVar.f506a == 1) {
            mo13098G(true, false, 2, false);
        }
    }

    /* renamed from: z0 */
    public void mo13090z0(C0082q qVar) {
        C87412m.m108594g(qVar, "lotteryInfoWrapper");
        C61926c.m72668M(new C13724f(qVar, this));
    }
}
