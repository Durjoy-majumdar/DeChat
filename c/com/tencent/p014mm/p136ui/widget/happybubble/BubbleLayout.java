package com.tencent.p014mm.p136ui.widget.happybubble;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kg3.C76577a;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.widget.happybubble.BubbleLayout */
public class BubbleLayout extends FrameLayout {

    /* renamed from: A */
    public int f56513A;

    /* renamed from: B */
    public C19856b f56514B;

    /* renamed from: C */
    public Region f56515C;

    /* renamed from: d */
    public Paint f56516d;

    /* renamed from: e */
    public Paint f56517e;

    /* renamed from: f */
    public Path f56518f;

    /* renamed from: g */
    public Path f56519g;

    /* renamed from: h */
    public C19855a f56520h;

    /* renamed from: i */
    public int f56521i;

    /* renamed from: j */
    public int f56522j;

    /* renamed from: n */
    public int f56523n;

    /* renamed from: o */
    public int f56524o;

    /* renamed from: p */
    public int f56525p;

    /* renamed from: q */
    public int f56526q;

    /* renamed from: r */
    public int f56527r;

    /* renamed from: s */
    public int f56528s;

    /* renamed from: t */
    public int f56529t;

    /* renamed from: u */
    public int f56530u;

    /* renamed from: v */
    public int f56531v;

    /* renamed from: w */
    public int f56532w;

    /* renamed from: x */
    public int f56533x;

    /* renamed from: y */
    public int f56534y;

    /* renamed from: z */
    public int f56535z;

    /* renamed from: com.tencent.mm.ui.widget.happybubble.BubbleLayout$a */
    public enum C19855a {
        LEFT(1),
        TOP(2),
        RIGHT(3),
        BOTTOM(4);

        /* access modifiers changed from: public */
        C19855a(int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.happybubble.BubbleLayout$b */
    public interface C19856b {
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo26417a() {
        this.f56516d.setPathEffect(new CornerPathEffect((float) this.f56535z));
        this.f56516d.setShadowLayer((float) this.f56532w, (float) this.f56533x, (float) this.f56534y, this.f56531v);
        int i = this.f56521i;
        C19855a aVar = this.f56520h;
        int i2 = 0;
        this.f56524o = (aVar == C19855a.LEFT ? this.f56530u : 0) + i;
        this.f56525p = (aVar == C19855a.TOP ? this.f56530u : 0) + i;
        this.f56526q = (this.f56522j - i) - (aVar == C19855a.RIGHT ? this.f56530u : 0);
        int i3 = this.f56523n - i;
        if (aVar == C19855a.BOTTOM) {
            i2 = this.f56530u;
        }
        this.f56527r = i3 - i2;
        this.f56516d.setColor(this.f56513A);
        this.f56517e.setColor(this.f56513A);
        this.f56518f.reset();
        this.f56519g.reset();
        int i4 = this.f56528s;
        int i5 = this.f56530u;
        int i6 = i4 + i5;
        int i7 = this.f56527r;
        int i8 = i6 > i7 ? i7 - this.f56529t : i4;
        int i9 = this.f56521i;
        if (i8 <= i9) {
            i8 = i9;
        }
        int i15 = i5 + i4;
        int i16 = this.f56526q;
        if (i15 > i16) {
            i4 = i16 - this.f56529t;
        }
        if (i4 > i9) {
            i9 = i4;
        }
        int ordinal = this.f56520h.ordinal();
        if (ordinal == 0) {
            float f = (float) i8;
            this.f56518f.moveTo((float) this.f56524o, f);
            this.f56519g.moveTo((float) this.f56524o, f);
            this.f56519g.rLineTo((float) (-this.f56530u), (float) (this.f56529t / 2));
            this.f56519g.rLineTo((float) this.f56530u, (float) (this.f56529t / 2));
            this.f56519g.lineTo((float) this.f56524o, f);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56525p);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56525p);
        } else if (ordinal == 1) {
            float f2 = (float) i9;
            this.f56518f.moveTo(f2, (float) this.f56525p);
            this.f56519g.moveTo(f2, (float) this.f56525p);
            this.f56519g.rLineTo((float) (this.f56529t / 2), (float) (-this.f56530u));
            this.f56519g.rLineTo((float) (this.f56529t / 2), (float) this.f56530u);
            this.f56519g.lineTo(f2, (float) this.f56525p);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56525p);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56525p);
        } else if (ordinal == 2) {
            float f3 = (float) i8;
            this.f56518f.moveTo((float) this.f56526q, f3);
            this.f56519g.moveTo((float) this.f56526q, f3);
            this.f56519g.rLineTo((float) this.f56530u, (float) (this.f56529t / 2));
            this.f56519g.rLineTo((float) (-this.f56530u), (float) (this.f56529t / 2));
            this.f56519g.lineTo((float) this.f56526q, f3);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56525p);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56525p);
        } else if (ordinal == 3) {
            float f4 = (float) i9;
            this.f56518f.moveTo(f4, (float) this.f56527r);
            this.f56519g.moveTo(f4, (float) this.f56527r);
            this.f56519g.rLineTo((float) (this.f56529t / 2), (float) this.f56530u);
            this.f56519g.rLineTo((float) (this.f56529t / 2), (float) (-this.f56530u));
            this.f56519g.lineTo(f4, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56527r);
            this.f56518f.lineTo((float) this.f56526q, (float) this.f56525p);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56525p);
            this.f56518f.lineTo((float) this.f56524o, (float) this.f56527r);
        }
        this.f56518f.close();
        this.f56519g.close();
    }

    /* renamed from: b */
    public void mo26418b() {
        int i = this.f56521i * 2;
        int ordinal = this.f56520h.ordinal();
        if (ordinal == 0) {
            setPadding(this.f56530u + i, i, i, i);
        } else if (ordinal == 1) {
            setPadding(i, this.f56530u + i, i, i);
        } else if (ordinal == 2) {
            setPadding(i, i, this.f56530u + i, i);
        } else if (ordinal == 3) {
            setPadding(i, i, i, this.f56530u + i);
        }
    }

    public int getBubbleColor() {
        return this.f56513A;
    }

    public int getBubblePadding() {
        return this.f56521i;
    }

    public int getBubbleRadius() {
        return this.f56535z;
    }

    public C19855a getLook() {
        return this.f56520h;
    }

    public int getLookLength() {
        return this.f56530u;
    }

    public int getLookPosition() {
        return this.f56528s;
    }

    public int getLookWidth() {
        return this.f56529t;
    }

    public Paint getPaint() {
        return this.f56516d;
    }

    public Path getPath() {
        return this.f56518f;
    }

    public int getShadowColor() {
        return this.f56531v;
    }

    public int getShadowRadius() {
        return this.f56532w;
    }

    public int getShadowX() {
        return this.f56533x;
    }

    public int getShadowY() {
        return this.f56534y;
    }

    public void invalidate() {
        mo26417a();
        super.invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f56516d.setPathEffect(new CornerPathEffect((float) this.f56535z));
        canvas.drawPath(this.f56518f, this.f56516d);
        this.f56516d.setPathEffect((PathEffect) null);
        canvas.drawPath(this.f56519g, this.f56517e);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f56528s = bundle.getInt("mLookPosition");
            this.f56529t = bundle.getInt("mLookWidth");
            this.f56530u = bundle.getInt("mLookLength");
            this.f56531v = bundle.getInt("mShadowColor");
            this.f56532w = bundle.getInt("mShadowRadius");
            this.f56533x = bundle.getInt("mShadowX");
            this.f56534y = bundle.getInt("mShadowY");
            this.f56535z = bundle.getInt("mBubbleRadius");
            this.f56522j = bundle.getInt("mWidth");
            this.f56523n = bundle.getInt("mHeight");
            this.f56524o = bundle.getInt("mLeft");
            this.f56525p = bundle.getInt("mTop");
            this.f56526q = bundle.getInt("mRight");
            this.f56527r = bundle.getInt("mBottom");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mLookPosition", this.f56528s);
        bundle.putInt("mLookWidth", this.f56529t);
        bundle.putInt("mLookLength", this.f56530u);
        bundle.putInt("mShadowColor", this.f56531v);
        bundle.putInt("mShadowRadius", this.f56532w);
        bundle.putInt("mShadowX", this.f56533x);
        bundle.putInt("mShadowY", this.f56534y);
        bundle.putInt("mBubbleRadius", this.f56535z);
        bundle.putInt("mWidth", this.f56522j);
        bundle.putInt("mHeight", this.f56523n);
        bundle.putInt("mLeft", this.f56524o);
        bundle.putInt("mTop", this.f56525p);
        bundle.putInt("mRight", this.f56526q);
        bundle.putInt("mBottom", this.f56527r);
        return bundle;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f56522j = i;
        this.f56523n = i2;
        mo26417a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C19856b bVar;
        if (motionEvent.getAction() == 0) {
            RectF rectF = new RectF();
            this.f56518f.computeBounds(rectF, true);
            this.f56515C.setPath(this.f56518f, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
            if (!this.f56515C.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (bVar = this.f56514B) != null) {
                C19857a aVar = C19857a.this;
                if (aVar.f56547j) {
                    aVar.dismiss();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void postInvalidate() {
        mo26417a();
        super.postInvalidate();
    }

    public void setBubbleColor(int i) {
        this.f56513A = i;
    }

    public void setBubbleRadius(int i) {
        this.f56535z = i;
    }

    public void setLook(C19855a aVar) {
        this.f56520h = aVar;
        mo26418b();
    }

    public void setLookLength(int i) {
        this.f56530u = i;
        mo26418b();
    }

    public void setLookPosition(int i) {
        this.f56528s = i;
    }

    public void setLookWidth(int i) {
        this.f56529t = i;
    }

    public void setOnClickEdgeListener(C19856b bVar) {
        this.f56514B = bVar;
    }

    public void setShadowColor(int i) {
        this.f56531v = i;
    }

    public void setShadowRadius(int i) {
        this.f56532w = i;
    }

    public void setShadowX(int i) {
        this.f56533x = i;
    }

    public void setShadowY(int i) {
        this.f56534y = i;
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56515C = new Region();
        setLayerType(1, (Paint) null);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226858d, i, 0);
        C19855a aVar = C19855a.BOTTOM;
        int i2 = obtainStyledAttributes.getInt(3, 4);
        if (i2 == 1) {
            aVar = C19855a.LEFT;
        } else if (i2 == 2) {
            aVar = C19855a.TOP;
        } else if (i2 == 3) {
            aVar = C19855a.RIGHT;
        }
        this.f56520h = aVar;
        this.f56528s = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f56529t = obtainStyledAttributes.getDimensionPixelOffset(6, C76577a.m92150a(getContext(), 17.0f));
        this.f56530u = obtainStyledAttributes.getDimensionPixelOffset(4, C76577a.m92150a(getContext(), 17.0f));
        this.f56532w = obtainStyledAttributes.getDimensionPixelOffset(8, C76577a.m92150a(getContext(), 3.3f));
        this.f56533x = obtainStyledAttributes.getDimensionPixelOffset(9, C76577a.m92150a(getContext(), 1.0f));
        this.f56534y = obtainStyledAttributes.getDimensionPixelOffset(10, C76577a.m92150a(getContext(), 1.0f));
        this.f56535z = obtainStyledAttributes.getDimensionPixelOffset(2, C76577a.m92150a(getContext(), 7.0f));
        this.f56521i = obtainStyledAttributes.getDimensionPixelOffset(1, C76577a.m92150a(getContext(), 8.0f));
        this.f56531v = obtainStyledAttributes.getColor(7, -7829368);
        this.f56513A = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(5);
        this.f56516d = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(5);
        this.f56517e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f56518f = new Path();
        this.f56519g = new Path();
        mo26418b();
    }
}
