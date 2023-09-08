package wu1;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import gy3.C8479f0;

/* renamed from: wu1.i */
public final class C66199i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType>> f190236d;

    /* renamed from: e */
    public final /* synthetic */ C111869f f190237e;

    /* renamed from: f */
    public final /* synthetic */ Boolean f190238f;

    public C66199i(C8479f0<VoIPFlutterPluginApi.Result<VoIPFlutterPluginApi.FLBoolType>> f0Var, C111869f fVar, Boolean bool) {
        this.f190236d = f0Var;
        this.f190237e = fVar;
        this.f190238f = bool;
    }

    public final void run() {
        VoIPFlutterPluginApi.Result result = (VoIPFlutterPluginApi.Result) this.f190236d.f27484d;
        if (result != null) {
            result.success(this.f190237e.mo163616c(this.f190238f));
        }
        this.f190236d.f27484d = null;
    }
}
