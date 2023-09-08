package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandProcessShareMessageProxyUI;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.d1 */
public class C68649d1 implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProcessShareMessageProxyUI.C68641c f197200d;

    public C68649d1(AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, AppBrandProcessShareMessageProxyUI.C68641c cVar) {
        this.f197200d = cVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            this.f197200d.mo94356b(false, (String) null, 0);
            dialogInterface.dismiss();
        }
        return false;
    }
}
