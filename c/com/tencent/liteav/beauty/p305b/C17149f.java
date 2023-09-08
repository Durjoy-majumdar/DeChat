package com.tencent.liteav.beauty.p305b;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.p309a.C17195h;

/* renamed from: com.tencent.liteav.beauty.b.f */
public final class C17149f extends C17195h {

    /* renamed from: a */
    public final C17150a f46267a;

    /* renamed from: b */
    public final C17150a f46268b;

    public C17149f() {
        this(1.0f);
    }

    public C17149f(float f) {
        C17150a aVar = new C17150a();
        this.f46267a = aVar;
        C17150a aVar2 = new C17150a();
        this.f46268b = aVar2;
        aVar.mo19424a(f, 0.0f);
        aVar2.mo19424a(0.0f, f);
        addFilter(aVar);
        addFilter(aVar2);
    }

    /* renamed from: com.tencent.liteav.beauty.b.f$a */
    public static class C17150a extends C17189b {

        /* renamed from: a */
        public int f46269a;

        /* renamed from: b */
        public int f46270b;

        /* renamed from: c */
        public float f46271c;

        /* renamed from: d */
        public float f46272d;

        public C17150a() {
            super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nconst int GAUSSIAN_SAMPLES = 9;\n\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n\nvarying vec2 textureCoordinate;\nvarying vec2 blurCoordinates[GAUSSIAN_SAMPLES];\n\nvoid main()\n{\n gl_Position = position;\n textureCoordinate = inputTextureCoordinate.xy;\n \n // Calculate the positions for the blur\n int multiplier = 0;\n vec2 blurStep;\n   vec2 singleStepOffset = vec2(texelHeightOffset, texelWidthOffset);\n    \n for (int i = 0; i < GAUSSIAN_SAMPLES; i++)\n   {\n  multiplier = (i - ((GAUSSIAN_SAMPLES - 1) / 2));\n       // Blur in x (horizontal)\n       blurStep = float(multiplier) * singleStepOffset;\n  blurCoordinates[i] = inputTextureCoordinate.xy + blurStep;\n }\n}\n", "uniform sampler2D inputImageTexture;\n\nconst lowp int GAUSSIAN_SAMPLES = 9;\n\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 blurCoordinates[GAUSSIAN_SAMPLES];\n\nvoid main()\n{\n lowp vec3 sum = vec3(0.0);\n   lowp vec4 fragColor=texture2D(inputImageTexture,textureCoordinate);\n \n    sum += texture2D(inputImageTexture, blurCoordinates[0]).rgb * 0.05;\n    sum += texture2D(inputImageTexture, blurCoordinates[1]).rgb * 0.09;\n    sum += texture2D(inputImageTexture, blurCoordinates[2]).rgb * 0.12;\n    sum += texture2D(inputImageTexture, blurCoordinates[3]).rgb * 0.15;\n    sum += texture2D(inputImageTexture, blurCoordinates[4]).rgb * 0.18;\n    sum += texture2D(inputImageTexture, blurCoordinates[5]).rgb * 0.15;\n    sum += texture2D(inputImageTexture, blurCoordinates[6]).rgb * 0.12;\n    sum += texture2D(inputImageTexture, blurCoordinates[7]).rgb * 0.09;\n    sum += texture2D(inputImageTexture, blurCoordinates[8]).rgb * 0.05;\n\n gl_FragColor = vec4(sum,fragColor.a);\n}");
        }

        /* renamed from: a */
        public final void mo19424a(float f, float f2) {
            this.f46271c = f;
            this.f46272d = f2;
            m16985a();
        }

        public final void onInit(C17223e eVar) {
            super.onInit(eVar);
            this.f46269a = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
            this.f46270b = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
        }

        public final void onOutputSizeChanged(int i, int i2) {
            super.onOutputSizeChanged(i, i2);
            m16985a();
        }

        /* renamed from: a */
        private void m16985a() {
            runOnDraw(C17151g.m16987a(this));
        }
    }
}
