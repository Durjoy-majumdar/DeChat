package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.w3 */
public final class C2148w3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public static final C2148w3 f12118d = new C2148w3();

    public final void onCancel(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BizTimeLineSettingUI", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
        }
    }
}
