package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.a0 */
public class C85567a0 implements DialogInterface.OnCancelListener {
    public C85567a0(SDKOAuthFriendUI sDKOAuthFriendUI) {
    }

    public void onCancel(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SDKOAuthFriendUI", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
        }
    }
}
