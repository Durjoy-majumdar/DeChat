package p172io.flutter.plugins.connectivity.patched;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.Metadata;
import kotlin.ResultKt;
import p172io.flutter.plugin.common.EventChannel;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo182094d2 = {"La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1", mo125469f = "PatchedConnectivityBroadcastReceiver.kt", mo125470l = {66}, mo125471m = "invokeSuspend")
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1 */
public final class PatchedConnectivityBroadcastReceiver$sendEvent$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ PatchedConnectivityBroadcastReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PatchedConnectivityBroadcastReceiver$sendEvent$1(PatchedConnectivityBroadcastReceiver patchedConnectivityBroadcastReceiver, C15601d<? super PatchedConnectivityBroadcastReceiver$sendEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = patchedConnectivityBroadcastReceiver;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new PatchedConnectivityBroadcastReceiver$sendEvent$1(this.this$0, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((PatchedConnectivityBroadcastReceiver$sendEvent$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        EventChannel.EventSink eventSink;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventChannel.EventSink access$getEvents$p = this.this$0.events;
            if (access$getEvents$p != null) {
                PatchedConnectivity access$getConnectivity$p = this.this$0.connectivity;
                this.L$0 = access$getEvents$p;
                this.label = 1;
                Object networkType = access$getConnectivity$p.networkType(this);
                if (networkType == aVar) {
                    return aVar;
                }
                eventSink = access$getEvents$p;
                obj = networkType;
            }
            return C13598b0.f38549a;
        } else if (i == 1) {
            eventSink = (EventChannel.EventSink) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eventSink.success(obj);
        return C13598b0.f38549a;
    }
}
