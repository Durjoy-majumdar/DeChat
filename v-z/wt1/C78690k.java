package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;

/* renamed from: wt1.k */
public class C78690k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230393d;

    public C78690k(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230393d = fingerPrintAuthTransparentUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        FingerPrintAuthTransparentUI.m81239I7(this.f230393d, false);
    }
}
