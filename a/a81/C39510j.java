package a81;

import com.tencent.p014mm.plugin.exdevice.model.C41171u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import n71.C47177h;
import y71.C53501k;
import y71.C53502m;

/* renamed from: a81.j */
public class C39510j extends C41171u1 {

    /* renamed from: d */
    public C47177h f106080d;

    public C39510j(int i, int i2, long j) {
        this.f106080d = new C47177h(i, i2, j);
    }

    /* renamed from: a */
    public boolean mo62113a(C53501k kVar, C39504d dVar) {
        if (C53502m.m60037a().mo74180g(this.f106080d.f126719a)) {
            return new C39502b(this.f106080d, dVar).mo62110b(kVar);
        }
        Log.m105929w("MicroMsg.exdevice.MMSwitchViewPushTaskExcuter", "push switchview event to device before it do auth, device id = %d", Long.valueOf(this.f106080d.f126719a));
        return true;
    }
}
