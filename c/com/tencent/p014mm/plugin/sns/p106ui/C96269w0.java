package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.w0 */
public class C96269w0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ GalleryTitleManager f281335d;

    public C96269w0(GalleryTitleManager galleryTitleManager, C94877g0 g0Var) {
        this.f281335d = galleryTitleManager;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$8");
        this.f281335d.getClass();
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$8");
    }
}
