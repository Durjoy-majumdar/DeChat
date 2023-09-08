package com.tencent.liteav.beauty.p305b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.beauty.b.i */
public final class C17155i extends C17189b {

    /* renamed from: a */
    public Bitmap f46285a = null;

    /* renamed from: b */
    public int f46286b = -1;

    /* renamed from: c */
    public Bitmap f46287c = null;

    /* renamed from: d */
    public int f46288d = -1;

    /* renamed from: e */
    public final FloatBuffer f46289e = FloatBuffer.allocate(3);

    /* renamed from: f */
    public final FloatBuffer f46290f = FloatBuffer.allocate(2);

    /* renamed from: g */
    private int f46291g;

    /* renamed from: h */
    private int f46292h;

    /* renamed from: i */
    private int f46293i;

    /* renamed from: j */
    private int f46294j;

    public C17155i() {
        super(C17189b.NO_FILTER_VERTEX_SHADER, "varying highp vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2; // lookup texture 1\nuniform sampler2D inputImageTexture3; // lookup texture 2\n\n\nuniform lowp vec3 v3_params;\nuniform lowp vec2 v2_texs;\n\n\nvoid main()\n{\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n\n    mediump float blueColor = textureColor.b * 63.0;\n\n    mediump vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n\n    mediump vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n    texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    lowp vec4 newColor1;\n    lowp vec4 newColor2;\n    if(textureCoordinate.x <= v3_params.x) { \n      if(v2_texs.x == 1.0) { \n        newColor1 = texture2D(inputImageTexture2, texPos1);\n        newColor2 = texture2D(inputImageTexture2, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.y);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    } else {\n      if(v2_texs.y == 1.0) { \n        newColor1 = texture2D(inputImageTexture3, texPos1);\n        newColor2 = texture2D(inputImageTexture3, texPos2);\n        lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n        gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.z);\n      } else { \n        gl_FragColor = textureColor;\n      } \n    }\n }");
    }

    /* renamed from: a */
    public final void mo19426a(float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        runOnDraw(C17156j.m16989a(this, f, f2, f3, bitmap, bitmap2));
    }

    public final void afterDrawArrays() {
        super.afterDrawArrays();
        if (this.f46286b != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
        }
        if (this.f46288d != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public final void beforeDrawArrays(int i) {
        super.beforeDrawArrays(i);
        if (this.f46286b != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.f46286b);
            GLES20.glUniform1i(this.f46291g, 3);
        }
        if (this.f46288d != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, this.f46288d);
            GLES20.glUniform1i(this.f46292h, 4);
        }
        GLES20.glUniform2fv(this.f46294j, 1, this.f46290f);
        GLES20.glUniform3fv(this.f46293i, 1, this.f46289e);
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46291g = GLES20.glGetUniformLocation(getProgramId(), "inputImageTexture2");
        this.f46292h = GLES20.glGetUniformLocation(getProgramId(), "inputImageTexture3");
        this.f46293i = GLES20.glGetUniformLocation(getProgramId(), "v3_params");
        this.f46294j = GLES20.glGetUniformLocation(getProgramId(), "v2_texs");
        if (this.f46285a != null || this.f46287c != null) {
            mo19426a(this.f46289e.get(0), this.f46285a, this.f46289e.get(1), this.f46287c, this.f46289e.get(2));
            this.f46285a = null;
            this.f46287c = null;
        }
    }

    public final void onUninit() {
        super.onUninit();
        OpenGlUtils.deleteTexture(this.f46286b);
        OpenGlUtils.deleteTexture(this.f46288d);
        this.f46286b = -1;
        this.f46288d = -1;
    }
}
