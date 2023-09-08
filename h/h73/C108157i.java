package h73;

import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.plugin.walletlock.model.C106561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import g73.C107759d;
import g73.C107761f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C64533lq3;

/* renamed from: h73.i */
public class C108157i implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ l0$$e f323881d;

    /* renamed from: e */
    public final /* synthetic */ GestureGuardLogicUI f323882e;

    public C108157i(GestureGuardLogicUI gestureGuardLogicUI, l0$$e l0__e) {
        this.f323882e = gestureGuardLogicUI;
        this.f323881d = l0__e;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105924i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}));
        GestureGuardLogicUI gestureGuardLogicUI = this.f323882e;
        int i3 = GestureGuardLogicUI.f318298y;
        gestureGuardLogicUI.mo153206I7();
        if (i == 0 && i2 == 0) {
            C107761f.m145992i(((C64533lq3) cVar.f127056b.f127083a).f184152d);
            C107759d.m145974d(false);
            GestureGuardLogicUI.m143838H7(this.f323882e);
        }
        C106561j.INSTANCE.mo153262e();
        l0$$e l0__e = this.f323881d;
        if (l0__e != null) {
            return l0__e.mo1488a(i, i2, str, cVar, yVar);
        }
        return 0;
    }
}
