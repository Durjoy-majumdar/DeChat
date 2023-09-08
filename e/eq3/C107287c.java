package eq3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import me3.C109610a;
import me3.C109612c;
import me3.C109623f;
import p248ug.C111167t;

/* renamed from: eq3.c */
public class C107287c extends C107283a {

    /* renamed from: E */
    public Bitmap f320989E;

    /* renamed from: F */
    public Bitmap f320990F;

    /* renamed from: G */
    public Bitmap f320991G;

    /* renamed from: H */
    public Bitmap f320992H;

    /* renamed from: I */
    public Bitmap f320993I;

    /* renamed from: J */
    public Bitmap f320994J;

    /* renamed from: K */
    public Bitmap f320995K;

    /* renamed from: L */
    public Bitmap f320996L;

    /* renamed from: M */
    public Bitmap f320997M;

    /* renamed from: N */
    public Bitmap f320998N;

    /* renamed from: P */
    public Bitmap f320999P;

    /* renamed from: Q */
    public Bitmap f321000Q;

    /* renamed from: Q0 */
    public boolean f321001Q0 = true;

    /* renamed from: R */
    public Bitmap f321002R;

    /* renamed from: R0 */
    public int f321003R0 = -1;

    /* renamed from: S */
    public Bitmap f321004S;

    /* renamed from: T */
    public Rect[] f321005T = new Rect[2];

    /* renamed from: U */
    public Rect[] f321006U = new Rect[4];

    /* renamed from: V */
    public Paint f321007V;

    /* renamed from: W */
    public boolean f321008W;

    /* renamed from: p0 */
    public boolean f321009p0;

    /* renamed from: x0 */
    public boolean f321010x0;

    /* renamed from: y0 */
    public boolean f321011y0;

    public C107287c(Context context, C109623f fVar) {
        super(context, fVar);
    }

    /* renamed from: a */
    public void mo157762a() {
        super.mo157762a();
        if (getCurFeatureType() == C111167t.MOSAIC) {
            if (this.f321005T == null) {
                this.f321005T = new Rect[2];
            }
            if (this.f320981v == null) {
                this.f320981v = new Rect();
            }
            float measuredWidth = ((float) ((((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f320974o.getWidth()) - this.f320996L.getWidth()) - this.f320993I.getWidth())) / 3.0f;
            int width = (int) (((float) (this.f320995K.getWidth() / 2)) + measuredWidth);
            int detailHeight = ((getDetailHeight() - this.f320995K.getWidth()) / 2) + (this.f320995K.getWidth() / 2);
            int width2 = this.f320995K.getWidth() * 2;
            int i = detailHeight - width2;
            int i2 = detailHeight + width2;
            this.f321005T[0] = new Rect(width - width2, i, width + width2, i2);
            int width3 = (int) (((float) width) + measuredWidth + ((float) this.f320995K.getWidth()));
            this.f321005T[1] = new Rect(width3 - width2, i, width3 + width2, i2);
            int measuredWidth2 = (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - (this.f320974o.getWidth() / 2);
            this.f320981v.set(measuredWidth2 - this.f320974o.getWidth(), 0, measuredWidth2 + this.f320974o.getWidth(), getDetailHeight());
        } else if (getCurFeatureType() == C111167t.CROP_PHOTO) {
            if (this.f321006U == null) {
                this.f321006U = new Rect[4];
            }
            int dimension = (int) getResources().getDimension(C0966R.dimen.f4300zz);
            float dimension2 = ((getResources().getDimension(C0966R.dimen.a5r) / 2.0f) - ((float) (this.f321004S.getHeight() / 2))) + ((float) dimension);
            int height = (int) (((float) ((dimension / 2) - (this.f320998N.getHeight() / 2))) + ((float) (this.f321004S.getHeight() / 2)));
            int paddingLeftAndRight = (int) (((((float) getPaddingLeftAndRight()) * 1.0f) / 2.0f) + ((float) (this.f321004S.getHeight() / 2)));
            int height2 = this.f321004S.getHeight();
            int i3 = paddingLeftAndRight - height2;
            int i4 = paddingLeftAndRight + height2;
            this.f321006U[0] = new Rect(i3, height - height2, i4, height + height2);
            int height3 = (int) (dimension2 + ((float) (this.f321004S.getHeight() / 2)));
            int i5 = height3 - height2;
            int i6 = height3 + height2;
            this.f321006U[1] = new Rect(i3, i5, i4, i6);
            int measuredWidth3 = (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - (this.f321004S.getHeight() / 2);
            this.f321006U[2] = new Rect(measuredWidth3 - height2, i5, measuredWidth3 + height2, i6);
            int measuredWidth4 = getMeasuredWidth() / 2;
            this.f321006U[3] = new Rect(measuredWidth4 - height2, i5, measuredWidth4 + height2, i6);
        }
    }

    /* renamed from: b */
    public Bitmap mo157763b(C111167t tVar, boolean z) {
        if (tVar == C111167t.CROP_PHOTO) {
            return z ? this.f320992H : this.f320991G;
        }
        if (tVar == C111167t.MOSAIC) {
            return z ? this.f320989E : this.f320990F;
        }
        return null;
    }

    /* renamed from: c */
    public void mo157764c(Canvas canvas) {
        super.mo157764c(canvas);
        if (getCurFeatureType() == C111167t.MOSAIC) {
            Paint paint = new Paint();
            if (mo157779i()) {
                paint.setAlpha(255);
            } else {
                paint.setAlpha(160);
            }
            canvas.drawBitmap((!this.f320982w || !mo157779i()) ? this.f320974o : this.f320975p, (float) ((getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - this.f320974o.getWidth()), (float) ((getDetailHeight() - this.f320974o.getHeight()) / 2), paint);
            float measuredWidth = ((float) ((((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f320974o.getWidth()) - this.f320996L.getWidth()) - this.f320993I.getWidth())) / 3.0f;
            float detailHeight = (((float) (getDetailHeight() - this.f320996L.getHeight())) * 1.0f) / 2.0f;
            if (this.f321001Q0) {
                this.f321003R0 = 0;
                this.f321001Q0 = false;
            }
            int i = this.f321003R0;
            if (i == 0) {
                canvas.drawBitmap(this.f320994J, measuredWidth, detailHeight, (Paint) null);
                canvas.drawBitmap(this.f320995K, measuredWidth + measuredWidth + ((float) this.f320996L.getWidth()), detailHeight, (Paint) null);
            } else if (i == 1) {
                canvas.drawBitmap(this.f320993I, measuredWidth, detailHeight, (Paint) null);
                Bitmap bitmap = this.f320996L;
                canvas.drawBitmap(bitmap, measuredWidth + measuredWidth + ((float) bitmap.getWidth()), detailHeight, (Paint) null);
            } else {
                canvas.drawBitmap(this.f320993I, measuredWidth, detailHeight, (Paint) null);
                canvas.drawBitmap(this.f320995K, measuredWidth + measuredWidth + ((float) this.f320996L.getWidth()), detailHeight, (Paint) null);
            }
        } else if (getCurFeatureType() == C111167t.CROP_PHOTO) {
            int dimension = (int) getResources().getDimension(C0966R.dimen.f4300zz);
            float f = (float) dimension;
            canvas.drawLine(0.0f, f, (float) getMeasuredWidth(), f, this.f320983x);
            float dimension2 = ((getResources().getDimension(C0966R.dimen.a5r) / 2.0f) - ((float) (this.f321004S.getHeight() / 2))) + f;
            float paddingLeftAndRight = (((float) getPaddingLeftAndRight()) * 1.0f) / 2.0f;
            float height = (float) ((dimension / 2) - (this.f320998N.getHeight() / 2));
            if (this.f321009p0) {
                canvas.drawBitmap(this.f320998N, paddingLeftAndRight, height, (Paint) null);
            } else {
                canvas.drawBitmap(this.f320997M, paddingLeftAndRight, height, (Paint) null);
            }
            if (this.f321010x0) {
                canvas.drawBitmap(this.f321000Q, (((float) getMeasuredWidth()) - paddingLeftAndRight) - ((float) this.f321004S.getWidth()), dimension2, (Paint) null);
            } else {
                canvas.drawBitmap(this.f320999P, (((float) getMeasuredWidth()) - paddingLeftAndRight) - ((float) this.f321004S.getWidth()), dimension2, (Paint) null);
            }
            if (this.f321008W) {
                canvas.drawBitmap(this.f321002R, paddingLeftAndRight, dimension2, (Paint) null);
            } else {
                canvas.drawBitmap(this.f321004S, paddingLeftAndRight, dimension2, (Paint) null);
            }
            float dimension3 = getResources().getDimension(C0966R.dimen.f4299zy) * 2.0f;
            float dimension4 = (getResources().getDimension(C0966R.dimen.a5r) / 2.0f) + ((getResources().getDimension(C0966R.dimen.f4299zy) - 8.0f) / 2.0f) + f;
            float measuredWidth2 = (float) (getMeasuredWidth() / 2);
            if (this.f321011y0) {
                this.f321007V.setColor(-1);
                this.f321007V.setAlpha(160);
                canvas.drawText(getResources().getString(C0966R.string.bw_), measuredWidth2 - (dimension3 / 2.0f), dimension4, this.f321007V);
            } else if (mo157779i()) {
                this.f321007V.setColor(-1);
                this.f321007V.setAlpha(255);
                canvas.drawText(getResources().getString(C0966R.string.bw_), measuredWidth2 - (dimension3 / 2.0f), dimension4, this.f321007V);
            } else {
                this.f321007V.setColor(-1);
                this.f321007V.setAlpha(100);
                canvas.drawText(getResources().getString(C0966R.string.bw_), measuredWidth2 - (dimension3 / 2.0f), dimension4, this.f321007V);
            }
        }
    }

    /* renamed from: g */
    public void mo157769g() {
        super.mo157769g();
        Paint paint = new Paint(1);
        this.f321007V = paint;
        paint.setTextSize(getResources().getDimension(C0966R.dimen.f4299zy));
        this.f320993I = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.c8s);
        this.f320994J = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.c8r);
        this.f320995K = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.c8u);
        this.f320996L = BitmapFactory.decodeResource(getResources(), C0966R.C0969drawable.c8t);
        this.f320990F = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.mosaic_unselected));
        this.f320989E = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.mosaic_selected));
        this.f320991G = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.crop_unselected));
        this.f320992H = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.crop_selected));
        this.f320997M = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.rotation_normal));
        this.f320998N = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.rotation_press));
        this.f321000Q = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.sure_crop_press));
        this.f320999P = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.sure_crop_normal));
        this.f321002R = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.cancel_crop_press));
        this.f321004S = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.cancel_crop_normal));
    }

    public int getDetailHeight() {
        float dimension;
        int detailHeight = super.getDetailHeight();
        if (detailHeight == 0) {
            if (getCurFeatureType() == C111167t.MOSAIC) {
                dimension = getResources().getDimension(C0966R.dimen.a5q);
            } else if (getCurFeatureType() == C111167t.CROP_PHOTO) {
                dimension = getResources().getDimension(C0966R.dimen.a5r) + getResources().getDimension(C0966R.dimen.f4300zz);
            }
            return (int) dimension;
        }
        return detailHeight;
    }

    /* renamed from: h */
    public void mo157778h(Canvas canvas) {
        if (this.f320985z) {
            return;
        }
        if (getCurFeatureType() != C111167t.CROP_PHOTO) {
            super.mo157778h(canvas);
        } else {
            mo157764c(canvas);
        }
    }

    /* renamed from: j */
    public boolean mo157780j(int i) {
        boolean j = super.mo157780j(i);
        int ordinal = mo157768f(i).ordinal();
        if (ordinal == 4 || ordinal == 5) {
            return true;
        }
        return j;
    }

    /* renamed from: k */
    public void mo157781k(int i, int i2) {
        super.mo157781k(i, i2);
        int ordinal = mo157768f(this.f320976q).ordinal();
        int i3 = 0;
        if (ordinal == 4) {
            int i4 = 0;
            while (true) {
                Rect[] rectArr = this.f321005T;
                if (i4 < rectArr.length) {
                    Rect rect = rectArr[i4];
                    if (rect == null) {
                        Log.m105921e("PhotoFooterView", "[onDetailTouchDispatch] detailRect is null! %s", Integer.valueOf(i4));
                    }
                    if (rect == null || !rect.contains(i, i2)) {
                        i4++;
                    } else {
                        this.f321003R0 = i4;
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (ordinal == 5) {
            while (true) {
                Rect[] rectArr2 = this.f321006U;
                if (i3 < rectArr2.length) {
                    Rect rect2 = rectArr2[i3];
                    if (rect2 == null || !rect2.contains(i, i2)) {
                        i3++;
                    } else if (i3 == 0) {
                        this.f321009p0 = true;
                        return;
                    } else if (i3 == 1) {
                        this.f321008W = true;
                        return;
                    } else if (i3 == 2) {
                        this.f321010x0 = true;
                        return;
                    } else if (i3 == 3) {
                        this.f321011y0 = true;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public void mo157782l(int i, int i2) {
        super.mo157782l(i, i2);
        int ordinal = mo157768f(this.f320976q).ordinal();
        int i3 = 0;
        if (ordinal == 4) {
            while (true) {
                Rect[] rectArr = this.f321005T;
                if (rectArr != null && i3 < rectArr.length) {
                    Rect rect = rectArr[i3];
                    if (rect == null || !rect.contains(i, i2) || i3 != this.f321003R0) {
                        i3++;
                    } else {
                        C109612c cVar = (C109612c) getPresenter();
                        cVar.getClass();
                        new C109610a(cVar).mo150363c(C111167t.MOSAIC, i3, (Object) null);
                        this.f320977r = this.f320976q;
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (ordinal == 5) {
            int i4 = 0;
            while (true) {
                Rect[] rectArr2 = this.f321006U;
                if (rectArr2 != null && i4 < rectArr2.length) {
                    Rect rect2 = rectArr2[i4];
                    if (rect2 == null || !rect2.contains(i, i2)) {
                        i4++;
                    } else {
                        if ((i4 == 0 && this.f321009p0) || ((i4 == 1 && this.f321008W) || ((i4 == 2 && this.f321010x0) || (i4 == 3 && this.f321011y0)))) {
                            C109612c cVar2 = (C109612c) getPresenter();
                            cVar2.getClass();
                            new C109610a(cVar2).mo150363c(C111167t.CROP_PHOTO, i4, (Object) null);
                            this.f320977r = this.f320976q;
                        }
                        this.f321009p0 = false;
                        this.f321008W = false;
                        this.f321010x0 = false;
                        this.f321011y0 = false;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (getCurFeatureType() != C111167t.CROP_PHOTO) {
            super.onMeasure(i, i2);
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getDetailHeight(), 1073741824));
        mo157762a();
    }
}
