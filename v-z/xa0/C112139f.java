package xa0;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C59741c0;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p257w.C111640g;
import p257w.C37901h;
import p257w.C37907l;
import p257w.C37940v;
import p257w.C37946x;
import p759y.C112195b0;
import p759y.C112278q0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: xa0.f */
public final class C112139f implements C112195b0 {

    /* renamed from: a */
    public final C66244k f335745a;

    /* renamed from: b */
    public final C32226l<C66244k, Float> f335746b;

    /* renamed from: c */
    public final C37940v<Float> f335747c;

    /* renamed from: d */
    public final C37901h<Float> f335748d;

    /* renamed from: e */
    public final C60690y0 f335749e = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.page_snapper.SnapperFlingBehavior", mo125469f = "SnapperFlingBehavior.kt", mo125470l = {334, 383}, mo125471m = "performDecayFling")
    /* renamed from: xa0.f$a */
    public static final class C112140a extends C66704d {

        /* renamed from: d */
        public Object f335750d;

        /* renamed from: e */
        public Object f335751e;

        /* renamed from: f */
        public Object f335752f;

        /* renamed from: g */
        public Object f335753g;

        /* renamed from: h */
        public Object f335754h;

        /* renamed from: i */
        public int f335755i;

        /* renamed from: j */
        public /* synthetic */ Object f335756j;

        /* renamed from: n */
        public final /* synthetic */ C112139f f335757n;

        /* renamed from: o */
        public int f335758o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112140a(C112139f fVar, C15601d<? super C112140a> dVar) {
            super(dVar);
            this.f335757n = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f335756j = obj;
            this.f335758o |= Integer.MIN_VALUE;
            return this.f335757n.mo163924d((C112278q0) null, (C66245l) null, 0, 0.0f, false, this);
        }
    }

    /* renamed from: xa0.f$b */
    public static final class C112141b extends C87413o implements C32226l<C111640g<Float, C37907l>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f335759d;

        /* renamed from: e */
        public final /* synthetic */ C112278q0 f335760e;

        /* renamed from: f */
        public final /* synthetic */ C59741c0 f335761f;

        /* renamed from: g */
        public final /* synthetic */ C112139f f335762g;

        /* renamed from: h */
        public final /* synthetic */ boolean f335763h;

        /* renamed from: i */
        public final /* synthetic */ int f335764i;

        /* renamed from: j */
        public final /* synthetic */ C8477a0 f335765j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112141b(C59741c0 c0Var, C112278q0 q0Var, C59741c0 c0Var2, C112139f fVar, boolean z, int i, C8477a0 a0Var) {
            super(1);
            this.f335759d = c0Var;
            this.f335760e = q0Var;
            this.f335761f = c0Var2;
            this.f335762g = fVar;
            this.f335763h = z;
            this.f335764i = i;
            this.f335765j = a0Var;
        }

        public Object invoke(Object obj) {
            C111640g gVar = (C111640g) obj;
            C87412m.m108594g(gVar, "$this$animateDecay");
            float floatValue = ((Number) gVar.mo163316b()).floatValue() - this.f335759d.f170634d;
            float a = this.f335760e.mo90555a(floatValue);
            this.f335759d.f170634d = ((Number) gVar.mo163316b()).floatValue();
            this.f335761f.f170634d = ((Number) gVar.mo163317c()).floatValue();
            if (Math.abs(floatValue - a) > 0.5f) {
                gVar.mo163315a();
            }
            C66245l e = this.f335762g.f335745a.mo90334e();
            if (e == null) {
                gVar.mo163315a();
            } else {
                if (gVar.mo163318d() && this.f335763h) {
                    if (((Number) gVar.mo163317c()).floatValue() > 0.0f && e.mo90338a() == this.f335764i - 1) {
                        this.f335765j.f27482d = true;
                        gVar.mo163315a();
                    } else if (((Number) gVar.mo163317c()).floatValue() < 0.0f && e.mo90338a() == this.f335764i) {
                        this.f335765j.f27482d = true;
                        gVar.mo163315a();
                    }
                }
                if (gVar.mo163318d() && C112139f.m152874b(this.f335762g, gVar, e, this.f335764i, new C112144g(this.f335760e))) {
                    gVar.mo163315a();
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mm_compose.widget.page_snapper.SnapperFlingBehavior", mo125469f = "SnapperFlingBehavior.kt", mo125470l = {418}, mo125471m = "performSpringFling")
    /* renamed from: xa0.f$c */
    public static final class C112142c extends C66704d {

        /* renamed from: d */
        public Object f335766d;

        /* renamed from: e */
        public Object f335767e;

        /* renamed from: f */
        public Object f335768f;

        /* renamed from: g */
        public /* synthetic */ Object f335769g;

        /* renamed from: h */
        public final /* synthetic */ C112139f f335770h;

        /* renamed from: i */
        public int f335771i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112142c(C112139f fVar, C15601d<? super C112142c> dVar) {
            super(dVar);
            this.f335770h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f335769g = obj;
            this.f335771i |= Integer.MIN_VALUE;
            return this.f335770h.mo163925e((C112278q0) null, (C66245l) null, 0, 0.0f, this);
        }
    }

    /* renamed from: xa0.f$d */
    public static final class C112143d extends C87413o implements C32226l<C111640g<Float, C37907l>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f335772d;

        /* renamed from: e */
        public final /* synthetic */ C112278q0 f335773e;

        /* renamed from: f */
        public final /* synthetic */ C59741c0 f335774f;

        /* renamed from: g */
        public final /* synthetic */ C112139f f335775g;

        /* renamed from: h */
        public final /* synthetic */ int f335776h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112143d(C59741c0 c0Var, C112278q0 q0Var, C59741c0 c0Var2, C112139f fVar, int i) {
            super(1);
            this.f335772d = c0Var;
            this.f335773e = q0Var;
            this.f335774f = c0Var2;
            this.f335775g = fVar;
            this.f335776h = i;
        }

        public Object invoke(Object obj) {
            C111640g gVar = (C111640g) obj;
            C87412m.m108594g(gVar, "$this$animateTo");
            float floatValue = ((Number) gVar.mo163316b()).floatValue() - this.f335772d.f170634d;
            float a = this.f335773e.mo90555a(floatValue);
            this.f335772d.f170634d = ((Number) gVar.mo163316b()).floatValue();
            this.f335774f.f170634d = ((Number) gVar.mo163317c()).floatValue();
            C66245l e = this.f335775g.f335745a.mo90334e();
            if (e == null) {
                gVar.mo163315a();
            } else if (C112139f.m152874b(this.f335775g, gVar, e, this.f335776h, new C112145h(this.f335773e))) {
                gVar.mo163315a();
            } else if (Math.abs(floatValue - a) > 0.5f) {
                gVar.mo163315a();
            }
            return C13598b0.f38549a;
        }
    }

    public C112139f(C66244k kVar, C32226l<? super C66244k, Float> lVar, C37940v<Float> vVar, C37901h<Float> hVar) {
        C87412m.m108594g(kVar, "layoutInfo");
        C87412m.m108594g(lVar, "maximumFlingDistance");
        C87412m.m108594g(vVar, "decayAnimationSpec");
        C87412m.m108594g(hVar, "springAnimationSpec");
        this.f335745a = kVar;
        this.f335746b = lVar;
        this.f335747c = vVar;
        this.f335748d = hVar;
    }

    /* renamed from: b */
    public static final boolean m152874b(C112139f fVar, C111640g gVar, C66245l lVar, int i, C32226l lVar2) {
        fVar.getClass();
        Log.m105918d("SnapperFlingBehavior", "scroll tick. vel:" + ((Number) gVar.mo163317c()).floatValue() + ", current item: " + lVar);
        float floatValue = ((Number) gVar.mo163317c()).floatValue();
        int d = (floatValue <= 0.0f || lVar.mo90338a() != i) ? (floatValue >= 0.0f || lVar.mo90338a() != i + -1) ? 0 : fVar.f335745a.mo90333d(lVar.mo90338a() + 1) : fVar.f335745a.mo90333d(lVar.mo90338a());
        if (d == 0) {
            return false;
        }
        Log.m105924i("SnapperFlingBehavior", "Scrolled past item. vel:" + ((Number) gVar.mo163317c()).floatValue() + ", current item: " + lVar + "} target:" + i);
        lVar2.invoke(Float.valueOf((float) d));
        return true;
    }

    /* renamed from: a */
    public Object mo163922a(C112278q0 q0Var, float f, C15601d<? super Float> dVar) {
        if (!this.f335745a.mo90331b() || !this.f335745a.mo90330a()) {
            return new Float(f);
        }
        Log.m105924i("SnapperFlingBehavior", "initialVelocity: " + f);
        float floatValue = this.f335746b.invoke(this.f335745a).floatValue();
        boolean z = false;
        if (floatValue > 0.0f) {
            int c = this.f335745a.mo90332c(f, this.f335747c, floatValue);
            C66245l e = this.f335745a.mo90334e();
            if (e == null) {
                return new Float(f);
            }
            if (e.mo90338a() == c && this.f335745a.mo90333d(e.mo90338a()) == 0) {
                Log.m105924i("SnapperFlingBehavior", "Skipping fling: already at target. vel:" + f + ", initial item: " + e + ", target: " + c);
                return new Float(mo163923c(f));
            }
            C37940v<Float> vVar = this.f335747c;
            if (Math.abs(f) >= 0.5f) {
                float a = C37946x.m41665a(vVar, 0.0f, f);
                Log.m105924i("SnapperFlingBehavior", "canDecayBeyondCurrentItem. initialVelocity: " + f + ", flingDistance: " + a + ", current item: " + e);
                if (f >= 0.0f ? a >= ((float) this.f335745a.mo90333d(e.mo90338a() + 1)) : a <= ((float) this.f335745a.mo90333d(e.mo90338a()))) {
                    z = true;
                }
            }
            return z ? mo163924d(q0Var, e, c, f, true, dVar) : mo163925e(q0Var, e, c, f, dVar);
        }
        throw new IllegalArgumentException("Distance returned by maximumFlingDistance should be greater than 0".toString());
    }

    /* renamed from: c */
    public final float mo163923c(float f) {
        if (f < 0.0f && !this.f335745a.mo90331b()) {
            return f;
        }
        if (f <= 0.0f || this.f335745a.mo90330a()) {
            return 0.0f;
        }
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo163924d(p759y.C112278q0 r25, xa0.C66245l r26, int r27, float r28, boolean r29, wx3.C15601d<? super java.lang.Float> r30) {
        /*
            r24 = this;
            r9 = r24
            r0 = r26
            r10 = r27
            r1 = r28
            r2 = r30
            boolean r3 = r2 instanceof xa0.C112139f.C112140a
            if (r3 == 0) goto L_0x001d
            r3 = r2
            xa0.f$a r3 = (xa0.C112139f.C112140a) r3
            int r4 = r3.f335758o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001d
            int r4 = r4 - r5
            r3.f335758o = r4
            goto L_0x0022
        L_0x001d:
            xa0.f$a r3 = new xa0.f$a
            r3.<init>(r9, r2)
        L_0x0022:
            r15 = r3
            java.lang.Object r2 = r15.f335756j
            xx3.a r14 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r15.f335758o
            java.lang.String r13 = "SnapperFlingBehavior"
            r12 = 2
            r11 = 1
            r8 = 0
            if (r3 == 0) goto L_0x0069
            if (r3 == r11) goto L_0x0041
            if (r3 != r12) goto L_0x0039
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x01bc
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            int r0 = r15.f335755i
            java.lang.Object r1 = r15.f335754h
            gy3.a0 r1 = (gy3.C8477a0) r1
            java.lang.Object r3 = r15.f335753g
            gy3.c0 r3 = (gy3.C59741c0) r3
            java.lang.Object r4 = r15.f335752f
            gy3.c0 r4 = (gy3.C59741c0) r4
            java.lang.Object r5 = r15.f335751e
            y.q0 r5 = (p759y.C112278q0) r5
            java.lang.Object r6 = r15.f335750d
            xa0.f r6 = (xa0.C112139f) r6
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ all -> 0x0065 }
            r10 = r0
            r2 = r5
            r11 = r8
            r7 = r14
            r8 = r15
            r0 = 2
            r5 = r1
            r1 = r6
            r6 = r13
            goto L_0x016b
        L_0x0065:
            r0 = move-exception
            r11 = r8
            goto L_0x01cf
        L_0x0069:
            kotlin.ResultKt.throwOnFailure(r2)
            int r2 = r26.mo90338a()
            java.lang.String r3 = ", target: "
            java.lang.String r4 = ", current item: "
            if (r2 != r10) goto L_0x00ac
            xa0.k r2 = r9.f335745a
            int r5 = r26.mo90338a()
            int r2 = r2.mo90333d(r5)
            if (r2 != 0) goto L_0x00ac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Skipping decay: already at target. vel:"
            r2.append(r5)
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            r2.append(r3)
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            float r0 = r9.mo163923c(r1)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            return r1
        L_0x00ac:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Performing decay fling. vel:"
            r2.append(r5)
            r2.append(r1)
            r2.append(r4)
            r2.append(r0)
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            gy3.c0 r7 = new gy3.c0
            r7.<init>()
            r7.f170634d = r1
            gy3.c0 r6 = new gy3.c0
            r6.<init>()
            r16 = 0
            if (r29 == 0) goto L_0x00eb
            int r0 = r26.mo90338a()
            int r0 = r10 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r0 < r12) goto L_0x00eb
            r17 = 1
            goto L_0x00ed
        L_0x00eb:
            r17 = 0
        L_0x00ed:
            gy3.a0 r4 = new gy3.a0
            r4.<init>()
            java.lang.Integer r0 = new java.lang.Integer     // Catch:{ all -> 0x01cc }
            r0.<init>(r10)     // Catch:{ all -> 0x01cc }
            r9.mo163926f(r0)     // Catch:{ all -> 0x01cc }
            r0 = 0
            r2 = 0
            r18 = 0
            r20 = 0
            r21 = 28
            r22 = 0
            r1 = r28
            r26 = r4
            r4 = r18
            r28 = r6
            r6 = r20
            r29 = r7
            r7 = r21
            r8 = r22
            w.j r0 = p257w.C111651k.m152177a(r0, r1, r2, r4, r6, r7, r8)     // Catch:{ all -> 0x01c9 }
            w.v<java.lang.Float> r8 = r9.f335747c     // Catch:{ all -> 0x01c9 }
            r18 = 0
            xa0.f$b r19 = new xa0.f$b     // Catch:{ all -> 0x01c9 }
            if (r17 == 0) goto L_0x0123
            r6 = 1
            goto L_0x0124
        L_0x0123:
            r6 = 0
        L_0x0124:
            r1 = r19
            r2 = r28
            r3 = r25
            r4 = r29
            r5 = r24
            r7 = r27
            r16 = r8
            r8 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01c9 }
            r1 = 2
            r17 = 0
            r15.f335750d = r9     // Catch:{ all -> 0x01c9 }
            r2 = r25
            r15.f335751e = r2     // Catch:{ all -> 0x01c9 }
            r3 = r29
            r15.f335752f = r3     // Catch:{ all -> 0x01c9 }
            r4 = r28
            r15.f335753g = r4     // Catch:{ all -> 0x01c9 }
            r5 = r26
            r15.f335754h = r5     // Catch:{ all -> 0x01c9 }
            r15.f335755i = r10     // Catch:{ all -> 0x01c9 }
            r15.f335758o = r11     // Catch:{ all -> 0x01c9 }
            r11 = r0
            r0 = 2
            r12 = r16
            r6 = r13
            r13 = r18
            r7 = r14
            r14 = r19
            r8 = r15
            r16 = r1
            java.lang.Object r1 = p257w.C111671y0.m152194b(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01c9 }
            if (r1 != r7) goto L_0x0164
            return r7
        L_0x0164:
            r1 = r9
            r11 = 0
            r23 = r4
            r4 = r3
            r3 = r23
        L_0x016b:
            r1.mo163926f(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Decay fling finished. Distance: "
            r12.append(r13)
            float r3 = r3.f170634d
            r12.append(r3)
            java.lang.String r3 = ". Final vel: "
            r12.append(r3)
            float r3 = r4.f170634d
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            boolean r3 = r5.f27482d
            if (r3 == 0) goto L_0x01bd
            xa0.k r3 = r1.f335745a
            xa0.l r3 = r3.mo90334e()
            gy3.C87412m.m108591d(r3)
            float r4 = r4.f170634d
            r8.f335750d = r11
            r8.f335751e = r11
            r8.f335752f = r11
            r8.f335753g = r11
            r8.f335754h = r11
            r8.f335758o = r0
            r25 = r1
            r26 = r2
            r27 = r3
            r28 = r10
            r29 = r4
            r30 = r8
            java.lang.Object r2 = r25.mo163925e(r26, r27, r28, r29, r30)
            if (r2 != r7) goto L_0x01bc
            return r7
        L_0x01bc:
            return r2
        L_0x01bd:
            float r0 = r4.f170634d
            float r0 = r1.mo163923c(r0)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            return r1
        L_0x01c9:
            r0 = move-exception
            r11 = 0
            goto L_0x01ce
        L_0x01cc:
            r0 = move-exception
            r11 = r8
        L_0x01ce:
            r6 = r9
        L_0x01cf:
            r6.mo163926f(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa0.C112139f.mo163924d(y.q0, xa0.l, int, float, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo163925e(p759y.C112278q0 r26, xa0.C66245l r27, int r28, float r29, wx3.C15601d<? super java.lang.Float> r30) {
        /*
            r25 = this;
            r7 = r25
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r2 instanceof xa0.C112139f.C112142c
            if (r3 == 0) goto L_0x001b
            r3 = r2
            xa0.f$c r3 = (xa0.C112139f.C112142c) r3
            int r4 = r3.f335771i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001b
            int r4 = r4 - r5
            r3.f335771i = r4
            goto L_0x0020
        L_0x001b:
            xa0.f$c r3 = new xa0.f$c
            r3.<init>(r7, r2)
        L_0x0020:
            r13 = r3
            java.lang.Object r2 = r13.f335769g
            xx3.a r15 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r13.f335771i
            r14 = 0
            java.lang.String r12 = "SnapperFlingBehavior"
            r8 = 1
            if (r3 == 0) goto L_0x004e
            if (r3 != r8) goto L_0x0046
            java.lang.Object r0 = r13.f335768f
            gy3.c0 r0 = (gy3.C59741c0) r0
            java.lang.Object r1 = r13.f335767e
            gy3.c0 r1 = (gy3.C59741c0) r1
            java.lang.Object r3 = r13.f335766d
            xa0.f r3 = (xa0.C112139f) r3
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ all -> 0x0042 }
            r4 = r12
            r5 = r14
            goto L_0x0100
        L_0x0042:
            r0 = move-exception
            r5 = r14
            goto L_0x0134
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Performing spring. vel:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", initial item: "
            r2.append(r3)
            r3 = r27
            r2.append(r3)
            java.lang.String r4 = ", target: "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            gy3.c0 r11 = new gy3.c0
            r11.<init>()
            int r2 = r27.mo90338a()
            r4 = 0
            if (r0 <= r2) goto L_0x0088
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0088
            goto L_0x0094
        L_0x0088:
            int r2 = r27.mo90338a()
            if (r0 > r2) goto L_0x0093
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r1 = 0
        L_0x0094:
            r11.f170634d = r1
            gy3.c0 r10 = new gy3.c0
            r10.<init>()
            java.lang.Integer r1 = new java.lang.Integer     // Catch:{ all -> 0x0131 }
            r1.<init>(r0)     // Catch:{ all -> 0x0131 }
            r7.mo163926f(r1)     // Catch:{ all -> 0x0131 }
            float r1 = r10.f170634d     // Catch:{ all -> 0x0131 }
            float r2 = r11.f170634d     // Catch:{ all -> 0x0131 }
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 28
            r24 = 0
            r16 = r1
            r17 = r2
            w.j r9 = p257w.C111651k.m152177a(r16, r17, r18, r20, r22, r23, r24)     // Catch:{ all -> 0x0131 }
            xa0.k r1 = r7.f335745a     // Catch:{ all -> 0x0131 }
            int r1 = r1.mo90333d(r0)     // Catch:{ all -> 0x0131 }
            float r1 = (float) r1     // Catch:{ all -> 0x0131 }
            java.lang.Float r6 = new java.lang.Float     // Catch:{ all -> 0x0131 }
            r6.<init>(r1)     // Catch:{ all -> 0x0131 }
            w.h<java.lang.Float> r5 = r7.f335748d     // Catch:{ all -> 0x0131 }
            r16 = 0
            xa0.f$d r17 = new xa0.f$d     // Catch:{ all -> 0x0131 }
            r1 = r17
            r2 = r10
            r3 = r26
            r4 = r11
            r18 = r5
            r5 = r25
            r19 = r6
            r6 = r28
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0131 }
            r0 = 4
            r1 = 0
            r13.f335766d = r7     // Catch:{ all -> 0x0131 }
            r13.f335767e = r11     // Catch:{ all -> 0x0131 }
            r13.f335768f = r10     // Catch:{ all -> 0x0131 }
            r13.f335771i = r8     // Catch:{ all -> 0x0131 }
            r8 = r9
            r9 = r19
            r2 = r10
            r10 = r18
            r3 = r11
            r11 = r16
            r4 = r12
            r12 = r17
            r5 = r14
            r14 = r0
            r0 = r15
            r15 = r1
            java.lang.Object r1 = p257w.C111671y0.m152195c(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x012f }
            if (r1 != r0) goto L_0x00fd
            return r0
        L_0x00fd:
            r0 = r2
            r1 = r3
            r3 = r7
        L_0x0100:
            r3.mo163926f(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Spring fling finished. Distance: "
            r2.append(r5)
            float r0 = r0.f170634d
            r2.append(r0)
            java.lang.String r0 = ". Final vel: "
            r2.append(r0)
            float r0 = r1.f170634d
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            float r0 = r1.f170634d
            float r0 = r3.mo163923c(r0)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            return r1
        L_0x012f:
            r0 = move-exception
            goto L_0x0133
        L_0x0131:
            r0 = move-exception
            r5 = r14
        L_0x0133:
            r3 = r7
        L_0x0134:
            r3.mo163926f(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa0.C112139f.mo163925e(y.q0, xa0.l, int, float, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo163926f(Integer num) {
        ((C108494d2) this.f335749e).setValue(num);
    }
}
