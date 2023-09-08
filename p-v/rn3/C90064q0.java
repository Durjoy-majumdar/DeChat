package rn3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;

/* renamed from: rn3.q0 */
public class C90064q0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SendAppMessageWrapperUI f258731d;

    public C90064q0(SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f258731d = sendAppMessageWrapperUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SendAppMessageWrapperUI.m106275I7(this.f258731d);
    }
}
