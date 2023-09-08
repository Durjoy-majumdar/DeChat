package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import te3.C52099yc2;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.core.r */
public final class C30587r implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f82382d;

    /* renamed from: e */
    public final /* synthetic */ C1256g<IPCString> f82383e;

    public C30587r(C8477a0 a0Var, C1256g<IPCString> gVar) {
        this.f82382d = a0Var;
        this.f82383e = gVar;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C8477a0 a0Var = this.f82382d;
        if (a0Var.f27482d) {
            return 0;
        }
        boolean z = true;
        a0Var.f27482d = true;
        Log.m105924i("MicroMsg.WebViewAdHelper", "onCgiBack, errType=" + i + ", errCode=" + i2 + ", errMsg=" + str);
        if (i == 0 && i2 == 0) {
            C47465a aVar = cVar.f127056b.f127083a;
            if (aVar instanceof C52099yc2) {
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetWuidResp");
                C52099yc2 yc22 = (C52099yc2) aVar;
                String str2 = yc22.f145231e;
                if (str2 != null && !C112551y.m153811k(str2)) {
                    z = false;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.WebViewAdHelper", "onCgiBack wuid=" + yc22.f145231e);
                    this.f82383e.mo894a(new IPCString(yc22.f145231e));
                    C30584q.f82375a.mo57493b(1);
                } else {
                    Log.m105924i("MicroMsg.WebViewAdHelper", "onCgiBack wuid is null");
                    this.f82383e.mo894a(new IPCString());
                    C30584q.f82375a.mo57493b(2);
                }
                return 0;
            }
        }
        this.f82383e.mo894a(new IPCString());
        C30584q.f82375a.mo57493b(3);
        return 0;
    }
}
