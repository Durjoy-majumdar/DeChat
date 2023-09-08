package zq0;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zq0.y0 */
public final class C91928y0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91897m0 f263190d;

    public C91928y0(C91897m0 m0Var) {
        this.f263190d = m0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Log.m105920e("MicroMsg.PhoneNumberVerifyCodeDialog", "verify code is error, do send the right code");
        C91897m0.m115413d(this.f263190d);
    }
}
