package ia0;

import a14.C0000n0;
import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import ha0.C108210m;
import ha0.C108221t;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$prepareMaas$result$1", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {120}, mo125471m = "invokeSuspend")
/* renamed from: ia0.f */
public final class C108450f extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public int f324756d;

    /* renamed from: e */
    public /* synthetic */ Object f324757e;

    /* renamed from: f */
    public final /* synthetic */ C108438c f324758f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108450f(C108438c cVar, C15601d<? super C108450f> dVar) {
        super(2, dVar);
        this.f324758f = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C108450f fVar = new C108450f(this.f324758f, dVar);
        fVar.f324757e = obj;
        return fVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108450f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f324756d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C108221t tVar = C108221t.f324032a;
            Context context = this.f324758f.f324700g;
            C87412m.m108593f(context, "context");
            this.f324757e = (C0000n0) this.f324757e;
            this.f324756d = 1;
            obj = tVar.mo158628h(context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C0000n0 n0Var = (C0000n0) this.f324757e;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SurfaceView surfaceView = (SurfaceView) obj;
        if (surfaceView == null) {
            Log.m105920e("MicroMsg.FinderTemplateCorePlugin", "createRenderSurface error");
            return Boolean.FALSE;
        }
        this.f324758f.f324698e.addView(surfaceView, new ViewGroup.LayoutParams(-1, -1));
        C108210m mVar = this.f324758f.f324699f;
        if (mVar != null) {
            mVar.f324011a.setRenderView(surfaceView);
        }
        return Boolean.TRUE;
    }
}
