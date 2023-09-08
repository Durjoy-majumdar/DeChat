package p634or;

import a14.C0000n0;
import a14.C53973z1;
import android.content.Context;
import bp3.C113204t;
import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.feature.flutter.FlutterEngineService$launchInitEngineGroup$1$1", mo125469f = "FlutterEngineService.kt", mo125470l = {127, 128}, mo125471m = "invokeSuspend")
/* renamed from: or.i */
public final class C117888i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f352419d;

    /* renamed from: e */
    public final /* synthetic */ C117883g f352420e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117888i(C117883g gVar, C15601d<? super C117888i> dVar) {
        super(2, dVar);
        this.f352420e = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C117888i(this.f352420e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C117888i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f352419d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53973z1 d = CachedFlutterEngines.f346097a.mo175366d();
            this.f352419d = 1;
            if (d.mo74521O(this) == aVar) {
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
        C117883g gVar = this.f352420e;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f352419d = 2;
        gVar.getClass();
        Object a = C113204t.m154919a("initEngineGroup", new C117885h(gVar, context, (C15601d<? super C117885h>) null), this);
        if (a != aVar) {
            a = C13598b0.f38549a;
        }
        if (a == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
