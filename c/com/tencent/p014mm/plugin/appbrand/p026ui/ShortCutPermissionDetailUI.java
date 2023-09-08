package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.ShortCutPermissionDetailUI */
public class ShortCutPermissionDetailUI extends WebViewUI {

    /* renamed from: I2 */
    public long f108917I2 = 0;

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onStart() {
        super.onStart();
        this.f108917I2 = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.ShortCutPermissionDetailUI", "onStop");
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra_app_id");
            int intExtra = intent.getIntExtra("extra_permission_and_jump_status", 0);
            C115669n.INSTANCE.mo160131h(15786, Long.valueOf(System.currentTimeMillis() - this.f108917I2), Integer.valueOf(intExtra), 0, stringExtra);
        }
        this.f108917I2 = 0;
    }
}
