package tj3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: tj3.a */
public class C111004a implements C78034d {

    /* renamed from: a */
    public float f332437a = 16.0f;

    /* renamed from: b */
    public float f332438b = 1.0f;

    /* renamed from: c */
    public float f332439c = 1.0f;

    /* renamed from: d */
    public C111008c f332440d;

    /* renamed from: e */
    public Canvas f332441e;

    /* renamed from: f */
    public Bitmap f332442f;

    /* renamed from: g */
    public final View f332443g;

    /* renamed from: h */
    public final ViewGroup f332444h;

    /* renamed from: i */
    public final Rect f332445i = new Rect();

    /* renamed from: j */
    public final int[] f332446j = new int[2];

    /* renamed from: k */
    public final ViewTreeObserver.OnPreDrawListener f332447k = new C111005a();

    /* renamed from: l */
    public boolean f332448l;

    /* renamed from: m */
    public boolean f332449m;

    /* renamed from: n */
    public final Runnable f332450n;

    /* renamed from: o */
    public Drawable f332451o;

    /* renamed from: p */
    public boolean f332452p;

    /* renamed from: q */
    public boolean f332453q;

    /* renamed from: r */
    public final Paint f332454r;

    /* renamed from: s */
    public int f332455s;

    /* renamed from: tj3.a$a */
    public class C111005a implements ViewTreeObserver.OnPreDrawListener {
        public C111005a() {
        }

        public boolean onPreDraw() {
            C111004a aVar = C111004a.this;
            if (!aVar.f332448l) {
                aVar.f332448l = true;
                aVar.f332443g.invalidate();
            }
            return true;
        }
    }

    /* renamed from: tj3.a$b */
    public class C111006b implements Runnable {
        public C111006b() {
        }

        public void run() {
            C111004a.this.f332448l = false;
        }
    }

    public C111004a(View view, ViewGroup viewGroup) {
        boolean z = true;
        this.f332449m = true;
        this.f332450n = new C111006b();
        this.f332452p = true;
        Paint paint = new Paint();
        this.f332454r = paint;
        this.f332444h = viewGroup;
        this.f332443g = view;
        this.f332440d = new C111009g();
        paint.setFilterBitmap(true);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (!(((int) Math.ceil((double) (((float) measuredHeight) / 8.0f))) == 0 || ((int) Math.ceil((double) (((float) measuredWidth) / 8.0f))) == 0)) {
            z = false;
        }
        if (z) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new C111007b(this));
        } else {
            mo162686l(measuredWidth, measuredHeight);
        }
    }

    /* renamed from: a */
    public void mo89115a(boolean z) {
        this.f332449m = z;
        mo89116b(z);
        this.f332443g.invalidate();
    }

    /* renamed from: b */
    public void mo89116b(boolean z) {
        this.f332443g.getViewTreeObserver().removeOnPreDrawListener(this.f332447k);
        if (z) {
            this.f332443g.getViewTreeObserver().addOnPreDrawListener(this.f332447k);
        }
    }

    /* renamed from: c */
    public void mo89117c(Canvas canvas) {
        this.f332448l = true;
        if (this.f332449m) {
            Drawable drawable = this.f332451o;
            if (drawable == null) {
                this.f332442f.eraseColor(0);
            } else {
                drawable.draw(this.f332441e);
            }
            if (this.f332453q) {
                this.f332444h.draw(this.f332441e);
            } else {
                this.f332441e.save();
                mo162687m();
                this.f332444h.draw(this.f332441e);
                this.f332441e.restore();
            }
            this.f332442f = this.f332440d.mo162692b(this.f332442f, this.f332437a);
            canvas.save();
            canvas.scale(this.f332438b * 8.0f, this.f332439c * 8.0f);
            canvas.drawBitmap(this.f332442f, 0.0f, 0.0f, this.f332454r);
            canvas.restore();
        }
    }

    /* renamed from: d */
    public void mo89118d(Canvas canvas) {
        this.f332443g.post(this.f332450n);
    }

    public void destroy() {
        mo89116b(false);
        this.f332440d.destroy();
        Bitmap bitmap = this.f332442f;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    /* renamed from: e */
    public void mo89120e(boolean z) {
        this.f332452p = z;
    }

    /* renamed from: f */
    public void mo89121f(int i) {
        this.f332455s = i;
    }

    /* renamed from: g */
    public void mo89122g() {
        mo162686l(this.f332443g.getMeasuredWidth(), this.f332443g.getMeasuredHeight());
    }

    /* renamed from: h */
    public void mo89123h(float f) {
        this.f332437a = f;
    }

    /* renamed from: i */
    public void mo89124i(C111008c cVar) {
        this.f332440d = cVar;
    }

    /* renamed from: j */
    public void mo89125j(Drawable drawable) {
        this.f332451o = drawable;
    }

    /* renamed from: k */
    public void mo89126k(boolean z) {
        this.f332453q = z;
    }

    /* renamed from: l */
    public void mo162686l(int i, int i2) {
        double d = (double) (((float) i2) / 8.0f);
        if (((int) Math.ceil(d)) == 0 || ((int) Math.ceil((double) (((float) i) / 8.0f))) == 0) {
            this.f332449m = false;
            this.f332443g.setWillNotDraw(true);
            mo89116b(false);
            return;
        }
        this.f332449m = true;
        this.f332443g.setWillNotDraw(false);
        int ceil = (int) Math.ceil((double) (((float) i) / 8.0f));
        int ceil2 = (int) Math.ceil(d);
        int i3 = ceil % 16;
        int i4 = i3 == 0 ? ceil : (ceil - i3) + 16;
        int i5 = ceil2 % 16;
        int i6 = i5 == 0 ? ceil2 : (ceil2 - i5) + 16;
        this.f332439c = ((float) ceil2) / ((float) i6);
        this.f332438b = ((float) ceil) / ((float) i4);
        this.f332442f = Bitmap.createBitmap(i4, i6, this.f332440d.mo162691a());
        this.f332441e = new Canvas(this.f332442f);
        mo89116b(true);
        if (this.f332453q) {
            mo162687m();
        }
    }

    /* renamed from: m */
    public final void mo162687m() {
        this.f332443g.getDrawingRect(this.f332445i);
        if (this.f332452p) {
            try {
                this.f332444h.offsetDescendantRectToMyCoords(this.f332443g, this.f332445i);
            } catch (IllegalArgumentException unused) {
                this.f332452p = false;
            }
        } else {
            this.f332443g.getLocationInWindow(this.f332446j);
            Rect rect = this.f332445i;
            int[] iArr = this.f332446j;
            rect.offset(iArr[0], iArr[1]);
        }
        this.f332445i.offset(0, this.f332455s);
        float f = this.f332438b * 8.0f;
        float f2 = this.f332439c * 8.0f;
        Rect rect2 = this.f332445i;
        this.f332441e.translate((((float) (-rect2.left)) / f) - (this.f332443g.getTranslationX() / f), (((float) (-rect2.top)) / f2) - (this.f332443g.getTranslationY() / f2));
        this.f332441e.scale(1.0f / f, 1.0f / f2);
    }
}
