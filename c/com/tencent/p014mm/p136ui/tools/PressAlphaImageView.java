package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.ui.tools.PressAlphaImageView */
public class PressAlphaImageView extends WeImageView {

    /* renamed from: r */
    public float f24736r = 0.7f;

    public PressAlphaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnTouchListener(new C7005b1(this));
    }

    @Deprecated
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        Assert.assertTrue(false);
    }

    public void setPressAlpha(float f) {
        this.f24736r = f;
    }
}
