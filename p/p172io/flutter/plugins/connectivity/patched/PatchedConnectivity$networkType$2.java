package p172io.flutter.plugins.connectivity.patched;

import a14.C0000n0;
import android.net.NetworkCapabilities;
import android.os.Build;
import fy3.C32227p;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo182094d2 = {"La14/n0;", "", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
@C91590f(mo125468c = "io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2", mo125469f = "PatchedConnectivity.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivity$networkType$2 */
public final class PatchedConnectivity$networkType$2 extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {
    public int label;
    public final /* synthetic */ PatchedConnectivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PatchedConnectivity$networkType$2(PatchedConnectivity patchedConnectivity, C15601d<? super PatchedConnectivity$networkType$2> dVar) {
        super(2, dVar);
        this.this$0 = patchedConnectivity;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new PatchedConnectivity$networkType$2(this.this$0, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super String> dVar) {
        return ((PatchedConnectivity$networkType$2) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    NetworkCapabilities networkCapabilities = this.this$0.getConnectivityManager().getNetworkCapabilities(this.this$0.getConnectivityManager().getActiveNetwork());
                    if (networkCapabilities == null) {
                        return "none";
                    }
                    if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                        return "wifi";
                    }
                    if (networkCapabilities.hasTransport(0)) {
                        return "mobile";
                    }
                } catch (Exception unused) {
                    return "none";
                }
            }
            return this.this$0.networkTypeLegacy();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
