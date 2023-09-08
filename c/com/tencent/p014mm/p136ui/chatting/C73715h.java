package com.tencent.p014mm.p136ui.chatting;

import android.view.MenuItem;
import nj3.C11184p0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.h */
public class C73715h implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C76879j.C76888o f216458d;

    public C73715h(AppAttachDownloadUI appAttachDownloadUI, C76879j.C76888o oVar) {
        this.f216458d = oVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C76879j.C76888o oVar = this.f216458d;
        if (oVar != null) {
            oVar.mo5759a(i, menuItem.getItemId());
        }
    }
}
