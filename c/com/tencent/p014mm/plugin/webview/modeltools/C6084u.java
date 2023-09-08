package com.tencent.p014mm.plugin.webview.modeltools;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.u */
public final class C6084u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15601d<Boolean> f22416d;

    public C6084u(C15601d<? super Boolean> dVar) {
        this.f22416d = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.WebViewPermissionRequestHelper", "showWebPermissionAlert cancel");
        C15601d<Boolean> dVar = this.f22416d;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
    }
}
