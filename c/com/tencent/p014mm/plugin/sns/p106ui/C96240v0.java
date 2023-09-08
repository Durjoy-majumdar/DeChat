package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: com.tencent.mm.plugin.sns.ui.v0 */
public class C96240v0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f281225d;

    /* renamed from: e */
    public final /* synthetic */ GalleryTitleManager f281226e;

    public C96240v0(GalleryTitleManager galleryTitleManager, SnsInfo snsInfo) {
        this.f281226e = galleryTitleManager;
        this.f281225d = snsInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$6");
        this.f281226e.mo132172g(this.f281225d);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$6");
    }
}
