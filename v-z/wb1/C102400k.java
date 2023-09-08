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

@C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCdnUploadServiceFSC$startCdnTask$2", mo125469f = "FavCdnUploadServiceFSC.kt", mo125470l = {103, 106}, mo125471m = "invokeSuspend")
/* renamed from: wb1.k */
public final class C102400k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f301591d;

    /* renamed from: e */
    public /* synthetic */ Object f301592e;

    /* renamed from: f */
    public final /* synthetic */ C58097y0<C92798v> f301593f;

    /* renamed from: g */
    public final /* synthetic */ C102396i f301594g;

    /* renamed from: h */
    public final /* synthetic */ C100746u f301595h;

    /* renamed from: wb1.k$a */
    public static final class C102401a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C102396i f301596d;

        /* renamed from: e */
        public final /* synthetic */ C100746u f301597e;

        public C102401a(C102396i iVar, C100746u uVar) {
            this.f301596d = iVar;
            this.f301597e = uVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            C102396i iVar = this.f301596d;
            String str = this.f301597e.field_dataId;
            C87412m.m108593f(str, "cdnInfo.field_dataId");
            Object o3 = C102396i.m135123o3(iVar, str, (C92798v) obj, dVar);
            return o3 == C15911a.COROUTINE_SUSPENDED ? o3 : C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102400k(C58097y0<C92798v> y0Var, C102396i iVar, C100746u uVar, C15601d<? super C102400k> dVar) {
        super(2, dVar);
        this.f301593f = y0Var;
        this.f301594g = iVar;
        this.f301595h = uVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C102400k kVar = new C102400k(this.f301593f, this.f301594g, this.f301595h, dVar);
        kVar.f301592e = obj;
        return kVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102400k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f301591d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f301592e;
            C58097y0<C92798v> y0Var = this.f301593f;
            if (y0Var != null) {
                C102401a aVar2 = new C102401a(this.f301594g, this.f301595h);
                this.f301591d = 1;
                if (y0Var.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                C102396i iVar = this.f301594g;
                C100746u uVar = this.f301595h;
                FlowController F3 = iVar.mo141978F3();
                String str = uVar.field_dataId;
                C87412m.m108593f(str, "cdnInfo.field_dataId");
                this.f301591d = 2;
                obj = F3.outFlow(str, this);
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
