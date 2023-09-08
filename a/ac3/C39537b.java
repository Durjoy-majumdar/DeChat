package ac3;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import ob0.C47350c;
import ob0.C89132b;
import p156gj.C87200o;
import qr3.C110470e;
import te3.xz4;
import te3.yz4;

/* renamed from: ac3.b */
public final class C39537b extends C89132b<yz4> {
    public C39537b() {
        xz4 xz4 = new xz4();
        yz4 yz4 = new yz4();
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        xz4.f145044d = C110470e.f330363a;
        xz4.f145045e = C87200o.f252870c;
        xz4.f145046f = BuildInfo.IS_ARM64 ? 64 : 32;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = xz4;
        bVar.f127067b = yz4;
        bVar.f127068c = "/cgi-bin/micromsg-bin/wevisiongeteffectconfig";
        bVar.f127069d = 8116;
        mo123453j(bVar.mo72403a());
    }
}
