package com.tencent.liteav.beauty.p305b;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p310c.C17203c;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.beauty.b.a */
public final class C17129a extends C17189b implements C17135b {

    /* renamed from: a */
    private final FloatBuffer f46188a = OpenGlUtils.createNormalCubeVerticesBuffer();

    /* renamed from: b */
    private final FloatBuffer f46189b = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);

    /* renamed from: c */
    private final C17145e f46190c = new C17145e();

    /* renamed from: d */
    private final C17130a f46191d = new C17130a();

    /* renamed from: e */
    private final C17160m f46192e = new C17160m();

    /* renamed from: f */
    private float f46193f = 0.0f;

    /* renamed from: g */
    private float f46194g = 0.0f;

    /* renamed from: h */
    private float f46195h = 0.0f;

    /* renamed from: i */
    private float f46196i = 0.0f;

    /* renamed from: com.tencent.liteav.beauty.b.a$a */
    public static class C17130a extends C17203c {

        /* renamed from: a */
        public int f46197a = -1;

        /* renamed from: b */
        public int f46198b = -1;

        /* renamed from: c */
        public int f46199c = -1;

        public C17130a() {
            super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", C17189b.NO_FILTER_FRAGMENT_SHADER);
        }

        public final int buildProgram() {
            return NativeLoad.nativeLoadGLProgram(1);
        }

        public final void onInit(C17223e eVar) {
            super.onInit(eVar);
            this.f46197a = GLES20.glGetUniformLocation(getProgramId(), "smoothDegree");
            this.f46198b = GLES20.glGetUniformLocation(getProgramId(), "brightDegree");
            this.f46199c = GLES20.glGetUniformLocation(getProgramId(), "ruddyDegree");
        }
    }

    /* renamed from: a */
    public final void mo19408a(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        this.f46193f = f;
        C17130a aVar = this.f46191d;
        int i = aVar.f46197a;
        float f6 = 1.0f;
        if (f > 1.0f) {
            double d = (double) f;
            if (d < 2.5d) {
                f3 = (f - 1.0f) / 1.5f;
                f4 = 3.1f;
            } else if (f < 4.0f) {
                f6 = 4.1f;
                f5 = ((f - 2.5f) / 1.5f) * 1.5f;
                f = f5 + f6;
                f2 = f / 10.0f;
            } else if (d < 5.5d) {
                f3 = (f - 4.0f) / 1.5f;
                f6 = 5.6f;
                f4 = 1.2000003f;
            } else {
                if (d <= 7.0d) {
                    f3 = (f - 5.5f) / 1.5f;
                    f6 = 6.8f;
                    f4 = 0.19999981f;
                }
                f2 = f / 10.0f;
            }
            f5 = f3 * f4;
            f = f5 + f6;
            f2 = f / 10.0f;
        } else {
            f2 = 0.1f;
        }
        aVar.setFloatOnDraw(i, f2);
    }

    /* renamed from: b */
    public final void mo19409b(float f) {
        this.f46194g = f;
        C17130a aVar = this.f46191d;
        aVar.setFloatOnDraw(aVar.f46198b, f / 3.0f);
    }

    /* renamed from: c */
    public final void mo19410c(float f) {
        this.f46195h = f;
        C17130a aVar = this.f46191d;
        aVar.setFloatOnDraw(aVar.f46199c, (f / 10.0f) / 2.0f);
    }

    public final boolean canBeSkipped() {
        return this.f46193f <= 0.0f && this.f46194g <= 0.0f && this.f46195h <= 0.0f && this.f46196i <= 0.0f;
    }

    /* renamed from: d */
    public final void mo19411d(float f) {
        float f2 = f / 1.5f;
        this.f46196i = f2;
        this.f46192e.mo19431a(f2);
    }

    public final void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        FloatBuffer floatBuffer3;
        int i2;
        FloatBuffer floatBuffer4;
        FloatBuffer floatBuffer5;
        int i3;
        FloatBuffer floatBuffer6;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            float f = this.f46193f;
            C17222d dVar2 = null;
            if (f > 0.0f || this.f46194g > 0.0f || this.f46195h > 0.0f) {
                if (f != 0.0f) {
                    C17223e eVar = this.mTexturePool;
                    C104507p pVar = this.mOutputSize;
                    dVar2 = eVar.mo20199a(pVar.f309736a, pVar.f309737b);
                    this.f46190c.onDraw(i, dVar2, floatBuffer, floatBuffer2);
                    i3 = dVar2.mo20195a();
                    floatBuffer5 = this.f46188a;
                    floatBuffer6 = this.f46189b;
                } else {
                    floatBuffer6 = floatBuffer2;
                    floatBuffer5 = floatBuffer;
                    i3 = i;
                }
                C17223e eVar2 = this.mTexturePool;
                C104507p pVar2 = this.mOutputSize;
                C17222d a = eVar2.mo20199a(pVar2.f309736a, pVar2.f309737b);
                this.f46191d.mo20134a("inputImageTexture2", i);
                if (this.f46196i > 0.0f) {
                    this.f46191d.onDraw(i3, a, floatBuffer5, floatBuffer6);
                } else {
                    this.f46191d.onDraw(i3, dVar, floatBuffer5, floatBuffer6);
                }
                i2 = a.mo20195a();
                floatBuffer3 = this.f46188a;
                floatBuffer4 = this.f46189b;
                if (dVar2 != null) {
                    dVar2.release();
                }
                dVar2 = a;
            } else {
                floatBuffer4 = floatBuffer2;
                floatBuffer3 = floatBuffer;
                i2 = i;
            }
            if (this.f46196i > 0.0f || i2 == i) {
                this.f46192e.onDraw(i2, dVar, floatBuffer3, floatBuffer4);
            }
            if (dVar2 != null) {
                dVar2.release();
            }
        }
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46190c.initialize(eVar);
        this.f46191d.initialize(eVar);
        this.f46192e.initialize(eVar);
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        this.f46191d.onOutputSizeChanged(i, i2);
        this.f46190c.onOutputSizeChanged(i, i2);
        this.f46192e.onOutputSizeChanged(i, i2);
    }

    public final void onUninit() {
        super.onUninit();
        this.f46191d.uninitialize();
        this.f46190c.uninitialize();
        this.f46192e.uninitialize();
    }
}
