package com.tencent.p014mm.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import p385u2.C111105a;
import zp3.C79406f;

/* renamed from: com.tencent.mm.view.PhotoEditText */
public class PhotoEditText extends AppCompatEditText {

    /* renamed from: d */
    public Paint f319849d = new Paint(1);

    /* renamed from: e */
    public Xfermode f319850e;

    /* renamed from: f */
    public int f319851f;

    /* renamed from: g */
    public TextView f319852g;

    /* renamed from: h */
    public boolean f319853h = false;

    public PhotoEditText(Context context) {
        super(context);
        this.f319852g = new TextView(context);
        mo154776a();
    }

    /* renamed from: a */
    public final void mo154776a() {
        new TextView(getContext()).setTextSize(getTextSize());
        this.f319850e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        TextPaint paint = this.f319852g.getPaint();
        paint.setStrokeWidth((float) C79406f.m96347a(getContext(), 4.0f));
        paint.setStyle(Paint.Style.STROKE);
        if (getCurrentTextColor() == -1 || getCurrentTextColor() == -16777216) {
            this.f319852g.setTextColor(C111105a.m151500b(getContext(), C0966R.color.an6));
        } else {
            this.f319852g.setTextColor(C85875k4.m106183g0(getCurrentTextColor(), -16777216, 0.5f));
        }
        this.f319852g.setGravity(getGravity());
        if (Build.VERSION.SDK_INT >= 23) {
            this.f319852g.setBreakStrategy(getBreakStrategy());
        }
        this.f319852g.setTextSize(0, getTextSize());
    }

    public void onDraw(Canvas canvas) {
        if (getLayout() == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f319851f != 0) {
            canvas.saveLayerAlpha((RectF) null, (int) (getAlpha() * 255.0f), 31);
            this.f319849d.setColor(this.f319851f);
            this.f319849d.setAntiAlias(true);
            Rect rect = new Rect();
            getLineBounds(0, rect);
            if (getLineCount() == 1) {
                rect.right = (int) (((float) rect.left) + getLayout().getLineWidth(0));
            } else {
                float f = 0.0f;
                for (int i = 0; i < getLineCount(); i++) {
                    float lineWidth = getLayout().getLineWidth(i);
                    if (f < lineWidth) {
                        f = lineWidth;
                    }
                }
                rect.right = (int) (((float) rect.left) + f);
                rect.bottom = rect.top + getLayout().getLineBottom(getLineCount() - 1);
            }
            rect.left = (int) (((float) rect.left) - 18.0f);
            rect.right = (int) (((float) rect.right) + 18.0f);
            if (getLineCount() != 1) {
                this.f319849d.setXfermode((Xfermode) null);
                this.f319849d.setColor(this.f319851f);
                canvas.drawRoundRect(new RectF(rect), 12.0f, 12.0f, this.f319849d);
                if (getLayout().getLineWidth(getLineCount() - 1) < getLayout().getLineWidth(getLineCount() - 2)) {
                    this.f319849d.setXfermode(this.f319850e);
                    RectF rectF = new RectF();
                    rectF.left = ((float) rect.left) + 36.0f + getLayout().getLineWidth(getLineCount() - 1);
                    rectF.top = (float) (rect.bottom - getLineHeight());
                    rectF.right = ((float) rect.right) + 18.0f;
                    rectF.bottom = ((float) rect.bottom) + 18.0f;
                    canvas.drawRoundRect(rectF, 12.0f, 12.0f, this.f319849d);
                    this.f319849d.setXfermode(this.f319850e);
                    canvas.drawRect(new Rect((int) (rectF.left - (getTextSize() / 2.0f)), (int) (rectF.bottom - (getTextSize() / 2.0f)), (int) rectF.left, (int) rectF.bottom), this.f319849d);
                    canvas.drawRect(new Rect((int) (((float) rect.right) - (getTextSize() / 2.0f)), (int) (((float) (rect.top + getLayout().getLineBottom(getLineCount() - 2))) - (getTextSize() / 2.0f)), rect.right, rect.top + getLayout().getLineBottom(getLineCount() - 2) + 3), this.f319849d);
                    this.f319849d.setXfermode((Xfermode) null);
                    float textSize = rectF.left - getTextSize();
                    int i2 = rect.left;
                    if (textSize < ((float) i2)) {
                        textSize = (float) i2;
                    }
                    canvas.drawRoundRect(new RectF(new Rect((int) textSize, (int) (((float) rect.bottom) - (getTextSize() / 2.0f)), (int) rectF.left, rect.bottom)), 12.0f, 12.0f, this.f319849d);
                    canvas.drawRoundRect(new RectF(new Rect((int) (((float) rect.right) - getTextSize()), (int) (((float) (rect.bottom - getLineHeight())) - getTextSize()), rect.right, rect.bottom - getLineHeight())), 12.0f, 12.0f, this.f319849d);
                }
            } else if (!TextUtils.isEmpty(getText())) {
                this.f319849d.setXfermode((Xfermode) null);
                canvas.drawRoundRect(new RectF(rect), 12.0f, 12.0f, this.f319849d);
            }
            canvas.restore();
        }
        if (this.f319853h) {
            this.f319852g.draw(canvas);
            Paint.Style style = this.f319852g.getPaint().getStyle();
            Log.m105918d("PhotoEditText", "style " + style.name());
        }
        super.onDraw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.f319852g;
        if (textView != null) {
            textView.layout(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextView textView = this.f319852g;
        if (textView != null) {
            CharSequence text = textView.getText();
            if (text == null || !text.equals(getText())) {
                this.f319852g.setText(getText());
                postInvalidate();
            }
            this.f319852g.measure(i, i2);
        }
    }

    public void setEnableStoke(boolean z) {
        this.f319853h = z;
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        TextView textView = this.f319852g;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
    }

    public void setMaxWidth(int i) {
        TextView textView = this.f319852g;
        if (textView != null) {
            textView.setMaxWidth(i);
        }
        super.setMaxWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        TextView textView = this.f319852g;
        if (textView != null) {
            textView.setPadding(i, i2, i3, i4);
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setSingleLine(boolean z) {
        TextView textView = this.f319852g;
        if (textView != null) {
            textView.setSingleLine(z);
        }
        super.setSingleLine(z);
    }

    public void setTextBackground(int i) {
        this.f319851f = i;
        invalidate();
    }

    public void setTextColor(int i) {
        TextView textView = this.f319852g;
        if (textView != null) {
            if (i == -1 || i == -16777216) {
                textView.setTextColor(C111105a.m151500b(getContext(), C0966R.color.an6));
            } else {
                textView.setTextColor(C85875k4.m106183g0(i, -16777216, 0.5f));
            }
        }
        super.setTextColor(i);
    }

    public void setTextSize(float f) {
        TextView textView = this.f319852g;
        if (textView != null) {
            textView.setTextSize(f);
        }
        super.setTextSize(f);
    }

    public void setTypeface(Typeface typeface, int i) {
        TextView textView = this.f319852g;
        if (textView != null) {
            textView.setTypeface(typeface, i);
        }
        super.setTypeface(typeface, i);
    }

    public PhotoEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f319852g = new TextView(context, attributeSet);
        mo154776a();
    }
}
