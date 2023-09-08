package ia0;

import a14.C0000n0;
import a14.C53930o0;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import ha0.C108210m;
import ha0.C108221t;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$setupJob$2$1", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {101, 107}, mo125471m = "invokeSuspend")
/* renamed from: ia0.g */
public final class C108451g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f324759d;

    /* renamed from: e */
    public int f324760e;

    /* renamed from: f */
    public /* synthetic */ Object f324761f;

    /* renamed from: g */
    public final /* synthetic */ C108438c f324762g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108451g(C108438c cVar, C15601d<? super C108451g> dVar) {
        super(2, dVar);
        this.f324762g = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C108451g gVar = new C108451g(this.f324762g, dVar);
        gVar.f324761f = obj;
        return gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108451g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        C108438c cVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f324760e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var2 = (C0000n0) this.f324761f;
            Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "setup outputInfo:" + this.f324762g.f324711u);
            cVar = this.f324762g;
            C108221t tVar = C108221t.f324032a;
            DimensionLevel dimensionLevel = cVar.f324711u.f324763a;
            this.f324761f = n0Var2;
            this.f324759d = cVar;
            this.f324760e = 1;
            Object e = tVar.mo158625e(dimensionLevel, this);
            if (e == aVar) {
                return aVar;
            }
            Object obj2 = e;
            n0Var = n0Var2;
            obj = obj2;
        } else if (i == 1) {
            cVar = (C108438c) this.f324759d;
            n0Var = (C0000n0) this.f324761f;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C108210m mVar = (C108210m) obj;
        if (mVar == null) {
            Log.m105920e("MicroMsg.FinderTemplateCorePlugin", "createCamFunSessionManager error");
            C53930o0.m60557d(n0Var, "createCamFunSessionManager error", (Throwable) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
        cVar.f324699f = mVar;
        Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "finished create createCamFunSessionManager");
        C108438c cVar2 = this.f324762g;
        this.f324761f = null;
        this.f324759d = null;
        this.f324760e = 2;
        if (C108438c.m146935a(cVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
