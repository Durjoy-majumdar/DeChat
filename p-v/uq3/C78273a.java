package uq3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t40.C77853a;

/* renamed from: uq3.a */
public final class C78273a {

    /* renamed from: a */
    public final View f229287a;

    /* renamed from: b */
    public boolean f229288b = true;

    /* renamed from: c */
    public int f229289c;

    /* renamed from: d */
    public float f229290d;

    /* renamed from: e */
    public float f229291e;

    /* renamed from: f */
    public float f229292f = 1.0f;

    /* renamed from: g */
    public float f229293g;

    /* renamed from: h */
    public float f229294h;

    /* renamed from: i */
    public int f229295i;

    /* renamed from: j */
    public int f229296j;

    /* renamed from: k */
    public int f229297k;

    /* renamed from: l */
    public int f229298l;

    /* renamed from: m */
    public float f229299m;

    /* renamed from: n */
    public float f229300n;

    /* renamed from: o */
    public final C13601g f229301o = C36568h.m40985a(C78274a.f229303d);

    /* renamed from: p */
    public final C13601g f229302p = C36568h.m40985a(C78275b.f229304d);

    /* renamed from: uq3.a$a */
    public static final class C78274a extends C87413o implements C32224a<Paint> {

        /* renamed from: d */
        public static final C78274a f229303d = new C78274a();

        public C78274a() {
            super(0);
        }

        public Object invoke() {
            return new Paint();
        }
    }

    /* renamed from: uq3.a$b */
    public static final class C78275b extends C87413o implements C32224a<RectF> {

        /* renamed from: d */
        public static final C78275b f229304d = new C78275b();

        public C78275b() {
            super(0);
        }

        public Object invoke() {
            return new RectF();
        }
    }

    public C78273a(View view) {
        C87412m.m108594g(view, "view");
        this.f229287a = view;
    }

    /* renamed from: a */
    public void mo108296a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.f229288b && canvas != null) {
            this.f229299m = (float) this.f229287a.getMeasuredWidth();
            this.f229300n = (float) this.f229287a.getMeasuredHeight();
            float f5 = this.f229292f;
            float f6 = this.f229293g;
            boolean z = false;
            int i = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
            if (i == 0) {
                f2 = this.f229291e * f5;
                f = this.f229299m - f2;
            } else if (i < 0) {
                f2 = (this.f229291e * f5) - Math.abs(f6);
                f = (this.f229299m - (this.f229291e * f5)) - Math.abs(this.f229293g);
            } else if (f6 > 0.0f) {
                float f7 = this.f229291e * f5;
                float f8 = f7;
                f = Math.abs(f6) + (this.f229299m - f7);
                f2 = f8;
            } else {
                f2 = 0.0f;
                f = 0.0f;
            }
            float f9 = this.f229294h;
            int i2 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i2 == 0) {
                f4 = f5 * this.f229291e;
                f3 = this.f229300n - f4;
            } else if (i2 < 0) {
                float abs = (this.f229291e * f5) - Math.abs(f9);
                f3 = (this.f229300n - (f5 * this.f229291e)) - Math.abs(this.f229294h);
                f4 = abs;
            } else if (f9 > 0.0f) {
                f4 = f5 * this.f229291e;
                f3 = Math.abs(f9) + (this.f229300n - f4);
            } else {
                f4 = 0.0f;
                f3 = 0.0f;
            }
            Paint paint = (Paint) ((C36570n) this.f229301o).getValue();
            paint.setColor(this.f229289c);
            paint.setAntiAlias(true);
            if (this.f229291e > 0.0f) {
                paint.setMaskFilter(new BlurMaskFilter(this.f229291e, BlurMaskFilter.Blur.OUTER));
            }
            ((RectF) ((C36570n) this.f229302p).getValue()).set(f2, f4, f, f3);
            Log.m105927v("MicroMsg.WxShadowHelper", "alvinluo shadowRect %s, size: %s, %s", (RectF) ((C36570n) this.f229302p).getValue(), Float.valueOf(this.f229299m), Float.valueOf(this.f229300n));
            if (this.f229290d == 0.0f) {
                z = true;
            }
            if (z) {
                canvas.drawRect((RectF) ((C36570n) this.f229302p).getValue(), (Paint) ((C36570n) this.f229301o).getValue());
                return;
            }
            float f15 = this.f229290d;
            canvas.drawRoundRect((RectF) ((C36570n) this.f229302p).getValue(), f15, f15, (Paint) ((C36570n) this.f229301o).getValue());
        }
    }

    /* renamed from: b */
    public void mo108297b(Context context, AttributeSet attributeSet, int i) {
        C87412m.m108594g(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226852G);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…styleable.WxShadowLayout)");
        this.f229289c = obtainStyledAttributes.getColor(2, 0);
        this.f229290d = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f229291e = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f229292f = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f229293g = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f229294h = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
        float f = this.f229290d;
        if (f < 0.0f) {
            this.f229290d = -f;
        }
        float f2 = this.f229291e;
        if (f2 < 0.0f) {
            this.f229291e = -f2;
        }
        float f3 = this.f229292f;
        if (f3 < 0.0f) {
            this.f229292f = -f3;
        }
        float f4 = this.f229293g;
        if (f4 > 0.0f) {
            this.f229296j = (int) (this.f229291e + Math.abs(f4));
            this.f229295i = (int) this.f229291e;
        } else {
            if (f4 == 0.0f) {
                int i2 = (int) this.f229291e;
                this.f229295i = i2;
                this.f229296j = i2;
            } else {
                this.f229295i = (int) (this.f229291e + Math.abs(f4));
                this.f229296j = (int) this.f229291e;
            }
        }
        float f5 = this.f229294h;
        if (f5 > 0.0f) {
            this.f229298l = (int) (this.f229291e + Math.abs(f5));
            this.f229297k = (int) this.f229291e;
        } else {
            if (f5 == 0.0f) {
                int i3 = (int) this.f229291e;
                this.f229297k = i3;
                this.f229298l = i3;
            } else {
                this.f229297k = (int) (this.f229291e + Math.abs(f5));
                this.f229298l = (int) this.f229291e;
            }
        }
        this.f229287a.setPadding(this.f229295i, this.f229297k, this.f229296j, this.f229298l);
        Log.m105927v("MicroMsg.WxShadowHelper", "alvinluo setPadding %s, %s, %s, %s", Integer.valueOf(this.f229295i), Integer.valueOf(this.f229297k), Integer.valueOf(this.f229296j), Integer.valueOf(this.f229298l));
    }
}
