package wt1;

import android.view.View;
import com.tencent.p014mm.plugin.fingerprint.p842ui.FingerPrintAuthTransparentUI;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import qo3.C77390c0;

/* renamed from: wt1.b */
public class C78657b extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ FingerPrintAuthTransparentUI f230356g;

    public C78657b(FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI) {
        this.f230356g = fingerPrintAuthTransparentUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C77390c0 c0Var = this.f230356g.f198185e;
        if (c0Var != null) {
            c0Var.cancel();
        }
        this.f230356g.mo94926P7();
        this.f230356g.finish();
    }
}
