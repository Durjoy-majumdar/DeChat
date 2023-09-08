package ac3;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import ob0.C47350c;
import ob0.C89132b;
import p156gj.C87200o;
import qr3.C110470e;
import te3.uz4;
import te3.vz4;

/* renamed from: ac3.a */
public final class C39536a extends C89132b<vz4> {
    public C39536a() {
        uz4 uz4 = new uz4();
        vz4 vz4 = new vz4();
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        uz4.f143203d = C110470e.f330363a;
        uz4.f143204e = C87200o.f252870c;
        uz4.f143205f = BuildInfo.IS_ARM64 ? 64 : 32;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = uz4;
        bVar.f127067b = vz4;
        bVar.f127068c = "/cgi-bin/micromsg-bin/wevisiongetdevicemodelscore";
        bVar.f127069d = 7179;
        mo123453j(bVar.mo72403a());
    }
}
