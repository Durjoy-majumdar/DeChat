package com.tencent.liteav.beauty.p305b;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.beauty.b.m */
public final class C17160m extends C17189b {

    /* renamed from: a */
    private int f46327a;

    /* renamed from: b */
    private float f46328b;

    /* renamed from: c */
    private int f46329c;

    /* renamed from: d */
    private int f46330d;

    public C17160m() {
        this((byte) 0);
    }

    /* renamed from: a */
    public final void mo19431a(float f) {
        this.f46328b = f;
        setFloatOnDraw(this.f46327a, f);
        LiteavLog.m16896d("GPUSharpen", "set Sharpness ".concat(String.valueOf(f)));
    }

    public final boolean canBeSkipped() {
        return ((double) Math.abs(this.f46328b)) < 1.0E-5d;
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46327a = GLES20.glGetUniformLocation(getProgramId(), "sharpness");
        this.f46329c = GLES20.glGetUniformLocation(getProgramId(), "imageWidthFactor");
        this.f46330d = GLES20.glGetUniformLocation(getProgramId(), "imageHeightFactor");
        mo19431a(this.f46328b);
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        setFloatOnDraw(this.f46329c, 1.0f / ((float) i));
        setFloatOnDraw(this.f46330d, 1.0f / ((float) i2));
    }

    private C17160m(byte b) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nuniform float imageWidthFactor; \nuniform float imageHeightFactor; \nuniform float sharpness;\n\nvarying vec2 textureCoordinate;\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate; \nvarying vec2 topTextureCoordinate;\nvarying vec2 bottomTextureCoordinate;\n\nvarying float centerMultiplier;\nvarying float edgeMultiplier;\n\nvoid main()\n{\n    gl_Position = position;\n\n    mediump vec2 widthStep = vec2(imageWidthFactor, 0.0);\n    mediump vec2 heightStep = vec2(0.0, imageHeightFactor);\n\n    textureCoordinate = inputTextureCoordinate.xy;\n    leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n    rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n    topTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n    bottomTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n\n    centerMultiplier = 1.0 + 4.0 * sharpness;\n    edgeMultiplier = sharpness;\n}", "precision highp float;\n\nvarying highp vec2 textureCoordinate;\nvarying highp vec2 leftTextureCoordinate;\nvarying highp vec2 rightTextureCoordinate; \nvarying highp vec2 topTextureCoordinate;\nvarying highp vec2 bottomTextureCoordinate;\n\nvarying highp float centerMultiplier;\nvarying highp float edgeMultiplier;\n\nuniform sampler2D inputImageTexture;\n\nvoid main()\n{\n    mediump vec3 textureColor = texture2D(inputImageTexture, textureCoordinate).rgb;\n    mediump vec3 leftTextureColor = texture2D(inputImageTexture, leftTextureCoordinate).rgb;\n    mediump vec3 rightTextureColor = texture2D(inputImageTexture, rightTextureCoordinate).rgb;\n    mediump vec3 topTextureColor = texture2D(inputImageTexture, topTextureCoordinate).rgb;\n    mediump vec3 bottomTextureColor = texture2D(inputImageTexture, bottomTextureCoordinate).rgb;\n\n    gl_FragColor = vec4((textureColor * centerMultiplier - (leftTextureColor * edgeMultiplier + rightTextureColor * edgeMultiplier + topTextureColor * edgeMultiplier + bottomTextureColor * edgeMultiplier)), 1.0);\n}");
        this.f46328b = 0.0f;
    }
}
