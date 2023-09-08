package com.tencent.p014mm.plugin.webview.model;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.model.C85523o0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.model.p0 */
public class C43724p0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C85523o0.C85537c f118176d;

    public C43724p0(C85523o0.C85537c cVar) {
        this.f118176d = cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize user cancel");
        this.f118176d.mo67838a();
    }
}
