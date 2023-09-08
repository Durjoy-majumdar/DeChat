package wt1;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthUI;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import yq3.C79143a;

/* renamed from: wt1.r */
public class C78703r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f230409d;

    /* renamed from: e */
    public final /* synthetic */ FingerPrintAuthUI f230410e;

    public C78703r(FingerPrintAuthUI fingerPrintAuthUI, int i) {
        this.f230410e = fingerPrintAuthUI;
        this.f230409d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C79143a.m95764c(this.f230410e, new Bundle(), this.f230409d);
        C75228t.m90219L(this.f230410e, "https://kf.qq.com/touch/sappfaq/210406zmIFbI210406FFnEnI.html", true);
    }
}
