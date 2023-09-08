package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.s2 */
public class C24295s2 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96651n f69750d;

    /* renamed from: e */
    public final /* synthetic */ String f69751e;

    /* renamed from: f */
    public final /* synthetic */ LuggageUploadMediaFileManager.C24287c f69752f;

    public C24295s2(C96651n nVar, String str, LuggageUploadMediaFileManager.C24287c cVar) {
        this.f69750d = nVar;
        this.f69751e = str;
        this.f69752f = cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C6080m.Cx0().mo134808h(this.f69750d);
        C6080m.Cx0().mo134805e(this.f69751e);
        this.f69752f.mo41057a(false, "", "");
    }
}
