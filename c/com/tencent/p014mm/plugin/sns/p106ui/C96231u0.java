package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: com.tencent.mm.plugin.sns.ui.u0 */
public class C96231u0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f281201d;

    /* renamed from: e */
    public final /* synthetic */ GalleryTitleManager f281202e;

    public C96231u0(GalleryTitleManager galleryTitleManager, SnsInfo snsInfo) {
        this.f281202e = galleryTitleManager;
        this.f281201d = snsInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$5");
        this.f281202e.mo132172g(this.f281201d);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$5");
    }
}
