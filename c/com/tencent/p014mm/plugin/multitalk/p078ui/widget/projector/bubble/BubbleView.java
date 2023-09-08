package com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.bubble;

import a82.C0016a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import v82.C111418b0;
import y82.C79060a;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.projector.bubble.BubbleView */
public class BubbleView extends RelativeLayout implements Runnable {

    /* renamed from: d */
    public TextView f19998d;

    /* renamed from: e */
    public Context f19999e;

    /* renamed from: f */
    public C4894a f20000f;

    /* renamed from: g */
    public float f20001g;

    /* renamed from: h */
    public RelativeLayout f20002h;

    /* renamed from: i */
    public ImageView f20003i;

    /* renamed from: j */
    public int f20004j;

    /* renamed from: n */
    public float f20005n = 0.0f;

    /* renamed from: o */
    public float f20006o = 0.0f;

    /* renamed from: p */
    public float f20007p = 0.0f;

    /* renamed from: q */
    public int f20008q = -1;

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.projector.bubble.BubbleView$a */
    public enum C4894a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5817a(context, attributeSet, 0);
    }

    private void setCurDirection(int i) {
        if (i == 1) {
            this.f20000f = C4894a.LEFT;
        } else if (i == 2) {
            this.f20000f = C4894a.TOP;
        } else if (i == 3) {
            this.f20000f = C4894a.RIGHT;
        } else if (i == 4) {
            this.f20000f = C4894a.BOTTOM;
        }
    }

    private void setRelativePosition(float f) {
        if (f < 0.2f) {
            this.f20001g = 0.2f;
        } else if (f > 0.8f) {
            this.f20001g = 0.8f;
        } else {
            this.f20001g = f;
        }
    }

    /* renamed from: a */
    public final void mo5817a(Context context, AttributeSet attributeSet, int i) {
        int i2;
        this.f19999e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0016a.f17a);
        float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f20004j = obtainStyledAttributes.getColor(4, 0);
        this.f20005n = obtainStyledAttributes.getDimension(2, 0.0f);
        this.f20006o = obtainStyledAttributes.getDimension(0, 0.0f);
        int color = obtainStyledAttributes.getColor(7, 0);
        float dimension2 = obtainStyledAttributes.getDimension(8, 0.0f);
        String string = obtainStyledAttributes.getString(6);
        this.f20008q = obtainStyledAttributes.getResourceId(1, -1);
        setCurDirection(obtainStyledAttributes.getInt(3, 3));
        setRelativePosition(obtainStyledAttributes.getFraction(12, 1, 1, 0.3f));
        setCurThemeStyle(color);
        this.f20007p = obtainStyledAttributes.getDimension(10, 0.0f);
        obtainStyledAttributes.recycle();
        int i3 = this.f20004j;
        RelativeLayout relativeLayout = new RelativeLayout(this.f19999e);
        this.f20002h = relativeLayout;
        relativeLayout.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) this.f20007p);
        this.f20002h.setBackground(new C79060a(i3, dimension));
        TextView textView = new TextView(this.f19999e);
        this.f19998d = textView;
        textView.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17);
        int i4 = C111418b0.f333542c;
        layoutParams2.setMarginStart(i4);
        layoutParams2.setMarginEnd(i4);
        layoutParams2.topMargin = i4;
        layoutParams2.bottomMargin = i4;
        this.f19998d.setLayoutParams(layoutParams2);
        this.f19998d.setTextColor(color);
        this.f19998d.setTextSize((float) Math.round(((float) ((int) dimension2)) / C74942w4.m89787d(this.f19999e)));
        this.f19998d.setText(string);
        this.f20002h.addView(this.f19998d);
        ImageView imageView = new ImageView(this.f19999e);
        this.f20003i = imageView;
        imageView.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) this.f20005n, (int) this.f20006o);
        int ordinal = this.f20000f.ordinal();
        if (ordinal == 0) {
            i2 = 90;
            layoutParams.addRule(17, this.f20003i.getId());
        } else if (ordinal == 1) {
            i2 = 180;
            layoutParams.addRule(3, this.f20003i.getId());
        } else if (ordinal != 3) {
            i2 = 270;
            layoutParams3.addRule(17, this.f20002h.getId());
        } else {
            layoutParams3.addRule(3, this.f20002h.getId());
            i2 = 0;
        }
        Context context2 = this.f19999e;
        Drawable e = C74933u4.m89768e(context2, this.f20008q, context2.getResources().getColor(C0966R.color.f2975b6));
        int i5 = (int) this.f20005n;
        int i6 = (int) this.f20006o;
        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        e.setBounds(0, 0, i5, i6);
        e.draw(canvas);
        this.f20003i.setImageDrawable(new BitmapDrawable(BitmapUtil.rotate(createBitmap, (float) i2)));
        addView(this.f20003i, layoutParams3);
        addView(this.f20002h, layoutParams);
        this.f20002h.post(this);
        setClickable(true);
    }

    public float getRelative() {
        return this.f20001g;
    }

    public void run() {
        int width = this.f20002h.getWidth();
        int height = this.f20002h.getHeight();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20003i.getLayoutParams();
        int ordinal = this.f20000f.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            layoutParams.setMargins((int) ((((float) width) * this.f20001g) - ((float) (this.f20003i.getWidth() / 2))), 0, 0, 0);
        } else {
            layoutParams.setMargins(0, (int) ((((float) height) * this.f20001g) - ((float) (this.f20003i.getHeight() / 2))), 0, 0);
        }
        this.f20003i.setLayoutParams(layoutParams);
    }

    public void setCurThemeStyle(int i) {
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5817a(context, attributeSet, i);
    }
}
