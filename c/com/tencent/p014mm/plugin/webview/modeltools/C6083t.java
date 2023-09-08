package com.tencent.p014mm.plugin.webview.modeltools;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.t */
public final class C6083t implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15601d<Boolean> f22415d;

    public C6083t(C15601d<? super Boolean> dVar) {
        this.f22415d = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.WebViewPermissionRequestHelper", "showWebPermissionAlert ok");
        C15601d<Boolean> dVar = this.f22415d;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
    }
}
