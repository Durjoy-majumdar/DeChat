package vh3;

import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49966ja;
import te3.C51050r22;
import te3.C51163rv3;
import te3.C51193s22;

/* renamed from: vh3.b */
public final class C52915b extends C89132b<C51193s22> {
    public C52915b(int i, byte[] bArr, byte[] bArr2) {
        C51050r22 r222 = new C51050r22();
        r222.f140676d = i;
        bArr = bArr == null ? new byte[0] : bArr;
        r222.f140677e = new C89349b(bArr, 0, bArr.length);
        bArr2 = bArr2 == null ? new byte[0] : bArr2;
        r222.f140678f = new C89349b(bArr2, 0, bArr2.length);
        C51193s22 s222 = new C51193s22();
        s222.setBaseResponse(new C49966ja());
        s222.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = r222;
        bVar.f127067b = s222;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getlenslist";
        bVar.f127069d = 3847;
        mo123453j(bVar.mo72403a());
    }
}
