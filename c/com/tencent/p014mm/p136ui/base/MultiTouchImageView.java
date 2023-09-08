package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.MultiTouchImageView */
public class MultiTouchImageView extends ImageView implements C19706a {

    /* renamed from: A */
    public float f348258A;

    /* renamed from: B */
    public float f348259B;

    /* renamed from: C */
    public float f348260C;

    /* renamed from: D */
    public boolean f348261D;

    /* renamed from: E */
    public boolean f348262E;

    /* renamed from: F */
    public boolean f348263F;

    /* renamed from: G */
    public boolean f348264G;

    /* renamed from: H */
    public float f348265H;

    /* renamed from: I */
    public float f348266I;

    /* renamed from: J */
    public Paint f348267J;

    /* renamed from: K */
    public MMHandler f348268K;

    /* renamed from: L */
    public float f348269L;

    /* renamed from: M */
    public boolean f348270M;

    /* renamed from: N */
    public Drawable f348271N;

    /* renamed from: d */
    public Matrix f348272d;

    /* renamed from: e */
    public Matrix f348273e;

    /* renamed from: f */
    public final Matrix f348274f;

    /* renamed from: g */
    public final float[] f348275g;

    /* renamed from: h */
    public Bitmap f348276h;

    /* renamed from: i */
    public float f348277i;

    /* renamed from: j */
    public float f348278j;

    /* renamed from: n */
    public float f348279n;

    /* renamed from: o */
    public int f348280o;

    /* renamed from: p */
    public int f348281p;

    /* renamed from: q */
    public float f348282q;

    /* renamed from: r */
    public Float f348283r;

    /* renamed from: s */
    public C19706a.C19707a f348284s;

    /* renamed from: t */
    public int f348285t;

    /* renamed from: u */
    public int f348286u;

    /* renamed from: v */
    public boolean f348287v;

    /* renamed from: w */
    public boolean f348288w;

    /* renamed from: x */
    public boolean f348289x;

    /* renamed from: y */
    public float f348290y;

    /* renamed from: z */
    public float f348291z;

    /* renamed from: com.tencent.mm.ui.base.MultiTouchImageView$b */
    public interface C73212b {
        /* renamed from: a */
        void mo101874a(float f);

        /* renamed from: b */
        void mo101875b(float f);
    }

    /* renamed from: com.tencent.mm.ui.base.MultiTouchImageView$a */
    public class C116068a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ float f348292d;

        /* renamed from: e */
        public final /* synthetic */ long f348293e;

        /* renamed from: f */
        public final /* synthetic */ float f348294f;

        /* renamed from: g */
        public final /* synthetic */ float f348295g;

        /* renamed from: h */
        public final /* synthetic */ float f348296h;

        /* renamed from: i */
        public final /* synthetic */ float f348297i;

        public C116068a(float f, long j, float f2, float f3, float f4, float f5) {
            this.f348292d = f;
            this.f348293e = j;
            this.f348294f = f2;
            this.f348295g = f3;
            this.f348296h = f4;
            this.f348297i = f5;
        }

        public void run() {
            float min = Math.min(this.f348292d, (float) (System.currentTimeMillis() - this.f348293e));
            MultiTouchImageView.this.mo26073l(this.f348294f + (this.f348295g * min), this.f348296h, this.f348297i);
            MultiTouchImageView.this.mo26058c();
            if (min < this.f348292d) {
                MultiTouchImageView.this.f348268K.post(this);
            }
        }
    }

    public MultiTouchImageView(Context context, int i, int i2) {
        super(context);
        this.f348272d = new Matrix();
        this.f348273e = new Matrix();
        this.f348274f = new Matrix();
        this.f348275g = new float[9];
        this.f348276h = null;
        this.f348277i = 0.0f;
        this.f348278j = 0.0f;
        this.f348279n = 0.0f;
        this.f348287v = false;
        this.f348288w = false;
        this.f348289x = true;
        this.f348290y = 2.0f;
        this.f348291z = 0.75f;
        this.f348258A = 20.0f;
        this.f348259B = 0.0f;
        this.f348260C = 1.0f;
        this.f348261D = false;
        this.f348262E = false;
        this.f348263F = false;
        this.f348264G = true;
        this.f348267J = null;
        this.f348268K = new MMHandler();
        this.f348269L = 1.0f;
        this.f348270M = false;
        this.f348281p = i2;
        this.f348280o = i;
        mo177312q();
    }

    /* renamed from: a */
    public void mo26056a(float f, float f2) {
        this.f348273e.postTranslate(f, f2);
        setImageMatrix(getImageViewMatrix());
    }

    /* renamed from: b */
    public boolean mo26057b() {
        return this.f348262E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r2 < r1) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        if (r2 < r0) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26058c() {
        /*
            r11 = this;
            boolean r0 = r11.f348264G
            r1 = 1
            if (r0 == 0) goto L_0x000c
            boolean r0 = r11.f348262E
            if (r0 != 0) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            r0 = 0
            goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            boolean r2 = r11.f348263F
            r1 = r1 ^ r2
            android.graphics.Bitmap r2 = r11.f348276h
            if (r2 != 0) goto L_0x001a
            boolean r2 = r11.f348270M
            if (r2 != 0) goto L_0x001a
            goto L_0x00ef
        L_0x001a:
            android.graphics.drawable.Drawable r2 = r11.f348271N
            if (r2 != 0) goto L_0x0024
            boolean r2 = r11.f348270M
            if (r2 == 0) goto L_0x0024
            goto L_0x00ef
        L_0x0024:
            android.graphics.Matrix r2 = r11.getImageViewMatrix()
            boolean r3 = r11.f348270M
            r4 = 0
            if (r3 == 0) goto L_0x0041
            android.graphics.RectF r3 = new android.graphics.RectF
            android.graphics.drawable.Drawable r5 = r11.f348271N
            int r5 = r5.getIntrinsicWidth()
            float r5 = (float) r5
            android.graphics.drawable.Drawable r6 = r11.f348271N
            int r6 = r6.getIntrinsicHeight()
            float r6 = (float) r6
            r3.<init>(r4, r4, r5, r6)
            goto L_0x0054
        L_0x0041:
            android.graphics.RectF r3 = new android.graphics.RectF
            android.graphics.Bitmap r5 = r11.f348276h
            int r5 = r5.getWidth()
            float r5 = (float) r5
            android.graphics.Bitmap r6 = r11.f348276h
            int r6 = r6.getHeight()
            float r6 = (float) r6
            r3.<init>(r4, r4, r5, r6)
        L_0x0054:
            r2.mapRect(r3)
            float r2 = r3.height()
            float r5 = r3.width()
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x007f
            int r1 = r11.f348286u
            float r1 = (float) r1
            int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x006f
            float r1 = r1 - r2
            float r1 = r1 / r6
            float r2 = r3.top
            goto L_0x007d
        L_0x006f:
            float r2 = r3.top
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0077
            float r1 = -r2
            goto L_0x009f
        L_0x0077:
            float r2 = r3.bottom
            int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x009e
        L_0x007d:
            float r1 = r1 - r2
            goto L_0x009f
        L_0x007f:
            float r1 = r3.top
            int r2 = r11.f348286u
            float r2 = (float) r2
            float r7 = r3.bottom
            float r8 = r2 - r7
            float r9 = r1 + r8
            float r9 = r9 / r6
            int r10 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0090
            r9 = 0
        L_0x0090:
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0097
            float r1 = r9 - r1
            goto L_0x009f
        L_0x0097:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x009e
            float r1 = r8 - r9
            goto L_0x009f
        L_0x009e:
            r1 = 0
        L_0x009f:
            if (r0 == 0) goto L_0x00be
            int r0 = r11.f348285t
            float r0 = (float) r0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ad
            float r0 = r0 - r5
            float r0 = r0 / r6
            float r2 = r3.left
            goto L_0x00bb
        L_0x00ad:
            float r2 = r3.left
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b5
            float r4 = -r2
            goto L_0x00dc
        L_0x00b5:
            float r2 = r3.right
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x00dc
        L_0x00bb:
            float r4 = r0 - r2
            goto L_0x00dc
        L_0x00be:
            float r0 = r3.left
            int r2 = r11.f348285t
            float r2 = (float) r2
            float r5 = r3.right
            float r7 = r2 - r5
            float r8 = r0 + r7
            float r8 = r8 / r6
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00cf
            r8 = 0
        L_0x00cf:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            float r4 = r8 - r0
            goto L_0x00dc
        L_0x00d6:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dc
            float r4 = r7 - r8
        L_0x00dc:
            r11.mo26056a(r4, r1)
            android.graphics.Matrix r0 = r11.getImageViewMatrix()
            r11.setImageMatrix(r0)
            r0.mapRect(r3)
            r3.height()
            r3.width()
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MultiTouchImageView.mo26058c():void");
    }

    /* renamed from: d */
    public void mo26059d() {
        this.f348273e.reset();
        mo177311p();
        mo26073l(this.f348282q, 0.0f, 0.0f);
        mo26058c();
    }

    /* renamed from: e */
    public boolean mo26060e() {
        return this.f348263F;
    }

    /* renamed from: f */
    public PointF mo26061f(PointF pointF, int i, int i2) {
        if (pointF == null) {
            return null;
        }
        int i3 = this.f348280o;
        int i4 = (int) (((((float) i3) * 1.0f) * ((float) i2)) / ((float) i));
        float[] fArr = {pointF.x * ((float) i3), pointF.y * ((float) i4)};
        Log.m105927v("MicroMsg.MultiTouchImageView", "mapPoint srcPoint: %s, width: %d, height: %d, viewWidth: %d, viewHeight: %d, targetWidth: %d, targetHeight: %d", pointF, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f348285t), Integer.valueOf(this.f348286u), Integer.valueOf(i3), Integer.valueOf(i4));
        Matrix imageViewMatrix = getImageViewMatrix();
        if (imageViewMatrix == null) {
            return null;
        }
        float[] fArr2 = new float[2];
        Log.m105927v("MicroMsg.MultiTouchImageView", "mapPoint scaleRate: %s", Float.valueOf(this.f348282q));
        imageViewMatrix.mapPoints(fArr2, fArr);
        return new PointF(fArr2[0], fArr2[1]);
    }

    public float getDoubleTabScale() {
        float scaleRate = getScaleRate();
        float scaleWidth = getScaleWidth() * 0.7f > scaleRate ? getScaleWidth() : getScaleHeight() * 0.7f > scaleRate ? getScaleHeight() : getScaleRate() * this.f348290y;
        if (((double) scaleWidth) < 1.0d) {
            scaleWidth = 1.0f;
        }
        return scaleWidth > getMaxZoom() ? getMaxZoom() : scaleWidth;
    }

    public int getImageHeight() {
        return this.f348281p;
    }

    public Matrix getImageViewMatrix() {
        this.f348274f.set(this.f348272d);
        this.f348274f.postConcat(this.f348273e);
        return this.f348274f;
    }

    public PointF getImageViewMatrixScale() {
        this.f348273e.getValues(this.f348275g);
        float[] fArr = this.f348275g;
        return new PointF(fArr[0], fArr[4]);
    }

    public PointF getImageViewMatrixTranslation() {
        this.f348273e.getValues(this.f348275g);
        float[] fArr = this.f348275g;
        return new PointF(fArr[2], fArr[5]);
    }

    public int getImageWidth() {
        return this.f348280o;
    }

    public float getMaxZoom() {
        return this.f348278j;
    }

    public float getMinZoom() {
        return this.f348279n;
    }

    public float getOriginScale() {
        return this.f348259B;
    }

    public float getRealWidth() {
        return getScale() * ((float) getImageWidth());
    }

    public float getScale() {
        this.f348273e.getValues(this.f348275g);
        mo177311p();
        float f = this.f348258A * this.f348269L;
        this.f348278j = f;
        float f2 = this.f348282q * this.f348291z;
        this.f348279n = f2;
        if (f < 1.0f) {
            this.f348278j = 1.0f;
        }
        if (f2 > 1.0f) {
            this.f348279n = 1.0f;
        }
        return this.f348275g[0];
    }

    public float getScaleHeight() {
        return this.f348266I;
    }

    public float getScaleRate() {
        return this.f348282q;
    }

    public float getScaleWidth() {
        return this.f348265H;
    }

    /* renamed from: h */
    public PointF mo26070h(PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        PointF pointF2 = null;
        Matrix imageViewMatrix = getImageViewMatrix();
        if (imageViewMatrix != null) {
            Matrix matrix = new Matrix();
            if (!imageViewMatrix.invert(matrix)) {
                Log.m105920e("MicroMsg.MultiTouchImageView", "invertMapPoint invert matrix failed");
            } else {
                float[] fArr2 = new float[2];
                Log.m105927v("MicroMsg.MultiTouchImageView", "invertMapPoint scaleRate: %s", Float.valueOf(this.f348282q));
                matrix.mapPoints(fArr2, fArr);
                pointF2 = new PointF(fArr2[0], fArr2[1]);
            }
        }
        if (pointF2 != null) {
            float f = pointF2.x;
            int i = this.f348280o;
            pointF2.x = f / ((float) i);
            pointF2.y /= (float) this.f348281p;
            Log.m105925i("MicroMsg.MultiTouchImageView", "alvinluo convertScreenToImageCoordinate screenCoordinate: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s", pointF, pointF2, Integer.valueOf(i), Integer.valueOf(this.f348281p));
        }
        return pointF2;
    }

    /* renamed from: i */
    public void mo26071i(float f, float f2, float f3) {
        mo177314s(f, f2, f3, 128.0f);
    }

    /* renamed from: k */
    public void mo26072k(float f, float f2) {
        mo177311p();
        mo177314s(this.f348282q, f, f2, 128.0f);
    }

    /* renamed from: l */
    public void mo26073l(float f, float f2, float f3) {
        float scale = getScale();
        if (this.f348261D) {
            float f4 = this.f348277i;
            if (0.0f == f4) {
                f4 = this.f348269L * this.f348258A;
            }
            this.f348278j = f4;
        }
        float f5 = this.f348278j;
        if (f > f5 * 2.0f) {
            f = ((f - f5) * 0.1f) + (2.0f * f5);
        } else {
            float f6 = this.f348279n;
            if (f < f6) {
                f = f6;
            }
        }
        float f7 = f / scale;
        if (!this.f348270M) {
            setImageMatrix(getImageViewMatrix());
            this.f348273e.postScale(f7, f7, f2, f3);
        }
        C19706a.C19707a aVar = this.f348284s;
        if (aVar != null) {
            aVar.mo26082a(scale, f);
        }
    }

    /* renamed from: m */
    public void mo26074m() {
        this.f348283r = null;
        mo177311p();
    }

    /* renamed from: n */
    public float mo26075n(float f, float f2) {
        float doubleTabScale = getDoubleTabScale();
        this.f348277i = doubleTabScale;
        mo177314s(doubleTabScale, f, f2, 128.0f);
        return this.f348277i;
    }

    /* renamed from: o */
    public void mo26076o() {
        if (this.f348261D && 0.0f == this.f348277i) {
            this.f348277i = getDoubleTabScale();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i == 1 || i == 2) {
            this.f348287v = false;
        }
    }

    public void onDraw(Canvas canvas) {
        Matrix imageMatrix;
        Bitmap bitmap;
        if (this.f348270M || (bitmap = this.f348276h) == null || !bitmap.isRecycled()) {
            if (this.f348267J != null && (((this.f348270M && this.f348271N != null) || this.f348276h != null) && (imageMatrix = getImageMatrix()) != null)) {
                canvas.save();
                canvas.concat(imageMatrix);
                if (this.f348270M) {
                    if (this.f348271N.getIntrinsicWidth() > 2 && this.f348271N.getIntrinsicHeight() > 2) {
                        canvas.drawRect(1.0f, 1.0f, (float) (this.f348271N.getIntrinsicWidth() - 1), (float) (this.f348271N.getIntrinsicHeight() - 1), this.f348267J);
                    }
                } else if (this.f348276h.getWidth() > 2 && this.f348276h.getHeight() > 2) {
                    canvas.drawRect(1.0f, 1.0f, (float) (this.f348276h.getWidth() - 1), (float) (this.f348276h.getHeight() - 1), this.f348267J);
                }
                canvas.restore();
            }
            super.onDraw(canvas);
            return;
        }
        Log.m105920e("MicroMsg.MultiTouchImageView", "this bitmap is recycled! draw nothing!");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || getScale() <= 1.0f) {
            return super.onKeyUp(i, keyEvent);
        }
        mo26073l(1.0f, ((float) this.f348285t) / 2.0f, ((float) this.f348286u) / 2.0f);
        mo26058c();
        return true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f348285t == View.MeasureSpec.getSize(i) && this.f348286u == View.MeasureSpec.getSize(i2)) {
            this.f348288w = false;
        } else {
            this.f348288w = true;
        }
        this.f348285t = View.MeasureSpec.getSize(i);
        this.f348286u = View.MeasureSpec.getSize(i2);
        if (!this.f348287v) {
            this.f348287v = true;
            mo177312q();
        }
        if (this.f348288w && this.f348289x) {
            mo26059d();
        }
    }

    /* renamed from: p */
    public final void mo177311p() {
        int i;
        Float f = this.f348283r;
        if (f != null) {
            this.f348282q = f.floatValue();
            return;
        }
        float f2 = 2.2f;
        float f3 = 1.8f;
        int i2 = this.f348285t;
        if (!(i2 == 0 || (i = this.f348286u) == 0)) {
            f3 = ((float) i) / ((float) i2);
            if (f3 < 1.5f) {
                f2 = 2.5f;
            }
        }
        int i3 = this.f348280o;
        float f4 = ((float) i2) / ((float) i3);
        this.f348265H = f4;
        int i4 = this.f348286u;
        int i5 = this.f348281p;
        float f5 = ((float) i4) / ((float) i5);
        this.f348266I = f5;
        boolean z = true;
        boolean z2 = ((float) i3) > ((float) i5) * f2;
        this.f348262E = z2;
        boolean z3 = ((float) i5) > ((float) i3) * f2;
        this.f348263F = z3;
        this.f348262E = z2 && i3 > i2;
        if (!z3 || i5 <= i4) {
            z = false;
        }
        this.f348263F = z;
        float f6 = ((float) i5) / ((float) i3);
        if (f6 <= f3 || f6 > f2) {
            this.f348282q = f4 * this.f348260C;
        } else {
            this.f348282q = f5 * this.f348260C;
        }
    }

    /* renamed from: q */
    public final void mo177312q() {
        Log.m105918d("dktest", "init screenWidth:" + this.f348285t + " screenHeight :" + this.f348286u);
        setScaleType(ImageView.ScaleType.MATRIX);
        float f = ((float) getContext().getResources().getDisplayMetrics().widthPixels) / 720.0f;
        if (f > 1.0f) {
            this.f348269L = f;
        }
        mo26059d();
    }

    /* renamed from: r */
    public void mo177313r(float f) {
        if (getScale() >= this.f348278j || getScale() <= this.f348279n) {
            return;
        }
        if (this.f348276h == null && !this.f348270M) {
            return;
        }
        if (this.f348271N != null || !this.f348270M) {
            this.f348273e.postScale(f, f, ((float) this.f348285t) / 2.0f, ((float) this.f348286u) / 2.0f);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* renamed from: s */
    public void mo177314s(float f, float f2, float f3, float f4) {
        float scale = (f - getScale()) / f4;
        float scale2 = getScale();
        this.f348268K.post(new C116068a(f4, System.currentTimeMillis(), scale2, scale, f2, f3));
    }

    public void setCanRefresh(boolean z) {
        this.f348289x = z;
    }

    public void setCustomScaleRate(Float f) {
        this.f348283r = f;
        if (f != null) {
            this.f348282q = f.floatValue();
        }
    }

    public void setDoubleTabScaleLimit(float f) {
        if (Float.compare(f, 0.0f) < 0) {
            Log.m105928w("MicroMsg.MultiTouchImageView", "double tab scale limit is less than 0.0, change nothing, return");
        } else {
            this.f348290y = f;
        }
    }

    public void setEnableHorLongBmpMode(boolean z) {
        this.f348264G = z;
    }

    public void setGifDrawable(Drawable drawable) {
        this.f348270M = true;
        this.f348271N = drawable;
        setImageDrawable(drawable);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [ul3.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGifPath(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 1
            r2.f348270M = r0
            java.lang.Class<ul3.c> r0 = ul3.C102054c.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0031 }
            ul3.c r0 = (ul3.C102054c) r0     // Catch:{ Exception -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            ul3.b r3 = r0.mo126040w(r3, r3)     // Catch:{ Exception -> 0x0031 }
            boolean r0 = r3 instanceof android.graphics.drawable.Drawable     // Catch:{ Exception -> 0x0031 }
            if (r0 == 0) goto L_0x0019
            r1 = r3
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1     // Catch:{ Exception -> 0x0031 }
        L_0x0019:
            r2.f348271N = r1     // Catch:{ Exception -> 0x0031 }
            r2.setImageDrawable(r1)     // Catch:{ Exception -> 0x0031 }
            android.graphics.drawable.Drawable r3 = r2.f348271N     // Catch:{ Exception -> 0x0031 }
            if (r3 == 0) goto L_0x0034
            int r3 = r3.getIntrinsicWidth()     // Catch:{ Exception -> 0x0031 }
            android.graphics.drawable.Drawable r0 = r2.f348271N     // Catch:{ Exception -> 0x0031 }
            int r0 = r0.getIntrinsicHeight()     // Catch:{ Exception -> 0x0031 }
            r2.f348280o = r3     // Catch:{ Exception -> 0x0031 }
            r2.f348281p = r0     // Catch:{ Exception -> 0x0031 }
            goto L_0x0034
        L_0x0031:
            r3 = 0
            r2.f348270M = r3
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MultiTouchImageView.setGifPath(java.lang.String):void");
    }

    public void setImageBackgroundColor(int i) {
        if (Color.alpha(i) == 0) {
            this.f348267J = null;
        } else {
            Paint paint = new Paint(1);
            this.f348267J = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f348267J.setColor(i);
        }
        invalidate();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f348270M = false;
        this.f348276h = bitmap;
        this.f348287v = false;
        super.setImageBitmap(bitmap);
    }

    public void setImageHeight(int i) {
        this.f348281p = i;
    }

    public void setImageViewMatrix(Matrix matrix) {
        float f;
        C19706a.C19707a aVar;
        Matrix imageViewMatrix = getImageViewMatrix();
        float f2 = 0.0f;
        if (imageViewMatrix != null) {
            imageViewMatrix.getValues(this.f348275g);
            f = this.f348275g[0];
        } else {
            f = 0.0f;
        }
        this.f348273e.reset();
        this.f348273e.set(matrix);
        Matrix matrix2 = this.f348273e;
        if (matrix2 != null) {
            matrix2.getValues(this.f348275g);
            f2 = this.f348275g[0];
        }
        setImageMatrix(getImageViewMatrix());
        if (f2 != f && (aVar = this.f348284s) != null) {
            aVar.mo26082a(f, f2);
        }
    }

    public void setImageWidth(int i) {
        this.f348280o = i;
    }

    public void setMaxZoomDoubleTab(boolean z) {
        this.f348261D = z;
    }

    public void setMaxZoomLimit(float f) {
        if (Float.compare(f, 1.0f) < 0) {
            Log.m105928w("MicroMsg.MultiTouchImageView", "max scale limit is less than 1.0, change nothing, return");
        } else {
            this.f348258A = f;
        }
    }

    public void setMinZoomLimit(float f) {
        if (Float.compare(f, 1.0f) > 0) {
            Log.m105928w("MicroMsg.MultiTouchImageView", "min scale limit is greater than 1.0, change nothing, return");
        } else if (Float.compare(f, 0.0f) < 0) {
            Log.m105928w("MicroMsg.MultiTouchImageView", "min scale limit is less than 0.0, change nothing, return");
        } else {
            this.f348291z = f;
        }
    }

    public void setOnZoomScaleChangedListener(C19706a.C19707a aVar) {
        this.f348284s = aVar;
    }

    public void setOriginScale(float f) {
        this.f348259B = f;
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f348272d = new Matrix();
        this.f348273e = new Matrix();
        this.f348274f = new Matrix();
        this.f348275g = new float[9];
        this.f348276h = null;
        this.f348277i = 0.0f;
        this.f348278j = 0.0f;
        this.f348279n = 0.0f;
        this.f348287v = false;
        this.f348288w = false;
        this.f348289x = true;
        this.f348290y = 2.0f;
        this.f348291z = 0.75f;
        this.f348258A = 20.0f;
        this.f348259B = 0.0f;
        this.f348260C = 1.0f;
        this.f348261D = false;
        this.f348262E = false;
        this.f348263F = false;
        this.f348264G = true;
        this.f348267J = null;
        this.f348268K = new MMHandler();
        this.f348269L = 1.0f;
        this.f348270M = false;
        this.f348281p = 0;
        this.f348280o = 0;
        mo177312q();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226875u);
        try {
            setImageBackgroundColor(obtainStyledAttributes.getColor(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
