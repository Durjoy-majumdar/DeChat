package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.accessibility.core.provider.TypeModifier;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.MMVerticalTextView */
public class MMVerticalTextView extends View {

    /* renamed from: d */
    public TextPaint f214973d;

    /* renamed from: e */
    public String f214974e;

    /* renamed from: f */
    public Rect f214975f = new Rect();

    /* renamed from: g */
    public int f214976g;

    /* renamed from: h */
    public int f214977h = 0;

    public MMVerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint();
        this.f214973d = textPaint;
        textPaint.setAntiAlias(true);
        this.f214973d.setTextSize(15.0f);
        this.f214973d.setColor(-16777216);
        this.f214973d.setTextAlign(Paint.Align.CENTER);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226854I);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.f214974e = context.getString(resourceId);
        }
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 15);
        if (dimensionPixelOffset > 0) {
            this.f214973d.setTextSize((float) dimensionPixelOffset);
        }
        this.f214973d.setColor(obtainStyledAttributes.getColor(3, -16777216));
        this.f214976g = obtainStyledAttributes.getInt(0, 0);
        this.f214973d.setFakeBoldText(obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
        requestLayout();
        invalidate();
    }

    public float getTextSize() {
        return this.f214973d.getTextSize();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        Path path = new Path();
        int i = 0;
        if (this.f214976g == 0) {
            float f = (float) 0;
            path.moveTo(f, f);
            path.lineTo(f, (float) height);
            i = (getWidth() - this.f214975f.height()) / 2;
        } else {
            float width = (float) ((getWidth() >> 1) + (this.f214975f.height() >> 1));
            path.moveTo(width, (float) height);
            path.lineTo(width, (float) 0);
        }
        canvas.drawTextOnPath(this.f214974e, path, 0.0f, (float) (-i), this.f214973d);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int i = this.f214977h;
        if (i == 0) {
            accessibilityNodeInfo.setClassName(TypeModifier.TEXTVIEW_CLASS);
        } else if (i == 1) {
            accessibilityNodeInfo.setClassName(TypeModifier.BUTTON_CLASS);
        }
    }

    public void onMeasure(int i, int i2) {
        TextPaint textPaint = this.f214973d;
        String str = this.f214974e;
        textPaint.getTextBounds(str, 0, str.length(), this.f214975f);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i3 = (int) (this.f214973d.getFontMetrics().bottom - this.f214973d.getFontMetrics().top);
            size = mode == Integer.MIN_VALUE ? Math.min(i3, size) : i3;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int ceil = (int) Math.ceil((double) this.f214973d.measureText(this.f214974e));
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(ceil, size2) : ceil;
        }
        setMeasuredDimension(size, size2);
    }

    public void setAccessibilityViewType(int i) {
        this.f214977h = i;
    }

    public void setMediumBold(boolean z) {
        this.f214973d.setFakeBoldText(z);
    }

    public void setText(String str) {
        this.f214974e = str;
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i) {
        this.f214973d.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        this.f214973d.setTextSize((float) i);
        requestLayout();
        invalidate();
    }

    public void setTextSize(float f) {
        this.f214973d.setTextSize(f);
        requestLayout();
        invalidate();
    }
}
