package tt0;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: tt0.d */
public class C111053d extends FrameLayout {

    /* renamed from: p */
    public static final int f332557p = Color.parseColor("#000000");

    /* renamed from: q */
    public static final int f332558q = Color.parseColor("#000000");

    /* renamed from: d */
    public TextView f332559d;

    /* renamed from: e */
    public int f332560e = 0;

    /* renamed from: f */
    public int f332561f = 0;

    /* renamed from: g */
    public int f332562g;

    /* renamed from: h */
    public int f332563h;

    /* renamed from: i */
    public int f332564i;

    /* renamed from: j */
    public int f332565j;

    /* renamed from: n */
    public float f332566n = 0.0f;

    /* renamed from: o */
    public float f332567o = 0.0f;

    static {
        Color.parseColor("#000000");
    }

    public C111053d(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f332559d = new TextView(context);
        this.f332559d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(this.f332559d);
    }

    /* renamed from: a */
    public void mo162733a() {
        setText("");
        setTextSize(12);
        setTextColor(f332557p);
        setTextPadding(0);
        setGravity("center");
        int i = f332558q;
        mo162734b(0, 0, i, i);
    }

    /* renamed from: b */
    public void mo162734b(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) i);
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setColor(i4);
        this.f332559d.setBackgroundDrawable(gradientDrawable);
    }

    public float getAnchorX() {
        return this.f332566n;
    }

    public float getAnchorY() {
        return this.f332567o;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getChildAt(0).getLayoutParams();
        int i5 = this.f332560e;
        if (i5 >= 0 && this.f332561f >= 0) {
            layoutParams.gravity = 85;
        } else if (i5 >= 0 && this.f332561f <= 0) {
            layoutParams.gravity = 53;
        } else if (i5 <= 0 && this.f332561f >= 0) {
            layoutParams.gravity = 83;
        } else if (i5 <= 0 && this.f332561f <= 0) {
            layoutParams.gravity = 51;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f332562g = getMeasuredWidth();
        this.f332563h = getMeasuredHeight();
        int i3 = this.f332562g;
        int i4 = -i3;
        int i5 = this.f332560e;
        if (i4 < i5 && i5 < 0) {
            this.f332564i = i3;
            this.f332566n = ((float) Math.abs(i5)) / (((float) this.f332562g) * 1.0f);
        } else if (i5 >= 0) {
            this.f332564i = i3 + Math.abs(i5);
            this.f332566n = 0.0f;
        } else {
            this.f332564i = Math.abs(i5);
            this.f332566n = 1.0f;
        }
        int i6 = this.f332563h;
        int i7 = -i6;
        int i8 = this.f332561f;
        if (i7 < i8 && i8 < 0) {
            this.f332565j = i6;
            this.f332567o = ((float) Math.abs(i8)) / (((float) this.f332563h) * 1.0f);
        } else if (i8 >= 0) {
            this.f332565j = i6 + Math.abs(i8);
            this.f332567o = 0.0f;
        } else {
            this.f332565j = Math.abs(i8);
            this.f332567o = 1.0f;
        }
        setMeasuredDimension(this.f332564i, this.f332565j);
    }

    public void setGravity(String str) {
        this.f332559d.setGravity(17);
    }

    public void setText(String str) {
        this.f332559d.setText(str);
    }

    public void setTextColor(int i) {
        this.f332559d.setTextColor(i);
    }

    public void setTextPadding(int i) {
        this.f332559d.setPadding(i, i, i, i);
    }

    public void setTextSize(int i) {
        this.f332559d.setTextSize((float) i);
    }

    public void setX(int i) {
        this.f332560e = i;
    }

    public void setY(int i) {
        this.f332561f = i;
    }
}
