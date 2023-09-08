package rn3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.pluginsdk.model.C96790t0;

/* renamed from: rn3.l0 */
public class C90059l0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ Object f258720d;

    /* renamed from: e */
    public final /* synthetic */ SendAppMessageWrapperUI f258721e;

    public C90059l0(SendAppMessageWrapperUI sendAppMessageWrapperUI, Object obj) {
        this.f258721e = sendAppMessageWrapperUI;
        this.f258720d = obj;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C96790t0 t0Var = (C96790t0) this.f258720d;
        t0Var.f283549t = true;
        t0Var.interrupt();
        this.f258721e.setResult(-1);
        this.f258721e.finish();
    }
}
