package zx0;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import gy3.C87412m;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50530ne2;
import te3.C50669oe2;
import te3.C52129yk2;
import te3.C52278zk2;
import yx0.C53613a;

/* renamed from: zx0.i */
public final class C53842i extends C53839f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53842i(C53613a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "tokenManager");
    }

    /* renamed from: c */
    public C47350c mo74453c(TransferRequestInfo transferRequestInfo) {
        C87412m.m108594g(transferRequestInfo, "transferRequestInfo");
        C50530ne2 ne22 = new C50530ne2();
        ne22.f138553g = transferRequestInfo.f109025e;
        ne22.f138551e = transferRequestInfo.f109027g;
        ne22.f138555i = transferRequestInfo.f109026f;
        ne22.f138552f = transferRequestInfo.f109030j;
        ne22.f138556j = transferRequestInfo.f109033p;
        ne22.f138554h = 400;
        C52129yk2 yk22 = transferRequestInfo.f109028h;
        if (yk22 == null) {
            yk22 = new C52129yk2();
        }
        ne22.f138550d = yk22;
        ne22.f138558o = 0;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ne22;
        bVar.f127067b = new C50669oe2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/h5webtransfer";
        bVar.f127069d = 6601;
        bVar.f127070e = 6601;
        bVar.f127071f = 0;
        return bVar.mo72403a();
    }

    /* renamed from: d */
    public String mo74454d() {
        return "/cgi-bin/micromsg-bin/h5webtransfer";
    }

    /* renamed from: e */
    public C52278zk2 mo74455e(C47350c cVar) {
        C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
        C50669oe2 oe22 = aVar instanceof C50669oe2 ? (C50669oe2) aVar : null;
        if (oe22 != null) {
            return oe22.f139117d;
        }
        return null;
    }

    /* renamed from: f */
    public String mo74456f() {
        return "h5WebTransfer";
    }
}
