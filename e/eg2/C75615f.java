package eg2;

import com.tencent.p014mm.plugin.radar.model.RadarAddContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: eg2.f */
public final class C75615f implements RadarAddContact.C42802c {

    /* renamed from: a */
    public final /* synthetic */ String f222133a;

    /* renamed from: b */
    public final /* synthetic */ RadarAddContact f222134b;

    /* renamed from: c */
    public final /* synthetic */ long f222135c;

    public C75615f(String str, RadarAddContact radarAddContact, long j) {
        this.f222133a = str;
        this.f222134b = radarAddContact;
        this.f222135c = j;
    }

    /* renamed from: a */
    public void mo66957a(boolean z, boolean z2, String str, String str2) {
        Class cls = C75700k0.class;
        if (z) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                C72996z1 a = RadarAddContact.m82903a(this.f222134b, C72963f4.C72971h.m85668v(this.f222133a));
                if (!((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(a)) {
                    Log.m105920e("MicroMsg.RadarAddContact", "canAddContact fail, insert fail");
                    z = false;
                }
                z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(a.getUsername());
            }
            Log.m105918d("MicroMsg.RadarAddContact", "verifyContact return ok");
            C45628s0.m50775g0(z1Var);
            RadarAddContact.m82904b(this.f222134b, str, 1);
        } else {
            Log.m105918d("MicroMsg.RadarAddContact", "verifyContact return not ok");
        }
        RadarAddContact radarAddContact = this.f222134b;
        radarAddContact.f203283j.post(new C75614e(radarAddContact, z, str2, str, this.f222135c));
    }
}
