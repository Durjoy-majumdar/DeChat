package com.tencent.liteav.videobase.p311d;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.videobase.d.a */
public final class C17207a extends C17215i {

    /* renamed from: a */
    private static final float[] f46548a = {-0.0627451f, -0.5019608f, -0.5019608f};

    /* renamed from: b */
    private static final float[] f46549b = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};

    /* renamed from: c */
    private int f46550c;

    /* renamed from: d */
    private int f46551d;

    public C17207a() {
        super(C17189b.NO_FILTER_VERTEX_SHADER, "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D uvTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(inputImageTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uvTexture, vec2(textureCoordinate.x, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform\n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor;\n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}");
    }

    /* renamed from: a */
    public static /* synthetic */ void m17050a(C17207a aVar) {
        GLES20.glUniform3fv(aVar.f46551d, 1, f46548a, 0);
        GLES20.glUniformMatrix3fv(aVar.f46550c, 1, false, f46549b, 0);
    }

    /* renamed from: a */
    public final int mo20147a() {
        return 6409;
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46550c = GLES20.glGetUniformLocation(getProgramId(), "convertMatrix");
        this.f46551d = GLES20.glGetUniformLocation(getProgramId(), "offset");
        runOnDraw(C17208b.m17052a(this));
    }
}
