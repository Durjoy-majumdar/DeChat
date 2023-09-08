package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.l */
public class C6356l implements C77407n.C12924o {

    /* renamed from: a */
    public final /* synthetic */ OpenFileChooserUI f23268a;

    public C6356l(OpenFileChooserUI openFileChooserUI) {
        this.f23268a = openFileChooserUI;
    }

    /* renamed from: a */
    public void mo2362a() {
        Log.m105926v("MicroMsg.OpenFileChooserUI", "alvinluo cancel onClick");
        this.f23268a.setResult(0);
        this.f23268a.finish();
    }
}
