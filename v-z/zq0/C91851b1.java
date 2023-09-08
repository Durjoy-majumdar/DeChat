package zq0;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zq0.b1 */
public final class C91851b1 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C91897m0 f262987d;

    public C91851b1(C91897m0 m0Var) {
        this.f262987d = m0Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "cancel to verify sms");
        this.f262987d.mo125731g();
        C91897m0 m0Var = this.f262987d;
        View view = m0Var.f263129f;
        if (view != null) {
            view.post(new C91930z0(m0Var));
        }
    }
}
