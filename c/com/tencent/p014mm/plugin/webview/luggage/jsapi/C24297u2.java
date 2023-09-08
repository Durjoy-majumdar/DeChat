package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.u2 */
public class C24297u2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96651n f69755d;

    /* renamed from: e */
    public final /* synthetic */ String f69756e;

    /* renamed from: f */
    public final /* synthetic */ LuggageUploadMediaFileManager.C24287c f69757f;

    public C24297u2(C96651n nVar, String str, LuggageUploadMediaFileManager.C24287c cVar) {
        this.f69755d = nVar;
        this.f69756e = str;
        this.f69757f = cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6080m.Cx0().mo134808h(this.f69755d);
        C6080m.Cx0().mo134805e(this.f69756e);
        this.f69757f.mo41057a(false, "", "");
    }
}
