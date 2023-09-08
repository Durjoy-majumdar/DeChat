package p219pm;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import g40.C32315i;
import pc0.C100760a0;

/* renamed from: pm.n */
public class C77110n implements C32315i {
    public void onNetworkChange(int i) {
        if ((i == 4 || i == 6) && C97625j3.m125811a() && C86709a0.m107523b().f251765p && !C86718e.m107551r()) {
            Log.m105924i("MicroMsg.LegacyWorkProfileAsyncService", "dkmsg Network connected , try send msg.");
            C100760a0.m131932b(C100760a0.C100763e.TEXT).mo140195a().mo123694a();
        }
    }
}
