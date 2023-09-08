package ok0;

import com.tencent.p014mm.sdk.platformtools.Log;
import qk0.C89684a;
import qk0.C89696k;

/* renamed from: ok0.a */
public class C89232a extends C89684a {
    /* renamed from: l */
    public void mo123562l() {
        if (this.f257933a.f256605e == null) {
            Log.m105921e("MicroMsg.Ble.Action", "connection is not open.", new Object[0]);
            mo124011p(C89696k.f257975l);
            mo124010m();
            return;
        }
        this.f257933a.mo123376k(true);
        mo124011p(C89696k.f257968e);
        mo124010m();
    }

    /* renamed from: n */
    public String mo123563n() {
        return "CloseAction";
    }
}
