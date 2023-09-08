package com.tencent.p014mm.plugin.webview.p128ui.tools.floatball;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43522y;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.g */
public final class C43870g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f118798d;

    /* renamed from: e */
    public final /* synthetic */ C43522y f118799e;

    public C43870g(String str, C43522y yVar) {
        this.f118798d = str;
        this.f118799e = yVar;
    }

    public final void run() {
        C43861d.f118785c.remove(this.f118798d);
        if (this.f118799e.f117532H) {
            C115669n.INSTANCE.idkeyStat(1553, 11, 1, false);
            C43522y yVar = this.f118799e;
            if (yVar.f117532H) {
                yVar.mo67812d();
            }
        }
    }
}
