package com.tencent.liteav.beauty.p305b.p306a;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.beauty.b.a.d */
final class C17134d extends C17189b {

    /* renamed from: a */
    private final boolean f46215a;

    /* renamed from: b */
    private int f46216b = -1;

    /* renamed from: c */
    private int f46217c = -1;

    public C17134d(boolean z) {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n uniform float texelWidthOffset;\n uniform float texelHeightOffset;\n \n varying vec2 textureCoordinate;\n varying vec4 textureShift_1;\n varying vec4 textureShift_2;\n varying vec4 textureShift_3;\n varying vec4 textureShift_4;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n     \n     vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n     textureShift_1 = vec4(textureCoordinate - singleStepOffset,                           textureCoordinate + singleStepOffset);\n     textureShift_2 = vec4(textureCoordinate - 2.0 * singleStepOffset,                           textureCoordinate + 2.0 * singleStepOffset);\n     textureShift_3 = vec4(textureCoordinate - 3.0 * singleStepOffset,                           textureCoordinate + 3.0 * singleStepOffset);\n     textureShift_4 = vec4(textureCoordinate - 4.0 * singleStepOffset,                           textureCoordinate + 4.0 * singleStepOffset);\n }\n", "uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n varying highp vec4 textureShift_1;\n varying highp vec4 textureShift_2;\n varying highp vec4 textureShift_3;\n varying highp vec4 textureShift_4;\n \n void main()\n {\n     mediump vec3 sum = texture2D(inputImageTexture, textureCoordinate).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_1.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_2.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_3.zw).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.xy).rgb;\n     sum += texture2D(inputImageTexture, textureShift_4.zw).rgb;\n     \n     gl_FragColor = vec4(sum * 0.1111, 1.0);\n }\n");
        this.f46215a = z;
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46216b = GLES20.glGetUniformLocation(getProgramId(), "texelWidthOffset");
        this.f46217c = GLES20.glGetUniformLocation(getProgramId(), "texelHeightOffset");
    }

    public final void onOutputSizeChanged(int i, int i2) {
        float min = Math.min(1.0f, 360.0f / ((float) Math.min(i, i2)));
        int round = Math.round(((float) i) * min);
        int round2 = Math.round(((float) i2) * min);
        super.onOutputSizeChanged(round, round2);
        if (this.f46215a) {
            setFloatOnDraw(this.f46216b, 0.0f);
            setFloatOnDraw(this.f46217c, 1.5f / ((float) round2));
            return;
        }
        setFloatOnDraw(this.f46216b, 1.5f / ((float) round));
        setFloatOnDraw(this.f46217c, 0.0f);
    }
}
