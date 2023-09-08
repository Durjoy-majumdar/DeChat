package com.tencent.p014mm.modelimage;

import a14.C0000n0;
import a14.C53934p0;
import a70.C112760b;
import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.api.EmotionStrategyInfo;
import com.tencent.p014mm.autogen.mmdata.rpt.SendImgErrorReportStruct;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C45113r1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import fw0.C87107w;
import fy3.C32224a;
import fy3.C32227p;
import gc3.C27079a;
import gc3.C98101e;
import gc3.C98103n;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kj2.C117407d;
import kotlin.ResultKt;
import p158gt.C32529x;
import p158gt.C76054m;
import p158gt.C98199a0;
import p158gt.C98200b0;
import p158gt.C98201k;
import p158gt.C98202n;
import p158gt.C98209y;
import p248ug.C14183h;
import p876cj.C67380a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z51.C102975i;

@C86522b
/* renamed from: com.tencent.mm.modelimage.f0 */
public final class C92826f0 extends C86301e implements C98202n {

    /* renamed from: i */
    public static final C92827a f267333i = new C92827a((C8480h) null);

    /* renamed from: d */
    public final C13601g f267334d = C36568h.m40985a(C29017h.f79528d);

    /* renamed from: e */
    public final C13601g f267335e = C36568h.m40985a(C92828b.f267339d);

    /* renamed from: f */
    public final C13601g f267336f = C36568h.m40985a(C92831e.f267349d);

    /* renamed from: g */
    public final C13601g f267337g = C36568h.m40985a(C92832f.f267350d);

    /* renamed from: h */
    public final C13601g f267338h = C36568h.m40985a(C29016d.f79527d);

    /* renamed from: com.tencent.mm.modelimage.f0$d */
    public static final class C29016d extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C29016d f79527d = new C29016d();

        public C29016d() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "_image_pre_build";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.f0$h */
    public static final class C29017h extends C87413o implements C32224a<ConcurrentHashMap<String, C32529x>> {

        /* renamed from: d */
        public static final C29017h f79528d = new C29017h();

        public C29017h() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.tencent.mm.modelimage.f0$a */
    public static final class C92827a {
        public C92827a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m117042a(C92827a aVar, String str, String str2) {
            aVar.getClass();
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_remove_c2c_image_exif, 1) == 1) {
                try {
                    Util.clearExif(str2);
                } catch (IllegalArgumentException e) {
                    Log.m105925i("MicroMsg.SendImgPreFeatureService", "clearExif error:%s", e.getMessage());
                    C45113r1.m49956a(str, str2, true);
                } catch (IOException e2) {
                    Log.m105925i("MicroMsg.SendImgPreFeatureService", "clearExif error:%s", e2.getMessage());
                    C45113r1.m49956a(str, str2, true);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.modelimage.f0$b */
    public static final class C92828b extends C87413o implements C32224a<FlowController> {

        /* renamed from: d */
        public static final C92828b f267339d = new C92828b();

        public C92828b() {
            super(0);
        }

        public Object invoke() {
            return new FlowController(99, C1298g0.f10405d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelimage.SendImgPreFeatureService$preAsyncBuildImg$1", mo125469f = "SendImgPreFeatureService.kt", mo125470l = {102, 111}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.modelimage.f0$c */
    public static final class C92829c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f267340d;

        /* renamed from: e */
        public Object f267341e;

        /* renamed from: f */
        public int f267342f;

        /* renamed from: g */
        public final /* synthetic */ C92826f0 f267343g;

        /* renamed from: h */
        public final /* synthetic */ C98199a0 f267344h;

        @C91590f(mo125468c = "com.tencent.mm.modelimage.SendImgPreFeatureService$preAsyncBuildImg$1$1", mo125469f = "SendImgPreFeatureService.kt", mo125470l = {106}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.modelimage.f0$c$a */
        public static final class C92830a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f267345d;

            /* renamed from: e */
            public final /* synthetic */ C92826f0 f267346e;

            /* renamed from: f */
            public final /* synthetic */ C98199a0 f267347f;

            /* renamed from: g */
            public final /* synthetic */ String f267348g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92830a(C92826f0 f0Var, C98199a0 a0Var, String str, C15601d<? super C92830a> dVar) {
                super(2, dVar);
                this.f267346e = f0Var;
                this.f267347f = a0Var;
                this.f267348g = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C92830a(this.f267346e, this.f267347f, this.f267348g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C92830a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f267345d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f267346e.mo127114fU(this.f267347f);
                    String str = this.f267348g;
                    this.f267345d = 1;
                    if (((FlowController) ((C36570n) this.f267346e.f267335e).getValue()).outFlow(str, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Log.m105924i("MicroMsg.SendImgPreFeatureService", "outFlow " + this.f267348g);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92829c(C92826f0 f0Var, C98199a0 a0Var, C15601d<? super C92829c> dVar) {
            super(2, dVar);
            this.f267343g = f0Var;
            this.f267344h = a0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92829c(this.f267343g, this.f267344h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92829c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r14.f267342f
                java.lang.String r2 = "MicroMsg.SendImgPreFeatureService"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002c
                if (r1 == r4) goto L_0x0024
                if (r1 != r3) goto L_0x001c
                java.lang.Object r0 = r14.f267341e
                java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
                java.lang.Object r1 = r14.f267340d
                r2 = r1
                java.lang.String r2 = (java.lang.String) r2
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x00bd
            L_0x001c:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0024:
                java.lang.Object r1 = r14.f267340d
                java.lang.String r1 = (java.lang.String) r1
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x004e
            L_0x002c:
                kotlin.ResultKt.throwOnFailure(r15)
                com.tencent.mm.modelimage.f0 r15 = r14.f267343g
                gt.a0 r1 = r14.f267344h
                java.lang.String r1 = r15.Ug0(r1)
                com.tencent.mm.modelimage.f0 r15 = r14.f267343g
                rx3.g r15 = r15.f267335e
                rx3.n r15 = (rx3.C36570n) r15
                java.lang.Object r15 = r15.getValue()
                com.tencent.mm.sdk.coroutines.FlowController r15 = (com.tencent.p014mm.sdk.coroutines.FlowController) r15
                r14.f267340d = r1
                r14.f267342f = r4
                java.lang.Object r15 = r15.inFlow(r1, r14)
                if (r15 != r0) goto L_0x004e
                return r0
            L_0x004e:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto L_0x0084
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r0 = "inFlow "
                r15.append(r0)
                r15.append(r1)
                java.lang.String r15 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
                com.tencent.mm.modelimage.f0 r15 = r14.f267343g
                rx3.g r15 = r15.f267337g
                rx3.n r15 = (rx3.C36570n) r15
                java.lang.Object r15 = r15.getValue()
                com.tencent.mm.sdk.coroutines.LifecycleScope r15 = (com.tencent.p014mm.sdk.coroutines.LifecycleScope) r15
                com.tencent.mm.modelimage.f0$c$a r0 = new com.tencent.mm.modelimage.f0$c$a
                com.tencent.mm.modelimage.f0 r2 = r14.f267343g
                gt.a0 r3 = r14.f267344h
                r5 = 0
                r0.<init>(r2, r3, r1, r5)
                com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r15, r5, r0, r4, r5)
                goto L_0x00c7
            L_0x0084:
                kj2.d r6 = kj2.C117407d.INSTANCE
                r7 = 1949(0x79d, double:9.63E-321)
                r9 = 1
                r11 = 1
                r13 = 0
                r6.idkeyStat(r7, r9, r11, r13)
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r4 = "already in flow check:"
                r15.append(r4)
                r15.append(r1)
                java.lang.String r1 = " inFlow:"
                r15.append(r1)
                com.tencent.mm.modelimage.f0 r1 = r14.f267343g
                rx3.g r1 = r1.f267335e
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                com.tencent.mm.sdk.coroutines.FlowController r1 = (com.tencent.p014mm.sdk.coroutines.FlowController) r1
                r14.f267340d = r2
                r14.f267341e = r15
                r14.f267342f = r3
                java.lang.Object r1 = r1.currentFlowInfo(r14)
                if (r1 != r0) goto L_0x00bb
                return r0
            L_0x00bb:
                r0 = r15
                r15 = r1
            L_0x00bd:
                r0.append(r15)
                java.lang.String r15 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            L_0x00c7:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92826f0.C92829c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.modelimage.f0$e */
    public static final class C92831e extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public static final C92831e f267349d = new C92831e();

        public C92831e() {
            super(0);
        }

        public Object invoke() {
            return new LifecycleScope("PreBuildImg", C86709a0.m107523b().f251755f, 0, 4, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.f0$f */
    public static final class C92832f extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public static final C92832f f267350d = new C92832f();

        public C92832f() {
            super(0);
        }

        public Object invoke() {
            return new LifecycleScope("PreBuildImgWorker", C86709a0.m107523b().f251755f, 9);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelimage.SendImgPreFeatureService$waitAndSend$1", mo125469f = "SendImgPreFeatureService.kt", mo125470l = {119}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.modelimage.f0$g */
    public static final class C92833g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f267351d;

        /* renamed from: e */
        public final /* synthetic */ C92826f0 f267352e;

        /* renamed from: f */
        public final /* synthetic */ C98209y f267353f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92833g(C92826f0 f0Var, C98209y yVar, C15601d<? super C92833g> dVar) {
            super(2, dVar);
            this.f267352e = f0Var;
            this.f267353f = yVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92833g(this.f267352e, this.f267353f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92833g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f267351d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.SendImgPreFeatureService", "checkPreBuildImg start");
                this.f267351d = 1;
                if (FlowController.waitEmpty$default((FlowController) ((C36570n) this.f267352e.f267335e).getValue(), 0, this, 1, (Object) null) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i("MicroMsg.SendImgPreFeatureService", "checkPreBuildImg end");
            this.f267353f.onDone();
            return C13598b0.f38549a;
        }
    }

    public void Ri0(C98209y yVar) {
        C87412m.m108594g(yVar, "callback");
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) this.f267336f).getValue(), (C53934p0) null, new C92833g(this, yVar, (C15601d<? super C92833g>) null), 1, (Object) null);
    }

    /* renamed from: SA */
    public void mo127112SA(C98199a0 a0Var) {
        C87412m.m108594g(a0Var, "params");
        Log.m105924i("MicroMsg.SendImgPreFeatureService", "preBuildImg " + a0Var);
        C117407d.INSTANCE.idkeyStat(1949, 0, 1, false);
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) this.f267336f).getValue(), (C53934p0) null, new C92829c(this, a0Var, (C15601d<? super C92829c>) null), 1, (Object) null);
    }

    public String Ug0(C98199a0 a0Var) {
        C87412m.m108594g(a0Var, "params");
        return mo127115gT(a0Var.f287922c, a0Var.f287921b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0374, code lost:
        if (z04.C112551y.m153808h(r8, r4, false, 2, (java.lang.Object) null) == false) goto L_0x038e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x07e7  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x094e  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0951  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0955  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0958  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x095c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x098a  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x098d  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0990  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0993  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x09f9  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0a06  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0a54  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0a8a  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0bf6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0321  */
    /* renamed from: fU */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo127114fU(p158gt.C98199a0 r73) {
        /*
            r72 = this;
            r1 = r73
            java.lang.Class<lc3.b> r2 = lc3.C10485b.class
            java.lang.String r0 = "params"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = r1.f287922c
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            java.lang.String r3 = "MicroMsg.SendImgPreFeatureService"
            if (r0 != 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "img file not exist "
            r0.append(r2)
            java.lang.String r1 = r1.f287922c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 1949(0x79d, double:9.63E-321)
            r7 = 2
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            return
        L_0x0037:
            kj2.d r0 = kj2.C117407d.INSTANCE
            r13 = 1949(0x79d, double:9.63E-321)
            r15 = 3
            r17 = 1
            r19 = 0
            r12 = r0
            r12.idkeyStat(r13, r15, r17, r19)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "start to prebuild img "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.lang.String r4 = r72.Ug0(r73)
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r6 = r72.wx0()
            r5.<init>((com.tencent.p014mm.vfs.C86009m1) r6, (java.lang.String) r4)
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.String r7 = "thumb.jpg"
            r6.<init>((com.tencent.p014mm.vfs.C86009m1) r5, (java.lang.String) r7)
            long r7 = eb0.C31543z5.m39453c()
            boolean r9 = r6.mo119967g()
            java.lang.String r10 = "preBuildThumbFile.absolutePath"
            java.lang.String r11 = " targetPath:"
            java.lang.String r15 = " fileLength:"
            r13 = -1
            r14 = 0
            if (r9 != 0) goto L_0x0136
            r16 = 1949(0x79d, double:9.63E-321)
            r18 = 4
            r20 = 1
            r9 = 0
            r12 = r0
            r13 = r16
            r24 = r15
            r15 = r18
            r17 = r20
            r19 = r9
            r12.idkeyStat(r13, r15, r17, r19)
            java.lang.String r9 = r6.mo119971i()
            gy3.C87412m.m108593f(r9, r10)
            java.lang.String r12 = r1.f287922c
            int r12 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongPicture((java.lang.String) r12)
            java.lang.String r13 = r1.f287922c
            int r13 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r13)
            int r14 = r1.f287921b
            r15 = 90
            int r14 = r14 * 90
            int r13 = r13 + r14
            if (r12 <= 0) goto L_0x00c1
            java.lang.String r14 = r1.f287922c
            android.graphics.Bitmap r12 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.createLongPictureBitmap(r14, r12, r13)
            java.lang.String r13 = r1.f287922c
            r14 = -1
            android.graphics.Bitmap r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.drawBackgroundInNeed(r12, r13, r14)
            goto L_0x00d4
        L_0x00c1:
            r14 = -1
            java.lang.String r12 = r1.f287922c
            r17 = 120(0x78, float:1.68E-43)
            r18 = 120(0x78, float:1.68E-43)
            r19 = 1
            r20 = 0
            r21 = -1
            r16 = r12
            android.graphics.Bitmap r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbBitmap(r16, r17, r18, r19, r20, r21)
        L_0x00d4:
            r13 = r12
            if (r13 != 0) goto L_0x00f2
            r16 = 1949(0x79d, double:9.63E-321)
            r18 = 15
            r20 = 1
            r22 = 0
            r12 = r0
            r25 = r7
            r7 = r13
            r8 = -1
            r13 = r16
            r8 = 90
            r15 = r18
            r17 = r20
            r19 = r22
            r12.idkeyStat(r13, r15, r17, r19)
            goto L_0x00f7
        L_0x00f2:
            r25 = r7
            r7 = r13
            r8 = 90
        L_0x00f7:
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG
            r15 = 0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r8, r12, r9, r15)
            if (r7 != 0) goto L_0x010d
            r13 = 1949(0x79d, double:9.63E-321)
            r7 = 16
            r17 = 1
            r19 = 0
            r12 = r0
            r15 = r7
            r12.idkeyStat(r13, r15, r17, r19)
        L_0x010d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "genThumb imgPath:"
            r7.append(r8)
            java.lang.String r8 = r1.f287922c
            r7.append(r8)
            r7.append(r11)
            r7.append(r9)
            r8 = r24
            r7.append(r8)
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            goto L_0x0139
        L_0x0136:
            r25 = r7
            r8 = r15
        L_0x0139:
            long r20 = eb0.C31543z5.m39453c()
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.String r9 = "mid.jpg"
            r7.<init>((com.tencent.p014mm.vfs.C86009m1) r5, (java.lang.String) r9)
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            java.lang.String r12 = "mid.jpg_hevc"
            r9.<init>((com.tencent.p014mm.vfs.C86009m1) r5, (java.lang.String) r12)
            int r15 = r1.f287925f
            r13 = 0
            r1.f287925f = r13
            boolean r12 = r7.mo119967g()
            java.lang.String r14 = "jpg"
            r16 = r15
            java.lang.String r15 = "jpeg"
            r17 = r15
            java.lang.String r15 = "PicCompressAvoidanceRemainderPerc"
            r18 = r15
            java.lang.String r15 = "UseOptImage"
            r19 = r15
            java.lang.String r15 = "preBuildMidFile.absolutePath"
            r22 = r15
            java.lang.String r15 = " needCompressByQuality:"
            r23 = r15
            java.lang.String r15 = " ret:"
            r24 = r15
            java.lang.String r15 = " scene:"
            r27 = r15
            java.lang.String r15 = "it.toString()"
            r28 = r15
            java.lang.String r15 = "gif"
            r29 = r15
            java.lang.String r15 = "png"
            r30 = r15
            java.lang.String r15 = "bmp"
            r32 = 0
            r34 = r15
            r15 = 1
            if (r12 != 0) goto L_0x0650
            r9.mo119966f()
            r43 = 1949(0x79d, double:9.63E-321)
            r45 = 5
            r47 = 1
            r49 = 0
            r12 = r0
            r50 = r4
            r51 = r10
            r4 = r14
            r10 = 0
            r13 = r43
            r52 = r16
            r53 = r17
            r54 = r18
            r10 = r19
            r55 = r22
            r56 = r23
            r57 = r24
            r58 = r27
            r59 = r28
            r60 = r29
            r61 = r30
            r62 = r34
            r15 = r45
            r17 = r47
            r19 = r49
            r12.idkeyStat(r13, r15, r17, r19)
            java.lang.String r12 = r7.mo119971i()
            r13 = r55
            gy3.C87412m.m108593f(r12, r13)
            java.lang.String r9 = r9.mo119971i()
            java.lang.String r0 = "preBuildHevcMidFile.absolutePath"
            gy3.C87412m.m108593f(r9, r0)
            int r14 = com.tencent.p014mm.modelimage.C92806b.m116991e()
            android.graphics.Point r0 = com.tencent.p014mm.modelimage.C92806b.m116990d()
            int r15 = r0.x
            int r13 = r0.y
            k40.a r0 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x028d }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x028d }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x028d }
            java.lang.String r0 = r0.mo107405c(r10)     // Catch:{ Exception -> 0x028d }
            r16 = r7
            r7 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r7)     // Catch:{ Exception -> 0x0287 }
            sg.q r7 = new sg.q     // Catch:{ Exception -> 0x0287 }
            f40.e r17 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x0287 }
            r18 = r6
            int r6 = r17.mo121110g()     // Catch:{ Exception -> 0x027d }
            r7.<init>((int) r6)     // Catch:{ Exception -> 0x027d }
            long r27 = r7.longValue()     // Catch:{ Exception -> 0x027d }
            r19 = r10
            r17 = r11
            r6 = 100
            long r10 = (long) r6
            r22 = r7
            long r6 = r27 / r10
            int r7 = (int) r6     // Catch:{ Exception -> 0x0277 }
            r6 = 100
            int r7 = r7 % r6
            r6 = 1
            int r7 = r7 + r6
            if (r7 > r0) goto L_0x0221
            r7 = 1
            goto L_0x0222
        L_0x0221:
            r7 = 0
        L_0x0222:
            java.lang.String r6 = "genMid useOpt:%b opt:%d uin:(%d,%d) debug:%b sdk:%d"
            r24 = r5
            r27 = r8
            r5 = 6
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0274 }
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x0274 }
            r23 = 0
            r8[r23] = r28     // Catch:{ Exception -> 0x0274 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0274 }
            r28 = 1
            r8[r28] = r0     // Catch:{ Exception -> 0x0274 }
            long r28 = r22.longValue()     // Catch:{ Exception -> 0x0274 }
            java.lang.Long r0 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x0274 }
            r5 = 2
            r8[r5] = r0     // Catch:{ Exception -> 0x0271 }
            long r28 = r22.longValue()     // Catch:{ Exception -> 0x0271 }
            long r28 = r28 / r10
            java.lang.Long r0 = java.lang.Long.valueOf(r28)     // Catch:{ Exception -> 0x0271 }
            r10 = 3
            r8[r10] = r0     // Catch:{ Exception -> 0x026e }
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x026e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x026e }
            r11 = 4
            r8[r11] = r0     // Catch:{ Exception -> 0x026e }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x026e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x026e }
            r11 = 5
            r8[r11] = r0     // Catch:{ Exception -> 0x026c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r8)     // Catch:{ Exception -> 0x026c }
            r6 = 0
            goto L_0x02a5
        L_0x026c:
            r0 = move-exception
            goto L_0x0295
        L_0x026e:
            r0 = move-exception
        L_0x026f:
            r11 = 5
            goto L_0x0295
        L_0x0271:
            r0 = move-exception
        L_0x0272:
            r10 = 3
            goto L_0x026f
        L_0x0274:
            r0 = move-exception
        L_0x0275:
            r5 = 2
            goto L_0x0272
        L_0x0277:
            r0 = move-exception
            r24 = r5
            r27 = r8
            goto L_0x0275
        L_0x027d:
            r0 = move-exception
            r24 = r5
        L_0x0280:
            r27 = r8
            r19 = r10
            r17 = r11
            goto L_0x0275
        L_0x0287:
            r0 = move-exception
            r24 = r5
            r18 = r6
            goto L_0x0280
        L_0x028d:
            r0 = move-exception
            r24 = r5
            r18 = r6
            r16 = r7
            goto L_0x0280
        L_0x0295:
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r6 = 0
            r7[r6] = r0
            java.lang.String r0 = "genMid useopt :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r7)
            r7 = 0
        L_0x02a5:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r0 == 0) goto L_0x02ac
            r7 = 1
        L_0x02ac:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r0[r6] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r8 = 1
            r0[r8] = r6
            java.lang.String r6 = "genMid configLong:%d configShort:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r0)
            k40.a r0 = f40.C86709a0.m107533q(r2)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r6 = r54
            java.lang.String r0 = r0.mo107405c(r6)
            r8 = 10
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r8)
            if (r15 <= 0) goto L_0x02dc
            r13 = 100
            if (r15 < r13) goto L_0x02de
        L_0x02dc:
            r15 = 10
        L_0x02de:
            java.lang.String r0 = r1.f287922c
            int r0 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r0)
            if (r0 == 0) goto L_0x02ea
            if (r0 > r14) goto L_0x02ea
            r13 = 0
            goto L_0x02eb
        L_0x02ea:
            r13 = 1
        L_0x02eb:
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.String r11 = r1.f287922c
            r22 = 0
            r8[r22] = r11
            r11 = 1
            r8[r11] = r12
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r8[r5] = r11
            int r11 = r1.f287925f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r10] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r22 = 4
            r8[r22] = r11
            java.lang.String r11 = "genMid insert : original img path: %s, fullpath:%s, needimg:%b,comresstype:%d Avoidance[%d] "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r11, r8)
            java.lang.String r8 = r1.f287922c
            android.graphics.BitmapFactory$Options r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r8)
            if (r8 == 0) goto L_0x0624
            int r11 = r8.outWidth
            if (r11 == 0) goto L_0x0624
            int r11 = r8.outHeight
            if (r11 != 0) goto L_0x0321
            goto L_0x0624
        L_0x0321:
            java.lang.String r11 = r1.f287922c
            com.tencent.mm.modelimage.b$a r11 = com.tencent.p014mm.modelimage.C92806b.m116989c(r11)
            int r10 = r11.f267238a
            int r5 = r11.f267239b
            r22 = r7
            int r7 = r11.f267241d
            int r11 = r11.f267240c
            java.lang.String r8 = r8.outMimeType
            r54 = r6
            java.lang.String r6 = r1.f287922c
            long r28 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            java.lang.String r6 = r1.f287922c
            boolean r6 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(r6)
            if (r8 == 0) goto L_0x037f
            r30 = r2
            r31 = r13
            r43 = r14
            r42 = r15
            r2 = r53
            r13 = 0
            r14 = 0
            r15 = 2
            boolean r23 = z04.C112551y.m153808h(r8, r2, r14, r15, r13)
            if (r23 != 0) goto L_0x037a
            boolean r23 = z04.C112551y.m153808h(r8, r4, r14, r15, r13)
            if (r23 != 0) goto L_0x037a
            r44 = r4
            r4 = r62
            boolean r23 = z04.C112551y.m153808h(r8, r4, r14, r15, r13)
            if (r23 != 0) goto L_0x0377
            r4 = r61
            boolean r23 = z04.C112551y.m153808h(r8, r4, r14, r15, r13)
            r4 = r60
            if (r23 != 0) goto L_0x037d
            boolean r34 = z04.C112551y.m153808h(r8, r4, r14, r15, r13)
            if (r34 == 0) goto L_0x038e
            goto L_0x037d
        L_0x0377:
            r4 = r60
            goto L_0x037d
        L_0x037a:
            r44 = r4
            goto L_0x0377
        L_0x037d:
            r14 = 1
            goto L_0x038f
        L_0x037f:
            r30 = r2
            r44 = r4
            r31 = r13
            r43 = r14
            r42 = r15
            r2 = r53
            r4 = r60
            r13 = 0
        L_0x038e:
            r14 = 0
        L_0x038f:
            r15 = 6
            java.lang.Object[] r13 = new java.lang.Object[r15]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            r23 = 0
            r13[r23] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r34 = 1
            r13[r34] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r34 = 2
            r13[r34] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r34 = 3
            r13[r34] = r15
            java.lang.Long r15 = java.lang.Long.valueOf(r28)
            r34 = 4
            r13[r34] = r15
            r15 = 5
            r13[r15] = r8
            java.lang.String r8 = "genMid [%d, %d] -> target:[h,w]:[%d,%d], fileSize:%s, mime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r13)
            java.lang.Class<z51.i> r8 = z51.C102975i.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            z51.i r8 = (z51.C102975i) r8
            boolean r8 = r8.hq0()
            int r13 = com.tencent.p014mm.modelimage.C92806b.m116988b()
            r60 = r4
            r15 = r5
            long r4 = (long) r13
            int r13 = (r28 > r4 ? 1 : (r28 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x04c2
            r4 = 55
            if (r0 < r4) goto L_0x03e4
            if (r6 != 0) goto L_0x03e1
            goto L_0x03e4
        L_0x03e1:
            r0 = r22
            goto L_0x03e5
        L_0x03e4:
            r0 = 0
        L_0x03e5:
            if (r0 == 0) goto L_0x03ea
            r4 = 18
            goto L_0x03ec
        L_0x03ea:
            r4 = 8
        L_0x03ec:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.pointers.PBool r10 = new com.tencent.mm.pointers.PBool
            r10.<init>()
            r10.value = r0
            if (r8 == 0) goto L_0x0418
            java.lang.String r0 = r1.f287922c
            boolean r0 = com.tencent.p014mm.modelimage.C92806b.m116995i(r0, r12, r9, r11, r7)
            if (r0 != 0) goto L_0x042c
            java.lang.String r0 = r1.f287922c
            r41 = -1
            r34 = r0
            r35 = r12
            r36 = r9
            r37 = r11
            r38 = r7
            r39 = r10
            r40 = r43
            boolean r0 = com.tencent.p014mm.modelimage.C92806b.m116994h(r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x042c
        L_0x0418:
            java.lang.String r0 = r1.f287922c
            r40 = -1
            r34 = r0
            r35 = r12
            r36 = r11
            r37 = r7
            r38 = r10
            r39 = r43
            boolean r0 = com.tencent.p014mm.modelimage.C92806b.m116993g(r34, r35, r36, r37, r38, r39, r40)
        L_0x042c:
            r15 = r0
            boolean r0 = r10.value
            r7 = 3
            java.lang.Object[] r10 = new java.lang.Object[r7]
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r10[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r43)
            r7 = 1
            r10[r7] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r11 = 2
            r10[r11] = r5
            java.lang.String r5 = "genMid: cost %s, compress:%s, opt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r10)
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r5 = 5
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Long r5 = java.lang.Long.valueOf(r28)
            r13[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r13[r7] = r5
            r5 = 100
            long r6 = (long) r5
            long r34 = r10 * r6
            long r34 = r34 / r28
            java.lang.Long r5 = java.lang.Long.valueOf(r34)
            r22 = 2
            r13[r22] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r42)
            r22 = 3
            r13[r22] = r5
            r5 = 4
            r13[r5] = r12
            java.lang.String r5 = "genMid check use orig , orig:%d aftercomp:%d diff percent:[%d] picCompressAvoidanceRemainderPerc:%d  %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r13)
            if (r14 == 0) goto L_0x04a4
            long r10 = r28 - r10
            long r10 = r10 * r6
            r5 = r42
            long r5 = (long) r5
            long r5 = r5 * r28
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x04a4
            java.lang.String r0 = r1.f287922c
            r5 = 1
            com.tencent.p014mm.vfs.C45113r1.m49956a(r0, r12, r5)
            if (r8 == 0) goto L_0x049c
            com.tencent.p014mm.modelimage.C92806b.m116992f(r12, r9)
        L_0x049c:
            r0 = 48
            r0 = 0
            r4 = 48
            r14 = 1
            r15 = 1
            goto L_0x04a6
        L_0x04a4:
            r5 = 1
            r14 = 0
        L_0x04a6:
            if (r15 != 0) goto L_0x04b8
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r4 = r1.f287922c
            r6 = 0
            r0[r6] = r4
            java.lang.String r4 = "createThumbNail mid pic fail: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r0)
            r4 = r59
            goto L_0x0557
        L_0x04b8:
            r15 = r4
            r4 = r59
            r71 = r14
            r14 = r0
            r0 = r71
            goto L_0x056a
        L_0x04c2:
            r4 = 4
            r5 = 1
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r6] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r28)
            r7[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4 = 2
            r7[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r4 = 3
            r7[r4] = r0
            java.lang.String r0 = "summersafecdn createThumbNail big pic no compress, calculatedQuality:%d, origLen:%d oriWidth:%d oriHeight:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r7)
            if (r14 == 0) goto L_0x0527
            java.lang.String r0 = r1.f287922c
            long r6 = com.tencent.p014mm.vfs.C45113r1.m49956a(r0, r12, r5)
            int r4 = (r6 > r32 ? 1 : (r6 == r32 ? 0 : -1))
            if (r4 > 0) goto L_0x051a
            android.net.Uri r4 = r1.f287926g
            if (r4 != 0) goto L_0x0503
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = r1.f287922c
            android.net.Uri r4 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Imports.getImageExternalUri((android.content.Context) r4, (java.lang.String) r5)
            r1.f287926g = r4
        L_0x0503:
            android.net.Uri r4 = r1.f287926g
            if (r4 == 0) goto L_0x0513
            java.lang.String r0 = r4.toString()
            r4 = r59
            gy3.C87412m.m108593f(r0, r4)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0515
        L_0x0513:
            r4 = r59
        L_0x0515:
            r5 = 1
            com.tencent.p014mm.vfs.C45113r1.m49956a(r0, r12, r5)
            goto L_0x051c
        L_0x051a:
            r4 = r59
        L_0x051c:
            if (r8 == 0) goto L_0x0521
            com.tencent.p014mm.modelimage.C92806b.m116992f(r12, r9)
        L_0x0521:
            com.tencent.mm.modelimage.f0$a r5 = f267333i
            com.tencent.p014mm.modelimage.C92826f0.C92827a.m117042a(r5, r0, r12)
            goto L_0x0566
        L_0x0527:
            r4 = r59
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r5 = r1.f287922c
            r0.<init>((java.lang.String) r5)
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            r5.<init>((java.lang.String) r12)
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.convertImageFile((com.tencent.p014mm.vfs.C86009m1) r0, (com.tencent.p014mm.vfs.C86009m1) r5, (android.graphics.Bitmap.CompressFormat) r6)
            if (r0 != 0) goto L_0x0561
            com.tencent.mm.plugin.report.service.n r34 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r35 = 111(0x6f, double:5.5E-322)
            r37 = 187(0xbb, double:9.24E-322)
            r39 = 1
            r41 = 0
            r34.idkeyStat(r35, r37, r39, r41)
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = r1.f287922c
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "createThumbNail big pic fail (for cvrt to jpg): %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r0)
        L_0x0557:
            r5 = r17
            r6 = r27
            r14 = r57
            r11 = r58
            goto L_0x0676
        L_0x0561:
            if (r8 == 0) goto L_0x0566
            com.tencent.p014mm.modelimage.C92806b.m116992f(r12, r9)
        L_0x0566:
            r0 = 1
            r14 = 0
            r15 = 38
        L_0x056a:
            android.graphics.BitmapFactory$Options r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r12)
            if (r5 == 0) goto L_0x0573
            int r13 = r5.outWidth
            goto L_0x0574
        L_0x0573:
            r13 = -1
        L_0x0574:
            if (r5 == 0) goto L_0x0579
            int r5 = r5.outHeight
            goto L_0x057a
        L_0x0579:
            r5 = -1
        L_0x057a:
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            int r8 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r12)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "genMid useOpt:"
            r10.append(r11)
            r10.append(r14)
            r11 = r58
            r10.append(r11)
            r10.append(r15)
            r14 = r57
            r10.append(r14)
            r10.append(r0)
            r15 = r56
            r10.append(r15)
            r15 = r31
            r10.append(r15)
            java.lang.String r15 = " targetWidth:"
            r10.append(r15)
            r10.append(r13)
            java.lang.String r13 = " targetHeight:"
            r10.append(r13)
            r10.append(r5)
            java.lang.String r5 = " targetLen:"
            r10.append(r5)
            r10.append(r6)
            java.lang.String r5 = " targetQuality:"
            r10.append(r5)
            r10.append(r8)
            java.lang.String r5 = " targetIsJpeg:"
            r10.append(r5)
            r10.append(r9)
            java.lang.String r5 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            if (r0 != 0) goto L_0x05ec
            kj2.d r34 = kj2.C117407d.INSTANCE
            r35 = 1949(0x79d, double:9.63E-321)
            r37 = 19
            r39 = 1
            r41 = 0
            r34.idkeyStat(r35, r37, r39, r41)
            goto L_0x05f9
        L_0x05ec:
            kj2.d r63 = kj2.C117407d.INSTANCE
            r64 = 1949(0x79d, double:9.63E-321)
            r66 = 20
            r68 = 1
            r70 = 0
            r63.idkeyStat(r64, r66, r68, r70)
        L_0x05f9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "genMid imgPath:"
            r0.append(r5)
            java.lang.String r5 = r1.f287922c
            r0.append(r5)
            r5 = r17
            r0.append(r5)
            r0.append(r12)
            r6 = r27
            r0.append(r6)
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0676
        L_0x0624:
            r30 = r2
            r44 = r4
            r54 = r6
            r5 = r17
            r6 = r27
            r2 = r53
            r14 = r57
            r11 = r58
            r4 = r59
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r7 = r1.f287922c
            r9 = 0
            r0[r9] = r7
            if (r8 != 0) goto L_0x0642
            r7 = 1
            goto L_0x0643
        L_0x0642:
            r7 = 0
        L_0x0643:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 1
            r0[r8] = r7
            java.lang.String r7 = "genMid getImageOptions error:%s, origOptions_null:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r7, r0)
            goto L_0x0676
        L_0x0650:
            r50 = r4
            r51 = r10
            r44 = r14
            r52 = r16
            r54 = r18
            r55 = r22
            r56 = r23
            r14 = r24
            r4 = r28
            r60 = r29
            r61 = r30
            r62 = r34
            r30 = r2
            r24 = r5
            r18 = r6
            r16 = r7
            r6 = r8
            r5 = r11
            r2 = r17
            r11 = r27
        L_0x0676:
            long r7 = eb0.C31543z5.m39453c()
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r9 = "orig.jpg"
            r10 = r24
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r10, (java.lang.String) r9)
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            java.lang.String r12 = "orig_mid.jpg"
            r9.<init>((com.tencent.p014mm.vfs.C86009m1) r10, (java.lang.String) r12)
            r12 = 1
            r1.f287925f = r12
            boolean r12 = r0.mo119967g()
            if (r12 != 0) goto L_0x0a70
            r9.mo119966f()
            kj2.d r34 = kj2.C117407d.INSTANCE
            r35 = 1949(0x79d, double:9.63E-321)
            r37 = 21
            r39 = 1
            r41 = 0
            r34.idkeyStat(r35, r37, r39, r41)
            java.lang.String r12 = r0.mo119971i()
            java.lang.String r0 = "preBuildOrigFile.absolutePath"
            gy3.C87412m.m108593f(r12, r0)
            java.lang.String r9 = r9.mo119971i()
            java.lang.String r0 = "preBuildOrigMidFile.absolutePath"
            gy3.C87412m.m108593f(r9, r0)
            java.lang.String r13 = "valueOf(\n               …          )\n            )"
            com.tencent.p014mm.modelimage.C92806b.m116991e()
            android.graphics.Point r0 = com.tencent.p014mm.modelimage.C92806b.m116990d()
            int r15 = r0.x
            r27 = r7
            int r7 = r0.y
            k40.a r0 = f40.C86709a0.m107533q(r30)     // Catch:{ Exception -> 0x075a }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x075a }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x075a }
            r8 = r19
            java.lang.String r0 = r0.mo107405c(r8)     // Catch:{ Exception -> 0x075a }
            r8 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r8)     // Catch:{ Exception -> 0x075a }
            sg.q r8 = new sg.q     // Catch:{ Exception -> 0x075a }
            f40.e r17 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x075a }
            r19 = r5
            int r5 = r17.mo121110g()     // Catch:{ Exception -> 0x0758 }
            r8.<init>((int) r5)     // Catch:{ Exception -> 0x0758 }
            long r34 = r8.longValue()     // Catch:{ Exception -> 0x0758 }
            r24 = r10
            r58 = r11
            r5 = 100
            long r10 = (long) r5
            r17 = r6
            long r5 = r34 / r10
            int r6 = (int) r5     // Catch:{ Exception -> 0x0752 }
            r5 = 100
            int r6 = r6 % r5
            r5 = 1
            int r6 = r6 + r5
            if (r6 > r0) goto L_0x0706
            r5 = 1
            goto L_0x0707
        L_0x0706:
            r5 = 0
        L_0x0707:
            java.lang.String r6 = "genOrig useOpt:%b opt:%d uin:(%d,%d) debug:%b sdk:%d"
            r22 = r9
            r57 = r14
            r14 = 6
            java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0750 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0750 }
            r14 = 0
            r9[r14] = r5     // Catch:{ Exception -> 0x0750 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0750 }
            r5 = 1
            r9[r5] = r0     // Catch:{ Exception -> 0x0750 }
            long r34 = r8.longValue()     // Catch:{ Exception -> 0x0750 }
            java.lang.Long r0 = java.lang.Long.valueOf(r34)     // Catch:{ Exception -> 0x0750 }
            r5 = 2
            r9[r5] = r0     // Catch:{ Exception -> 0x0750 }
            long r34 = r8.longValue()     // Catch:{ Exception -> 0x0750 }
            long r34 = r34 / r10
            java.lang.Long r0 = java.lang.Long.valueOf(r34)     // Catch:{ Exception -> 0x0750 }
            r5 = 3
            r9[r5] = r0     // Catch:{ Exception -> 0x0750 }
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x0750 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0750 }
            r5 = 4
            r9[r5] = r0     // Catch:{ Exception -> 0x0750 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0750 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0750 }
            r5 = 5
            r9[r5] = r0     // Catch:{ Exception -> 0x0750 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r9)     // Catch:{ Exception -> 0x0750 }
            r5 = 1
            r8 = 0
            goto L_0x0775
        L_0x0750:
            r0 = move-exception
            goto L_0x0766
        L_0x0752:
            r0 = move-exception
            r22 = r9
        L_0x0755:
            r57 = r14
            goto L_0x0766
        L_0x0758:
            r0 = move-exception
            goto L_0x075d
        L_0x075a:
            r0 = move-exception
            r19 = r5
        L_0x075d:
            r17 = r6
            r22 = r9
            r24 = r10
            r58 = r11
            goto L_0x0755
        L_0x0766:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r8 = 0
            r6[r8] = r0
            java.lang.String r0 = "genOrig useopt :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r6)
        L_0x0775:
            com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r0[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r0[r5] = r6
            java.lang.String r5 = "genOrig configLong:%d configShort:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            k40.a r0 = f40.C86709a0.m107533q(r30)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            r5 = r54
            java.lang.String r0 = r0.mo107405c(r5)
            r5 = 10
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            if (r15 <= 0) goto L_0x07a8
            r5 = 100
            if (r15 < r5) goto L_0x07aa
        L_0x07a8:
            r15 = 10
        L_0x07aa:
            java.lang.String r0 = r1.f287922c
            int r0 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r0)
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r1.f287922c
            r7 = 0
            r6[r7] = r5
            r5 = 1
            r6[r5] = r12
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r7 = 2
            r6[r7] = r5
            int r5 = r1.f287925f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 3
            r6[r7] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r7 = 4
            r6[r7] = r5
            java.lang.String r5 = "genOrig insert : original img path: %s, fullpath:%s, needimg:%b,comresstype:%d Avoidance[%d] "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r6)
            java.lang.String r5 = r1.f287922c
            android.graphics.BitmapFactory$Options r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r5)
            if (r5 == 0) goto L_0x0a54
            int r6 = r5.outWidth
            if (r6 == 0) goto L_0x0a54
            int r6 = r5.outHeight
            if (r6 != 0) goto L_0x07e7
            goto L_0x0a54
        L_0x07e7:
            java.lang.String r6 = r1.f287922c
            com.tencent.mm.modelimage.b$a r6 = com.tencent.p014mm.modelimage.C92806b.m116989c(r6)
            int r7 = r6.f267238a
            int r8 = r6.f267239b
            int r9 = r6.f267241d
            int r6 = r6.f267240c
            java.lang.String r5 = r5.outMimeType
            java.lang.String r10 = r1.f287922c
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
            r29 = r13
            if (r5 == 0) goto L_0x082d
            r13 = 0
            r14 = 0
            r15 = 2
            boolean r2 = z04.C112551y.m153808h(r5, r2, r13, r15, r14)
            if (r2 != 0) goto L_0x082a
            r2 = r44
            boolean r2 = z04.C112551y.m153808h(r5, r2, r13, r15, r14)
            if (r2 != 0) goto L_0x082a
            r2 = r62
            boolean r2 = z04.C112551y.m153808h(r5, r2, r13, r15, r14)
            if (r2 != 0) goto L_0x082a
            r2 = r61
            boolean r2 = z04.C112551y.m153808h(r5, r2, r13, r15, r14)
            if (r2 != 0) goto L_0x082a
            r2 = r60
            boolean r2 = z04.C112551y.m153808h(r5, r2, r13, r15, r14)
            if (r2 == 0) goto L_0x082d
        L_0x082a:
            r2 = 6
            r14 = 1
            goto L_0x082f
        L_0x082d:
            r2 = 6
            r14 = 0
        L_0x082f:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = 0
            r2[r15] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r15 = 1
            r2[r15] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r15 = 2
            r2[r15] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r15 = 3
            r2[r15] = r13
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            r15 = 4
            r2[r15] = r13
            r13 = 5
            r2[r13] = r5
            java.lang.String r5 = "genOrig [%d, %d] -> target:[h,w]:[%d,%d], fileSize:%s, mime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r13 = 0
            r2[r13] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r13 = 1
            r2[r13] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r15 = 2
            r2[r15] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r15 = 3
            r2[r15] = r5
            java.lang.String r5 = "genOrig summersafecdn createThumbNail big pic no compress, calculatedQuality:%d, origLen:%d oriWidth:%d oriHeight:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r2)
            if (r14 == 0) goto L_0x08b0
            java.lang.String r2 = r1.f287922c
            long r14 = com.tencent.p014mm.vfs.C45113r1.m49956a(r2, r12, r13)
            int r5 = (r14 > r32 ? 1 : (r14 == r32 ? 0 : -1))
            if (r5 > 0) goto L_0x08aa
            android.net.Uri r5 = r1.f287926g
            if (r5 != 0) goto L_0x089b
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r13 = r1.f287922c
            android.net.Uri r5 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Imports.getImageExternalUri((android.content.Context) r5, (java.lang.String) r13)
            r1.f287926g = r5
        L_0x089b:
            android.net.Uri r5 = r1.f287926g
            if (r5 == 0) goto L_0x08a6
            java.lang.String r2 = r5.toString()
            gy3.C87412m.m108593f(r2, r4)
        L_0x08a6:
            r4 = 1
            com.tencent.p014mm.vfs.C45113r1.m49956a(r2, r12, r4)
        L_0x08aa:
            com.tencent.mm.modelimage.f0$a r4 = f267333i
            com.tencent.p014mm.modelimage.C92826f0.C92827a.m117042a(r4, r2, r12)
            goto L_0x08e2
        L_0x08b0:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = r1.f287922c
            r2.<init>((java.lang.String) r4)
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            r4.<init>((java.lang.String) r12)
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.convertImageFile((com.tencent.p014mm.vfs.C86009m1) r2, (com.tencent.p014mm.vfs.C86009m1) r4, (android.graphics.Bitmap.CompressFormat) r5)
            if (r2 != 0) goto L_0x08e2
            com.tencent.mm.plugin.report.service.n r31 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r32 = 111(0x6f, double:5.5E-322)
            r34 = 187(0xbb, double:9.24E-322)
            r36 = 1
            r38 = 0
            r31.idkeyStat(r32, r34, r36, r38)
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f287922c
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = "genOrig createThumbNail big pic fail (for cvrt to jpg): %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r0)
            r2 = r17
            goto L_0x0a77
        L_0x08e2:
            k40.a r2 = f40.C86709a0.m107533q(r30)     // Catch:{ Exception -> 0x0900 }
            lc3.b r2 = (lc3.C10485b) r2     // Catch:{ Exception -> 0x0900 }
            pj.f r2 = r2.vh0()     // Catch:{ Exception -> 0x0900 }
            java.lang.String r4 = "CompressMidPicLevel"
            java.lang.String r2 = r2.mo107405c(r4)     // Catch:{ Exception -> 0x0900 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0900 }
            r4 = r29
            gy3.C87412m.m108593f(r2, r4)     // Catch:{ Exception -> 0x0902 }
            int r14 = r2.intValue()     // Catch:{ Exception -> 0x0902 }
            goto L_0x0903
        L_0x0900:
            r4 = r29
        L_0x0902:
            r14 = 0
        L_0x0903:
            k40.a r2 = f40.C86709a0.m107533q(r30)     // Catch:{ Exception -> 0x091f }
            lc3.b r2 = (lc3.C10485b) r2     // Catch:{ Exception -> 0x091f }
            pj.f r2 = r2.vh0()     // Catch:{ Exception -> 0x091f }
            java.lang.String r5 = "CompressMidPicSize"
            java.lang.String r2 = r2.mo107405c(r5)     // Catch:{ Exception -> 0x091f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x091f }
            gy3.C87412m.m108593f(r2, r4)     // Catch:{ Exception -> 0x091f }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x091f }
            goto L_0x0921
        L_0x091f:
            r2 = 0
        L_0x0921:
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r13 = 0
            r5[r13] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r13 = 1
            r5[r13] = r4
            java.lang.String r4 = "summersafecdn CompressMidPicLevel-level:%d size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            r4 = 10
            if (r14 <= r4) goto L_0x0940
            r4 = 100
            if (r14 <= r4) goto L_0x0944
        L_0x0940:
            r4 = 52
            r14 = 52
        L_0x0944:
            r4 = 800(0x320, float:1.121E-42)
            if (r2 <= 0) goto L_0x094a
            if (r2 <= r4) goto L_0x094c
        L_0x094a:
            r2 = 800(0x320, float:1.121E-42)
        L_0x094c:
            if (r6 <= r2) goto L_0x0951
            r37 = r2
            goto L_0x0953
        L_0x0951:
            r37 = r6
        L_0x0953:
            if (r9 <= r2) goto L_0x0958
            r36 = r2
            goto L_0x095a
        L_0x0958:
            r36 = r9
        L_0x095a:
            if (r0 == 0) goto L_0x0960
            if (r0 > r14) goto L_0x0960
            r0 = 0
            goto L_0x0961
        L_0x0960:
            r0 = 1
        L_0x0961:
            if (r0 != 0) goto L_0x0970
            r4 = 800(0x320, double:3.953E-321)
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0970
            if (r8 > r2) goto L_0x0970
            if (r7 <= r2) goto L_0x096e
            goto L_0x0970
        L_0x096e:
            r15 = 1
            goto L_0x0984
        L_0x0970:
            java.lang.String r2 = r1.f287922c
            android.graphics.Bitmap$CompressFormat r38 = android.graphics.Bitmap.CompressFormat.JPEG
            r41 = 0
            r42 = -1
            r34 = 0
            r35 = r2
            r39 = r14
            r40 = r22
            int r15 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNailMayUseOpt(r34, r35, r36, r37, r38, r39, r40, r41, r42)
        L_0x0984:
            android.graphics.BitmapFactory$Options r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r12)
            if (r2 == 0) goto L_0x098d
            int r13 = r2.outWidth
            goto L_0x098e
        L_0x098d:
            r13 = -1
        L_0x098e:
            if (r2 == 0) goto L_0x0993
            int r2 = r2.outHeight
            goto L_0x0994
        L_0x0993:
            r2 = -1
        L_0x0994:
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            int r6 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r12)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(r12)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "genOrig useOpt:"
            r8.append(r9)
            r9 = 0
            r8.append(r9)
            r9 = r58
            r8.append(r9)
            r9 = 38
            r8.append(r9)
            r9 = r57
            r8.append(r9)
            r8.append(r15)
            r9 = r56
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = " targetWidth:"
            r8.append(r0)
            r8.append(r13)
            java.lang.String r0 = " targetHeight:"
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = " targetLen:"
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = " targetQuality:"
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = " targetIsJpeg:"
            r8.append(r0)
            r8.append(r7)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            if (r15 != 0) goto L_0x0a06
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 1949(0x79d, double:9.63E-321)
            r7 = 26
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            goto L_0x0a13
        L_0x0a06:
            kj2.d r29 = kj2.C117407d.INSTANCE
            r30 = 1949(0x79d, double:9.63E-321)
            r32 = 27
            r34 = 1
            r36 = 0
            r29.idkeyStat(r30, r32, r34, r36)
        L_0x0a13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "genOrig imgPath:"
            r0.append(r2)
            java.lang.String r2 = r1.f287922c
            r0.append(r2)
            java.lang.String r2 = " origPath:"
            r0.append(r2)
            r0.append(r12)
            r2 = r17
            r0.append(r2)
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r0.append(r4)
            java.lang.String r4 = " origMidPath:"
            r0.append(r4)
            r4 = r22
            r0.append(r4)
            java.lang.String r5 = " midFileLength:"
            r0.append(r5)
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x0a77
        L_0x0a54:
            r2 = r17
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r1.f287922c
            r6 = 0
            r0[r6] = r4
            if (r5 != 0) goto L_0x0a62
            r14 = 1
            goto L_0x0a63
        L_0x0a62:
            r14 = 0
        L_0x0a63:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r14)
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "genOrig getImageOptions error:%s, origOptions_null:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r0)
            goto L_0x0a77
        L_0x0a70:
            r19 = r5
            r2 = r6
            r27 = r7
            r24 = r10
        L_0x0a77:
            long r4 = eb0.C31543z5.m39453c()
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = "hd_thumb.jpg"
            r7 = r24
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r7, (java.lang.String) r6)
            boolean r6 = r0.mo119967g()
            if (r6 != 0) goto L_0x0bf6
            kj2.d r7 = kj2.C117407d.INSTANCE
            r8 = 1949(0x79d, double:9.63E-321)
            r10 = 6
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            java.lang.String r6 = r18.mo119971i()
            r7 = r51
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r7 = r16.mo119971i()
            r8 = r55
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r8 = r0.mo119971i()
            java.lang.String r0 = "preBuildHDThumbFile.absolutePath"
            gy3.C87412m.m108593f(r8, r0)
            android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r6)
            if (r0 == 0) goto L_0x0ac0
            int r6 = r0.outWidth
            if (r6 <= 0) goto L_0x0ac0
            int r6 = r0.outHeight
            if (r6 > 0) goto L_0x0ae5
        L_0x0ac0:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r0)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r9 = 0
            r6[r9] = r0
            int r9 = r0.outWidth
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 1
            r6[r10] = r9
            int r9 = r0.outHeight
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 2
            r6[r10] = r9
            java.lang.String r9 = "createHDThumbNail old op is invalid but len is 0 need recreate[%s, %d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r6)
        L_0x0ae5:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r6 = kg3.C76577a.m92156g(r6)
            int r9 = r0.outWidth
            float r9 = (float) r9
            float r9 = r9 * r6
            r10 = 1067450368(0x3fa00000, float:1.25)
            float r9 = r9 * r10
            int r9 = (int) r9
            int r0 = r0.outHeight
            float r0 = (float) r0
            float r0 = r0 * r6
            float r0 = r0 * r10
            int r0 = (int) r0
            float r10 = (float) r9
            r11 = 160(0xa0, float:2.24E-43)
            float r11 = (float) r11
            float r11 = r11 * r6
            int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x0b12
            float r12 = (float) r0
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x0b0f
            goto L_0x0b12
        L_0x0b0f:
            r6 = r0
            r15 = r9
            goto L_0x0b24
        L_0x0b12:
            r11 = 1126170624(0x43200000, float:160.0)
            float r6 = r6 * r11
            if (r0 <= r9) goto L_0x0b1b
            float r9 = (float) r0
            float r6 = r6 / r9
            goto L_0x0b1c
        L_0x0b1b:
            float r6 = r6 / r10
        L_0x0b1c:
            float r10 = r10 * r6
            int r9 = (int) r10
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            goto L_0x0b0f
        L_0x0b24:
            int r0 = r1.f287925f     // Catch:{ Exception -> 0x0b6d }
            if (r0 != 0) goto L_0x0b49
            android.graphics.Bitmap$CompressFormat r32 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0b6d }
            r33 = 80
            r35 = 1
            com.tencent.mm.pointers.PInt r36 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0b6d }
            r36.<init>()     // Catch:{ Exception -> 0x0b6d }
            com.tencent.mm.pointers.PInt r37 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0b6d }
            r37.<init>()     // Catch:{ Exception -> 0x0b6d }
            r38 = 1
            r39 = -1
            r29 = r7
            r30 = r6
            r31 = r15
            r34 = r8
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ Exception -> 0x0b6d }
            goto L_0x0b6b
        L_0x0b49:
            android.graphics.Bitmap$CompressFormat r32 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0b6d }
            r33 = 80
            r35 = 1
            com.tencent.mm.pointers.PInt r36 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0b6d }
            r36.<init>()     // Catch:{ Exception -> 0x0b6d }
            com.tencent.mm.pointers.PInt r37 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0b6d }
            r37.<init>()     // Catch:{ Exception -> 0x0b6d }
            r38 = 1
            r39 = 1
            r40 = -1
            r29 = r7
            r30 = r6
            r31 = r15
            r34 = r8
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x0b6d }
        L_0x0b6b:
            r14 = r0
            goto L_0x0b7e
        L_0x0b6d:
            r0 = move-exception
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = r0.toString()
            r9 = 0
            r7[r9] = r0
            java.lang.String r0 = "create hd thumbnail failed. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r7)
            r14 = 0
        L_0x0b7e:
            if (r14 == 0) goto L_0x0ba9
            com.tencent.mm.modelimage.m r9 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            r11 = 1
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r12 = kg3.C76577a.m92156g(r0)
            r13 = 1
            r14 = 0
            r0 = 1
            r16 = 2131231570(0x7f080352, float:1.8079225E38)
            r17 = 0
            r10 = r8
            r7 = r15
            r15 = r0
            r9.mo127196qq(r10, r11, r12, r13, r14, r15, r16, r17)
            kj2.d r29 = kj2.C117407d.INSTANCE
            r30 = 1949(0x79d, double:9.63E-321)
            r32 = 17
            r34 = 1
            r36 = 0
            r29.idkeyStat(r30, r32, r34, r36)
            goto L_0x0bb7
        L_0x0ba9:
            r7 = r15
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 1949(0x79d, double:9.63E-321)
            r12 = 18
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
        L_0x0bb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "genHdThumb imgPath:"
            r0.append(r9)
            java.lang.String r9 = r1.f287922c
            r0.append(r9)
            r9 = r19
            r0.append(r9)
            r0.append(r8)
            r0.append(r2)
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            gt.x r0 = new gt.x
            r0.<init>(r7, r6)
            r2 = r72
            rx3.g r6 = r2.f267334d
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            r7 = r50
            r6.put(r7, r0)
            goto L_0x0bf8
        L_0x0bf6:
            r2 = r72
        L_0x0bf8:
            long r6 = eb0.C31543z5.m39453c()
            r8 = r52
            r1.f287925f = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "innerPreBuildImg thumb:"
            r0.append(r1)
            long r8 = r20 - r25
            r0.append(r8)
            java.lang.String r1 = "  mid:"
            r0.append(r1)
            long r8 = r27 - r20
            r0.append(r8)
            java.lang.String r1 = " orgi:"
            r0.append(r1)
            long r8 = r4 - r27
            r0.append(r8)
            java.lang.String r1 = " hdThumb:"
            r0.append(r1)
            long r4 = r6 - r4
            r0.append(r4)
            java.lang.String r1 = " total:"
            r0.append(r1)
            long r6 = r6 - r25
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92826f0.mo127114fU(gt.a0):void");
    }

    /* renamed from: gT */
    public String mo127115gT(String str, int i) {
        C87412m.m108594g(str, "imgPath");
        String mD5String = MD5Util.getMD5String(str + '_' + i);
        C87412m.m108593f(mD5String, "getMD5String(\"${imgPath}_${rotateCount}\")");
        return mD5String;
    }

    public ArrayList<Integer> lq0(C98200b0 b0Var) {
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        ArrayList<Integer> arrayList;
        Uri.Builder builder;
        Uri.Builder builder2;
        C13598b0 b0Var2;
        C98200b0 b0Var3 = b0Var;
        Class<C102975i> cls = C102975i.class;
        Class cls2 = C75700k0.class;
        C87412m.m108594g(b0Var3, "params");
        long c = C31543z5.m39453c();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).qy0("SendImgPreBuilder");
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = b0Var3.f287931e.iterator();
        while (true) {
            str = "";
            j = c;
            str2 = "<set-?>";
            if (!it.hasNext()) {
                break;
            }
            String str5 = (String) it.next();
            if (ImgUtil.isGif(str5)) {
                c = j;
            } else {
                C98199a0 a0Var = new C98199a0();
                C87412m.m108594g(str5, str2);
                a0Var.f287922c = str5;
                Iterator<T> it4 = it;
                a0Var.f287925f = b0Var3.f287930d;
                a0Var.f287920a = b0Var3.f287928b;
                String str6 = b0Var3.f287927a;
                C87412m.m108594g(str6, str2);
                a0Var.f287924e = str6;
                int i = b0Var3.f287929c;
                a0Var.f287921b = i;
                String gT = mo127115gT(str5, i);
                String Ug0 = Ug0(a0Var);
                long j2 = j;
                C86009m1 wx02 = wx0();
                ArrayList<Integer> arrayList4 = arrayList2;
                Uri uri = wx02 == null ? null : wx02.f250486d;
                if (uri == null) {
                    builder = new Uri.Builder().path(Ug0);
                } else {
                    Uri.Builder buildUpon = uri.buildUpon();
                    if (!Ug0.isEmpty()) {
                        buildUpon.appendPath(Ug0);
                    }
                    builder = buildUpon;
                }
                Uri build = builder.build();
                String path = build.getPath();
                Class<C102975i> cls3 = cls;
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!build.getPath().equals(k)) {
                        build = builder.path(k).build();
                    }
                }
                if (build == null) {
                    builder2 = new Uri.Builder().path("thumb.jpg");
                } else {
                    builder2 = build.buildUpon();
                    builder2.appendPath("thumb.jpg");
                }
                Uri build2 = builder2.build();
                String path2 = build2.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!build2.getPath().equals(k2)) {
                        build2 = builder2.path(k2).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(build2, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    mo127114fU(a0Var);
                    xx0(a0Var, 10000);
                }
                String str7 = "THUMBNAIL_DIRPATH://th_" + C92839m.m117079SE();
                String TY = C92837k0.Bx0().mo127174TY(str7, "th_", str, true);
                C87412m.m108593f(TY, "thumbPath");
                boolean vx02 = vx0(a0Var, "thumb.jpg", TY);
                if (vx02) {
                    C117407d.INSTANCE.idkeyStat(1949, 7, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1949, 8, 1, false);
                }
                if (!vx02) {
                    xx0(a0Var, 10001);
                    Log.m105924i("MicroMsg.SendImgPreFeatureService", "copy thumb fail " + str5 + ' ' + TY + " and regenerate thumb");
                }
                C13598b0 b0Var4 = C13598b0.f38549a;
                String str8 = TY + "hd";
                C87412m.m108594g(str8, "targetPath");
                boolean vx03 = vx0(a0Var, "hd_thumb.jpg", str8);
                if (vx03) {
                    C117407d.INSTANCE.idkeyStat(1949, 9, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1949, 10, 1, false);
                }
                if (!vx03) {
                    xx0(a0Var, 10002);
                    Log.m105924i("MicroMsg.SendImgPreFeatureService", "copy hd thumb fail " + str5 + ' ' + TY);
                }
                C72963f4 f4Var = new C72963f4();
                f4Var.setType(C45628s0.m50808x(a0Var.f287924e));
                f4Var.mo108749c3(a0Var.f287924e);
                f4Var.mo108740T2(1);
                f4Var.mo100991d(1);
                f4Var.mo108739S2(str7);
                C32529x xVar = (C32529x) ((ConcurrentHashMap) ((C36570n) this.f267334d).getValue()).get(gT);
                if (xVar != null) {
                    f4Var.mo108752f3(xVar.f86383a);
                    f4Var.mo108751e3(xVar.f86384b);
                    b0Var2 = C13598b0.f38549a;
                } else {
                    b0Var2 = null;
                }
                if (b0Var2 == null) {
                    Bitmap bitmapNative = BitmapUtil.getBitmapNative(str8);
                    f4Var.mo108752f3(bitmapNative != null ? bitmapNative.getWidth() : 0);
                    f4Var.mo108751e3(bitmapNative != null ? bitmapNative.getHeight() : 0);
                    ((ConcurrentHashMap) ((C36570n) this.f267334d).getValue()).put(gT, new C32529x(f4Var.f230725H, f4Var.f230726I));
                }
                Log.m105924i("MicroMsg.SendImgPreFeatureService", "bitmap " + gT + " width:" + f4Var.f230725H + " and height:" + f4Var.f230726I);
                String l2 = C75569c4.m90679l();
                if ((l2 != null && !C87412m.m108589b(l2, f4Var.f230724G)) || (l2 == null && f4Var.f230724G != null)) {
                    f4Var.mo101012p4(l2);
                }
                C27079a aVar = new C27079a();
                if (l2 != null) {
                    aVar.mo141099d(l2);
                }
                C98103n nVar = new C98103n();
                List<EmotionStrategyInfo> a = C14183h.m13517a(str5);
                ArrayList arrayList5 = new ArrayList(C36907w.m41090l(a, 10));
                Iterator<T> it5 = a.iterator();
                while (it5.hasNext()) {
                    EmotionStrategyInfo emotionStrategyInfo = (EmotionStrategyInfo) it5.next();
                    C98101e eVar = new C98101e();
                    Iterator<T> it6 = it5;
                    eVar.mo54636C(emotionStrategyInfo.f264619d);
                    eVar.mo54637D(emotionStrategyInfo.f264620e);
                    C13598b0 b0Var5 = C13598b0.f38549a;
                    arrayList5.add(eVar);
                    it5 = it6;
                }
                nVar.f287574f = C110818d0.m150900B0(arrayList5);
                C13598b0 b0Var6 = C13598b0.f38549a;
                aVar.f75294o = nVar;
                f4Var.mo101012p4(aVar.mo141118z());
                ((C87107w.C75813c) C67380a.C67381a.f193260a).mo106108c(f4Var);
                f4Var.mo108733M2(C75604z3.m90843o(f4Var.mo108768t()));
                f4Var.f230729L = 1;
                f4Var.f230755r = true;
                if (((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).my0(f4Var) > 0) {
                    arrayList3.add(new C92835j0(gT, str5, f4Var, str7));
                }
                b0Var3 = b0Var;
                arrayList2 = arrayList4;
                it = it4;
                c = j2;
                cls = cls3;
            }
        }
        Class<C102975i> cls4 = cls;
        long j3 = j;
        ArrayList<Integer> arrayList6 = arrayList2;
        if (beginTransaction > 0) {
            C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).wy0("SendImgPreBuilder");
        C76054m xi = ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi();
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            C92835j0 j0Var = (C92835j0) it7.next();
            C86009m1 m1Var = new C86009m1(wx0(), j0Var.f267354a);
            C98199a0 a0Var2 = new C98199a0();
            String str9 = j0Var.f267355b;
            C87412m.m108594g(str9, str2);
            a0Var2.f287922c = str9;
            C98200b0 b0Var7 = b0Var;
            boolean a2 = C75592q0.m90771a(str9, b0Var7.f287927a, b0Var7.f287930d == 0);
            if (a2 && C92806b.m116987a(str9)) {
                Log.m105924i("MicroMsg.SendImgPreFeatureService", "getCompressType send no compress as bigImg");
                a2 = false;
            }
            a0Var2.f287925f = a2 ? 1 : 0;
            a0Var2.f287920a = b0Var7.f287928b;
            String str10 = b0Var7.f287927a;
            C87412m.m108594g(str10, str2);
            a0Var2.f287924e = str10;
            a0Var2.f287921b = b0Var7.f287929c;
            String Ug02 = Ug0(a0Var2);
            long l3 = C86013q1.m106451l(a0Var2.f287922c);
            String SE = C92839m.m117079SE();
            Iterator it8 = it7;
            String TY2 = C92837k0.Bx0().mo127174TY(SE, str, ".jpg", true);
            String str11 = str2;
            String wt = ((C102975i) C86312j.m106911c(cls4)).mo141702wt(SE + ".jpg");
            String wt4 = ((C102975i) C86312j.m106911c(cls4)).mo141702wt(TY2);
            C86009m1 m1Var2 = m1Var;
            String SE2 = C92839m.m117079SE();
            String str12 = wt;
            String TY3 = C92837k0.Bx0().mo127174TY(SE2, str, ".jpg", true);
            C92836k kVar = new C92836k();
            String str13 = str;
            String str14 = wt4;
            C92839m mVar = (C92839m) xi;
            String str15 = Ug02;
            String str16 = TY3;
            kVar.mo127154y(mVar.mo127192mL(a0Var2.f287924e));
            kVar.mo127124A(j0Var.f267356c.getMsgId());
            kVar.mo127153x(0);
            kVar.f267391r = a0Var2.f287920a;
            kVar.f267365H = true;
            C76054m mVar2 = xi;
            String str17 = " msgInfoId:";
            if (a0Var2.f287925f != 1 || l3 <= ((long) C92806b.m116988b())) {
                str4 = str15;
                str3 = str17;
                C87412m.m108593f(TY2, "midPath");
                boolean vx04 = vx0(a0Var2, "mid.jpg", TY2);
                if (vx04) {
                    C117407d.INSTANCE.idkeyStat(1949, 11, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1949, 12, 1, false);
                }
                if (!vx04) {
                    xx0(a0Var2, 10005);
                    Log.m105924i("MicroMsg.SendImgPreFeatureService", "check mid fail " + a0Var2.f287922c + ' ' + TY2);
                }
                C13598b0 b0Var8 = C13598b0.f38549a;
                String str18 = str14;
                C87412m.m108593f(str18, "midHevcPath");
                boolean vx05 = vx0(a0Var2, "mid.jpg_hevc", str18);
                if (vx05) {
                    C117407d.INSTANCE.idkeyStat(1949, 13, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1949, 14, 1, false);
                }
                if (!vx05) {
                    Log.m105924i("MicroMsg.SendImgPreFeatureService", "check mid hevc fail " + a0Var2.f287922c + ' ' + str18);
                }
                kVar.mo127152w(str12);
                kVar.mo127147r(SE + ".jpg");
                kVar.mo127155z(SE + ".jpg");
                kVar.mo127128E(j0Var.f267357d);
                kVar.mo127129F((int) C86013q1.m106451l(TY2));
            } else {
                C87412m.m108593f(TY2, "midPath");
                boolean vx06 = vx0(a0Var2, "orig_mid.jpg", TY2);
                if (vx06) {
                    C117407d.INSTANCE.idkeyStat(1949, 24, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1949, 25, 1, false);
                }
                if (!vx06) {
                    xx0(a0Var2, 10003);
                    Log.m105924i("MicroMsg.SendImgPreFeatureService", "check orig fail " + a0Var2.f287922c + ' ' + TY2);
                }
                C13598b0 b0Var9 = C13598b0.f38549a;
                String str19 = str16;
                C87412m.m108593f(str19, "origPath");
                boolean vx07 = vx0(a0Var2, "orig.jpg", str19);
                if (vx07) {
                    C117407d.INSTANCE.idkeyStat(1949, 22, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1949, 23, 1, false);
                }
                if (!vx07) {
                    xx0(a0Var2, 10004);
                    Log.m105924i("MicroMsg.SendImgPreFeatureService", "check orig fail " + a0Var2.f287922c + ' ' + TY2);
                }
                C92836k kVar2 = new C92836k();
                kVar2.mo127154y(mVar.mo127192mL(a0Var2.f287924e));
                kVar2.mo127124A(0);
                kVar2.mo127125B(0);
                kVar2.mo127153x(0);
                kVar2.f267391r = a0Var2.f287920a;
                kVar2.f267365H = true;
                kVar2.f267382i = 1;
                kVar2.f267371N = true;
                kVar2.mo127147r(SE2 + ".jpg");
                kVar2.mo127155z(SE + ".jpg");
                kVar2.mo127128E(j0Var.f267357d);
                kVar2.mo127129F((int) C86013q1.m106451l(str19));
                str4 = str15;
                kVar2.f267385l = str4;
                kVar2.f267369L = true;
                kVar2.mo127150u((int) Util.nowSecond());
                kVar2.mo127149t(1);
                long wt02 = C92837k0.Bx0().wt0(a0Var2.f287924e, "id", kVar2);
                if (wt02 != -1) {
                    C92837k0.Bx0().doNotify();
                    kVar.mo127151v((int) kVar2.f267374a);
                    str3 = str17;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("insert hd img failed hdRet:");
                    sb.append(wt02);
                    str3 = str17;
                    sb.append(str3);
                    sb.append(kVar.f267387n);
                    sb.append(" imgPath:");
                    sb.append(j0Var.f267355b);
                    Log.m105924i("MicroMsg.SendImgPreFeatureService", sb.toString());
                }
                kVar.mo127147r(kVar2.f267378e);
                kVar.mo127155z(kVar2.f267379f);
                kVar.mo127128E(kVar2.f267380g);
                kVar.mo127129F(0);
            }
            kVar.f267382i = 1;
            kVar.f267371N = true;
            kVar.f267385l = str4;
            kVar.f267369L = true;
            kVar.mo127150u((int) Util.nowSecond());
            kVar.mo127149t(0);
            long wt03 = C92837k0.Bx0().wt0(b0Var.f287927a, "id", kVar);
            if (wt03 != -1) {
                C92837k0.Bx0().doNotify();
                arrayList = arrayList6;
                arrayList.add(Integer.valueOf((int) kVar.f267374a));
            } else {
                arrayList = arrayList6;
            }
            Log.m105924i("MicroMsg.SendImgPreFeatureService", "insert img info ret:" + wt03 + " id:" + kVar.f267374a + " hdId:" + kVar.f267390q + str3 + kVar.f267387n + " deletePreBuildFolder:" + C86013q1.m106446g(m1Var2.mo119971i(), true));
            arrayList6 = arrayList;
            it7 = it8;
            str2 = str11;
            str = str13;
            xi = mVar2;
        }
        C98200b0 b0Var10 = b0Var;
        ArrayList<Integer> arrayList7 = arrayList6;
        Log.m105924i("MicroMsg.SendImgPreFeatureService", "delete pre build dir " + wx0().mo119971i() + " deleteResult:" + C86013q1.m106446g(wx0().mo119971i(), true));
        if (!b0Var10.f287931e.isEmpty()) {
            long c2 = (C31543z5.m39453c() - j3) / ((long) b0Var10.f287931e.size());
            if (c2 > 2000) {
                SendImgErrorReportStruct sendImgErrorReportStruct = new SendImgErrorReportStruct();
                sendImgErrorReportStruct.f265863f = (long) b0Var10.f287928b;
                sendImgErrorReportStruct.f265861d = (long) 10006;
                sendImgErrorReportStruct.f265862e = (long) b0Var10.f287930d;
                sendImgErrorReportStruct.f265865h = (long) b0Var10.f287929c;
                sendImgErrorReportStruct.f265866i = c2;
                sendImgErrorReportStruct.mo86054n();
                sendImgErrorReportStruct.mo86056r();
            }
        }
        return arrayList7;
    }

    public final boolean vx0(C98199a0 a0Var, String str, String str2) {
        C86009m1 m1Var = new C86009m1(new C86009m1(wx0(), Ug0(a0Var)), str);
        if (m1Var.mo119967g()) {
            return C86013q1.m106463x(m1Var.mo119971i(), str2);
        }
        return false;
    }

    public final C86009m1 wx0() {
        return (C86009m1) ((C36570n) this.f267338h).getValue();
    }

    public final void xx0(C98199a0 a0Var, int i) {
        SendImgErrorReportStruct sendImgErrorReportStruct = new SendImgErrorReportStruct();
        sendImgErrorReportStruct.f265863f = (long) a0Var.f287920a;
        sendImgErrorReportStruct.f265861d = (long) i;
        sendImgErrorReportStruct.f265862e = (long) a0Var.f287925f;
        Uri n = C116299g2.m163858n(a0Var.f287922c);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            path2 = path2.substring(lastIndexOf + 1);
        }
        sendImgErrorReportStruct.f265864g = sendImgErrorReportStruct.mo86045b("FileName", path2, true);
        sendImgErrorReportStruct.f265865h = (long) a0Var.f287921b;
        sendImgErrorReportStruct.mo86054n();
        sendImgErrorReportStruct.mo86056r();
    }
}
