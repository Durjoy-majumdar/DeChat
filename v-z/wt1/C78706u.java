package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintEntranceUI;

/* renamed from: wt1.u */
public class C78706u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintEntranceUI f230414d;

    public C78706u(FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f230414d = fingerPrintEntranceUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f230414d.finish();
    }
}
