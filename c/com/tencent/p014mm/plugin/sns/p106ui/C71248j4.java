package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.j4 */
public class C71248j4 implements DialogInterface.OnCancelListener {
    public C71248j4(SnsCommentUI snsCommentUI) {
    }

    public void onCancel(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$1");
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$1");
    }
}
