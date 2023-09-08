package p172io.flutter.plugins.connectivity.patched;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.ResultKt;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo182094d2 = {"La14/n0;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1", mo125469f = "PatchedConnectivityPlugin.kt", mo125470l = {47}, mo125471m = "invokeSuspend")
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1 */
public final class PatchedConnectivityPlugin$onMethodCall$1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ MethodCall $call;
    public final /* synthetic */ MethodChannel.Result $result;
    public Object L$0;
    public int label;
    public final /* synthetic */ PatchedConnectivityPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PatchedConnectivityPlugin$onMethodCall$1(MethodCall methodCall, MethodChannel.Result result, PatchedConnectivityPlugin patchedConnectivityPlugin, C15601d<? super PatchedConnectivityPlugin$onMethodCall$1> dVar) {
        super(2, dVar);
        this.$call = methodCall;
        this.$result = result;
        this.this$0 = patchedConnectivityPlugin;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new PatchedConnectivityPlugin$onMethodCall$1(this.$call, this.$result, this.this$0, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C13598b0> dVar) {
        return ((PatchedConnectivityPlugin$onMethodCall$1) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        MethodChannel.Result result;
        MethodChannel.Result result2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (C87412m.m108589b(this.$call.method, "check")) {
                result2 = this.$result;
                PatchedConnectivity access$getConnectivity$p = this.this$0.connectivity;
                if (access$getConnectivity$p != null) {
                    this.L$0 = result2;
                    this.label = 1;
                    Object networkType = access$getConnectivity$p.networkType(this);
                    if (networkType == aVar) {
                        return aVar;
                    }
                    result = result2;
                    obj = networkType;
                }
                result = result2;
                str = "none";
                result.success(str);
                return C13598b0.f38549a;
            }
            this.$result.notImplemented();
            return C13598b0.f38549a;
        } else if (i == 1) {
            result = (MethodChannel.Result) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) obj;
        if (str == null) {
            result2 = result;
            result = result2;
            str = "none";
        }
        result.success(str);
        return C13598b0.f38549a;
    }
}
