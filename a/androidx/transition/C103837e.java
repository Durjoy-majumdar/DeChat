package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* renamed from: androidx.transition.e */
public class C103837e {

    /* renamed from: a */
    public static final boolean f306783a = true;

    /* renamed from: b */
    public static final boolean f306784b = true;

    /* renamed from: c */
    public static final boolean f306785c;

    /* renamed from: androidx.transition.e$a */
    public static class C103838a implements TypeEvaluator<Matrix> {

        /* renamed from: a */
        public final float[] f306786a = new float[9];

        /* renamed from: b */
        public final float[] f306787b = new float[9];

        /* renamed from: c */
        public final Matrix f306788c = new Matrix();

        public Object evaluate(float f, Object obj, Object obj2) {
            ((Matrix) obj).getValues(this.f306786a);
            ((Matrix) obj2).getValues(this.f306787b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f306787b;
                float f2 = fArr[i];
                float f3 = this.f306786a[i];
                fArr[i] = f3 + ((f2 - f3) * f);
            }
            this.f306788c.setValues(this.f306787b);
            return this.f306788c;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f306785c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0104  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View m138412a(android.view.ViewGroup r16, android.view.View r17, android.view.View r18) {
        /*
            r0 = r16
            r1 = r17
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            int r3 = r18.getScrollX()
            int r3 = -r3
            float r3 = (float) r3
            int r4 = r18.getScrollY()
            int r4 = -r4
            float r4 = (float) r4
            r2.setTranslate(r3, r4)
            i4.z r3 = p853i4.C108360v.f324401a
            r3.mo158855c(r1, r2)
            r3.mo158856d(r0, r2)
            android.graphics.RectF r3 = new android.graphics.RectF
            int r4 = r17.getWidth()
            float r4 = (float) r4
            int r5 = r17.getHeight()
            float r5 = (float) r5
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            r2.mapRect(r3)
            float r4 = r3.left
            int r4 = java.lang.Math.round(r4)
            float r5 = r3.top
            int r5 = java.lang.Math.round(r5)
            float r6 = r3.right
            int r6 = java.lang.Math.round(r6)
            float r7 = r3.bottom
            int r7 = java.lang.Math.round(r7)
            android.widget.ImageView r8 = new android.widget.ImageView
            android.content.Context r9 = r17.getContext()
            r8.<init>(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r9)
            boolean r9 = f306783a
            r10 = 0
            if (r9 == 0) goto L_0x006c
            boolean r9 = r17.isAttachedToWindow()
            r9 = r9 ^ 1
            if (r0 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            boolean r11 = r16.isAttachedToWindow()
            goto L_0x006e
        L_0x006c:
            r9 = 0
        L_0x006d:
            r11 = 0
        L_0x006e:
            boolean r12 = f306784b
            r13 = 0
            if (r12 == 0) goto L_0x008b
            if (r9 == 0) goto L_0x008b
            if (r11 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            android.view.ViewParent r10 = r17.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r11 = r10.indexOfChild(r1)
            android.view.ViewGroupOverlay r14 = r16.getOverlay()
            r14.add(r1)
            goto L_0x008d
        L_0x008b:
            r10 = r13
            r11 = 0
        L_0x008d:
            float r14 = r3.width()
            int r14 = java.lang.Math.round(r14)
            float r15 = r3.height()
            int r15 = java.lang.Math.round(r15)
            if (r14 <= 0) goto L_0x00f4
            if (r15 <= 0) goto L_0x00f4
            r13 = 1233125376(0x49800000, float:1048576.0)
            int r0 = r14 * r15
            float r0 = (float) r0
            float r13 = r13 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r13)
            float r13 = (float) r14
            float r13 = r13 * r0
            int r13 = java.lang.Math.round(r13)
            float r14 = (float) r15
            float r14 = r14 * r0
            int r14 = java.lang.Math.round(r14)
            float r15 = r3.left
            float r15 = -r15
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r15, r3)
            r2.postScale(r0, r0)
            boolean r0 = f306785c
            if (r0 == 0) goto L_0x00e2
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r3 = r0.beginRecording(r13, r14)
            r3.concat(r2)
            r1.draw(r3)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x00f3
        L_0x00e2:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r14, r0)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            r3.concat(r2)
            r1.draw(r3)
        L_0x00f3:
            r13 = r0
        L_0x00f4:
            if (r12 == 0) goto L_0x0102
            if (r9 == 0) goto L_0x0102
            android.view.ViewGroupOverlay r0 = r16.getOverlay()
            r0.remove(r1)
            r10.addView(r1, r11)
        L_0x0102:
            if (r13 == 0) goto L_0x0107
            r8.setImageBitmap(r13)
        L_0x0107:
            int r0 = r6 - r4
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r2 = r7 - r5
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            r8.measure(r0, r1)
            r8.layout(r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C103837e.m138412a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }
}
