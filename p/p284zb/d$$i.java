package p284zb;

import com.tencent.mars.cdn.CronetLogic;
import tm0.C90533b;

/* renamed from: zb.d$$i */
public class d$$i implements CronetLogic.CronetTaskNetworkStateCallback {

    /* renamed from: a */
    public final /* synthetic */ C91633d f262561a;

    public d$$i(C91633d dVar) {
        this.f262561a = dVar;
    }

    public void onNetWeakChange(boolean z) {
        C90533b.m113357s(this.f262561a.mo124764Z(), z);
    }
}
