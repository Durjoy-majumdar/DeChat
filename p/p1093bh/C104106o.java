package p1093bh;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import me3.C109612c;

/* renamed from: bh.o */
public class C104106o {

    /* renamed from: a */
    public int f307990a = ((int) MMApplicationContext.getResources().getDimension(C0966R.dimen.f4187vi));

    /* renamed from: b */
    public Rect f307991b;

    /* renamed from: c */
    public float f307992c;

    /* renamed from: d */
    public Rect f307993d;

    /* renamed from: e */
    public C104090d f307994e;

    /* renamed from: f */
    public int f307995f = 0;

    /* renamed from: g */
    public boolean f307996g = false;

    /* renamed from: h */
    public float f307997h;

    /* renamed from: i */
    public float f307998i;

    /* renamed from: j */
    public Rect f307999j;

    /* renamed from: k */
    public float f308000k;

    /* renamed from: l */
    public float f308001l;

    /* renamed from: m */
    public float f308002m;

    /* renamed from: n */
    public float f308003n;

    /* renamed from: o */
    public int f308004o;

    /* renamed from: p */
    public int f308005p;

    /* renamed from: q */
    public int f308006q;

    /* renamed from: r */
    public int f308007r;

    public C104106o(C104090d dVar, float f, Rect rect) {
        this.f307992c = f;
        this.f307994e = dVar;
        this.f307993d = rect;
        this.f307991b = dVar.f307927x;
    }

    /* renamed from: a */
    public final void mo145746a(int i, int i2, Rect rect) {
        int i3 = (int) (((float) (i - rect.top)) * this.f307992c);
        if (i2 == 8) {
            int centerX = rect.centerX();
            int i4 = i3 / 2;
            this.f308007r = centerX - i4;
            this.f308006q = i4 + centerX;
            if (centerX < this.f307991b.centerX()) {
                if (this.f308007r < this.f307991b.left) {
                    Log.m105924i("FixRatioCropHelper", "change direct to right_bottom");
                    mo145746a(i, 12, rect);
                    return;
                }
            } else if (this.f308006q > this.f307991b.right) {
                Log.m105924i("FixRatioCropHelper", "change direct to RIGHT_TOP");
                mo145746a(i, 9, rect);
                return;
            }
            Rect rect2 = this.f307993d;
            rect2.left = this.f308007r;
            rect2.right = this.f308006q;
            rect2.bottom = i;
        } else if (i2 == 9) {
            this.f308007r = rect.right - i3;
            Log.m105924i("FixRatioCropHelper", "adjustBottom RIGHT_BOTTOM :" + this.f307993d);
            int i5 = this.f308007r;
            int i6 = this.f307991b.left;
            if (i5 < i6) {
                Rect rect3 = this.f307993d;
                rect3.left = i6;
                rect3.bottom = (int) (((float) rect.top) + (((float) (rect.right - i6)) / this.f307992c));
                return;
            }
            Rect rect4 = this.f307993d;
            rect4.left = i5;
            rect4.bottom = i;
        } else if (i2 == 12) {
            this.f308006q = rect.left + i3;
            Log.m105924i("FixRatioCropHelper", "adjustBottom RIGHT_BOTTOM" + this.f307993d);
            int i7 = this.f308006q;
            int i8 = this.f307991b.right;
            if (i7 > i8) {
                Rect rect5 = this.f307993d;
                rect5.right = i8;
                rect5.bottom = (int) (((float) rect5.top) + (((float) (i8 - rect.left)) / this.f307992c));
                return;
            }
            Rect rect6 = this.f307993d;
            rect6.right = i7;
            rect6.bottom = i;
        }
    }

    /* renamed from: b */
    public final void mo145747b(int i, int i2, Rect rect) {
        int i3 = rect.right;
        float f = this.f307992c;
        int i4 = (int) (((float) (i3 - i)) / f);
        if (i2 == 1) {
            float centerY = (float) rect.centerY();
            float f2 = (float) (i4 / 2);
            this.f308004o = (int) (centerY - f2);
            this.f308005p = (int) (f2 + centerY);
            Log.m105924i("FixRatioCropHelper", "adjustLeft :" + this.f307993d + " LEFT");
            if (centerY >= ((float) this.f307991b.centerY())) {
                if (this.f308005p > this.f307991b.bottom) {
                    mo145747b(i, 3, rect);
                    return;
                }
            } else if (this.f308004o < this.f307991b.top) {
                mo145747b(i, 9, rect);
                return;
            }
            Rect rect2 = this.f307993d;
            rect2.top = this.f308004o;
            rect2.bottom = this.f308005p;
            rect2.left = i;
        } else if (i2 == 3) {
            int i5 = rect.bottom;
            int i6 = i5 - i4;
            this.f308004o = i6;
            int i7 = this.f307991b.top;
            if (i6 <= i7) {
                Rect rect3 = this.f307993d;
                rect3.top = i7;
                rect3.left = (int) (((float) i3) - (((float) (i5 - i7)) * f));
            } else {
                Rect rect4 = this.f307993d;
                rect4.top = i6;
                rect4.left = i;
            }
            Log.m105924i("FixRatioCropHelper", "adjustLeft :" + this.f307993d + " LEFT_TOP");
        } else if (i2 == 9) {
            this.f308005p = rect.top + i4;
            Log.m105924i("FixRatioCropHelper", "adjustLeft :" + this.f307993d + " LEFT_BOTTOM");
            int i8 = this.f308005p;
            int i9 = this.f307991b.bottom;
            if (i8 >= i9) {
                Rect rect5 = this.f307993d;
                rect5.bottom = i9;
                rect5.left = (int) (((float) rect.right) - (((float) (i9 - rect.top)) * this.f307992c));
                return;
            }
            Rect rect6 = this.f307993d;
            rect6.bottom = i8;
            rect6.left = i;
        }
    }

    /* renamed from: c */
    public final void mo145748c(int i, int i2, Rect rect) {
        int i3 = (int) (((float) (i - rect.left)) / this.f307992c);
        Log.m105924i("FixRatioCropHelper", "adjustRight delta:" + i3);
        if (i2 == 4) {
            int centerY = rect.centerY();
            int i4 = i3 / 2;
            this.f308004o = centerY - i4;
            this.f308005p = i4 + centerY;
            Log.m105924i("FixRatioCropHelper", "adjustRight right mBoxRect :" + this.f307993d);
            if (centerY > this.f307991b.centerY()) {
                if (this.f308005p > this.f307991b.bottom) {
                    mo145748c(i, 6, rect);
                    return;
                }
            } else if (this.f308004o < this.f307991b.top) {
                mo145748c(i, 12, rect);
                return;
            }
            Rect rect2 = this.f307993d;
            rect2.right = i;
            rect2.top = this.f308004o;
            rect2.bottom = this.f308005p;
        } else if (i2 == 6) {
            this.f308004o = rect.bottom - i3;
            Log.m105924i("FixRatioCropHelper", "adjustRight RIGHT_TOP mBoxRect :" + this.f307993d);
            int i5 = this.f308004o;
            int i6 = this.f307991b.top;
            if (i5 < i6) {
                Rect rect3 = this.f307993d;
                rect3.top = i6;
                rect3.right = (int) (((float) rect3.left) + (((float) (rect.bottom - i6)) * this.f307992c));
                return;
            }
            Rect rect4 = this.f307993d;
            rect4.top = i5;
            rect4.right = i;
        } else if (i2 == 12) {
            this.f308005p = rect.top + i3;
            Log.m105924i("FixRatioCropHelper", "adjustRight RIGHT_BOTTOM mBoxRect.top :" + this.f307993d);
            Rect rect5 = this.f307993d;
            int i7 = rect5.bottom;
            int i8 = this.f307991b.bottom;
            if (i7 > i8) {
                rect5.bottom = i8;
                rect5.right = rect5.left + (i8 - rect.top);
                return;
            }
            rect5.bottom = this.f308005p;
            rect5.right = i;
        }
    }

    /* renamed from: d */
    public final void mo145749d(int i, int i2, Rect rect) {
        int i3 = rect.bottom;
        float f = this.f307992c;
        int i4 = (int) (((float) (i3 - i)) * f);
        if (i2 == 2) {
            int centerX = rect.centerX();
            int i5 = i4 / 2;
            this.f308007r = centerX - i5;
            this.f308006q = i5 + centerX;
            if (centerX < this.f307991b.centerX()) {
                if (this.f308007r < this.f307991b.left) {
                    mo145749d(i, 6, rect);
                    return;
                }
            } else if (this.f308006q > this.f307991b.right) {
                mo145749d(i, 3, rect);
                return;
            }
            Rect rect2 = this.f307993d;
            rect2.left = this.f308007r;
            rect2.right = this.f308006q;
            rect2.top = i;
        } else if (i2 == 3) {
            int i6 = rect.right;
            int i7 = i6 - i4;
            this.f308007r = i7;
            int i8 = this.f307991b.left;
            if (i7 < i8) {
                Rect rect3 = this.f307993d;
                rect3.left = i8;
                rect3.top = (int) (((float) i3) - (((float) (i6 - i8)) / f));
                return;
            }
            Rect rect4 = this.f307993d;
            rect4.left = i7;
            rect4.top = i;
        } else if (i2 == 6) {
            int i9 = rect.left;
            int i15 = i4 + i9;
            this.f308006q = i15;
            Rect rect5 = this.f307993d;
            int i16 = rect5.right;
            int i17 = this.f307991b.right;
            if (i16 > i17) {
                rect5.right = i17;
                rect5.top = (int) (((float) i3) - (((float) (i17 - i9)) / f));
                return;
            }
            rect5.right = i15;
            rect5.top = i;
        }
    }

    /* renamed from: e */
    public final void mo145750e(int i, int i2, Rect rect) {
        int i3 = this.f307993d.bottom;
        int i4 = this.f307991b.bottom;
        if (i3 <= i4) {
            if (i > i4 - i3) {
                mo145746a(i4, i2, rect);
            } else {
                mo145746a(i3 + i, i2, rect);
            }
            Rect rect2 = this.f307993d;
            int i5 = rect2.bottom;
            int i6 = rect2.top;
            int i7 = this.f307990a;
            if (i5 < (i7 * 2) + i6) {
                mo145746a(i6 + (i7 * 2), i2, rect);
            }
            int i8 = this.f307993d.bottom;
            if (i8 > this.f307991b.bottom) {
                mo145746a(i8, i2, rect);
            }
            RectF curImageRect = ((C109612c) this.f307994e.f307884a).f328158a.getBaseBoardView().getCurImageRect();
            if (i2 > 8) {
                mo145757l(curImageRect, i2);
            } else {
                mo145757l(curImageRect, 8);
                mo145757l(curImageRect, 1);
                mo145757l(curImageRect, 4);
            }
            mo145755j(curImageRect, 8);
        }
    }

    /* renamed from: f */
    public final void mo145751f(int i, int i2, Rect rect) {
        int i3 = this.f307993d.left;
        int i4 = this.f307991b.left;
        if (i3 >= i4) {
            if (i > i3 - i4) {
                mo145747b(i4, i2, rect);
            } else {
                mo145747b(i3 - i, i2, rect);
            }
        }
        Rect rect2 = this.f307993d;
        int i5 = rect2.left;
        int i6 = rect2.right;
        int i7 = this.f307990a;
        if (i5 > i6 - (i7 * 2)) {
            mo145747b(i6 - (i7 * 2), i2, rect);
        }
        int i8 = this.f307993d.left;
        int i9 = this.f307991b.left;
        if (i8 < i9) {
            mo145747b(i9, i2, rect);
        }
        RectF curImageRect = ((C109612c) this.f307994e.f307884a).f328158a.getBaseBoardView().getCurImageRect();
        if (i2 > 1) {
            mo145757l(curImageRect, i2);
        } else {
            mo145757l(curImageRect, 1);
            mo145757l(curImageRect, 8);
            mo145757l(curImageRect, 2);
        }
        mo145755j(curImageRect, 1);
    }

    /* renamed from: g */
    public final void mo145752g(int i, int i2, Rect rect) {
        int i3 = this.f307993d.right;
        int i4 = this.f307991b.right;
        if (i3 <= i4) {
            if (i > i4 - i3) {
                Log.m105924i("FixRatioCropHelper", "changeRight outof bound:");
                mo145748c(this.f307991b.right, i2, rect);
            } else {
                Log.m105924i("FixRatioCropHelper", "changeRight normal eventPosDelta: " + i);
                mo145748c(this.f307993d.right + i, i2, rect);
            }
        }
        Rect rect2 = this.f307993d;
        if (rect2.right < rect2.left + (this.f307990a * 2)) {
            Log.m105924i("FixRatioCropHelper", "changeRight < 2 padding>: " + this.f307993d.right);
            mo145748c(this.f307993d.left + (this.f307990a * 2), i2, rect);
        }
        if (this.f307993d.right > this.f307991b.right) {
            Log.m105924i("FixRatioCropHelper", "changeRight after out of bound>: " + this.f307993d.right);
            mo145748c(this.f307991b.right, i2, rect);
        }
        RectF curImageRect = ((C109612c) this.f307994e.f307884a).f328158a.getBaseBoardView().getCurImageRect();
        if (i2 > 4) {
            mo145757l(curImageRect, i2);
        } else {
            mo145757l(curImageRect, 4);
            mo145757l(curImageRect, 8);
            mo145757l(curImageRect, 2);
        }
        mo145755j(curImageRect, 4);
    }

    /* renamed from: h */
    public final void mo145753h(int i, int i2, Rect rect) {
        int i3 = this.f307993d.top;
        int i4 = this.f307991b.top;
        if (i3 >= i4) {
            if (i > i3 - i4) {
                mo145749d(i4, i2, rect);
            } else {
                mo145749d(i3 - i, i2, rect);
            }
        }
        Rect rect2 = this.f307993d;
        int i5 = rect2.top;
        int i6 = rect2.bottom;
        int i7 = this.f307990a;
        if (i5 > i6 - (i7 * 2)) {
            mo145749d(i6 - (i7 * 2), i2, rect);
        }
        int i8 = this.f307993d.top;
        int i9 = this.f307991b.top;
        if (i8 < i9) {
            mo145749d(i9, i2, rect);
        }
        RectF curImageRect = ((C109612c) this.f307994e.f307884a).f328158a.getBaseBoardView().getCurImageRect();
        if (i2 > 2) {
            mo145757l(curImageRect, i2);
        } else {
            mo145757l(curImageRect, 2);
            mo145757l(curImageRect, 1);
            mo145757l(curImageRect, 4);
        }
        mo145755j(curImageRect, 2);
    }

    /* renamed from: i */
    public final Matrix mo145754i() {
        return ((C109612c) this.f307994e.f307884a).f328158a.getBaseBoardView().getMainMatrix();
    }

    /* renamed from: j */
    public final void mo145755j(RectF rectF, int i) {
        Log.m105924i("FixRatioCropHelper", "scaleImage cropDirection:" + i);
        if (i == 1) {
            if (((float) this.f307993d.width()) > rectF.width()) {
                Rect rect = this.f307993d;
                if (rect.left > this.f307991b.left) {
                    float width = ((float) rect.width()) / rectF.width();
                    Log.m105924i("FixRatioCropHelper", "scaleImage LEFT 11 :" + width);
                    Matrix i2 = mo145754i();
                    Rect rect2 = this.f307993d;
                    i2.postScale(width, width, (float) rect2.right, (float) rect2.centerY());
                }
            }
            if (((float) this.f307993d.height()) > rectF.height()) {
                float height = ((float) this.f307993d.height()) / rectF.height();
                Log.m105924i("FixRatioCropHelper", "scaleImage LEFT 22 :" + height);
                Matrix i3 = mo145754i();
                Rect rect3 = this.f307993d;
                i3.postScale(height, height, (float) rect3.right, (float) rect3.centerY());
            }
        } else if (i == 2) {
            if (((float) this.f307993d.height()) > rectF.height()) {
                Rect rect4 = this.f307993d;
                if (rect4.top > this.f307991b.top) {
                    float height2 = ((float) rect4.height()) / rectF.height();
                    Log.m105924i("FixRatioCropHelper", "scaleImage TOP 11 :" + height2);
                    mo145754i().postScale(height2, height2, (float) this.f307993d.centerX(), (float) this.f307993d.bottom);
                }
            }
            if (((float) this.f307993d.width()) > rectF.width()) {
                float width2 = ((float) this.f307993d.width()) / rectF.width();
                Log.m105924i("FixRatioCropHelper", "scaleImage TOP 22 :" + width2);
                mo145754i().postScale(width2, width2, (float) this.f307993d.centerX(), (float) this.f307993d.bottom);
            }
        } else if (i == 4) {
            if (((float) this.f307993d.width()) > rectF.width()) {
                Rect rect5 = this.f307993d;
                if (rect5.right < this.f307991b.right) {
                    float width3 = ((float) rect5.width()) / rectF.width();
                    Log.m105924i("FixRatioCropHelper", "scaleImage RIGHT 11 :" + width3);
                    Matrix i4 = mo145754i();
                    Rect rect6 = this.f307993d;
                    i4.postScale(width3, width3, (float) rect6.left, (float) rect6.centerY());
                }
            }
            if (((float) this.f307993d.height()) > rectF.height()) {
                float height3 = ((float) this.f307993d.height()) / rectF.height();
                Log.m105924i("FixRatioCropHelper", "scaleImage RIGHT 22 :" + height3);
                Matrix i5 = mo145754i();
                Rect rect7 = this.f307993d;
                i5.postScale(height3, height3, (float) rect7.left, (float) rect7.centerY());
            }
        } else if (i == 8) {
            if (((float) this.f307993d.height()) > rectF.height()) {
                Rect rect8 = this.f307993d;
                if (rect8.bottom < this.f307991b.bottom) {
                    float height4 = ((float) rect8.height()) / rectF.height();
                    mo145754i().postScale(height4, height4, (float) this.f307993d.centerX(), (float) this.f307993d.top);
                    Log.m105924i("FixRatioCropHelper", "scaleImage bottom 11 :" + height4);
                }
            }
            if (((float) this.f307993d.width()) > rectF.width()) {
                float width4 = ((float) this.f307993d.width()) / rectF.width();
                mo145754i().postScale(width4, width4, (float) this.f307993d.centerX(), (float) this.f307993d.top);
                Log.m105924i("FixRatioCropHelper", "scaleImage bottom 22 :" + width4);
            }
        }
    }

    /* renamed from: k */
    public final void mo145756k(RectF rectF, float f, int i) {
        Log.m105924i("FixRatioCropHelper", "translateImage cropDirection:" + i + " eventPosDelta:" + f);
        if (i == 1) {
            Log.m105924i("FixRatioCropHelper", "translateImage LEFT begin");
            float f2 = rectF.left;
            int i2 = (int) f2;
            float f3 = this.f308002m;
            if (i2 < ((int) f3) || ((int) f2) < this.f307993d.left) {
                Log.m105924i("FixRatioCropHelper", "translateImage LEFT else");
            } else if (f > f2 - f3) {
                Log.m105924i("FixRatioCropHelper", "translateImage left mEdgeLeft - imageRect.left:" + (this.f308002m - rectF.left));
                mo145754i().postTranslate(this.f308002m - rectF.left, 0.0f);
            } else {
                Log.m105924i("FixRatioCropHelper", "translateImage left eventPosDelta:" + f);
                mo145754i().postTranslate(f, 0.0f);
            }
        } else if (i == 2) {
            float f4 = rectF.top;
            int i3 = (int) f4;
            float f5 = this.f308000k;
            if (i3 >= ((int) f5) && ((int) f4) >= this.f307993d.top) {
                if (f > f4 - f5) {
                    Log.m105924i("FixRatioCropHelper", "translateImage imageRect.top - mEdgeTop - imageRect.left:" + (rectF.top - this.f308000k));
                    mo145754i().postTranslate(0.0f, this.f308000k - rectF.top);
                    return;
                }
                Log.m105924i("FixRatioCropHelper", "translateImage top eventPosDelta:" + f);
                mo145754i().postTranslate(0.0f, f);
            }
        } else if (i == 4) {
            float f6 = rectF.right;
            int i4 = (int) f6;
            float f7 = this.f308003n;
            if (i4 <= ((int) f7) && ((int) f6) <= this.f307993d.right) {
                if (f > f7 - f6) {
                    mo145754i().postTranslate(this.f308003n - rectF.right, 0.0f);
                } else {
                    mo145754i().postTranslate(f, 0.0f);
                }
            }
        } else if (i == 8) {
            float f8 = rectF.bottom;
            int i5 = (int) f8;
            float f9 = this.f308001l;
            if (i5 > ((int) f9) || ((int) f8) > this.f307993d.bottom) {
                Log.m105924i("FixRatioCropHelper", "translateImage bottom else :" + f);
            } else if (f > f9 - f8) {
                Log.m105924i("FixRatioCropHelper", "translateImage bottom 11:" + (this.f308001l - rectF.bottom));
                mo145754i().postTranslate(0.0f, this.f308001l - rectF.bottom);
            } else {
                Log.m105924i("FixRatioCropHelper", "translateImage bottom 22:" + f);
                mo145754i().postTranslate(0.0f, f);
            }
        }
    }

    /* renamed from: l */
    public final void mo145757l(RectF rectF, int i) {
        if ((i & 1) == 1) {
            mo145756k(rectF, (float) (this.f307993d.left - this.f307999j.left), 1);
        }
        if ((i & 4) == 4) {
            mo145756k(rectF, (float) (this.f307993d.right - this.f307999j.right), 4);
        }
        if ((i & 2) == 2) {
            mo145756k(rectF, (float) (this.f307993d.top - this.f307999j.top), 2);
        }
        if ((i & 8) == 8) {
            mo145756k(rectF, (float) (this.f307993d.bottom - this.f307999j.bottom), 8);
        }
    }
}
