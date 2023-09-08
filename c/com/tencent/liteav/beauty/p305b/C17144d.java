package com.tencent.liteav.beauty.p305b;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p310c.C17203c;

/* renamed from: com.tencent.liteav.beauty.b.d */
public final class C17144d extends C17203c {

    /* renamed from: a */
    public int f46249a = -1;

    /* renamed from: b */
    private int f46250b = -1;

    /* renamed from: c */
    private int f46251c = -1;

    /* renamed from: d */
    private int f46252d = -1;

    /* renamed from: e */
    private float[] f46253e = {0.0f, 1.0f, 0.0f};

    public C17144d() {
        super("precision mediump float;\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 textureCoordinate2;\nvarying highp vec2 textureCoordinate3;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform mediump vec3 screenReplaceColor; //YUV数据\nuniform float screenMirrorX;\nuniform float screenMirrorY;\n\nvoid main()\n{\n    highp vec4 _smooth = texture2D(inputImageTexture,textureCoordinate);\n    highp vec4 origin = texture2D(inputImageTexture2,textureCoordinate2);\n    \n    lowp float r = origin.r;\n    lowp float g = origin.g;\n    lowp float b = origin.b;\n    float Cr = 128.0 - 37.797 * r - 74.203 * g + 112.0 * b;\n    float Cb = 128.0 + 112.0 * r - 93.768 * g - 18.214 * b;\n    \n    highp vec2 screenPos = textureCoordinate3;\n    if(screenMirrorX != 0.0)screenPos.x = 1.0 - screenPos.x;\n    if(screenMirrorY != 0.0)screenPos.y = 1.0 - screenPos.y;\n    highp vec4 screen = texture2D(inputImageTexture3, screenPos);\n    float Y = 0.2989 * r + 0.5866 * g + 0.1145 * b;\n    Cr = 0.7132 * (r - Y);\n    Cb = 0.5647 * (b - Y);\n    float blendValue = 1.0 - smoothstep(0.4, 0.4 + 0.1, distance(vec2(Cr, Cb), vec2(screenReplaceColor.g, screenReplaceColor.b)));\n    vec3 diff = screen.rgb - _smooth.rgb;\n    _smooth.rgb = _smooth.rgb + blendValue * diff;\n    gl_FragColor = _smooth;\n}\n");
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46250b = GLES20.glGetUniformLocation(getProgramId(), "screenMode");
        this.f46251c = GLES20.glGetUniformLocation(getProgramId(), "screenReplaceColor");
        this.f46249a = GLES20.glGetUniformLocation(getProgramId(), "screenMirrorX");
        this.f46252d = GLES20.glGetUniformLocation(getProgramId(), "screenMirrorY");
        float[] fArr = this.f46253e;
        float f = fArr[2];
        float f2 = (float) ((((double) fArr[0]) * 0.2989d) + (((double) fArr[1]) * 0.5866d) + (((double) f) * 0.1145d));
        setFloatVec3OnDraw(this.f46251c, new float[]{f2, (float) (((double) (fArr[0] - f2)) * 0.7132d), (float) (((double) (f - f2)) * 0.5647d)});
    }
}
