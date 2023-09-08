package com.tencent.p014mm.p136ui.tools;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.ui.tools.n1 */
public final class C74849n1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ ShareToStatusUI f220070d;

    public C74849n1(ShareToStatusUI shareToStatusUI) {
        this.f220070d = shareToStatusUI;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f220070d.finish();
    }
}
