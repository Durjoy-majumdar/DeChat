package wt1;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthUI;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;

/* renamed from: wt1.o */
public class C78698o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f230403d;

    /* renamed from: e */
    public final /* synthetic */ FingerPrintAuthUI f230404e;

    public C78698o(FingerPrintAuthUI fingerPrintAuthUI, boolean z) {
        this.f230404e = fingerPrintAuthUI;
        this.f230403d = z;
    }

    public void run() {
        if (this.f230403d) {
            FingerPrintAuthUI fingerPrintAuthUI = this.f230404e;
            fingerPrintAuthUI.f198200e = C75197d0.m90163d(fingerPrintAuthUI, false, false, (DialogInterface.OnCancelListener) null);
            return;
        }
        Dialog dialog = this.f230404e.f198200e;
        if (dialog != null && dialog.isShowing()) {
            this.f230404e.f198200e.dismiss();
            this.f230404e.f198200e = null;
        }
    }
}
