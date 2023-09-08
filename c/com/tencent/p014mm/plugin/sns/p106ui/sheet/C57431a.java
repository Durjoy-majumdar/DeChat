package com.tencent.p014mm.plugin.sns.p106ui.sheet;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.sheet.a */
public final class C57431a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsGroupDialog f164512d;

    public C57431a(SnsGroupDialog snsGroupDialog) {
        this.f164512d = snsGroupDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener$callback$1$1");
        this.f164512d.dismiss();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener$callback$1$1");
    }
}
