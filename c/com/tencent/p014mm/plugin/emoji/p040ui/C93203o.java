package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.emoji.p040ui.CustomSmileyPreviewUI;

/* renamed from: com.tencent.mm.plugin.emoji.ui.o */
public class C93203o implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI.C931284 f268765d;

    public C93203o(CustomSmileyPreviewUI.C931284 r1) {
        this.f268765d = r1;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        CustomSmileyPreviewUI.this.finish();
    }
}
