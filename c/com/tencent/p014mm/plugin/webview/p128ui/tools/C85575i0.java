package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.i0 */
public class C85575i0 implements DialogInterface.OnCancelListener {
    public C85575i0(SDKOAuthUI sDKOAuthUI) {
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SdkOAuthUI", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
        }
    }
}
