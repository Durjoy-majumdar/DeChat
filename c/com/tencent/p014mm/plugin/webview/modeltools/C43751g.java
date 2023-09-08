package com.tencent.p014mm.plugin.webview.modeltools;

import android.net.Uri;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.g */
public class C43751g implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C43754j f118218a;

    public C43751g(C43754j jVar) {
        this.f118218a = jVar;
    }

    public void onDismiss() {
        this.f118218a.mo68058a((Uri) null);
        C43754j jVar = this.f118218a;
        C77407n nVar = jVar.f118230f;
        if (nVar != null && nVar.mo107563h()) {
            jVar.f118230f.mo107572p();
            jVar.f118230f = null;
        }
    }
}
