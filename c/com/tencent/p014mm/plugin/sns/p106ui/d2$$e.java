package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.C95738b1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.d2$$e */
public class d2$$e extends C95738b1.C95739a {

    /* renamed from: b */
    public final /* synthetic */ C95754d2 f279338b;

    public d2$$e(C95754d2 d2Var) {
        this.f279338b = d2Var;
    }

    /* renamed from: a */
    public void mo133182a(int i) {
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.PicWidget$3");
        Log.m105918d("MicroMsg.PicWidget", "I click");
        if (i < 0) {
            this.f279338b.mo133203s();
        } else {
            Intent intent = new Intent();
            intent.setClass(this.f279338b.f279311d, SnsUploadBrowseUI.class);
            intent.putExtra("sns_gallery_position", i);
            intent.putExtra("key_from_scene", 7);
            intent.putExtra("sns_gallery_temp_paths", this.f279338b.f279310c.mo133209d());
            this.f279338b.f279311d.startActivityForResult(intent, 7);
        }
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.PicWidget$3");
    }
}
