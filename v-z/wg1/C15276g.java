package wg1;

import a14.C0000n0;
import a14.C53965x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.component.FinderLiveAllowanceGiftBubblePresenter$updateBubbleInfo$visitor$2$1", mo125469f = "FinderLiveAllowanceGiftBubblePresenter.kt", mo125470l = {89}, mo125471m = "invokeSuspend")
/* renamed from: wg1.g */
public final class C15276g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f41541d;

    /* renamed from: e */
    public final /* synthetic */ long f41542e;

    /* renamed from: f */
    public final /* synthetic */ C15300h f41543f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15276g(long j, C15300h hVar, C15601d<? super C15276g> dVar) {
        super(2, dVar);
        this.f41542e = j;
        this.f41543f = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15276g(this.f41542e, this.f41543f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15276g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f41541d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.f41542e;
            this.f41541d = 1;
            if (C53965x0.m60607b(j, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("FinderLiveAllowanceGiftBubblePresenter", "#updateBubbleInfo iconTickerJpb time to hide.");
        C15256b bVar = this.f41543f.f41602j;
        if (bVar != null) {
            bVar.mo14158s0();
        }
        return C13598b0.f38549a;
    }
}
