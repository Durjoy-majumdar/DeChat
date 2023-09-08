package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.p014mm.graphics.p314ui.WxBaseImageView;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import nj3.C117628i1;
import nj3.C47266h1;

/* renamed from: com.tencent.mm.ui.base.WxImageView */
public class WxImageView extends WxBaseImageView implements C19706a {

    /* renamed from: x0 */
    public static final /* synthetic */ int f348324x0 = 0;

    /* renamed from: A */
    public Matrix f348325A = new Matrix();

    /* renamed from: B */
    public Matrix f348326B = new Matrix();

    /* renamed from: C */
    public final Matrix f348327C = new Matrix();

    /* renamed from: D */
    public float f348328D = 0.0f;

    /* renamed from: E */
    public float f348329E = 0.0f;

    /* renamed from: F */
    public float f348330F;

    /* renamed from: G */
    public Float f348331G;

    /* renamed from: H */
    public int f348332H;

    /* renamed from: I */
    public int f348333I;

    /* renamed from: J */
    public int f348334J;

    /* renamed from: K */
    public boolean f348335K = false;

    /* renamed from: L */
    public boolean f348336L = false;

    /* renamed from: M */
    public boolean f348337M = true;

    /* renamed from: N */
    public float f348338N = 2.0f;

    /* renamed from: P */
    public float f348339P = 20.0f;

    /* renamed from: Q */
    public boolean f348340Q = false;

    /* renamed from: R */
    public boolean f348341R = false;

    /* renamed from: S */
    public boolean f348342S = false;

    /* renamed from: T */
    public boolean f348343T = true;

    /* renamed from: U */
    public float f348344U;

    /* renamed from: V */
    public float f348345V;

    /* renamed from: W */
    public MMHandler f348346W = new MMHandler();

    /* renamed from: p0 */
    public float f348347p0 = 1.0f;

    /* renamed from: com.tencent.mm.ui.base.WxImageView$a */
    public class C116071a implements SubsamplingScaleImageView.OnStateChangedListener {

        /* renamed from: a */
        public final /* synthetic */ C19706a.C19707a f348348a;

        public C116071a(WxImageView wxImageView, C19706a.C19707a aVar) {
            this.f348348a = aVar;
        }

        public void onCenterChanged(PointF pointF, int i) {
        }

        public void onScaleChanged(float f, float f2, int i) {
            this.f348348a.mo26082a(f2, f);
        }
    }

    public WxImageView(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo26056a(float f, float f2) {
        Log.m105919d("MicroMsg.WxImageView", "alvinluo WxImageView postTranslate dx: %f, dy: %f", Float.valueOf(f), Float.valueOf(f2));
        this.f348326B.postTranslate(f, f2);
    }

    /* renamed from: b */
    public boolean mo26057b() {
        return this.f348341R;
    }

    /* renamed from: c */
    public void mo26058c() {
        mo177344s(!this.f348343T || !this.f348341R, true ^ this.f348342S);
    }

    /* renamed from: d */
    public void mo26059d() {
        Log.m105918d("MicroMsg.WxImageView", "alvinluo adaptViewSize");
        this.f348326B.reset();
        mo177343r();
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.resetSize();
        }
        mo26073l(this.f348330F, 0.0f, 0.0f);
    }

    /* renamed from: e */
    public boolean mo26060e() {
        return this.f348342S;
    }

    /* renamed from: f */
    public PointF mo26061f(PointF pointF, int i, int i2) {
        if (pointF == null) {
            return null;
        }
        int imageWidth = getImageWidth();
        float f = (float) imageWidth;
        int i3 = (int) (((1.0f * f) * ((float) i2)) / ((float) i));
        float[] fArr = {pointF.x * f, pointF.y * ((float) i3)};
        Log.m105927v("MicroMsg.WxImageView", "mapPoint srcPoint: %s, width: %d, height: %d, viewWidth: %d, viewHeight: %d, targetWidth: %d, targetHeight: %d", pointF, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f348333I), Integer.valueOf(this.f348334J), Integer.valueOf(imageWidth), Integer.valueOf(i3));
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.mapPoint(fArr);
        }
        return null;
    }

    public int getContentLeft() {
        if (!this.f348335K) {
            return 0;
        }
        float f = this.f348330F;
        int i = (int) ((((float) this.f348333I) - (((float) this.f48889h) * f)) / 2.0f);
        if (i < 0) {
            i = 0;
        }
        Log.m105925i("MicroMsg.WxImageView", "alvinluo scaleRate: %f, imageWidth: %d, viewWidth: %d, left: %d", Float.valueOf(f), Integer.valueOf(this.f48889h), Integer.valueOf(this.f348333I), Integer.valueOf(i));
        return i;
    }

    public int getContentTop() {
        if (!this.f348335K) {
            return 0;
        }
        int imageHeight = (int) ((((float) this.f348334J) - (this.f348330F * ((float) getImageHeight()))) / 2.0f);
        if (imageHeight < 0) {
            imageHeight = 0;
        }
        Log.m105925i("MicroMsg.WxImageView", "alvinluo scaleRate: %f, imageHeight: %d, viewHeight: %d, top: %d", Float.valueOf(this.f348330F), Integer.valueOf(getImageHeight()), Integer.valueOf(this.f348334J), Integer.valueOf(imageHeight));
        return imageHeight;
    }

    public float getDoubleTabScale() {
        float scaleRate = getScaleRate();
        float scaleWidth = getScaleWidth() * 0.7f > scaleRate ? getScaleWidth() : getScaleHeight() * 0.7f > scaleRate ? getScaleHeight() : getScaleRate() * this.f348338N;
        if (((double) scaleWidth) < 1.0d) {
            scaleWidth = 1.0f;
        }
        return scaleWidth > getMaxZoom() ? getMaxZoom() : scaleWidth;
    }

    public int getImageHeight() {
        int i = this.f348332H;
        return (i == 90 || i == 270) ? this.f48889h : this.f48890i;
    }

    public Matrix getImageMatrix() {
        this.f348327C.set(this.f348325A);
        this.f348327C.postConcat(this.f348326B);
        return this.f348327C;
    }

    public Matrix getImageViewMatrix() {
        this.f348327C.set(this.f348325A);
        this.f348327C.postConcat(this.f348326B);
        return this.f348327C;
    }

    public PointF getImageViewMatrixScale() {
        return super.getImageViewMatrixScale();
    }

    public PointF getImageViewMatrixTranslation() {
        return super.getImageViewMatrixTranslation();
    }

    public int getImageWidth() {
        int i = this.f348332H;
        return (i == 90 || i == 270) ? this.f48890i : this.f48889h;
    }

    public float getMaxZoom() {
        return this.f348329E;
    }

    public float getMinZoom() {
        return 0.0f;
    }

    public float getScale() {
        return super.getScale();
    }

    public float getScaleHeight() {
        return this.f348345V;
    }

    public float getScaleRate() {
        return this.f348330F;
    }

    public float getScaleWidth() {
        return this.f348344U;
    }

    /* renamed from: h */
    public PointF mo26070h(PointF pointF) {
        int imageWidth = getImageWidth();
        int imageHeight = getImageHeight();
        float[] fArr = {pointF.x, pointF.y};
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        PointF invertMapPoint = subsamplingScaleImageView != null ? subsamplingScaleImageView.invertMapPoint(fArr) : null;
        if (invertMapPoint != null) {
            invertMapPoint.x /= (float) imageWidth;
            invertMapPoint.y /= (float) imageHeight;
            Log.m105925i("MicroMsg.WxImageView", "alvinluo convertScreenToImageCoordinate screenCoordinate: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s", pointF, invertMapPoint, Integer.valueOf(imageWidth), Integer.valueOf(imageHeight));
        }
        return invertMapPoint;
    }

    /* renamed from: i */
    public void mo26071i(float f, float f2, float f3) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.zoomToWithAnimation(f, f2, f3);
        }
    }

    /* renamed from: k */
    public void mo26072k(float f, float f2) {
        mo177343r();
        float scale = (this.f348330F - getScale()) / 128.0f;
        float scale2 = getScale();
        this.f348346W.post(new C117628i1(this, 128.0f, System.currentTimeMillis(), scale2, scale, f, f2));
    }

    /* renamed from: l */
    public void mo26073l(float f, float f2, float f3) {
        float scale = getScale();
        if (this.f348340Q) {
            float f4 = this.f348328D;
            if (0.0f == f4) {
                f4 = this.f348339P * this.f348347p0;
            }
            this.f348329E = f4;
        }
        float f5 = this.f348329E;
        float f6 = 2.0f * f5;
        if (f > f6) {
            f = ((f - f5) * 0.1f) + f6;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f7 = f / scale;
        boolean z = false;
        Log.m105919d("MicroMsg.WxImageView", "alvinluo zoomTo mzdt=%f,mz=%f,scale=%f,oldScale=%f,deltaScale=%f", Float.valueOf(this.f348328D), Float.valueOf(this.f348329E), Float.valueOf(f), Float.valueOf(scale), Float.valueOf(f7));
        this.f348326B.postScale(f7, f7, f2, f3);
        if (!this.f348343T || !this.f348341R) {
            z = true;
        }
        mo177344s(z, !this.f348342S);
    }

    /* renamed from: m */
    public void mo26074m() {
        this.f348331G = null;
        mo177343r();
    }

    /* renamed from: n */
    public float mo26075n(float f, float f2) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            return subsamplingScaleImageView.doubleTapZoom(f, f2);
        }
        return 0.0f;
    }

    /* renamed from: o */
    public void mo26076o() {
        if (this.f348340Q && 0.0f == this.f348328D) {
            this.f348328D = getDoubleTabScale();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i == 1 || i == 2) {
            this.f348335K = false;
        }
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
        mo26073l(1.0f, ((float) this.f348333I) / 2.0f, ((float) this.f348334J) / 2.0f);
        return true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f348333I == View.MeasureSpec.getSize(i) && this.f348334J == View.MeasureSpec.getSize(i2)) {
            this.f348336L = false;
        } else {
            this.f348336L = true;
        }
        this.f348333I = View.MeasureSpec.getSize(i);
        this.f348334J = View.MeasureSpec.getSize(i2);
        if (!this.f348335K) {
            this.f348335K = true;
            Log.m105918d("MicroMsg.WxImageView", "init screenWidth:" + this.f348333I + " screenHeight :" + this.f348334J);
            float f = ((float) getContext().getResources().getDisplayMetrics().widthPixels) / 720.0f;
            if (f > 1.0f) {
                this.f348347p0 = f;
            }
            mo26059d();
        }
        if (this.f348336L && this.f348337M) {
            mo26059d();
        }
    }

    /* renamed from: r */
    public final void mo177343r() {
        int i;
        Float f = this.f348331G;
        if (f != null) {
            this.f348330F = f.floatValue();
            return;
        }
        int imageWidth = getImageWidth();
        int imageHeight = getImageHeight();
        float f2 = 2.2f;
        float f3 = 1.8f;
        int i2 = this.f348333I;
        if (!(i2 == 0 || (i = this.f348334J) == 0)) {
            f3 = ((float) i) / ((float) i2);
            if (((double) f3) < 1.5d) {
                f2 = 2.5f;
            }
        }
        float f4 = (float) imageWidth;
        float f5 = ((float) i2) / f4;
        this.f348344U = f5;
        int i3 = this.f348334J;
        float f6 = (float) imageHeight;
        float f7 = ((float) i3) / f6;
        this.f348345V = f7;
        boolean z = f4 > f6 * f2;
        this.f348341R = z;
        boolean z2 = f6 > f4 * f2;
        this.f348342S = z2;
        this.f348341R = z && imageWidth > i2;
        this.f348342S = z2 && imageHeight > i3;
        float f8 = f6 / f4;
        if (f8 <= f3 || f8 > f2) {
            this.f348330F = f5;
        } else {
            this.f348330F = f7;
        }
        Log.m105925i("MicroMsg.WxImageView", "imgWidth:%s, imgHeight:%s, viewWidth:%s, viewHeight:%s, verticalLong:%b, horizontalLong:%b, scale:%s, viewScale:%s, scaleRate:%s", Integer.valueOf(imageWidth), Integer.valueOf(imageHeight), Integer.valueOf(this.f348333I), Integer.valueOf(this.f348334J), Boolean.valueOf(this.f348342S), Boolean.valueOf(this.f348341R), Float.valueOf(f8), Float.valueOf(f3), Float.valueOf(this.f348330F));
        setScaleRate(this.f348330F);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r0 < r7) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r0 < r8) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo177344s(boolean r7, boolean r8) {
        /*
            r6 = this;
            android.graphics.Matrix r0 = r6.getImageViewMatrix()
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r6.f48889h
            float r2 = (float) r2
            int r3 = r6.f48890i
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r0 = r1.height()
            float r2 = r1.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x003b
            int r8 = r6.f348334J
            float r8 = (float) r8
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x002b
            float r8 = r8 - r0
            float r8 = r8 / r3
            float r0 = r1.top
            goto L_0x0039
        L_0x002b:
            float r0 = r1.top
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            float r8 = -r0
            goto L_0x0050
        L_0x0033:
            float r0 = r1.bottom
            int r5 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
        L_0x0039:
            float r8 = r8 - r0
            goto L_0x0050
        L_0x003b:
            float r8 = r1.top
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            float r8 = -r8
            goto L_0x0050
        L_0x0043:
            float r8 = r1.bottom
            int r0 = r6.f348334J
            float r0 = (float) r0
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            float r8 = r0 - r8
            goto L_0x0050
        L_0x004f:
            r8 = 0
        L_0x0050:
            if (r7 == 0) goto L_0x006f
            int r7 = r6.f348333I
            float r7 = (float) r7
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            float r7 = r7 - r2
            float r7 = r7 / r3
            float r0 = r1.left
            goto L_0x006c
        L_0x005e:
            float r0 = r1.left
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0066
            float r4 = -r0
            goto L_0x0082
        L_0x0066:
            float r0 = r1.right
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
        L_0x006c:
            float r4 = r7 - r0
            goto L_0x0082
        L_0x006f:
            float r7 = r1.left
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            float r4 = -r7
            goto L_0x0082
        L_0x0077:
            float r7 = r1.right
            int r0 = r6.f348333I
            float r0 = (float) r0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0082
            float r4 = r0 - r7
        L_0x0082:
            r6.mo26056a(r4, r8)
            android.graphics.Matrix r7 = r6.getImageViewMatrix()
            r7.mapRect(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.WxImageView.mo177344s(boolean, boolean):void");
    }

    public void setAllowInterceptTouchEvent(boolean z) {
        super.setAllowInterceptTouchEvent(z);
    }

    public void setCanRefresh(boolean z) {
        super.setCanRefresh(z);
    }

    public void setCustomScaleRate(Float f) {
        if (f != null) {
            this.f348331G = f;
            super.setCustomScaleRate(f);
            return;
        }
        mo26074m();
    }

    public void setDoubleTabScaleLimit(float f) {
        if (Float.compare(f, 0.0f) < 0) {
            Log.m105928w("MicroMsg.WxImageView", "double tab scale limit is less than 0.0, change nothing, return");
        } else {
            this.f348338N = f;
        }
    }

    public void setEnableHorLongBmpMode(boolean z) {
        this.f348343T = z;
    }

    public void setImageHeight(int i) {
        this.f48890i = i;
    }

    public void setImageViewMatrix(Matrix matrix) {
        super.setImageViewMatrix(matrix);
    }

    public void setImageWidth(int i) {
        this.f48889h = i;
    }

    public void setMaxZoomDoubleTab(boolean z) {
        this.f348340Q = z;
    }

    public void setMaxZoomLimit(float f) {
        if (Float.compare(f, 1.0f) < 0) {
            Log.m105928w("MicroMsg.WxImageView", "max scale limit is less than 1.0, change nothing, return");
        } else {
            this.f348339P = f;
        }
    }

    public void setMinZoomLimit(float f) {
        if (Float.compare(f, 1.0f) > 0) {
            Log.m105928w("MicroMsg.WxImageView", "min scale limit is greater than 1.0, change nothing, return");
        } else if (Float.compare(f, 0.0f) < 0) {
            Log.m105928w("MicroMsg.WxImageView", "min scale limit is less than 0.0, change nothing, return");
        }
    }

    public void setOnZoomScaleChangedListener(C19706a.C19707a aVar) {
        if (aVar != null) {
            super.setOnZoomScaleChangedListener(new C116071a(this, aVar));
        } else {
            super.setOnZoomScaleChangedListener((SubsamplingScaleImageView.OnStateChangedListener) null);
        }
    }

    public void setOrientation(int i) {
        this.f348332H = i;
        mo177343r();
    }

    /* renamed from: t */
    public void mo177352t(float f, float f2) {
        float translationX = getTranslationX();
        float translationY = getTranslationY();
        float f3 = f + translationX;
        setTranslationX(f3);
        float f4 = f2 + translationY;
        setTranslationY(f4);
        Log.m105925i("MicroMsg.WxImageView", "alvinluo translate x: %f, y: %f, x + dx: %f, y + dy: %f", Float.valueOf(translationX), Float.valueOf(translationY), Float.valueOf(f3), Float.valueOf(f4));
    }

    public WxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C47266h1 h1Var = new C47266h1(this);
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.addOnTouchListener(h1Var);
        }
    }

    public WxImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C47266h1 h1Var = new C47266h1(this);
        SubsamplingScaleImageView subsamplingScaleImageView = this.f48887f;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.addOnTouchListener(h1Var);
        }
    }
}
