package androidx.window.java.layout;

import a14.C0000n0;
import d14.C45252f;
import fy3.C32227p;
import kotlin.Metadata;
import kotlin.ResultKt;
import p329d3.C86165a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo182094d2 = {"T", "La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 5, 1})
@C91590f(mo125468c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", mo125469f = "WindowInfoTrackerCallbackAdapter.kt", mo125470l = {96}, mo125471m = "invokeSuspend")
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ C86165a<T> $consumer;
    public final /* synthetic */ C45252f<T> $flow;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(C45252f<? extends T> fVar, C86165a<T> aVar, C15601d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = fVar;
        this.$consumer = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<T> fVar = this.$flow;
            C103854x3e71c403 windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new C103854x3e71c403(this.$consumer);
            this.label = 1;
            if (fVar.mo31880a(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
