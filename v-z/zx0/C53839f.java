package zx0;

import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45699g;
import ex0.C45706i;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89144l0;
import te3.C52129yk2;
import te3.C52278zk2;
import yx0.C16079j;
import yx0.C53613a;

/* renamed from: zx0.f */
public abstract class C53839f {

    /* renamed from: a */
    public final C53613a f151072a;

    public C53839f(C53613a aVar) {
        C87412m.m108594g(aVar, "tokenManager");
        this.f151072a = aVar;
    }

    /* renamed from: a */
    public static final void m60330a(C53839f fVar, TransferRequestInfo transferRequestInfo) {
        fVar.getClass();
        Log.m105924i("MicroMsg.BaseTransferRequest", "[transferRequest-" + fVar.mo74456f() + "] needClientCheckData: " + transferRequestInfo.f109029i);
        if (transferRequestInfo.f109029i && transferRequestInfo.f109030j == null) {
            transferRequestInfo.f109030j = C16079j.m14971a();
        }
    }

    /* renamed from: b */
    public static final void m60331b(C53839f fVar, TransferRequestInfo transferRequestInfo, C45699g gVar) {
        fVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("[transferRequest-");
        sb.append(fVar.mo74456f());
        sb.append("] method: ");
        C52129yk2 yk22 = transferRequestInfo.f109028h;
        String str = null;
        sb.append(yk22 != null ? Integer.valueOf(yk22.f145345h) : null);
        sb.append(", h5Url: ");
        sb.append(transferRequestInfo.f109025e);
        sb.append(", reqUrl: ");
        C52129yk2 yk23 = transferRequestInfo.f109028h;
        if (yk23 != null) {
            str = yk23.f145341d;
        }
        sb.append(str);
        Log.m105924i("MicroMsg.BaseTransferRequest", sb.toString());
        if (C45706i.m50950a()) {
            String str2 = transferRequestInfo.f109035r;
            if (!(str2 == null || str2.length() == 0)) {
                Log.m105924i("MicroMsg.BaseTransferRequest", "[transferRequest-" + fVar.mo74456f() + "] cgi: " + fVar.mo74454d() + ", debugIP: " + transferRequestInfo.f109035r);
                C86709a0.m107524d().f256809d.mo55480j3(fVar.mo74454d(), transferRequestInfo.f109035r, 0);
            }
        }
        C89144l0.m111429e(fVar.mo74453c(transferRequestInfo), new C53838e(fVar, gVar, transferRequestInfo), false);
    }

    /* renamed from: c */
    public abstract C47350c mo74453c(TransferRequestInfo transferRequestInfo);

    /* renamed from: d */
    public abstract String mo74454d();

    /* renamed from: e */
    public abstract C52278zk2 mo74455e(C47350c cVar);

    /* renamed from: f */
    public abstract String mo74456f();
}
