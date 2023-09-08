package com.tencent.p014mm.plugin.sns.p106ui.previewimageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.c */
public class C96156c extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ View f280901d;

    /* renamed from: e */
    public final /* synthetic */ DynamicGridView f280902e;

    public C96156c(DynamicGridView dynamicGridView, View view) {
        this.f280902e = dynamicGridView;
        this.f280901d = view;
    }

    public void onAnimationEnd(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
        DynamicGridView.m123189f(this.f280902e, false);
        DynamicGridView.m123190g(this.f280902e);
        DynamicGridView dynamicGridView = this.f280902e;
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        BitmapDrawable bitmapDrawable = dynamicGridView.f280821d;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (bitmapDrawable != null) {
            DynamicGridView dynamicGridView2 = this.f280902e;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            DynamicGridView.C96139h hVar = dynamicGridView2.f280806H;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (hVar != null) {
                DynamicGridView dynamicGridView3 = this.f280902e;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                DynamicGridView.C96139h hVar2 = dynamicGridView3.f280806H;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                ((C96148b.C96152d) hVar2).mo133773a();
            }
        }
        DynamicGridView dynamicGridView4 = this.f280902e;
        View view = this.f280901d;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView4.mo133734w(view);
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        Log.m105924i("DynamicGridView", "animate end");
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
    }

    public void onAnimationStart(Animator animator) {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
        DynamicGridView.m123189f(this.f280902e, true);
        DynamicGridView.m123190g(this.f280902e);
        Log.m105924i("DynamicGridView", "animate start");
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$8");
    }
}
