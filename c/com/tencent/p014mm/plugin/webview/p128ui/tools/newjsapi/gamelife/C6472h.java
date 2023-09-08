package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import gy3.C87412m;
import xy1.C53475k;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.h */
public final class C6472h implements C53475k.C38908a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<GetGamelifeSessionIdData> f23536a;

    public C6472h(C1256g<GetGamelifeSessionIdData> gVar) {
        this.f23536a = gVar;
    }

    /* renamed from: a */
    public final void mo7487a(String str) {
        if (str == null || str.length() == 0) {
            C1256g<GetGamelifeSessionIdData> gVar = this.f23536a;
            if (gVar != null) {
                gVar.mo894a(new GetGamelifeSessionIdData("", "get sessionId fail", false));
                return;
            }
            return;
        }
        C1256g<GetGamelifeSessionIdData> gVar2 = this.f23536a;
        if (gVar2 != null) {
            C87412m.m108593f(str, "sessionId");
            gVar2.mo894a(new GetGamelifeSessionIdData(str, "get sessionId ok", true));
        }
    }
}
