package wt1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintEntranceUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import vt1.C78473a;

/* renamed from: wt1.t */
public class C78705t implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintEntranceUI f230413d;

    public C78705t(FingerPrintEntranceUI fingerPrintEntranceUI) {
        this.f230413d = fingerPrintEntranceUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FingerPrintEntranceUI", "user click the button to set system fingerprint");
        FingerPrintEntranceUI fingerPrintEntranceUI = this.f230413d;
        int i2 = FingerPrintEntranceUI.f198212d;
        fingerPrintEntranceUI.getClass();
        ((C78473a) C86709a0.m107533q(C78473a.class)).Il0(fingerPrintEntranceUI);
        this.f230413d.finish();
    }
}
