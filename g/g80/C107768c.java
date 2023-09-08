package g80;

import android.opengl.EGL14;
import e80.C107262j;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.ResultKt;
import p80.C110194c;
import rx3.C13598b0;
import u80.C111139a;
import u80.C111144f;
import v70.C111387b;
import v70.C111409v;
import w80.C111742d;
import wx3.C15601d;
import xx3.C15911a;
import y70.C38971a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: g80.c */
public final class C107768c implements C111409v {

    /* renamed from: d */
    public int f322536d;

    /* renamed from: e */
    public final C107262j f322537e;

    /* renamed from: f */
    public C111742d.C65942b f322538f;

    /* renamed from: g */
    public C111144f f322539g;

    /* renamed from: h */
    public C111139a f322540h;

    /* renamed from: i */
    public C111139a f322541i;

    /* renamed from: j */
    public C111387b f322542j;

    /* renamed from: n */
    public C110194c f322543n;

    /* renamed from: o */
    public C110194c f322544o;

    /* renamed from: p */
    public final boolean f322545p = C38971a.f104993a.mo61855c();

    /* renamed from: q */
    public long f322546q;

    /* renamed from: r */
    public long f322547r;

    /* renamed from: s */
    public long f322548s;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {113}, mo125471m = "customRender")
    /* renamed from: g80.c$a */
    public static final class C107769a extends C66704d {

        /* renamed from: d */
        public Object f322549d;

        /* renamed from: e */
        public /* synthetic */ Object f322550e;

        /* renamed from: f */
        public final /* synthetic */ C107768c f322551f;

        /* renamed from: g */
        public int f322552g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107769a(C107768c cVar, C15601d<? super C107769a> dVar) {
            super(dVar);
            this.f322551f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322550e = obj;
            this.f322552g |= Integer.MIN_VALUE;
            return this.f322551f.mo158194c((C110194c) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline$customRender$cost$1", mo125469f = "CameraRenderPipeline.kt", mo125470l = {114}, mo125471m = "invokeSuspend")
    /* renamed from: g80.c$b */
    public static final class C107770b extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f322553d;

        /* renamed from: e */
        public int f322554e;

        /* renamed from: f */
        public final /* synthetic */ C107768c f322555f;

        /* renamed from: g */
        public final /* synthetic */ C110194c f322556g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107770b(C107768c cVar, C110194c cVar2, C15601d<? super C107770b> dVar) {
            super(1, dVar);
            this.f322555f = cVar;
            this.f322556g = cVar2;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C107770b(this.f322555f, this.f322556g, dVar);
        }

        public Object invoke(Object obj) {
            return ((C107770b) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C110194c cVar;
            C107768c cVar2;
            C107768c cVar3;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f322554e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                cVar3 = this.f322555f;
                C111387b bVar = cVar3.f322542j;
                if (bVar != null) {
                    C110194c cVar4 = this.f322556g;
                    this.f322553d = cVar3;
                    this.f322554e = 1;
                    Object a = bVar.mo149729a(cVar4, this);
                    if (a == aVar) {
                        return aVar;
                    }
                    cVar2 = cVar3;
                    obj = a;
                }
                cVar2 = cVar3;
                cVar = this.f322556g;
                cVar2.f322543n = cVar;
                return C13598b0.f38549a;
            } else if (i == 1) {
                cVar2 = (C107768c) this.f322553d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (C110194c) obj;
            if (cVar == null) {
                cVar3 = cVar2;
                cVar2 = cVar3;
                cVar = this.f322556g;
            }
            cVar2.f322543n = cVar;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {141}, mo125471m = "drawLastFrame")
    /* renamed from: g80.c$c */
    public static final class C107771c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f322557d;

        /* renamed from: e */
        public final /* synthetic */ C107768c f322558e;

        /* renamed from: f */
        public int f322559f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107771c(C107768c cVar, C15601d<? super C107771c> dVar) {
            super(dVar);
            this.f322558e = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322557d = obj;
            this.f322559f |= Integer.MIN_VALUE;
            return this.f322558e.mo158195e(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {168}, mo125471m = "release")
    /* renamed from: g80.c$d */
    public static final class C107772d extends C66704d {

        /* renamed from: d */
        public Object f322560d;

        /* renamed from: e */
        public /* synthetic */ Object f322561e;

        /* renamed from: f */
        public final /* synthetic */ C107768c f322562f;

        /* renamed from: g */
        public int f322563g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107772d(C107768c cVar, C15601d<? super C107772d> dVar) {
            super(dVar);
            this.f322562f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322561e = obj;
            this.f322563g |= Integer.MIN_VALUE;
            return this.f322562f.mo158196g(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {65, 70, 71}, mo125471m = "render")
    /* renamed from: g80.c$e */
    public static final class C107773e extends C66704d {

        /* renamed from: d */
        public Object f322564d;

        /* renamed from: e */
        public Object f322565e;

        /* renamed from: f */
        public /* synthetic */ Object f322566f;

        /* renamed from: g */
        public final /* synthetic */ C107768c f322567g;

        /* renamed from: h */
        public int f322568h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107773e(C107768c cVar, C15601d<? super C107773e> dVar) {
            super(dVar);
            this.f322567g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322566f = obj;
            this.f322568h |= Integer.MIN_VALUE;
            return this.f322567g.mo158197h((C110194c) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {75, 80, 81}, mo125471m = "render")
    /* renamed from: g80.c$f */
    public static final class C107774f extends C66704d {

        /* renamed from: d */
        public Object f322569d;

        /* renamed from: e */
        public Object f322570e;

        /* renamed from: f */
        public /* synthetic */ Object f322571f;

        /* renamed from: g */
        public final /* synthetic */ C107768c f322572g;

        /* renamed from: h */
        public int f322573h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107774f(C107768c cVar, C15601d<? super C107774f> dVar) {
            super(dVar);
            this.f322572g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322571f = obj;
            this.f322573h |= Integer.MIN_VALUE;
            return this.f322572g.mo158198j((byte[]) null, 0, 0, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {181}, mo125471m = "renderCost")
    /* renamed from: g80.c$g */
    public static final class C107775g extends C66704d {

        /* renamed from: d */
        public Object f322574d;

        /* renamed from: e */
        public long f322575e;

        /* renamed from: f */
        public /* synthetic */ Object f322576f;

        /* renamed from: g */
        public final /* synthetic */ C107768c f322577g;

        /* renamed from: h */
        public int f322578h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107775g(C107768c cVar, C15601d<? super C107775g> dVar) {
            super(dVar);
            this.f322577g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322576f = obj;
            this.f322578h |= Integer.MIN_VALUE;
            return this.f322577g.mo158199o((C32226l<? super C15601d<? super C13598b0>, ? extends Object>) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {100}, mo125471m = "renderFormat")
    /* renamed from: g80.c$h */
    public static final class C107776h extends C66704d {

        /* renamed from: d */
        public Object f322579d;

        /* renamed from: e */
        public Object f322580e;

        /* renamed from: f */
        public /* synthetic */ Object f322581f;

        /* renamed from: g */
        public final /* synthetic */ C107768c f322582g;

        /* renamed from: h */
        public int f322583h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107776h(C107768c cVar, C15601d<? super C107776h> dVar) {
            super(dVar);
            this.f322582g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322581f = obj;
            this.f322583h |= Integer.MIN_VALUE;
            return this.f322582g.mo158200p((C110194c) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline$renderFormat$cost$1", mo125469f = "CameraRenderPipeline.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: g80.c$i */
    public static final class C107777i extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C107768c f322584d;

        /* renamed from: e */
        public final /* synthetic */ C110194c f322585e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107777i(C107768c cVar, C110194c cVar2, C15601d<? super C107777i> dVar) {
            super(1, dVar);
            this.f322584d = cVar;
            this.f322585e = cVar2;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C107777i(this.f322584d, this.f322585e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C107777i) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C111139a aVar = this.f322584d.f322540h;
            if (aVar != null) {
                C110194c cVar = this.f322585e;
                aVar.mo143263u(cVar.f329657j, cVar.f329658n);
            }
            C107768c cVar2 = this.f322584d;
            C111139a aVar2 = cVar2.f322540h;
            if (aVar2 != null) {
                aVar2.mo158522s(cVar2.f322537e.f320924c.f320920a, this.f322584d.f322537e.f320924c.f320921b);
            }
            C111139a aVar3 = this.f322584d.f322540h;
            if (aVar3 != null) {
                aVar3.mo159578p(this.f322585e.f329652e);
            }
            C107768c cVar3 = this.f322584d;
            C111139a aVar4 = cVar3.f322540h;
            if (aVar4 != null) {
                aVar4.mo143262q(cVar3.f322537e.f320925d);
            }
            C107768c cVar4 = this.f322584d;
            C111139a aVar5 = cVar4.f322540h;
            if (aVar5 != null) {
                aVar5.mo158479j(cVar4.f322537e.f320926e);
            }
            C111139a aVar6 = this.f322584d.f322540h;
            if (aVar6 != null) {
                aVar6.mo162879m();
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {123}, mo125471m = "renderScreen")
    /* renamed from: g80.c$j */
    public static final class C107778j extends C66704d {

        /* renamed from: d */
        public Object f322586d;

        /* renamed from: e */
        public /* synthetic */ Object f322587e;

        /* renamed from: f */
        public final /* synthetic */ C107768c f322588f;

        /* renamed from: g */
        public int f322589g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107778j(C107768c cVar, C15601d<? super C107778j> dVar) {
            super(dVar);
            this.f322588f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322587e = obj;
            this.f322589g |= Integer.MIN_VALUE;
            return this.f322588f.mo158201q((C110194c) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline$renderScreen$cost$1", mo125469f = "CameraRenderPipeline.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: g80.c$k */
    public static final class C107779k extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C107768c f322590d;

        /* renamed from: e */
        public final /* synthetic */ C110194c f322591e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107779k(C107768c cVar, C110194c cVar2, C15601d<? super C107779k> dVar) {
            super(1, dVar);
            this.f322590d = cVar;
            this.f322591e = cVar2;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C107779k(this.f322590d, this.f322591e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C107779k) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C107768c cVar = this.f322590d;
            C110194c cVar2 = this.f322591e;
            cVar.f322544o = cVar2;
            C111139a aVar = cVar.f322541i;
            if (aVar != null) {
                aVar.mo143263u(cVar2.f329657j, cVar2.f329658n);
            }
            C107768c cVar3 = this.f322590d;
            C111139a aVar2 = cVar3.f322541i;
            if (aVar2 != null) {
                aVar2.mo158522s(cVar3.f322537e.f320922a.f320920a, this.f322590d.f322537e.f320922a.f320921b);
            }
            C111139a aVar3 = this.f322590d.f322541i;
            if (aVar3 != null) {
                aVar3.mo159578p(this.f322591e.f329652e);
            }
            C111139a aVar4 = this.f322590d.f322541i;
            if (aVar4 != null) {
                aVar4.mo162879m();
            }
            C111742d.C65942b bVar = this.f322590d.f322538f;
            if (bVar != null) {
                EGL14.eglSwapBuffers(bVar.f189591a, bVar.f189592b);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline", mo125469f = "CameraRenderPipeline.kt", mo125470l = {85}, mo125471m = "renderYUV")
    /* renamed from: g80.c$l */
    public static final class C107780l extends C66704d {

        /* renamed from: d */
        public Object f322592d;

        /* renamed from: e */
        public /* synthetic */ Object f322593e;

        /* renamed from: f */
        public final /* synthetic */ C107768c f322594f;

        /* renamed from: g */
        public int f322595g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107780l(C107768c cVar, C15601d<? super C107780l> dVar) {
            super(dVar);
            this.f322594f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f322593e = obj;
            this.f322595g |= Integer.MIN_VALUE;
            return this.f322594f.mo158202r((byte[]) null, 0, 0, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.render.CameraRenderPipeline$renderYUV$cost$1", mo125469f = "CameraRenderPipeline.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: g80.c$m */
    public static final class C107781m extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C107768c f322596d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f322597e;

        /* renamed from: f */
        public final /* synthetic */ int f322598f;

        /* renamed from: g */
        public final /* synthetic */ int f322599g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107781m(C107768c cVar, byte[] bArr, int i, int i2, C15601d<? super C107781m> dVar) {
            super(1, dVar);
            this.f322596d = cVar;
            this.f322597e = bArr;
            this.f322598f = i;
            this.f322599g = i2;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C107781m(this.f322596d, this.f322597e, this.f322598f, this.f322599g, dVar);
        }

        public Object invoke(Object obj) {
            return ((C107781m) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C111144f fVar = this.f322596d.f322539g;
            if (fVar != null) {
                fVar.mo162880o(this.f322597e);
            }
            C111144f fVar2 = this.f322596d.f322539g;
            if (fVar2 != null) {
                fVar2.mo143263u(this.f322598f, this.f322599g);
            }
            C107768c cVar = this.f322596d;
            C111144f fVar3 = cVar.f322539g;
            if (fVar3 != null) {
                fVar3.mo158522s(cVar.f322537e.f320924c.f320920a, this.f322596d.f322537e.f320924c.f320921b);
            }
            C107768c cVar2 = this.f322596d;
            C111144f fVar4 = cVar2.f322539g;
            if (fVar4 != null) {
                fVar4.f332758m = cVar2.f322537e.f320925d;
            }
            C107768c cVar3 = this.f322596d;
            C111144f fVar5 = cVar3.f322539g;
            if (fVar5 != null) {
                fVar5.f332760o = cVar3.f322537e.f320926e;
            }
            C111144f fVar6 = this.f322596d.f322539g;
            if (fVar6 != null) {
                fVar6.mo162879m();
            }
            return C13598b0.f38549a;
        }
    }

    public C107768c(int i, C107262j jVar) {
        C87412m.m108594g(jVar, "sizeParameter");
        this.f322536d = i;
        this.f322537e = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158194c(p80.C110194c r5, wx3.C15601d<? super p80.C110194c> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g80.C107768c.C107769a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            g80.c$a r0 = (g80.C107768c.C107769a) r0
            int r1 = r0.f322552g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322552g = r1
            goto L_0x0018
        L_0x0013:
            g80.c$a r0 = new g80.c$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f322550e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322552g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f322549d
            g80.c r5 = (g80.C107768c) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0048
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            g80.c$b r6 = new g80.c$b
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f322549d = r4
            r0.f322552g = r3
            java.lang.Object r6 = r4.mo158199o(r6, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r5 = r4
        L_0x0048:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            long r2 = r5.f322547r
            long r2 = r2 + r0
            r5.f322547r = r2
            p80.c r5 = r5.f322543n
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158194c(p80.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158195e(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g80.C107768c.C107771c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            g80.c$c r0 = (g80.C107768c.C107771c) r0
            int r1 = r0.f322559f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322559f = r1
            goto L_0x0018
        L_0x0013:
            g80.c$c r0 = new g80.c$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f322557d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322559f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            p80.c r6 = r5.f322544o
            if (r6 == 0) goto L_0x0046
            java.lang.String r2 = "MicroMsg.Camera.CameraRenderPipeline"
            java.lang.String r4 = "drawLastFrame"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            r0.f322559f = r3
            java.lang.Object r6 = r5.mo158201q(r6, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158195e(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158196g(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g80.C107768c.C107772d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            g80.c$d r0 = (g80.C107768c.C107772d) r0
            int r1 = r0.f322563g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322563g = r1
            goto L_0x0018
        L_0x0013:
            g80.c$d r0 = new g80.c$d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f322561e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322563g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r0 = r0.f322560d
            g80.c r0 = (g80.C107768c) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0069
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.Camera.CameraRenderPipeline"
            java.lang.String r2 = "release"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            u80.f r6 = r5.f322539g
            if (r6 == 0) goto L_0x0045
            r6.mo158471l()
        L_0x0045:
            r5.f322539g = r4
            u80.a r6 = r5.f322540h
            if (r6 == 0) goto L_0x004e
            r6.mo158471l()
        L_0x004e:
            r5.f322540h = r4
            u80.a r6 = r5.f322541i
            if (r6 == 0) goto L_0x0057
            r6.mo158471l()
        L_0x0057:
            r5.f322541i = r4
            v70.b r6 = r5.f322542j
            if (r6 == 0) goto L_0x0068
            r0.f322560d = r5
            r0.f322563g = r3
            java.lang.Object r6 = r6.mo149730b(r0)
            if (r6 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r0 = r5
        L_0x0069:
            p80.c r6 = r0.f322544o
            if (r6 == 0) goto L_0x0070
            r6.close()
        L_0x0070:
            r0.f322544o = r4
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158196g(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158197h(p80.C110194c r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g80.C107768c.C107773e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            g80.c$e r0 = (g80.C107768c.C107773e) r0
            int r1 = r0.f322568h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322568h = r1
            goto L_0x0018
        L_0x0013:
            g80.c$e r0 = new g80.c$e
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f322566f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322568h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0088
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.f322565e
            g80.c r7 = (g80.C107768c) r7
            java.lang.Object r2 = r0.f322564d
            g80.c r2 = (g80.C107768c) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0074
        L_0x0041:
            java.lang.Object r7 = r0.f322564d
            g80.c r7 = (g80.C107768c) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0058
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f322564d = r6
            r0.f322568h = r5
            java.lang.Object r8 = r6.mo158200p(r7, r0)
            if (r8 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r7 = r6
        L_0x0058:
            p80.c r8 = (p80.C110194c) r8
            if (r8 != 0) goto L_0x0066
            java.lang.String r7 = "MicroMsg.Camera.CameraRenderPipeline"
            java.lang.String r8 = "renderFormat return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x0066:
            r0.f322564d = r7
            r0.f322565e = r7
            r0.f322568h = r4
            java.lang.Object r8 = r7.mo158194c(r8, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r7
        L_0x0074:
            p80.c r8 = (p80.C110194c) r8
            r7.f322543n = r8
            p80.c r7 = r2.f322543n
            r8 = 0
            r0.f322564d = r8
            r0.f322565e = r8
            r0.f322568h = r3
            java.lang.Object r7 = r2.mo158201q(r7, r0)
            if (r7 != r1) goto L_0x0088
            return r1
        L_0x0088:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158197h(p80.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158198j(byte[] r7, int r8, int r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof g80.C107768c.C107774f
            if (r0 == 0) goto L_0x0013
            r0 = r10
            g80.c$f r0 = (g80.C107768c.C107774f) r0
            int r1 = r0.f322573h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322573h = r1
            goto L_0x0018
        L_0x0013:
            g80.c$f r0 = new g80.c$f
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f322571f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322573h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0088
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.f322570e
            g80.c r7 = (g80.C107768c) r7
            java.lang.Object r8 = r0.f322569d
            g80.c r8 = (g80.C107768c) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0074
        L_0x0041:
            java.lang.Object r7 = r0.f322569d
            g80.c r7 = (g80.C107768c) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0058
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.f322569d = r6
            r0.f322573h = r5
            java.lang.Object r10 = r6.mo158202r(r7, r8, r9, r0)
            if (r10 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r7 = r6
        L_0x0058:
            p80.c r10 = (p80.C110194c) r10
            if (r10 != 0) goto L_0x0066
            java.lang.String r7 = "MicroMsg.Camera.CameraRenderPipeline"
            java.lang.String r8 = "renderFormat return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x0066:
            r0.f322569d = r7
            r0.f322570e = r7
            r0.f322573h = r4
            java.lang.Object r10 = r7.mo158194c(r10, r0)
            if (r10 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r8 = r7
        L_0x0074:
            p80.c r10 = (p80.C110194c) r10
            r7.f322543n = r10
            p80.c r7 = r8.f322543n
            r9 = 0
            r0.f322569d = r9
            r0.f322570e = r9
            r0.f322573h = r3
            java.lang.Object r7 = r8.mo158201q(r7, r0)
            if (r7 != r1) goto L_0x0088
            return r1
        L_0x0088:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158198j(byte[], int, int, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158199o(fy3.C32226l<? super wx3.C15601d<? super rx3.C13598b0>, ? extends java.lang.Object> r7, wx3.C15601d<? super java.lang.Long> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g80.C107768c.C107775g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            g80.c$g r0 = (g80.C107768c.C107775g) r0
            int r1 = r0.f322578h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322578h = r1
            goto L_0x0018
        L_0x0013:
            g80.c$g r0 = new g80.c$g
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f322576f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322578h
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r1 = r0.f322575e
            java.lang.Object r7 = r0.f322574d
            g80.c r7 = (g80.C107768c) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r8)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f322574d = r6
            r0.f322575e = r4
            r0.f322578h = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r7 = r6
            r1 = r4
        L_0x004b:
            boolean r7 = r7.f322545p
            if (r7 == 0) goto L_0x0052
            android.opengl.GLES20.glFinish()
        L_0x0052:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158199o(fy3.l, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r7 = r7.f332754i;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158200p(p80.C110194c r6, wx3.C15601d<? super p80.C110194c> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g80.C107768c.C107776h
            if (r0 == 0) goto L_0x0013
            r0 = r7
            g80.c$h r0 = (g80.C107768c.C107776h) r0
            int r1 = r0.f322583h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322583h = r1
            goto L_0x0018
        L_0x0013:
            g80.c$h r0 = new g80.c$h
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f322581f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322583h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f322580e
            p80.c r6 = (p80.C110194c) r6
            java.lang.Object r0 = r0.f322579d
            g80.c r0 = (g80.C107768c) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            if (r6 != 0) goto L_0x003e
            return r7
        L_0x003e:
            g80.c$i r2 = new g80.c$i
            r2.<init>(r5, r6, r7)
            r0.f322579d = r5
            r0.f322580e = r6
            r0.f322583h = r3
            java.lang.Object r7 = r5.mo158199o(r2, r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r5
        L_0x0051:
            java.lang.Number r7 = (java.lang.Number) r7
            long r1 = r7.longValue()
            long r3 = r0.f322546q
            long r3 = r3 + r1
            r0.f322546q = r3
            u80.a r7 = r0.f322540h
            if (r7 == 0) goto L_0x0066
            p80.c r7 = r7.f332754i
            if (r7 != 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r6 = r7
        L_0x0066:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158200p(p80.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158201q(p80.C110194c r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof g80.C107768c.C107778j
            if (r0 == 0) goto L_0x0013
            r0 = r10
            g80.c$j r0 = (g80.C107768c.C107778j) r0
            int r1 = r0.f322589g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322589g = r1
            goto L_0x0018
        L_0x0013:
            g80.c$j r0 = new g80.c$j
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f322587e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322589g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r9 = r0.f322586d
            g80.c r9 = (g80.C107768c) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 != 0) goto L_0x003b
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        L_0x003b:
            g80.c$k r10 = new g80.c$k
            r2 = 0
            r10.<init>(r8, r9, r2)
            r0.f322586d = r8
            r0.f322589g = r3
            java.lang.Object r10 = r8.mo158199o(r10, r0)
            if (r10 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r9 = r8
        L_0x004d:
            java.lang.Number r10 = (java.lang.Number) r10
            long r0 = r10.longValue()
            long r2 = r9.f322548s
            long r2 = r2 + r0
            r9.f322548s = r2
            h80.a r10 = h80.C108171a.f323903a
            int r0 = r9.f322536d
            long r4 = r9.f322546q
            long r6 = r9.f322547r
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r9 = r10.mo158577a(r0)
            if (r9 == 0) goto L_0x006c
            r9.f310098q = r4
            r9.f310099r = r6
            r9.f310100s = r2
        L_0x006c:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158201q(p80.c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158202r(byte[] r11, int r12, int r13, wx3.C15601d<? super p80.C110194c> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof g80.C107768c.C107780l
            if (r0 == 0) goto L_0x0013
            r0 = r14
            g80.c$l r0 = (g80.C107768c.C107780l) r0
            int r1 = r0.f322595g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f322595g = r1
            goto L_0x0018
        L_0x0013:
            g80.c$l r0 = new g80.c$l
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f322593e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f322595g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r11 = r0.f322592d
            g80.c r11 = (g80.C107768c) r11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r14)
            g80.c$m r14 = new g80.c$m
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f322592d = r10
            r0.f322595g = r3
            java.lang.Object r14 = r10.mo158199o(r14, r0)
            if (r14 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r11 = r10
        L_0x004d:
            java.lang.Number r14 = (java.lang.Number) r14
            long r12 = r14.longValue()
            long r0 = r11.f322546q
            long r0 = r0 + r12
            r11.f322546q = r0
            u80.f r11 = r11.f322539g
            if (r11 == 0) goto L_0x005f
            p80.c r11 = r11.f332754i
            goto L_0x0060
        L_0x005f:
            r11 = 0
        L_0x0060:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.C107768c.mo158202r(byte[], int, int, wx3.d):java.lang.Object");
    }

    public void setCustomRender(C111387b bVar) {
        this.f322542j = bVar;
    }
}
