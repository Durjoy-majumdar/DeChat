package com.tencent.liteav.beauty.p305b.p307b;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.beauty.b.b.c */
public final class C17138c extends C17189b {

    /* renamed from: a */
    private int f46229a;

    /* renamed from: b */
    private float f46230b;

    /* renamed from: c */
    private int f46231c;

    /* renamed from: d */
    private int f46232d;

    public C17138c() {
        this((byte) 0);
    }

    /* renamed from: a */
    public final void mo19420a(float f) {
        this.f46230b = 0.7f + f;
        LiteavLog.m16901i("GPUSharpen", "set Sharpness ".concat(String.valueOf(f)));
        setFloatOnDraw(this.f46229a, this.f46230b);
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46229a = GLES20.glGetUniformLocation(getProgramId(), "sharpness");
        this.f46231c = GLES20.glGetUniformLocation(getProgramId(), "imageWidthFactor");
        this.f46232d = GLES20.glGetUniformLocation(getProgramId(), "imageHeightFactor");
        mo19420a(this.f46230b);
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        setFloatOnDraw(this.f46231c, 1.0f / ((float) i));
        setFloatOnDraw(this.f46232d, 1.0f / ((float) i2));
    }

    private C17138c(byte b) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\n\nvoid main()\n{\n    gl_Position = position;\n    \n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n    \n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n}\n", "precision mediump float;\n\nuniform float sharpness;\nvarying mediump vec2 textureCoordinate;\nvarying mediump vec2 leftTextureCoordinate;\nvarying mediump vec2 rightTextureCoordinate; \nvarying mediump vec2 topTextureCoordinate;\nvarying mediump vec2 bottomTextureCoordinate;\n\nuniform sampler2D inputImageTexture;\nfloat centerMultiplier;\nfloat edgeMultiplier;\n\nvoid main()\n{\n    mediump vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    centerMultiplier = 1.0 + 4.0 * sharpness * (1.0 - textureColor.a);\n    edgeMultiplier = sharpness * (1.0 - textureColor.a);\n    gl_FragColor = vec4((textureColor.rgb * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), textureColor.a);    \n}\n");
        this.f46230b = 0.0f;
    }
}
