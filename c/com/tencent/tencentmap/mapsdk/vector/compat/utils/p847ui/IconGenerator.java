package com.tencent.tencentmap.mapsdk.vector.compat.utils.p847ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.wxmm.v2helper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.ui.IconGenerator */
public class IconGenerator {
    public static final int SQUARE_TEXT_VIEW_ID = new AtomicInteger(1).get();
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;

    /* renamed from: a */
    private final Context f320113a;

    /* renamed from: b */
    private ViewGroup f320114b;

    /* renamed from: c */
    private RotationLayout f320115c;

    /* renamed from: d */
    private TextView f320116d;

    /* renamed from: e */
    private View f320117e;

    /* renamed from: f */
    private int f320118f;

    /* renamed from: g */
    private float f320119g = 0.5f;

    /* renamed from: h */
    private float f320120h = 1.0f;

    public IconGenerator(Context context) {
        this.f320113a = context;
        ViewGroup a = m144659a();
        this.f320114b = a;
        this.f320115c = (RotationLayout) a.getChildAt(0);
        this.f320117e = this.f320116d;
        setStyle(1);
    }

    /* renamed from: a */
    private static int m144658a(int i) {
        return (i == 3 || i == 4 || i == 5 || i == 6 || i == 7) ? 1 : 0;
    }

    /* renamed from: a */
    private ViewGroup m144659a() {
        LinearLayout linearLayout = new LinearLayout(this.f320113a);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        RotationLayout rotationLayout = new RotationLayout(this.f320113a);
        this.f320115c = rotationLayout;
        rotationLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f320116d = new TextView(this.f320113a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        this.f320116d.setLayoutParams(layoutParams);
        this.f320116d.setPadding(10, 5, 10, 5);
        this.f320116d.setId(SQUARE_TEXT_VIEW_ID);
        this.f320115c.addView(this.f320116d);
        linearLayout.addView(this.f320115c);
        return linearLayout;
    }

    public float getAnchorU() {
        return m144657a(this.f320119g, this.f320120h);
    }

    public float getAnchorV() {
        return m144657a(this.f320120h, this.f320119g);
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.f320116d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public void setBackground(Drawable drawable) {
        this.f320114b.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.f320114b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.f320114b.setPadding(0, 0, 0, 0);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f320117e.setPadding(i, i2, i3, i4);
    }

    public void setContentRotation(int i) {
        this.f320115c.setViewRotation(i);
    }

    public void setContentView(View view) {
        this.f320115c.removeAllViews();
        this.f320115c.addView(view);
        this.f320117e = view;
        View findViewById = this.f320115c.findViewById(SQUARE_TEXT_VIEW_ID);
        this.f320116d = findViewById instanceof TextView ? (TextView) findViewById : null;
    }

    public void setRotation(int i) {
        this.f320118f = ((i + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1) / 90;
    }

    public void setStyle(int i) {
        setTextAppearance(this.f320113a, m144658a(i));
        if (i == 0) {
            setTextAppearance(16973892, -8421505, 14.0f, 0);
        } else if (i == 1) {
            setTextAppearance(16973892, -1118482, 14.0f, 0);
        }
    }

    public void setTextAppearance(Context context, int i) {
        TextView textView = this.f320116d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTextAppearance(int i, int i2, float f, int i3) {
        setTextAppearance(this.f320113a, i);
        this.f320116d.setTextColor(i2);
        this.f320116d.setTextSize(f);
        TextView textView = this.f320116d;
        textView.setTypeface(textView.getTypeface(), i3);
    }

    public Bitmap makeIcon() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f320114b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f320114b.getMeasuredWidth();
        int measuredHeight = this.f320114b.getMeasuredHeight();
        this.f320114b.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f320118f;
        if (i == 1 || i == 3) {
            measuredHeight = this.f320114b.getMeasuredWidth();
            measuredWidth = this.f320114b.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = this.f320118f;
        if (i2 != 0) {
            if (i2 == 1) {
                canvas.translate((float) measuredWidth, 0.0f);
                canvas.rotate(90.0f);
            } else if (i2 == 2) {
                canvas.rotate(180.0f, (float) (measuredWidth / 2), (float) (measuredHeight / 2));
            } else {
                canvas.translate(0.0f, (float) measuredHeight);
                canvas.rotate(270.0f);
            }
        }
        this.f320114b.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    private float m144657a(float f, float f2) {
        int i = this.f320118f;
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            return 1.0f - f2;
        }
        if (i == 2) {
            return 1.0f - f;
        }
        if (i == 3) {
            return f2;
        }
        throw new IllegalStateException();
    }
}
