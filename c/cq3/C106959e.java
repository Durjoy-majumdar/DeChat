package cq3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104084a;
import p1158tg.C110987f;

/* renamed from: cq3.e */
public class C106959e extends C106952a {

    /* renamed from: F */
    public long f320173F = -1;

    /* renamed from: G */
    public C110987f f320174G = new C110987f(this);

    /* renamed from: H */
    public PointF f320175H = new PointF();

    /* renamed from: I */
    public float f320176I = 0.0f;

    /* renamed from: J */
    public float f320177J = 0.0f;

    /* renamed from: K */
    public boolean f320178K = false;

    /* renamed from: L */
    public boolean f320179L = false;

    public C106959e(Context context, C109623f fVar) {
        super(context, fVar);
    }

    /* renamed from: g */
    public void mo157333g(MotionEvent motionEvent) {
        float x = motionEvent.getX(motionEvent.getPointerCount() - 1);
        float y = motionEvent.getY(motionEvent.getPointerCount() - 1);
        if (((C109612c) getPresenter()).f328165h) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f320175H.set(x, y);
                this.f320176I = 0.0f;
                this.f320177J = getCurScale();
                C110987f fVar = this.f320174G;
                fVar.getClass();
                Log.m105918d("MicroMsg.StickRoundAnim", "[cancel]");
                ValueAnimator valueAnimator = fVar.f332410d;
                if (valueAnimator != null && (valueAnimator.isRunning() || fVar.f332410d.isStarted())) {
                    fVar.f332410d.cancel();
                }
                this.f320179L = false;
            } else if (actionMasked == 1) {
                this.f320176I = 0.0f;
                if (this.f320179L) {
                    this.f320174G.mo162659a();
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f320176I = 0.0f;
                    this.f320177J = getCurScale();
                } else if (actionMasked == 6) {
                    this.f320176I = 0.0f;
                    this.f320178K = true;
                }
            } else if (this.f320178K) {
                this.f320178K = false;
                return;
            } else if (motionEvent.getPointerCount() == 2) {
                if (!this.f320179L) {
                    ((C109612c) getPresenter()).f328171n++;
                }
                this.f320179L = true;
                float x2 = motionEvent.getX(0) - motionEvent.getX(1);
                float y2 = motionEvent.getY(0) - motionEvent.getY(1);
                float sqrt = (float) Math.sqrt((double) ((x2 * x2) + (y2 * y2)));
                float f = this.f320176I;
                if (f == 0.0f) {
                    this.f320176I = sqrt;
                } else {
                    float f2 = (sqrt / f) * this.f320177J;
                    if (this.f320148x * 0.5f <= f2) {
                        float f3 = this.f320147w;
                        if (f2 > f3) {
                            f2 = ((f2 - f3) * 0.2f) + f3;
                        }
                        boolean z = ((float) (System.currentTimeMillis() - this.f320173F)) >= 100.0f;
                        if (C106952a.f320126E != 1.0f && ((double) Math.abs(1.0f - f2)) <= 0.005d && z) {
                            this.f320173F = System.currentTimeMillis();
                            performHapticFeedback(0, 3);
                        }
                        getMainMatrix().postScale(f2 / getCurScale(), f2 / getCurScale(), x, y);
                    }
                    this.f320174G.f332399a = true;
                    mo157370j(x, y);
                    postInvalidate();
                }
            } else if (motionEvent.getPointerCount() == 1 && this.f320149y) {
                this.f320179L = true;
                this.f320174G.f332399a = true;
                mo157370j(x, y);
                postInvalidate();
            }
            PointF pointF = this.f320175H;
            pointF.x = x;
            pointF.y = y;
        }
    }

    public float getMinScale() {
        if (((C109612c) getPresenter()).mo160820d().mo145700k() != C104084a.CROP_PHOTO) {
            return super.getMinScale();
        }
        float width = ((float) getBoardRect().width()) / getCurImageRect().width();
        float height = ((float) getBoardRect().height()) / getCurImageRect().height();
        if (width <= height) {
            width = height;
        }
        return width * getCurScale();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo157370j(float r7, float r8) {
        /*
            r6 = this;
            android.graphics.RectF r0 = r6.getCurImageRect()
            android.graphics.PointF r1 = r6.f320175H
            float r2 = r1.x
            float r7 = r7 - r2
            float r1 = r1.y
            float r8 = r8 - r1
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0041
            android.graphics.Rect r3 = r6.getBoardRect()
            int r3 = r3.left
            float r3 = (float) r3
            float r4 = r0.left
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            float r3 = java.lang.Math.abs(r7)
            float r4 = r0.left
            android.graphics.Rect r5 = r6.getBoardRect()
            int r5 = r5.left
            float r5 = (float) r5
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            android.graphics.Rect r7 = r6.getBoardRect()
            int r7 = r7.left
            float r7 = (float) r7
            float r3 = r0.left
            goto L_0x0070
        L_0x0041:
            android.graphics.Rect r3 = r6.getBoardRect()
            int r3 = r3.right
            float r3 = (float) r3
            float r4 = r0.right
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0051
        L_0x004e:
            float r7 = r7 * r2
            goto L_0x0071
        L_0x0051:
            float r3 = java.lang.Math.abs(r7)
            android.graphics.Rect r4 = r6.getBoardRect()
            int r4 = r4.right
            float r4 = (float) r4
            float r5 = r0.right
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            android.graphics.Rect r7 = r6.getBoardRect()
            int r7 = r7.right
            float r7 = (float) r7
            float r3 = r0.right
        L_0x0070:
            float r7 = r7 - r3
        L_0x0071:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a3
            android.graphics.Rect r1 = r6.getBoardRect()
            int r1 = r1.top
            float r1 = (float) r1
            float r3 = r0.top
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0083
            goto L_0x00b0
        L_0x0083:
            float r1 = java.lang.Math.abs(r8)
            float r2 = r0.top
            android.graphics.Rect r3 = r6.getBoardRect()
            int r3 = r3.top
            float r3 = (float) r3
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d3
            android.graphics.Rect r8 = r6.getBoardRect()
            int r8 = r8.top
            float r8 = (float) r8
            float r0 = r0.top
            goto L_0x00d2
        L_0x00a3:
            android.graphics.Rect r1 = r6.getBoardRect()
            int r1 = r1.bottom
            float r1 = (float) r1
            float r3 = r0.bottom
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x00b3
        L_0x00b0:
            float r8 = r8 * r2
            goto L_0x00d3
        L_0x00b3:
            float r1 = java.lang.Math.abs(r8)
            android.graphics.Rect r2 = r6.getBoardRect()
            int r2 = r2.bottom
            float r2 = (float) r2
            float r3 = r0.bottom
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d3
            android.graphics.Rect r8 = r6.getBoardRect()
            int r8 = r8.bottom
            float r8 = (float) r8
            float r0 = r0.bottom
        L_0x00d2:
            float r8 = r8 - r0
        L_0x00d3:
            android.graphics.Matrix r0 = r6.getMainMatrix()
            r0.postTranslate(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq3.C106959e.mo157370j(float, float):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawColor(-16777216);
        Matrix matrix = this.f320134g;
        if (matrix != null) {
            this.f320132e.set(matrix);
            canvas.setMatrix(this.f320134g);
        } else {
            canvas.setMatrix(getMainMatrix());
        }
        canvas.save();
        canvas.clipRect(getAliveRect());
        Bitmap bitmap = ((C109612c) getPresenter()).f328163f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        canvas.restore();
        ((C109612c) getPresenter()).mo160829m(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            C110987f fVar = this.f320174G;
            fVar.f332399a = true;
            fVar.mo162659a();
        }
    }
}
