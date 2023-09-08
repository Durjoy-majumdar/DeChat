package ha0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.maas.MJMaasCore;
import com.tencent.maas.MJMaasInitializer;
import com.tencent.maas.instamovie.MJResourceItem;
import com.tencent.maas.instamovie.MJResourcePreloader;
import com.tencent.maas.instamovie.MJResourceUsageDesc;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.model.MJTemplateMetadata;
import com.tencent.p014mm.mj_template.template_res.MaasTemplateResMgr;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.XEffectLog;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import la0.C61242a;
import org.xwalk.core.XWalkEnvironment;
import p144dt.C7516d;
import qa0.C62586b;
import qa0.C62595e;
import qr3.C36070f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import te3.pr4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ha0.t */
public final class C108221t {

    /* renamed from: a */
    public static final C108221t f324032a = new C108221t();

    /* renamed from: b */
    public static final C13601g f324033b = C36568h.m40985a(C87462l.f253441d);

    /* renamed from: c */
    public static final C13601g f324034c = C36568h.m40985a(C59798m.f170700d);

    /* renamed from: d */
    public static volatile boolean f324035d;

    /* renamed from: e */
    public static final C0000n0 f324036e = C53930o0.m60555b();

    /* renamed from: f */
    public static C53973z1 f324037f;

    /* renamed from: g */
    public static C53973z1 f324038g;

    /* renamed from: h */
    public static C53973z1 f324039h;

    /* renamed from: i */
    public static C53973z1 f324040i;

    /* renamed from: j */
    public static volatile boolean f324041j;

    /* renamed from: k */
    public static MJMaasCore.TemplateServiceProvider f324042k = C59799o.f170701d;

    /* renamed from: l */
    public static MJMaasCore.TemplateServiceProvider f324043l;

    /* renamed from: m */
    public static Object f324044m = new Object();

    /* renamed from: n */
    public static MJResourcePreloader f324045n;

    /* renamed from: o */
    public static volatile boolean f324046o;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {382}, mo125471m = "awaitInit")
    /* renamed from: ha0.t$a */
    public static final class C59794a extends C66704d {

        /* renamed from: d */
        public Object f170691d;

        /* renamed from: e */
        public /* synthetic */ Object f170692e;

        /* renamed from: f */
        public final /* synthetic */ C108221t f170693f;

        /* renamed from: g */
        public int f170694g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59794a(C108221t tVar, C15601d<? super C59794a> dVar) {
            super(dVar);
            this.f170693f = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f170692e = obj;
            this.f170694g |= Integer.MIN_VALUE;
            C108221t tVar = this.f170693f;
            C108221t tVar2 = C108221t.f324032a;
            return tVar.mo158623c(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$awaitInit$2", mo125469f = "MaasManager.kt", mo125470l = {383}, mo125471m = "invokeSuspend")
    /* renamed from: ha0.t$b */
    public static final class C59795b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f170695d;

        public C59795b(C15601d<? super C59795b> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59795b(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C59795b((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f170695d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var = C108221t.f324038g;
                if (z1Var == null) {
                    return null;
                }
                this.f170695d = 1;
                if (z1Var.mo74521O(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ha0.t$d */
    public static final class C59796d implements MJMaasCore.OnBoolComplete {

        /* renamed from: a */
        public final /* synthetic */ String f170696a;

        /* renamed from: b */
        public final /* synthetic */ long f170697b;

        /* renamed from: c */
        public final /* synthetic */ C15601d<Boolean> f170698c;

        public C59796d(String str, long j, C15601d<? super Boolean> dVar) {
            this.f170696a = str;
            this.f170697b = j;
            this.f170698c = dVar;
        }

        public final void onComplete(boolean z) {
            Log.m105924i("MicroMsg.MaasManager", "checkLocalTemplate: " + this.f170696a + ", " + this.f170697b + " -> " + z);
            C15601d<Boolean> dVar = this.f170698c;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$initSdk$1$1", mo125469f = "MaasManager.kt", mo125470l = {125}, mo125471m = "invokeSuspend")
    /* renamed from: ha0.t$j */
    public static final class C59797j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f170699d;

        public C59797j(C15601d<? super C59797j> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59797j(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C59797j((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C53973z1 z1Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f170699d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var2 = C108221t.f324039h;
                boolean z = false;
                if (z1Var2 != null && z1Var2.mo74466a()) {
                    z = true;
                }
                if (z && (z1Var = C108221t.f324039h) != null) {
                    this.f170699d = 1;
                    if (z1Var.mo74521O(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ha0.t$m */
    public static final class C59798m extends C87413o implements C32224a<MJMaasCore> {

        /* renamed from: d */
        public static final C59798m f170700d = new C59798m();

        public C59798m() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.MaasManager", "get maasCore " + Thread.currentThread().getName());
            return new MJMaasCore(new Handler(Looper.getMainLooper()));
        }
    }

    /* renamed from: ha0.t$o */
    public static final class C59799o implements MJMaasCore.TemplateServiceProvider {

        /* renamed from: d */
        public static final C59799o f170701d = new C59799o();

        public final MJTemplateMetadata onRequestTemplateMetadata(String str) {
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            Log.m105924i("MicroMsg.MaasManager", "onRequestTemplateMetadata name:" + str);
            if (C108221t.f324043l == null) {
                Log.m105920e("MicroMsg.MaasManager", "you have not set templateProvider!!!");
            }
            MJMaasCore.TemplateServiceProvider templateServiceProvider = C108221t.f324043l;
            if (templateServiceProvider != null) {
                return templateServiceProvider.onRequestTemplateMetadata(str);
            }
            return null;
        }
    }

    /* renamed from: ha0.t$l */
    public static final class C87462l extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C87462l f253441d = new C87462l();

        public C87462l() {
            super(0);
        }

        public Object invoke() {
            C36070f.m40901a("xeffect_xlog");
            MJMaasInitializer.initialize(C87461a0.f253440a);
            return Boolean.TRUE;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {445, 446}, mo125471m = "checkLocalTemplate")
    /* renamed from: ha0.t$c */
    public static final class C108222c extends C66704d {

        /* renamed from: d */
        public Object f324047d;

        /* renamed from: e */
        public long f324048e;

        /* renamed from: f */
        public /* synthetic */ Object f324049f;

        /* renamed from: g */
        public final /* synthetic */ C108221t f324050g;

        /* renamed from: h */
        public int f324051h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108222c(C108221t tVar, C15601d<? super C108222c> dVar) {
            super(dVar);
            this.f324050g = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324049f = obj;
            this.f324051h |= Integer.MIN_VALUE;
            C108221t tVar = this.f324050g;
            C108221t tVar2 = C108221t.f324032a;
            return tVar.mo158624d((String) null, 0, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {236}, mo125471m = "createCamFunSessionManager")
    /* renamed from: ha0.t$e */
    public static final class C108223e extends C66704d {

        /* renamed from: d */
        public Object f324052d;

        /* renamed from: e */
        public Object f324053e;

        /* renamed from: f */
        public /* synthetic */ Object f324054f;

        /* renamed from: g */
        public final /* synthetic */ C108221t f324055g;

        /* renamed from: h */
        public int f324056h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108223e(C108221t tVar, C15601d<? super C108223e> dVar) {
            super(dVar);
            this.f324055g = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324054f = obj;
            this.f324056h |= Integer.MIN_VALUE;
            return this.f324055g.mo158625e((DimensionLevel) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {330}, mo125471m = "createMovieSession")
    /* renamed from: ha0.t$f */
    public static final class C108224f extends C66704d {

        /* renamed from: d */
        public Object f324057d;

        /* renamed from: e */
        public /* synthetic */ Object f324058e;

        /* renamed from: f */
        public final /* synthetic */ C108221t f324059f;

        /* renamed from: g */
        public int f324060g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108224f(C108221t tVar, C15601d<? super C108224f> dVar) {
            super(dVar);
            this.f324059f = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324058e = obj;
            this.f324060g |= Integer.MIN_VALUE;
            C108221t tVar = this.f324059f;
            C108221t tVar2 = C108221t.f324032a;
            return tVar.mo158626f(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {225}, mo125471m = "createMovieSessionManager")
    /* renamed from: ha0.t$g */
    public static final class C108225g extends C66704d {

        /* renamed from: d */
        public Object f324061d;

        /* renamed from: e */
        public Object f324062e;

        /* renamed from: f */
        public /* synthetic */ Object f324063f;

        /* renamed from: g */
        public final /* synthetic */ C108221t f324064g;

        /* renamed from: h */
        public int f324065h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108225g(C108221t tVar, C15601d<? super C108225g> dVar) {
            super(dVar);
            this.f324064g = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324063f = obj;
            this.f324065h |= Integer.MIN_VALUE;
            return this.f324064g.mo158627g((C61242a.C61245c) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {247}, mo125471m = "createRenderSurface")
    /* renamed from: ha0.t$h */
    public static final class C108226h extends C66704d {

        /* renamed from: d */
        public Object f324066d;

        /* renamed from: e */
        public Object f324067e;

        /* renamed from: f */
        public /* synthetic */ Object f324068f;

        /* renamed from: g */
        public final /* synthetic */ C108221t f324069g;

        /* renamed from: h */
        public int f324070h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108226h(C108221t tVar, C15601d<? super C108226h> dVar) {
            super(dVar);
            this.f324069g = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324068f = obj;
            this.f324070h |= Integer.MIN_VALUE;
            return this.f324069g.mo158628h((Context) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager", mo125469f = "MaasManager.kt", mo125470l = {213}, mo125471m = "filterLocalTemplate")
    /* renamed from: ha0.t$i */
    public static final class C108227i extends C66704d {

        /* renamed from: d */
        public Object f324071d;

        /* renamed from: e */
        public Object f324072e;

        /* renamed from: f */
        public Object f324073f;

        /* renamed from: g */
        public Object f324074g;

        /* renamed from: h */
        public Object f324075h;

        /* renamed from: i */
        public /* synthetic */ Object f324076i;

        /* renamed from: j */
        public final /* synthetic */ C108221t f324077j;

        /* renamed from: n */
        public int f324078n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108227i(C108221t tVar, C15601d<? super C108227i> dVar) {
            super(dVar);
            this.f324077j = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f324076i = obj;
            this.f324078n |= Integer.MIN_VALUE;
            return this.f324077j.mo158629i((List<? extends pr4>) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$initSdk$1$2", mo125469f = "MaasManager.kt", mo125470l = {134, 149}, mo125471m = "invokeSuspend")
    /* renamed from: ha0.t$k */
    public static final class C108228k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f324079d;

        /* renamed from: ha0.t$k$a */
        public static final class C108229a extends C87413o implements C32226l<MJMaasCore.OnComplete, MJError> {

            /* renamed from: d */
            public final /* synthetic */ MJMaasCore.EnvironmentParams f324080d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C108229a(MJMaasCore.EnvironmentParams environmentParams) {
                super(1);
                this.f324080d = environmentParams;
            }

            public Object invoke(Object obj) {
                MJMaasCore.OnComplete onComplete = (MJMaasCore.OnComplete) obj;
                C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
                C108221t tVar = C108221t.f324032a;
                tVar.mo158630j().setAnalyticsListener(C108237y.f324093a);
                MJMaasCore.ILinkContextParams iLinkContextParams = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Maas_ShowAllTemplate_Int, -1) == 1 ? new MJMaasCore.ILinkContextParams(new MJMaasCore.ILinkContextParamsSelfManaged(0, true, (String) null)) : new MJMaasCore.ILinkContextParams(new MJMaasCore.ILinkContextParamsExternalManaged());
                MJMaasCore j = tVar.mo158630j();
                Context context = MMApplicationContext.getContext();
                MJMaasCore.ILinkParams iLinkParams = new MJMaasCore.ILinkParams(iLinkContextParams, "wechat", "", "", (MJMaasCore.LoginParamsCallback) C108245z.f324117a);
                MJMaasCore.EnvironmentParams environmentParams = this.f324080d;
                MJMaasCore.LoggingParams loggingParams = new MJMaasCore.LoggingParams(XEffectLog.m144537a(), MJMaasCore.LogLevel.INFO);
                MJMaasCore.WarmupParams warmupParams = new MJMaasCore.WarmupParams(C86013q1.m106448i(MaasTemplateResMgr.f79455g.mo56372d(), false), C86013q1.m106448i(MaasTemplateResMgr.f79456h.mo56372d(), false), false);
                C62586b.f177739a.getClass();
                return j.startup(context, iLinkParams, environmentParams, loggingParams, warmupParams, new MJMaasCore.TemplateServiceParams(C62595e.f177779d, C108221t.f324042k), onComplete);
            }
        }

        public C108228k(C15601d<? super C108228k> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108228k(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C108228k((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x00ce  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r13.f324079d
                r3 = 2
                java.lang.String r4 = "MicroMsg.MaasManager"
                r5 = 1
                if (r2 == 0) goto L_0x0021
                if (r2 == r5) goto L_0x001d
                if (r2 != r3) goto L_0x0015
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x00c2
            L_0x0015:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0034
            L_0x0021:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.String r14 = "start init MaasSDK"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
                ha0.t r14 = ha0.C108221t.f324032a
                r13.f324079d = r5
                java.lang.Object r14 = ha0.C108221t.m146549a(r14, r13)
                if (r14 != r1) goto L_0x0034
                return r1
            L_0x0034:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 != 0) goto L_0x003f
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x003f:
                java.lang.String r14 = "initSdk: after so"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
                ac3.q0 r14 = ac3.C91992q0.f263331a
                r14.mo125828b()
                java.lang.String r14 = a70.C112760b.m154225d()
                com.tencent.maas.MJMaasCore$EnvironmentParams r2 = new com.tencent.maas.MJMaasCore$EnvironmentParams
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r14)
                java.lang.String r7 = "Maas/Persist"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r6, r5)
                java.lang.String r7 = java.lang.String.valueOf(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r14)
                java.lang.String r8 = "Maas/Cache"
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r6, r5)
                java.lang.String r9 = java.lang.String.valueOf(r6)
                com.tencent.mm.vfs.VFSStrategy$$b r6 = com.tencent.p014mm.vfs.VFSStrategy.f348871a
                java.lang.String r6 = "MaasTemp"
                com.tencent.mm.vfs.m1 r6 = a70.C112760b.m154236i0(r6)
                java.lang.String r10 = r6.mo119976n()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r14)
                r6.append(r8)
                java.lang.String r14 = r6.toString()
                java.lang.String r14 = com.tencent.p014mm.vfs.C86013q1.m106448i(r14, r5)
                java.lang.String r14 = java.lang.String.valueOf(r14)
                r11 = 1
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
                r6 = r2
                r8 = r9
                r9 = r10
                r10 = r14
                r6.<init>(r7, r8, r9, r10, r11, r12)
                ha0.t r14 = ha0.C108221t.f324032a
                ha0.t$k$a r14 = new ha0.t$k$a
                r14.<init>(r2)
                r13.f324079d = r3
                java.lang.String r2 = "100"
                java.lang.Object r14 = ha0.C108238y0.m146564c(r2, r14, r13)
                if (r14 != r1) goto L_0x00c2
                return r1
            L_0x00c2:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                ha0.C108221t.f324035d = r14
                boolean r14 = ha0.C108221t.f324035d
                if (r14 == 0) goto L_0x0188
                bp3.p r14 = bp3.C79758p.f233760a
                bp3.f r1 = bp3.C104160f.RepairerConfig_Maas_PreloadEnable_Int
                r2 = -1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r14 = r14.mo109878a(r1, r2)
                boolean r1 = gy3.C87412m.m108589b(r14, r2)
                if (r1 == 0) goto L_0x00f2
                di3.d r14 = di3.C86312j.m106911c(r0)
                h81.h r14 = (h81.C32735h) r14
                h81.h$c r1 = h81.C32735h.C32737c.clicfg_maas_preload
                r2 = 0
                int r14 = r14.mo58779Qe(r1, r2)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            L_0x00f2:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r14 = gy3.C87412m.m108589b(r14, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "enablePreload() "
                r1.append(r2)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MicroMsg.MaasAlbumTemplateGlobalConfig"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                if (r14 == 0) goto L_0x0188
                ha0.t r14 = ha0.C108221t.f324032a
                com.tencent.maas.MJMaasCore r14 = r14.mo158630j()
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                r1.<init>(r3)
                com.tencent.maas.instamovie.MJResourcePreloader r14 = r14.newResourcePreloader(r1)
                r14.startPreloading()
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifiFromCache(r1)
                if (r1 == 0) goto L_0x015a
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r1 = h81.C32735h.C32737c.clicfg_maas_preload_wifi_limit
                r3 = 100000000(0x5f5e100, float:2.3122341E-35)
                int r0 = r0.mo58779Qe(r1, r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "wifiPreloadLimit: "
                r1.append(r3)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                long r0 = (long) r0
                r14.setPreloadResourceSizeLimit(r0)
                goto L_0x0181
            L_0x015a:
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r1 = h81.C32735h.C32737c.clicfg_maas_preload_mobile_limit
                r3 = 50000000(0x2faf080, float:3.6872239E-37)
                int r0 = r0.mo58779Qe(r1, r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "mobilePreloadLimit: "
                r1.append(r3)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                long r0 = (long) r0
                r14.setPreloadResourceSizeLimit(r0)
            L_0x0181:
                ha0.C108221t.f324045n = r14
                java.lang.String r14 = "initSdk: init resource preloader"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            L_0x0188:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r0 = "finished init MaasSDK:"
                r14.append(r0)
                boolean r0 = ha0.C108221t.f324035d
                r14.append(r0)
                java.lang.String r14 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.C108228k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$release$1", mo125469f = "MaasManager.kt", mo125470l = {288, 290}, mo125471m = "invokeSuspend")
    /* renamed from: ha0.t$n */
    public static final class C108230n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f324081d;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.MaasManager$release$1$2", mo125469f = "MaasManager.kt", mo125470l = {300, 303, 313}, mo125471m = "invokeSuspend")
        /* renamed from: ha0.t$n$a */
        public static final class C108231a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f324082d;

            /* renamed from: ha0.t$n$a$a */
            public static final class C108232a extends C87413o implements C32226l<MJMaasCore.OnComplete, MJError> {

                /* renamed from: d */
                public static final C108232a f324083d = new C108232a();

                public C108232a() {
                    super(1);
                }

                public Object invoke(Object obj) {
                    MJMaasCore.OnComplete onComplete = (MJMaasCore.OnComplete) obj;
                    Class cls = C32735h.class;
                    C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
                    MJMaasCore j = C108221t.f324032a.mo158630j();
                    int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_maas_cleanup_max_limit, XWalkEnvironment.TEST_APK_START_VERSION);
                    Log.m105924i("MicroMsg.MaasAlbumTemplateGlobalConfig", "cleanupMaxLimit: " + Qe);
                    int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_maas_cleanup_min_limit, 100000);
                    Log.m105924i("MicroMsg.MaasAlbumTemplateGlobalConfig", "cleanupMinLimit: " + Qe2);
                    j.cleanupResourceCaches(new MJMaasCore.ResourceCacheCleanupOptions(Qe, Qe2), onComplete);
                    return null;
                }
            }

            /* renamed from: ha0.t$n$a$b */
            public static final class C108233b extends C87413o implements C32226l<MJMaasCore.OnComplete, MJError> {

                /* renamed from: d */
                public static final C108233b f324084d = new C108233b();

                public C108233b() {
                    super(1);
                }

                public Object invoke(Object obj) {
                    MJMaasCore.OnComplete onComplete = (MJMaasCore.OnComplete) obj;
                    C87412m.m108594g(onComplete, LocaleUtil.ITALIAN);
                    Log.m105924i("MicroMsg.MaasManager", "release maasCore");
                    return C108221t.f324032a.mo158630j().teardown(onComplete);
                }
            }

            public C108231a(C15601d<? super C108231a> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C108231a(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                return new C108231a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r6.f324082d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    java.lang.String r5 = "MicroMsg.MaasManager"
                    if (r1 == 0) goto L_0x0025
                    if (r1 == r4) goto L_0x0021
                    if (r1 == r3) goto L_0x001d
                    if (r1 != r2) goto L_0x0015
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L_0x005a
                L_0x0015:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x001d:
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L_0x004d
                L_0x0021:
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L_0x003c
                L_0x0025:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.String r7 = "start release MaasSDK"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
                    a14.z1 r7 = ha0.C108221t.f324040i
                    if (r7 == 0) goto L_0x003c
                    r6.f324082d = r4
                    a14.f2 r7 = (a14.C53884f2) r7
                    java.lang.Object r7 = r7.mo74521O(r6)
                    if (r7 != r0) goto L_0x003c
                    return r0
                L_0x003c:
                    boolean r7 = ha0.C108221t.f324041j
                    if (r7 != 0) goto L_0x006d
                    ha0.t$n$a$a r7 = ha0.C108221t.C108230n.C108231a.C108232a.f324083d
                    r6.f324082d = r3
                    java.lang.String r1 = "102"
                    java.lang.Object r7 = ha0.C108238y0.m146564c(r1, r7, r6)
                    if (r7 != r0) goto L_0x004d
                    return r0
                L_0x004d:
                    ha0.t$n$a$b r7 = ha0.C108221t.C108230n.C108231a.C108233b.f324084d
                    r6.f324082d = r2
                    java.lang.String r1 = "101"
                    java.lang.Object r7 = ha0.C108238y0.m146564c(r1, r7, r6)
                    if (r7 != r0) goto L_0x005a
                    return r0
                L_0x005a:
                    ha0.t r7 = ha0.C108221t.f324032a
                    com.tencent.maas.MJMaasCore r7 = r7.mo158630j()
                    r0 = 0
                    r7.setAnalyticsListener(r0)
                    r7 = 0
                    ha0.C108221t.f324035d = r7
                    java.lang.String r7 = "finished release MaasSDK"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
                    goto L_0x0072
                L_0x006d:
                    java.lang.String r7 = "release: skip release"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r7)
                L_0x0072:
                    rx3.b0 r7 = rx3.C13598b0.f38549a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.C108230n.C108231a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C108230n(C15601d<? super C108230n> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108230n(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C108230n((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r10.f324081d
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x001d
                if (r1 == r4) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x004d
            L_0x0011:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0019:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0040
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r11)
                a14.z1 r11 = ha0.C108221t.f324038g
                if (r11 == 0) goto L_0x002e
                a14.a r11 = (a14.C53851a) r11
                boolean r11 = r11.mo74466a()
                if (r11 != r4) goto L_0x002e
                r11 = 1
                goto L_0x002f
            L_0x002e:
                r11 = 0
            L_0x002f:
                if (r11 == 0) goto L_0x0040
                a14.z1 r11 = ha0.C108221t.f324038g
                if (r11 == 0) goto L_0x0040
                r10.f324081d = r4
                a14.f2 r11 = (a14.C53884f2) r11
                java.lang.Object r11 = r11.mo74521O(r10)
                if (r11 != r0) goto L_0x0040
                return r0
            L_0x0040:
                a14.z1 r11 = ha0.C108221t.f324039h
                if (r11 == 0) goto L_0x004d
                r10.f324081d = r2
                java.lang.Object r11 = r11.mo74521O(r10)
                if (r11 != r0) goto L_0x004d
                return r0
            L_0x004d:
                boolean r11 = ha0.C108221t.f324035d
                if (r11 == 0) goto L_0x007c
                com.tencent.maas.instamovie.MJResourcePreloader r11 = ha0.C108221t.f324045n
                if (r11 == 0) goto L_0x005f
                java.lang.String r0 = "MicroMsg.MaasManager"
                java.lang.String r1 = "release: teardown resource preloader"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                r11.stopPreloading()
            L_0x005f:
                r11 = 0
                ha0.C108221t.f324045n = r11
                ha0.t r0 = ha0.C108221t.f324032a
                com.tencent.maas.MJMaasCore r0 = r0.mo158630j()
                r0.destroyResourcePreloader()
                a14.n0 r4 = ha0.C108221t.f324036e
                r5 = 0
                r6 = 0
                ha0.t$n$a r7 = new ha0.t$n$a
                r7.<init>(r11)
                r8 = 3
                r9 = 0
                a14.z1 r11 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
                ha0.C108221t.f324039h = r11
            L_0x007c:
                ha0.t r11 = ha0.C108221t.f324032a
                ha0.C108221t.f324046o = r3
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.C108230n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        ((C7516d) C86312j.m106911c(C7516d.class)).mo8638Za();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m146549a(ha0.C108221t r9, wx3.C15601d r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof ha0.C108234u
            if (r0 == 0) goto L_0x0016
            r0 = r10
            ha0.u r0 = (ha0.C108234u) r0
            int r1 = r0.f324087f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f324087f = r1
            goto L_0x001b
        L_0x0016:
            ha0.u r0 = new ha0.u
            r0.<init>(r9, r10)
        L_0x001b:
            java.lang.Object r9 = r0.f324085d
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r0.f324087f
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005c
        L_0x002a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r9)
            a14.z1 r9 = f324037f
            r1 = 0
            if (r9 != 0) goto L_0x004c
            a14.n0 r3 = f324036e
            a14.h0 r4 = a14.C53872d1.f151119c
            r5 = 0
            ha0.v r6 = new ha0.v
            r6.<init>(r1)
            r7 = 2
            r8 = 0
            a14.z1 r9 = a14.C53895h.m60466d(r3, r4, r5, r6, r7, r8)
            f324037f = r9
        L_0x004c:
            a14.h0 r9 = a14.C53872d1.f151119c
            ha0.w r3 = new ha0.w
            r3.<init>(r1)
            r0.f324087f = r2
            java.lang.Object r9 = a14.C53895h.m60469g(r9, r3, r0)
            if (r9 != r10) goto L_0x005c
            goto L_0x006e
        L_0x005c:
            ka0.g r9 = ka0.C33848g.f91487a
            java.util.concurrent.locks.ReentrantLock r10 = ka0.C33848g.f91490d
            r10.lock()
            boolean r9 = r9.mo59326f()     // Catch:{ all -> 0x006f }
            r10.unlock()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
        L_0x006e:
            return r10
        L_0x006f:
            r9 = move-exception
            java.util.concurrent.locks.ReentrantLock r10 = ka0.C33848g.f91490d
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.m146549a(ha0.t, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083 A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090 A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095 A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7 A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca A[Catch:{ d -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m146550b(ha0.C108221t r19, wx3.C15601d r20) {
        /*
            r0 = r20
            r19.getClass()
            boolean r1 = r0 instanceof ha0.C108235x
            if (r1 == 0) goto L_0x0018
            r1 = r0
            ha0.x r1 = (ha0.C108235x) r1
            int r2 = r1.f324091g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f324091g = r2
            goto L_0x001f
        L_0x0018:
            ha0.x r1 = new ha0.x
            r2 = r19
            r1.<init>(r2, r0)
        L_0x001f:
            r6 = r1
            java.lang.Object r0 = r6.f324089e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r6.f324091g
            r3 = 1
            java.lang.String r9 = "MicroMsg.MaasManager"
            java.lang.String r10 = ""
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            long r1 = r6.f324088d
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ d -> 0x0035 }
            goto L_0x006d
        L_0x0035:
            r0 = move-exception
            goto L_0x00d0
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.String r0 = "ilink login"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            long r11 = java.lang.System.currentTimeMillis()
            ha0.a r0 = ha0.C46015a.f124098d     // Catch:{ d -> 0x00d2 }
            rx3.g r0 = rx3.C36568h.m40985a(r0)     // Catch:{ d -> 0x00d2 }
            r6.f324088d = r11     // Catch:{ d -> 0x00d2 }
            r6.f324091g = r3     // Catch:{ d -> 0x00d2 }
            rx3.n r0 = (rx3.C36570n) r0     // Catch:{ d -> 0x00d2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ d -> 0x00d2 }
            r2 = r0
            ob0.b r2 = (ob0.C89132b) r2     // Catch:{ d -> 0x00d2 }
            r3 = 0
            r5 = 0
            r7 = 3
            r8 = 0
            java.lang.Object r0 = q40.C89456b.m111831a(r2, r3, r5, r6, r7, r8)     // Catch:{ d -> 0x00d2 }
            if (r0 != r1) goto L_0x006c
            goto L_0x0137
        L_0x006c:
            r1 = r11
        L_0x006d:
            te3.w12 r0 = (te3.C51770w12) r0     // Catch:{ d -> 0x0035 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ d -> 0x0035 }
            r3.<init>()     // Catch:{ d -> 0x0035 }
            java.lang.String r4 = "ilink login ret:"
            r3.append(r4)     // Catch:{ d -> 0x0035 }
            pe3.b r4 = r0.f143812d     // Catch:{ d -> 0x0035 }
            r5 = 0
            if (r4 == 0) goto L_0x0083
            java.lang.String r4 = r4.mo123705h()     // Catch:{ d -> 0x0035 }
            goto L_0x0084
        L_0x0083:
            r4 = r5
        L_0x0084:
            r3.append(r4)     // Catch:{ d -> 0x0035 }
            java.lang.String r4 = ", "
            r3.append(r4)     // Catch:{ d -> 0x0035 }
            pe3.b r4 = r0.f143813e     // Catch:{ d -> 0x0035 }
            if (r4 == 0) goto L_0x0095
            java.lang.String r4 = r4.mo123705h()     // Catch:{ d -> 0x0035 }
            goto L_0x0096
        L_0x0095:
            r4 = r5
        L_0x0096:
            r3.append(r4)     // Catch:{ d -> 0x0035 }
            java.lang.String r3 = r3.toString()     // Catch:{ d -> 0x0035 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)     // Catch:{ d -> 0x0035 }
            ja0.b r11 = ja0.C108679b.f325464a     // Catch:{ d -> 0x0035 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ d -> 0x0035 }
            long r15 = r3 - r1
            r12 = 101(0x65, float:1.42E-43)
            java.lang.String r13 = "iLinkGetAuthCode"
            java.lang.String r14 = "success"
            r11.mo159696c(r12, r13, r14, r15)     // Catch:{ d -> 0x0035 }
            rx3.l r3 = new rx3.l     // Catch:{ d -> 0x0035 }
            pe3.b r4 = r0.f143812d     // Catch:{ d -> 0x0035 }
            if (r4 == 0) goto L_0x00bc
            java.lang.String r4 = r4.mo123705h()     // Catch:{ d -> 0x0035 }
            goto L_0x00bd
        L_0x00bc:
            r4 = r5
        L_0x00bd:
            if (r4 != 0) goto L_0x00c0
            r4 = r10
        L_0x00c0:
            pe3.b r0 = r0.f143813e     // Catch:{ d -> 0x0035 }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r5 = r0.mo123705h()     // Catch:{ d -> 0x0035 }
        L_0x00c8:
            if (r5 != 0) goto L_0x00cb
            r5 = r10
        L_0x00cb:
            r3.<init>(r4, r5)     // Catch:{ d -> 0x0035 }
            r1 = r3
            goto L_0x0137
        L_0x00d0:
            r11 = r1
            goto L_0x00d3
        L_0x00d2:
            r0 = move-exception
        L_0x00d3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ilink login error "
            r1.append(r2)
            int r2 = r0.f35057e
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            int r2 = r0.f35058f
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r1, r3)
            ja0.b r13 = ja0.C108679b.f325464a
            long r3 = java.lang.System.currentTimeMillis()
            long r17 = r3 - r11
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            int r3 = r0.f35057e
            java.lang.String r4 = "errType"
            r1.put(r4, r3)
            int r3 = r0.f35058f
            java.lang.String r4 = "errCode"
            r1.put(r4, r3)
            java.lang.String r0 = r0.f35059g
            java.lang.String r3 = "errMsg"
            r1.put(r3, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JSONObject().apply {\n   …Msg)\n        }.toString()"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = ","
            java.lang.String r3 = ";"
            java.lang.String r16 = z04.C112551y.m153814n(r0, r1, r3, r2)
            r14 = 101(0x65, float:1.42E-43)
            java.lang.String r15 = "iLinkGetAuthCode"
            r13.mo159696c(r14, r15, r16, r17)
            rx3.l r1 = new rx3.l
            r1.<init>(r10, r10)
        L_0x0137:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.m146550b(ha0.t, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158623c(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ha0.C108221t.C59794a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ha0.t$a r0 = (ha0.C108221t.C59794a) r0
            int r1 = r0.f170694g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f170694g = r1
            goto L_0x0018
        L_0x0013:
            ha0.t$a r0 = new ha0.t$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f170692e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f170694g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r0 = r0.f170691d
            ha0.t r0 = (ha0.C108221t) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0059
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r6)
            a14.z1 r6 = f324038g
            if (r6 == 0) goto L_0x005b
            r2 = 0
            if (r6 == 0) goto L_0x0045
            boolean r6 = r6.mo74466a()
            if (r6 != r4) goto L_0x0045
            r2 = 1
        L_0x0045:
            if (r2 == 0) goto L_0x005b
            a14.h0 r6 = a14.C53872d1.f151119c
            ha0.t$b r2 = new ha0.t$b
            r2.<init>(r3)
            r0.f170691d = r5
            r0.f170694g = r4
            java.lang.Object r6 = a14.C53895h.m60469g(r6, r2, r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0059:
            f324038g = r3
        L_0x005b:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.mo158623c(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:18:0x0071, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158624d(java.lang.String r6, long r7, wx3.C15601d<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ha0.C108221t.C108222c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ha0.t$c r0 = (ha0.C108221t.C108222c) r0
            int r1 = r0.f324051h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324051h = r1
            goto L_0x0018
        L_0x0013:
            ha0.t$c r0 = new ha0.t$c
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f324049f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324051h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r6 = r0.f324047d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0074
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            long r7 = r0.f324048e
            java.lang.Object r6 = r0.f324047d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0050
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.f324047d = r6
            r0.f324048e = r7
            r0.f324051h = r4
            java.lang.Object r9 = r5.mo158623c(r0)
            if (r9 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r0.f324047d = r6
            r0.f324048e = r7
            r0.f324051h = r3
            wx3.h r9 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r9.<init>(r0)
            ha0.t r0 = f324032a
            com.tencent.maas.MJMaasCore r0 = r0.mo158630j()
            ha0.t$d r2 = new ha0.t$d
            r2.<init>(r6, r7, r9)
            r0.queryInstaMovieTemplateResourcesStatus(r6, r7, r2)
            java.lang.Object r9 = r9.mo90314b()
            if (r9 != r1) goto L_0x0074
            return r1
        L_0x0074:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.mo158624d(java.lang.String, long, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158625e(com.tencent.maas.instamovie.mediafoundation.DimensionLevel r14, wx3.C15601d<? super ha0.C108210m> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof ha0.C108221t.C108223e
            if (r0 == 0) goto L_0x0013
            r0 = r15
            ha0.t$e r0 = (ha0.C108221t.C108223e) r0
            int r1 = r0.f324056h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324056h = r1
            goto L_0x0018
        L_0x0013:
            ha0.t$e r0 = new ha0.t$e
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f324054f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324056h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r14 = r0.f324053e
            com.tencent.maas.instamovie.mediafoundation.DimensionLevel r14 = (com.tencent.maas.instamovie.mediafoundation.DimensionLevel) r14
            java.lang.Object r0 = r0.f324052d
            ha0.t r0 = (ha0.C108221t) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r15)
            r13.mo158631k(r3)
            r0.f324052d = r13
            r0.f324053e = r14
            r0.f324056h = r3
            java.lang.Object r15 = r13.mo158623c(r0)
            if (r15 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r0 = r13
        L_0x004b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "createCamFunSession maasCoreInitialized:"
            r15.append(r1)
            boolean r1 = f324035d
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            java.lang.String r1 = "MicroMsg.MaasManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r15)
            boolean r15 = f324035d
            r2 = 0
            if (r15 != 0) goto L_0x0072
            r0.getClass()
            java.lang.String r14 = "not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            r14 = r2
            goto L_0x00c7
        L_0x0072:
            com.tencent.maas.MJMaasCore r15 = r0.mo158630j()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            java.lang.String r4 = "MODEL_FACE_DETECT"
            java.lang.String r5 = "MODEL_FACE_ALIGNMENT"
            java.lang.String r6 = "MODEL_PORTRAITSEGMENT"
            java.lang.String r7 = "MODEL_FACE3D_XBIN"
            java.lang.String r8 = "MODEL_FACE3D_PARAMS"
            java.lang.String r9 = "MODEL_LUA_SCRIPT"
            java.lang.String r10 = "MODEL_FACE_OCCULASIONSEG"
            java.lang.String r11 = "MODEL_HAND"
            java.lang.String r12 = "MODEL_FACE_PARSING"
            java.lang.String[] r3 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.List r3 = sx3.C64197v.m75537f(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a2:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00c3
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            ac3.q0 r6 = ac3.C91992q0.f263331a
            java.lang.String r7 = r6.mo11889a(r5)
            if (r7 == 0) goto L_0x00a2
            com.tencent.maas.model.MJModelInfo r8 = new com.tencent.maas.model.MJModelInfo
            java.lang.String r6 = r6.mo125835i(r5)
            r8.<init>(r5, r7, r6)
            r4.add(r8)
            goto L_0x00a2
        L_0x00c3:
            com.tencent.maas.camerafun.MJCamFunSession r14 = r15.newCamFunSession(r0, r4, r14)
        L_0x00c7:
            if (r14 == 0) goto L_0x00cf
            ha0.m r15 = new ha0.m
            r15.<init>(r14)
            return r15
        L_0x00cf:
            java.lang.String r14 = "create camFun session null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.mo158625e(com.tencent.maas.instamovie.mediafoundation.DimensionLevel, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158626f(wx3.C15601d<? super com.tencent.maas.instamovie.MJMovieSession> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof ha0.C108221t.C108224f
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ha0.t$f r2 = (ha0.C108221t.C108224f) r2
            int r3 = r2.f324060g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f324060g = r3
            goto L_0x001c
        L_0x0017:
            ha0.t$f r2 = new ha0.t$f
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f324058e
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f324060g
            r5 = 1
            if (r4 == 0) goto L_0x0037
            if (r4 != r5) goto L_0x002f
            java.lang.Object r2 = r2.f324057d
            ha0.t r2 = (ha0.C108221t) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0046
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r1)
            r2.f324057d = r0
            r2.f324060g = r5
            java.lang.Object r1 = r0.mo158623c(r2)
            if (r1 != r3) goto L_0x0045
            return r3
        L_0x0045:
            r2 = r0
        L_0x0046:
            boolean r1 = f324035d
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "MicroMsg.MaasManager"
            java.lang.String r2 = "not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            r1 = 0
            return r1
        L_0x0053:
            com.tencent.maas.MJMaasCore r1 = r2.mo158630j()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            java.lang.String r4 = "MODEL_FACE_DETECT"
            java.lang.String r5 = "MODEL_FACE_ALIGNMENT"
            java.lang.String r6 = "MODEL_VIDEO_CLIPPING_FEATURE"
            java.lang.String r7 = "MODEL_EXPRESSION_HIGHLIGHT"
            java.lang.String r8 = "MODEL_AUDIO_CNN"
            java.lang.String r9 = "MODEL_VIDEO_CLASSIFICATION"
            java.lang.String r10 = "MODEL_VIDEO_IMG_CLASSIFICATION"
            java.lang.String r11 = "MODEL_VIDEO_IMG_FEAT"
            java.lang.String r12 = "MODEL_VIDEO_HIGHLIGHT"
            java.lang.String r13 = "MODEL_PORTRAITSEGMENT"
            java.lang.String r14 = "MODEL_AUDIO_PREPARE"
            java.lang.String r15 = "MODEL_AUDIO_TASK_AUDIO_FEAT"
            java.lang.String r16 = "MODEL_AUDIO_TASK_FUSION"
            java.lang.String r17 = "MODEL_AUDIO_TASK_IMAGE_FEAT"
            java.lang.String[] r3 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            java.util.List r3 = sx3.C64197v.m75537f(r3)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x008d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            ac3.q0 r6 = ac3.C91992q0.f263331a
            java.lang.String r7 = r6.mo11889a(r5)
            if (r7 == 0) goto L_0x008d
            com.tencent.maas.model.MJModelInfo r8 = new com.tencent.maas.model.MJModelInfo
            java.lang.String r6 = r6.mo125835i(r5)
            r8.<init>(r5, r7, r6)
            r4.add(r8)
            goto L_0x008d
        L_0x00ae:
            com.tencent.maas.instamovie.MJMovieSession r1 = r1.newMovieSession(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.mo158626f(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158627g(la0.C61242a.C61245c r5, wx3.C15601d<? super ha0.C108183c0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ha0.C108221t.C108225g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ha0.t$g r0 = (ha0.C108221t.C108225g) r0
            int r1 = r0.f324065h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324065h = r1
            goto L_0x0018
        L_0x0013:
            ha0.t$g r0 = new ha0.t$g
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f324063f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324065h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f324062e
            la0.a$c r5 = (la0.C61242a.C61245c) r5
            java.lang.Object r0 = r0.f324061d
            ha0.t r0 = (ha0.C108221t) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f324061d = r4
            r0.f324062e = r5
            r0.f324065h = r3
            java.lang.Object r6 = r4.mo158626f(r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            com.tencent.maas.instamovie.MJMovieSession r6 = (com.tencent.maas.instamovie.MJMovieSession) r6
            if (r6 != 0) goto L_0x0054
            java.lang.String r5 = "MicroMsg.MaasManager"
            java.lang.String r6 = "create movie session null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            r5 = 0
            return r5
        L_0x0054:
            f324041j = r3
            ha0.c0 r0 = new ha0.c0
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.mo158627g(la0.a$c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158628h(android.content.Context r5, wx3.C15601d<? super android.view.SurfaceView> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ha0.C108221t.C108226h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ha0.t$h r0 = (ha0.C108221t.C108226h) r0
            int r1 = r0.f324070h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324070h = r1
            goto L_0x0018
        L_0x0013:
            ha0.t$h r0 = new ha0.t$h
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f324068f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324070h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f324067e
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r0 = r0.f324066d
            ha0.t r0 = (ha0.C108221t) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0048
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f324066d = r4
            r0.f324067e = r5
            r0.f324070h = r3
            java.lang.Object r6 = r4.mo158623c(r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = r4
        L_0x0048:
            boolean r6 = f324035d
            if (r6 != 0) goto L_0x0055
            java.lang.String r5 = "MicroMsg.MaasManager"
            java.lang.String r6 = "not initialized"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            r5 = 0
            return r5
        L_0x0055:
            com.tencent.maas.MJMaasCore r6 = r0.mo158630j()
            android.view.SurfaceView r5 = r6.newRenderView(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.mo158628h(android.content.Context, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo158629i(java.util.List<? extends te3.pr4> r12, wx3.C15601d<? super java.util.List<? extends te3.pr4>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ha0.C108221t.C108227i
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ha0.t$i r0 = (ha0.C108221t.C108227i) r0
            int r1 = r0.f324078n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f324078n = r1
            goto L_0x0018
        L_0x0013:
            ha0.t$i r0 = new ha0.t$i
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f324076i
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324078n
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r12 = r0.f324075h
            java.util.LinkedList r12 = (java.util.LinkedList) r12
            java.lang.Object r2 = r0.f324074g
            java.lang.Object r4 = r0.f324073f
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.f324072e
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.f324071d
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0088
        L_0x0039:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
            r4 = r12
            r12 = r13
            r6 = r12
            r5 = r2
        L_0x0056:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0094
            java.lang.Object r2 = r4.next()
            r13 = r2
            te3.pr4 r13 = (te3.pr4) r13
            ha0.t r7 = f324032a
            java.lang.String r8 = r13.f139919d
            java.lang.String r9 = "it.id"
            gy3.C87412m.m108593f(r8, r9)
            te3.vy r13 = r13.f139922g
            if (r13 == 0) goto L_0x0073
            int r13 = r13.f143766j
            goto L_0x0074
        L_0x0073:
            r13 = 0
        L_0x0074:
            long r9 = (long) r13
            r0.f324071d = r6
            r0.f324072e = r5
            r0.f324073f = r4
            r0.f324074g = r2
            r0.f324075h = r12
            r0.f324078n = r3
            java.lang.Object r13 = r7.mo158624d(r8, r9, r0)
            if (r13 != r1) goto L_0x0088
            return r1
        L_0x0088:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0056
            r5.add(r2)
            goto L_0x0056
        L_0x0094:
            java.util.List r5 = (java.util.List) r5
            r12.addAll(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C108221t.mo158629i(java.util.List, wx3.d):java.lang.Object");
    }

    /* renamed from: j */
    public final MJMaasCore mo158630j() {
        return (MJMaasCore) ((C36570n) f324034c).getValue();
    }

    /* renamed from: k */
    public final void mo158631k(boolean z) {
        synchronized (f324044m) {
            StringBuilder sb = new StringBuilder();
            sb.append("initSdk: maasCoreInitialized: ");
            sb.append(f324035d);
            sb.append(" initJob: ");
            C53973z1 z1Var = f324038g;
            sb.append(z1Var != null ? Boolean.valueOf(z1Var.mo74466a()) : null);
            sb.append(" releaseJob: ");
            C53973z1 z1Var2 = f324039h;
            sb.append(z1Var2 != null ? Boolean.valueOf(z1Var2.mo74466a()) : null);
            Log.m105924i("MicroMsg.MaasManager", sb.toString());
            if (z) {
                MaasTemplateResMgr maasTemplateResMgr = MaasTemplateResMgr.f79455g;
                MaasTemplateResMgr.f79456h.mo56370b();
            } else {
                MaasTemplateResMgr maasTemplateResMgr2 = MaasTemplateResMgr.f79455g;
                MaasTemplateResMgr.f79455g.mo56370b();
            }
            if (!f324035d) {
                boolean z2 = true;
                C53895h.m60468f((C66212f) null, new C59797j((C15601d<? super C59797j>) null), 1, (Object) null);
                C53973z1 z1Var3 = f324038g;
                if (z1Var3 == null || !z1Var3.mo74466a()) {
                    z2 = false;
                }
                if (z2) {
                    Log.m105924i("MicroMsg.MaasManager", "initJob running ignore");
                    return;
                }
                f324038g = C53895h.m60466d(f324036e, (C66212f) null, (C53934p0) null, new C108228k((C15601d<? super C108228k>) null), 3, (Object) null);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: l */
    public final void mo158632l() {
        StringBuilder sb = new StringBuilder();
        sb.append("release initJob: ");
        C53973z1 z1Var = f324038g;
        sb.append(z1Var != null ? Boolean.valueOf(z1Var.mo74466a()) : null);
        sb.append(" releaseJob: ");
        C53973z1 z1Var2 = f324039h;
        sb.append(z1Var2 != null ? Boolean.valueOf(z1Var2.mo74466a()) : null);
        Log.m105924i("MicroMsg.MaasManager", sb.toString());
        f324046o = true;
        C53895h.m60466d(f324036e, (C66212f) null, (C53934p0) null, new C108230n((C15601d<? super C108230n>) null), 3, (Object) null);
    }

    /* renamed from: m */
    public final void mo158633m(List<String> list, List<String> list2) {
        C87412m.m108594g(list, "templateList");
        C87412m.m108594g(list2, "musicList");
        MJResourcePreloader mJResourcePreloader = f324045n;
        if (mJResourcePreloader != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
            for (String newTemplateItem : list) {
                arrayList2.add(MJResourceItem.newTemplateItem(newTemplateItem));
            }
            arrayList.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(list2, 10));
            for (String newMusicItem : list2) {
                arrayList3.add(MJResourceItem.newMusicItem(newMusicItem));
            }
            arrayList.addAll(arrayList3);
            mJResourcePreloader.updateExpectedResourceUsage(new MJResourceUsageDesc(arrayList));
        }
    }
}
