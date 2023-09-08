package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.p0 */
public final class C6537p0 implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23703d;

    public C6537p0(int i, C13855j jVar, int i2) {
        this.f23703d = jVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107146h(2147483646, this.f23703d.f38998a.getString(C0966R.string.hre), C0966R.raw.icons_filled_share, this.f23703d.f38998a.getResources().getColor(C0966R.color.f2939n));
        e0Var.mo107146h(2147483645, this.f23703d.f38998a.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, 0);
    }
}
