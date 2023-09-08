package com.tencent.p014mm.plugin.ball.p1099ui;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.ball.ui.j */
public class C105074j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FloatBallProxyUI f311854d;

    public C105074j(FloatBallProxyUI floatBallProxyUI) {
        this.f311854d = floatBallProxyUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            Log.m105924i("MicroMsg.FloatBallProxyUI", "click remove all balls");
            FloatBallProxyUI.m140992H7(this.f311854d, 1);
            this.f311854d.finish();
            return;
        }
        Log.m105924i("MicroMsg.FloatBallProxyUI", "click cancel remove all balls");
        FloatBallProxyUI.m140992H7(this.f311854d, 2);
        this.f311854d.finish();
    }
}
