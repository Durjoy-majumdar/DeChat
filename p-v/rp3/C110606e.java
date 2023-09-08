package rp3;

import android.opengl.GLES20;

/* renamed from: rp3.e */
public class C110606e extends C110611i {

    /* renamed from: o */
    public int f330893o;

    /* renamed from: p */
    public float f330894p;

    /* renamed from: q */
    public int f330895q;

    /* renamed from: r */
    public int f330896r;

    /* renamed from: s */
    public int f330897s;

    /* renamed from: t */
    public int f330898t;

    /* renamed from: u */
    public int f330899u;

    public C110606e() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", "varying mediump vec2 textureCoordinate;\nvarying mediump vec2 textureCoordinate2;\n \n \nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform mediump int mvControl;\nuniform mediump int mvSwitch;\nuniform mediump float noiseLevel;\nuniform mediump float texelWidth;\nuniform mediump float texelHeight;\nconst mediump float thresholdChroma = 0.012;\nconst mediump float belta = -0.06 ;\n \nconst mediump mat3 RGBtoYUV = mat3(0.299,  0.587, 0.114, 0.5, -0.4187, -0.0813, -0.169, -0.3313,  0.5 );\nmediump vec3 rgb2yuv(mediump vec3 c)\n{\nmediump vec3 yuv = c*RGBtoYUV;\nreturn yuv;\n}\nmediump vec4 Sobel()\n{\n    mediump vec2 samplerSteps = vec2(1.0/texelWidth, 1.0/texelHeight);\n    mediump vec2 coords[8];\n    coords[0] = textureCoordinate - samplerSteps * 2.0;\n    coords[1] = textureCoordinate + vec2(0.0, -samplerSteps.y) * 2.0;\n    coords[2] = textureCoordinate + vec2(samplerSteps.x, -samplerSteps.y) * 2.0;\n\n    coords[3] = textureCoordinate - vec2(samplerSteps.x, 0.0) * 2.0;\n    coords[4] = textureCoordinate + vec2(samplerSteps.x, 0.0) * 2.0;\n\n    coords[5] = textureCoordinate + vec2(-samplerSteps.x, samplerSteps.y) * 2.0;\n    coords[6] = textureCoordinate + vec2(0.0, samplerSteps.y) * 2.0;\n    coords[7] = textureCoordinate + vec2(samplerSteps.x, samplerSteps.y) * 2.0;\n\n    mediump vec3 colors[8];\n    for(int i = 0; i < 8; ++i)\n    {\n        colors[i] = texture2D(inputImageTexture, coords[i]).rgb;\n    }\n\n    mediump vec4 src = texture2D(inputImageTexture, textureCoordinate);\n    mediump vec3 h = -colors[0] - 2.0 * colors[1] - colors[2] + colors[5] + 2.0 * colors[6] + colors[7];\n    mediump vec3 v = -colors[0] + colors[2] - 2.0 * colors[3] + 2.0 * colors[4] - colors[5] + colors[7];\n    return vec4(sqrt(h * h + v * v) * 1.2 , src.a);\n}\n \nvoid main()\n{\nmediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\nmediump vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\nmediump vec3 yuvCurFrame;\nmediump vec3 yuvPreFrame;\nmediump float thresholdLuma;\nif(mvControl == 1 || mvSwitch == 0) {\ngl_FragColor = textureColor;\n} else {\nyuvCurFrame = rgb2yuv(textureColor.rgb);\nyuvPreFrame = rgb2yuv(textureColor2.rgb);\n \nmediump float motionMask = 1.0;\nmediump float lumaDiff = abs(yuvCurFrame.r - yuvPreFrame.r);\nmediump float cbDiff = abs(yuvCurFrame.g - yuvPreFrame.g);\nmediump float crDiff = abs(yuvCurFrame.b - yuvPreFrame.b);\nmediump vec4 sobleImage  = Sobel();\n \nif(yuvCurFrame.r > 0.40 ) {\nthresholdLuma = noiseLevel * 1.0; \n} else {\nthresholdLuma = noiseLevel * 1.2; \n}\n \nif( lumaDiff >= thresholdLuma || sobleImage.r > 0.9 || sobleImage.g > 0.9 || sobleImage.b > 0.9) {\nmotionMask = 1.0;\n} else {\nmotionMask = 1.0 - exp(lumaDiff / belta);\n}\n \nif(cbDiff > thresholdChroma || cbDiff > thresholdChroma ) {\nmotionMask = 1.0;\n}\ngl_FragColor = vec4(motionMask) ;\n}\n}");
    }

    /* renamed from: g */
    public void mo162166g() {
        super.mo162166g();
        this.f330895q = GLES20.glGetUniformLocation(this.f330877d, "mvControl");
        this.f330896r = GLES20.glGetUniformLocation(this.f330877d, "mvSwitch");
        this.f330897s = GLES20.glGetUniformLocation(this.f330877d, "noiseLevel");
        this.f330898t = GLES20.glGetUniformLocation(this.f330877d, "texelWidth");
        this.f330899u = GLES20.glGetUniformLocation(this.f330877d, "texelHeight");
        this.f330893o = 1;
        this.f330894p = 0.05f;
        mo162168i(new C110602a(this, this.f330895q, 0));
        int i = this.f330893o;
        this.f330893o = i;
        mo162168i(new C110602a(this, this.f330896r, i));
        float f = this.f330894p;
        this.f330894p = f;
        mo162168i(new C110603b(this, this.f330897s, f));
    }
}
