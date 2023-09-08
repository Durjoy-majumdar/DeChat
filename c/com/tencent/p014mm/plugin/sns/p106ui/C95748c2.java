package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import zu2.C103096d;

/* renamed from: com.tencent.mm.plugin.sns.ui.c2 */
public final class C95748c2 extends C95754d2 {

    /* renamed from: B */
    public final String f279280B = "MicroMsg.SnsUpload.PicV2Widget";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95748c2(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: o */
    public View mo133192o(View view, View view2, DynamicGridView dynamicGridView, View view3, View view4) {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicV2Widget");
        String str = this.f279280B;
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f279312e == null);
        Log.m105925i(str, "initView: previewImage null[%b]", objArr);
        C95738b1 b1Var = this.f279312e;
        if (b1Var == null) {
            this.f279312e = new C103096d(view, view2, view3, view4, this.f279311d, this.f279310c.mo133209d(), this.f279329v, dynamicGridView, this.f279332y, this.f279333z, !this.f279322o);
        } else {
            b1Var.mo132429a(this.f279310c.mo133209d(), this.f279329v);
            C95738b1 b1Var2 = this.f279312e;
            C87412m.m108592e(b1Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
            ((C103096d) b1Var2).mo133768g(this.f279310c.mo133208c());
        }
        View view5 = this.f279312e.getView();
        C87412m.m108593f(view5, "previewImage.view");
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicV2Widget");
        return view5;
    }
}
