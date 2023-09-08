package zx0;

import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import ex0.C45699g;
import ex0.C45706i;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C52278zk2;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: zx0.e */
public final class C53838e implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C53839f f151069d;

    /* renamed from: e */
    public final /* synthetic */ C45699g f151070e;

    /* renamed from: f */
    public final /* synthetic */ TransferRequestInfo f151071f;

    public C53838e(C53839f fVar, C45699g gVar, TransferRequestInfo transferRequestInfo) {
        this.f151069d = fVar;
        this.f151070e = gVar;
        this.f151071f = transferRequestInfo;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C53839f fVar = this.f151069d;
        fVar.getClass();
        if (C45706i.m50950a()) {
            C86709a0.m107524d().f256809d.mo55480j3(fVar.mo74454d(), "", 0);
        }
        boolean z = true;
        if (i == 0 && i2 == 0) {
            C52278zk2 e = this.f151069d.mo74455e(cVar);
            if (e != null) {
                C45699g gVar = this.f151070e;
                if (gVar != null) {
                    gVar.mo66581b(0, "", e);
                }
            } else {
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    C87412m.m108593f(str, "errMsg");
                } else {
                    str = "transfer failed invalid jsApiResponse";
                }
                C45699g gVar2 = this.f151070e;
                if (gVar2 != null) {
                    gVar2.mo66581b(3, '[' + i + ", " + i2 + ", " + str + ']', e);
                }
            }
        } else if (i2 == -262 || i2 == -263) {
            this.f151069d.f151072a.mo74237a();
            if (this.f151071f.f109034q) {
                Log.m105928w("MicroMsg.BaseTransferRequest", "[transferRequest-" + this.f151069d.mo74456f() + "] transfer failed, token expire and retry failed");
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    C87412m.m108593f(str, "errMsg");
                } else {
                    str = "transfer failed, token expire and retry failed";
                }
                C45699g gVar3 = this.f151070e;
                if (gVar3 != null) {
                    gVar3.mo66581b(4, '[' + i + ", " + i2 + ", " + str + ']', (C52278zk2) null);
                }
            } else {
                Log.m105924i("MicroMsg.BaseTransferRequest", "[transferRequest-" + this.f151069d.mo74456f() + "] h5Session timeout and retry");
                TransferRequestInfo transferRequestInfo = this.f151071f;
                transferRequestInfo.f109034q = true;
                C53839f.m60330a(this.f151069d, transferRequestInfo);
                C53839f fVar2 = this.f151069d;
                TransferRequestInfo transferRequestInfo2 = this.f151071f;
                C45699g gVar4 = this.f151070e;
                fVar2.getClass();
                C87412m.m108594g(transferRequestInfo2, "transferRequestInfo");
                C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C53836d(fVar2, transferRequestInfo2, gVar4, (C15601d<? super C53836d>) null), 3, (Object) null);
            }
        } else {
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                C87412m.m108593f(str, "errMsg");
            } else {
                str = "transfer failed";
            }
            C45699g gVar5 = this.f151070e;
            if (gVar5 != null) {
                gVar5.mo66581b(5, '[' + i + ", " + i2 + ", " + str + ']', (C52278zk2) null);
            }
        }
        return 0;
    }
}
