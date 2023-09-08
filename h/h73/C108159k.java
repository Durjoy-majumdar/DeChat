package h73;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;

/* renamed from: h73.k */
public class C108159k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GestureGuardLogicUI f323884d;

    public C108159k(GestureGuardLogicUI gestureGuardLogicUI) {
        this.f323884d = gestureGuardLogicUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        GestureGuardLogicUI gestureGuardLogicUI = this.f323884d;
        int i2 = GestureGuardLogicUI.f318298y;
        gestureGuardLogicUI.mo153208K7();
        this.f323884d.mo153212O7(0, 4, "user cancel when setting gesture");
    }
}
