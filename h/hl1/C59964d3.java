package hl1;

import a14.C0000n0;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import fy3.C32227p;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorLivingUIC$onMount$2", mo125469f = "FinderLiveVisitorLivingUIC.kt", mo125470l = {3875}, mo125471m = "invokeSuspend")
/* renamed from: hl1.d3 */
public final class C59964d3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f171102d;

    /* renamed from: e */
    public final /* synthetic */ C59988k f171103e;

    /* renamed from: hl1.d3$a */
    public static final class C59965a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171104d;

        public C59965a(C59988k kVar) {
            this.f171104d = kVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Class cls = C54991o.class;
            String str = this.f171104d.f171222i;
            Log.m105924i(str, "value " + booleanValue + ", hasShown " + ((C54991o) this.f171104d.mo83051g(cls)).f154198F);
            if (booleanValue && !((C54991o) this.f171104d.mo83051g(cls)).f154198F) {
                AppCompatActivity appCompatActivity = this.f171104d.f166847e;
                C76912y0.m92765d(appCompatActivity, appCompatActivity.getResources().getString(C0966R.string.mem), C0966R.raw.icons_outlined_official_accounts);
                ((C54991o) this.f171104d.mo83051g(cls)).f154198F = true;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59964d3(C59988k kVar, C15601d<? super C59964d3> dVar) {
        super(2, dVar);
        this.f171103e = kVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59964d3(this.f171103e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C59964d3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f171102d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i(this.f171103e.f171222i, "iscollect");
            C58087u0<Boolean> u0Var = ((C54991o) this.f171103e.mo83051g(C54991o.class)).f154194E;
            C59965a aVar2 = new C59965a(this.f171103e);
            this.f171102d = 1;
            if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
