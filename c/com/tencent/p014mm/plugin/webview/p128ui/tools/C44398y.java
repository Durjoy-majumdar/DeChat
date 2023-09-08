package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.y */
public class C44398y implements DialogInterface.OnCancelListener {
    public C44398y(SDKOAuthAppDataUI sDKOAuthAppDataUI) {
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SDKOAuthAppDataUI", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
        }
    }
}
