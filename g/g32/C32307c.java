package g32;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: g32.c */
public class C32307c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f85781d;

    /* renamed from: e */
    public final /* synthetic */ boolean f85782e;

    public C32307c(C75846b bVar, String str, boolean z) {
        this.f85781d = str;
        this.f85782e = z;
    }

    public void run() {
        Class cls = C75700k0.class;
        long currentTicks = Util.currentTicks();
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(this.f85781d);
        if (j != null && C72996z1.m85820U5(this.f85781d)) {
            boolean z = j.mo108831x2() == 1;
            boolean z2 = this.f85782e;
            if (z != z2) {
                Log.m105925i("MicroMsg.SubCoreLuckyMoney", "update red flag: %s, %s", this.f85781d, Boolean.valueOf(z2));
                j.mo108802X2(this.f85782e ? 1 : 0);
                Log.m105925i("MicroMsg.SubCoreLuckyMoney", "update ret: %s", Integer.valueOf(((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69775m0(j, this.f85781d, true, true)));
            }
        }
        Log.m105925i("MicroMsg.SubCoreLuckyMoney", "finish update red flag: %s", Long.valueOf(Util.currentTicks() - currentTicks));
    }
}
