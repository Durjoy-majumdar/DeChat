package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: wt1.e */
public class C78663e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230362d;

    public C78663e(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230362d = fingerPrintAuthTransparentUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f230362d.finish();
        C75228t.m90219L(this.f230362d, "https://kf.qq.com/touch/sappfaq/210406zmIFbI210406FFnEnI.html", true);
    }
}
