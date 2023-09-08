package wg1;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32227p;
import ig1.C8916d;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAllowanceGiftBubblePresenter$onVisitorClick$2", mo125469f = "FinderLiveAllowanceGiftBubblePresenter.kt", mo125470l = {160}, mo125471m = "invokeSuspend")
/* renamed from: wg1.d */
public final class C15263d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41507d;

    /* renamed from: e */
    public final /* synthetic */ C15300h f41508e;

    /* renamed from: f */
    public final /* synthetic */ C8916d f41509f;

    /* renamed from: g */
    public final /* synthetic */ String f41510g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15263d(C15300h hVar, C8916d dVar, String str, C15601d<? super C15263d> dVar2) {
        super(2, dVar2);
        this.f41508e = hVar;
        this.f41509f = dVar;
        this.f41510g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15263d(this.f41508e, this.f41509f, this.f41510g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15263d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41507d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f41507d = 1;
            if (C53965x0.m60607b(1250, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15300h hVar = this.f41508e;
        C8916d dVar = this.f41509f;
        String str = null;
        C15300h.m14312e(hVar, dVar != null ? dVar.field_rewardProductId : null, 1, this.f41510g);
        C15300h hVar2 = this.f41508e;
        C8916d dVar2 = this.f41509f;
        if (dVar2 != null) {
            str = dVar2.field_rewardProductId;
        }
        C15300h.m14313n(hVar2, str, this.f41510g, 1);
        return C13598b0.f38549a;
    }
}
