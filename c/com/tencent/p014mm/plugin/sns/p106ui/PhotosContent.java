package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.base.MMFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.PhotosContent */
public class PhotosContent extends MMFrameLayout {

    /* renamed from: e */
    public ArrayList<TagImageView> f277344e = new ArrayList<>();

    /* renamed from: f */
    public float f277345f;

    /* renamed from: g */
    public int f277346g = 120;

    public PhotosContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PhotosContent");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    /* renamed from: a */
    public void mo132425a(TagImageView tagImageView) {
        SnsMethodCalculate.markStartTimeMs("addImageview", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f277344e.add(tagImageView);
        SnsMethodCalculate.markEndTimeMs("addImageview", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    /* renamed from: b */
    public TagImageView mo132426b(int i) {
        SnsMethodCalculate.markStartTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        if (i < this.f277344e.size()) {
            TagImageView tagImageView = this.f277344e.get(i);
            SnsMethodCalculate.markEndTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return tagImageView;
        }
        SnsMethodCalculate.markEndTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        return null;
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void setImageViewWidth(int i) {
        SnsMethodCalculate.markStartTimeMs("setImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        if (i <= 0) {
            SnsMethodCalculate.markEndTimeMs("setImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        this.f277345f = f;
        int i2 = (int) (((float) this.f277346g) * f);
        this.f277346g = i2;
        if (i >= i2) {
            i = i2;
        }
        for (int i3 = 0; i3 < this.f277344e.size(); i3++) {
            View childAt = getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(childAt.getLayoutParams());
            marginLayoutParams.width = i;
            marginLayoutParams.height = i;
            float f2 = (float) i;
            float f3 = this.f277345f;
            marginLayoutParams.leftMargin = (int) (((float) (i3 % 3)) * ((f3 * 3.0f) + f2));
            marginLayoutParams.topMargin = (int) (((float) (i3 / 3)) * (f2 + (f3 * 3.0f)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 51;
            childAt.setLayoutParams(layoutParams);
        }
        int size = this.f277344e.size() / 3;
        if (size > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams2.height = (int) (((float) (i * size)) + (this.f277345f * 3.0f * ((float) (size - 1))));
            setLayoutParams(marginLayoutParams2);
        }
        SnsMethodCalculate.markEndTimeMs("setImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }
}
