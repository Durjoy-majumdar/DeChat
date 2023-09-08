package rn3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;

/* renamed from: rn3.o0 */
public class C90062o0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SendAppMessageWrapperUI f258728d;

    public C90062o0(SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f258728d = sendAppMessageWrapperUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SendAppMessageWrapperUI.m106275I7(this.f258728d);
    }
}
