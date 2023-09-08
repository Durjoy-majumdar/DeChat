package gq3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53965x0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$loadingTextUpdateTask$1", mo125469f = "ImageQueryViewModel.kt", mo125470l = {193, 194}, mo125471m = "invokeSuspend")
/* renamed from: gq3.o */
public final class C59645o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f170452d;

    /* renamed from: e */
    public final /* synthetic */ C59629h f170453e;

    @C91590f(mo125468c = "com.tencent.mm.view.page.ImageQueryViewModel$loadingTextUpdateTask$1$1", mo125469f = "ImageQueryViewModel.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: gq3.o$a */
    public static final class C59646a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C59629h f170454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59646a(C59629h hVar, C15601d<? super C59646a> dVar) {
            super(2, dVar);
            this.f170454d = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59646a(this.f170454d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59646a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQueryViewModel", "loadingTextUpdateTask >> go to update loading text");
            this.f170454d.f170409p.setValue(MMApplicationContext.getString(C0966R.string.m89));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59645o(C59629h hVar, C15601d<? super C59645o> dVar) {
        super(2, dVar);
        this.f170453e = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59645o(this.f170453e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59645o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f170452d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.ImageQueryViewModel", "loadingTextUpdateTask >> start to update loading text");
            this.f170452d = 1;
            if (C53965x0.m60607b(3000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C59646a aVar2 = new C59646a(this.f170453e, (C15601d<? super C59646a>) null);
        this.f170452d = 2;
        if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
