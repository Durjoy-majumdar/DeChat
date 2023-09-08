package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85590k1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.j1 */
public class C85589j1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C85590k1.C85591a f249498d;

    public C85589j1(C85590k1 k1Var, C85590k1.C85591a aVar) {
        this.f249498d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105918d("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
        this.f249498d.mo67901a(3, (Bundle) null);
    }
}
