package zq0;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C90427mv;

/* renamed from: zq0.x0 */
public final class C91926x0 extends C87413o implements C32226l<C90427mv, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f263186d;

    /* renamed from: e */
    public final /* synthetic */ C91897m0 f263187e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91926x0(ProgressDialog progressDialog, C91897m0 m0Var) {
        super(1);
        this.f263186d = progressDialog;
        this.f263187e = m0Var;
    }

    public Object invoke(Object obj) {
        C90427mv mvVar = (C90427mv) obj;
        this.f263186d.dismiss();
        if (mvVar == null) {
            Log.m105920e("MicroMsg.PhoneNumberVerifyCodeDialog", "getPhoneNumber checkVerifyCode cgi fail");
            C91897m0.m115410a(this.f263187e, "checkVerifyCode cgi fail");
            C91891k0 k0Var = this.f263187e.f263126c;
            if (k0Var != null) {
                Long valueOf = Long.valueOf(k0Var.f263116z);
                C87412m.m108591d(valueOf);
                k0Var.f263116z = valueOf.longValue() + 1;
            }
            MMHandlerThread.postToMainThread(new C91918v0(this.f263187e));
        } else {
            Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "checkVerifyCode success");
            MMHandlerThread.postToMainThread(new C91920w0(this.f263187e, mvVar));
        }
        return C13598b0.f38549a;
    }
}
