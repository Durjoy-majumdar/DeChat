package wt1;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;

/* renamed from: wt1.m */
public class C78694m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f230397d;

    /* renamed from: e */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230398e;

    public C78694m(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI, CheckBox checkBox) {
        this.f230398e = fingerPrintAuthTransparentUI;
        this.f230397d = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        FingerPrintAuthTransparentUI.m81239I7(this.f230398e, this.f230397d.isChecked());
    }
}
