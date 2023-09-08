package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.ui.tools.PressImageView */
public class PressImageView extends ImageView {

    /* renamed from: d */
    public MMHandler f285327d = new MMHandler();

    /* renamed from: e */
    public Runnable f285328e = new C97241d1(this);

    /* renamed from: f */
    public int f285329f = 90;

    public PressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnTouchListener(new C97242e1(this));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.f285329f, 0, 0, 0);
        }
    }

    @Deprecated
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        Assert.assertTrue(false);
    }
}
