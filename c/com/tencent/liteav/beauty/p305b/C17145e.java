package com.tencent.liteav.beauty.p305b;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p310c.C17203c;
import com.tencent.liteav.videobase.p310c.C17204d;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.beauty.b.e */
public final class C17145e extends C17189b {

    /* renamed from: a */
    private final FloatBuffer f46254a = OpenGlUtils.createNormalCubeVerticesBuffer();

    /* renamed from: b */
    private final FloatBuffer f46255b = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);

    /* renamed from: c */
    private final C17141c f46256c = new C17141c();

    /* renamed from: d */
    private final C17189b f46257d = new C17189b();

    /* renamed from: e */
    private final C17148c f46258e = new C17148c();

    /* renamed from: f */
    private final C17146a f46259f = new C17146a("precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture2, textureCoordinate2) - texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture2, textureCoordinate2);\n}\n");

    /* renamed from: g */
    private final C17147b f46260g = new C17147b("precision highp float;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\nvoid main()\n{\n    gl_FragColor = texture2D(inputImageTexture, textureCoordinate) * texture2D(inputImageTexture3, textureCoordinate3) + texture2D(inputImageTexture2, textureCoordinate2);\n}\n");

    /* renamed from: h */
    private float f46261h = 4.0f;

    /* renamed from: i */
    private int f46262i;

    /* renamed from: j */
    private int f46263j;

    /* renamed from: k */
    private boolean f46264k;

    /* renamed from: com.tencent.liteav.beauty.b.e$a */
    public static class C17146a extends C17204d {
        public C17146a(String str) {
            super(str);
        }
    }

    /* renamed from: com.tencent.liteav.beauty.b.e$b */
    public static class C17147b extends C17203c {
        public C17147b(String str) {
            super(str);
        }
    }

    /* renamed from: com.tencent.liteav.beauty.b.e$c */
    public static class C17148c extends C17204d {

        /* renamed from: a */
        private int f46265a;

        /* renamed from: b */
        private int f46266b;

        public C17148c() {
            super((String) null, (String) null);
        }

        public final int buildProgram() {
            return NativeLoad.nativeLoadGLProgram(2);
        }

        public final void onInit(C17223e eVar) {
            super.onInit(eVar);
            this.f46265a = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
            this.f46266b = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        }

        public final void onOutputSizeChanged(int i, int i2) {
            super.onOutputSizeChanged(i, i2);
            setFloatOnDraw(this.f46265a, 1.5f / ((float) this.mOutputSize.f309736a));
            setFloatOnDraw(this.f46266b, 1.5f / ((float) this.mOutputSize.f309737b));
        }
    }

    public final void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int i2;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            C17222d dVar2 = null;
            int i3 = this.f46262i;
            C104507p pVar = this.mOutputSize;
            if (i3 == pVar.f309736a && this.f46263j == pVar.f309737b) {
                i2 = i;
            } else {
                dVar2 = this.mTexturePool.mo20199a(i3, this.f46263j);
                GLES20.glViewport(0, 0, this.f46262i, this.f46263j);
                this.f46257d.onDraw(i, dVar2, floatBuffer, floatBuffer2);
                i2 = dVar2.mo20195a();
            }
            C17222d a = this.mTexturePool.mo20199a(this.f46262i, this.f46263j);
            C17222d a2 = this.mTexturePool.mo20199a(this.f46262i, this.f46263j);
            this.f46256c.onDraw(i2, a, this.f46254a, this.f46255b);
            this.f46258e.mo20134a("inputImageTexture2", a.mo20195a());
            this.f46258e.onDraw(i2, a2, this.f46254a, this.f46255b);
            if (dVar2 != null) {
                dVar2.release();
            }
            C17222d a3 = this.mTexturePool.mo20199a(this.f46262i, this.f46263j);
            this.f46259f.mo20134a("inputImageTexture2", a.mo20195a());
            this.f46259f.onDraw(a2.mo20195a(), a3, this.f46254a, this.f46255b);
            a.release();
            C17222d a4 = this.mTexturePool.mo20199a(this.f46262i, this.f46263j);
            this.f46256c.onDraw(a2.mo20195a(), a4, this.f46254a, this.f46255b);
            a2.release();
            C17222d a5 = this.mTexturePool.mo20199a(this.f46262i, this.f46263j);
            this.f46256c.onDraw(a3.mo20195a(), a5, this.f46254a, this.f46255b);
            a3.release();
            if (this.f46261h != 1.0f) {
                C17223e eVar = this.mTexturePool;
                C104507p pVar2 = this.mOutputSize;
                C17222d a6 = eVar.mo20199a(pVar2.f309736a, pVar2.f309737b);
                C17223e eVar2 = this.mTexturePool;
                C104507p pVar3 = this.mOutputSize;
                C17222d a7 = eVar2.mo20199a(pVar3.f309736a, pVar3.f309737b);
                C104507p pVar4 = this.mOutputSize;
                GLES20.glViewport(0, 0, pVar4.f309736a, pVar4.f309737b);
                this.f46257d.onDraw(a4.mo20195a(), a6, this.f46254a, this.f46255b);
                this.f46257d.onDraw(a5.mo20195a(), a7, this.f46254a, this.f46255b);
                this.f46260g.mo20134a("inputImageTexture2", a7.mo20195a());
                this.f46260g.mo20134a("inputImageTexture3", i);
                this.f46260g.onDraw(a6.mo20195a(), dVar, this.f46254a, this.f46255b);
                a6.release();
                a7.release();
            } else {
                this.f46260g.mo20134a("inputImageTexture2", a5.mo20195a());
                this.f46260g.mo20134a("inputImageTexture3", i);
                this.f46260g.onDraw(a4.mo20195a(), dVar, this.f46254a, this.f46255b);
            }
            a5.release();
            a4.release();
        }
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46256c.initialize(eVar);
        this.f46258e.initialize(eVar);
        this.f46259f.initialize(eVar);
        this.f46260g.initialize(eVar);
        this.f46257d.initialize(eVar);
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        if (!this.f46264k) {
            if (i < i2) {
                if (i < 540) {
                    this.f46261h = 1.0f;
                } else {
                    this.f46261h = 4.0f;
                }
            } else if (i2 < 540) {
                this.f46261h = 1.0f;
            } else {
                this.f46261h = 4.0f;
            }
        }
        if (Float.compare(this.f46261h, 1.0f) == 0) {
            this.f46262i = i;
            this.f46263j = i2;
        } else {
            float f = this.f46261h;
            this.f46262i = (int) (((float) i) / f);
            this.f46263j = (int) (((float) i2) / f);
        }
        this.f46257d.onOutputSizeChanged(this.f46262i, this.f46263j);
        this.f46258e.onOutputSizeChanged(this.f46262i, this.f46263j);
        this.f46259f.onOutputSizeChanged(this.f46262i, this.f46263j);
        this.f46260g.onOutputSizeChanged(i, i2);
        this.f46256c.onOutputSizeChanged(this.f46262i, this.f46263j);
    }

    public final void onUninit() {
        super.onUninit();
        this.f46256c.uninitialize();
        this.f46258e.uninitialize();
        this.f46259f.uninitialize();
        this.f46260g.uninitialize();
        this.f46257d.uninitialize();
    }
}
