package a81;

import com.tencent.p014mm.plugin.exdevice.model.C41171u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import n71.C47176g;
import y71.C53501k;
import y71.C53502m;

/* renamed from: a81.i */
public class C39509i extends C41171u1 {

    /* renamed from: d */
    public C47176g f106079d;

    public C39509i(int i) {
        this.f106079d = new C47176g(i);
    }

    /* renamed from: a */
    public boolean mo62113a(C53501k kVar, C39504d dVar) {
        if (C53502m.m60037a().mo74180g(this.f106079d.f126719a)) {
            return new C39501a(this.f106079d, dVar).mo62110b(kVar);
        }
        Log.m105929w("MicroMsg.exdevice.MMSwitchBackGroudTaskExcuter", "push switch backgroud event to device before it do auth, device id = %d", Long.valueOf(this.f106079d.f126719a));
        return true;
    }
}
