package com.tencent.p014mm.p136ui.chatting;

import android.view.MenuItem;
import nj3.C11184p0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.w */
public class C74331w implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C76879j.C76888o f218348d;

    public C74331w(AppAttachNewDownloadUI appAttachNewDownloadUI, C76879j.C76888o oVar) {
        this.f218348d = oVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C76879j.C76888o oVar = this.f218348d;
        if (oVar != null) {
            oVar.mo5759a(i, menuItem.getItemId());
        }
    }
}
