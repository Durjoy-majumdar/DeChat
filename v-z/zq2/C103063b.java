package zq2;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: zq2.b */
public class C103063b extends C103062a {

    /* renamed from: A */
    public float f304093A = 1.0f;

    /* renamed from: B */
    public float f304094B = 1.0f;

    /* renamed from: C */
    public float f304095C = 0.0f;

    /* renamed from: D */
    public float f304096D = 0.0f;

    /* renamed from: E */
    public float f304097E = 0.0f;

    /* renamed from: F */
    public float f304098F = 0.0f;

    /* renamed from: G */
    public float f304099G = 0.0f;

    /* renamed from: H */
    public float f304100H = 0.0f;

    /* renamed from: I */
    public boolean f304101I = false;

    /* renamed from: J */
    public float f304102J = 0.0f;

    /* renamed from: K */
    public float f304103K = 0.0f;

    /* renamed from: L */
    public float f304104L = 1.0f;

    /* renamed from: M */
    public float[] f304105M = new float[16];

    /* renamed from: w */
    public float f304106w = 0.0f;

    /* renamed from: x */
    public float f304107x = 0.0f;

    /* renamed from: y */
    public float f304108y = 0.0f;

    /* renamed from: z */
    public float f304109z = 0.0f;

    /* renamed from: zq2.b$a */
    public static class C103064a extends FrameLayout.LayoutParams {
        public C103064a(int i, int i2) {
            super(i, i2);
        }
    }

    public C103063b(Context context) {
        super(context);
    }

    /* renamed from: e */
    public float mo142768e() {
        SnsMethodCalculate.markStartTimeMs("onGetAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f = this.f304104L;
        SnsMethodCalculate.markEndTimeMs("onGetAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        return f;
    }

    /* renamed from: f */
    public float[] mo142769f(float[] fArr) {
        SnsMethodCalculate.markStartTimeMs("onGetMVPMatrix", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(this.f304105M, 0);
        SnsMethodCalculate.markStartTimeMs("updateNormalizedTransXY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        SnsMethodCalculate.markStartTimeMs("getParentWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        int i = this.f304072b;
        SnsMethodCalculate.markEndTimeMs("getParentWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        SnsMethodCalculate.markStartTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f = this.f304089s;
        SnsMethodCalculate.markEndTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f2 = (-(((float) i) - this.f304074d)) / f;
        SnsMethodCalculate.markStartTimeMs("getParentHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        int i2 = this.f304073c;
        SnsMethodCalculate.markEndTimeMs("getParentHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f3 = ((float) i2) - this.f304075e;
        SnsMethodCalculate.markStartTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f4 = this.f304089s;
        SnsMethodCalculate.markEndTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f304108y = f2 + mo142773j(this.f304106w + this.f304102J);
        this.f304109z = (f3 / f4) - mo142773j(this.f304107x + this.f304103K);
        if (this.f304101I) {
            float f5 = this.f304097E;
            SnsMethodCalculate.markStartTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            float f6 = this.f304102J;
            SnsMethodCalculate.markStartTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            float f7 = this.f304106w;
            SnsMethodCalculate.markEndTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            SnsMethodCalculate.markEndTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            float f8 = this.f304098F;
            SnsMethodCalculate.markStartTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            float f9 = this.f304103K;
            SnsMethodCalculate.markStartTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            float f15 = this.f304107x;
            SnsMethodCalculate.markEndTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            SnsMethodCalculate.markEndTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            this.f304099G = mo142773j(-((f5 - ((f6 + f7) + (this.f304074d / 2.0f))) + this.f304106w));
            this.f304100H = mo142773j((f8 - ((f9 + f15) + (this.f304075e / 2.0f))) + this.f304107x);
        } else {
            this.f304099G = 0.0f;
            this.f304100H = 0.0f;
        }
        SnsMethodCalculate.markEndTimeMs("updateNormalizedTransXY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        Matrix.translateM(this.f304105M, 0, this.f304108y, this.f304109z, 0.0f);
        Matrix.rotateM(this.f304105M, 0, 0.0f, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.f304105M, 0, this.f304096D, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(this.f304105M, 0, -this.f304099G, -this.f304100H, 0.0f);
        Matrix.rotateM(this.f304105M, 0, this.f304095C, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(this.f304105M, 0, this.f304099G, this.f304100H, 0.0f);
        Matrix.scaleM(this.f304105M, 0, this.f304093A, this.f304094B, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f304105M, 0);
        SnsMethodCalculate.markEndTimeMs("onGetMVPMatrix", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        return fArr2;
    }

    /* renamed from: i */
    public void mo142772i(Rect rect) {
        SnsMethodCalculate.markStartTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        C103067e eVar = this.f304090t;
        Rect globalVisibleRect = eVar != null ? eVar.getGlobalVisibleRect() : null;
        if (globalVisibleRect == null) {
            globalVisibleRect = new Rect();
        }
        SnsMethodCalculate.markStartTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f = this.f304102J;
        SnsMethodCalculate.markStartTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f2 = this.f304106w;
        SnsMethodCalculate.markEndTimeMs("getTranslationX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        SnsMethodCalculate.markEndTimeMs("getX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        rect.left = ((int) (f + f2)) + globalVisibleRect.left;
        SnsMethodCalculate.markStartTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f3 = this.f304103K;
        SnsMethodCalculate.markStartTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        float f4 = this.f304107x;
        SnsMethodCalculate.markEndTimeMs("getTranslationY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        SnsMethodCalculate.markEndTimeMs("getY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        int i = ((int) (f3 + f4)) + globalVisibleRect.top;
        rect.top = i;
        rect.right = (int) (((float) rect.left) + this.f304074d);
        rect.bottom = (int) (((float) i) + this.f304075e);
        SnsMethodCalculate.markEndTimeMs("getGlobalVisibleRect", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    /* renamed from: j */
    public final float mo142773j(float f) {
        SnsMethodCalculate.markStartTimeMs("getNormalizedDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        SnsMethodCalculate.markStartTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f2 = this.f304089s;
        SnsMethodCalculate.markEndTimeMs("getBaseDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f3 = f / (f2 * 0.5f);
        SnsMethodCalculate.markEndTimeMs("getNormalizedDimen", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        return f3;
    }

    /* renamed from: k */
    public void mo142774k(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.f304102J = (float) i;
        this.f304103K = (float) i2;
        SnsMethodCalculate.markStartTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f304074d = (float) (i3 - i);
        this.f304075e = (float) (i4 - i2);
        mo142766c();
        SnsMethodCalculate.markEndTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    /* renamed from: l */
    public void mo142775l(float f) {
        SnsMethodCalculate.markStartTimeMs("setAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.f304104L = f;
        mo142766c();
        SnsMethodCalculate.markEndTimeMs("setAlpha", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    /* renamed from: m */
    public void mo142776m(C103064a aVar) {
        SnsMethodCalculate.markStartTimeMs("setLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.f304102J = (float) aVar.leftMargin;
        this.f304103K = (float) aVar.topMargin;
        int i = aVar.width;
        int i2 = aVar.height;
        SnsMethodCalculate.markStartTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f304074d = (float) i;
        this.f304075e = (float) i2;
        mo142766c();
        SnsMethodCalculate.markEndTimeMs("setSize", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        SnsMethodCalculate.markEndTimeMs("setLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }

    /* renamed from: n */
    public void mo142777n(float f) {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("setStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        this.f304092v = f;
        SnsMethodCalculate.markStartTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        SnsMethodCalculate.markStartTimeMs("isAttached", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        boolean z = this.f304088r;
        SnsMethodCalculate.markEndTimeMs("isAttached", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        if (!(!z || (i = this.f304072b) == 0 || (i2 = this.f304073c) == 0)) {
            mo142770g(i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        mo142766c();
        SnsMethodCalculate.markEndTimeMs("setStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
    }
}
