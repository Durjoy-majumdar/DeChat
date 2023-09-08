package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;

/* renamed from: wt1.f */
public class C78665f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230365d;

    public C78665f(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230365d = fingerPrintAuthTransparentUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f230365d.finish();
    }
}
