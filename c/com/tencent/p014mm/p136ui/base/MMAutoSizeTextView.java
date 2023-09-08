package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.MMAutoSizeTextView */
public class MMAutoSizeTextView extends TextView {

    /* renamed from: d */
    public float f214761d;

    /* renamed from: e */
    public float f214762e;

    /* renamed from: f */
    public Paint f214763f;

    /* renamed from: g */
    public float f214764g;

    public MMAutoSizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101640b();
    }

    /* renamed from: a */
    public final void mo101639a(String str, int i) {
        Log.m105925i("MicroMsg.MMAutoSizeTextView", "autoAdjustTextSize[text=%s, viewWidth=%d]", str, Integer.valueOf(i));
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float textSize = getTextSize();
            this.f214764g = textSize;
            if (textSize <= this.f214761d) {
                this.f214764g = this.f214762e;
            }
            float f = this.f214764g;
            this.f214763f.setTextSize(f);
            while (true) {
                if (f <= this.f214761d || this.f214763f.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f -= 1.0f;
                float f2 = this.f214761d;
                if (f <= f2) {
                    f = f2;
                    break;
                }
                this.f214763f.setTextSize(f);
            }
            Log.m105925i("MicroMsg.MMAutoSizeTextView", "try size[%f], maxSize[%f], measureTextSize[%f], availableWidth[%d]", Float.valueOf(f), Float.valueOf(this.f214764g), Float.valueOf(this.f214763f.measureText(str)), Integer.valueOf(paddingLeft));
            setTextSize(0, f);
        }
    }

    /* renamed from: b */
    public final void mo101640b() {
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
        this.f214761d = (float) C76577a.m92151b(getContext(), 8);
        this.f214762e = (float) C76577a.m92151b(getContext(), 22);
        Paint paint = new Paint();
        this.f214763f = paint;
        paint.set(getPaint());
        float textSize = getTextSize();
        this.f214764g = textSize;
        if (textSize <= this.f214761d) {
            this.f214764g = this.f214762e;
        }
    }

    public int getBaseline() {
        try {
            return super.getBaseline();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMAutoSizeTextView", th, "", new Object[0]);
            return -1;
        }
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMAutoSizeTextView", th, "", new Object[0]);
        }
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMAutoSizeTextView", th, "", new Object[0]);
        }
    }

    public boolean onPreDraw() {
        try {
            return super.onPreDraw();
        } catch (Throwable unused) {
            return true;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Log.m105928w("MicroMsg.MMAutoSizeTextView", "on size changed");
        if (i != i3) {
            mo101639a(getText().toString(), i);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Log.m105928w("MicroMsg.MMAutoSizeTextView", "on text changed");
        super.onTextChanged(charSequence, i, i2, i3);
        mo101639a(charSequence.toString(), getWidth());
    }

    public MMAutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101640b();
    }
}
