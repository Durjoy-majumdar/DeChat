package p157gk;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import ja3.C60786a;
import java.nio.Buffer;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyOcrReq$2", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {485}, mo125471m = "invokeSuspend")
/* renamed from: gk.o */
public final class C59499o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f170021d;

    /* renamed from: e */
    public final /* synthetic */ Buffer f170022e;

    /* renamed from: f */
    public final /* synthetic */ int f170023f;

    /* renamed from: g */
    public final /* synthetic */ int f170024g;

    /* renamed from: h */
    public final /* synthetic */ QueryImageData f170025h;

    @C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore$applyOcrReq$2$1", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {487}, mo125471m = "invokeSuspend")
    /* renamed from: gk.o$a */
    public static final class C59500a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f170026d;

        /* renamed from: e */
        public final /* synthetic */ QueryImageData f170027e;

        /* renamed from: f */
        public final /* synthetic */ String f170028f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59500a(QueryImageData queryImageData, String str, C15601d<? super C59500a> dVar) {
            super(2, dVar);
            this.f170027e = queryImageData;
            this.f170028f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59500a(this.f170027e, this.f170028f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59500a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f170026d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.ImageQuerySDKCore", "applyOcrReq >> withContext");
                C59503r rVar = C59503r.f170040a;
                QueryImageData queryImageData = this.f170027e;
                String str = this.f170028f;
                if (str == null) {
                    str = "";
                }
                this.f170026d = 1;
                if (C59503r.m69407c(rVar, queryImageData, str, this) == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59499o(Buffer buffer, int i, int i2, QueryImageData queryImageData, C15601d<? super C59499o> dVar) {
        super(2, dVar);
        this.f170022e = buffer;
        this.f170023f = i;
        this.f170024g = i2;
        this.f170025h = queryImageData;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59499o(this.f170022e, this.f170023f, this.f170024g, this.f170025h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59499o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170021d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", ocr start");
            C60786a aVar2 = C59503r.f170042c;
            String a = aVar2 != null ? aVar2.mo85718a(this.f170022e, this.f170023f, this.f170024g) : null;
            Log.m105918d("MicroMsg.ImageQuerySDKCore", Thread.currentThread().getName() + ", ocr result: " + a);
            Log.m105924i("MicroMsg.ImageQuerySDKCore", "ocr result is return");
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C59500a aVar3 = new C59500a(this.f170025h, a, (C15601d<? super C59500a>) null);
            this.f170021d = 1;
            if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
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
