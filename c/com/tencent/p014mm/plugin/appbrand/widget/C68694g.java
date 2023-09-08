package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.g */
public class C68694g extends AppCompatButton {

    /* renamed from: f */
    public final boolean f197344f;

    /* renamed from: g */
    public RectF f197345g;

    /* renamed from: h */
    public boolean f197346h;

    /* renamed from: i */
    public float f197347i;

    /* renamed from: j */
    public float f197348j;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.g$b */
    public static class C68696b extends Drawable {

        /* renamed from: a */
        public Paint f197349a = new Paint(1);

        /* renamed from: b */
        public RectF f197350b = new RectF();

        /* renamed from: c */
        public Rect f197351c = new Rect();

        public C68696b(C68695a aVar) {
            this.f197349a.setColor(-12748166);
            this.f197349a.setStyle(Paint.Style.FILL);
        }

        public void draw(Canvas canvas) {
            int i;
            int i2;
            if (this.f197351c.width() <= 0 || this.f197351c.height() <= 0) {
                i2 = canvas.getWidth();
                i = canvas.getHeight();
            } else {
                i2 = this.f197351c.width();
                i = this.f197351c.height();
            }
            float f = (float) i;
            float f2 = f / 2.0f;
            RectF rectF = this.f197350b;
            rectF.top = 0.0f;
            rectF.left = 0.0f;
            float f3 = 2.0f * f2;
            rectF.bottom = f3;
            rectF.right = f3;
            canvas.drawArc(rectF, 90.0f, 180.0f, false, this.f197349a);
            RectF rectF2 = this.f197350b;
            float f4 = (float) i2;
            rectF2.left = f4 - f3;
            rectF2.top = 0.0f;
            rectF2.right = f4;
            rectF2.bottom = f;
            canvas.drawArc(rectF2, -90.0f, 180.0f, false, this.f197349a);
            canvas.drawRect(f2 - 1.0f, 0.0f, (f4 - f2) + 1.0f, f, this.f197349a);
        }

        public int getOpacity() {
            return -1;
        }

        public void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            Rect rect2 = this.f197351c;
            rect2.left = rect.left;
            rect2.right = rect.right;
            rect2.top = rect.top;
            rect2.bottom = rect.bottom;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public C68694g(Context context, boolean z) {
        super(context, (AttributeSet) null);
        this.f197344f = z;
        setGravity(17);
        setText("vConsole");
        setTextColor(-1);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (13.0f * f);
        setPadding(i, (int) (4.0f * f), i, (int) (f * 6.0f));
        setBackgroundDrawable(new C68696b((C68695a) null));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getBackground() == null) {
            setBackground(new C68696b((C68695a) null));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelPendingInputEvents();
        this.f197346h = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0065
            if (r0 == r3) goto L_0x004a
            if (r0 == r2) goto L_0x000f
            goto L_0x00af
        L_0x000f:
            boolean r0 = r8.f197346h
            if (r0 != 0) goto L_0x0026
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r4 = r8.f197345g
            if (r4 != 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            boolean r1 = r4.contains(r0, r2)
        L_0x0024:
            if (r1 != 0) goto L_0x00af
        L_0x0026:
            float r0 = r8.getX()
            float r1 = r9.getRawX()
            float r2 = r8.f197347i
            float r1 = r1 - r2
            float r0 = r0 + r1
            r8.setX(r0)
            float r0 = r8.getY()
            float r1 = r9.getRawY()
            float r2 = r8.f197348j
            float r1 = r1 - r2
            float r0 = r0 + r1
            r8.setY(r0)
            r8.requestLayout()
            r8.f197346h = r3
            goto L_0x00af
        L_0x004a:
            boolean r0 = r8.f197346h
            if (r0 != 0) goto L_0x00af
            float r0 = r9.getRawX()
            float r2 = r9.getRawY()
            android.graphics.RectF r4 = r8.f197345g
            if (r4 != 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            boolean r1 = r4.contains(r0, r2)
        L_0x005f:
            if (r1 == 0) goto L_0x00af
            r8.performClick()
            goto L_0x00af
        L_0x0065:
            boolean r0 = r8.f197344f
            if (r0 == 0) goto L_0x008d
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r8.getX()
            float r4 = r8.getY()
            float r5 = r8.getX()
            int r6 = r8.getWidth()
            float r6 = (float) r6
            float r5 = r5 + r6
            float r6 = r8.getY()
            int r7 = r8.getHeight()
            float r7 = (float) r7
            float r6 = r6 + r7
            r0.<init>(r2, r4, r5, r6)
            r8.f197345g = r0
            goto L_0x00ad
        L_0x008d:
            int[] r0 = new int[r2]
            r8.getLocationInWindow(r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            r4 = r0[r1]
            float r5 = (float) r4
            r6 = r0[r3]
            float r6 = (float) r6
            int r7 = r8.getWidth()
            int r4 = r4 + r7
            float r4 = (float) r4
            r0 = r0[r3]
            int r7 = r8.getHeight()
            int r0 = r0 + r7
            float r0 = (float) r0
            r2.<init>(r5, r6, r4, r0)
            r8.f197345g = r2
        L_0x00ad:
            r8.f197346h = r1
        L_0x00af:
            float r0 = r9.getRawX()
            r8.f197347i = r0
            float r9 = r9.getRawY()
            r8.f197348j = r9
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.widget.C68694g.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
