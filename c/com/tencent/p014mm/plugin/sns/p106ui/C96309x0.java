package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.x0 */
public class C96309x0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C94877g0 f281619d;

    public C96309x0(GalleryTitleManager galleryTitleManager, C94877g0 g0Var) {
        this.f281619d = g0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$9");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123458d(this.f281619d);
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$9");
    }
}
