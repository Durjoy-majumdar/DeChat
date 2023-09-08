package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintEntranceUI;

/* renamed from: wt1.w */
public class C78708w implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintEntranceUI f230416d;

    public C78708w(FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f230416d = fingerPrintEntranceUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f230416d.finish();
    }
}
