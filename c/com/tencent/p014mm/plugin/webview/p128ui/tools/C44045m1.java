package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.m1 */
public class C44045m1 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ JsapiPermissionWrapper f119326d;

    /* renamed from: e */
    public final /* synthetic */ C43977g1 f119327e;

    public C44045m1(C43977g1 g1Var, JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f119327e = g1Var;
        this.f119326d = jsapiPermissionWrapper;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (this.f119327e.mo68568B(this.f119326d, 21, 1)) {
            e0Var.mo107151k(1, this.f119327e.mo68388b().getString(C0966R.string.hre), C0966R.raw.bottomsheet_icon_transmit, false);
        }
        if (this.f119327e.mo68568B(this.f119326d, 23, 2)) {
            e0Var.mo107151k(2, this.f119327e.mo68388b().getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, false);
        }
    }
}
