package g50;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: g50.j */
public class C107752j {

    /* renamed from: a */
    public TextureView f322484a;

    /* renamed from: b */
    public Handler f322485b;

    /* renamed from: c */
    public int f322486c = 0;

    /* renamed from: d */
    public int f322487d = 0;

    /* renamed from: e */
    public int f322488e = 640;

    /* renamed from: f */
    public int f322489f = 480;

    /* renamed from: g */
    public int f322490g = 0;

    /* renamed from: h */
    public int f322491h = 0;

    /* renamed from: i */
    public int f322492i = 1;

    /* renamed from: j */
    public int f322493j = 0;

    /* renamed from: k */
    public float f322494k = 1.0f;

    /* renamed from: g50.j$a */
    public class C107753a implements Runnable {
        public C107753a() {
        }

        public void run() {
            int i;
            int i2;
            C107752j jVar = C107752j.this;
            int i3 = jVar.f322488e;
            int i4 = jVar.f322489f;
            if (!(jVar.f322484a == null || i3 == 0 || i4 == 0 || (i = jVar.f322486c) == 0 || (i2 = jVar.f322487d) == 0)) {
                double d = ((double) i4) / ((double) i3);
                int i5 = (int) (((double) i) * d);
                if (i2 > i5) {
                    jVar.f322490g = i;
                    jVar.f322491h = i5;
                } else {
                    jVar.f322490g = (int) (((double) i2) / d);
                    jVar.f322491h = i2;
                }
                int i6 = jVar.f322490g;
                int i7 = jVar.f322491h;
                float f = ((float) i6) / ((float) i);
                float f2 = ((float) i7) / ((float) i2);
                Matrix matrix = new Matrix();
                jVar.f322484a.getTransform(matrix);
                matrix.setScale(f, f2);
                matrix.postTranslate(((float) (i - i6)) / 2.0f, ((float) (i2 - i7)) / 2.0f);
                jVar.f322484a.setTransform(matrix);
                jVar.f322484a.requestLayout();
            }
            C107752j jVar2 = C107752j.this;
            jVar2.mo158176b(jVar2.f322492i);
            C107752j jVar3 = C107752j.this;
            jVar3.mo158177c(jVar3.f322493j);
        }
    }

    public C107752j(TextureView textureView) {
        this.f322484a = textureView;
        this.f322486c = textureView.getWidth();
        this.f322487d = textureView.getHeight();
        this.f322485b = new Handler(textureView.getContext().getMainLooper());
    }

    /* renamed from: a */
    public final void mo158175a() {
        try {
            C107753a aVar = new C107753a();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                aVar.run();
            } else {
                this.f322485b.post(aVar);
            }
        } catch (Exception e) {
            Log.m105921e("CustomTextureViewWrapper", "adjust video size failed.", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > r8) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r2 < r8) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158176b(int r8) {
        /*
            r7 = this;
            r7.f322492i = r8
            android.view.TextureView r0 = r7.f322484a
            if (r0 == 0) goto L_0x0084
            r1 = 1
            r2 = 90
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 180(0xb4, float:2.52E-43)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r1) goto L_0x0038
            int r8 = r7.f322493j
            if (r8 == 0) goto L_0x006e
            if (r8 != r4) goto L_0x0018
            goto L_0x006e
        L_0x0018:
            if (r8 == r3) goto L_0x001c
            if (r8 != r2) goto L_0x006e
        L_0x001c:
            int r8 = r7.f322490g
            if (r8 == 0) goto L_0x0037
            int r1 = r7.f322491h
            if (r1 != 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r2 = r7.f322487d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f322486c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0035
        L_0x0033:
            r5 = r8
            goto L_0x006e
        L_0x0035:
            r5 = r2
            goto L_0x006e
        L_0x0037:
            return
        L_0x0038:
            if (r8 != 0) goto L_0x006e
            int r8 = r7.f322490g
            if (r8 == 0) goto L_0x006d
            int r1 = r7.f322491h
            if (r1 != 0) goto L_0x0043
            goto L_0x006d
        L_0x0043:
            int r6 = r7.f322493j
            if (r6 == 0) goto L_0x005d
            if (r6 != r4) goto L_0x004a
            goto L_0x005d
        L_0x004a:
            if (r6 == r3) goto L_0x004e
            if (r6 != r2) goto L_0x006e
        L_0x004e:
            int r2 = r7.f322487d
            float r2 = (float) r2
            float r8 = (float) r8
            float r2 = r2 / r8
            int r8 = r7.f322486c
            float r8 = (float) r8
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0035
            goto L_0x0033
        L_0x005d:
            int r2 = r7.f322487d
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            int r1 = r7.f322486c
            float r1 = (float) r1
            float r8 = (float) r8
            float r1 = r1 / r8
            int r8 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0035
            r5 = r1
            goto L_0x006e
        L_0x006d:
            return
        L_0x006e:
            float r8 = r7.f322494k
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0076
            float r5 = -r5
        L_0x0076:
            r0.setScaleX(r5)
            android.view.TextureView r8 = r7.f322484a
            float r0 = java.lang.Math.abs(r5)
            r8.setScaleY(r0)
            r7.f322494k = r5
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g50.C107752j.mo158176b(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r5 > r0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r5 < r0) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158177c(int r5) {
        /*
            r4 = this;
            int r5 = r5 % 360
            r4.f322493j = r5
            android.view.TextureView r0 = r4.f322484a
            if (r0 == 0) goto L_0x008b
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x004b
            r3 = 180(0xb4, float:2.52E-43)
            if (r5 != r3) goto L_0x0012
            goto L_0x004b
        L_0x0012:
            r3 = 270(0x10e, float:3.78E-43)
            if (r5 == r3) goto L_0x001a
            r3 = 90
            if (r5 != r3) goto L_0x0073
        L_0x001a:
            int r3 = r4.f322490g
            if (r3 == 0) goto L_0x004a
            int r3 = r4.f322491h
            if (r3 != 0) goto L_0x0023
            goto L_0x004a
        L_0x0023:
            int r5 = 360 - r5
            float r5 = (float) r5
            r0.setRotation(r5)
            int r5 = r4.f322487d
            float r5 = (float) r5
            int r0 = r4.f322490g
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = r4.f322486c
            float r0 = (float) r0
            int r3 = r4.f322491h
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r4.f322492i
            if (r3 != r1) goto L_0x0043
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0041
        L_0x003f:
            r2 = r0
            goto L_0x0073
        L_0x0041:
            r2 = r5
            goto L_0x0073
        L_0x0043:
            if (r3 != 0) goto L_0x0073
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0041
            goto L_0x003f
        L_0x004a:
            return
        L_0x004b:
            int r5 = 360 - r5
            float r5 = (float) r5
            r0.setRotation(r5)
            int r5 = r4.f322492i
            if (r5 != r1) goto L_0x0056
            goto L_0x0073
        L_0x0056:
            if (r5 != 0) goto L_0x0073
            int r5 = r4.f322490g
            if (r5 == 0) goto L_0x0072
            int r0 = r4.f322491h
            if (r0 != 0) goto L_0x0061
            goto L_0x0072
        L_0x0061:
            int r1 = r4.f322487d
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r4.f322486c
            float r0 = (float) r0
            float r5 = (float) r5
            float r0 = r0 / r5
            int r5 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0070
            goto L_0x003f
        L_0x0070:
            r2 = r1
            goto L_0x0073
        L_0x0072:
            return
        L_0x0073:
            float r5 = r4.f322494k
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x007b
            float r2 = -r2
        L_0x007b:
            android.view.TextureView r5 = r4.f322484a
            r5.setScaleX(r2)
            android.view.TextureView r5 = r4.f322484a
            float r0 = java.lang.Math.abs(r2)
            r5.setScaleY(r0)
            r4.f322494k = r2
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g50.C107752j.mo158177c(int):void");
    }

    /* renamed from: d */
    public void mo158178d(int i, int i2) {
        Log.m105928w("CustomTextureViewWrapper", "vrender: set video size:" + i + "," + i2);
        this.f322488e = i;
        this.f322489f = i2;
        mo158175a();
    }

    /* renamed from: e */
    public void mo158179e(int i, int i2) {
        Log.m105928w("CustomTextureViewWrapper", "vrender: set view size:" + i + "," + i2);
        this.f322486c = i;
        this.f322487d = i2;
        mo158175a();
    }
}
