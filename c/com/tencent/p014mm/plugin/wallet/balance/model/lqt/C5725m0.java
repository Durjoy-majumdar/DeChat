package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71633i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.m0 */
public final class C5725m0 implements C71633i0.C71634a {

    /* renamed from: a */
    public final /* synthetic */ Activity f21749a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f21750b;

    public C5725m0(Activity activity, Dialog dialog) {
        this.f21749a = activity;
        this.f21750b = dialog;
    }

    public final void call(Object obj) {
        String message = obj instanceof Throwable ? ((Throwable) obj).getMessage() : obj instanceof String ? obj.toString() : this.f21749a.getString(C0966R.string.kxh);
        Dialog dialog = this.f21750b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Log.m105924i("LqtNativeUrlJumpHandler", "fetch detail failed: " + message);
        C76701a.makeText((Context) this.f21749a, (CharSequence) message, 1).show();
    }
}
