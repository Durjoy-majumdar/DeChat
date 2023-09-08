package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.g */
public class C18029g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f49831d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.g$a */
    public class C18030a implements DialogInterface.OnCancelListener {
        public C18030a(C18029g gVar) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public C18029g(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f49831d = appBrandAuthorizeUI;
    }

    public void run() {
        AppBrandAuthorizeUI appBrandAuthorizeUI = this.f49831d;
        if (appBrandAuthorizeUI.f49737E == null) {
            appBrandAuthorizeUI.f49737E = C76879j.m92722P(appBrandAuthorizeUI.getContext(), this.f49831d.getString(C0966R.string.a3h), 3, this.f49831d.getString(C0966R.string.a8n), true, false, new C18030a(this));
        }
    }
}
