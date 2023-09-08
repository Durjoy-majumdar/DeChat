package h73;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import g73.C107761f;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p910lj.C76701a;

/* renamed from: h73.a */
public class C108149a implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ List f323869d;

    /* renamed from: e */
    public final /* synthetic */ GestureGuardLogicUI f323870e;

    public C108149a(GestureGuardLogicUI gestureGuardLogicUI, List list) {
        this.f323870e = gestureGuardLogicUI;
        this.f323869d = list;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (i2 == 0) {
            GestureGuardLogicUI gestureGuardLogicUI = this.f323870e;
            gestureGuardLogicUI.f318307o = false;
            gestureGuardLogicUI.f318308p = 0;
            C107761f.m145989f();
            C107761f.m145987d();
            C107761f.m145988e();
            GestureGuardLogicUI gestureGuardLogicUI2 = this.f323870e;
            gestureGuardLogicUI2.f318306n = this.f323869d;
            gestureGuardLogicUI2.f318301f = 1;
            gestureGuardLogicUI2.mo153210M7();
        } else if (i2 == -3) {
            GestureGuardLogicUI gestureGuardLogicUI3 = this.f323870e;
            gestureGuardLogicUI3.f318308p++;
            gestureGuardLogicUI3.f318301f = 2;
            gestureGuardLogicUI3.mo153210M7();
        } else {
            GestureGuardLogicUI gestureGuardLogicUI4 = this.f323870e;
            C76701a.makeText((Context) gestureGuardLogicUI4, (CharSequence) gestureGuardLogicUI4.getString(C0966R.string.f360857fe2), 0).show();
        }
        return 0;
    }
}
