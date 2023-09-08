package zq0;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zq0.d1 */
public final class C91859d1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91897m0 f263004d;

    public C91859d1(C91897m0 m0Var) {
        this.f263004d = m0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.PhoneNumberVerifyCodeDialog", "cancel to verify sms");
        dialogInterface.dismiss();
        this.f263004d.mo125731g();
        C91897m0.m115410a(this.f263004d, "user cancel");
        C91897m0 m0Var = this.f263004d;
        View view = m0Var.f263129f;
        if (view != null) {
            view.post(new C91930z0(m0Var));
        }
    }
}
