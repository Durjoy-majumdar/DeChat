package fh1;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8477a0;
import kotlin.Result;
import kotlin.ResultKt;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.HotCommentAnimationController$checkStartJob$1", mo125469f = "HotCommentAnimationController.kt", mo125470l = {125, 133, 167}, mo125471m = "invokeSuspend")
/* renamed from: fh1.d0 */
public final class C59005d0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f168823d;

    /* renamed from: e */
    public int f168824e;

    /* renamed from: f */
    public final /* synthetic */ C59011e0 f168825f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.HotCommentAnimationController$checkStartJob$1$1", mo125469f = "HotCommentAnimationController.kt", mo125470l = {177}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.d0$a */
    public static final class C59006a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f168826d;

        /* renamed from: e */
        public int f168827e;

        /* renamed from: f */
        public final /* synthetic */ C59011e0 f168828f;

        /* renamed from: fh1.d0$a$a */
        public static final class C59007a extends SimplePAGViewUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ C59011e0 f168829d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f168830e;

            /* renamed from: f */
            public final /* synthetic */ C53916l<C13598b0> f168831f;

            public C59007a(C59011e0 e0Var, C8477a0 a0Var, C53916l<? super C13598b0> lVar) {
                this.f168829d = e0Var;
                this.f168830e = a0Var;
                this.f168831f = lVar;
            }

            public void onAnimationCancel(PAGView pAGView) {
                Log.m105924i(this.f168829d.f168837j, "start hot comment animation, onAnimationCancel");
                C8477a0 a0Var = this.f168830e;
                if (!a0Var.f27482d) {
                    a0Var.f27482d = true;
                    PAGView pAGView2 = this.f168829d.f168843s;
                    if (pAGView2 != null) {
                        pAGView2.removeListener(this);
                    }
                    C53916l<C13598b0> lVar = this.f168831f;
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                }
            }

            public void onAnimationEnd(PAGView pAGView) {
                Log.m105924i(this.f168829d.f168837j, "start hot comment animation, onAnimationEnd");
                C8477a0 a0Var = this.f168830e;
                if (!a0Var.f27482d) {
                    a0Var.f27482d = true;
                    PAGView pAGView2 = this.f168829d.f168843s;
                    if (pAGView2 != null) {
                        pAGView2.removeListener(this);
                    }
                    C53916l<C13598b0> lVar = this.f168831f;
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                }
            }

            public void onAnimationRepeat(PAGView pAGView) {
            }

            public void onAnimationStart(PAGView pAGView) {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59006a(C59011e0 e0Var, C15601d<? super C59006a> dVar) {
            super(2, dVar);
            this.f168828f = e0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59006a(this.f168828f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59006a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f168827e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PAGView pAGView = this.f168828f.f168843s;
                if (pAGView != null) {
                    pAGView.setVisibility(0);
                }
                C59011e0 e0Var = this.f168828f;
                this.f168826d = e0Var;
                this.f168827e = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                C8477a0 a0Var = new C8477a0();
                PAGView pAGView2 = e0Var.f168843s;
                if (pAGView2 != null) {
                    pAGView2.addListener(new C59007a(e0Var, a0Var, mVar));
                }
                Log.m105924i(e0Var.f168837j, "start hot comment animation, playOnce!");
                PAGView pAGView3 = e0Var.f168843s;
                if (pAGView3 != null) {
                    pAGView3.play();
                }
                if (mVar.mo74608o() == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C59011e0 e0Var2 = (C59011e0) this.f168826d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i(this.f168828f.f168837j, "stop hot comment animation");
            PAGView pAGView4 = this.f168828f.f168843s;
            if (pAGView4 != null) {
                pAGView4.stop();
            }
            PAGView pAGView5 = this.f168828f.f168843s;
            if (pAGView5 != null) {
                pAGView5.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.HotCommentAnimationController$checkStartJob$1$2", mo125469f = "HotCommentAnimationController.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.d0$b */
    public static final class C59008b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C59011e0 f168832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59008b(C59011e0 e0Var, C15601d<? super C59008b> dVar) {
            super(2, dVar);
            this.f168832d = e0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59008b(this.f168832d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59008b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            PAGView pAGView = this.f168832d.f168843s;
            if (pAGView != null) {
                pAGView.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59005d0(C59011e0 e0Var, C15601d<? super C59005d0> dVar) {
        super(2, dVar);
        this.f168825f = e0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59005d0(this.f168825f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59005d0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a2 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r12.f168824e
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r6) goto L_0x001a
            if (r1 == r2) goto L_0x0026
            if (r1 != r4) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001a:
            java.lang.Object r1 = r12.f168823d
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r13)
            r7 = r1
            r1 = r0
            r0 = r12
            goto L_0x0116
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
        L_0x002a:
            fh1.e0 r1 = r13.f168825f
            java.util.concurrent.ConcurrentLinkedQueue<te3.au0> r1 = r1.f168840p
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x01a2
            fh1.e0 r1 = r13.f168825f
            java.util.concurrent.ConcurrentLinkedQueue<te3.au0> r1 = r1.f168840p
            java.lang.Object r1 = r1.poll()
            te3.au0 r1 = (te3.C48762au0) r1
            java.lang.String r1 = r1.f130772d
            if (r1 == 0) goto L_0x004c
            int r7 = r1.length()
            if (r7 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r7 = 0
            goto L_0x004d
        L_0x004c:
            r7 = 1
        L_0x004d:
            if (r7 == 0) goto L_0x0059
            fh1.e0 r1 = r13.f168825f
            java.lang.String r1 = r1.f168837j
            java.lang.String r7 = "resourceId empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
            goto L_0x002a
        L_0x0059:
            fh1.e0 r7 = r13.f168825f
            java.util.ArrayList<te3.y11> r7 = r7.f168839o
            java.util.Iterator r7 = r7.iterator()
        L_0x0061:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0077
            java.lang.Object r8 = r7.next()
            r9 = r8
            te3.y11 r9 = (te3.C52051y11) r9
            java.lang.String r9 = r9.f145072f
            boolean r9 = gy3.C87412m.m108589b(r9, r1)
            if (r9 == 0) goto L_0x0061
            goto L_0x0078
        L_0x0077:
            r8 = r5
        L_0x0078:
            te3.y11 r8 = (te3.C52051y11) r8
            if (r8 != 0) goto L_0x0095
            fh1.e0 r7 = r13.f168825f
            java.lang.String r7 = r7.f168837j
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "animationInfo empty, resourceId:"
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            goto L_0x002a
        L_0x0095:
            fh1.e0 r1 = r13.f168825f
            boolean r1 = r1.mo9310g3()
            if (r1 == 0) goto L_0x00a0
            te3.z4 r1 = r8.f145070d
            goto L_0x00a2
        L_0x00a0:
            te3.z4 r1 = r8.f145071e
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            java.lang.String r7 = r1.f145681d
            goto L_0x00a8
        L_0x00a7:
            r7 = r5
        L_0x00a8:
            fh1.e0 r8 = r13.f168825f
            java.lang.String r8 = r8.f168837j
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "url:"
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            if (r1 == 0) goto L_0x002a
            if (r7 == 0) goto L_0x00ce
            int r1 = r7.length()
            if (r1 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r1 = 0
            goto L_0x00cf
        L_0x00ce:
            r1 = 1
        L_0x00cf:
            if (r1 == 0) goto L_0x00d3
            goto L_0x002a
        L_0x00d3:
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.p1 r1 = (tf0.C64916p1) r1
            fh1.e0 r8 = r13.f168825f
            java.lang.String r8 = r8.f168838n
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r7)
            java.lang.String r10 = "getMD5String(url)"
            gy3.C87412m.m108593f(r9, r10)
            java.lang.String r1 = r1.mo76726wa(r8, r9)
            fh1.e0 r8 = r13.f168825f
            java.lang.String r8 = r8.f168837j
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "loadpag, path:"
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            fi1.d r8 = fi1.C59098d.f169061a
            r13.f168823d = r1
            r13.f168824e = r6
            java.lang.Object r7 = r8.mo84292a(r7, r1, r13)
            if (r7 != r0) goto L_0x0111
            return r0
        L_0x0111:
            r11 = r0
            r0 = r13
            r13 = r7
            r7 = r1
            r1 = r11
        L_0x0116:
            fi1.d$a r13 = (fi1.C59098d.C59099a) r13
            boolean r13 = r13 instanceof fi1.C59098d.C59099a.C59101b
            if (r13 == 0) goto L_0x0183
            fh1.e0 r13 = r0.f168825f
            java.lang.String r13 = r13.f168837j
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "loadpag succ, start play, pagView:"
            r8.append(r9)
            fh1.e0 r9 = r0.f168825f
            org.libpag.PAGView r9 = r9.f168843s
            if (r9 == 0) goto L_0x0135
            int r9 = r9.hashCode()
            goto L_0x0136
        L_0x0135:
            r9 = 0
        L_0x0136:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r8)
            fh1.e0 r13 = r0.f168825f
            org.libpag.PAGView r13 = r13.f168843s
            if (r13 != 0) goto L_0x0147
            goto L_0x014e
        L_0x0147:
            org.libpag.PAGFile r7 = org.libpag.PAGFile.Load((java.lang.String) r7)
            r13.setComposition(r7)
        L_0x014e:
            fh1.e0 r13 = r0.f168825f
            org.libpag.PAGView r13 = r13.f168843s
            if (r13 == 0) goto L_0x0157
            r13.setScaleMode(r4)
        L_0x0157:
            fh1.e0 r13 = r0.f168825f
            org.libpag.PAGView r13 = r13.f168843s
            if (r13 == 0) goto L_0x0160
            r13.setRepeatCount(r6)
        L_0x0160:
            fh1.e0 r13 = r0.f168825f
            org.libpag.PAGView r13 = r13.f168843s
            if (r13 == 0) goto L_0x0169
            r13.flush()
        L_0x0169:
            a14.h0 r13 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            fh1.d0$a r7 = new fh1.d0$a
            fh1.e0 r8 = r0.f168825f
            r7.<init>(r8, r5)
            r0.f168823d = r5
            r0.f168824e = r2
            java.lang.Object r13 = a14.C53895h.m60469g(r13, r7, r0)
            if (r13 != r1) goto L_0x017f
            return r1
        L_0x017f:
            r13 = r0
            r0 = r1
            goto L_0x002a
        L_0x0183:
            fh1.e0 r13 = r0.f168825f
            java.lang.String r13 = r13.f168837j
            java.lang.String r7 = "loadpag failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r7)
            a14.h0 r13 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            fh1.d0$b r7 = new fh1.d0$b
            fh1.e0 r8 = r0.f168825f
            r7.<init>(r8, r5)
            r0.f168823d = r5
            r0.f168824e = r4
            java.lang.Object r13 = a14.C53895h.m60469g(r13, r7, r0)
            if (r13 != r1) goto L_0x017f
            return r1
        L_0x01a2:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59005d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
