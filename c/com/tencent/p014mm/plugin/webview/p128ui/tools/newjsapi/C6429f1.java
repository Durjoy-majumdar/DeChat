package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import ht1.C60216z4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f1 */
public final class C6429f1 implements C60216z4.C8821a<Integer> {

    /* renamed from: a */
    public final /* synthetic */ C1256g<IPCInteger> f23442a;

    public C6429f1(C1256g<IPCInteger> gVar) {
        this.f23442a = gVar;
    }

    /* renamed from: a */
    public void mo6382a(Object obj) {
        Integer num = (Integer) obj;
        C1256g<IPCInteger> gVar = this.f23442a;
        if (gVar != null) {
            gVar.mo894a(new IPCInteger(num != null ? num.intValue() : 0));
        }
    }
}
