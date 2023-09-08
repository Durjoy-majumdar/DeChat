package kl1;

import a14.C0000n0;
import a14.C53965x0;
import android.animation.AnimatorSet;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import kl1.C10289a;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.bulletcommet.FinderLiveBulletCommentAnimation$showAnim$1", mo125469f = "FinderLiveBulletCommentAnimation.kt", mo125470l = {287, 288, 322, 326, 330, 331, 346, 351, 355}, mo125471m = "invokeSuspend")
/* renamed from: kl1.i */
public final class C10320i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f31441d;

    /* renamed from: e */
    public boolean f31442e;

    /* renamed from: f */
    public boolean f31443f;

    /* renamed from: g */
    public int f31444g;

    /* renamed from: h */
    public /* synthetic */ Object f31445h;

    /* renamed from: i */
    public final /* synthetic */ C10305d f31446i;

    /* renamed from: j */
    public final /* synthetic */ C10289a f31447j;

    /* renamed from: n */
    public final /* synthetic */ C32226l<C10289a.C10291b, Boolean> f31448n;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.bulletcommet.FinderLiveBulletCommentAnimation$showAnim$1$alphaOutWork$1", mo125469f = "FinderLiveBulletCommentAnimation.kt", mo125470l = {329}, mo125471m = "invokeSuspend")
    /* renamed from: kl1.i$a */
    public static final class C10321a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f31449d;

        /* renamed from: e */
        public final /* synthetic */ C10305d f31450e;

        /* renamed from: f */
        public final /* synthetic */ C10289a f31451f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10321a(C10305d dVar, C10289a aVar, C15601d<? super C10321a> dVar2) {
            super(2, dVar2);
            this.f31450e = dVar;
            this.f31451f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10321a(this.f31450e, this.f31451f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10321a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31449d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C10305d dVar = this.f31450e;
                long j = this.f31451f.f31356f.f31378e;
                this.f31449d = 1;
                obj = C10305d.m10254a(dVar, j, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.bulletcommet.FinderLiveBulletCommentAnimation$showAnim$1$scaleBackWork$1", mo125469f = "FinderLiveBulletCommentAnimation.kt", mo125470l = {328}, mo125471m = "invokeSuspend")
    /* renamed from: kl1.i$b */
    public static final class C10322b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f31452d;

        /* renamed from: e */
        public final /* synthetic */ C10305d f31453e;

        /* renamed from: f */
        public final /* synthetic */ C10289a f31454f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10322b(C10305d dVar, C10289a aVar, C15601d<? super C10322b> dVar2) {
            super(2, dVar2);
            this.f31453e = dVar;
            this.f31454f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10322b(this.f31453e, this.f31454f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10322b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00cb A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r9.f31452d
                r2 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 != r2) goto L_0x000e
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x00cc
            L_0x000e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0016:
                kotlin.ResultKt.throwOnFailure(r10)
                kl1.d r10 = r9.f31453e
                kl1.a r1 = r9.f31454f
                kl1.a$h r1 = r1.f31356f
                long r3 = r1.f31377d
                r9.f31452d = r2
                r10.getClass()
                wx3.h r1 = new wx3.h
                wx3.d r5 = xx3.C66447b.m78392b(r9)
                r1.<init>(r5)
                gy3.a0 r5 = new gy3.a0
                r5.<init>()
                er1.j4 r6 = er1.C58739j4.f168176a
                boolean r6 = r6.mo83692U()
                if (r6 == 0) goto L_0x006f
                java.lang.String r6 = r10.f31410c
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "lucianTest scaleBackAnim scaleX:"
                r7.append(r8)
                kl1.o r8 = r10.f31408a
                com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r8 = r8.f31488e
                float r8 = r8.getScaleX()
                r7.append(r8)
                java.lang.String r8 = ",scaleY:"
                r7.append(r8)
                kl1.o r8 = r10.f31408a
                com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r8 = r8.f31488e
                float r8 = r8.getScaleY()
                r7.append(r8)
                r8 = 33
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            L_0x006f:
                kl1.o r6 = r10.f31408a
                com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r6 = r6.f31488e
                float r6 = r6.getScaleX()
                r7 = 1066695393(0x3f947ae1, float:1.16)
                r8 = 0
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 != 0) goto L_0x0081
                r6 = 1
                goto L_0x0082
            L_0x0081:
                r6 = 0
            L_0x0082:
                if (r6 == 0) goto L_0x00c2
                kl1.o r6 = r10.f31408a
                com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r6 = r6.f31488e
                float r6 = r6.getScaleY()
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 != 0) goto L_0x0091
                goto L_0x0092
            L_0x0091:
                r2 = 0
            L_0x0092:
                if (r2 != 0) goto L_0x0095
                goto L_0x00c2
            L_0x0095:
                rx3.g r2 = r10.f31421n
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                android.animation.AnimatorSet r2 = (android.animation.AnimatorSet) r2
                r2.setDuration(r3)
                rx3.g r2 = r10.f31421n
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                android.animation.AnimatorSet r2 = (android.animation.AnimatorSet) r2
                kl1.g r3 = new kl1.g
                r3.<init>(r10, r5, r1)
                r2.addListener(r3)
                rx3.g r10 = r10.f31421n
                rx3.n r10 = (rx3.C36570n) r10
                java.lang.Object r10 = r10.getValue()
                android.animation.AnimatorSet r10 = (android.animation.AnimatorSet) r10
                r10.start()
                goto L_0x00c5
            L_0x00c2:
                kl1.C10305d.m10261j(r5, r1, r8)
            L_0x00c5:
                java.lang.Object r10 = r1.mo90314b()
                if (r10 != r0) goto L_0x00cc
                return r0
            L_0x00cc:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kl1.C10320i.C10322b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.bulletcommet.FinderLiveBulletCommentAnimation$showAnim$1$scaleInWork$1", mo125469f = "FinderLiveBulletCommentAnimation.kt", mo125470l = {280, 282}, mo125471m = "invokeSuspend")
    /* renamed from: kl1.i$c */
    public static final class C10323c extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f31455d;

        /* renamed from: e */
        public final /* synthetic */ C10289a f31456e;

        /* renamed from: f */
        public final /* synthetic */ C10305d f31457f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10323c(C10289a aVar, C10305d dVar, C15601d<? super C10323c> dVar2) {
            super(2, dVar2);
            this.f31456e = aVar;
            this.f31457f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10323c(this.f31456e, this.f31457f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10323c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31455d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f31456e.f31356f.f31375b;
                this.f31455d = 1;
                if (C53965x0.m60607b(j, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10305d.m10258e(this.f31457f, "\t大R:step1-1 begin scaleInAnim!");
            C10305d dVar = this.f31457f;
            long j2 = this.f31456e.f31356f.f31376c;
            this.f31455d = 2;
            dVar.getClass();
            C66218h hVar = new C66218h(C66447b.m78392b(this));
            C8477a0 a0Var = new C8477a0();
            ((AnimatorSet) ((C36570n) dVar.f31417j).getValue()).setDuration(j2);
            ((AnimatorSet) ((C36570n) dVar.f31417j).getValue()).addListener(new C10319h(a0Var, hVar));
            ((AnimatorSet) ((C36570n) dVar.f31417j).getValue()).start();
            obj = hVar.mo90314b();
            return obj == aVar ? aVar : obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.bulletcommet.FinderLiveBulletCommentAnimation$showAnim$1$translationInWork$1", mo125469f = "FinderLiveBulletCommentAnimation.kt", mo125470l = {277}, mo125471m = "invokeSuspend")
    /* renamed from: kl1.i$d */
    public static final class C10324d extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f31458d;

        /* renamed from: e */
        public final /* synthetic */ C10305d f31459e;

        /* renamed from: f */
        public final /* synthetic */ C10289a f31460f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10324d(C10305d dVar, C10289a aVar, C15601d<? super C10324d> dVar2) {
            super(2, dVar2);
            this.f31459e = dVar;
            this.f31460f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10324d(this.f31459e, this.f31460f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10324d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31458d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C10305d dVar = this.f31459e;
                C10289a aVar2 = this.f31460f;
                C10289a.C10297h hVar = aVar2.f31356f;
                long j = hVar.f31381h;
                int i2 = hVar.f31382i;
                boolean z = aVar2.f31355e;
                this.f31458d = 1;
                obj = C10305d.m10259f(dVar, j, i2, z, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10320i(C10305d dVar, C10289a aVar, C32226l<? super C10289a.C10291b, Boolean> lVar, C15601d<? super C10320i> dVar2) {
        super(2, dVar2);
        this.f31446i = dVar;
        this.f31447j = aVar;
        this.f31448n = lVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C10320i iVar = new C10320i(this.f31446i, this.f31447j, this.f31448n, dVar);
        iVar.f31445h = obj;
        return iVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10320i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0386, code lost:
        if (r1 == false) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0388, code lost:
        r3 = r6.f31447j.f31356f.f31386m;
        r6.f31445h = r2;
        r6.f31442e = r1;
        r6.f31444g = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0399, code lost:
        if (a14.C53965x0.m60607b(r3, r6) != r8) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x039b, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x039c, code lost:
        r3 = r6.f31446i;
        kl1.C10305d.m10258e(r3, "\t大R:step3-2 after beforeAnimOutDuration:" + r6.f31447j.f31356f.f31386m + '!');
        r13 = r2;
        r3 = a14.C53895h.m60464b(r13, (wx3.C66212f) null, (a14.C53934p0) null, new kl1.C10320i.C10322b(r6.f31446i, r6.f31447j, (wx3.C15601d<? super kl1.C10320i.C10322b>) null), 3, (java.lang.Object) null);
        r2 = a14.C53895h.m60464b(r13, (wx3.C66212f) null, (a14.C53934p0) null, new kl1.C10320i.C10321a(r6.f31446i, r6.f31447j, (wx3.C15601d<? super kl1.C10320i.C10321a>) null), 3, (java.lang.Object) null);
        r6.f31445h = r2;
        r6.f31442e = r1;
        r6.f31444g = 5;
        r3 = ((a14.C53957v0) r3).mo74549z(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03f1, code lost:
        if (r3 != r8) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03f3, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f4, code lost:
        r3 = ((java.lang.Boolean) r3).booleanValue();
        r6.f31445h = null;
        r6.f31442e = r1;
        r6.f31443f = r3;
        r6.f31444g = 6;
        r2 = r2.mo74634A(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0408, code lost:
        if (r2 != r8) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x040a, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x040b, code lost:
        r19 = r3;
        r3 = r1;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0410, code lost:
        r2 = ((java.lang.Boolean) r2).booleanValue();
        r4 = r6.f31446i;
        kl1.C10305d.m10258e(r4, "\t大R:step4 after showAnim end scaleBackResult:" + r1 + " alphaOutResult:" + r2 + ",continueAnim:" + r3 + '!');
        r6.f31446i.f31409b.mo10614a(r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0449, code lost:
        r2 = r6.f31446i;
        kl1.C10305d.m10258e(r2, "\t大R:step4 after showAnim end,continueAnim:" + r1 + '!');
        r6.f31446i.f31409b.mo10614a(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x046e, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0131, code lost:
        if (r1 == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0183, code lost:
        r0 = r6.f31446i;
        r1 = new java.lang.StringBuilder();
        r1.append("\tstep1 normal:after startAnim,is start:");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0193, code lost:
        if (r6.f31447j.f31352b != r7) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0195, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0197, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0198, code lost:
        r1.append(r2);
        r1.append('!');
        kl1.C10305d.m10258e(r0, r1.toString());
        r0 = r6.f31447j.f31357g.f31389c;
        r6.f31444g = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b3, code lost:
        if (a14.C53965x0.m60607b(r0, r6) != r8) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b5, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b6, code lost:
        kl1.C10305d.m10258e(r6.f31446i, "\tstep2 normal:after beforeNextCheckDuration!");
        r0 = r6.f31448n.invoke(r6.f31447j.f31353c).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01cd, code lost:
        if (r0 == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01cf, code lost:
        r1 = r6.f31446i;
        r2 = r6.f31447j.f31357g.f31390d;
        r6.f31442e = r0;
        r6.f31444g = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01e1, code lost:
        if (kl1.C10305d.m10254a(r1, r2, r6) != r8) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01e3, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e4, code lost:
        r1 = r6.f31446i;
        kl1.C10305d.m10258e(r1, "\tstep3 normal:showAnim end,continueAnim:" + r0 + '!');
        r6.f31446i.f31409b.mo10614a(r6.f31447j.f31353c, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0208, code lost:
        r1 = r6.f31446i;
        kl1.C10305d.m10258e(r1, "\tstep3 normal:showAnim end,continueAnim:" + r0 + '!');
        r6.f31446i.f31409b.mo10614a(r6.f31447j.f31353c, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x027f, code lost:
        r2 = ((java.lang.Boolean) r2).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0285, code lost:
        if (r1 == null) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0287, code lost:
        r6.f31445h = r4;
        r6.f31441d = null;
        r6.f31442e = r2;
        r6.f31444g = 2;
        r1 = r1.mo74634A(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0295, code lost:
        if (r1 != r8) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0297, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0298, code lost:
        r1 = (java.lang.Boolean) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x029b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x029c, code lost:
        r3 = r6.f31446i;
        kl1.C10305d.m10258e(r3, "\t大R:step2 need scale:" + r6.f31447j.f31356f.f31374a + " after scaleAnim,translationInResult:" + r2 + " scaleInResult:" + r1 + '!');
        r1 = r6.f31447j.f31356f;
        r2 = r1.f31379f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02d5, code lost:
        if (r2 == false) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02d9, code lost:
        if (r1.f31380g == false) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02db, code lost:
        r1 = r1.f31383j;
        r2 = r1.f31368b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02df, code lost:
        if (r2 == null) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02e1, code lost:
        kl1.C10305d.m10256c(r6.f31446i, r2, r1.f31367a, r1.f31369c);
        kl1.C10305d.m10258e(r6.f31446i, "\t大R:step3 after flashLight!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02ef, code lost:
        r1 = r6.f31447j.f31356f.f31384k;
        r14 = r1.f31373d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02f7, code lost:
        if (r14 == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02f9, code lost:
        kl1.C10305d.m10257d(r6.f31446i, r14, r1.f31370a, r1.f31371b);
        kl1.C10305d.m10258e(r6.f31446i, "\t大R:step3 after floatCover!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x030b, code lost:
        if (r2 == false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x030f, code lost:
        if (r1.f31380g != false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0311, code lost:
        r1 = r1.f31383j;
        r2 = r1.f31368b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0315, code lost:
        if (r2 == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0317, code lost:
        kl1.C10305d.m10256c(r6.f31446i, r2, r1.f31367a, r1.f31369c);
        kl1.C10305d.m10258e(r6.f31446i, "\t大R:step3 after flashLight!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0326, code lost:
        if (r2 != false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x032a, code lost:
        if (r1.f31380g == false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x032c, code lost:
        r1 = r1.f31384k;
        r14 = r1.f31373d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0330, code lost:
        if (r14 == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0332, code lost:
        kl1.C10305d.m10257d(r6.f31446i, r14, r1.f31370a, r1.f31371b);
        kl1.C10305d.m10258e(r6.f31446i, "\t大R:step3 after floatCover!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0343, code lost:
        r1 = r6.f31447j.f31356f.f31385l;
        r6.f31445h = r4;
        r6.f31441d = null;
        r6.f31444g = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0355, code lost:
        if (a14.C53965x0.m60607b(r1, r6) != r8) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0357, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0358, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0359, code lost:
        r1 = r6.f31446i;
        kl1.C10305d.m10258e(r1, "\t大R:step3-1 after beforeNextCheckDuration:" + r6.f31447j.f31356f.f31385l + '!');
        r1 = r6.f31448n.invoke(r0).booleanValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r6 = r20
            kl1.a$b r0 = kl1.C10289a.C10291b.H_JOIN
            kl1.a$a r7 = kl1.C10289a.C10290a.START
            xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f31444g
            java.lang.String r9 = "\tstep3 normal:showAnim end,continueAnim:"
            r10 = 0
            r11 = 33
            r12 = 1
            r3 = 0
            switch(r1) {
                case 0: goto L_0x0079;
                case 1: goto L_0x006a;
                case 2: goto L_0x005b;
                case 3: goto L_0x0051;
                case 4: goto L_0x0046;
                case 5: goto L_0x0039;
                case 6: goto L_0x002d;
                case 7: goto L_0x0028;
                case 8: goto L_0x0023;
                case 9: goto L_0x001c;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001c:
            boolean r0 = r6.f31442e
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x01e4
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x01b6
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x0183
        L_0x002d:
            boolean r1 = r6.f31443f
            boolean r2 = r6.f31442e
            kotlin.ResultKt.throwOnFailure(r21)
            r3 = r2
            r2 = r21
            goto L_0x0410
        L_0x0039:
            boolean r1 = r6.f31442e
            java.lang.Object r2 = r6.f31445h
            a14.u0 r2 = (a14.C53953u0) r2
            kotlin.ResultKt.throwOnFailure(r21)
            r3 = r21
            goto L_0x03f4
        L_0x0046:
            boolean r1 = r6.f31442e
            java.lang.Object r2 = r6.f31445h
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x039c
        L_0x0051:
            java.lang.Object r1 = r6.f31445h
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r21)
            r2 = r1
            goto L_0x0359
        L_0x005b:
            boolean r1 = r6.f31442e
            java.lang.Object r2 = r6.f31445h
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r21)
            r4 = r2
            r2 = r1
            r1 = r21
            goto L_0x0298
        L_0x006a:
            java.lang.Object r1 = r6.f31441d
            a14.u0 r1 = (a14.C53953u0) r1
            java.lang.Object r4 = r6.f31445h
            a14.n0 r4 = (a14.C0000n0) r4
            kotlin.ResultKt.throwOnFailure(r21)
            r2 = r21
            goto L_0x027f
        L_0x0079:
            kotlin.ResultKt.throwOnFailure(r21)
            java.lang.Object r1 = r6.f31445h
            a14.n0 r1 = (a14.C0000n0) r1
            kl1.d r4 = r6.f31446i
            long r13 = java.lang.System.currentTimeMillis()
            r4.f31413f = r13
            er1.j4 r4 = er1.C58739j4.f168176a
            boolean r4 = r4.mo83692U()
            if (r4 == 0) goto L_0x00ac
            kl1.d r4 = r6.f31446i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "showAnim config:"
            r5.append(r13)
            kl1.a r13 = r6.f31447j
            r5.append(r13)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            kl1.C10305d.m10258e(r4, r5)
        L_0x00ac:
            kl1.d r4 = r6.f31446i
            kl1.a r5 = r6.f31447j
            kl1.a r13 = r4.f31412e
            if (r13 == 0) goto L_0x00f1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "reset config:"
            r14.append(r15)
            java.lang.String r15 = r13.f31351a
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "AnimConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            r13.f31352b = r7
            kl1.a$b r14 = kl1.C10289a.C10291b.NORMAL_JOIN
            r13.f31353c = r14
            kl1.a$h r14 = r13.f31356f
            r14.f31379f = r10
            r14.f31380g = r10
            kl1.a$f r15 = r14.f31383j
            r15.f31368b = r3
            kl1.a$g r15 = r14.f31384k
            r15.f31373d = r3
            r2 = 1500(0x5dc, double:7.41E-321)
            r14.f31385l = r2
            kl1.a$i r2 = r13.f31357g
            r14 = 2000(0x7d0, double:9.88E-321)
            r2.f31389c = r14
            kl1.a$e r2 = r13.f31358h
            r3 = -1
            r2.f31366a = r3
            r13.f31354d = r10
        L_0x00f1:
            kl1.a$d r2 = kl1.C10289a.f31347i
            kl1.a r3 = r4.f31412e
            r2.mo10587b(r3)
            r5.f31354d = r12
            r4.f31412e = r5
            kl1.a r2 = r6.f31447j
            kl1.a$b r2 = r2.f31353c
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x022c
            if (r2 == r12) goto L_0x010d
            r0 = 2
            if (r2 == r0) goto L_0x010d
            goto L_0x046c
        L_0x010d:
            kl1.d r0 = r6.f31446i
            kl1.o r1 = r0.f31408a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r1 = r1.f31488e
            float r1 = r1.getScaleX()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x011f
            r1 = 1
            goto L_0x0120
        L_0x011f:
            r1 = 0
        L_0x0120:
            if (r1 == 0) goto L_0x0133
            kl1.o r1 = r0.f31408a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r1 = r1.f31488e
            float r1 = r1.getScaleY()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0130
            r1 = 1
            goto L_0x0131
        L_0x0130:
            r1 = 0
        L_0x0131:
            if (r1 != 0) goto L_0x0141
        L_0x0133:
            kl1.o r1 = r0.f31408a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r1 = r1.f31488e
            r1.setScaleX(r2)
            kl1.o r0 = r0.f31408a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            r0.setScaleY(r2)
        L_0x0141:
            kl1.d r0 = r6.f31446i
            kl1.o r0 = r0.f31408a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            kl1.b0 r0 = r0.f15431w
            if (r0 == 0) goto L_0x014e
            r0.mo10611b(r12)
        L_0x014e:
            kl1.d r0 = r6.f31446i
            kl1.C10305d.m10255b(r0)
            kl1.d r0 = r6.f31446i
            java.lang.String r1 = "\tstep0 cancel anim before start!"
            kl1.C10305d.m10258e(r0, r1)
            kl1.a r0 = r6.f31447j
            kl1.a$a r1 = r0.f31352b
            if (r1 != r7) goto L_0x017a
            kl1.d r1 = r6.f31446i
            kl1.a$i r2 = r0.f31357g
            long r3 = r2.f31387a
            int r5 = r2.f31388b
            boolean r13 = r0.f31355e
            r0 = 7
            r6.f31444g = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r4 = r13
            r5 = r20
            java.lang.Object r0 = kl1.C10305d.m10259f(r0, r1, r3, r4, r5)
            if (r0 != r8) goto L_0x0183
            return r8
        L_0x017a:
            kl1.d r0 = r6.f31446i
            kl1.o r0 = r0.f31408a
            com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout r0 = r0.f31488e
            r0.setAlpha(r2)
        L_0x0183:
            kl1.d r0 = r6.f31446i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\tstep1 normal:after startAnim,is start:"
            r1.append(r2)
            kl1.a r2 = r6.f31447j
            kl1.a$a r2 = r2.f31352b
            if (r2 != r7) goto L_0x0197
            r2 = 1
            goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            kl1.C10305d.m10258e(r0, r1)
            kl1.a r0 = r6.f31447j
            kl1.a$i r0 = r0.f31357g
            long r0 = r0.f31389c
            r2 = 8
            r6.f31444g = r2
            java.lang.Object r0 = a14.C53965x0.m60607b(r0, r6)
            if (r0 != r8) goto L_0x01b6
            return r8
        L_0x01b6:
            kl1.d r0 = r6.f31446i
            java.lang.String r1 = "\tstep2 normal:after beforeNextCheckDuration!"
            kl1.C10305d.m10258e(r0, r1)
            fy3.l<kl1.a$b, java.lang.Boolean> r0 = r6.f31448n
            kl1.a r1 = r6.f31447j
            kl1.a$b r1 = r1.f31353c
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0208
            kl1.d r1 = r6.f31446i
            kl1.a r2 = r6.f31447j
            kl1.a$i r2 = r2.f31357g
            long r2 = r2.f31390d
            r6.f31442e = r0
            r4 = 9
            r6.f31444g = r4
            java.lang.Object r1 = kl1.C10305d.m10254a(r1, r2, r6)
            if (r1 != r8) goto L_0x01e4
            return r8
        L_0x01e4:
            kl1.d r1 = r6.f31446i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            kl1.C10305d.m10258e(r1, r0)
            kl1.d r0 = r6.f31446i
            kl1.d$a r0 = r0.f31409b
            kl1.a r1 = r6.f31447j
            kl1.a$b r1 = r1.f31353c
            r0.mo10614a(r1, r12)
            goto L_0x046c
        L_0x0208:
            kl1.d r1 = r6.f31446i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            kl1.C10305d.m10258e(r1, r0)
            kl1.d r0 = r6.f31446i
            kl1.d$a r0 = r0.f31409b
            kl1.a r1 = r6.f31447j
            kl1.a$b r1 = r1.f31353c
            r0.mo10614a(r1, r10)
            goto L_0x046c
        L_0x022c:
            kl1.d r2 = r6.f31446i
            kl1.C10305d.m10255b(r2)
            kl1.d r2 = r6.f31446i
            java.lang.String r3 = "\t大R:step1 begin startAnim!"
            kl1.C10305d.m10258e(r2, r3)
            r14 = 0
            r15 = 0
            kl1.i$d r2 = new kl1.i$d
            kl1.d r3 = r6.f31446i
            kl1.a r4 = r6.f31447j
            r5 = 0
            r2.<init>(r3, r4, r5)
            r17 = 3
            r18 = 0
            r13 = r1
            r16 = r2
            a14.u0 r2 = a14.C53895h.m60464b(r13, r14, r15, r16, r17, r18)
            kl1.a r3 = r6.f31447j
            kl1.a$h r4 = r3.f31356f
            boolean r4 = r4.f31374a
            if (r4 == 0) goto L_0x026d
            r14 = 0
            r15 = 0
            kl1.i$c r4 = new kl1.i$c
            kl1.d r5 = r6.f31446i
            r7 = 0
            r4.<init>(r3, r5, r7)
            r17 = 3
            r18 = 0
            r13 = r1
            r16 = r4
            a14.u0 r3 = a14.C53895h.m60464b(r13, r14, r15, r16, r17, r18)
            goto L_0x026e
        L_0x026d:
            r3 = 0
        L_0x026e:
            r6.f31445h = r1
            r6.f31441d = r3
            r6.f31444g = r12
            a14.v0 r2 = (a14.C53957v0) r2
            java.lang.Object r2 = r2.mo74549z(r6)
            if (r2 != r8) goto L_0x027d
            return r8
        L_0x027d:
            r4 = r1
            r1 = r3
        L_0x027f:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r1 == 0) goto L_0x029b
            r6.f31445h = r4
            r3 = 0
            r6.f31441d = r3
            r6.f31442e = r2
            r3 = 2
            r6.f31444g = r3
            java.lang.Object r1 = r1.mo74634A(r6)
            if (r1 != r8) goto L_0x0298
            return r8
        L_0x0298:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x029c
        L_0x029b:
            r1 = 0
        L_0x029c:
            kl1.d r3 = r6.f31446i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "\t大R:step2 need scale:"
            r5.append(r7)
            kl1.a r7 = r6.f31447j
            kl1.a$h r7 = r7.f31356f
            boolean r7 = r7.f31374a
            r5.append(r7)
            java.lang.String r7 = " after scaleAnim,translationInResult:"
            r5.append(r7)
            r5.append(r2)
            java.lang.String r2 = " scaleInResult:"
            r5.append(r2)
            r5.append(r1)
            r5.append(r11)
            java.lang.String r1 = r5.toString()
            kl1.C10305d.m10258e(r3, r1)
            kl1.a r1 = r6.f31447j
            kl1.a$h r1 = r1.f31356f
            boolean r2 = r1.f31379f
            java.lang.String r3 = "\t大R:step3 after floatCover!"
            java.lang.String r5 = "\t大R:step3 after flashLight!"
            if (r2 == 0) goto L_0x030b
            boolean r7 = r1.f31380g
            if (r7 == 0) goto L_0x030b
            kl1.a$f r1 = r1.f31383j
            android.graphics.Bitmap r2 = r1.f31368b
            if (r2 == 0) goto L_0x02ef
            kl1.d r7 = r6.f31446i
            long r13 = r1.f31367a
            float r1 = r1.f31369c
            kl1.C10305d.m10256c(r7, r2, r13, r1)
            kl1.d r1 = r6.f31446i
            kl1.C10305d.m10258e(r1, r5)
        L_0x02ef:
            kl1.a r1 = r6.f31447j
            kl1.a$h r1 = r1.f31356f
            kl1.a$g r1 = r1.f31384k
            org.libpag.PAGImage r14 = r1.f31373d
            if (r14 == 0) goto L_0x0343
            kl1.d r13 = r6.f31446i
            long r10 = r1.f31370a
            long r1 = r1.f31371b
            r15 = r10
            r17 = r1
            kl1.C10305d.m10257d(r13, r14, r15, r17)
            kl1.d r1 = r6.f31446i
            kl1.C10305d.m10258e(r1, r3)
            goto L_0x0343
        L_0x030b:
            if (r2 == 0) goto L_0x0326
            boolean r10 = r1.f31380g
            if (r10 != 0) goto L_0x0326
            kl1.a$f r1 = r1.f31383j
            android.graphics.Bitmap r2 = r1.f31368b
            if (r2 == 0) goto L_0x0343
            kl1.d r3 = r6.f31446i
            long r10 = r1.f31367a
            float r1 = r1.f31369c
            kl1.C10305d.m10256c(r3, r2, r10, r1)
            kl1.d r1 = r6.f31446i
            kl1.C10305d.m10258e(r1, r5)
            goto L_0x0343
        L_0x0326:
            if (r2 != 0) goto L_0x0343
            boolean r2 = r1.f31380g
            if (r2 == 0) goto L_0x0343
            kl1.a$g r1 = r1.f31384k
            org.libpag.PAGImage r14 = r1.f31373d
            if (r14 == 0) goto L_0x0343
            kl1.d r13 = r6.f31446i
            long r10 = r1.f31370a
            long r1 = r1.f31371b
            r15 = r10
            r17 = r1
            kl1.C10305d.m10257d(r13, r14, r15, r17)
            kl1.d r1 = r6.f31446i
            kl1.C10305d.m10258e(r1, r3)
        L_0x0343:
            kl1.a r1 = r6.f31447j
            kl1.a$h r1 = r1.f31356f
            long r1 = r1.f31385l
            r6.f31445h = r4
            r3 = 0
            r6.f31441d = r3
            r3 = 3
            r6.f31444g = r3
            java.lang.Object r1 = a14.C53965x0.m60607b(r1, r6)
            if (r1 != r8) goto L_0x0358
            return r8
        L_0x0358:
            r2 = r4
        L_0x0359:
            kl1.d r1 = r6.f31446i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "\t大R:step3-1 after beforeNextCheckDuration:"
            r3.append(r4)
            kl1.a r4 = r6.f31447j
            kl1.a$h r4 = r4.f31356f
            long r4 = r4.f31385l
            r3.append(r4)
            r4 = 33
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            kl1.C10305d.m10258e(r1, r3)
            fy3.l<kl1.a$b, java.lang.Boolean> r1 = r6.f31448n
            java.lang.Object r1 = r1.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0449
            kl1.a r3 = r6.f31447j
            kl1.a$h r3 = r3.f31356f
            long r3 = r3.f31386m
            r6.f31445h = r2
            r6.f31442e = r1
            r5 = 4
            r6.f31444g = r5
            java.lang.Object r3 = a14.C53965x0.m60607b(r3, r6)
            if (r3 != r8) goto L_0x039c
            return r8
        L_0x039c:
            kl1.d r3 = r6.f31446i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\t大R:step3-2 after beforeAnimOutDuration:"
            r4.append(r5)
            kl1.a r5 = r6.f31447j
            kl1.a$h r5 = r5.f31356f
            long r10 = r5.f31386m
            r4.append(r10)
            r5 = 33
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            kl1.C10305d.m10258e(r3, r4)
            r14 = 0
            r15 = 0
            kl1.i$b r3 = new kl1.i$b
            kl1.d r4 = r6.f31446i
            kl1.a r5 = r6.f31447j
            r7 = 0
            r3.<init>(r4, r5, r7)
            r17 = 3
            r18 = 0
            r13 = r2
            r16 = r3
            a14.u0 r3 = a14.C53895h.m60464b(r13, r14, r15, r16, r17, r18)
            kl1.i$a r4 = new kl1.i$a
            kl1.d r5 = r6.f31446i
            kl1.a r7 = r6.f31447j
            r10 = 0
            r4.<init>(r5, r7, r10)
            r16 = r4
            a14.u0 r2 = a14.C53895h.m60464b(r13, r14, r15, r16, r17, r18)
            r6.f31445h = r2
            r6.f31442e = r1
            r4 = 5
            r6.f31444g = r4
            a14.v0 r3 = (a14.C53957v0) r3
            java.lang.Object r3 = r3.mo74549z(r6)
            if (r3 != r8) goto L_0x03f4
            return r8
        L_0x03f4:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            r6.f31445h = r4
            r6.f31442e = r1
            r6.f31443f = r3
            r4 = 6
            r6.f31444g = r4
            java.lang.Object r2 = r2.mo74634A(r6)
            if (r2 != r8) goto L_0x040b
            return r8
        L_0x040b:
            r19 = r3
            r3 = r1
            r1 = r19
        L_0x0410:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            kl1.d r4 = r6.f31446i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "\t大R:step4 after showAnim end scaleBackResult:"
            r5.append(r7)
            r5.append(r1)
            java.lang.String r1 = " alphaOutResult:"
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = ",continueAnim:"
            r5.append(r1)
            r5.append(r3)
            r1 = 33
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            kl1.C10305d.m10258e(r4, r1)
            kl1.d r1 = r6.f31446i
            kl1.d$a r1 = r1.f31409b
            r1.mo10614a(r0, r12)
            goto L_0x046c
        L_0x0449:
            kl1.d r2 = r6.f31446i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "\t大R:step4 after showAnim end,continueAnim:"
            r3.append(r4)
            r3.append(r1)
            r1 = 33
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            kl1.C10305d.m10258e(r2, r1)
            kl1.d r1 = r6.f31446i
            kl1.d$a r1 = r1.f31409b
            r2 = 0
            r1.mo10614a(r0, r2)
        L_0x046c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kl1.C10320i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
