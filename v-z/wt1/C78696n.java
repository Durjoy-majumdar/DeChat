package wt1;

import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import vt1.C78474b;

/* renamed from: wt1.n */
public class C78696n implements C78474b {

    /* renamed from: d */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230400d;

    public C78696n(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230400d = fingerPrintAuthTransparentUI;
    }

    /* renamed from: n */
    public void mo94918n(int i, String str) {
        this.f230400d.mo94924N7(false);
        if (i == 0) {
            Log.m105924i("MicroMsg.FingerPrintAuthTransparentUI", "cert ready and do openFP");
            FingerPrintAuthTransparentUI.m81240J7(this.f230400d);
            this.f230400d.mo94923M7();
            return;
        }
        this.f230400d.mo94925O7(-1, str);
    }
}
