package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.n0 */
public class C4697n0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallMyGiftCardUI f19687d;

    public C4697n0(IPCallMyGiftCardUI iPCallMyGiftCardUI) {
        this.f19687d = iPCallMyGiftCardUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f19687d.getString(C0966R.string.fu5));
        intent.putExtra("showShare", false);
        C88144b.m109791i(this.f19687d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return true;
    }
}
