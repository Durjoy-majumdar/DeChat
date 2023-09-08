package h73;

import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import g73.C107759d;
import g73.C107761f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C64437i63;

/* renamed from: h73.g */
public class C108155g implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ l0$$e f323878d;

    /* renamed from: e */
    public final /* synthetic */ GestureGuardLogicUI f323879e;

    public C108155g(GestureGuardLogicUI gestureGuardLogicUI, l0$$e l0__e) {
        this.f323879e = gestureGuardLogicUI;
        this.f323878d = l0__e;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105924i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOff, errType:%d, errCode:%d, errMsg:%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}));
        GestureGuardLogicUI gestureGuardLogicUI = this.f323879e;
        int i3 = GestureGuardLogicUI.f318298y;
        gestureGuardLogicUI.mo153206I7();
        if (i == 0 && i2 == 0) {
            C107761f.m145992i(((C64437i63) cVar.f127056b.f127083a).f183628d);
            C107759d.m145974d(false);
            GestureGuardLogicUI gestureGuardLogicUI2 = this.f323879e;
            gestureGuardLogicUI2.f318307o = false;
            GestureGuardLogicUI.m143838H7(gestureGuardLogicUI2);
        }
        l0$$e l0__e = this.f323878d;
        if (l0__e != null) {
            return l0__e.mo1488a(i, i2, str, cVar, yVar);
        }
        return 0;
    }
}
