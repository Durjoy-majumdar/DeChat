package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import ht1.C60213x3;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.l1 */
public final class C6509l1 implements C60213x3 {

    /* renamed from: a */
    public final /* synthetic */ C1256g<IPCBoolean> f23633a;

    public C6509l1(C1256g<IPCBoolean> gVar) {
        this.f23633a = gVar;
    }

    /* renamed from: a */
    public final void mo5408a(int i, String str) {
        if (i == 1) {
            C1256g<IPCBoolean> gVar = this.f23633a;
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(true));
                return;
            }
            return;
        }
        C1256g<IPCBoolean> gVar2 = this.f23633a;
        if (gVar2 != null) {
            gVar2.mo894a(new IPCBoolean(false));
        }
    }
}
