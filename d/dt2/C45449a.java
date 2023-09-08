package dt2;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import te3.q74;
import te3.r74;
import vr2.C102236a0;

/* renamed from: dt2.a */
public final class C45449a extends C45450b<r74> {
    public C45449a(long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        q74 q74 = new q74();
        q74.f140174d = j;
        bVar.f127066a = q74;
        bVar.f127067b = new r74();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
        bVar.f127069d = 210;
        bVar.f127070e = 101;
        bVar.f127071f = 1000000101;
        mo123453j(bVar.mo72403a());
        Log.m105924i("MicroMsg.GetSnsObjectDetailCgi", "req snsId " + C102236a0.m134765q0(j));
    }
}
