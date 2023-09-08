package com.tencent.liteav.beauty.p305b.p306a;

import com.tencent.liteav.videobase.p310c.C17204d;

/* renamed from: com.tencent.liteav.beauty.b.a.b */
public final class C17132b extends C17204d {
    public C17132b() {
        super(" attribute vec4 position;\n attribute vec4 inputTextureCoordinate;\n \n varying vec2 textureCoordinate;\n \n void main(void)\n {\n     gl_Position = position;\n     textureCoordinate = inputTextureCoordinate.xy;\n }\n", " varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     lowp vec3 iColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp vec3 meanColor = texture2D(inputImageTexture2, textureCoordinate).rgb;\n     highp vec3 diffColor = (iColor - meanColor) * 7.07;\n     diffColor = min(diffColor * diffColor, 1.0);\n     gl_FragColor = vec4(diffColor, 1.0);\n }\n");
    }

    public final void onOutputSizeChanged(int i, int i2) {
        float min = Math.min(1.0f, 360.0f / ((float) Math.min(i, i2)));
        super.onOutputSizeChanged(Math.round(((float) i) * min), Math.round(((float) i2) * min));
    }
}
