package l52;

import a14.C0000n0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import o52.C61944e;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.magicbrush.scldemo.component.MagicBrushSclDemoUIC$start$1", mo125469f = "MagicBrushSclDemoUIC.kt", mo125470l = {85, 86}, mo125471m = "invokeSuspend")
/* renamed from: l52.e */
public final class C61228e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f174281d;

    /* renamed from: e */
    public final /* synthetic */ C61224d f174282e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61228e(C61224d dVar, C15601d<? super C61228e> dVar2) {
        super(2, dVar2);
        this.f174282e = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61228e(this.f174282e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61228e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f174281d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C61224d dVar = this.f174282e;
            C61944e eVar = dVar.f174276e;
            String c3 = ((C10463b) C39818r.f106831a.mo62444c(dVar.getActivity()).mo75002a(C10463b.class)).mo10776c3();
            this.f174281d = 1;
            if (eVar.mo86859e3(c3, this) == aVar) {
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
        C61224d dVar2 = this.f174282e;
        C61944e eVar2 = dVar2.f174276e;
        MagicBrushSclDemoView magicBrushSclDemoView = dVar2.f174275d;
        if (magicBrushSclDemoView != null) {
            this.f174281d = 2;
            if (eVar2.mo86857c3(magicBrushSclDemoView, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("frameSetView");
        throw null;
    }
}
