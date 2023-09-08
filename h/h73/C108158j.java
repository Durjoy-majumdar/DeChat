package h73;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;

/* renamed from: h73.j */
public class C108158j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GestureGuardLogicUI f323883d;

    public C108158j(GestureGuardLogicUI gestureGuardLogicUI) {
        this.f323883d = gestureGuardLogicUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        GestureGuardLogicUI gestureGuardLogicUI = this.f323883d;
        gestureGuardLogicUI.onClick(gestureGuardLogicUI.f318303h[gestureGuardLogicUI.f318302g].f323889d);
    }
}
