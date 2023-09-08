package p634or;

import a10.C112713c;
import a10.C112717f;
import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import bp3.C113204t;
import bp3.C79760s;
import com.tencent.p014mm.flutter.zidl.FlutterCgiService;
import com.tencent.p014mm.flutter.zidl.FlutterExptService;
import com.tencent.p014mm.flutter.zidl.FlutterMmdataReport;
import com.tencent.p014mm.flutter.zidl.ZidlFoundationApiManagerCaller;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.pigeon.FlutterCgiPigeon;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fu1.C116900d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import kg3.C76577a;
import kj2.C117407d;
import kotlin.ResultKt;
import p172io.flutter.embedding.engine.FlutterShellArgs;
import p206nj.C88957l;
import p220pr.C110245g;
import rx3.C13598b0;
import rx3.C36568h;
import sx3.C110823p;
import tf0.C90453g1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C86522b
/* renamed from: or.g */
public final class C117883g extends C86301e implements C110245g {

    /* renamed from: d */
    public final String f352403d = "MicroMsg.FlutterEngineService";

    /* renamed from: e */
    public final C0000n0 f352404e = C53930o0.m60554a(C53872d1.f151119c);

    /* renamed from: f */
    public C112713c f352405f;

    /* renamed from: g */
    public C53973z1 f352406g;

    /* renamed from: h */
    public ZidlFoundationApiManagerCaller f352407h;

    /* renamed from: i */
    public final FlutterExptService f352408i;

    /* renamed from: j */
    public final C89285e f352409j;

    /* renamed from: n */
    public final C89283b f352410n;

    /* renamed from: or.g$c */
    public static final class C35265c implements FlutterExptService {

        /* renamed from: a */
        public static final C35265c f94504a = new C35265c();

        public final String getExpt(String str) {
            return ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5(str, (String) null);
        }
    }

    /* renamed from: or.g$d */
    public static final class C35266d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C35266d f94505d = new C35266d();

        public C35266d() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_auto_release_flutter_engine_group, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: or.g$f */
    public static final class C77033f extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C77033f f225044d = new C77033f();

        public C77033f() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf(C76577a.m92165p(MMApplicationContext.getContext()));
        }
    }

    /* renamed from: or.g$b */
    public static final class C89283b implements FlutterCgiService {

        /* renamed from: a */
        public FlutterCgiService.Callback f257200a;

        /* renamed from: b */
        public final /* synthetic */ C117883g f257201b;

        @C91590f(mo125468c = "com.tencent.mm.feature.flutter.FlutterEngineService$cgiService$1$sendAsync$1", mo125469f = "FlutterEngineService.kt", mo125470l = {80}, mo125471m = "invokeSuspend")
        /* renamed from: or.g$b$a */
        public static final class C89284a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public long f257202d;

            /* renamed from: e */
            public int f257203e;

            /* renamed from: f */
            public final /* synthetic */ C117883g f257204f;

            /* renamed from: g */
            public final /* synthetic */ long f257205g;

            /* renamed from: h */
            public final /* synthetic */ long f257206h;

            /* renamed from: i */
            public final /* synthetic */ String f257207i;

            /* renamed from: j */
            public final /* synthetic */ byte[] f257208j;

            /* renamed from: n */
            public final /* synthetic */ boolean f257209n;

            /* renamed from: o */
            public final /* synthetic */ long f257210o;

            /* renamed from: p */
            public final /* synthetic */ C89283b f257211p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89284a(C117883g gVar, long j, long j2, String str, byte[] bArr, boolean z, long j3, C89283b bVar, C15601d<? super C89284a> dVar) {
                super(2, dVar);
                this.f257204f = gVar;
                this.f257205g = j;
                this.f257206h = j2;
                this.f257207i = str;
                this.f257208j = bArr;
                this.f257209n = z;
                this.f257210o = j3;
                this.f257211p = bVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C89284a(this.f257204f, this.f257205g, this.f257206h, this.f257207i, this.f257208j, this.f257209n, this.f257210o, this.f257211p, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C89284a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                long j;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f257203e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    String str = this.f257204f.f352403d;
                    Log.m105924i(str, "sendAsync: start " + this.f257205g);
                    FlutterCgiPigeon.FlutterCgiRequest.Builder funcId = new FlutterCgiPigeon.FlutterCgiRequest.Builder().setFuncId(new Long(this.f257206h));
                    String str2 = this.f257207i;
                    C87412m.m108591d(str2);
                    FlutterCgiPigeon.FlutterCgiRequest.Builder uri = funcId.setUri(str2);
                    byte[] bArr = this.f257208j;
                    C87412m.m108591d(bArr);
                    FlutterCgiPigeon.FlutterCgiRequest build = uri.setData(bArr).setLongPolling(Boolean.valueOf(this.f257209n)).setLongPollingTimeout(new Long(this.f257210o)).build();
                    C87412m.m108593f(build, "Builder()\n              …                 .build()");
                    C90453g1.C90454a aVar2 = new C90453g1.C90454a(build);
                    this.f257202d = currentTimeMillis;
                    this.f257203e = 1;
                    obj = aVar2.mo124625k(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    j = currentTimeMillis;
                } else if (i == 1) {
                    j = this.f257202d;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception unused) {
                        FlutterCgiService.Callback callback = this.f257211p.f257200a;
                        if (callback != null) {
                            callback.onSendComplete(this.f257205g, 3, -1, (byte[]) null);
                        }
                        return C13598b0.f38549a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FlutterCgiPigeon.FlutterCgiResponse flutterCgiResponse = (FlutterCgiPigeon.FlutterCgiResponse) obj;
                String str3 = this.f257204f.f352403d;
                Log.m105924i(str3, "sendAsync: end " + this.f257205g + ", cost:" + (System.currentTimeMillis() - j));
                FlutterCgiService.Callback callback2 = this.f257211p.f257200a;
                if (callback2 != null) {
                    long j2 = this.f257205g;
                    Long errorType = flutterCgiResponse.getErrorType();
                    C87412m.m108593f(errorType, "response.errorType");
                    long longValue = errorType.longValue();
                    Long errorCode = flutterCgiResponse.getErrorCode();
                    C87412m.m108593f(errorCode, "response.errorCode");
                    callback2.onSendComplete(j2, longValue, errorCode.longValue(), flutterCgiResponse.getData());
                }
                return C13598b0.f38549a;
            }
        }

        public C89283b(C117883g gVar) {
            this.f257201b = gVar;
        }

        public void sendAsync(long j, long j2, String str, byte[] bArr, boolean z, long j3) {
            C117883g gVar = this.f257201b;
            C53895h.m60466d(gVar.f352404e, C53872d1.f151119c, (C53934p0) null, new C89284a(gVar, j, j2, str, bArr, z, j3, this, (C15601d<? super C89284a>) null), 2, (Object) null);
        }

        public void setCallback(FlutterCgiService.Callback callback) {
            String str = this.f257201b.f352403d;
            Log.m105924i(str, "setCallback: " + callback);
            this.f257200a = callback;
        }
    }

    /* renamed from: or.g$e */
    public static final class C89285e implements FlutterMmdataReport {
        public void idKeyReport(long j, long j2, long j3) {
            C117407d.INSTANCE.idkeyStat(j, j2, j3, false);
        }

        public void kvReport(long j, String str) {
            C117407d.INSTANCE.kvStat((int) j, str);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.flutter.FlutterEngineService$awaitSharedEngineGroup$2", mo125469f = "FlutterEngineService.kt", mo125470l = {110}, mo125471m = "invokeSuspend")
    /* renamed from: or.g$a */
    public static final class C117884a extends C91594j implements C32226l<C15601d<? super C112713c>, Object> {

        /* renamed from: d */
        public int f352411d;

        /* renamed from: e */
        public final /* synthetic */ C117883g f352412e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117884a(C117883g gVar, C15601d<? super C117884a> dVar) {
            super(1, dVar);
            this.f352412e = gVar;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C117884a(this.f352412e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C117884a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f352411d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C117883g gVar = this.f352412e;
                gVar.getClass();
                C117889j jVar = new C117889j(gVar);
                try {
                    C79760s.m96908a("launchInitEngineGroup");
                    jVar.invoke();
                    C79760s.m96909b();
                    C53973z1 z1Var = this.f352412e.f352406g;
                    if (z1Var != null) {
                        this.f352411d = 1;
                        if (z1Var.mo74521O(this) == aVar) {
                            return aVar;
                        }
                    }
                } catch (Throwable th) {
                    C79760s.m96909b();
                    throw th;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C112713c cVar = this.f352412e.f352405f;
            C87412m.m108591d(cVar);
            return cVar;
        }
    }

    public C117883g() {
        C36568h.m40985a(C35266d.f94505d);
        this.f352408i = C35265c.f94504a;
        this.f352409j = new C89285e();
        this.f352410n = new C89283b(this);
    }

    /* renamed from: CL */
    public String[] mo161652CL() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_flutter_bind_cpu_cores, true);
        String[] strArr = new String[2];
        strArr[0] = FlutterShellArgs.ARG_VERBOSE_LOGGING;
        strArr[1] = wf ? FlutterShellArgs.ARG_BIND_CPU_CORES : null;
        Object[] array = C110823p.m151010z(strArr).toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public Object Tw0(C15601d<? super C112713c> dVar) {
        return C113204t.m154919a("awaitSharedEngineGroup", new C117884a(this, (C15601d<? super C117884a>) null), dVar);
    }

    /* renamed from: bC */
    public void mo161654bC() {
        C117889j jVar = new C117889j(this);
        try {
            C79760s.m96908a("launchInitEngineGroup");
            jVar.invoke();
        } finally {
            C79760s.m96909b();
        }
    }

    public boolean bf0() {
        return this.f352405f != null;
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        C88957l.m111078n("mm_foundation");
        this.f352407h = new ZidlFoundationApiManagerCaller();
        C112717f fVar = C112717f.f337490a;
        C112717f.f337491b = new C116900d();
        C112717f.f337492c = C77033f.f225044d;
        ZidlFoundationApiManagerCaller zidlFoundationApiManagerCaller = this.f352407h;
        if (zidlFoundationApiManagerCaller != null) {
            zidlFoundationApiManagerCaller.setPropFlutterExptService(this.f352408i);
            ZidlFoundationApiManagerCaller zidlFoundationApiManagerCaller2 = this.f352407h;
            if (zidlFoundationApiManagerCaller2 != null) {
                zidlFoundationApiManagerCaller2.setPropFlutterMmdataReport(this.f352409j);
                ZidlFoundationApiManagerCaller zidlFoundationApiManagerCaller3 = this.f352407h;
                if (zidlFoundationApiManagerCaller3 != null) {
                    zidlFoundationApiManagerCaller3.setPropFlutterCgiService(this.f352410n);
                } else {
                    C87412m.m108603p("caller");
                    throw null;
                }
            } else {
                C87412m.m108603p("caller");
                throw null;
            }
        } else {
            C87412m.m108603p("caller");
            throw null;
        }
    }
}
