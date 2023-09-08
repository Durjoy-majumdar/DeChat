package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooterBottom */
public class ChatFooterBottom extends FrameLayout {

    /* renamed from: d */
    public boolean f212076d = false;

    public ChatFooterBottom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return super.getLayoutParams();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105919d("MicroMsg.ChatFooterBottom", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        Log.m105919d("MicroMsg.ChatFooterBottom", "jacks onMeasure  width:%d, height:%d, isHide: %B", Integer.valueOf(View.MeasureSpec.getSize(i)), Integer.valueOf(View.MeasureSpec.getSize(i2)), Boolean.valueOf(this.f212076d));
        if (this.f212076d) {
            setVisibility(8);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i = makeMeasureSpec;
        }
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Log.m105919d("MicroMsg.ChatFooterBottom", "jacks onSizeChanged  w:%d, h:%d, oldw:%d, oldh:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setIsHide(boolean z) {
        this.f212076d = z;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
        if (i == 0) {
            this.f212076d = false;
        }
        super.setVisibility(i);
    }

    public ChatFooterBottom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
