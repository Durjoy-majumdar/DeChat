package com.tencent.liteav.beauty.p305b;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.beauty.b.c */
public final class C17141c extends C17189b {

    /* renamed from: a */
    private int f46238a;

    /* renamed from: b */
    private int f46239b;

    public C17141c() {
        super(C17189b.NO_FILTER_VERTEX_SHADER, "precision highp float;\n\nuniform sampler2D inputImageTexture;\nvarying highp vec2 textureCoordinate;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nvec2 pos[9];\n\nvoid main()\n{\n    pos[0] = textureCoordinate + vec2(-texelWidthOffset, -texelHeightOffset);\n     pos[1] = textureCoordinate + vec2(-texelWidthOffset, 0.0);\n     pos[2] = textureCoordinate + vec2(-texelWidthOffset, texelHeightOffset);\n     pos[3] = textureCoordinate + vec2(0.0, -texelHeightOffset);\n     pos[4] = textureCoordinate + vec2(0.0, 0.0);\n     pos[5] = textureCoordinate + vec2(0.0, texelHeightOffset);\n     pos[6] = textureCoordinate + vec2(texelWidthOffset, -texelHeightOffset);\n     pos[7] = textureCoordinate + vec2(texelWidthOffset, 0.0);\n     pos[8] = textureCoordinate + vec2(texelWidthOffset, texelHeightOffset);\n     vec4 fragmentColor = texture2D(inputImageTexture, pos[0]);\n     fragmentColor += texture2D(inputImageTexture, pos[1]);\n     fragmentColor += texture2D(inputImageTexture, pos[2]);\n     fragmentColor += texture2D(inputImageTexture, pos[3]);\n     fragmentColor += texture2D(inputImageTexture, pos[4]);\n     fragmentColor += texture2D(inputImageTexture, pos[5]);\n     fragmentColor += texture2D(inputImageTexture, pos[6]);\n     fragmentColor += texture2D(inputImageTexture, pos[7]);\n     fragmentColor += texture2D(inputImageTexture, pos[8]);\n\n    gl_FragColor = fragmentColor / 9.0;\n}\n");
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46238a = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.f46239b = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        setFloatOnDraw(this.f46238a, 2.0f / ((float) this.mOutputSize.f309736a));
        setFloatOnDraw(this.f46239b, 2.0f / ((float) this.mOutputSize.f309737b));
    }
}
