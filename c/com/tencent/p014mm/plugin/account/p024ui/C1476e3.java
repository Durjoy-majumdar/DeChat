package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.tencent.mm.plugin.account.ui.e3 */
public class C1476e3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ShareToFacebookRedirectUI f10820d;

    public C1476e3(ShareToFacebookRedirectUI shareToFacebookRedirectUI) {
        this.f10820d = shareToFacebookRedirectUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f10820d.getContext(), MMFBAuthUI.class);
        intent.putExtra("is_force_unbind", true);
        this.f10820d.getContext().startActivityForResult(intent, 0);
    }
}
