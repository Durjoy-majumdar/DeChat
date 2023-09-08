package wb1;

import a14.C0000n0;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import d14.C45253g;
import d14.C58097y0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import pb1.C100746u;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCdnDownloadServiceFSC$startCdnTask$1", mo125469f = "FavCdnDownloadServiceFSC.kt", mo125470l = {104, 108}, mo125471m = "invokeSuspend")
/* renamed from: wb1.f */
public final class C102392f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f301568d;

    /* renamed from: e */
    public /* synthetic */ Object f301569e;

    /* renamed from: f */
    public final /* synthetic */ C58097y0<C92798v> f301570f;

    /* renamed from: g */
    public final /* synthetic */ C102386c f301571g;

    /* renamed from: h */
    public final /* synthetic */ C100746u f301572h;

    /* renamed from: wb1.f$a */
    public static final class C102393a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C102386c f301573d;

        /* renamed from: e */
        public final /* synthetic */ C100746u f301574e;

        public C102393a(C102386c cVar, C100746u uVar) {
            this.f301573d = cVar;
            this.f301574e = uVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            C102386c cVar = this.f301573d;
            String str = this.f301574e.field_dataId;
            C87412m.m108593f(str, "cdnInfo.field_dataId");
            Object o3 = C102386c.m135115o3(cVar, str, (C92798v) obj, dVar);
            return o3 == C15911a.COROUTINE_SUSPENDED ? o3 : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102392f(C58097y0<C92798v> y0Var, C102386c cVar, C100746u uVar, C15601d<? super C102392f> dVar) {
        super(2, dVar);
        this.f301570f = y0Var;
        this.f301571g = cVar;
        this.f301572h = uVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C102392f fVar = new C102392f(this.f301570f, this.f301571g, this.f301572h, dVar);
        fVar.f301569e = obj;
        return fVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102392f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f301568d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f301569e;
            C58097y0<C92798v> y0Var = this.f301570f;
            if (y0Var != null) {
                C102393a aVar2 = new C102393a(this.f301571g, this.f301572h);
                this.f301568d = 1;
                if (y0Var.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                C102386c cVar = this.f301571g;
                C100746u uVar = this.f301572h;
                FlowController G3 = cVar.mo141976G3();
                String str = uVar.field_dataId;
                C87412m.m108593f(str, "cdnInfo.field_dataId");
                this.f301568d = 2;
                obj = G3.outFlow(str, this);
                if (obj == aVar) {
                    return aVar;
                }
                ((Number) obj).longValue();
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            ((Number) obj).longValue();
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw new C13600d();
    }
}
