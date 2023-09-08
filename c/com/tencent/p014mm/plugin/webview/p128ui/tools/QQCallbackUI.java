package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.QQCallbackUI */
public class QQCallbackUI extends MMActivity {
    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.webview.QQCallbackUI", "QQCallbackUI onCreate");
        super.onCreate(bundle);
        finish();
    }
}
