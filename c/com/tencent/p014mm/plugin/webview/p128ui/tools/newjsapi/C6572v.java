package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import ht1.C60216z4;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.v */
public final class C6572v<T> implements C60216z4.C8821a {

    /* renamed from: a */
    public final /* synthetic */ C1256g<IPCString> f23794a;

    public C6572v(C1256g<IPCString> gVar) {
        this.f23794a = gVar;
    }

    /* renamed from: a */
    public void mo6382a(Object obj) {
        String str = (String) obj;
        C1256g<IPCString> gVar = this.f23794a;
        if (gVar != null) {
            if (str == null) {
                str = "";
            }
            gVar.mo894a(new IPCString(str));
        }
    }
}
