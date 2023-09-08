package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Intent;
import android.view.MenuItem;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$d0 */
public class MsgHandler$$d0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f22764d;

    /* renamed from: e */
    public final /* synthetic */ Intent f22765e;

    /* renamed from: f */
    public final /* synthetic */ String f22766f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f22767g;

    public MsgHandler$$d0(MsgHandler msgHandler, String str, Intent intent, String str2) {
        this.f22767g = msgHandler;
        this.f22764d = str;
        this.f22765e = intent;
        this.f22766f = str2;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            this.f22767g.mo7217o5(this.f22764d, this.f22765e, 47, this.f22766f);
        } else if (itemId == 2) {
            this.f22767g.mo7215n5(this.f22765e, 47);
        }
    }
}
