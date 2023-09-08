package og1;

import a14.C0000n0;
import a14.C53965x0;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer$runBubbleShow$1$1$1", mo125469f = "LinearBubbleAnimateContainer.kt", mo125470l = {127, 128}, mo125471m = "invokeSuspend")
/* renamed from: og1.g */
public final class C62013g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f176284d;

    /* renamed from: e */
    public final /* synthetic */ LinearBubbleAnimateContainer f176285e;

    /* renamed from: f */
    public final /* synthetic */ FrameBubbleContentLayout f176286f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62013g(LinearBubbleAnimateContainer linearBubbleAnimateContainer, FrameBubbleContentLayout frameBubbleContentLayout, C15601d<? super C62013g> dVar) {
        super(2, dVar);
        this.f176285e = linearBubbleAnimateContainer;
        this.f176286f = frameBubbleContentLayout;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C62013g(this.f176285e, this.f176286f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C62013g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f176284d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("LinearBubbleAnimateContainer", "runBubbleShow isNeedAnimateShow: " + this.f176285e.f159286h + " size = " + this.f176285e.f159282d.size() + " curContent = " + this.f176286f);
            this.f176285e.mo77559d(true, this.f176286f);
            LinearBubbleAnimateContainer linearBubbleAnimateContainer = this.f176285e;
            if (linearBubbleAnimateContainer.f159286h) {
                long j = linearBubbleAnimateContainer.f159282d.size() >= 1 ? 3000 : FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                this.f176284d = 1;
                if (C53965x0.m60607b(j, this) == aVar) {
                    return aVar;
                }
            }
            this.f176285e.f159283e.remove(this.f176286f);
            LinearBubbleAnimateContainer.m63732b(this.f176285e);
            return C13598b0.f38549a;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            this.f176285e.f159283e.remove(this.f176286f);
            LinearBubbleAnimateContainer.m63732b(this.f176285e);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FrameBubbleContentLayout frameBubbleContentLayout = this.f176286f;
        this.f176284d = 2;
        if (frameBubbleContentLayout.mo77545f(this) == aVar) {
            return aVar;
        }
        this.f176285e.f159283e.remove(this.f176286f);
        LinearBubbleAnimateContainer.m63732b(this.f176285e);
        return C13598b0.f38549a;
    }
}
