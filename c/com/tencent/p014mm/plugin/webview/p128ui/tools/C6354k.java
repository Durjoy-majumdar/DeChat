package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.k */
public class C6354k implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ OpenFileChooserUI f23266a;

    public C6354k(OpenFileChooserUI openFileChooserUI) {
        this.f23266a = openFileChooserUI;
    }

    public void onDismiss() {
        Log.m105926v("MicroMsg.OpenFileChooserUI", "alvinluo onDismiss");
        this.f23266a.setResult(0);
        this.f23266a.finish();
    }
}
