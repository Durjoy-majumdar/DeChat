package cr2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import cr2.C97358b;

/* renamed from: cr2.a */
public abstract class C97357a extends C97358b {

    /* renamed from: f */
    public FrameLayout f285835f;

    public C97357a(Context context, FrameLayout frameLayout, C97358b.C97359a aVar) {
        super(context, aVar);
        this.f285835f = frameLayout;
        mo136629b();
    }

    /* renamed from: a */
    public void mo136626a(Rect rect) {
        SnsMethodCalculate.markStartTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
        ImageView imageView = new ImageView(this.f285839d);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int abs = Math.abs(rect.right - rect.left);
        int abs2 = Math.abs(rect.top - rect.bottom);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(abs, abs2);
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        imageView.setImageBitmap(this.f285836a.f285841a);
        this.f285835f.addView(imageView, layoutParams);
        mo136628f(imageView, (abs / 2) + rect.left, rect.top + (abs2 / 2), abs, abs2);
        SnsMethodCalculate.markEndTimeMs("addNewSprite", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
    }

    /* renamed from: c */
    public void mo136627c() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
        synchronized (this) {
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
            this.f285840e.clear();
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseScene");
        }
        this.f285835f.removeAllViews();
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.BaseAnimScene");
    }

    /* renamed from: f */
    public abstract void mo136628f(View view, int i, int i2, int i3, int i4);
}
