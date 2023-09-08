package com.tencent.liteav.beauty.p305b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;

/* renamed from: com.tencent.liteav.beauty.b.n */
public final class C104508n extends C17189b {

    /* renamed from: a */
    public static final short[] f309738a;

    /* renamed from: b */
    public static final FloatBuffer f309739b;

    /* renamed from: c */
    public static final ShortBuffer f309740c;

    /* renamed from: h */
    private static final float[] f309741h = new float[8];

    /* renamed from: i */
    private static final float[] f309742i;

    /* renamed from: d */
    public C104509a[] f309743d;

    /* renamed from: e */
    public List<C104510o> f309744e;

    /* renamed from: f */
    public boolean f309745f;

    /* renamed from: g */
    public int f309746g;

    /* renamed from: j */
    private C104509a f309747j;

    /* renamed from: k */
    private int f309748k;

    /* renamed from: l */
    private C104510o f309749l;

    /* renamed from: com.tencent.liteav.beauty.b.n$a */
    public static class C104509a {

        /* renamed from: a */
        public FloatBuffer f309750a = null;

        /* renamed from: b */
        public Bitmap f309751b;

        /* renamed from: c */
        public int f309752c = -1;

        /* renamed from: a */
        public final void mo147187a() {
            this.f309751b = null;
            OpenGlUtils.deleteTexture(this.f309752c);
            this.f309752c = -1;
        }
    }

    static {
        short[] sArr = {1, 2, 0, 2, 0, 3};
        f309738a = sArr;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        f309742i = fArr;
        f309739b = (FloatBuffer) ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).asReadOnlyBuffer().position(0);
        f309740c = (ShortBuffer) ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr).asReadOnlyBuffer().position(0);
    }

    public C104508n() {
        this(C17189b.NO_FILTER_VERTEX_SHADER, C17189b.NO_FILTER_FRAGMENT_SHADER);
    }

    /* renamed from: a */
    public final void mo147184a() {
        this.f309745f = true;
    }

    public final void afterDrawArrays() {
        super.afterDrawArrays();
        if (this.f309745f) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(this.f309746g, 771);
            int i = 0;
            while (true) {
                C104509a[] aVarArr = this.f309743d;
                if (i < aVarArr.length) {
                    if (aVarArr[i] != null) {
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, this.f309743d[i].f309752c);
                        GLES20.glUniform1i(this.mGLUniformTexture, 0);
                        GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 8, this.f309743d[i].f309750a);
                        GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
                        GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, 5126, false, 0, f309739b);
                        GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
                        GLES20.glDrawElements(4, f309738a.length, 5123, f309740c);
                        GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
                        GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoord);
                    }
                    i++;
                } else {
                    GLES20.glDisable(3042);
                    return;
                }
            }
        }
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        C104510o oVar = this.f309749l;
        if (oVar != null) {
            mo147185a(oVar.f309753a, oVar.f309754b, oVar.f309755c, oVar.f309756d);
        }
        List<C104510o> list = this.f309744e;
        if (list != null) {
            mo147186a(list);
        }
    }

    public final void onUninit() {
        super.onUninit();
        C104509a[] aVarArr = this.f309743d;
        if (aVarArr != null && aVarArr.length != 0) {
            int i = 0;
            while (true) {
                C104509a[] aVarArr2 = this.f309743d;
                if (i < aVarArr2.length) {
                    C104509a aVar = aVarArr2[i];
                    if (aVar != null) {
                        aVar.mo147187a();
                        this.f309743d[i] = null;
                    }
                    i++;
                } else {
                    this.f309743d = null;
                    return;
                }
            }
        }
    }

    private C104508n(String str, String str2) {
        super(str, str2);
        this.f309743d = null;
        this.f309747j = null;
        this.f309744e = null;
        this.f309745f = false;
        this.f309746g = 1;
        this.f309748k = 1;
        this.f309749l = null;
    }

    /* renamed from: a */
    private void m139794a(Bitmap bitmap, float f, float f2, float f3, int i) {
        C104509a aVar;
        Bitmap bitmap2;
        C104509a[] aVarArr = this.f309743d;
        if (i >= aVarArr.length || (aVar = aVarArr[i]) == null) {
            LiteavLog.m16898e("TXCGPUWatermarkFilter", "index is too large for mRenderObjects!");
            return;
        }
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            C104509a aVar2 = this.f309743d[i];
            float[] fArr = f309741h;
            aVar2.f309750a = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            float[] fArr2 = new float[fArr.length];
            float f4 = (f * 2.0f) - 1.0f;
            fArr2[0] = f4;
            float f5 = 1.0f - (f2 * 2.0f);
            fArr2[1] = f5;
            fArr2[2] = f4;
            C104507p pVar = this.mOutputSize;
            float f6 = f5 - (((((((float) height) / ((float) width)) * f3) * ((float) pVar.f309736a)) / ((float) pVar.f309737b)) * 2.0f);
            fArr2[3] = f6;
            float f7 = f4 + (f3 * 2.0f);
            fArr2[4] = f7;
            fArr2[5] = f6;
            fArr2[6] = f7;
            fArr2[7] = f5;
            for (int i2 = 1; i2 <= 7; i2 += 2) {
                fArr2[i2] = fArr2[i2] * -1.0f;
            }
            this.f309743d[i].f309750a.put(fArr2).position(0);
            C104509a aVar3 = this.f309743d[i];
            Bitmap bitmap3 = aVar3.f309751b;
            if (bitmap3 == null || !bitmap3.equals(bitmap)) {
                if (!(aVar3.f309752c == -1 || (bitmap2 = aVar3.f309751b) == null || (bitmap2.getWidth() == bitmap.getWidth() && aVar3.f309751b.getHeight() == bitmap.getHeight()))) {
                    OpenGlUtils.deleteTexture(aVar3.f309752c);
                    aVar3.f309752c = -1;
                }
                aVar3.f309752c = OpenGlUtils.loadTexture(bitmap, aVar3.f309752c, false);
            }
            aVar3.f309751b = bitmap;
        } else if (aVarArr != null && aVar != null) {
            LiteavLog.m16902i("TXCGPUWatermarkFilter", "release %d watermark!", Integer.valueOf(i));
            this.f309743d[i].mo147187a();
            this.f309743d[i] = null;
        }
    }

    /* renamed from: a */
    public final void mo147185a(Bitmap bitmap, float f, float f2, float f3) {
        if (this.f309743d == null) {
            this.f309743d = new C104509a[1];
        }
        C104509a[] aVarArr = this.f309743d;
        if (aVarArr[0] == null) {
            aVarArr[0] = new C104509a();
        }
        m139794a(bitmap, f, f2, f3, 0);
        this.f309747j = this.f309743d[0];
        if (bitmap == null) {
            this.f309749l = null;
            return;
        }
        if (this.f309749l == null) {
            this.f309749l = new C104510o();
        }
        C104510o oVar = this.f309749l;
        oVar.f309753a = bitmap;
        oVar.f309754b = f;
        oVar.f309755c = f2;
        oVar.f309756d = f3;
    }

    /* renamed from: a */
    public final void mo147186a(List<C104510o> list) {
        List<C104510o> list2 = this.f309744e;
        if (list2 == null || !m139795a(list2, list)) {
            this.f309744e = list;
            if (this.f309743d != null) {
                int i = this.f309748k;
                while (true) {
                    C104509a[] aVarArr = this.f309743d;
                    if (i >= aVarArr.length) {
                        break;
                    }
                    OpenGlUtils.deleteTexture(aVarArr[i].f309752c);
                    this.f309743d[i].f309752c = -1;
                    i++;
                }
            }
            C104509a[] aVarArr2 = new C104509a[(list.size() + this.f309748k)];
            this.f309743d = aVarArr2;
            aVarArr2[0] = this.f309747j;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C104510o oVar = list.get(i2);
                if (oVar != null) {
                    this.f309743d[this.f309748k + i2] = new C104509a();
                    m139794a(oVar.f309753a, oVar.f309754b, oVar.f309755c, oVar.f309756d, i2 + this.f309748k);
                }
            }
            return;
        }
        LiteavLog.m16901i("TXCGPUWatermarkFilter", "Same markList");
    }

    /* renamed from: a */
    private static boolean m139795a(List<C104510o> list, List<C104510o> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            C104510o oVar = list.get(i);
            C104510o oVar2 = list2.get(i);
            if (!oVar.f309753a.equals(oVar2.f309753a) || oVar.f309754b != oVar2.f309754b || oVar.f309755c != oVar2.f309755c || oVar.f309756d != oVar2.f309756d) {
                return false;
            }
        }
        return true;
    }
}
