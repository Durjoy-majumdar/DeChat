package zq2;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p104ad.widget.gllib.GLViewContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: zq2.a */
public abstract class C103062a {

    /* renamed from: a */
    public Context f304071a;

    /* renamed from: b */
    public int f304072b;

    /* renamed from: c */
    public int f304073c;

    /* renamed from: d */
    public float f304074d;

    /* renamed from: e */
    public float f304075e;

    /* renamed from: f */
    public float f304076f;

    /* renamed from: g */
    public float f304077g;

    /* renamed from: h */
    public Bitmap f304078h;

    /* renamed from: i */
    public int f304079i = 0;

    /* renamed from: j */
    public FloatBuffer f304080j;

    /* renamed from: k */
    public FloatBuffer f304081k;

    /* renamed from: l */
    public int f304082l;

    /* renamed from: m */
    public int f304083m;

    /* renamed from: n */
    public int f304084n;

    /* renamed from: o */
    public int f304085o;

    /* renamed from: p */
    public float[] f304086p = null;

    /* renamed from: q */
    public float[] f304087q = null;

    /* renamed from: r */
    public boolean f304088r = false;

    /* renamed from: s */
    public float f304089s = 1.0f;

    /* renamed from: t */
    public C103067e f304090t;

    /* renamed from: u */
    public int f304091u;

    /* renamed from: v */
    public float f304092v = 0.0f;

    public C103062a(Context context) {
        this.f304071a = context;
    }

    /* renamed from: a */
    public final float mo142764a(float f, float f2, float f3) {
        SnsMethodCalculate.markStartTimeMs("getRotatedX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        double d = (double) f3;
        float cos = (float) ((((double) f) * Math.cos(d)) + (((double) f2) * Math.sin(d)));
        SnsMethodCalculate.markEndTimeMs("getRotatedX", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        return cos;
    }

    /* renamed from: b */
    public final float mo142765b(float f, float f2, float f3) {
        SnsMethodCalculate.markStartTimeMs("getRotatedY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        double d = (double) f2;
        double d2 = (double) f3;
        float cos = (float) ((d * Math.cos(d2)) - (((double) f) * Math.sin(d2)));
        SnsMethodCalculate.markEndTimeMs("getRotatedY", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        return cos;
    }

    /* renamed from: c */
    public void mo142766c() {
        SnsMethodCalculate.markStartTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        C103067e eVar = this.f304090t;
        if (eVar != null) {
            eVar.invalidate();
        }
        SnsMethodCalculate.markEndTimeMs("invalidate", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    /* renamed from: d */
    public void mo142767d(C103067e eVar, int i) {
        SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f304090t = eVar;
        this.f304088r = true;
        this.f304085o = i;
        Bitmap bitmap = this.f304078h;
        if (bitmap != null) {
            this.f304084n = ((GLViewContainer) eVar).mo130531f(bitmap);
        }
        mo142766c();
        SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    /* renamed from: e */
    public abstract float mo142768e();

    /* renamed from: f */
    public abstract float[] mo142769f(float[] fArr);

    /* renamed from: g */
    public void mo142770g(int i, int i2) {
        float[] fArr;
        float[] fArr2;
        int i3 = i2;
        SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f304072b = i;
        this.f304073c = i3;
        float f = (float) i3;
        this.f304089s = f;
        float f2 = this.f304074d;
        float f3 = f2 / f;
        float f4 = f2 / f;
        float f5 = this.f304075e;
        float f6 = f5 / f;
        float f7 = -f3;
        float f8 = -(f5 / f);
        this.f304086p = new float[]{f7, f6, 0.0f, f7, f8, 0.0f, f4, f6, 0.0f, f4, f8, 0.0f};
        SnsMethodCalculate.markStartTimeMs("updateStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        float f9 = f3;
        float radians = (float) Math.toRadians((double) this.f304092v);
        float f15 = -f6;
        float f16 = f9;
        this.f304086p = new float[]{mo142764a(f7, f6, radians), mo142765b(f7, f6, radians), 0.0f, mo142764a(f7, f15, radians), mo142765b(f7, f15, radians), 0.0f, mo142764a(f16, f6, radians), mo142765b(f16, f6, radians), 0.0f, mo142764a(f16, f15, radians), mo142765b(f16, f15, radians), 0.0f};
        SnsMethodCalculate.markEndTimeMs("updateStaticRotation", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        int i4 = this.f304079i;
        float f17 = this.f304074d;
        float f18 = this.f304075e;
        float f19 = this.f304076f;
        float f25 = this.f304077g;
        SnsMethodCalculate.markStartTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        if (i4 == 0) {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        } else if (i4 == 1) {
            float f26 = f19 * 1.0f;
            if ((f17 * 1.0f) / f18 > f26 / f25) {
                float f27 = ((f25 * 1.0f) * f17) / f19;
                float f28 = (f27 - f18) / 2.0f;
                float f29 = f28 / f27;
                float f35 = (f27 - f28) / f27;
                fArr2 = new float[]{0.0f, f29, 0.0f, f35, 1.0f, f29, 1.0f, f35};
                SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            } else {
                float f36 = (f26 * f18) / f25;
                float f37 = (f36 - f17) / 2.0f;
                float f38 = f37 / f36;
                float f39 = (f36 - f37) / f36;
                fArr2 = new float[]{f38, 0.0f, f38, 1.0f, f39, 0.0f, f39, 1.0f};
                SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            }
            fArr = fArr2;
        } else if (i4 == 2) {
            float f44 = f19 * 1.0f;
            if ((f17 * 1.0f) / f18 > f44 / f25) {
                float f45 = f18 / (((f25 * 1.0f) * f17) / f19);
                fArr = new float[]{0.0f, 0.0f, 0.0f, f45, 1.0f, 0.0f, 1.0f, f45};
                SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            } else {
                float f46 = f17 / ((f44 * f18) / f25);
                fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, f46, 0.0f, f46, 1.0f};
                SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
            }
        } else {
            fArr = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            SnsMethodCalculate.markEndTimeMs("getTextureCoords", "com.tencent.mm.plugin.sns.ad.widget.gllib.ScaleTypeUtils");
        }
        this.f304087q = fArr;
        SnsMethodCalculate.markStartTimeMs("initVertex", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        FloatBuffer put = ByteBuffer.allocateDirect(this.f304086p.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f304086p);
        this.f304080j = put;
        put.position(0);
        SnsMethodCalculate.markEndTimeMs("initVertex", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        SnsMethodCalculate.markStartTimeMs("initFragment", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        FloatBuffer put2 = ByteBuffer.allocateDirect(this.f304087q.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.f304087q);
        this.f304081k = put2;
        put2.position(0);
        SnsMethodCalculate.markEndTimeMs("initFragment", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        mo142766c();
        SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }

    /* renamed from: h */
    public void mo142771h(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        this.f304078h = bitmap;
        if (bitmap != null) {
            this.f304076f = (float) bitmap.getWidth();
            this.f304077g = (float) bitmap.getHeight();
            if (this.f304088r) {
                this.f304084n = ((GLViewContainer) this.f304090t).mo130531f(this.f304078h);
                mo142770g(this.f304072b, this.f304073c);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setImageBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
    }
}
