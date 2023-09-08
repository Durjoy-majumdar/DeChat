package zx0;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import gy3.C87412m;
import ob0.C47350c;
import pe3.C47465a;
import te3.C50120ke2;
import te3.C50669oe2;
import te3.C52129yk2;
import te3.C52278zk2;
import yx0.C53613a;

/* renamed from: zx0.g */
public final class C53840g extends C53839f {

    /* renamed from: b */
    public final int f151073b;

    /* renamed from: c */
    public final String f151074c;

    /* renamed from: d */
    public final int f151075d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53840g(int i, String str, int i2, C53613a aVar) {
        super(aVar);
        C87412m.m108594g(str, "cgiUrl");
        C87412m.m108594g(aVar, "tokenManager");
        this.f151073b = i;
        this.f151074c = str;
        this.f151075d = i2;
    }

    /* renamed from: c */
    public C47350c mo74453c(TransferRequestInfo transferRequestInfo) {
        C87412m.m108594g(transferRequestInfo, "transferRequestInfo");
        C50120ke2 ke22 = new C50120ke2();
        ke22.f136713g = transferRequestInfo.f109025e;
        ke22.f136711e = transferRequestInfo.f109027g;
        ke22.f136715i = transferRequestInfo.f109026f;
        ke22.f136712f = transferRequestInfo.f109030j;
        ke22.f136714h = 400;
        C52129yk2 yk22 = transferRequestInfo.f109028h;
        if (yk22 == null) {
            yk22 = new C52129yk2();
        }
        ke22.f136710d = yk22;
        ke22.f136716j = transferRequestInfo.f109033p;
        ke22.f136717n = transferRequestInfo.f109032o;
        ke22.f136718o = this.f151075d;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ke22;
        bVar.f127067b = new C50669oe2();
        bVar.f127068c = this.f151074c;
        int i = this.f151073b;
        bVar.f127069d = i;
        bVar.f127070e = i;
        bVar.f127071f = 0;
        return bVar.mo72403a();
    }

    /* renamed from: d */
    public String mo74454d() {
        return this.f151074c;
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
        return "DynamicRoutingTransferRequester";
    }
}
