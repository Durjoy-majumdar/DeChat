package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.s0 */
public class C4715s0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallRechargeUI f19721d;

    public C4715s0(IPCallRechargeUI iPCallRechargeUI) {
        this.f19721d = iPCallRechargeUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f19721d.finish();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f19721d.getString(C0966R.string.fu6));
        intent.putExtra("showShare", false);
        C88144b.m109791i(this.f19721d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }
}
