package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import e00.C45516n0;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.g */
public final class C44260g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C45516n0 f119940d;

    /* renamed from: e */
    public final /* synthetic */ JsapiPermissionWrapper f119941e;

    /* renamed from: f */
    public final /* synthetic */ Activity f119942f;

    public C44260g(C45516n0 n0Var, JsapiPermissionWrapper jsapiPermissionWrapper, Activity activity) {
        this.f119940d = n0Var;
        this.f119941e = jsapiPermissionWrapper;
        this.f119942f = activity;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (this.f119940d.mo68973a(this.f119941e, 21, 1)) {
            e0Var.mo107151k(1, this.f119942f.getString(C0966R.string.hre), C0966R.raw.bottomsheet_icon_transmit, false);
        }
        if (this.f119940d.mo68973a(this.f119941e, 23, 2)) {
            e0Var.mo107151k(2, this.f119942f.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, false);
        }
    }
}
