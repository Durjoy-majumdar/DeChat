package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.tools.CustomFitTextView */
public class CustomFitTextView extends TextView {

    /* renamed from: d */
    public Paint f220004d;

    /* renamed from: e */
    public String f220005e;

    /* renamed from: f */
    public Rect f220006f = new Rect();

    /* renamed from: g */
    public LinkedList<String> f220007g = new LinkedList<>();

    /* renamed from: h */
    public int f220008h;

    /* renamed from: i */
    public int f220009i;

    /* renamed from: j */
    public Drawable f220010j;

    /* renamed from: n */
    public boolean f220011n;

    /* renamed from: o */
    public boolean f220012o = true;

    /* renamed from: p */
    public int f220013p = 0;

    public CustomFitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final int mo104013a() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return ((int) ((((float) this.f220007g.size()) * ((fontMetrics.bottom - fontMetrics.top) + fontMetrics.leading)) + ((float) getPaddingTop()) + ((float) getPaddingBottom()))) + (Math.max(0, this.f220007g.size() - 1) * this.f220013p);
    }

    /* renamed from: b */
    public final int mo104014b(String str, int i, int i2, int i3, int i4) {
        if (i2 <= i) {
            return i + 1;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        if (getPaint().measureText(str, i, i2) + f < f2) {
            return i2;
        }
        int length = str.length();
        while (getPaint().measureText(str, i, i2) + f > f2) {
            i2 = (i2 + i) >> 1;
        }
        while (i2 <= length && getPaint().measureText(str, i, i2) + f < f2) {
            i2++;
        }
        int min = Math.min(length, i2) - 1;
        int i5 = min;
        while (i5 >= 0 && Util.isAlpha(str.charAt(i5))) {
            i5--;
        }
        return (i5 < 0 || i5 == min) ? i2 - 1 : i5 + 1;
    }

    /* renamed from: c */
    public final boolean mo104015c(String str, int i) {
        if (!this.f220012o || i <= 0 || str == null || "".equals(str)) {
            return false;
        }
        this.f220007g.clear();
        int length = str.length();
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        int intrinsicWidth = this.f220011n ? this.f220010j.getIntrinsicWidth() : 0;
        float measureText = getPaint().measureText(str, 0, length) + ((float) intrinsicWidth);
        int i2 = this.f220008h;
        if (Float.compare(measureText, (float) (i2 * paddingLeft)) < 0) {
            i2 = (int) Math.ceil((double) (measureText / ((float) paddingLeft)));
        }
        int i3 = i2;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i3 - 1) {
                String trim = str.substring(i4, mo104014b(str, i4, length, intrinsicWidth, paddingLeft)).trim();
                if (!(this.f220007g == null || trim == null || "".equals(trim))) {
                    this.f220007g.add(trim);
                }
            } else {
                int b = mo104014b(str, i4, length, 0, paddingLeft);
                String trim2 = str.substring(i4, b).trim();
                if (!(this.f220007g == null || trim2 == null || "".equals(trim2))) {
                    this.f220007g.add(trim2);
                }
                if (b >= length) {
                    Log.m105928w("MicroMsg.CustomFitTextView", "not match last line, but match text length end");
                    return true;
                }
                i4 = b;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo104016d(String str, int i, boolean z, int i2, int i3) {
        this.f220008h = i;
        this.f220005e = str;
        if (str == null) {
            Log.m105928w("MicroMsg.CustomFitTextView", "ori text is null");
            this.f220005e = "";
        }
        if (this.f220008h <= 0) {
            Log.m105928w("MicroMsg.CustomFitTextView", "maxLines is invalid");
            this.f220008h = 2;
        }
        this.f220013p = getResources().getDimensionPixelSize(C0966R.dimen.f3623g);
        this.f220011n = z;
        this.f220009i = i2;
        if (z) {
            this.f220010j = getResources().getDrawable(this.f220009i);
        }
        Paint paint = new Paint();
        this.f220004d = paint;
        paint.set(getPaint());
        this.f220004d.setAntiAlias(true);
        this.f220004d.setColor(i3);
        mo104015c(this.f220005e, getWidth());
        setHeight(Math.max(mo104013a(), C76577a.m92151b(getContext(), 32)));
    }

    public void onDraw(Canvas canvas) {
        String str;
        if (this.f220012o && (str = this.f220005e) != null && !"".equals(str) && this.f220007g.size() != 0) {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            float f = fontMetrics.descent - fontMetrics.ascent;
            float paddingLeft = (float) getPaddingLeft();
            float paddingTop = (float) getPaddingTop();
            Iterator<String> it = this.f220007g.iterator();
            while (it.hasNext()) {
                paddingTop += fontMetrics.leading + f;
                canvas.drawText(it.next(), paddingLeft, paddingTop, this.f220004d);
            }
            if (this.f220011n) {
                getPaint().getTextBounds(this.f220007g.getLast(), 0, this.f220007g.getLast().length(), this.f220006f);
                int paddingLeft2 = getPaddingLeft() + this.f220006f.right;
                int i = (int) ((paddingTop - f) - fontMetrics.leading);
                this.f220010j.setBounds(paddingLeft2, i, this.f220010j.getIntrinsicWidth() + paddingLeft2, this.f220010j.getIntrinsicHeight() + i);
                this.f220010j.draw(canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int b = C76577a.m92151b(getContext(), 32);
        if (mo104015c(this.f220005e, size)) {
            b = Math.max(mo104013a(), b);
        }
        setMeasuredDimension(size, b);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z = (i == i3 && i2 == i4) ? false : true;
        this.f220012o = z;
        if (z) {
            mo104015c(this.f220005e, i);
        }
    }

    public CustomFitTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
