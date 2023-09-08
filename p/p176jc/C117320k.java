package p176jc;

import a14.C0000n0;
import a14.C53873d2;
import a14.C53921m;
import a14.C53930o0;
import a14.C53973z1;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.skyline.SkylineLogic;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Objects;
import kotlin.ResultKt;
import p172io.flutter.embedding.android.RenderMode;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import p172io.flutter.plugin.editing.WxKeyboardAction;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: jc.k */
public final class C117320k implements C87929h {

    /* renamed from: a */
    public final C117310g f351216a;

    /* renamed from: b */
    public final int f351217b;

    /* renamed from: c */
    public boolean f351218c;

    /* renamed from: d */
    public final C87933j f351219d = C87933j.WxSwapSurface;

    /* renamed from: e */
    public final C0000n0 f351220e = C53930o0.m60555b();

    /* renamed from: f */
    public C53973z1 f351221f;

    @C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineFlutterViewWrapperSwapRenderSurfaceImpl$switchFlutterRenderSurface$1", mo125469f = "SkylineFlutterViewWrapper.kt", mo125470l = {395}, mo125471m = "invokeSuspend")
    /* renamed from: jc.k$a */
    public static final class C117321a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f351222d;

        /* renamed from: e */
        public final /* synthetic */ C53973z1 f351223e;

        /* renamed from: f */
        public final /* synthetic */ C117320k f351224f;

        /* renamed from: g */
        public final /* synthetic */ RenderMode f351225g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117321a(C53973z1 z1Var, C117320k kVar, RenderMode renderMode, C15601d<? super C117321a> dVar) {
            super(2, dVar);
            this.f351223e = z1Var;
            this.f351224f = kVar;
            this.f351225g = renderMode;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C117321a(this.f351223e, this.f351224f, this.f351225g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C117321a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f351222d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var = this.f351223e;
                if (z1Var != null) {
                    this.f351222d = 1;
                    if (C53873d2.m60391c(z1Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f351224f.f351216a.mo181980d(this.f351225g, true);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineFlutterViewWrapperSwapRenderSurfaceImpl$switchFlutterRenderSurface$2", mo125469f = "SkylineFlutterViewWrapper.kt", mo125470l = {401}, mo125471m = "invokeSuspend")
    /* renamed from: jc.k$b */
    public static final class C117322b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f351226d;

        /* renamed from: e */
        public final /* synthetic */ C53973z1 f351227e;

        /* renamed from: f */
        public final /* synthetic */ C117320k f351228f;

        /* renamed from: g */
        public final /* synthetic */ RenderMode f351229g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117322b(C53973z1 z1Var, C117320k kVar, RenderMode renderMode, C15601d<? super C117322b> dVar) {
            super(2, dVar);
            this.f351227e = z1Var;
            this.f351228f = kVar;
            this.f351229g = renderMode;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C117322b(this.f351227e, this.f351228f, this.f351229g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C117322b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f351226d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var = this.f351227e;
                if (z1Var != null) {
                    this.f351226d = 1;
                    if (C53873d2.m60391c(z1Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C117310g gVar = this.f351228f.f351216a;
            RenderMode renderMode = this.f351229g;
            int i2 = C117310g.f351194j;
            gVar.mo181980d(renderMode, false);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineFlutterViewWrapperSwapRenderSurfaceImpl$switchFlutterRenderSurface$3", mo125469f = "SkylineFlutterViewWrapper.kt", mo125470l = {408, 412, 426}, mo125471m = "invokeSuspend")
    /* renamed from: jc.k$c */
    public static final class C117323c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f351230d;

        /* renamed from: e */
        public /* synthetic */ Object f351231e;

        /* renamed from: f */
        public final /* synthetic */ RenderMode f351232f;

        /* renamed from: g */
        public final /* synthetic */ long f351233g;

        /* renamed from: h */
        public final /* synthetic */ C53973z1 f351234h;

        /* renamed from: i */
        public final /* synthetic */ C117320k f351235i;

        /* renamed from: j */
        public final /* synthetic */ boolean f351236j;

        @C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineFlutterViewWrapperSwapRenderSurfaceImpl$switchFlutterRenderSurface$3$1", mo125469f = "SkylineFlutterViewWrapper.kt", mo125470l = {414}, mo125471m = "invokeSuspend")
        /* renamed from: jc.k$c$a */
        public static final class C117324a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f351237d;

            /* renamed from: e */
            public final /* synthetic */ C117320k f351238e;

            /* renamed from: f */
            public final /* synthetic */ RenderMode f351239f;

            /* renamed from: g */
            public final /* synthetic */ long f351240g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C117324a(C117320k kVar, RenderMode renderMode, long j, C15601d<? super C117324a> dVar) {
                super(2, dVar);
                this.f351238e = kVar;
                this.f351239f = renderMode;
                this.f351240g = j;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C117324a(this.f351238e, this.f351239f, this.f351240g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C117324a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f351237d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C117310g gVar = this.f351238e.f351216a;
                    this.f351237d = 1;
                    if (gVar.f351197f.isAvailableForRendering()) {
                        obj2 = C13598b0.f38549a;
                    } else {
                        C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                        mVar.mo74609p();
                        gVar.f351200i.add(new C117330n(mVar, gVar));
                        obj2 = mVar.mo74608o();
                        if (obj2 != aVar) {
                            obj2 = C13598b0.f38549a;
                        }
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Objects.toString(this.f351239f);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.luggage.skyline.SkylineFlutterViewWrapperSwapRenderSurfaceImpl$switchFlutterRenderSurface$3$2", mo125469f = "SkylineFlutterViewWrapper.kt", mo125470l = {421}, mo125471m = "invokeSuspend")
        /* renamed from: jc.k$c$b */
        public static final class C117325b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f351241d;

            /* renamed from: e */
            public final /* synthetic */ boolean f351242e;

            /* renamed from: f */
            public final /* synthetic */ RenderMode f351243f;

            /* renamed from: g */
            public final /* synthetic */ long f351244g;

            /* renamed from: h */
            public final /* synthetic */ C117320k f351245h;

            /* renamed from: i */
            public final /* synthetic */ FlutterRenderer f351246i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C117325b(boolean z, RenderMode renderMode, long j, C117320k kVar, FlutterRenderer flutterRenderer, C15601d<? super C117325b> dVar) {
                super(2, dVar);
                this.f351242e = z;
                this.f351243f = renderMode;
                this.f351244g = j;
                this.f351245h = kVar;
                this.f351246i = flutterRenderer;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C117325b(this.f351242e, this.f351243f, this.f351244g, this.f351245h, this.f351246i, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C117325b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f351241d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f351242e) {
                        Objects.toString(this.f351243f);
                        return C13598b0.f38549a;
                    }
                    C117320k kVar = this.f351245h;
                    FlutterRenderer flutterRenderer = this.f351246i;
                    this.f351241d = 1;
                    kVar.getClass();
                    if (flutterRenderer.isDisplayingFlutterUi()) {
                        obj2 = C13598b0.f38549a;
                    } else {
                        C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                        mVar.mo74609p();
                        flutterRenderer.addIsDisplayingFlutterUiListener(new C117327l(mVar, flutterRenderer));
                        obj2 = mVar.mo74608o();
                        if (obj2 != aVar) {
                            obj2 = C13598b0.f38549a;
                        }
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Objects.toString(this.f351243f);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117323c(RenderMode renderMode, long j, C53973z1 z1Var, C117320k kVar, boolean z, C15601d<? super C117323c> dVar) {
            super(2, dVar);
            this.f351232f = renderMode;
            this.f351233g = j;
            this.f351234h = z1Var;
            this.f351235i = kVar;
            this.f351236j = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C117323c cVar = new C117323c(this.f351232f, this.f351233g, this.f351234h, this.f351235i, this.f351236j, dVar);
            cVar.f351231e = obj;
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C117323c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f351230d
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L_0x0030
                if (r2 == r6) goto L_0x0028
                if (r2 == r5) goto L_0x001f
                if (r2 != r4) goto L_0x0017
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x00e5
            L_0x0017:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001f:
                java.lang.Object r2 = r0.f351231e
                io.flutter.embedding.engine.renderer.FlutterRenderer r2 = (p172io.flutter.embedding.engine.renderer.FlutterRenderer) r2
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x00b8
            L_0x0028:
                java.lang.Object r2 = r0.f351231e
                a14.n0 r2 = (a14.C0000n0) r2
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x004b
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r21)
                java.lang.Object r2 = r0.f351231e
                a14.n0 r2 = (a14.C0000n0) r2
                io.flutter.embedding.android.RenderMode r7 = r0.f351232f
                java.util.Objects.toString(r7)
                a14.z1 r7 = r0.f351234h
                if (r7 == 0) goto L_0x004b
                r0.f351231e = r2
                r0.f351230d = r6
                java.lang.Object r7 = a14.C53873d2.m60391c(r7, r0)
                if (r7 != r1) goto L_0x004b
                return r1
            L_0x004b:
                io.flutter.embedding.android.RenderMode r7 = r0.f351232f
                java.util.Objects.toString(r7)
                jc.k r7 = r0.f351235i
                jc.g r7 = r7.f351216a
                io.flutter.embedding.engine.renderer.FlutterRenderer r7 = r7.getAttachedRenderer()
                if (r7 != 0) goto L_0x005d
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x005d:
                io.flutter.embedding.android.RenderMode r8 = r0.f351232f
                java.util.Objects.toString(r8)
                long r12 = r0.f351233g
                a14.u0[] r15 = new a14.C53953u0[r5]
                r16 = 0
                r17 = 0
                jc.k$c$a r18 = new jc.k$c$a
                jc.k r10 = r0.f351235i
                io.flutter.embedding.android.RenderMode r11 = r0.f351232f
                r14 = 0
                r9 = r18
                r9.<init>(r10, r11, r12, r14)
                r12 = 3
                r13 = 0
                r9 = 0
                r10 = 0
                r8 = r2
                r11 = r18
                a14.u0 r8 = a14.C53895h.m60464b(r8, r9, r10, r11, r12, r13)
                r15[r3] = r8
                r18 = 0
                jc.k$c$b r19 = new jc.k$c$b
                boolean r9 = r0.f351236j
                io.flutter.embedding.android.RenderMode r10 = r0.f351232f
                long r11 = r0.f351233g
                jc.k r13 = r0.f351235i
                r8 = r19
                r14 = r7
                r3 = r15
                r15 = r16
                r8.<init>(r9, r10, r11, r13, r14, r15)
                r12 = 3
                r13 = 0
                r8 = r2
                r9 = r17
                r10 = r18
                r11 = r19
                a14.u0 r2 = a14.C53895h.m60464b(r8, r9, r10, r11, r12, r13)
                r3[r6] = r2
                r0.f351231e = r7
                r0.f351230d = r5
                a14.c r2 = new a14.c
                r2.<init>(r3)
                java.lang.Object r2 = r2.mo74488a(r0)
                if (r2 != r1) goto L_0x00b7
                return r1
            L_0x00b7:
                r2 = r7
            L_0x00b8:
                jc.k r3 = r0.f351235i
                r5 = 0
                r0.f351231e = r5
                r0.f351230d = r4
                r3.getClass()
                a14.m r3 = new a14.m
                wx3.d r4 = xx3.C66447b.m78392b(r20)
                r3.<init>(r4, r6)
                r3.mo74609p()
                jc.m r4 = new jc.m
                r4.<init>(r3)
                r2.onNextFrameDisplayed(r4)
                r2.requestDrawLastFrame()
                java.lang.Object r2 = r3.mo74608o()
                if (r2 != r1) goto L_0x00e0
                goto L_0x00e2
            L_0x00e0:
                rx3.b0 r2 = rx3.C13598b0.f38549a
            L_0x00e2:
                if (r2 != r1) goto L_0x00e5
                return r1
            L_0x00e5:
                io.flutter.embedding.android.RenderMode r1 = r0.f351232f
                java.util.Objects.toString(r1)
                jc.k r1 = r0.f351235i
                jc.g r1 = r1.f351216a
                io.flutter.embedding.android.RenderMode r2 = r0.f351232f
                int r3 = p176jc.C117310g.f351194j
                r3 = 0
                r1.mo181980d(r2, r3)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p176jc.C117320k.C117323c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: jc.k$d */
    public static final class C117326d extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RenderMode f351247d;

        /* renamed from: e */
        public final /* synthetic */ C53973z1 f351248e;

        /* renamed from: f */
        public final /* synthetic */ C117320k f351249f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117326d(RenderMode renderMode, C53973z1 z1Var, long j, C117320k kVar) {
            super(1);
            this.f351247d = renderMode;
            this.f351248e = z1Var;
            this.f351249f = kVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.toString(this.f351247d);
            Objects.toString(this.f351248e);
            if (C87412m.m108589b(this.f351248e, this.f351249f.f351221f)) {
                this.f351249f.f351221f = null;
            }
            return C13598b0.f38549a;
        }
    }

    public C117320k(C117310g gVar, int i) {
        C87412m.m108594g(gVar, "flutterView");
        this.f351216a = gVar;
        this.f351217b = i;
        gVar.setEnableSwitchSurface(true);
    }

    /* renamed from: a */
    public void mo122395a(boolean z) {
        mo181997i(RenderMode.surface, z);
    }

    /* renamed from: b */
    public void mo122396b(WxKeyboardAction wxKeyboardAction) {
        this.f351216a.setWxKeyboardAction(wxKeyboardAction);
    }

    /* renamed from: c */
    public void mo122397c() {
        SkylineLogic.INSTANCE.detachFlutterView(this.f351216a);
        C117309c.f351190a.mo181978c(this.f351216a);
    }

    /* renamed from: d */
    public void mo122398d(boolean z) {
        FlutterRenderer attachedRenderer;
        this.f351216a.setVisibility(z ? 0 : 4);
        if (z && (attachedRenderer = this.f351216a.getAttachedRenderer()) != null) {
            Log.m105924i("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "setRenderSurfaceVisible " + this.f351217b + ", visible:" + z + ", displaying:" + attachedRenderer.isDisplayingFlutterUi());
            if (!attachedRenderer.isDisplayingFlutterUi()) {
                attachedRenderer.requestDrawLastFrame();
            }
        }
    }

    /* renamed from: e */
    public void mo122399e(boolean z) {
        mo181997i(RenderMode.texture, z);
    }

    /* renamed from: f */
    public void mo122400f(Context context) {
        C87412m.m108594g(context, "context");
        this.f351216a.mo181979c(context);
    }

    /* renamed from: g */
    public void mo122401g() {
        SkylineLogic.INSTANCE.attachFlutterEngine(this.f351217b, this.f351216a);
        FlutterRenderer attachedRenderer = this.f351216a.getAttachedRenderer();
        if (attachedRenderer != null) {
            attachedRenderer.setCheckSurfaceOnStopOrPause(true);
        }
    }

    public C87933j getMode() {
        return this.f351219d;
    }

    /* renamed from: h */
    public void mo122403h() {
        FlutterRenderer attachedRenderer;
        if (this.f351216a.f351197f.isAvailableForRendering()) {
            FlutterRenderer attachedRenderer2 = this.f351216a.getAttachedRenderer();
            if ((attachedRenderer2 != null && !attachedRenderer2.isDisplayingFlutterUi()) && (attachedRenderer = this.f351216a.getAttachedRenderer()) != null) {
                attachedRenderer.startRenderingToSurface(this.f351216a.getRenderSurface().getRenderSurface(), false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo181997i(p172io.flutter.embedding.android.RenderMode r19, boolean r20) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r0 = r20
            io.flutter.embedding.android.RenderMode r1 = p172io.flutter.embedding.android.RenderMode.surface
            r2 = 0
            if (r9 != r1) goto L_0x0011
            boolean r1 = r8.f351218c
            r8.f351218c = r2
            r6 = r1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            a14.z1 r1 = r8.f351221f
            r3 = 0
            if (r1 == 0) goto L_0x0025
            boolean r4 = r1.mo74466a()
            if (r4 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r3
        L_0x0023:
            r4 = r1
            goto L_0x0026
        L_0x0025:
            r4 = r3
        L_0x0026:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "switchFlutterRenderSurface to mode:"
            r1.append(r5)
            r1.append(r9)
            java.lang.String r5 = ", enforced:"
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = ", isRenderSurface("
            r1.append(r5)
            r1.append(r9)
            java.lang.String r5 = "):"
            r1.append(r5)
            jc.g r5 = r8.f351216a
            r5.getClass()
            java.lang.String r7 = "mode"
            gy3.C87412m.m108594g(r9, r7)
            io.flutter.embedding.android.RenderMode r7 = r5.f351195d
            r12 = 1
            if (r7 != r9) goto L_0x0061
            boolean r5 = r5.isInSwapSurface()
            if (r5 != 0) goto L_0x005f
            r5 = 1
            goto L_0x0065
        L_0x005f:
            r5 = 0
            goto L_0x0065
        L_0x0061:
            boolean r5 = r5.isInSwapSurface()
        L_0x0065:
            r1.append(r5)
            java.lang.String r5 = ", tick:"
            r1.append(r5)
            r1.append(r10)
            java.lang.String r5 = ", lastJob("
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = "), skipAwaitDisplayingUi:"
            r1.append(r5)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl"
            p176jc.C117340s.m165425a(r5, r1)
            if (r4 != 0) goto L_0x00a7
            jc.g r1 = r8.f351216a
            r1.getClass()
            io.flutter.embedding.android.RenderMode r5 = r1.f351195d
            if (r5 != r9) goto L_0x009e
            boolean r1 = r1.isInSwapSurface()
            if (r1 != 0) goto L_0x009c
            r1 = 1
            goto L_0x00a2
        L_0x009c:
            r1 = 0
            goto L_0x00a2
        L_0x009e:
            boolean r1 = r1.isInSwapSurface()
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            if (r0 != 0) goto L_0x00a7
            return
        L_0x00a7:
            if (r0 != 0) goto L_0x0116
            jc.g r0 = r8.f351216a
            java.util.WeakHashMap<android.view.View, e3.a0> r1 = p849e3.C107207u.f320808a
            boolean r0 = p849e3.C107207u.C107211e.m145207b(r0)
            if (r0 == 0) goto L_0x00b4
            goto L_0x00cd
        L_0x00b4:
            jc.g r0 = r8.f351216a
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = com.tencent.p014mm.sdk.system.AndroidContextUtil.castActivityOrNull(r0)
            if (r0 != 0) goto L_0x00c1
            goto L_0x00ce
        L_0x00c1:
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L_0x00ce
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x00ce
        L_0x00cd:
            r2 = 1
        L_0x00ce:
            if (r2 != 0) goto L_0x00d1
            goto L_0x0116
        L_0x00d1:
            jc.g r0 = r8.f351216a
            io.flutter.embedding.android.RenderMode r0 = r0.getRenderMode()
            if (r9 != r0) goto L_0x00f3
            r19.toString()
            a14.n0 r12 = r8.f351220e
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            r14 = 0
            jc.k$b r15 = new jc.k$b
            r15.<init>(r4, r8, r9, r3)
            r16 = 2
            r17 = 0
            a14.z1 r0 = a14.C53895h.m60466d(r12, r13, r14, r15, r16, r17)
            r8.f351221f = r0
            goto L_0x0131
        L_0x00f3:
            r19.toString()
            a14.n0 r12 = r8.f351220e
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            r14 = 0
            jc.k$c r15 = new jc.k$c
            r7 = 0
            r0 = r15
            r1 = r19
            r2 = r10
            r5 = r18
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r5 = 2
            r6 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            a14.z1 r0 = a14.C53895h.m60466d(r1, r2, r3, r4, r5, r6)
            r8.f351221f = r0
            goto L_0x0131
        L_0x0116:
            r19.toString()
            a14.n0 r1 = r8.f351220e
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            r0 = 0
            jc.k$a r5 = new jc.k$a
            r5.<init>(r4, r8, r9, r3)
            r6 = 2
            r7 = 0
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            a14.z1 r0 = a14.C53895h.m60466d(r1, r2, r3, r4, r5, r6)
            r8.f351221f = r0
        L_0x0131:
            a14.z1 r6 = r8.f351221f
            if (r6 == 0) goto L_0x014a
            r19.toString()
            r6.toString()
            jc.k$d r7 = new jc.k$d
            r0 = r7
            r1 = r19
            r2 = r6
            r3 = r10
            r5 = r18
            r0.<init>(r1, r2, r3, r5)
            r6.mo74515E(r7)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p176jc.C117320k.mo181997i(io.flutter.embedding.android.RenderMode, boolean):void");
    }

    public void setBackgroundColor(int i) {
        this.f351216a.setBackgroundColor(i);
    }
}
