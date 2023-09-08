package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.e */
public class C82393e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C81879g f241445d;

    /* renamed from: e */
    public final /* synthetic */ int f241446e;

    /* renamed from: f */
    public final /* synthetic */ C82398i f241447f;

    public C82393e(C82398i iVar, C81879g gVar, int i) {
        this.f241447f = iVar;
        this.f241445d = gVar;
        this.f241446e = i;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105928w("MicroMsg.JsApiOpenBusinessView", "openBusinessViewByMiniProgram, user canceled");
        C82398i iVar = this.f241447f;
        iVar.f241462g = true;
        iVar.mo114795x(this.f241445d, this.f241446e, -3, "fail cancel");
    }
}
