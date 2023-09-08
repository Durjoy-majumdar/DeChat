package tf0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.pigeon.FlutterCgiPigeon;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C101820nt3;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C90417ia;
import u14.C52418a;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z14.C53733a;

/* renamed from: tf0.g1 */
public final class C90453g1 implements FlutterCgiPigeon.FlutterCgiHost, FlutterPlugin {

    /* renamed from: d */
    public C0000n0 f259973d;

    /* renamed from: tf0.g1$b */
    public static final class C52333b extends C101820nt3 {

        /* renamed from: d */
        public final byte[] f146305d;

        public C52333b(byte[] bArr) {
            C87412m.m108594g(bArr, "rawData");
            this.f146305d = bArr;
        }

        /* renamed from: op */
        public int mo24180op(int i, Object... objArr) {
            C87412m.m108594g(objArr, "objs");
            if (i != 1) {
                return super.mo24180op(i, Arrays.copyOf(objArr, objArr.length));
            }
            int i2 = 0;
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar.computeSize());
            }
            return i2 + this.f146305d.length;
        }

        public byte[] toByteArray() {
            int i;
            validate();
            byte[] bArr = new byte[computeSize()];
            C53733a aVar = new C53733a(bArr);
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
                i = C52418a.m58682i(1, this.BaseRequest.computeSize());
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f146305d;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return bArr;
        }
    }

    /* renamed from: tf0.g1$c */
    public static final class C52334c extends C49335eu3 {

        /* renamed from: d */
        public byte[] f146306d = new byte[0];

        public C52334c() {
            this.BaseResponse = new C49966ja();
        }

        /* renamed from: op */
        public int mo24180op(int i, Object... objArr) {
            C87412m.m108594g(objArr, "objs");
            if (i != 1) {
                return super.mo24180op(i, Arrays.copyOf(objArr, objArr.length));
            }
            int i2 = 0;
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar.computeSize());
            }
            return i2 + this.f146306d.length;
        }

        public C47465a parseFrom(byte[] bArr) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            this.f146306d = bArr;
            return this;
        }

        public byte[] toByteArray() {
            int i;
            validate();
            byte[] bArr = new byte[computeSize()];
            C53733a aVar = new C53733a(bArr);
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
                i = C52418a.m58682i(1, this.BaseResponse.computeSize());
            } else {
                i = 0;
            }
            byte[] bArr2 = this.f146306d;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return bArr;
        }
    }

    /* renamed from: tf0.g1$a */
    public static final class C90454a extends C89132b<C49335eu3> {

        /* renamed from: tf0.g1$a$a */
        public static final class C90455a extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C89059e<C13598b0> f259974d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C90455a(C89059e<C13598b0> eVar) {
                super(1);
                this.f259974d = eVar;
            }

            public Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                this.f259974d.dead();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: tf0.g1$a$b */
        public static final class C90456b<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ C53916l<FlutterCgiPigeon.FlutterCgiResponse> f259975a;

            public C90456b(C53916l<? super FlutterCgiPigeon.FlutterCgiResponse> lVar) {
                this.f259975a = lVar;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                FlutterCgiPigeon.FlutterCgiResponse build = new FlutterCgiPigeon.FlutterCgiResponse.Builder().setErrorCode(Long.valueOf((long) cVar.f256794b)).setErrorType(Long.valueOf((long) cVar.f256793a)).setData(cVar.f256796d.toByteArray()).build();
                C87412m.m108593f(build, "Builder()\n              …                 .build()");
                cVar.f256798f.dead();
                this.f259975a.resumeWith(Result.m168114constructorimpl(build));
                return C13598b0.f38549a;
            }
        }

        public C90454a(FlutterCgiPigeon.FlutterCgiRequest flutterCgiRequest) {
            C87412m.m108594g(flutterCgiRequest, "flutterRequest");
            C47350c.C47352b bVar = new C47350c.C47352b();
            byte[] data = flutterCgiRequest.getData();
            C87412m.m108593f(data, "flutterRequest.data");
            bVar.f127066a = new C52333b(data);
            bVar.f127067b = new C52334c();
            bVar.f127069d = (int) flutterCgiRequest.getFuncId().longValue();
            bVar.f127068c = flutterCgiRequest.getUri();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            mo123453j(bVar.mo72403a());
        }

        /* renamed from: k */
        public final Object mo124625k(C15601d<? super FlutterCgiPigeon.FlutterCgiResponse> dVar) {
            C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
            mVar.mo74609p();
            C89059e i = mo9225i();
            i.mo123420E(new C90456b(mVar));
            mVar.mo74599v(new C90455a(i));
            return mVar.mo74608o();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.FlutterCgiPlugin$send$1", mo125469f = "FlutterCgiPlugin.kt", mo125470l = {36, 38, 43}, mo125471m = "invokeSuspend")
    /* renamed from: tf0.g1$d */
    public static final class C90457d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f259976d;

        /* renamed from: e */
        public final /* synthetic */ FlutterCgiPigeon.FlutterCgiRequest f259977e;

        /* renamed from: f */
        public final /* synthetic */ FlutterCgiPigeon.Result<FlutterCgiPigeon.FlutterCgiResponse> f259978f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.FlutterCgiPlugin$send$1$1", mo125469f = "FlutterCgiPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: tf0.g1$d$a */
        public static final class C90458a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FlutterCgiPigeon.Result<FlutterCgiPigeon.FlutterCgiResponse> f259979d;

            /* renamed from: e */
            public final /* synthetic */ FlutterCgiPigeon.FlutterCgiResponse f259980e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C90458a(FlutterCgiPigeon.Result<FlutterCgiPigeon.FlutterCgiResponse> result, FlutterCgiPigeon.FlutterCgiResponse flutterCgiResponse, C15601d<? super C90458a> dVar) {
                super(2, dVar);
                this.f259979d = result;
                this.f259980e = flutterCgiResponse;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C90458a(this.f259979d, this.f259980e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C90458a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f259979d.success(this.f259980e);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.FlutterCgiPlugin$send$1$response$1", mo125469f = "FlutterCgiPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: tf0.g1$d$b */
        public static final class C90459b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ FlutterCgiPigeon.Result<FlutterCgiPigeon.FlutterCgiResponse> f259981d;

            /* renamed from: e */
            public final /* synthetic */ Exception f259982e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C90459b(FlutterCgiPigeon.Result<FlutterCgiPigeon.FlutterCgiResponse> result, Exception exc, C15601d<? super C90459b> dVar) {
                super(2, dVar);
                this.f259981d = result;
                this.f259982e = exc;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C90459b(this.f259981d, this.f259982e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C90459b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f259981d.error(this.f259982e);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C90457d(FlutterCgiPigeon.FlutterCgiRequest flutterCgiRequest, FlutterCgiPigeon.Result<FlutterCgiPigeon.FlutterCgiResponse> result, C15601d<? super C90457d> dVar) {
            super(2, dVar);
            this.f259977e = flutterCgiRequest;
            this.f259978f = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C90457d(this.f259977e, this.f259978f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C90457d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f259976d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C90454a aVar2 = new C90454a(this.f259977e);
                this.f259976d = 1;
                obj = aVar2.mo124625k(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C90459b bVar = new C90459b(this.f259978f, e, (C15601d<? super C90459b>) null);
                    this.f259976d = 2;
                    if (C53895h.m60469g(k2Var, bVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlutterCgiPigeon.FlutterCgiResponse flutterCgiResponse = (FlutterCgiPigeon.FlutterCgiResponse) obj;
            C53896h0 h0Var2 = C53872d1.f151117a;
            C53915k2 k2Var2 = C58901s.f168555a;
            C90458a aVar3 = new C90458a(this.f259978f, flutterCgiResponse, (C15601d<? super C90458a>) null);
            this.f259976d = 3;
            if (C53895h.m60469g(k2Var2, aVar3, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    public C90453g1() {
        C0000n0 b = C53930o0.m60555b();
        C53930o0.m60556c(b, (CancellationException) null);
        this.f259973d = b;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f259973d = C53930o0.m60555b();
        FlutterCgiPigeon.FlutterCgiHost.CC.m106479c(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C53930o0.m60558e(this.f259973d, (CancellationException) null, 1, (Object) null);
    }

    public void send(FlutterCgiPigeon.FlutterCgiRequest flutterCgiRequest, FlutterCgiPigeon.Result<FlutterCgiPigeon.FlutterCgiResponse> result) {
        C87412m.m108594g(flutterCgiRequest, "flutterRequest");
        C87412m.m108594g(result, "result");
        C53895h.m60466d(this.f259973d, C53872d1.f151119c, (C53934p0) null, new C90457d(flutterCgiRequest, result, (C15601d<? super C90457d>) null), 2, (Object) null);
    }
}
