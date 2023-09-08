package vh3;

import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49966ja;
import te3.C50771p22;
import te3.C50906q22;
import te3.C51163rv3;

/* renamed from: vh3.a */
public final class C52914a extends C89132b<C50906q22> {
    public C52914a(String str) {
        C87412m.m108594g(str, "lensId");
        C50771p22 p222 = new C50771p22();
        C50906q22 q222 = new C50906q22();
        p222.f139537d = str;
        q222.setBaseResponse(new C49966ja());
        q222.BaseResponse.f135956e = new C51163rv3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = p222;
        bVar.f127067b = q222;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlensinfo";
        bVar.f127069d = 3903;
        mo123453j(bVar.mo72403a());
    }
}
