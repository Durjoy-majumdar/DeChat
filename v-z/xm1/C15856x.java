package xm1;

import a14.C0000n0;
import a14.C53965x0;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zm1.C16302f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$onCreate$1", mo125469f = "LiveEntranceFragmentViewCallback.kt", mo125470l = {1468}, mo125471m = "invokeSuspend")
/* renamed from: xm1.x */
public final class C15856x extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f42702d;

    /* renamed from: e */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f42703e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15856x(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, C15601d<? super C15856x> dVar) {
        super(2, dVar);
        this.f42703e = liveEntranceFragmentViewCallback;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15856x(this.f42703e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15856x) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f42702d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f42702d = 1;
            if (C53965x0.m60607b(50, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42703e;
        C16302f fVar = liveEntranceFragmentViewCallback.f15714m;
        if (fVar != null) {
            fVar.mo14789a(liveEntranceFragmentViewCallback.f15709h);
        }
        return C13598b0.f38549a;
    }
}
