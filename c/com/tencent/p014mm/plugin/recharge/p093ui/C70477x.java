package com.tencent.p014mm.plugin.recharge.p093ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.recharge.ui.x */
public class C70477x implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ RechargeUI f203690d;

    public C70477x(RechargeUI rechargeUI) {
        this.f203690d = rechargeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f203690d.f203567B);
        C88144b.m109791i(this.f203690d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return true;
    }
}
