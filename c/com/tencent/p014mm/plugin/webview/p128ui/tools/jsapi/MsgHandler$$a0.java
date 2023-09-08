package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.view.MenuItem;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$a0 */
public class MsgHandler$$a0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f22743d;

    /* renamed from: e */
    public final /* synthetic */ Intent f22744e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f22745f;

    public MsgHandler$$a0(MsgHandler msgHandler, String str, Intent intent) {
        this.f22745f = msgHandler;
        this.f22743d = str;
        this.f22744e = intent;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f22745f.mo7217o5(this.f22743d, this.f22744e, 14, "image");
        } else if (itemId == 2) {
            this.f22745f.mo7215n5(this.f22744e, 14);
        }
    }
}
