package com.tencent.p014mm.plugin.appbrand.ipc;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Util;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.f */
public class C81960f implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ String f240360d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandProcessProxyUI f240361e;

    public C81960f(AppBrandProcessProxyUI appBrandProcessProxyUI, String str) {
        this.f240361e = appBrandProcessProxyUI;
        this.f240360d = str;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        if (!Util.isNullOrNil(this.f240360d)) {
            AppBrandProcessProxyUI appBrandProcessProxyUI = this.f240361e;
            AppBrandProcessProxyUI.C81939d dVar = appBrandProcessProxyUI.f240322n;
            C77398g gVar = appBrandProcessProxyUI.f240321j;
            dVar.mo114362a(-3);
            dialogInterface.dismiss();
        }
        this.f240361e.mo114356H7((AppBrandProxyUIProcessTask.ProcessResult) null);
        return false;
    }
}
