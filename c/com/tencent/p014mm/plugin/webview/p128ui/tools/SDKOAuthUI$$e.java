package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$e */
public class SDKOAuthUI$$e implements DialogInterface.OnCancelListener {
    public SDKOAuthUI$$e(SDKOAuthUI sDKOAuthUI) {
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SdkOAuthUI", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
        }
    }
}
